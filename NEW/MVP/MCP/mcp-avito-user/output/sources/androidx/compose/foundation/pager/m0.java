package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.G1;
import androidx.compose.foundation.gestures.U1;
import androidx.compose.foundation.gestures.W1;
import androidx.compose.foundation.lazy.layout.C20712c0;
import androidx.compose.foundation.lazy.layout.C20713d;
import androidx.compose.foundation.lazy.layout.C20714d0;
import androidx.compose.foundation.lazy.layout.C20725j;
import androidx.compose.foundation.lazy.layout.E0;
import androidx.compose.foundation.lazy.layout.F0;
import androidx.compose.foundation.lazy.layout.K0;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.U2;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.layout.N0;
import androidx.compose.ui.layout.O0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.C22713c;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.InterfaceC42167x;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PagerState.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/m0;", "Landroidx/compose/foundation/gestures/U1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class m0 implements U1 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final b f29955A;

    /* renamed from: B, reason: collision with root package name */
    public long f29956B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final C20712c0 f29957C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<G0> f29958D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<G0> f29959E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29960F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29961G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Boolean> f29962H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Boolean> f29963I;

    /* renamed from: a, reason: collision with root package name */
    public boolean f29964a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Z f29965b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29966c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final c0 f29967d;

    /* renamed from: e, reason: collision with root package name */
    public int f29968e;

    /* renamed from: f, reason: collision with root package name */
    public int f29969f;

    /* renamed from: g, reason: collision with root package name */
    public long f29970g;

    /* renamed from: h, reason: collision with root package name */
    public long f29971h;

    /* renamed from: i, reason: collision with root package name */
    public float f29972i;

    /* renamed from: j, reason: collision with root package name */
    public float f29973j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final U1 f29974k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f29975l;

    /* renamed from: m, reason: collision with root package name */
    public int f29976m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public C20714d0.b f29977n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29978o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Z> f29979p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f29980q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.m f29981r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29982s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29983t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final I3 f29984u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final I3 f29985v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final C20714d0 f29986w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final C20725j f29987x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final C20713d f29988y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29989z;

    /* compiled from: PagerState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/E0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/layout/E0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<E0, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(E0 e02) {
            E0 e03 = e02;
            AbstractC22167l.a aVar = AbstractC22167l.f38720e;
            m0 m0Var = m0.this;
            aVar.getClass();
            AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
            Y41.l<Object, G0> lVarE = abstractC22167lA != null ? abstractC22167lA.getF38696h() : null;
            AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
            try {
                e03.a(m0Var.f29968e);
                G0 g02 = G0.f406611a;
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
                return G0.f406611a;
            } catch (Throwable th2) {
                AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
                throw th2;
            }
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/pager/m0$b", "Landroidx/compose/ui/layout/O0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements O0 {
        public b() {
        }

        @Override // androidx.compose.ui.layout.O0
        public final void X(LayoutNode layoutNode) {
            ((C22082i3) m0.this.f29989z).setValue(layoutNode);
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", i = {0, 0, 0, 1}, l = {636, 641}, m = "scroll$suspendImpl", n = {"$this", "scrollPriority", "block", "$this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public m0 f29992q;

        /* renamed from: r, reason: collision with root package name */
        public MutatePriority f29993r;

        /* renamed from: s, reason: collision with root package name */
        public Y41.p f29994s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f29995t;

        /* renamed from: v, reason: collision with root package name */
        public int f29997v;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f29995t = obj;
            this.f29997v |= BeduinInputModel.MIN_TEXT_VERSION;
            return m0.s(m0.this, null, null, this);
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            Z z12;
            float fFloatValue = f12.floatValue();
            m0 m0Var = m0.this;
            m0Var.getClass();
            long jA2 = d0.a(m0Var);
            float f13 = m0Var.f29972i + fFloatValue;
            long jC2 = kotlin.math.b.c(f13);
            m0Var.f29972i = f13 - jC2;
            if (Math.abs(fFloatValue) >= 1.0E-4f) {
                long j12 = jC2 + jA2;
                long jI2 = kotlin.ranges.s.i(j12, m0Var.f29971h, m0Var.f29970g);
                boolean z13 = j12 != jI2;
                long j13 = jI2 - jA2;
                float f14 = j13;
                m0Var.f29973j = f14;
                if (Math.abs(j13) != 0) {
                    ((C22082i3) m0Var.f29962H).setValue(Boolean.valueOf(f14 > 0.0f));
                    ((C22082i3) m0Var.f29963I).setValue(Boolean.valueOf(f14 < 0.0f));
                }
                int i12 = (int) j13;
                int i13 = -i12;
                Z zI2 = ((Z) ((C22082i3) m0Var.f29979p).getF42167b()).i(i13);
                if (zI2 != null && (z12 = m0Var.f29965b) != null) {
                    Z zI3 = z12.i(i13);
                    if (zI3 != null) {
                        m0Var.f29965b = zI3;
                    } else {
                        zI2 = null;
                    }
                }
                if (zI2 != null) {
                    m0Var.h(zI2, m0Var.f29964a, true);
                    F0.b(m0Var.f29958D);
                } else {
                    c0 c0Var = m0Var.f29967d;
                    float fO2 = c0Var.f29895a.o() != 0 ? i12 / r4.o() : 0.0f;
                    InterfaceC22192v1 interfaceC22192v1 = c0Var.f29897c;
                    ((C22040c3) interfaceC22192v1).S6(((C22040c3) interfaceC22192v1).f() + fO2);
                    N0 n02 = (N0) ((C22082i3) m0Var.f29989z).getF42167b();
                    if (n02 != null) {
                        n02.j();
                    }
                }
                fFloatValue = (z13 ? Long.valueOf(j13) : Float.valueOf(fFloatValue)).floatValue();
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            m0 m0Var = m0.this;
            return Integer.valueOf(m0Var.f29974k.a() ? ((C22061e3) m0Var.f29983t).e() : m0Var.j());
        }
    }

    /* compiled from: PagerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            int iE2;
            m0 m0Var = m0.this;
            if (m0Var.f29974k.a()) {
                InterfaceC22196w1 interfaceC22196w1 = m0Var.f29982s;
                iE2 = ((C22061e3) interfaceC22196w1).e() != -1 ? ((C22061e3) interfaceC22196w1).e() : Math.abs(m0Var.k()) >= Math.abs(Math.min(m0Var.f29980q.M0(p0.f30020a), ((float) m0Var.n()) / 2.0f) / ((float) m0Var.n())) ? ((Boolean) ((C22082i3) m0Var.f29962H).getF42167b()).booleanValue() ? m0Var.f29968e + 1 : m0Var.f29968e : m0Var.j();
            } else {
                iE2 = m0Var.j();
            }
            return Integer.valueOf(m0Var.i(iE2));
        }
    }

    public m0() {
        this(0, 0.0f, null, 7, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(androidx.compose.foundation.pager.m0 r5, androidx.compose.foundation.MutatePriority r6, Y41.p<? super androidx.compose.foundation.gestures.G1, ? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r7, kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.pager.m0.c
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.m0$c r0 = (androidx.compose.foundation.pager.m0.c) r0
            int r1 = r0.f29997v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29997v = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.m0$c r0 = new androidx.compose.foundation.pager.m0$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29995t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29997v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.foundation.pager.m0 r5 = r0.f29992q
            kotlin.C42729a0.b(r8)
            goto L85
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            Y41.p r5 = r0.f29994s
            r7 = r5
            Y41.p r7 = (Y41.p) r7
            androidx.compose.foundation.MutatePriority r6 = r0.f29993r
            androidx.compose.foundation.pager.m0 r5 = r0.f29992q
            kotlin.C42729a0.b(r8)
            goto L60
        L43:
            kotlin.C42729a0.b(r8)
            r0.f29992q = r5
            r0.f29993r = r6
            r0.f29994s = r7
            r0.f29997v = r4
            androidx.compose.foundation.lazy.layout.d r8 = r5.f29988y
            java.lang.Object r8 = r8.a(r0)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r2) goto L5b
            goto L5d
        L5b:
            kotlin.G0 r8 = kotlin.G0.f406611a
        L5d:
            if (r8 != r1) goto L60
            return r1
        L60:
            androidx.compose.foundation.gestures.U1 r8 = r5.f29974k
            boolean r8 = r8.a()
            if (r8 != 0) goto L73
            int r8 = r5.j()
            androidx.compose.runtime.w1 r2 = r5.f29983t
            androidx.compose.runtime.e3 r2 = (androidx.compose.runtime.C22061e3) r2
            r2.L3(r8)
        L73:
            androidx.compose.foundation.gestures.U1 r8 = r5.f29974k
            r0.f29992q = r5
            r2 = 0
            r0.f29993r = r2
            r0.f29994s = r2
            r0.f29997v = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L85
            return r1
        L85:
            androidx.compose.runtime.w1 r5 = r5.f29982s
            androidx.compose.runtime.e3 r5 = (androidx.compose.runtime.C22061e3) r5
            r6 = -1
            r5.L3(r6)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.m0.s(androidx.compose.foundation.pager.m0, androidx.compose.foundation.MutatePriority, Y41.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean a() {
        return this.f29974k.a();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean b() {
        return ((Boolean) ((C22082i3) this.f29960F).getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final float c(float f12) {
        return this.f29974k.c(f12);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean d() {
        return ((Boolean) ((C22082i3) this.f29961G).getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    @Y61.l
    public final Object e(@Y61.k MutatePriority mutatePriority, @Y61.k Y41.p<? super G1, ? super Continuation<? super G0>, ? extends Object> pVar, @Y61.k Continuation<? super G0> continuation) {
        return s(this, mutatePriority, pVar, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v8, types: [androidx.compose.animation.core.p] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, @Y61.k androidx.compose.animation.core.R0 r13, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.pager.k0
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.pager.k0 r0 = (androidx.compose.foundation.pager.k0) r0
            int r1 = r0.f29945v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29945v = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.k0 r0 = new androidx.compose.foundation.pager.k0
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f29943t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29945v
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            kotlin.C42729a0.b(r14)
            goto Lbf
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            int r12 = r0.f29942s
            androidx.compose.animation.core.p r13 = r0.f29941r
            androidx.compose.foundation.pager.m0 r2 = r0.f29940q
            kotlin.C42729a0.b(r14)
        L3f:
            r9 = r13
            goto L78
        L41:
            kotlin.C42729a0.b(r14)
            int r14 = r11.j()
            if (r12 != r14) goto L53
            float r14 = r11.k()
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 != 0) goto L53
            goto L59
        L53:
            int r14 = r11.m()
            if (r14 != 0) goto L5c
        L59:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        L5c:
            r0.f29940q = r11
            r0.f29941r = r13
            r0.f29942s = r12
            r0.f29945v = r5
            androidx.compose.foundation.lazy.layout.d r14 = r11.f29988y
            java.lang.Object r14 = r14.a(r0)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r14 != r2) goto L71
            goto L73
        L71:
            kotlin.G0 r14 = kotlin.G0.f406611a
        L73:
            if (r14 != r1) goto L76
            return r1
        L76:
            r2 = r11
            goto L3f
        L78:
            double r13 = (double) r3
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 > 0) goto L86
            r5 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 > 0) goto L86
            goto L9c
        L86:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "pageOffsetFraction "
            r13.<init>(r14)
            r13.append(r3)
            java.lang.String r14 = " is not within the range -0.5 to 0.5"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            androidx.compose.foundation.internal.e.a(r13)
        L9c:
            int r7 = r2.i(r12)
            int r12 = r2.o()
            float r12 = (float) r12
            float r8 = r3 * r12
            androidx.compose.foundation.pager.l0 r12 = new androidx.compose.foundation.pager.l0
            r10 = 0
            r5 = r12
            r6 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r13 = 0
            r0.f29940q = r13
            r0.f29941r = r13
            r0.f29945v = r4
            androidx.compose.foundation.MutatePriority r13 = androidx.compose.foundation.MutatePriority.f26797b
            java.lang.Object r12 = r2.e(r13, r12, r0)
            if (r12 != r1) goto Lbf
            return r1
        Lbf:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.m0.f(int, androidx.compose.animation.core.R0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0133 A[Catch: all -> 0x013f, TryCatch #0 {all -> 0x013f, blocks: (B:55:0x00de, B:57:0x00f1, B:59:0x00f5, B:61:0x0103, B:69:0x0139, B:67:0x0133, B:64:0x011b, B:72:0x0141), top: B:82:0x00de }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(@Y61.k androidx.compose.foundation.pager.Z r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.m0.h(androidx.compose.foundation.pager.Z, boolean, boolean):void");
    }

    public final int i(int i12) {
        if (m() > 0) {
            return kotlin.ranges.s.g(i12, 0, m() - 1);
        }
        return 0;
    }

    public final int j() {
        return ((C22061e3) this.f29967d.f29896b).e();
    }

    public final float k() {
        return ((C22040c3) this.f29967d.f29897c).f();
    }

    @Y61.k
    public final K l() {
        return (K) ((C22082i3) this.f29979p).getF42167b();
    }

    public abstract int m();

    public final int n() {
        return ((Z) ((C22082i3) this.f29979p).getF42167b()).f29867b;
    }

    public final int o() {
        return ((Z) ((C22082i3) this.f29979p).getF42167b()).f29868c + n();
    }

    public final long p() {
        return ((l0.g) ((C22082i3) this.f29966c).getF42167b()).f413387a;
    }

    public final boolean q() {
        return ((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0;
    }

    public final void r(float f12, Z z12) {
        C20714d0.b bVar;
        C20714d0.b bVar2;
        C20714d0.b bVar3;
        if (this.f29975l) {
            List<C20820n> list = z12.f29866a;
            if (list.isEmpty()) {
                return;
            }
            boolean z13 = f12 > 0.0f;
            int index = z13 ? z12.f29874i + ((InterfaceC20822p) C42745f0.Q(list)).getF30001a() + 1 : (((InterfaceC20822p) C42745f0.E(list)).getF30001a() - r3) - 1;
            if (index < 0 || index >= m()) {
                return;
            }
            if (index != this.f29976m) {
                if (this.f29978o != z13 && (bVar3 = this.f29977n) != null) {
                    bVar3.cancel();
                }
                this.f29978o = z13;
                this.f29976m = index;
                this.f29977n = this.f29986w.a(index, this.f29956B);
            }
            if (z13) {
                if ((((InterfaceC20822p) C42745f0.Q(list)).getF30013m() + (z12.f29868c + z12.f29867b)) - z12.f29872g >= f12 || (bVar2 = this.f29977n) == null) {
                    return;
                }
                bVar2.b();
                return;
            }
            if (z12.f29871f - ((InterfaceC20822p) C42745f0.E(list)).getF30013m() >= (-f12) || (bVar = this.f29977n) == null) {
                return;
            }
            bVar.b();
        }
    }

    public final void t(int i12, float f12, boolean z12) {
        c0 c0Var = this.f29967d;
        ((C22061e3) c0Var.f29896b).L3(i12);
        c0Var.f29900f.a(i12);
        ((C22040c3) c0Var.f29897c).S6(f12);
        c0Var.f29899e = null;
        if (!z12) {
            F0.b(this.f29959E);
            return;
        }
        N0 n02 = (N0) ((C22082i3) this.f29989z).getF42167b();
        if (n02 != null) {
            n02.j();
        }
    }

    public m0(int i12, @InterfaceC42167x float f12, @Y61.l K0 k02) {
        double d12 = f12;
        if (-0.5d > d12 || d12 > 0.5d) {
            androidx.compose.foundation.internal.e.a("currentPageOffsetFraction " + f12 + " is not within the range -0.5 to 0.5");
        }
        l0.g.f413384b.getClass();
        this.f29966c = C22126m3.g(l0.g.a(0L));
        this.f29967d = new c0(i12, f12, this);
        this.f29968e = i12;
        this.f29970g = Long.MAX_VALUE;
        this.f29974k = W1.a(new d());
        this.f29975l = true;
        this.f29976m = -1;
        this.f29979p = C22126m3.f(p0.f30021b, C22126m3.h());
        this.f29980q = p0.f30022c;
        this.f29981r = androidx.compose.foundation.interaction.l.a();
        this.f29982s = U2.a(-1);
        this.f29983t = U2.a(i12);
        this.f29984u = C22126m3.e(new e(), C22126m3.o());
        this.f29985v = C22126m3.e(new f(), C22126m3.o());
        this.f29986w = new C20714d0(k02, new a());
        this.f29987x = new C20725j();
        this.f29988y = new C20713d();
        this.f29989z = C22126m3.g(null);
        this.f29955A = new b();
        this.f29956B = C22713c.b(0, 0, 15);
        this.f29957C = new C20712c0();
        this.f29958D = F0.a();
        this.f29959E = F0.a();
        Boolean bool = Boolean.FALSE;
        this.f29960F = C22126m3.g(bool);
        this.f29961G = C22126m3.g(bool);
        this.f29962H = C22126m3.g(bool);
        this.f29963I = C22126m3.g(bool);
    }

    public /* synthetic */ m0(int i12, float f12, K0 k02, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? 0.0f : f12, (i13 & 4) != 0 ? null : k02);
    }

    public m0(int i12, float f12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? 0.0f : f12, null);
    }
}
