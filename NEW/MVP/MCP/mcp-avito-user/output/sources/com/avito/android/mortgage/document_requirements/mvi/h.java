package com.avito.android.mortgage.document_requirements.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import b00.C25383b;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage.document_requirements.mvi.entity.DocumentRequirementsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DocumentRequirementsReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/mvi/h;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction;", "Lb00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements u<DocumentRequirementsInternalAction, C25383b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ZZ.a f198997b;

    @Inject
    public h(@k ZZ.a aVar) {
        this.f198997b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C25383b a(DocumentRequirementsInternalAction documentRequirementsInternalAction, C25383b c25383b) {
        DocumentRequirementsInternalAction documentRequirementsInternalAction2 = documentRequirementsInternalAction;
        C25383b c25383b2 = c25383b;
        if (documentRequirementsInternalAction2 instanceof DocumentRequirementsInternalAction.DocumentClicked) {
            c25383b2 = new C25383b(c25383b2.f56811b, ((DocumentRequirementsInternalAction.DocumentClicked) documentRequirementsInternalAction2).f198988b, c25383b2.f56813d);
        }
        this.f198997b.a(documentRequirementsInternalAction2, c25383b2);
        return c25383b2;
    }
}
