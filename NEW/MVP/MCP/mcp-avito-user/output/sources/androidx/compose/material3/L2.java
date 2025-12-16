package androidx.compose.material3;

import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: Checkbox.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f35025a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f35026b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f35027c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f35028d;

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f35029l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f35030m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f35031n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C20288i1.d f35032o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C20288i1.d f35033p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ G2 f35034q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.runtime.I3 i32, androidx.compose.runtime.I3 i33, androidx.compose.runtime.I3 i34, C20288i1.d dVar, C20288i1.d dVar2, G2 g22) {
            super(1);
            this.f35029l = i32;
            this.f35030m = i33;
            this.f35031n = i34;
            this.f35032o = dVar;
            this.f35033p = dVar2;
            this.f35034q = g22;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            float fFloor = (float) Math.floor(gVar2.M0(L2.f35027c));
            long j12 = this.f35029l.getF42167b().f39331a;
            long j13 = this.f35030m.getF42167b().f39331a;
            float fM02 = gVar2.M0(L2.f35028d);
            float f12 = fFloor / 2.0f;
            androidx.compose.ui.graphics.drawscope.o oVar = new androidx.compose.ui.graphics.drawscope.o(fFloor, 0.0f, 0, 0, null, 30, null);
            float fE2 = l0.n.e(gVar2.i());
            if (androidx.compose.ui.graphics.T.d(j12, j13)) {
                androidx.compose.ui.graphics.drawscope.g.d1(gVar2, j12, 0L, l0.o.a(fE2, fE2), l0.b.a(fM02), androidx.compose.ui.graphics.drawscope.n.f39497a, 0.0f, 226);
            } else {
                float f13 = fE2 - (2 * fFloor);
                androidx.compose.ui.graphics.drawscope.g.d1(gVar2, j12, l0.h.a(fFloor, fFloor), l0.o.a(f13, f13), l0.b.a(Math.max(0.0f, fM02 - fFloor)), androidx.compose.ui.graphics.drawscope.n.f39497a, 0.0f, 224);
                long jA2 = l0.h.a(f12, f12);
                float f14 = fE2 - fFloor;
                androidx.compose.ui.graphics.drawscope.g.d1(gVar2, j13, jA2, l0.o.a(f14, f14), l0.b.a(fM02 - f12), oVar, 0.0f, 224);
            }
            long j14 = this.f35031n.getF42167b().f39331a;
            float fFloatValue = ((Number) this.f35032o.getF42167b()).floatValue();
            float fFloatValue2 = ((Number) this.f35033p.getF42167b()).floatValue();
            androidx.compose.ui.graphics.m1.f39698b.getClass();
            androidx.compose.ui.graphics.drawscope.o oVar2 = new androidx.compose.ui.graphics.drawscope.o(fFloor, 0.0f, androidx.compose.ui.graphics.m1.f39700d, 0, null, 26, null);
            float fE3 = l0.n.e(gVar2.i());
            float fB2 = E0.e.b(0.4f, 0.5f, fFloatValue2);
            float fB3 = E0.e.b(0.7f, 0.5f, fFloatValue2);
            float fB4 = E0.e.b(0.5f, 0.5f, fFloatValue2);
            float fB5 = E0.e.b(0.3f, 0.5f, fFloatValue2);
            G2 g22 = this.f35034q;
            g22.f34769a.reset();
            Path path = g22.f34769a;
            path.i(0.2f * fE3, fB4 * fE3);
            path.r(fB2 * fE3, fB3 * fE3);
            path.r(0.8f * fE3, fE3 * fB5);
            androidx.compose.ui.graphics.O0 o02 = g22.f34770b;
            o02.b(path);
            Path path2 = g22.f34771c;
            path2.reset();
            o02.a(0.0f, o02.getLength() * fFloatValue, path2);
            androidx.compose.ui.graphics.drawscope.g.n0(gVar2, g22.f34771c, j14, 0.0f, oVar2, 52);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f35035l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ToggleableState f35036m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f35037n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ H2 f35038o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f35039p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, ToggleableState toggleableState, androidx.compose.ui.v vVar, H2 h22, int i12) {
            super(2);
            this.f35035l = z12;
            this.f35036m = toggleableState;
            this.f35037n = vVar;
            this.f35038o = h22;
            this.f35039p = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f35039p | 1);
            androidx.compose.ui.v vVar = this.f35037n;
            H2 h22 = this.f35038o;
            L2.a(this.f35035l, this.f35036m, vVar, h22, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/i1$b;", "Landroidx/compose/ui/state/ToggleableState;", "Landroidx/compose/animation/core/V;", "", "invoke", "(Landroidx/compose/animation/core/i1$b;Landroidx/compose/runtime/A;I)Landroidx/compose/animation/core/V;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<C20288i1.b<ToggleableState>, androidx.compose.runtime.A, Integer, androidx.compose.animation.core.V<Float>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f35040l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final androidx.compose.animation.core.V<Float> invoke(C20288i1.b<ToggleableState> bVar, androidx.compose.runtime.A a12, Integer num) {
            C20288i1.b<ToggleableState> bVar2 = bVar;
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.I(-1324481169);
            ToggleableState toggleableStateA = bVar2.a();
            ToggleableState toggleableState = ToggleableState.f41897c;
            androidx.compose.animation.core.V<Float> vC2 = toggleableStateA == toggleableState ? C20310q.c() : bVar2.d() == toggleableState ? new androidx.compose.animation.core.M0<>(100) : C20310q.e(100, 0, null, 6);
            a13.O();
            return vC2;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/i1$b;", "Landroidx/compose/ui/state/ToggleableState;", "Landroidx/compose/animation/core/V;", "", "invoke", "(Landroidx/compose/animation/core/i1$b;Landroidx/compose/runtime/A;I)Landroidx/compose/animation/core/V;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<C20288i1.b<ToggleableState>, androidx.compose.runtime.A, Integer, androidx.compose.animation.core.V<Float>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f35041l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final androidx.compose.animation.core.V<Float> invoke(C20288i1.b<ToggleableState> bVar, androidx.compose.runtime.A a12, Integer num) {
            C20288i1.b<ToggleableState> bVar2 = bVar;
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.I(1373301606);
            ToggleableState toggleableStateA = bVar2.a();
            ToggleableState toggleableState = ToggleableState.f41897c;
            androidx.compose.animation.core.V<Float> vE2 = toggleableStateA == toggleableState ? C20310q.e(100, 0, null, 6) : bVar2.d() == toggleableState ? new androidx.compose.animation.core.M0<>(100) : C20310q.d(0.0f, 7, null);
            a13.O();
            return vE2;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class e {
        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleableState toggleableState = ToggleableState.f41896b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToggleableState toggleableState2 = ToggleableState.f41896b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        float f12 = 2;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f35025a = f12;
        f35026b = 20;
        f35027c = f12;
        f35028d = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0209  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r34, androidx.compose.ui.state.ToggleableState r35, androidx.compose.ui.v r36, androidx.compose.material3.H2 r37, androidx.compose.runtime.A r38, int r39) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.L2.a(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.v, androidx.compose.material3.H2, androidx.compose.runtime.A, int):void");
    }
}
