package androidx.compose.foundation;

import android.view.View;
import androidx.compose.foundation.R1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22423m;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.InterfaceC22442w;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: Magnifier.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u009b\u0001\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/x1;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/w;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/node/T0;", "Landroidx/compose/ui/node/D0;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/d;", "Ll0/g;", "Lkotlin/w;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/l;", "Lkotlin/G0;", "onSizeChanged", "", "zoom", "", "useTextDefault", "size", "Landroidx/compose/ui/unit/h;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/R1;", "platformMagnifierFactory", "<init>", "(LY41/l;LY41/l;LY41/l;FZJFFZLandroidx/compose/foundation/R1;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.x1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21090x1 extends v.d implements InterfaceC22442w, InterfaceC22438u, androidx.compose.ui.node.T0, androidx.compose.ui.node.D0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.d f32298A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public Q1 f32299B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f32300C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public I3<l0.g> f32301D;

    /* renamed from: E, reason: collision with root package name */
    public long f32302E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.u f32303F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public C43108m f32304G;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super androidx.compose.ui.unit.d, l0.g> f32305p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super androidx.compose.ui.unit.d, l0.g> f32306q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super androidx.compose.ui.unit.l, kotlin.G0> f32307r;

    /* renamed from: s, reason: collision with root package name */
    public float f32308s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f32309t;

    /* renamed from: u, reason: collision with root package name */
    public long f32310u;

    /* renamed from: v, reason: collision with root package name */
    public float f32311v;

    /* renamed from: w, reason: collision with root package name */
    public float f32312w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f32313x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public R1 f32314y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public View f32315z;

    /* compiled from: Magnifier.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "invoke-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.x1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<l0.g> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final l0.g invoke() {
            long jE2;
            androidx.compose.ui.layout.A a12 = (androidx.compose.ui.layout.A) ((C22082i3) C21090x1.this.f32300C).getF42167b();
            if (a12 != null) {
                jE2 = androidx.compose.ui.layout.B.e(a12);
            } else {
                l0.g.f413384b.getClass();
                jE2 = l0.g.f413386d;
            }
            return l0.g.a(jE2);
        }
    }

    /* compiled from: Magnifier.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "invoke-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.x1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<l0.g> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final l0.g invoke() {
            return l0.g.a(C21090x1.this.f32302E);
        }
    }

    /* compiled from: Magnifier.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", i = {}, l = {382, 386}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.x1$c */
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f32318q;

        /* compiled from: Magnifier.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.x1$c$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f32320l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Long l12) {
                l12.longValue();
                return kotlin.G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C21090x1.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:11:0x0023). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0049 -> B:21:0x004c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f32318q
                r2 = 2
                r3 = 1
                androidx.compose.foundation.x1 r4 = androidx.compose.foundation.C21090x1.this
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.C42729a0.b(r7)
                goto L4c
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                kotlin.C42729a0.b(r7)
                goto L30
            L20:
                kotlin.C42729a0.b(r7)
            L23:
                kotlinx.coroutines.channels.m r7 = r4.f32304G
                if (r7 == 0) goto L30
                r6.f32318q = r3
                java.lang.Object r7 = r7.M(r6)
                if (r7 != r0) goto L30
                return r0
            L30:
                androidx.compose.foundation.Q1 r7 = r4.f32299B
                if (r7 == 0) goto L23
                androidx.compose.foundation.x1$c$a r7 = androidx.compose.foundation.C21090x1.c.a.f32320l
                r6.f32318q = r2
                kotlin.coroutines.CoroutineContext r1 = r6.getF411447c()
                androidx.compose.runtime.V0 r1 = androidx.compose.runtime.X0.a(r1)
                androidx.compose.runtime.W0 r5 = new androidx.compose.runtime.W0
                r5.<init>(r7)
                java.lang.Object r7 = r1.N(r5, r6)
                if (r7 != r0) goto L4c
                return r0
            L4c:
                androidx.compose.foundation.Q1 r7 = r4.f32299B
                if (r7 == 0) goto L23
                r7.c()
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C21090x1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Magnifier.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.x1$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C21090x1.this.m2();
            return kotlin.G0.f406611a;
        }
    }

    public C21090x1() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21090x1(Y41.l lVar, Y41.l lVar2, Y41.l lVar3, float f12, boolean z12, long j12, float f13, float f14, boolean z13, R1 r12, int i12, C42822w c42822w) {
        long j13;
        float f15;
        float f16;
        R1 r1A;
        Y41.l lVar4 = (i12 & 2) != 0 ? null : lVar2;
        Y41.l lVar5 = (i12 & 4) != 0 ? null : lVar3;
        float f17 = (i12 & 8) != 0 ? Float.NaN : f12;
        boolean z14 = (i12 & 16) != 0 ? false : z12;
        if ((i12 & 32) != 0) {
            androidx.compose.ui.unit.l.f42859b.getClass();
            j13 = androidx.compose.ui.unit.l.f42860c;
        } else {
            j13 = j12;
        }
        if ((i12 & 64) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f15 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f15 = f13;
        }
        if ((i12 & 128) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f16 = androidx.compose.ui.unit.h.f42851e;
        } else {
            f16 = f14;
        }
        boolean z15 = (i12 & 256) != 0 ? true : z13;
        if ((i12 & 512) != 0) {
            R1.f26834a.getClass();
            r1A = R1.a.a();
        } else {
            r1A = r12;
        }
        this(lVar, lVar4, lVar5, f17, z14, j13, f15, f16, z15, r1A, null);
    }

    @Override // androidx.compose.ui.node.D0
    public final void K1() {
        androidx.compose.ui.node.E0.a(this, new d());
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k androidx.compose.ui.semantics.F f12) {
        f12.a(C21093y1.f32323a, new b());
    }

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        ((C22082i3) this.f32300C).setValue(abstractC22443w0);
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        K1();
        this.f32304G = kotlinx.coroutines.channels.A.a(0, null, null, 7);
        C43259k.d(Y1(), null, CoroutineStart.f410683e, new c(null), 1);
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        Q1 q12 = this.f32299B;
        if (q12 != null) {
            q12.dismiss();
        }
        this.f32299B = null;
    }

    public final long k2() {
        if (this.f32301D == null) {
            this.f32301D = C22126m3.d(new a());
        }
        I3<l0.g> i32 = this.f32301D;
        if (i32 != null) {
            return i32.getF42167b().f413387a;
        }
        l0.g.f413384b.getClass();
        return l0.g.f413386d;
    }

    public final void l2() {
        Q1 q12 = this.f32299B;
        if (q12 != null) {
            q12.dismiss();
        }
        View viewA = this.f32315z;
        if (viewA == null) {
            viewA = C22423m.a(this);
        }
        View view = viewA;
        this.f32315z = view;
        androidx.compose.ui.unit.d dVar = this.f32298A;
        if (dVar == null) {
            dVar = C22421l.g(this).f40608B;
        }
        androidx.compose.ui.unit.d dVar2 = dVar;
        this.f32298A = dVar2;
        this.f32299B = this.f32314y.b(view, this.f32309t, this.f32310u, this.f32311v, this.f32312w, this.f32313x, dVar2, this.f32308s);
        n2();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2() {
        /*
            r9 = this;
            androidx.compose.ui.unit.d r0 = r9.f32298A
            if (r0 != 0) goto Lc
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.C22421l.g(r9)
            androidx.compose.ui.unit.d r0 = r0.f40608B
            r9.f32298A = r0
        Lc:
            Y41.l<? super androidx.compose.ui.unit.d, l0.g> r1 = r9.f32305p
            java.lang.Object r1 = r1.invoke(r0)
            l0.g r1 = (l0.g) r1
            long r1 = r1.f413387a
            r3 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r1 & r3
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L7e
            long r5 = r9.k2()
            long r5 = r5 & r3
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L7e
            long r5 = r9.k2()
            long r1 = l0.g.j(r5, r1)
            r9.f32302E = r1
            Y41.l<? super androidx.compose.ui.unit.d, l0.g> r1 = r9.f32306q
            if (r1 == 0) goto L60
            java.lang.Object r0 = r1.invoke(r0)
            l0.g r0 = (l0.g) r0
            long r0 = r0.f413387a
            l0.g r0 = l0.g.a(r0)
            long r1 = r0.f413387a
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L51
            goto L52
        L51:
            r0 = 0
        L52:
            if (r0 == 0) goto L60
            long r1 = r9.k2()
            long r3 = r0.f413387a
            long r0 = l0.g.j(r1, r3)
        L5e:
            r5 = r0
            goto L68
        L60:
            l0.g$a r0 = l0.g.f413384b
            r0.getClass()
            long r0 = l0.g.f413386d
            goto L5e
        L68:
            androidx.compose.foundation.Q1 r0 = r9.f32299B
            if (r0 != 0) goto L6f
            r9.l2()
        L6f:
            androidx.compose.foundation.Q1 r2 = r9.f32299B
            if (r2 == 0) goto L7a
            long r3 = r9.f32302E
            float r7 = r9.f32308s
            r2.b(r3, r5, r7)
        L7a:
            r9.n2()
            return
        L7e:
            l0.g$a r0 = l0.g.f413384b
            r0.getClass()
            long r0 = l0.g.f413386d
            r9.f32302E = r0
            androidx.compose.foundation.Q1 r0 = r9.f32299B
            if (r0 == 0) goto L8e
            r0.dismiss()
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C21090x1.m2():void");
    }

    public final void n2() {
        androidx.compose.ui.unit.d dVar;
        Q1 q12 = this.f32299B;
        if (q12 == null || (dVar = this.f32298A) == null || androidx.compose.ui.unit.u.b(q12.a(), this.f32303F)) {
            return;
        }
        Y41.l<? super androidx.compose.ui.unit.l, kotlin.G0> lVar = this.f32307r;
        if (lVar != null) {
            lVar.invoke(androidx.compose.ui.unit.l.a(dVar.n(androidx.compose.ui.unit.v.c(q12.a()))));
        }
        this.f32303F = androidx.compose.ui.unit.u.a(q12.a());
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) {
        p12.y1();
        C43108m c43108m = this.f32304G;
        if (c43108m != null) {
            kotlinx.coroutines.channels.B.a(c43108m.w(kotlin.G0.f406611a));
        }
    }

    public C21090x1(Y41.l lVar, Y41.l lVar2, Y41.l lVar3, float f12, boolean z12, long j12, float f13, float f14, boolean z13, R1 r12, C42822w c42822w) {
        this.f32305p = lVar;
        this.f32306q = lVar2;
        this.f32307r = lVar3;
        this.f32308s = f12;
        this.f32309t = z12;
        this.f32310u = j12;
        this.f32311v = f13;
        this.f32312w = f14;
        this.f32313x = z13;
        this.f32314y = r12;
        this.f32300C = C22126m3.f(null, C22126m3.h());
        l0.g.f413384b.getClass();
        this.f32302E = l0.g.f413386d;
    }
}
