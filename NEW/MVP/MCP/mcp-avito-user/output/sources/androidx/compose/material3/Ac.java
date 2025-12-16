package androidx.compose.material3;

import androidx.compose.animation.core.C20281g0;
import androidx.compose.animation.core.C20302n0;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import d0.C39456e;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Ac {

    /* renamed from: a, reason: collision with root package name */
    public static final float f34479a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.v f34480b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f34481c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f34482d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f34483e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f34484f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f34485g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f34486h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f34487i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f34488j;

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f34489l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.drawscope.o f34490m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C20281g0.a f34491n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C20281g0.a f34492o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C20281g0.a f34493p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C20281g0.a f34494q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ float f34495r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f34496s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, long j12, long j13, C20281g0.a aVar, C20281g0.a aVar2, C20281g0.a aVar3, C20281g0.a aVar4, androidx.compose.ui.graphics.drawscope.o oVar) {
            super(1);
            this.f34489l = j12;
            this.f34490m = oVar;
            this.f34491n = aVar;
            this.f34492o = aVar2;
            this.f34493p = aVar3;
            this.f34494q = aVar4;
            this.f34495r = f12;
            this.f34496s = j13;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            float f12;
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            androidx.compose.ui.graphics.drawscope.o oVar = this.f34490m;
            Ac.b(gVar2, 0.0f, 360.0f, this.f34489l, oVar);
            float fFloatValue = (((Number) this.f34491n.getF42167b()).floatValue() * 216.0f) % 360.0f;
            float fFloatValue2 = ((Number) this.f34492o.getF42167b()).floatValue();
            C20281g0.a aVar = this.f34493p;
            float fAbs = Math.abs(fFloatValue2 - ((Number) aVar.getF42167b()).floatValue());
            float fFloatValue3 = ((Number) aVar.getF42167b()).floatValue() + ((Number) this.f34494q.getF42167b()).floatValue() + (fFloatValue - 90.0f);
            androidx.compose.ui.graphics.m1.f39698b.getClass();
            if (androidx.compose.ui.graphics.m1.b(oVar.f39501c, 0)) {
                f12 = 0.0f;
            } else {
                float f13 = Ac.f34483e / 2;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                f12 = ((this.f34495r / f13) * 57.29578f) / 2.0f;
            }
            Ac.b(gVar2, f12 + fFloatValue3, Math.max(fAbs, 0.1f), this.f34496s, oVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f34497l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f34498m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f34499n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f34500o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f34501p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f34502q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f34503r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.v vVar, long j12, float f12, long j13, int i12, int i13, int i14) {
            super(2);
            this.f34497l = vVar;
            this.f34498m = j12;
            this.f34499n = f12;
            this.f34500o = j13;
            this.f34501p = i12;
            this.f34502q = i13;
            this.f34503r = i14;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f34502q | 1);
            float f12 = this.f34499n;
            Ac.a(this.f34497l, this.f34498m, f12, this.f34500o, this.f34501p, a12, iA2, this.f34503r);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/n0$b;", "", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/n0$b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<C20302n0.b<Float>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f34504l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C20302n0.b<Float> bVar) {
            C20302n0.b<Float> bVar2 = bVar;
            bVar2.f26394a = 1332;
            bVar2.a(0, Float.valueOf(0.0f)).f26367b = Ac.f34488j;
            bVar2.a(666, Float.valueOf(290.0f));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/n0$b;", "", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/n0$b;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<C20302n0.b<Float>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f34505l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C20302n0.b<Float> bVar) {
            C20302n0.b<Float> bVar2 = bVar;
            bVar2.f26394a = 1332;
            bVar2.a(666, Float.valueOf(0.0f)).f26367b = Ac.f34488j;
            bVar2.a(bVar2.f26394a, Float.valueOf(290.0f));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/h0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/k0;Landroidx/compose/ui/layout/h0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.q<InterfaceC22369k0, InterfaceC22363h0, C22712b, InterfaceC22367j0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f34506l = new e();

        public e() {
            super(3);
        }

        @Override // Y41.q
        public final InterfaceC22367j0 invoke(InterfaceC22369k0 interfaceC22369k0, InterfaceC22363h0 interfaceC22363h0, C22712b c22712b) {
            InterfaceC22369k0 interfaceC22369k02 = interfaceC22369k0;
            long j12 = c22712b.f42843a;
            int iY02 = interfaceC22369k02.y0(Ac.f34479a);
            int i12 = iY02 * 2;
            androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22713c.i(0, i12, j12));
            return interfaceC22369k02.L0(k0I.f40345b, k0I.f40346c - i12, kotlin.collections.P0.c(), new Gc(k0I, iY02));
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f34507l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            return kotlin.G0.f406611a;
        }
    }

    static {
        float f12 = 10;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f34479a = f12;
        f34480b = androidx.compose.foundation.layout.R1.k(0.0f, f12, 1, androidx.compose.ui.semantics.r.b(androidx.compose.ui.layout.P.a(androidx.compose.ui.v.f42878y1, e.f34506l), true, f.f34507l));
        f34481c = 240;
        d0.D.f393163a.getClass();
        f34482d = d0.D.f393164b;
        C39456e.f393380a.getClass();
        f34483e = C39456e.f393382c - (C39456e.f393381b * 2);
        f34484f = new androidx.compose.animation.core.F(0.2f, 0.0f, 0.8f, 1.0f);
        f34485g = new androidx.compose.animation.core.F(0.4f, 0.0f, 1.0f, 1.0f);
        f34486h = new androidx.compose.animation.core.F(0.0f, 0.0f, 0.65f, 1.0f);
        f34487i = new androidx.compose.animation.core.F(0.1f, 0.0f, 0.45f, 1.0f);
        f34488j = new androidx.compose.animation.core.F(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l androidx.compose.ui.v r26, long r27, float r29, long r30, int r32, @Y61.l androidx.compose.runtime.A r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Ac.a(androidx.compose.ui.v, long, float, long, int, androidx.compose.runtime.A, int, int):void");
    }

    public static final void b(androidx.compose.ui.graphics.drawscope.g gVar, float f12, float f13, long j12, androidx.compose.ui.graphics.drawscope.o oVar) {
        float f14 = 2;
        float f15 = oVar.f39499a / f14;
        float fE2 = l0.n.e(gVar.i()) - (f14 * f15);
        androidx.compose.ui.graphics.drawscope.g.t1(gVar, j12, f12, f13, l0.h.a(f15, f15), l0.o.a(fE2, fE2), 0.0f, oVar, 832);
    }

    public static final void c(androidx.compose.ui.graphics.drawscope.g gVar, float f12, float f13, long j12, float f14, int i12) {
        float fE2 = l0.n.e(gVar.i());
        float fC2 = l0.n.c(gVar.i());
        float f15 = 2;
        float f16 = fC2 / f15;
        boolean z12 = gVar.getLayoutDirection() == LayoutDirection.f42838b;
        float f17 = (z12 ? f12 : 1.0f - f13) * fE2;
        float f18 = (z12 ? f13 : 1.0f - f12) * fE2;
        androidx.compose.ui.graphics.m1.f39698b.getClass();
        if (androidx.compose.ui.graphics.m1.b(i12, 0) || fC2 > fE2) {
            androidx.compose.ui.graphics.drawscope.g.G0(gVar, j12, l0.h.a(f17, f16), l0.h.a(f18, f16), f14, 0, null, 0, 496);
            return;
        }
        float f19 = f14 / f15;
        kotlin.ranges.f fVarM = kotlin.ranges.s.m(f19, fE2 - f19);
        float fFloatValue = ((Number) kotlin.ranges.s.j(Float.valueOf(f17), fVarM)).floatValue();
        float fFloatValue2 = ((Number) kotlin.ranges.s.j(Float.valueOf(f18), fVarM)).floatValue();
        if (Math.abs(f13 - f12) > 0.0f) {
            androidx.compose.ui.graphics.drawscope.g.G0(gVar, j12, l0.h.a(fFloatValue, f16), l0.h.a(fFloatValue2, f16), f14, i12, null, 0, 480);
        }
    }
}
