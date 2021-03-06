/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package OntoUML.URML.provider;

import OntoUML.URML.util.URMLAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class URMLItemProviderAdapterFactory extends URMLAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URMLItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link OntoUML.URML.DerivationRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivationRuleItemProvider derivationRuleItemProvider;

	/**
	 * This creates an adapter for a {@link OntoUML.URML.DerivationRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDerivationRuleAdapter() {
		if (derivationRuleItemProvider == null) {
			derivationRuleItemProvider = new DerivationRuleItemProvider(this);
		}

		return derivationRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link OntoUML.URML.ClassifierAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierAtomItemProvider classifierAtomItemProvider;

	/**
	 * This creates an adapter for a {@link OntoUML.URML.ClassifierAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassifierAtomAdapter() {
		if (classifierAtomItemProvider == null) {
			classifierAtomItemProvider = new ClassifierAtomItemProvider(this);
		}

		return classifierAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link OntoUML.URML.RoleTypeAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeAtomItemProvider roleTypeAtomItemProvider;

	/**
	 * This creates an adapter for a {@link OntoUML.URML.RoleTypeAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleTypeAtomAdapter() {
		if (roleTypeAtomItemProvider == null) {
			roleTypeAtomItemProvider = new RoleTypeAtomItemProvider(this);
		}

		return roleTypeAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link OntoUML.URML.BinaryAssociationAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryAssociationAtomItemProvider binaryAssociationAtomItemProvider;

	/**
	 * This creates an adapter for a {@link OntoUML.URML.BinaryAssociationAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBinaryAssociationAtomAdapter() {
		if (binaryAssociationAtomItemProvider == null) {
			binaryAssociationAtomItemProvider = new BinaryAssociationAtomItemProvider(this);
		}

		return binaryAssociationAtomItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link OntoUML.URML.ObjectVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectVariableItemProvider objectVariableItemProvider;

	/**
	 * This creates an adapter for a {@link OntoUML.URML.ObjectVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectVariableAdapter() {
		if (objectVariableItemProvider == null) {
			objectVariableItemProvider = new ObjectVariableItemProvider(this);
		}

		return objectVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link OntoUML.URML.AttributionAtom} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributionAtomItemProvider attributionAtomItemProvider;

	/**
	 * This creates an adapter for a {@link OntoUML.URML.AttributionAtom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributionAtomAdapter() {
		if (attributionAtomItemProvider == null) {
			attributionAtomItemProvider = new AttributionAtomItemProvider(this);
		}

		return attributionAtomItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (derivationRuleItemProvider != null) derivationRuleItemProvider.dispose();
		if (classifierAtomItemProvider != null) classifierAtomItemProvider.dispose();
		if (roleTypeAtomItemProvider != null) roleTypeAtomItemProvider.dispose();
		if (binaryAssociationAtomItemProvider != null) binaryAssociationAtomItemProvider.dispose();
		if (objectVariableItemProvider != null) objectVariableItemProvider.dispose();
		if (attributionAtomItemProvider != null) attributionAtomItemProvider.dispose();
	}

}
