package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.Q2;
import androidx.compose.foundation.text.W1;
import androidx.compose.foundation.text.i3;
import androidx.compose.foundation.text.m3;
import androidx.compose.foundation.text.selection.C21045x;
import androidx.compose.foundation.text.selection.InterfaceC21049z;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.InterfaceC22509o2;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.k0;
import androidx.compose.ui.text.v0;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import p0.InterfaceC44967a;
import p0.b;

/* compiled from: TextFieldSelectionManager.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/f1;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.f1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21011f1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final i3 f31983a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.input.L f31984b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f31985c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public C20985q1 f31986d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31987e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.input.k0 f31988f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f31989g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.platform.M0 f31990h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.T f31991i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public InterfaceC22509o2 f31992j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public InterfaceC44967a f31993k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.focus.S f31994l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31995m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31996n;

    /* renamed from: o, reason: collision with root package name */
    public long f31997o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Integer f31998p;

    /* renamed from: q, reason: collision with root package name */
    public long f31999q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f32000r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f32001s;

    /* renamed from: t, reason: collision with root package name */
    public int f32002t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.input.W f32003u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public InterfaceC21023l0 f32004v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final d f32005w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final b f32006x;

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$copy$1", f = "TextFieldSelectionManager.kt", i = {}, l = {623}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.selection.f1$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f32007q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f32009s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32009s = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return C21011f1.this.new a(this.f32009s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f32007q;
            C21011f1 c21011f1 = C21011f1.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                if (androidx.compose.ui.text.v0.d(c21011f1.m().f42384b)) {
                    return kotlin.G0.f406611a;
                }
                androidx.compose.ui.platform.M0 m02 = c21011f1.f31990h;
                if (m02 != null) {
                    androidx.compose.ui.platform.K0 k0C = androidx.compose.foundation.internal.b.c(androidx.compose.ui.text.input.X.a(c21011f1.m()));
                    this.f32007q = 1;
                    if (m02.b(k0C) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            if (!this.f32009s) {
                return kotlin.G0.f406611a;
            }
            int iF2 = androidx.compose.ui.text.v0.f(c21011f1.m().f42384b);
            c21011f1.f31985c.invoke(C21011f1.e(c21011f1.m().f42383a, androidx.compose.ui.text.w0.a(iF2, iF2)));
            c21011f1.r(HandleState.f30333b);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/W;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/input/W;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.f1$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f32011l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.compose.ui.text.input.W w12) {
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C21011f1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final void a(C21011f1 c21011f1, l0.g gVar) {
        ((C22082i3) c21011f1.f32001s).setValue(gVar);
    }

    public static final void b(C21011f1 c21011f1, Handle handle) {
        ((C22082i3) c21011f1.f32000r).setValue(handle);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [Y41.l, kotlin.jvm.internal.N] */
    public static final long c(C21011f1 c21011f1, androidx.compose.ui.text.input.W w12, long j12, boolean z12, boolean z13, InterfaceC21049z interfaceC21049z, boolean z14) {
        Q2 q2D;
        int i12;
        C21045x c21045x;
        boolean z15;
        boolean z16;
        InterfaceC44967a interfaceC44967a;
        int i13;
        C20985q1 c20985q1 = c21011f1.f31986d;
        if (c20985q1 == null || (q2D = c20985q1.d()) == null) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            return androidx.compose.ui.text.v0.f42735c;
        }
        androidx.compose.ui.text.input.L l12 = c21011f1.f31984b;
        long j13 = w12.f42384b;
        v0.a aVar = androidx.compose.ui.text.v0.f42734b;
        int iB2 = l12.b((int) (j13 >> 32));
        androidx.compose.ui.text.input.L l13 = c21011f1.f31984b;
        long j14 = w12.f42384b;
        long jA2 = androidx.compose.ui.text.w0.a(iB2, l13.b((int) (j14 & 4294967295L)));
        int iB3 = q2D.b(j12, false);
        int i14 = (z13 || z12) ? iB3 : (int) (jA2 >> 32);
        int i15 = (!z13 || z12) ? iB3 : (int) (jA2 & 4294967295L);
        InterfaceC21023l0 interfaceC21023l0 = c21011f1.f32004v;
        int i16 = (z12 || interfaceC21023l0 == null || (i13 = c21011f1.f32002t) == -1) ? -1 : i13;
        androidx.compose.ui.text.o0 o0Var = q2D.f30513a;
        if (z12) {
            c21045x = null;
            i12 = iB3;
        } else {
            v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
            i12 = iB3;
            int i17 = (int) (jA2 >> 32);
            C21045x.a aVar3 = new C21045x.a(C21027n0.a(o0Var, i17), i17, 1L);
            int i18 = (int) (jA2 & 4294967295L);
            o0Var = o0Var;
            c21045x = new C21045x(aVar3, new C21045x.a(C21027n0.a(o0Var, i18), i18, 1L), androidx.compose.ui.text.v0.h(jA2));
        }
        C21005d1 c21005d1 = new C21005d1(z13, 1, 1, c21045x, new C21043w(1L, 1, i14, i15, i16, o0Var));
        if (!c21005d1.h(interfaceC21023l0)) {
            return j14;
        }
        c21011f1.f32004v = c21005d1;
        c21011f1.f32002t = i12;
        C21045x c21045xA = interfaceC21049z.a(c21005d1);
        long jA3 = androidx.compose.ui.text.w0.a(c21011f1.f31984b.a(c21045xA.f32156a.f32160b), c21011f1.f31984b.a(c21045xA.f32157b.f32160b));
        if (androidx.compose.ui.text.v0.c(jA3, j14)) {
            return j14;
        }
        boolean z17 = androidx.compose.ui.text.v0.h(jA3) != androidx.compose.ui.text.v0.h(j14) && androidx.compose.ui.text.v0.c(androidx.compose.ui.text.w0.a((int) (4294967295L & jA3), (int) (jA3 >> 32)), j14);
        boolean z18 = androidx.compose.ui.text.v0.d(jA3) && androidx.compose.ui.text.v0.d(j14);
        C22602e c22602e = w12.f42383a;
        if (z14 && c22602e.f42127c.length() > 0 && !z17 && !z18 && (interfaceC44967a = c21011f1.f31993k) != null) {
            p0.b.f422385b.getClass();
            interfaceC44967a.a(b.a.b());
        }
        c21011f1.f31985c.invoke(e(c22602e, jA3));
        if (!z14) {
            c21011f1.u(!androidx.compose.ui.text.v0.d(jA3));
        }
        C20985q1 c20985q12 = c21011f1.f31986d;
        if (c20985q12 != null) {
            ((C22082i3) c20985q12.f31794q).setValue(Boolean.valueOf(z14));
        }
        C20985q1 c20985q13 = c21011f1.f31986d;
        if (c20985q13 != null) {
            ((C22082i3) c20985q13.f31790m).setValue(Boolean.valueOf(!androidx.compose.ui.text.v0.d(jA3) && o1.b(c21011f1, true)));
        }
        C20985q1 c20985q14 = c21011f1.f31986d;
        if (c20985q14 == null) {
            z15 = false;
        } else {
            if (androidx.compose.ui.text.v0.d(jA3)) {
                z15 = false;
            } else {
                z15 = false;
                if (o1.b(c21011f1, false)) {
                    z16 = true;
                }
                ((C22082i3) c20985q14.f31791n).setValue(Boolean.valueOf(z16));
            }
            z16 = z15;
            ((C22082i3) c20985q14.f31791n).setValue(Boolean.valueOf(z16));
        }
        C20985q1 c20985q15 = c21011f1.f31986d;
        if (c20985q15 != null) {
            ((C22082i3) c20985q15.f31792o).setValue(Boolean.valueOf((androidx.compose.ui.text.v0.d(jA3) && o1.b(c21011f1, true)) ? true : z15));
        }
        return jA3;
    }

    public static androidx.compose.ui.text.input.W e(C22602e c22602e, long j12) {
        return new androidx.compose.ui.text.input.W(c22602e, j12, (androidx.compose.ui.text.v0) null, 4, (C42822w) null);
    }

    @Y61.l
    public final kotlinx.coroutines.N0 d(boolean z12) {
        kotlinx.coroutines.T t12 = this.f31991i;
        if (t12 != null) {
            return C43259k.d(t12, null, CoroutineStart.f410683e, new a(z12, null), 1);
        }
        return null;
    }

    @Y61.l
    public final void f() {
        kotlinx.coroutines.T t12 = this.f31991i;
        if (t12 != null) {
            C43259k.d(t12, null, CoroutineStart.f410683e, new h1(this, null), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void g(@Y61.l l0.g gVar) {
        if (!androidx.compose.ui.text.v0.d(m().f42384b)) {
            C20985q1 c20985q1 = this.f31986d;
            Q2 q2D = c20985q1 != null ? c20985q1.d() : null;
            int iF2 = (gVar == null || q2D == null) ? androidx.compose.ui.text.v0.f(m().f42384b) : this.f31984b.a(q2D.b(gVar.f413387a, true));
            this.f31985c.invoke(androidx.compose.ui.text.input.W.a(m(), null, androidx.compose.ui.text.w0.a(iF2, iF2), 5));
        }
        r((gVar == null || m().f42383a.f42127c.length() <= 0) ? HandleState.f30333b : HandleState.f30335d);
        u(false);
    }

    public final void h(boolean z12) {
        androidx.compose.ui.focus.S s5;
        C20985q1 c20985q1 = this.f31986d;
        if (c20985q1 != null && !c20985q1.b() && (s5 = this.f31994l) != null) {
            androidx.compose.ui.focus.S.c(s5);
        }
        this.f32003u = m();
        u(z12);
        r(HandleState.f30334c);
    }

    @Y61.l
    public final l0.g i() {
        return (l0.g) ((C22082i3) this.f32001s).getF42167b();
    }

    public final boolean j() {
        return ((Boolean) ((C22082i3) this.f31995m).getF42167b()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) ((C22082i3) this.f31996n).getF42167b()).booleanValue();
    }

    public final long l(boolean z12) {
        Q2 q2D;
        androidx.compose.ui.text.o0 o0Var;
        long j12;
        C20985q1 c20985q1 = this.f31986d;
        if (c20985q1 == null || (q2D = c20985q1.d()) == null || (o0Var = q2D.f30513a) == null) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        C20985q1 c20985q12 = this.f31986d;
        C22602e c22602e = c20985q12 != null ? c20985q12.f31778a.f30561a : null;
        if (c22602e == null) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        if (!kotlin.jvm.internal.L.f(c22602e.f42127c, o0Var.f42526a.f42506a.f42127c)) {
            l0.g.f413384b.getClass();
            return l0.g.f413386d;
        }
        androidx.compose.ui.text.input.W wM2 = m();
        if (z12) {
            long j13 = wM2.f42384b;
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            j12 = j13 >> 32;
        } else {
            long j14 = wM2.f42384b;
            v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
            j12 = j14 & 4294967295L;
        }
        return F1.a(o0Var, this.f31984b.b((int) j12), z12, androidx.compose.ui.text.v0.h(m().f42384b));
    }

    @Y61.k
    public final androidx.compose.ui.text.input.W m() {
        return (androidx.compose.ui.text.input.W) ((C22082i3) this.f31987e).getF42167b();
    }

    public final void n() {
        InterfaceC22509o2 interfaceC22509o2;
        InterfaceC22509o2 interfaceC22509o22 = this.f31992j;
        if ((interfaceC22509o22 != null ? interfaceC22509o22.getF41435d() : null) != TextToolbarStatus.f41279b || (interfaceC22509o2 = this.f31992j) == null) {
            return;
        }
        interfaceC22509o2.hide();
    }

    @Y61.l
    public final void o() {
        kotlinx.coroutines.T t12 = this.f31991i;
        if (t12 != null) {
            C43259k.d(t12, null, CoroutineStart.f410683e, new j1(this, null), 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void p() {
        androidx.compose.ui.text.input.W wE2 = e(m().f42383a, androidx.compose.ui.text.w0.a(0, m().f42383a.f42127c.length()));
        this.f31985c.invoke(wE2);
        this.f32003u = androidx.compose.ui.text.input.W.a(this.f32003u, null, wE2.f42384b, 5);
        h(true);
    }

    public final void q(long j12) {
        C20985q1 c20985q1 = this.f31986d;
        if (c20985q1 != null) {
            ((C22082i3) c20985q1.f31777A).setValue(androidx.compose.ui.text.v0.a(j12));
        }
        C20985q1 c20985q12 = this.f31986d;
        if (c20985q12 != null) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            long j13 = androidx.compose.ui.text.v0.f42735c;
            ((C22082i3) c20985q12.f31803z).setValue(androidx.compose.ui.text.v0.a(j13));
        }
        if (androidx.compose.ui.text.v0.d(j12)) {
            return;
        }
        u(false);
        r(HandleState.f30333b);
    }

    public final void r(HandleState handleState) {
        C20985q1 c20985q1 = this.f31986d;
        if (c20985q1 != null) {
            if (c20985q1.a() == handleState) {
                c20985q1 = null;
            }
            if (c20985q1 != null) {
                ((C22082i3) c20985q1.f31788k).setValue(handleState);
            }
        }
    }

    public final void s(long j12) {
        C20985q1 c20985q1 = this.f31986d;
        if (c20985q1 != null) {
            ((C22082i3) c20985q1.f31803z).setValue(androidx.compose.ui.text.v0.a(j12));
        }
        C20985q1 c20985q12 = this.f31986d;
        if (c20985q12 != null) {
            androidx.compose.ui.text.v0.f42734b.getClass();
            long j13 = androidx.compose.ui.text.v0.f42735c;
            ((C22082i3) c20985q12.f31777A).setValue(androidx.compose.ui.text.v0.a(j13));
        }
        if (androidx.compose.ui.text.v0.d(j12)) {
            return;
        }
        u(false);
        r(HandleState.f30333b);
    }

    @Y61.l
    public final void t() {
        kotlinx.coroutines.T t12 = this.f31991i;
        if (t12 != null) {
            C43259k.d(t12, null, CoroutineStart.f410683e, new k1(this, null), 1);
        }
    }

    public final void u(boolean z12) {
        C20985q1 c20985q1 = this.f31986d;
        if (c20985q1 != null) {
            ((C22082i3) c20985q1.f31789l).setValue(Boolean.valueOf(z12));
        }
        if (z12) {
            t();
        } else {
            n();
        }
    }

    public C21011f1(@Y61.l i3 i3Var) {
        this.f31983a = i3Var;
        this.f31984b = m3.f31576a;
        this.f31985c = c.f32011l;
        this.f31987e = C22126m3.g(new androidx.compose.ui.text.input.W((String) null, 0L, (androidx.compose.ui.text.v0) null, 7, (C42822w) null));
        androidx.compose.ui.text.input.k0.f42451b.getClass();
        this.f31988f = k0.a.f42453b;
        Boolean bool = Boolean.TRUE;
        this.f31995m = C22126m3.g(bool);
        this.f31996n = C22126m3.g(bool);
        l0.g.f413384b.getClass();
        this.f31997o = 0L;
        this.f31999q = 0L;
        this.f32000r = C22126m3.g(null);
        this.f32001s = C22126m3.g(null);
        this.f32002t = -1;
        this.f32003u = new androidx.compose.ui.text.input.W((String) null, 0L, (androidx.compose.ui.text.v0) null, 7, (C42822w) null);
        this.f32005w = new d();
        this.f32006x = new b();
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/text/selection/f1$b", "Landroidx/compose/foundation/text/selection/o;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.f1$b */
    public static final class b implements InterfaceC21028o {
        public b() {
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
        public final boolean a(long j12, InterfaceC21049z interfaceC21049z) {
            C20985q1 c20985q1;
            C21011f1 c21011f1 = C21011f1.this;
            if (!c21011f1.k() || c21011f1.m().f42383a.f42127c.length() == 0 || (c20985q1 = c21011f1.f31986d) == null || c20985q1.d() == null) {
                return false;
            }
            d(c21011f1.m(), j12, false, interfaceC21049z);
            return true;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
        public final boolean c(long j12, InterfaceC21049z interfaceC21049z) {
            C20985q1 c20985q1;
            C21011f1 c21011f1 = C21011f1.this;
            if (!c21011f1.k() || c21011f1.m().f42383a.f42127c.length() == 0 || (c20985q1 = c21011f1.f31986d) == null || c20985q1.d() == null) {
                return false;
            }
            androidx.compose.ui.focus.S s5 = c21011f1.f31994l;
            if (s5 != null) {
                androidx.compose.ui.focus.S.c(s5);
            }
            c21011f1.f31997o = j12;
            c21011f1.f32002t = -1;
            c21011f1.h(true);
            d(c21011f1.m(), c21011f1.f31997o, true, interfaceC21049z);
            return true;
        }

        public final void d(androidx.compose.ui.text.input.W w12, long j12, boolean z12, InterfaceC21049z interfaceC21049z) {
            C21011f1.this.r(androidx.compose.ui.text.v0.d(C21011f1.c(C21011f1.this, w12, j12, z12, false, interfaceC21049z, false)) ? HandleState.f30335d : HandleState.f30334c);
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21028o
        public final void b() {
        }
    }

    /* compiled from: TextFieldSelectionManager.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/text/selection/f1$d", "Landroidx/compose/foundation/text/W1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.f1$d */
    public static final class d implements W1 {
        public d() {
        }

        /* JADX WARN: Type inference failed for: r1v10, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.compose.foundation.text.W1
        public final void a(long j12) {
            Q2 q2D;
            Q2 q2D2;
            C21011f1 c21011f1 = C21011f1.this;
            if (c21011f1.k()) {
                InterfaceC22204y1 interfaceC22204y1 = c21011f1.f32000r;
                if (((Handle) ((C22082i3) interfaceC22204y1).getF42167b()) != null) {
                    return;
                }
                ((C22082i3) interfaceC22204y1).setValue(Handle.f30330d);
                c21011f1.f32002t = -1;
                c21011f1.n();
                C20985q1 c20985q1 = c21011f1.f31986d;
                if (c20985q1 == null || (q2D2 = c20985q1.d()) == null || !q2D2.c(j12)) {
                    C20985q1 c20985q12 = c21011f1.f31986d;
                    if (c20985q12 != null && (q2D = c20985q12.d()) != null) {
                        int iA2 = c21011f1.f31984b.a(q2D.b(j12, true));
                        androidx.compose.ui.text.input.W wE2 = C21011f1.e(c21011f1.m().f42383a, androidx.compose.ui.text.w0.a(iA2, iA2));
                        c21011f1.h(false);
                        InterfaceC44967a interfaceC44967a = c21011f1.f31993k;
                        if (interfaceC44967a != null) {
                            p0.b.f422385b.getClass();
                            interfaceC44967a.a(b.a.b());
                        }
                        c21011f1.f31985c.invoke(wE2);
                    }
                } else {
                    if (c21011f1.m().f42383a.f42127c.length() == 0) {
                        return;
                    }
                    c21011f1.h(false);
                    androidx.compose.ui.text.input.W wM2 = c21011f1.m();
                    androidx.compose.ui.text.v0.f42734b.getClass();
                    androidx.compose.ui.text.input.W wA2 = androidx.compose.ui.text.input.W.a(wM2, null, androidx.compose.ui.text.v0.f42735c, 5);
                    InterfaceC21049z.f32167a.getClass();
                    c21011f1.f31998p = Integer.valueOf((int) (C21011f1.c(c21011f1, wA2, j12, true, false, InterfaceC21049z.a.f32171d, true) >> 32));
                }
                c21011f1.r(HandleState.f30333b);
                c21011f1.f31997o = j12;
                ((C22082i3) c21011f1.f32001s).setValue(l0.g.a(j12));
                l0.g.f413384b.getClass();
                c21011f1.f31999q = 0L;
            }
        }

        @Override // androidx.compose.foundation.text.W1
        public final void d(long j12) {
            Q2 q2D;
            long jC2;
            C21047y c21047y;
            C21011f1 c21011f1 = C21011f1.this;
            if (!c21011f1.k() || c21011f1.m().f42383a.f42127c.length() == 0) {
                return;
            }
            c21011f1.f31999q = l0.g.j(c21011f1.f31999q, j12);
            C20985q1 c20985q1 = c21011f1.f31986d;
            if (c20985q1 != null && (q2D = c20985q1.d()) != null) {
                ((C22082i3) c21011f1.f32001s).setValue(l0.g.a(l0.g.j(c21011f1.f31997o, c21011f1.f31999q)));
                if (c21011f1.f31998p != null || q2D.c(c21011f1.i().f413387a)) {
                    Integer num = c21011f1.f31998p;
                    int iIntValue = num != null ? num.intValue() : q2D.b(c21011f1.f31997o, false);
                    int iB2 = q2D.b(c21011f1.i().f413387a, false);
                    if (c21011f1.f31998p == null && iIntValue == iB2) {
                        return;
                    }
                    androidx.compose.ui.text.input.W wM2 = c21011f1.m();
                    l0.g gVarI = c21011f1.i();
                    InterfaceC21049z.f32167a.getClass();
                    jC2 = C21011f1.c(c21011f1, wM2, gVarI.f413387a, false, false, InterfaceC21049z.a.f32171d, true);
                } else {
                    if (c21011f1.f31984b.a(q2D.b(c21011f1.f31997o, true)) == c21011f1.f31984b.a(q2D.b(c21011f1.i().f413387a, true))) {
                        InterfaceC21049z.f32167a.getClass();
                        c21047y = InterfaceC21049z.a.f32169b;
                    } else {
                        InterfaceC21049z.f32167a.getClass();
                        c21047y = InterfaceC21049z.a.f32171d;
                    }
                    jC2 = C21011f1.c(c21011f1, c21011f1.m(), c21011f1.i().f413387a, false, false, c21047y, true);
                }
                androidx.compose.ui.text.v0.a(jC2);
            }
            c21011f1.u(false);
        }

        public final void e() {
            C21011f1 c21011f1 = C21011f1.this;
            C21011f1.b(c21011f1, null);
            ((C22082i3) c21011f1.f32001s).setValue(null);
            c21011f1.u(true);
            c21011f1.f31998p = null;
            boolean zD2 = androidx.compose.ui.text.v0.d(c21011f1.m().f42384b);
            c21011f1.r(zD2 ? HandleState.f30335d : HandleState.f30334c);
            C20985q1 c20985q1 = c21011f1.f31986d;
            if (c20985q1 != null) {
                ((C22082i3) c20985q1.f31790m).setValue(Boolean.valueOf(!zD2 && o1.b(c21011f1, true)));
            }
            C20985q1 c20985q12 = c21011f1.f31986d;
            if (c20985q12 != null) {
                ((C22082i3) c20985q12.f31791n).setValue(Boolean.valueOf(!zD2 && o1.b(c21011f1, false)));
            }
            C20985q1 c20985q13 = c21011f1.f31986d;
            if (c20985q13 == null) {
                return;
            }
            ((C22082i3) c20985q13.f31792o).setValue(Boolean.valueOf(zD2 && o1.b(c21011f1, true)));
        }

        @Override // androidx.compose.foundation.text.W1
        public final void onCancel() {
            e();
        }

        @Override // androidx.compose.foundation.text.W1
        public final void onStop() {
            e();
        }

        @Override // androidx.compose.foundation.text.W1
        public final void b() {
        }

        @Override // androidx.compose.foundation.text.W1
        public final void c() {
        }
    }

    public /* synthetic */ C21011f1(i3 i3Var, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : i3Var);
    }
}
