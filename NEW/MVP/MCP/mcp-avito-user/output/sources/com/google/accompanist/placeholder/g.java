package com.google.accompanist.placeholder;

import androidx.compose.animation.core.C20288i1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.D0;
import androidx.compose.ui.graphics.F0;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.h1;
import androidx.compose.ui.node.R0;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import l0.n;
import l0.o;

/* compiled from: Placeholder.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final class g extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F0 f342891l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1 f342892m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f342893n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ c f342894o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ R0<D0> f342895p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ R0<LayoutDirection> f342896q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ R0<n> f342897r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C20288i1.d f342898s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C20288i1.d f342899t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<Float> f342900u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(F0 f02, h1 h1Var, long j12, c cVar, R0 r02, R0 r03, R0 r04, C20288i1.d dVar, C20288i1.d dVar2, InterfaceC22204y1 interfaceC22204y1) {
        super(1);
        this.f342891l = f02;
        this.f342892m = h1Var;
        this.f342893n = j12;
        this.f342894o = cVar;
        this.f342895p = r02;
        this.f342896q = r03;
        this.f342897r = r04;
        this.f342898s = dVar;
        this.f342899t = dVar2;
        this.f342900u = interfaceC22204y1;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [T, l0.n] */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, androidx.compose.ui.unit.LayoutDirection] */
    @Override // Y41.l
    public final G0 invoke(androidx.compose.ui.graphics.drawscope.d dVar) {
        androidx.compose.ui.graphics.drawscope.d dVar2 = dVar;
        C20288i1.d dVar3 = this.f342898s;
        float fFloatValue = ((Number) dVar3.getF42167b()).floatValue();
        F0 f02 = this.f342891l;
        if (0.01f <= fFloatValue && fFloatValue <= 0.99f) {
            f02.setAlpha(((Number) dVar3.getF42167b()).floatValue());
            M mA2 = dVar2.getF39478c().a();
            mA2.e(o.c(dVar2.i()), f02);
            dVar2.y1();
            mA2.i();
        } else if (((Number) dVar3.getF42167b()).floatValue() >= 0.99f) {
            dVar2.y1();
        }
        C20288i1.d dVar4 = this.f342899t;
        float fFloatValue2 = ((Number) dVar4.getF42167b()).floatValue();
        c cVar = this.f342894o;
        InterfaceC22204y1<Float> interfaceC22204y1 = this.f342900u;
        R0<D0> r02 = this.f342895p;
        R0<n> r03 = this.f342897r;
        R0<LayoutDirection> r04 = this.f342896q;
        if (0.01f <= fFloatValue2 && fFloatValue2 <= 0.99f) {
            f02.setAlpha(((Number) dVar4.getF42167b()).floatValue());
            M mA3 = dVar2.getF39478c().a();
            mA3.e(o.c(dVar2.i()), f02);
            j.a(dVar2, this.f342892m, this.f342893n, cVar, interfaceC22204y1.getF42167b().floatValue(), r02.f40676a, r04.f40676a, r03.f40676a);
            mA3.i();
        } else if (((Number) dVar4.getF42167b()).floatValue() >= 0.99f) {
            j.a(dVar2, this.f342892m, this.f342893n, cVar, interfaceC22204y1.getF42167b().floatValue(), r02.f40676a, r04.f40676a, r03.f40676a);
        }
        r03.f40676a = n.a(dVar2.i());
        r04.f40676a = dVar2.getLayoutDirection();
        return G0.f406611a;
    }
}
