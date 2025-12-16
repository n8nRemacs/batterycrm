package com.avito.android.mortgage.document_requirements.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import b00.C25383b;
import b00.InterfaceC25382a;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.document_requirements.mvi.entity.DocumentRequirementsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DocumentRequirementsActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lb00/a;", "Lcom/avito/android/mortgage/document_requirements/mvi/entity/DocumentRequirementsInternalAction;", "Lb00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC25382a, DocumentRequirementsInternalAction, C25383b> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DocumentRequirementsInternalAction> b(InterfaceC25382a interfaceC25382a, C25383b c25383b) {
        InterfaceC25382a interfaceC25382a2 = interfaceC25382a;
        if (interfaceC25382a2 instanceof InterfaceC25382a.C1983a) {
            return new C43210w(new DocumentRequirementsInternalAction.DocumentClicked(((InterfaceC25382a.C1983a) interfaceC25382a2).f56810a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
