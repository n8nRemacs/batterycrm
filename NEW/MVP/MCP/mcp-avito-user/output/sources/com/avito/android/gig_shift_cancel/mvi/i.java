package com.avito.android.gig_shift_cancel.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.gig.shift_cancel_impl.generated.api.cancel_info_v_1.Reason;
import com.avito.android.gig_shift_cancel.mvi.a;
import com.avito.android.gig_shift_cancel.mvi.q;
import com.avito.android.gig_shift_cancel.ui.GigShiftCancelOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigShiftCancelActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_shift_cancel/mvi/i;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/gig_shift_cancel/mvi/a;", "Lcom/avito/android/gig_shift_cancel/mvi/q;", "Lcom/avito/android/gig_shift_cancel/mvi/x;", "_avito_gig_shift-cancel_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements com.avito.android.arch.mvi.a<a, q, x> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_shift_cancel.domain.a f160647a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigShiftCancelOpenParams f160648b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CH.a f160649c;

    @Inject
    public i(@Y61.k com.avito.android.gig_shift_cancel.domain.a aVar, @Y61.k GigShiftCancelOpenParams gigShiftCancelOpenParams, @Y61.k CH.a aVar2) {
        this.f160647a = aVar;
        this.f160648b = gigShiftCancelOpenParams;
        this.f160649c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<q> b(a aVar, x xVar) {
        Reason reason;
        Reason reason2;
        Reason.ReasonName reasonName;
        a aVar2 = aVar;
        x xVar2 = xVar;
        boolean zEquals = aVar2.equals(a.C4698a.f160628a);
        com.avito.android.gig_shift_cancel.domain.a aVar3 = this.f160647a;
        GigShiftCancelOpenParams gigShiftCancelOpenParams = this.f160648b;
        if (!zEquals) {
            if (aVar2 instanceof a.c) {
                return C43175k.G(new g(aVar2, null));
            }
            if (aVar2 instanceof a.b) {
                return C43175k.G(new h(2, null));
            }
            if (aVar2 instanceof a.d) {
                return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(new C43210w(q.f.f160674a), aVar3.b(gigShiftCancelOpenParams.f160729b)));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (xVar2.f160697e) {
            return C43175k.G(new b(2, null));
        }
        boolean z12 = xVar2.f160695c;
        r rVar = xVar2.f160698f;
        if (z12) {
            if (rVar == null) {
                return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(C43175k.G(new d(2, null)), aVar3.b(gigShiftCancelOpenParams.f160729b)));
            }
            InterfaceC43160i interfaceC43160iG = C43175k.G(new c(2, null));
            long j12 = gigShiftCancelOpenParams.f160729b;
            Reason reason3 = rVar.f160687k;
            return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(interfaceC43160iG, aVar3.a(j12, reason3 != null ? j.a(reason3) : null)));
        }
        CH.a aVar4 = this.f160649c;
        boolean z13 = xVar2.f160704l;
        if (z13 && !xVar2.f160699g) {
            Long lValueOf = Long.valueOf(gigShiftCancelOpenParams.f160729b);
            aVar4.getClass();
            aVar4.f2071a.c(new DH.b(lValueOf));
            return C43175k.G(new e(2, null));
        }
        if (z13) {
            Long lValueOf2 = Long.valueOf(gigShiftCancelOpenParams.f160729b);
            String str = (rVar == null || (reason2 = rVar.f160687k) == null || (reasonName = reason2.getReasonName()) == null) ? null : reasonName.f159458b;
            aVar4.getClass();
            aVar4.f2071a.c(new DH.c(lValueOf2, str));
        } else {
            Long lValueOf3 = Long.valueOf(gigShiftCancelOpenParams.f160729b);
            aVar4.getClass();
            aVar4.f2071a.c(new DH.a(lValueOf3, xVar2.f160700h));
        }
        InterfaceC43160i interfaceC43160iG2 = C43175k.G(new f(2, null));
        long j13 = gigShiftCancelOpenParams.f160729b;
        if (rVar != null && (reason = rVar.f160687k) != null) {
            reasonA = j.a(reason);
        }
        return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(interfaceC43160iG2, aVar3.a(j13, reasonA)));
    }
}
