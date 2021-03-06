/*
 * *****************************************************************************
 *
 *  Pentaho Data Integration
 *
 *  Copyright (C) 2017-2020 by Hitachi Vantara : http://www.pentaho.com
 *
 *  *******************************************************************************
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  this file except in compliance with the License. You may obtain a copy of the
 *  License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * *****************************************************************************
 *
 */

package org.pentaho.di.ui.core.widget.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bmorrise on 9/15/17.
 */
public abstract class FormatRule {

  protected String pattern;
  protected Pattern compiledPattern;

  abstract Format execute( String value );

  public FormatRule( String pattern ) {
    this.pattern = pattern;
    this.compiledPattern = Pattern.compile( pattern );
  }

  protected Matcher parse( String value ) {
    return compiledPattern.matcher( value );
  }
}
