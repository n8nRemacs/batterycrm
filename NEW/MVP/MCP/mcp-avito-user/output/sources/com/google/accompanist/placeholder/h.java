package com.google.accompanist.placeholder;

import Y41.q;
import androidx.compose.animation.core.C20278f0;
import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.core.C20293k0;
import androidx.compose.animation.core.C20300m1;
import androidx.compose.animation.core.C20318t;
import androidx.compose.animation.core.C20319t0;
import androidx.compose.animation.core.F1;
import androidx.compose.animation.core.H1;
import androidx.compose.animation.core.J1;
import androidx.compose.animation.core.V;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.draw.o;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.F0;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.node.R0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Placeholder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "<anonymous>", "(Landroidx/compose/ui/v;)Landroidx/compose/ui/v;"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes4.dex */
final class h extends N implements q<v, A, Integer, v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q<C20288i1.b<Boolean>, A, Integer, V<Float>> f342901l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q<C20288i1.b<Boolean>, A, Integer, V<Float>> f342902m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f342903n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f342904o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h1 f342905p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j12, q qVar, q qVar2, h1 h1Var, c cVar) {
        super(3);
        this.f342901l = qVar;
        this.f342902m = qVar2;
        this.f342903n = cVar;
        this.f342904o = j12;
        this.f342905p = h1Var;
    }

    @Override // Y41.q
    public final v invoke(v vVar, A a12, Integer num) {
        v vVar2 = vVar;
        A a13 = a12;
        num.intValue();
        a13.I(804160625);
        a13.I(-3687241);
        Object objT = a13.t();
        A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = new R0();
            a13.H(objT);
        }
        a13.O();
        R0 r02 = (R0) objT;
        a13.I(-3687241);
        Object objT2 = a13.t();
        if (objT2 == obj) {
            objT2 = new R0();
            a13.H(objT2);
        }
        a13.O();
        R0 r03 = (R0) objT2;
        a13.I(-3687241);
        Object objT3 = a13.t();
        if (objT3 == obj) {
            objT3 = new R0();
            a13.H(objT3);
        }
        a13.O();
        R0 r04 = (R0) objT3;
        a13.I(-3687241);
        Object objT4 = a13.t();
        if (objT4 == obj) {
            objT4 = C22126m3.g(Float.valueOf(0.0f));
            a13.H(objT4);
        }
        a13.O();
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT4;
        a13.I(-3687241);
        Object objT5 = a13.t();
        if (objT5 == obj) {
            objT5 = new C20319t0(Boolean.TRUE);
            a13.H(objT5);
        }
        a13.O();
        C20319t0 c20319t0 = (C20319t0) objT5;
        ((C22082i3) c20319t0.f26406c).setValue(Boolean.TRUE);
        G0 g02 = G0.f406611a;
        C20288i1 c20288i1E = C20300m1.e(c20319t0, "placeholder_crossfade", a13, 48);
        a13.I(1399888299);
        int i12 = kotlin.jvm.internal.A.f406820a;
        H1<Float, C20318t> h12 = J1.f26075a;
        a13.I(1847721878);
        F1<S> f12 = c20288i1E.f26317a;
        boolean zBooleanValue = ((Boolean) f12.a()).booleanValue();
        a13.I(456697068);
        float f13 = zBooleanValue ? 1.0f : 0.0f;
        a13.O();
        Float fValueOf = Float.valueOf(f13);
        C22082i3 c22082i3 = (C22082i3) c20288i1E.f26320d;
        boolean zBooleanValue2 = ((Boolean) c22082i3.getF42167b()).booleanValue();
        a13.I(456697068);
        float f14 = zBooleanValue2 ? 1.0f : 0.0f;
        a13.O();
        C20288i1.d dVarD = C20300m1.d(c20288i1E, fValueOf, Float.valueOf(f14), this.f342901l.invoke(c20288i1E.f(), a13, 0), h12, a13, 196608);
        a13.O();
        a13.O();
        a13.I(1399888299);
        a13.I(1847721878);
        boolean zBooleanValue3 = ((Boolean) f12.a()).booleanValue();
        a13.I(456697297);
        float f15 = zBooleanValue3 ? 0.0f : 1.0f;
        a13.O();
        Float fValueOf2 = Float.valueOf(f15);
        boolean zBooleanValue4 = ((Boolean) c22082i3.getF42167b()).booleanValue();
        a13.I(456697297);
        float f16 = zBooleanValue4 ? 0.0f : 1.0f;
        a13.O();
        C20288i1.d dVarD2 = C20300m1.d(c20288i1E, fValueOf2, Float.valueOf(f16), this.f342902m.invoke(c20288i1E.f(), a13, 0), h12, a13, 196608);
        a13.O();
        a13.O();
        c cVar = this.f342903n;
        C20278f0<Float> c20278f0 = cVar == null ? null : ((l) cVar).f342907c;
        if (c20278f0 != null) {
            a13.I(804161867);
            interfaceC22204y1.setValue(Float.valueOf(((Number) ((C22082i3) C20293k0.a(C20293k0.c("InfiniteTransition", a13, 0), 0.0f, 1.0f, c20278f0, "FloatAnimation", a13, 29112, 0).f26280e).getF42167b()).floatValue()));
            a13.O();
        } else {
            a13.I(804162117);
            a13.O();
        }
        a13.I(-3687241);
        Object objT6 = a13.t();
        if (objT6 == obj) {
            objT6 = new C22273n();
            a13.H(objT6);
        }
        a13.O();
        F0 f02 = (F0) objT6;
        T tA2 = T.a(this.f342904o);
        a13.I(-3686095);
        boolean zB2 = a13.B(tA2);
        h1 h1Var = this.f342905p;
        boolean zB3 = zB2 | a13.B(h1Var) | a13.B(cVar);
        Object objT7 = a13.t();
        if (zB3 || objT7 == obj) {
            objT7 = o.d(vVar2, new g(f02, h1Var, this.f342904o, cVar, r04, r03, r02, dVarD2, dVarD, interfaceC22204y1));
            a13.H(objT7);
        }
        a13.O();
        v vVar3 = (v) objT7;
        a13.O();
        return vVar3;
    }
}
