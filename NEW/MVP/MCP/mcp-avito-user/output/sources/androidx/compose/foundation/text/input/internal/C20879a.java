package androidx.compose.foundation.text.input.internal;

import android.graphics.Rect;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import androidx.compose.ui.text.input.InterfaceC22645k;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/a;", "Landroidx/compose/foundation/text/input/internal/p0;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.input.internal.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20879a extends AbstractC20910p0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f31022b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public C20946v0 f31023c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public e2 f31024d;

    /* compiled from: LegacyPlatformTextInputServiceAdapter.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/v0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/input/internal/v0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.input.internal.a$a, reason: collision with other inner class name */
    public static final class C1612a extends kotlin.jvm.internal.N implements Y41.l<C20946v0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.W f31025l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C20879a f31026m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C22655v f31027n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<List<? extends InterfaceC22645k>, kotlin.G0> f31028o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C22654u, kotlin.G0> f31029p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1612a(androidx.compose.ui.text.input.W w12, C20879a c20879a, C22655v c22655v, Y41.l<? super List<? extends InterfaceC22645k>, kotlin.G0> lVar, Y41.l<? super C22654u, kotlin.G0> lVar2) {
            super(1);
            this.f31025l = w12;
            this.f31026m = c20879a;
            this.f31027n = c22655v;
            this.f31028o = lVar;
            this.f31029p = lVar2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C20946v0 c20946v0) {
            C20946v0 c20946v02 = c20946v0;
            C20902l0 c20902l0 = this.f31026m.f31199a;
            c20946v02.f31489h = this.f31025l;
            c20946v02.f31490i = this.f31027n;
            c20946v02.f31484c = (kotlin.jvm.internal.N) this.f31028o;
            c20946v02.f31485d = (kotlin.jvm.internal.N) this.f31029p;
            c20946v02.f31486e = c20902l0 != null ? c20902l0.f31166q : null;
            c20946v02.f31487f = c20902l0 != null ? c20902l0.f31167r : null;
            c20946v02.f31488g = c20902l0 != null ? (InterfaceC22544x2) C22417j.a(c20902l0, androidx.compose.ui.platform.Q0.f41210s) : null;
            return kotlin.G0.f406611a;
        }
    }

    @Override // androidx.compose.ui.text.input.P
    public final void a() {
        kotlinx.coroutines.N0 n02 = this.f31022b;
        if (n02 != null) {
            n02.c(null);
        }
        this.f31022b = null;
        Y1<kotlin.G0> y1K = k();
        if (y1K != null) {
            ((e2) y1K).h4();
        }
    }

    @Override // androidx.compose.ui.text.input.P
    public final void b(@Y61.l androidx.compose.ui.text.input.W w12, @Y61.k androidx.compose.ui.text.input.W w13) {
        C20946v0 c20946v0 = this.f31023c;
        if (c20946v0 != null) {
            boolean z12 = (androidx.compose.ui.text.v0.c(c20946v0.f31489h.f42384b, w13.f42384b) && kotlin.jvm.internal.L.f(c20946v0.f31489h.f42385c, w13.f42385c)) ? false : true;
            c20946v0.f31489h = w13;
            int size = c20946v0.f31491j.size();
            for (int i12 = 0; i12 < size; i12++) {
                D0 d02 = (D0) ((WeakReference) c20946v0.f31491j.get(i12)).get();
                if (d02 != null) {
                    d02.f30808g = w13;
                }
            }
            C20908o0 c20908o0 = c20946v0.f31494m;
            synchronized (c20908o0.f31183c) {
                c20908o0.f31190j = null;
                c20908o0.f31192l = null;
                c20908o0.f31191k = null;
                c20908o0.f31193m = null;
                c20908o0.f31194n = null;
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
            if (kotlin.jvm.internal.L.f(w12, w13)) {
                if (z12) {
                    C20898j0 c20898j0 = c20946v0.f31483b;
                    int iG2 = androidx.compose.ui.text.v0.g(w13.f42384b);
                    int iF2 = androidx.compose.ui.text.v0.f(w13.f42384b);
                    androidx.compose.ui.text.v0 v0Var = c20946v0.f31489h.f42385c;
                    int iG3 = v0Var != null ? androidx.compose.ui.text.v0.g(v0Var.f42736a) : -1;
                    androidx.compose.ui.text.v0 v0Var2 = c20946v0.f31489h.f42385c;
                    c20898j0.b(iG2, iF2, iG3, v0Var2 != null ? androidx.compose.ui.text.v0.f(v0Var2.f42736a) : -1);
                    return;
                }
                return;
            }
            if (w12 != null && (!kotlin.jvm.internal.L.f(w12.f42383a.f42127c, w13.f42383a.f42127c) || (androidx.compose.ui.text.v0.c(w12.f42384b, w13.f42384b) && !kotlin.jvm.internal.L.f(w12.f42385c, w13.f42385c)))) {
                C20898j0 c20898j02 = c20946v0.f31483b;
                c20898j02.a().restartInput(c20898j02.f31124a);
                return;
            }
            int size2 = c20946v0.f31491j.size();
            for (int i13 = 0; i13 < size2; i13++) {
                D0 d03 = (D0) ((WeakReference) c20946v0.f31491j.get(i13)).get();
                if (d03 != null) {
                    androidx.compose.ui.text.input.W w14 = c20946v0.f31489h;
                    C20898j0 c20898j03 = c20946v0.f31483b;
                    if (d03.f30812k) {
                        d03.f30808g = w14;
                        if (d03.f30810i) {
                            c20898j03.a().updateExtractedText(c20898j03.f31124a, d03.f30809h, E0.a(w14));
                        }
                        androidx.compose.ui.text.v0 v0Var3 = w14.f42385c;
                        int iG4 = v0Var3 != null ? androidx.compose.ui.text.v0.g(v0Var3.f42736a) : -1;
                        androidx.compose.ui.text.v0 v0Var4 = w14.f42385c;
                        int iF3 = v0Var4 != null ? androidx.compose.ui.text.v0.f(v0Var4.f42736a) : -1;
                        long j12 = w14.f42384b;
                        c20898j03.b(androidx.compose.ui.text.v0.g(j12), androidx.compose.ui.text.v0.f(j12), iG4, iF3);
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.text.input.P
    public final void c(@Y61.k androidx.compose.ui.text.input.W w12, @Y61.k C22655v c22655v, @Y61.k Y41.l<? super List<? extends InterfaceC22645k>, kotlin.G0> lVar, @Y61.k Y41.l<? super C22654u, kotlin.G0> lVar2) {
        C1612a c1612a = new C1612a(w12, this, c22655v, lVar, lVar2);
        C20902l0 c20902l0 = this.f31199a;
        if (c20902l0 == null) {
            return;
        }
        this.f31022b = c20902l0.f42893o ? C43259k.d(c20902l0.Y1(), null, CoroutineStart.f410683e, new C20900k0(c20902l0, new C20881b(c1612a, this, c20902l0, null), null), 1) : null;
    }

    @Override // androidx.compose.ui.text.input.P
    public final void d() {
        C20902l0 c20902l0 = this.f31199a;
        if (c20902l0 == null) {
            return;
        }
        this.f31022b = c20902l0.f42893o ? C43259k.d(c20902l0.Y1(), null, CoroutineStart.f410683e, new C20900k0(c20902l0, new C20881b(null, this, c20902l0, null), null), 1) : null;
    }

    @Override // androidx.compose.ui.text.input.P
    public final void f(@Y61.k l0.j jVar) {
        Rect rect;
        C20946v0 c20946v0 = this.f31023c;
        if (c20946v0 != null) {
            c20946v0.f31493l = new Rect(kotlin.math.b.b(jVar.f413390a), kotlin.math.b.b(jVar.f413391b), kotlin.math.b.b(jVar.f413392c), kotlin.math.b.b(jVar.f413393d));
            if (!c20946v0.f31491j.isEmpty() || (rect = c20946v0.f31493l) == null) {
                return;
            }
            c20946v0.f31482a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // androidx.compose.ui.text.input.P
    public final void g(@Y61.k androidx.compose.ui.text.input.W w12, @Y61.k androidx.compose.ui.text.input.L l12, @Y61.k androidx.compose.ui.text.o0 o0Var, @Y61.k Y41.l<? super androidx.compose.ui.graphics.A0, kotlin.G0> lVar, @Y61.k l0.j jVar, @Y61.k l0.j jVar2) {
        C20946v0 c20946v0 = this.f31023c;
        if (c20946v0 != null) {
            C20908o0 c20908o0 = c20946v0.f31494m;
            synchronized (c20908o0.f31183c) {
                try {
                    c20908o0.f31190j = w12;
                    c20908o0.f31192l = l12;
                    c20908o0.f31191k = o0Var;
                    c20908o0.f31193m = jVar;
                    c20908o0.f31194n = jVar2;
                    if (c20908o0.f31185e || c20908o0.f31184d) {
                        c20908o0.a();
                    }
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.AbstractC20910p0
    public final void i() {
        Y1<kotlin.G0> y1K = k();
        if (y1K != null) {
            ((e2) y1K).K5(kotlin.G0.f406611a);
        }
    }

    public final Y1<kotlin.G0> k() {
        e2 e2Var = this.f31024d;
        if (e2Var != null) {
            return e2Var;
        }
        if (!androidx.compose.foundation.text.handwriting.j.f30741a) {
            return null;
        }
        e2 e2VarB = f2.b(1, 0, BufferOverflow.f410779d, 2);
        this.f31024d = e2VarB;
        return e2VarB;
    }
}
