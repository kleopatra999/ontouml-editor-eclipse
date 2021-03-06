/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.validation;

import OntoUML.Relationship;
import OntoUML.Association;

import OntoUML.URML.ObjectVariable;

/**
 * A sample validator interface for {@link OntoUML.URML.BinaryAssociationAtom}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BinaryAssociationAtomValidator {
	boolean validate();

	boolean validateAssociation(Relationship value);

	boolean validateSrcVariable(ObjectVariable value);
	boolean validateTgtVariable(ObjectVariable value);
	boolean validateAssociation(Association value);

	boolean validateSourceVariable(String value);

	boolean validateTargetVariable(String value);
}
