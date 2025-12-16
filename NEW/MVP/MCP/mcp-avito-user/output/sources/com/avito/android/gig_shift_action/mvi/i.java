package com.avito.android.gig_shift_action.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.ActionV2;
import com.avito.android.gig.shift_action_impl.generated.api.qr_scan_v_2.Reason;
import com.avito.android.gig_shift_action.mvi.a;
import com.avito.android.gig_shift_action.mvi.j;
import com.avito.android.gig_shift_action.mvi.q;
import com.avito.android.gig_shift_action.ui.GigShiftActionOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigShiftActionActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_shift_action/mvi/i;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/gig_shift_action/mvi/a;", "Lcom/avito/android/gig_shift_action/mvi/q;", "Lcom/avito/android/gig_shift_action/mvi/w;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements com.avito.android.arch.mvi.a<a, q, w> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_shift_action.domain.a f160481a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigShiftActionOpenParams f160482b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AH.a f160483c;

    @Inject
    public i(@Y61.k com.avito.android.gig_shift_action.domain.a aVar, @Y61.k GigShiftActionOpenParams gigShiftActionOpenParams, @Y61.k AH.a aVar2) {
        this.f160481a = aVar;
        this.f160482b = gigShiftActionOpenParams;
        this.f160483c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<q> b(a aVar, w wVar) {
        Reason.ReasonName reasonName;
        a aVar2 = aVar;
        w wVar2 = wVar;
        boolean zEquals = aVar2.equals(a.C4692a.f160462a);
        boolean z12 = wVar2.f160529i;
        GigShiftActionOpenParams gigShiftActionOpenParams = this.f160482b;
        com.avito.android.gig_shift_action.domain.a aVar3 = this.f160481a;
        com.avito.android.gig.shift_action_impl.generated.api.checkout_v_2.Reason reason = null;
        if (!zEquals) {
            if (aVar2 instanceof a.c) {
                return C43175k.G(new h(aVar2, null));
            }
            if (aVar2 instanceof a.b) {
                return z12 ? new C43210w(q.d.f160508a) : com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(new C43210w(q.g.f160511a), aVar3.c(null)));
            }
            if (aVar2 instanceof a.d) {
                return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(new C43210w(q.g.f160511a), aVar3.c(gigShiftActionOpenParams.f160576c)));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wVar2.f160524d) {
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new b(2, null)), aVar3.c(gigShiftActionOpenParams.f160576c)));
        }
        if (wVar2.f160527g) {
            return C43175k.G(new c(2, null));
        }
        if (wVar2.f160523c) {
            return C43175k.G(new d(2, null));
        }
        AH.a aVar4 = this.f160483c;
        z zVar = wVar2.f160528h;
        if (zVar != null && zVar.f160536a == ActionV2.ActionName.CheckIn) {
            long j12 = zVar.f160537b;
            Long lValueOf = Long.valueOf(j12);
            aVar4.getClass();
            aVar4.f233a.c(new BH.a(lValueOf));
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new e(2, null)), aVar3.a(j12, zVar.f160544i)));
        }
        if (zVar != null && zVar.f160536a == ActionV2.ActionName.CheckOut && wVar2.f160534n && !z12) {
            Long lValueOf2 = Long.valueOf(zVar.f160537b);
            aVar4.getClass();
            aVar4.f233a.c(new BH.c(lValueOf2));
            return C43175k.G(new f(2, null));
        }
        if (zVar == null || zVar.f160536a != ActionV2.ActionName.CheckOut) {
            return C43175k.w();
        }
        long j13 = zVar.f160537b;
        Long lValueOf3 = Long.valueOf(j13);
        Reason reason2 = zVar.f160546k;
        String str = (reason2 == null || (reasonName = reason2.getReasonName()) == null) ? null : reasonName.f159452b;
        aVar4.getClass();
        aVar4.f233a.c(new BH.b(lValueOf3, str));
        InterfaceC43160i interfaceC43160iG = C43175k.G(new g(2, null));
        if (reason2 != null) {
            Reason.ReasonName reasonName2 = reason2.getReasonName();
            int i12 = reasonName2 == null ? -1 : j.a.f160484a[reasonName2.ordinal()];
            if (i12 == 1) {
                reason = com.avito.android.gig.shift_action_impl.generated.api.checkout_v_2.Reason.NoWork;
            } else if (i12 == 2) {
                reason = com.avito.android.gig.shift_action_impl.generated.api.checkout_v_2.Reason.Personal;
            } else if (i12 == 3) {
                reason = com.avito.android.gig.shift_action_impl.generated.api.checkout_v_2.Reason.FinishEarly;
            }
        }
        return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(interfaceC43160iG, aVar3.b(j13, zVar.f160544i, reason)));
    }
}
