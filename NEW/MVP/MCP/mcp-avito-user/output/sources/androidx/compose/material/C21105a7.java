package androidx.compose.material;

import androidx.compose.animation.core.C20281g0;
import androidx.compose.animation.core.C20302n0;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: ProgressIndicator.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005¨\u0006\n²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "startAngle", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21105a7 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f33408a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f33409b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f33410c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f33411d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f33412e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f33413f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f33414g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.F f33415h;

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.a7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f33416l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.drawscope.o f33417m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f33418n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f33419o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C20281g0.a f33420p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C20281g0.a f33421q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20281g0.a f33422r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C20281g0.a f33423s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, long j12, long j13, C20281g0.a aVar, C20281g0.a aVar2, C20281g0.a aVar3, C20281g0.a aVar4, androidx.compose.ui.graphics.drawscope.o oVar) {
            super(1);
            this.f33416l = j12;
            this.f33417m = oVar;
            this.f33418n = f12;
            this.f33419o = j13;
            this.f33420p = aVar;
            this.f33421q = aVar2;
            this.f33422r = aVar3;
            this.f33423s = aVar4;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            float f12;
            androidx.compose.ui.graphics.drawscope.g gVar2 = gVar;
            androidx.compose.ui.graphics.drawscope.o oVar = this.f33417m;
            C21105a7.c(gVar2, 0.0f, 360.0f, this.f33416l, oVar);
            float fFloatValue = ((Number) this.f33421q.getF42167b()).floatValue();
            C20281g0.a aVar = this.f33422r;
            float fAbs = Math.abs(fFloatValue - ((Number) aVar.getF42167b()).floatValue());
            float fFloatValue2 = ((Number) aVar.getF42167b()).floatValue() + ((Number) this.f33423s.getF42167b()).floatValue() + (((((Number) this.f33420p.getF42167b()).intValue() * 216.0f) % 360.0f) - 90.0f);
            androidx.compose.ui.graphics.m1.f39698b.getClass();
            if (androidx.compose.ui.graphics.m1.b(oVar.f39501c, 0)) {
                f12 = 0.0f;
            } else {
                float f13 = C21105a7.f33410c / 2;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                f12 = ((this.f33418n / f13) * 57.29578f) / 2.0f;
            }
            C21105a7.c(gVar2, f12 + fFloatValue2, Math.max(fAbs, 0.1f), this.f33419o, oVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.a7$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f33424l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f33425m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ float f33426n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f33427o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f33428p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f33429q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f33430r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.v vVar, long j12, float f12, long j13, int i12, int i13, int i14) {
            super(2);
            this.f33424l = vVar;
            this.f33425m = j12;
            this.f33426n = f12;
            this.f33427o = j13;
            this.f33428p = i12;
            this.f33429q = i13;
            this.f33430r = i14;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f33429q | 1);
            float f12 = this.f33426n;
            C21105a7.a(this.f33424l, this.f33425m, f12, this.f33427o, this.f33428p, a12, iA2, this.f33430r);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/n0$b;", "", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/n0$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.a7$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<C20302n0.b<Float>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f33431l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C20302n0.b<Float> bVar) {
            C20302n0.b<Float> bVar2 = bVar;
            bVar2.f26394a = 1332;
            bVar2.a(0, Float.valueOf(0.0f)).f26367b = C21105a7.f33415h;
            bVar2.a(666, Float.valueOf(290.0f));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ProgressIndicator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/core/n0$b;", "", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/n0$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.material.a7$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<C20302n0.b<Float>, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f33432l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C20302n0.b<Float> bVar) {
            C20302n0.b<Float> bVar2 = bVar;
            bVar2.f26394a = 1332;
            bVar2.a(666, Float.valueOf(0.0f)).f26367b = C21105a7.f33415h;
            bVar2.a(bVar2.f26394a, Float.valueOf(290.0f));
            return kotlin.G0.f406611a;
        }
    }

    static {
        X6.f33350a.getClass();
        f33408a = X6.f33351b;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f33409b = 240;
        f33410c = 40;
        f33411d = new androidx.compose.animation.core.F(0.2f, 0.0f, 0.8f, 1.0f);
        f33412e = new androidx.compose.animation.core.F(0.4f, 0.0f, 1.0f, 1.0f);
        f33413f = new androidx.compose.animation.core.F(0.0f, 0.0f, 0.65f, 1.0f);
        f33414g = new androidx.compose.animation.core.F(0.1f, 0.0f, 0.45f, 1.0f);
        f33415h = new androidx.compose.animation.core.F(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.l androidx.compose.ui.v r27, long r28, float r30, long r31, int r33, @Y61.l androidx.compose.runtime.A r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C21105a7.a(androidx.compose.ui.v, long, float, long, int, androidx.compose.runtime.A, int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 ??, still in use, count: 1, list:
          (r0v8 ?? I:java.lang.Object) from 0x0133: INVOKE (r1v5 ?? I:androidx.compose.runtime.B), (r0v8 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:308)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    public static final void b(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v8 ??, still in use, count: 1, list:
          (r0v8 ?? I:java.lang.Object) from 0x0133: INVOKE (r1v5 ?? I:androidx.compose.runtime.B), (r0v8 ?? I:java.lang.Object) VIRTUAL call: androidx.compose.runtime.B.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:308)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public static final void c(androidx.compose.ui.graphics.drawscope.g gVar, float f12, float f13, long j12, androidx.compose.ui.graphics.drawscope.o oVar) {
        float f14 = 2;
        float f15 = oVar.f39499a / f14;
        float fE2 = l0.n.e(gVar.i()) - (f14 * f15);
        androidx.compose.ui.graphics.drawscope.g.t1(gVar, j12, f12, f13, l0.h.a(f15, f15), l0.o.a(fE2, fE2), 0.0f, oVar, 832);
    }

    public static final void d(androidx.compose.ui.graphics.drawscope.g gVar, float f12, float f13, long j12, float f14, int i12) {
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
