package com.avito.android.tariff.cpr.configure.advance.items.reviews;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import com.akita.compose.theme.re23.style.C27535i3;
import com.akita.compose.theme.re23.style.InterfaceC27530h3;
import com.avito.android.tariff.cpr.configure.advance.items.reviews.x;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class q extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f295305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f295306m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f295307n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(List list, InterfaceC22196w1 interfaceC22196w1, u uVar) {
        super(4);
        this.f295305l = list;
        this.f295306m = interfaceC22196w1;
        this.f295307n = uVar;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            x xVar = (x) this.f295305l.get(iIntValue);
            a13.C(-1400487323);
            boolean z12 = xVar instanceof x.b ? ((x.b) xVar).f295322b : false;
            Y41.l lVar = xVar instanceof x.a ? m.f295302l : n.f295303l;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.selector_card.h f66671b = ((InterfaceC27530h3) a13.o(C27535i3.f66637b)).getF66671b();
            androidx.compose.ui.v vVarA = C22501m2.a(androidx.compose.ui.v.f42878y1, "CPR_CONFIGURE_ADVANCE_REVIEWS_REVIEW_CARD_TAG_" + iIntValue);
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarV = C20588k2.v((float) 148, 0.0f, 2, vVarA);
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) a13.o(Q0.f41199h);
            InterfaceC22196w1 interfaceC22196w1 = this.f295306m;
            androidx.compose.ui.v vVarH = C20588k2.h(androidx.compose.ui.unit.h.a(dVar.J(interfaceC22196w1.e())).f42852b, 0.0f, 2, vVarV);
            a13.C(509060753);
            Object objT = a13.t();
            A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = new j(interfaceC22196w1);
                a13.H(objT);
            }
            a13.h();
            com.akita.compose.component.selector_card.g.a(z12, new k(this.f295307n, xVar), f66671b, C22392w0.a(vVarH, (Y41.l) objT), true, null, null, null, androidx.compose.runtime.internal.r.c(-1241600595, new l(xVar, lVar), a13), a13, 100687872, 224);
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
