package org.nuxeo.kotlin.example

import org.nuxeo.ecm.automation.core.annotations.Context
import org.nuxeo.ecm.automation.core.annotations.Operation
import org.nuxeo.ecm.automation.core.annotations.OperationMethod
import org.nuxeo.ecm.core.api.CoreSession
import org.nuxeo.ecm.core.api.DocumentModel

@Operation(id = "Kotlin.MyOperation", category = "Kotlin", label = "Kotlin Operation", description = "")
open class MyOperation {

    @Context
    protected lateinit var session: CoreSession

    @OperationMethod
    fun run(): DocumentModel {
        return session.rootDocument;
    }
}