package com.avito.android.mandatory_verification.presentation.mvi;

import UX.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.mandatory_verification.data.model.MandatoryVerificationData;
import com.avito.android.mandatory_verification.presentation.mvi.entity.MandatoryVerificationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MandatoryVerificationActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LUX/a;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "LUX/c;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<UX.a, MandatoryVerificationInternalAction, UX.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.domain.o f184748a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.domain.c f184749b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.domain.g f184750c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mandatory_verification.domain.k f184751d;

    /* renamed from: e, reason: collision with root package name */
    public final long f184752e;

    @Inject
    public a(@Y61.k com.avito.android.mandatory_verification.domain.o oVar, @Y61.k com.avito.android.mandatory_verification.domain.c cVar, @Y61.k com.avito.android.mandatory_verification.domain.g gVar, @Y61.k com.avito.android.mandatory_verification.domain.k kVar, long j12) {
        this.f184748a = oVar;
        this.f184749b = cVar;
        this.f184750c = gVar;
        this.f184751d = kVar;
        this.f184752e = j12;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MandatoryVerificationInternalAction> b(UX.a aVar, UX.c cVar) {
        InterfaceC43160i<MandatoryVerificationInternalAction> c43210w;
        com.avito.android.mandatory_verification.domain.file_uploader.a aVar2;
        UX.a aVar3 = aVar;
        UX.c cVar2 = cVar;
        if (aVar3 instanceof a.d) {
            return new C43210w(new MandatoryVerificationInternalAction.OpenFilePicker(cVar2.getF16433b().f184431e.f184459h));
        }
        if (aVar3 instanceof a.g) {
            return this.f184748a.a(((a.g) aVar3).f16425a, new com.avito.android.mandatory_verification.domain.file_uploader.m(cVar2.getF16433b().f184431e.f184465n, cVar2.getF16433b().f184431e.f184460i, cVar2.getF16433b().f184431e.f184466o, cVar2.getF16433b().f184431e.f184459h), cVar2.getF16433b().f184431e.f184463l);
        }
        if (aVar3 instanceof a.b) {
            return this.f184749b.a(((a.b) aVar3).f16420a, cVar2.getF16433b().f184431e.f184464m);
        }
        boolean z12 = aVar3 instanceof a.e;
        long j12 = this.f184752e;
        if (z12) {
            MandatoryVerificationData f16433b = cVar2.getF16433b();
            if (f16433b.f184430d.f184438e) {
                MandatoryVerificationData.ObjectVerification objectVerification = f16433b.f184431e;
                if (objectVerification.f184458g && (aVar2 = objectVerification.f184467p) != null) {
                    c43210w = this.f184751d.a(j12, aVar2.f184504a);
                }
            }
            return new C43210w(MandatoryVerificationInternalAction.ProceedBlocked.f184791b);
        }
        if (aVar3 instanceof a.C1127a) {
            return new C43210w(MandatoryVerificationInternalAction.Cancel.f184788b);
        }
        if (aVar3 instanceof a.f) {
            return this.f184750c.a(j12);
        }
        if (!(aVar3 instanceof a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        c43210w = new C43210w(new MandatoryVerificationInternalAction.FollowDeeplink(((a.c) aVar3).f16421a));
        return c43210w;
    }
}
