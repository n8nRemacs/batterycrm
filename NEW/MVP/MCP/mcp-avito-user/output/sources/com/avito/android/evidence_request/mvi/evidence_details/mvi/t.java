package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import Xz.InterfaceC17067b;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EvidenceDetailsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/t;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "LXz/b;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t implements com.avito.android.arch.mvi.t<EvidenceDetailsInternalAction, InterfaceC17067b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f149100b;

    @Inject
    public t(@Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f149100b = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC17067b b(EvidenceDetailsInternalAction evidenceDetailsInternalAction) {
        InterfaceC17067b cVar;
        EvidenceDetailsInternalAction evidenceDetailsInternalAction2 = evidenceDetailsInternalAction;
        if (evidenceDetailsInternalAction2.equals(EvidenceDetailsInternalAction.Back.f149028b)) {
            return InterfaceC17067b.C1360b.f19189a;
        }
        if (evidenceDetailsInternalAction2.equals(EvidenceDetailsInternalAction.Finish.f149032b)) {
            return InterfaceC17067b.d.f19192a;
        }
        if (evidenceDetailsInternalAction2.equals(EvidenceDetailsInternalAction.HideKeyboard.f149035b)) {
            return InterfaceC17067b.e.f19193a;
        }
        if (evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.RemoveFile) {
            cVar = new InterfaceC17067b.g(((EvidenceDetailsInternalAction.RemoveFile) evidenceDetailsInternalAction2).f149040b);
        } else if (evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.OpenScreen) {
            cVar = new InterfaceC17067b.f(((EvidenceDetailsInternalAction.OpenScreen) evidenceDetailsInternalAction2).f149039b);
        } else if (evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.ActivityResult) {
            cVar = new InterfaceC17067b.a(((EvidenceDetailsInternalAction.ActivityResult) evidenceDetailsInternalAction2).f149027b);
        } else if (evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.ShowErrorToast) {
            InterfaceC35741a1 interfaceC35741a1 = this.f149100b;
            Throwable th2 = ((EvidenceDetailsInternalAction.ShowErrorToast) evidenceDetailsInternalAction2).f149041b;
            cVar = new InterfaceC17067b.h(InterfaceC35741a1.a.a(interfaceC35741a1, th2, null, null, 6), th2);
        } else if (evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.ValidationError) {
            EvidenceDetailsInternalAction.ValidationError validationError = (EvidenceDetailsInternalAction.ValidationError) evidenceDetailsInternalAction2;
            cVar = new InterfaceC17067b.i(validationError.f149043b, validationError.f149044c);
        } else {
            if (!(evidenceDetailsInternalAction2 instanceof EvidenceDetailsInternalAction.FilesPicker)) {
                return null;
            }
            EvidenceDetailsInternalAction.FilesPicker filesPicker = (EvidenceDetailsInternalAction.FilesPicker) evidenceDetailsInternalAction2;
            cVar = new InterfaceC17067b.c(filesPicker.f149029b, filesPicker.f149030c);
        }
        return cVar;
    }
}
