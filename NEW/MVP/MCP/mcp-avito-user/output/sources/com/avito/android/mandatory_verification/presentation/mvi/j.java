package com.avito.android.mandatory_verification.presentation.mvi;

import UX.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.mandatory_verification.data.model.MandatoryVerificationData;
import com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MandatoryVerificationReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "LUX/c;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements u<MandatoryVerificationInternalAction, UX.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f184802b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f184803c;

    @Inject
    public j(@Y61.k n nVar, @Y61.k InterfaceC35741a1 interfaceC35741a1) {
        this.f184802b = nVar;
        this.f184803c = interfaceC35741a1;
    }

    @Override // com.avito.android.arch.mvi.u
    public final UX.c a(MandatoryVerificationInternalAction mandatoryVerificationInternalAction, UX.c cVar) {
        MandatoryVerificationInternalAction mandatoryVerificationInternalAction2 = mandatoryVerificationInternalAction;
        UX.c cVar2 = cVar;
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.BuildInitial) {
            return b(((MandatoryVerificationInternalAction.BuildInitial) mandatoryVerificationInternalAction2).f184786b);
        }
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.BuildFileUploadSuccess) {
            return b(cVar2.getF16433b().b(true, ((MandatoryVerificationInternalAction.BuildFileUploadSuccess) mandatoryVerificationInternalAction2).f184785b));
        }
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.BuildFileUploadError) {
            MandatoryVerificationData f16433b = cVar2.getF16433b();
            return b(MandatoryVerificationData.a(f16433b, null, MandatoryVerificationData.ObjectVerification.a(f16433b.f184431e, false, null, ((MandatoryVerificationInternalAction.BuildFileUploadError) mandatoryVerificationInternalAction2).f184784b, 32735), 119));
        }
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.BuildFileDeleteSuccess) {
            return b(cVar2.getF16433b().b(false, null));
        }
        if (mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.BuildVerificationSuccess) {
            return b(MandatoryVerificationData.a(cVar2.getF16433b(), ((MandatoryVerificationInternalAction.BuildVerificationSuccess) mandatoryVerificationInternalAction2).f184787b, null, 123));
        }
        if (!(mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.ProceedBlocked)) {
            return mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.ShowLoading ? new c.d(cVar2.getF16433b()) : mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.ShowError ? new c.b(null, 1, null) : mandatoryVerificationInternalAction2 instanceof MandatoryVerificationInternalAction.ShowToast ? b(cVar2.getF16433b()) : cVar2;
        }
        MandatoryVerificationData f16433b2 = cVar2.getF16433b();
        MandatoryVerificationData.ObjectVerification objectVerification = f16433b2.f184431e;
        String str = objectVerification.f184461j;
        if (objectVerification.f184458g) {
            str = null;
        }
        MandatoryVerificationData mandatoryVerificationDataA = MandatoryVerificationData.a(f16433b2, null, MandatoryVerificationData.ObjectVerification.a(objectVerification, false, null, str != null ? com.avito.android.printable_text.b.f(str) : null, 32767), 119);
        MandatoryVerificationData.AccountVerification accountVerification = mandatoryVerificationDataA.f184430d;
        String str2 = accountVerification.f184440g;
        boolean z12 = accountVerification.f184438e;
        return b(MandatoryVerificationData.a(mandatoryVerificationDataA, new MandatoryVerificationData.AccountVerification(accountVerification.f184435b, accountVerification.f184436c, accountVerification.f184437d, z12, accountVerification.f184439f, str2, !z12 ? str2 : null), null, 123));
    }

    public final c.C1129c b(MandatoryVerificationData mandatoryVerificationData) {
        return new c.C1129c(mandatoryVerificationData, this.f184802b.a(mandatoryVerificationData));
    }
}
