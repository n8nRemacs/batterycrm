package androidx.compose.material3;

import androidx.compose.foundation.C20529i0;
import androidx.compose.foundation.C20805p0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: Surface.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Qg {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22143q0 f35355a = androidx.compose.runtime.S.c(a.f35356l);

    /* compiled from: Surface.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/unit/h;", "invoke-D9Ej5fM", "()F", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.ui.unit.h> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f35356l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.compose.ui.unit.h invoke() {
            return androidx.compose.ui.unit.h.a(0);
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.ui.graphics.h1 h1Var, long j12, long j13, float f12, float f13, @Y61.l C20805p0 c20805p0, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        float f14;
        float f15;
        a12.I(-513881741);
        androidx.compose.ui.graphics.h1 h1Var2 = (i13 & 2) != 0 ? androidx.compose.ui.graphics.Y0.f39346a : h1Var;
        long jB2 = (i13 & 8) != 0 ? C21964x3.b(j12, a12) : j13;
        if ((i13 & 16) != 0) {
            f14 = 0;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
        } else {
            f14 = f12;
        }
        if ((i13 & 32) != 0) {
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            f15 = 0;
        } else {
            f15 = f13;
        }
        C20805p0 c20805p02 = (i13 & 64) != 0 ? null : c20805p0;
        C22143q0 c22143q0 = f35355a;
        float f16 = ((androidx.compose.ui.unit.h) a12.o(c22143q0)).f42852b + f14;
        androidx.compose.runtime.S.b(new androidx.compose.runtime.Y1[]{L3.f35042a.b(androidx.compose.ui.graphics.T.a(jB2)), c22143q0.b(androidx.compose.ui.unit.h.a(f16))}, androidx.compose.runtime.internal.r.b(a12, -70914509, new Tg(vVar, h1Var2, j12, f16, c20805p02, f15, c22096n)), a12, 48);
        a12.O();
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(boolean z12, @Y61.k Y41.a aVar, @Y61.l androidx.compose.ui.v vVar, boolean z13, @Y61.l androidx.compose.ui.graphics.h1 h1Var, long j12, long j13, float f12, float f13, @Y61.l C20805p0 c20805p0, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        float f14;
        float f15;
        androidx.compose.foundation.interaction.m mVar2;
        a12.I(540296512);
        boolean z14 = (i13 & 8) != 0 ? true : z13;
        long jB2 = (i13 & 64) != 0 ? C21964x3.b(j12, a12) : j13;
        if ((i13 & 128) != 0) {
            f14 = 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        } else {
            f14 = f12;
        }
        if ((i13 & 256) != 0) {
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            f15 = 0;
        } else {
            f15 = f13;
        }
        C20805p0 c20805p02 = (i13 & 512) != 0 ? null : c20805p0;
        if ((i13 & 1024) != 0) {
            a12.I(-746935250);
            Object objT = a12.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                objT = androidx.compose.foundation.interaction.l.a();
                a12.H(objT);
            }
            a12.O();
            mVar2 = (androidx.compose.foundation.interaction.m) objT;
        } else {
            mVar2 = mVar;
        }
        C22143q0 c22143q0 = f35355a;
        float f16 = ((androidx.compose.ui.unit.h) a12.o(c22143q0)).f42852b + f14;
        androidx.compose.runtime.S.b(new androidx.compose.runtime.Y1[]{L3.f35042a.b(androidx.compose.ui.graphics.T.a(jB2)), c22143q0.b(androidx.compose.ui.unit.h.a(f16))}, androidx.compose.runtime.internal.r.b(a12, -1164547968, new Vg(vVar, h1Var, j12, f16, c20805p02, z12, mVar2, z14, aVar, f15, c22096n)), a12, 48);
        a12.O();
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void c(@Y61.k Y41.a aVar, @Y61.l androidx.compose.ui.v vVar, boolean z12, @Y61.l androidx.compose.ui.graphics.h1 h1Var, long j12, long j13, float f12, float f13, @Y61.l C20805p0 c20805p0, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        float f14;
        float f15;
        a12.I(-789752804);
        boolean z13 = (i13 & 4) != 0 ? true : z12;
        long jB2 = (i13 & 32) != 0 ? C21964x3.b(j12, a12) : j13;
        if ((i13 & 64) != 0) {
            f14 = 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        } else {
            f14 = f12;
        }
        if ((i13 & 128) != 0) {
            f15 = 0;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        } else {
            f15 = f13;
        }
        C20805p0 c20805p02 = (i13 & 256) != 0 ? null : c20805p0;
        C22143q0 c22143q0 = f35355a;
        float f16 = f14 + ((androidx.compose.ui.unit.h) a12.o(c22143q0)).f42852b;
        androidx.compose.runtime.S.b(new androidx.compose.runtime.Y1[]{L3.f35042a.b(androidx.compose.ui.graphics.T.a(jB2)), c22143q0.b(androidx.compose.ui.unit.h.a(f16))}, androidx.compose.runtime.internal.r.b(a12, 1279702876, new Ug(f16, f15, j12, aVar, c20805p02, mVar, c22096n, vVar, h1Var, z13)), a12, 48);
        a12.O();
    }

    public static final androidx.compose.ui.v d(androidx.compose.ui.v vVar, androidx.compose.ui.graphics.h1 h1Var, long j12, C20805p0 c20805p0, float f12) {
        androidx.compose.ui.v vVarB;
        androidx.compose.ui.v vVarB2 = C22274n0.b(vVar, 0.0f, 0.0f, 0.0f, f12, 0.0f, h1Var, false, 124895);
        if (c20805p0 != null) {
            vVarB = C20529i0.b(androidx.compose.ui.v.f42878y1, c20805p0.f29789a, c20805p0.f29790b, h1Var);
        } else {
            vVarB = androidx.compose.ui.v.f42878y1;
        }
        return androidx.compose.ui.draw.k.a(androidx.compose.foundation.A.b(vVarB2.d0(vVarB), j12, h1Var), h1Var);
    }

    public static final long e(long j12, float f12, androidx.compose.runtime.A a12) {
        a12.I(-2079918090);
        C21859s9.f37272a.getClass();
        C21942w3 c21942w3A = C21859s9.a(a12);
        boolean zBooleanValue = ((Boolean) a12.o(C21964x3.f37698b)).booleanValue();
        if (androidx.compose.ui.graphics.T.d(j12, c21942w3A.f37667p) && zBooleanValue) {
            j12 = C21964x3.e(c21942w3A, f12);
        }
        a12.O();
        return j12;
    }
}
