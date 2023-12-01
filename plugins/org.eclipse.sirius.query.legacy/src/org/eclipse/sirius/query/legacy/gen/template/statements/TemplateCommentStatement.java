/*******************************************************************************
 * Copyright (c) 2005-2014 Obeo
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/

package org.eclipse.sirius.query.legacy.gen.template.statements;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.sirius.query.legacy.ecore.factories.FactoryException;
import org.eclipse.sirius.query.legacy.gen.template.TemplateConstants;
import org.eclipse.sirius.query.legacy.gen.template.TemplateNodeElement;
import org.eclipse.sirius.query.legacy.gen.template.TemplateSyntaxException;
import org.eclipse.sirius.query.legacy.gen.template.eval.ENode;
import org.eclipse.sirius.query.legacy.gen.template.eval.ENodeException;
import org.eclipse.sirius.query.legacy.gen.template.eval.LaunchManager;
import org.eclipse.sirius.query.legacy.gen.template.scripts.IScript;
import org.eclipse.sirius.query.legacy.tools.strings.Int2;

/**
 * This is a comment statement for the generation tool. The generator didn't use
 * this statement.
 * 
 * 
 */
public class TemplateCommentStatement extends TemplateNodeElement {

    /**
     * The text of the comment.
     */
    protected String comment;

    /**
     * Constructor.
     * 
     * @param comment
     *            is the text of the comment
     * @param script
     *            is the script
     */
    public TemplateCommentStatement(String comment, IScript script) {
        super(script);
        this.comment = comment;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /* (non-Javadoc) */
    @Override
    public ENode evaluate(EObject object, LaunchManager mode) throws ENodeException, FactoryException {
        ENode result = new ENode(ENode.EMPTY, object, this, mode.isSynchronize());
        return result;
    }

    /* (non-Javadoc) */
    @Override
    public String toString() {
        return TemplateConstants.COMMENT_BEGIN + comment + TemplateConstants.COMMENT_END;
    }

    /* (non-Javadoc) */
    @Override
    public String getOutlineText() {
        return toString();
    }

    /**
     * It checks the syntax and creates a statement for the given part of the
     * text. The part of the text to be parsed is delimited by the given limits.
     * 
     * @param buffer
     *            is the textual representation of the templates
     * @param limits
     *            delimits the part of the text to be parsed for this statement
     * @param script
     *            is the generator's configuration
     * @return the new statement
     * @throws TemplateSyntaxException
     */
    public static TemplateNodeElement fromString(String buffer, Int2 limits, IScript script) throws TemplateSyntaxException {
        TemplateCommentStatement element = new TemplateCommentStatement(buffer.substring(limits.b(), limits.e()), script);
        element.setPos(limits);
        return element;
    }

}
