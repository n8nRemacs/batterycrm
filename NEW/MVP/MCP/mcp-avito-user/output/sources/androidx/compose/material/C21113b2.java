package androidx.compose.material;

import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: Checkbox.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\u0007²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"", "checkDrawFraction", "checkCenterGravitationShiftFraction", "Landroidx/compose/ui/graphics/T;", "checkColor", "boxColor", "borderColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.b2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21113b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33446a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f33447b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f33448c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f33449d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f33450e;

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.b2$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ W1 f33451l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f33452m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f33453n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> f33454o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C20288i1.d f33455p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C20288i1.d f33456q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W1 w12, androidx.compose.runtime.I3 i32, androidx.compose.runtime.I3 i33, androidx.compose.runtime.I3 i34, C20288i1.d dVar, C20288i1.d dVar2) {
            super(1);
            this.f33451l = w12;
            this.f33452m = i32;
            this.f33453n = i33;
            this.f33454o = i34;
            this.f33455p = dVar;
            this.f33456q = dVar2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            float fFloor = (float) Math.floor(gVar2.M0(C21113b2.f33449d));
            long j12 = this.f33452m.getF42167b().f39331a;
            long j13 = this.f33453n.getF42167b().f39331a;
            float fM02 = gVar2.M0(C21113b2.f33450e);
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
            long j14 = this.f33454o.getF42167b().f39331a;
            float fFloatValue = ((Number) this.f33455p.getF42167b()).floatValue();
            float fFloatValue2 = ((Number) this.f33456q.getF42167b()).floatValue();
            androidx.compose.ui.graphics.m1.f39698b.getClass();
            androidx.compose.ui.graphics.drawscope.o oVar2 = new androidx.compose.ui.graphics.drawscope.o(fFloor, 0.0f, androidx.compose.ui.graphics.m1.f39700d, 0, null, 26, null);
            float fE3 = l0.n.e(gVar2.i());
            float fB2 = E0.e.b(0.4f, 0.5f, fFloatValue2);
            float fB3 = E0.e.b(0.7f, 0.5f, fFloatValue2);
            float fB4 = E0.e.b(0.5f, 0.5f, fFloatValue2);
            float fB5 = E0.e.b(0.3f, 0.5f, fFloatValue2);
            W1 w12 = this.f33451l;
            w12.f33291a.reset();
            Path path = w12.f33291a;
            path.i(0.2f * fE3, fB4 * fE3);
            path.r(fB2 * fE3, fB3 * fE3);
            path.r(0.8f * fE3, fE3 * fB5);
            androidx.compose.ui.graphics.O0 o02 = w12.f33292b;
            o02.b(path);
            Path path2 = w12.f33293c;
            path2.reset();
            o02.a(0.0f, o02.getLength() * fFloatValue, path2);
            androidx.compose.ui.graphics.drawscope.g.n0(gVar2, w12.f33293c, j14, 0.0f, oVar2, 52);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.b2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f33457l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ToggleableState f33458m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f33459n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ X1 f33460o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f33461p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, ToggleableState toggleableState, androidx.compose.ui.v vVar, X1 x12, int i12) {
            super(2);
            this.f33457l = z12;
            this.f33458m = toggleableState;
            this.f33459n = vVar;
            this.f33460o = x12;
            this.f33461p = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f33461p | 1);
            androidx.compose.ui.v vVar = this.f33459n;
            X1 x12 = this.f33460o;
            C21113b2.a(this.f33457l, this.f33458m, vVar, x12, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/i1$b;", "Landroidx/compose/ui/state/ToggleableState;", "Landroidx/compose/animation/core/V;", "", "invoke", "(Landroidx/compose/animation/core/i1$b;Landroidx/compose/runtime/A;I)Landroidx/compose/animation/core/V;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.b2$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.q<C20288i1.b<ToggleableState>, androidx.compose.runtime.A, Integer, androidx.compose.animation.core.V<Float>> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f33462l = new c();

        public c() {
            super(3);
        }

        @Override // Y41.q
        public final androidx.compose.animation.core.V<Float> invoke(C20288i1.b<ToggleableState> bVar, androidx.compose.runtime.A a12, Integer num) {
            C20288i1.b<ToggleableState> bVar2 = bVar;
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.C(1075283605);
            ToggleableState toggleableStateA = bVar2.a();
            ToggleableState toggleableState = ToggleableState.f41897c;
            androidx.compose.animation.core.V<Float> vC2 = toggleableStateA == toggleableState ? C20310q.c() : bVar2.d() == toggleableState ? new androidx.compose.animation.core.M0<>(100) : C20310q.e(100, 0, null, 6);
            a13.h();
            return vC2;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/i1$b;", "Landroidx/compose/ui/state/ToggleableState;", "Landroidx/compose/animation/core/V;", "", "invoke", "(Landroidx/compose/animation/core/i1$b;Landroidx/compose/runtime/A;I)Landroidx/compose/animation/core/V;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.b2$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.q<C20288i1.b<ToggleableState>, androidx.compose.runtime.A, Integer, androidx.compose.animation.core.V<Float>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f33463l = new d();

        public d() {
            super(3);
        }

        @Override // Y41.q
        public final androidx.compose.animation.core.V<Float> invoke(C20288i1.b<ToggleableState> bVar, androidx.compose.runtime.A a12, Integer num) {
            C20288i1.b<ToggleableState> bVar2 = bVar;
            androidx.compose.runtime.A a13 = a12;
            num.intValue();
            a13.C(-1707702900);
            ToggleableState toggleableStateA = bVar2.a();
            ToggleableState toggleableState = ToggleableState.f41897c;
            androidx.compose.animation.core.V<Float> vE2 = toggleableStateA == toggleableState ? C20310q.e(100, 0, null, 6) : bVar2.d() == toggleableState ? new androidx.compose.animation.core.M0<>(100) : C20310q.d(0.0f, 7, null);
            a13.h();
            return vE2;
        }
    }

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.b2$e */
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
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f33446a = 24;
        float f12 = 2;
        f33447b = f12;
        f33448c = 20;
        f33449d = f12;
        f33450e = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b9  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r30, androidx.compose.ui.state.ToggleableState r31, androidx.compose.ui.v r32, androidx.compose.material.X1 r33, androidx.compose.runtime.A r34, int r35) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21113b2.a(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.v, androidx.compose.material.X1, androidx.compose.runtime.A, int):void");
    }
}
