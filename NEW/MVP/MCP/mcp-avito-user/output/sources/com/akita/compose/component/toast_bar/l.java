package com.akita.compose.component.toast_bar;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.O;
import androidx.compose.animation.core.Q;
import androidx.compose.foundation.layout.C20632w;
import androidx.compose.foundation.layout.C20644z;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ToastBarHost.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "invoke", "(LY41/p;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l extends N implements Y41.q<Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends G0>, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC27357f f63256m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f63257n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f63258o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C27355d<InterfaceC27357f> f63259p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC27357f interfaceC27357f, InterfaceC27357f interfaceC27357f2, ArrayList arrayList, float f12, C27355d c27355d) {
        super(3);
        this.f63255l = interfaceC27357f;
        this.f63256m = interfaceC27357f2;
        this.f63257n = arrayList;
        this.f63258o = f12;
        this.f63259p = c27355d;
    }

    @Override // Y41.q
    public final G0 invoke(Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends G0> pVar, androidx.compose.runtime.A a12, Integer num) {
        Y41.p<? super androidx.compose.runtime.A, ? super Integer, ? extends G0> pVar2 = pVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.u(pVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else {
            InterfaceC27357f interfaceC27357f = this.f63256m;
            InterfaceC27357f interfaceC27357f2 = this.f63255l;
            boolean zF2 = L.f(interfaceC27357f2, interfaceC27357f);
            int i12 = zF2 ? 150 : 75;
            int i13 = (!zF2 || C42745f0.C(this.f63257n).size() == 1) ? 0 : 75;
            O o12 = Q.f26124d;
            G1 g12 = new G1(i12, i13, o12);
            k kVar = new k(interfaceC27357f2, this.f63259p);
            float f12 = q.f63273a;
            a13.C(337121211);
            a13.C(1435025689);
            Object objT = a13.t();
            androidx.compose.runtime.A.f37866a.getClass();
            Object obj = A.a.f37868b;
            float f13 = this.f63258o;
            if (objT == obj) {
                objT = C20274e.a(!zF2 ? 0.0f : f13);
                a13.H(objT);
            }
            C20268c c20268c = (C20268c) objT;
            a13.h();
            C22187u0.d(new t(c20268c, zF2, f13, g12, C22126m3.m(kVar, a13), null), a13, Boolean.valueOf(zF2));
            androidx.compose.animation.core.r<T, V> rVar = c20268c.f26225d;
            a13.h();
            G1 g13 = new G1(i12, i13, o12);
            a13.C(1113948733);
            a13.C(-453703478);
            Object objT2 = a13.t();
            if (objT2 == obj) {
                objT2 = C20274e.a(zF2 ? 0.0f : 1.0f);
                a13.H(objT2);
            }
            C20268c c20268c2 = (C20268c) objT2;
            a13.h();
            C22187u0.d(new r(c20268c2, zF2, g13, null), a13, Boolean.valueOf(zF2));
            androidx.compose.animation.core.r<T, V> rVar2 = c20268c2.f26225d;
            a13.h();
            v.a aVar = androidx.compose.ui.v.f42878y1;
            a13.C(-256455983);
            boolean zB2 = a13.B(rVar2) | a13.B(rVar);
            Object objT3 = a13.t();
            if (zB2 || objT3 == obj) {
                objT3 = new C27358g(rVar2, rVar);
                a13.H(objT3);
            }
            a13.h();
            androidx.compose.ui.v vVarA = C22274n0.a(aVar, (Y41.l) objT3);
            a13.C(-256450062);
            boolean zB3 = a13.B(interfaceC27357f2);
            Object objT4 = a13.t();
            if (zB3 || objT4 == obj) {
                objT4 = new C27360i(interfaceC27357f2);
                a13.H(objT4);
            }
            a13.h();
            androidx.compose.ui.v vVarB = androidx.compose.ui.semantics.r.b(vVarA, false, (Y41.l) objT4);
            InterfaceC22215f.f39074a.getClass();
            InterfaceC22365i0 interfaceC22365i0D = C20632w.d(InterfaceC22215f.a.f39076b, false);
            int f37888q = a13.getF37888Q();
            O1 o1Y = a13.y();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(a13, vVarB);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
            if (a13.F() == null) {
                C22190v.b();
                throw null;
            }
            a13.A();
            if (a13.getF37887P()) {
                a13.b(aVar2);
            } else {
                a13.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, a13, interfaceC22365i0D);
            R3.b(InterfaceC22413h.a.f40795f, a13, o1Y);
            Y41.p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
            if (a13.getF37887P() || !L.f(a13.t(), Integer.valueOf(f37888q))) {
                androidx.appcompat.app.r.B(f37888q, a13, f37888q, pVar3);
            }
            R3.b(InterfaceC22413h.a.f40793d, a13, vVarC);
            C20644z c20644z = C20644z.f28804a;
            pVar2.invoke(a13, Integer.valueOf(iIntValue & 14));
            a13.z();
        }
        return G0.f406611a;
    }
}
