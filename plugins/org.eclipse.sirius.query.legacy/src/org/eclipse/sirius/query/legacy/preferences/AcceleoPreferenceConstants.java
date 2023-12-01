/*******************************************************************************
 * Copyright (c) 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.sirius.query.legacy.preferences;

/**
 * Constants for preferences
 */
public interface AcceleoPreferenceConstants {

  /**
   * This preference ensures that specific scripts are loaded before java extensions while evaluating Acceleo expressions with the interpreter.
   * If set to false, Interpreter will try to load java classes for IJavaExtensions then will load specific scripts if a java class hasn't been found for the qualified name.
   *
   * One of side effect of this behavior is that if a script has same name than an existing java class, it will not be loaded
   */
  String PREF_USE_SPECIFIC_SCRIPTS_FIRST = "PREF_USE_SPECIFIC_SCRIPTS_FIRST";

  boolean PREF_USE_SPECIFIC_SCRIPTS_FIRST_DEFAULT_VALUE = true;
}
