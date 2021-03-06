package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.Derivation;
import OntoUML.Property;

/**
 * @generated
 */
public class DerivationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public DerivationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.DerivationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DerivationNameEditPart) {
			((OntoUML.diagram.edit.parts.DerivationNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDerivationNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DerivationSourcePropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.DerivationSourcePropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDerivationSourcePropertyCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DerivationTargetPropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.DerivationTargetPropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDerivationTargetPropertyCardinalitiesLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	/**
	 * @generated
	 */
	protected Connection createConnectionFigure() {
		return new DerivationFigure();
	}

	/**
	 * @generated
	 */
	public DerivationFigure getPrimaryShape() {
		return (DerivationFigure) getFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Created to update the exhibition of the meta-attributes.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void handleNotificationEvent(Notification event) {
		getPrimaryShape().updateContents(this);
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class DerivationFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivationNameLabelFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivationSourcePropertyCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDerivationTargetPropertyCardinalitiesLabelFigure;

		/**
		 * @generated
		 */
		public DerivationFigure() {
			this.setLineStyle(Graphics.LINE_DASH);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDerivationNameLabelFigure = new WrappingLabel();
			fFigureDerivationNameLabelFigure.setText("");

			this.add(fFigureDerivationNameLabelFigure);

			fFigureDerivationSourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureDerivationSourcePropertyCardinalitiesLabelFigure.setText("");

			this.add(fFigureDerivationSourcePropertyCardinalitiesLabelFigure);

			fFigureDerivationTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureDerivationTargetPropertyCardinalitiesLabelFigure.setText("");

			this.add(fFigureDerivationTargetPropertyCardinalitiesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the exhibition of the meta-attributes.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateContents(DerivationEditPart derivationeditpart) {

			Derivation d = (Derivation) ((View) derivationeditpart.getModel())
					.getElement();

			/*			for (int i = 0; i < d.getSource().size(); ++i) {
			 ((Property) d.getSource().get(i)).setLower(((Property) d
			 .getSource().get(i)).derivarLowerDerivation());
			 ((Property) d.getSource().get(i)).setUpper(((Property) d
			 .getSource().get(i)).derivarUpperDerivation());
			 }*/
			for (int i = 0; i < d.getSource().size(); ++i) {
				((Property) d.getSource().get(i)).setLower(d
						.deriveLowerDerivation());
				((Property) d.getSource().get(i)).setUpper(d
						.deriveUpperDerivation());
			}
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			OntoUML.diagram.edit.parts.DerivationCustomFigure df = new OntoUML.diagram.edit.parts.DerivationCustomFigure();

			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivationNameLabelFigure() {
			return fFigureDerivationNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivationSourcePropertyCardinalitiesLabelFigure() {
			return fFigureDerivationSourcePropertyCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDerivationTargetPropertyCardinalitiesLabelFigure() {
			return fFigureDerivationTargetPropertyCardinalitiesLabelFigure;
		}

	}

}
