package com.akita.compose.component.date_picker.ui;

import android.content.Context;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.akita.compose.component.date_picker.F;
import com.akita.compose.component.date_picker.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalMonthsList.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f61370l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P2.b f61371m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f61372n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F f61373o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P2.a f61374p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, Boolean> f61375q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, Boolean> f61376r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, G0> f61377s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(K k12, P2.b bVar, Context context, F f12, P2.a aVar, Y41.l<? super Long, Boolean> lVar, Y41.l<? super Long, Boolean> lVar2, Y41.l<? super Long, G0> lVar3) {
        super(4);
        this.f61370l = k12;
        this.f61371m = bVar;
        this.f61372n = context;
        this.f61373o = f12;
        this.f61374p = aVar;
        this.f61375q = lVar;
        this.f61376r = lVar2;
        this.f61377s = lVar3;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 14) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 112) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if ((i12 & 731) == 146 && a13.c()) {
            a13.f();
        } else {
            K k12 = this.f61370l;
            P2.b bVarM = k12.f61177h.m(this.f61371m, iIntValue);
            String strE = k12.f61177h.e(this.f61372n, bVarM);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar = InterfaceC22215f.a.f39089o;
            v.a aVar2 = v.f42878y1;
            v vVarC = interfaceC20793y2.c(aVar2);
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28662d, aVar, a13, 48);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            v vVarC2 = androidx.compose.ui.n.c(a13, vVarC);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar3);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, iA2);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC2);
            androidx.compose.foundation.layout.K k13 = androidx.compose.foundation.layout.K.f28344a;
            F f12 = this.f61373o;
            com.akita.compose.foundation.r rVar = f12.f61130d;
            v vVarM = R1.m(aVar2, 0.0f, f12.f61135i, 0.0f, f12.f61133g, 5);
            K k14 = this.f61370l;
            n.a(strE, k14, rVar, f12.f61136j, f12.f61128b, vVarM, a13, 0);
            int i13 = com.akita.compose.component.floating_container.c.f61576e;
            l.a(bVarM, this.f61374p, k14, this.f61375q, this.f61376r, this.f61377s, f12, null, a13, 2097152);
            a13.z();
        }
        return G0.f406611a;
    }
}
