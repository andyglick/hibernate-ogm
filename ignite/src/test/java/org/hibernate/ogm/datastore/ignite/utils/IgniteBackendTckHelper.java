/*
 * Hibernate OGM, Domain model persistence for NoSQL datastores
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.ogm.datastore.ignite.utils;

import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;

/**
 * Helper class allowing you to run all or any specified subset of test available on the classpath.
 * This method is for example useful to run all or parts of the <i>backendtck</i>.
 *
 * @author Victor Kadachigov
 */
@RunWith(ClasspathSuite.class)
@ClasspathSuite.ClassnameFilters({

	// todo
	"org.hibernate.ogm.backendtck.embeddable.EmbeddableExtraTest",

	// failed

//	"org.hibernate.ogm.backendtck.associations.collection.manytomany.ManyToManyExtraTest",
//	"org.hibernate.ogm.backendtck.associations.collection.unidirectional.*",
//	"org.hibernate.ogm.backendtck.loader.LoaderFromTupleTest"
//	"org.hibernate.ogm.backendtck.queries.CompositeIdQueriesTest",
//	"org.hibernate.ogm.backendtck.queries.QueriesWithEmbeddedTest",
//	"org.hibernate.ogm.backendtck.queries.SimpleQueriesTest",

	// passed

//	"org.hibernate.ogm.backendtck.id.*",
//	"org.hibernate.ogm.backendtck.simpleentity.*",
//	"org.hibernate.ogm.backendtck.associations.collection.manytomany.ManyToManyTest",
//	"org.hibernate.ogm.backendtck.associations.manytoone.*",
//	"org.hibernate.ogm.backendtck.associations.onetoone.*",
//	"org.hibernate.ogm.backendtck.associations.compositeid.*",
//	"org.hibernate.ogm.backendtck.associations.collection.types.*"						// -MapContentsStoredInSeparateDocumentTest
//	"org.hibernate.ogm.backendtck.compensation.CompensationSpiJpaTest",
//	"org.hibernate.ogm.backendtck.compensation.CompensationSpiTest",					// -appliedOperationsPassedToErrorHandlerAreSeparatedByTransaction
//	"org.hibernate.ogm.backendtck.embeddable.EmbeddableTest",
//	"org.hibernate.ogm.backendtck.hibernatecore.HibernateCoreAPIWrappingTest",
//	"org.hibernate.ogm.backendtck.hibernatecore.JNDIReferenceTest",
//	"org.hibernate.ogm.backendtck.inheritance.JPAPolymorphicFindTest",
//	"org.hibernate.ogm.backendtck.inheritance.JPATablePerClassFindTest",
//	"org.hibernate.ogm.backendtck.innertypes.InnerClassFindTest",
//	"org.hibernate.ogm.backendtck.jpa.JPAJTATest",
//	"org.hibernate.ogm.backendtck.jpa.JPAResourceLocalTest",
//	"org.hibernate.ogm.backendtck.jpa.JPAAPIWrappingTest",
//	"org.hibernate.ogm.backendtck.jpa.JPAStandaloneORMAndOGMTest",
//	"org.hibernate.ogm.backendtck.loader.LoaderFromTupleTest",
//	"org.hibernate.ogm.backendtck.queries.JpaQueriesTest",
//	"org.hibernate.ogm.backendtck.queries.QueryUpdateTest",
//	"org.hibernate.ogm.backendtck.queries.parameters.QueryWithParametersTest",
//	"org.hibernate.ogm.backendtck.type.BuiltInTypeTest",
//	"org.hibernate.ogm.backendtck.type.descriptor.CalendarTimeZoneDateTimeTypeDescriptorTest",

})
public class IgniteBackendTckHelper {
}
