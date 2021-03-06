package OntoUML.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import OntoUML.DatatypeRelationship;
import OntoUML.Property;
import OntoUML.StructuralDatatype;

/**
 * @generated
 */
public class DatatypeRelationshipEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4019;

	/**
	 * @generated
	 */
	public DatatypeRelationshipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new OntoUML.diagram.edit.policies.DatatypeRelationshipItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OntoUML.diagram.edit.parts.WrappingLabel17EditPart) {
			((OntoUML.diagram.edit.parts.WrappingLabel17EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDatatypeRelationshipLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DatatypeRelationshipNameEditPart) {
			((OntoUML.diagram.edit.parts.DatatypeRelationshipNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDatatypeRelationshipNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DatatypeRelationshipSourcePropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.DatatypeRelationshipSourcePropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDatatypeRelationshipSourcePropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DatatypeRelationshipSourcePropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.DatatypeRelationshipSourcePropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DatatypeRelationshipTargetPropertyNameLabelEditPart) {
			((OntoUML.diagram.edit.parts.DatatypeRelationshipTargetPropertyNameLabelEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDatatypeRelationshipTargetPropertyNameLabelFigure());
			return true;
		}
		if (childEditPart instanceof OntoUML.diagram.edit.parts.DatatypeRelationshipTargetPropertyCardinaliEditPart) {
			((OntoUML.diagram.edit.parts.DatatypeRelationshipTargetPropertyCardinaliEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure());
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

	protected Connection createConnectionFigure() {
		return new DatatypeRelationshipFigure();
	}

	/**
	 * @generated
	 */
	public DatatypeRelationshipFigure getPrimaryShape() {
		return (DatatypeRelationshipFigure) getFigure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Created to update the meta-attribute isReadOnly = true of the Property in the target association end, when there is a «structuredDatatype» in the source association end.
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
	public class DatatypeRelationshipFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatatypeRelationshipLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatatypeRelationshipNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatatypeRelationshipSourcePropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatatypeRelationshipTargetPropertyNameLabelFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure;

		/**
		 * @generated
		 */
		public DatatypeRelationshipFigure() {

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDatatypeRelationshipLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipLabelFigure
					.setText("«datatypeRelationship»");

			this.add(fFigureDatatypeRelationshipLabelFigure);

			fFigureDatatypeRelationshipNameLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipNameLabelFigure.setText("");

			this.add(fFigureDatatypeRelationshipNameLabelFigure);

			fFigureDatatypeRelationshipSourcePropertyNameLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipSourcePropertyNameLabelFigure
					.setText("");

			this.add(fFigureDatatypeRelationshipSourcePropertyNameLabelFigure);

			fFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure);

			fFigureDatatypeRelationshipTargetPropertyNameLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipTargetPropertyNameLabelFigure
					.setText("");

			this.add(fFigureDatatypeRelationshipTargetPropertyNameLabelFigure);

			fFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to receive DatatypeRelationshipEditPart.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public DatatypeRelationshipFigure(
				DatatypeRelationshipEditPart datatyperelationshipeditpart) {

			createContents(datatyperelationshipeditpart);
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * <!-- begin-user-doc -->
		 * Changed to update the meta-attribute isReadOnly = true of the Property in the target association end, when there is a «structuredDatatype» in the source association end.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void createContents(
				DatatypeRelationshipEditPart datatyperelationshipeditpart) {

			DatatypeRelationship dr = (DatatypeRelationship) datatyperelationshipeditpart
					.resolveSemanticElement();
			for (int i = 0; i < dr.getSource().size(); ++i)
				if (((Property) dr.getSource().get(i)).getEndType() instanceof StructuralDatatype)
					for (int j = 0; j < dr.getTarget().size(); ++j)
						((Property) dr.getTarget().get(j)).setIsReadOnly(true);

			fFigureDatatypeRelationshipLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipLabelFigure
					.setText("«datatypeRelationship»");

			this.add(fFigureDatatypeRelationshipLabelFigure);

			fFigureDatatypeRelationshipNameLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipNameLabelFigure.setText("");

			this.add(fFigureDatatypeRelationshipNameLabelFigure);

			fFigureDatatypeRelationshipSourcePropertyNameLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipSourcePropertyNameLabelFigure
					.setText("");

			this.add(fFigureDatatypeRelationshipSourcePropertyNameLabelFigure);

			fFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure);

			fFigureDatatypeRelationshipTargetPropertyNameLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipTargetPropertyNameLabelFigure
					.setText("");

			this.add(fFigureDatatypeRelationshipTargetPropertyNameLabelFigure);

			fFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure = new WrappingLabel();
			fFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure
					.setText("");

			this
					.add(fFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure);

		}

		/**
		 * <!-- begin-user-doc -->
		 * Created to update the meta-attribute isReadOnly = true of the Property in the target association end, when there is a «structuredDatatype» in the source association end.
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		private void updateContents(
				DatatypeRelationshipEditPart datatyperelationshipeditpart) {

			DatatypeRelationship dr = (DatatypeRelationship) datatyperelationshipeditpart
					.resolveSemanticElement();
			for (int i = 0; i < dr.getSource().size(); ++i)
				if (((Property) dr.getSource().get(i)).getEndType() instanceof StructuralDatatype)
					for (int j = 0; j < dr.getTarget().size(); ++j)
						((Property) dr.getTarget().get(j)).setIsReadOnly(true);
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatatypeRelationshipLabelFigure() {
			return fFigureDatatypeRelationshipLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatatypeRelationshipNameLabelFigure() {
			return fFigureDatatypeRelationshipNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatatypeRelationshipSourcePropertyNameLabelFigure() {
			return fFigureDatatypeRelationshipSourcePropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure() {
			return fFigureDatatypeRelationshipSourcePropertyCardinalitiesLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatatypeRelationshipTargetPropertyNameLabelFigure() {
			return fFigureDatatypeRelationshipTargetPropertyNameLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure() {
			return fFigureDatatypeRelationshipTargetPropertyCardinalitiesLabelFigure;
		}

	}

}
