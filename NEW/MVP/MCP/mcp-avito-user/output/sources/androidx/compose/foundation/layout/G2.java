package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22826j;
import com.avito.android.R;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WindowInsets.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/G2;", "", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G2 {

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public static final a f28274x = new a(null);

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final WeakHashMap<View, G2> f28275y = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20581j f28276a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20581j f28277b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C20581j f28278c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C20581j f28279d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C20581j f28280e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C20581j f28281f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C20581j f28282g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C20581j f28283h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C20581j f28284i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28285j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28286k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28287l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20639x2 f28288m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28289n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28290o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28291p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28292q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28293r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28294s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final C20631v2 f28295t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f28296u;

    /* renamed from: v, reason: collision with root package name */
    public int f28297v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final RunnableC20626u1 f28298w;

    /* compiled from: WindowInsets.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/layout/G2$a;", "", "<init>", "()V", "", "testInsets", "Z", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Landroidx/compose/foundation/layout/G2;", "viewMap", "Ljava/util/WeakHashMap;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final C20581j a(a aVar, androidx.core.view.J0 j02, int i12, String str) {
            aVar.getClass();
            C20581j c20581j = new C20581j(i12, str);
            if (j02 != null) {
                c20581j.f(j02, i12);
            }
            return c20581j;
        }

        public static final C20631v2 b(a aVar, androidx.core.view.J0 j02, int i12, String str) {
            C22771k c22771kF;
            aVar.getClass();
            if (j02 == null || (c22771kF = j02.f(i12)) == null) {
                c22771kF = C22771k.f44774e;
            }
            return new C20631v2(A3.d(c22771kF), str);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        @androidx.compose.runtime.InterfaceC22132o
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static androidx.compose.foundation.layout.G2 c(@Y61.l androidx.compose.runtime.A r4) {
            /*
                androidx.compose.runtime.J3 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f41073f
                java.lang.Object r0 = r4.o(r0)
                android.view.View r0 = (android.view.View) r0
                java.util.WeakHashMap<android.view.View, androidx.compose.foundation.layout.G2> r1 = androidx.compose.foundation.layout.G2.f28275y
                monitor-enter(r1)
                java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L1b
                if (r2 != 0) goto L1d
                androidx.compose.foundation.layout.G2 r2 = new androidx.compose.foundation.layout.G2     // Catch: java.lang.Throwable -> L1b
                r3 = 0
                r2.<init>(r3, r0, r3)     // Catch: java.lang.Throwable -> L1b
                r1.put(r0, r2)     // Catch: java.lang.Throwable -> L1b
                goto L1d
            L1b:
                r4 = move-exception
                goto L46
            L1d:
                androidx.compose.foundation.layout.G2 r2 = (androidx.compose.foundation.layout.G2) r2     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r1)
                boolean r1 = r4.u(r2)
                boolean r3 = r4.u(r0)
                r1 = r1 | r3
                java.lang.Object r3 = r4.t()
                if (r1 != 0) goto L38
                androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
                r1.getClass()
                androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
                if (r3 != r1) goto L40
            L38:
                androidx.compose.foundation.layout.F2 r3 = new androidx.compose.foundation.layout.F2
                r3.<init>(r2, r0)
                r4.H(r3)
            L40:
                Y41.l r3 = (Y41.l) r3
                androidx.compose.runtime.C22187u0.a(r2, r3, r4)
                return r2
            L46:
                monitor-exit(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.G2.a.c(androidx.compose.runtime.A):androidx.compose.foundation.layout.G2");
        }

        public a() {
        }
    }

    public G2(androidx.core.view.J0 j02, View view, C42822w c42822w) {
        C22826j c22826jD;
        a aVar = f28274x;
        this.f28276a = a.a(aVar, j02, 4, "captionBar");
        C20581j c20581jA = a.a(aVar, j02, 128, "displayCutout");
        this.f28277b = c20581jA;
        C20581j c20581jA2 = a.a(aVar, j02, 8, "ime");
        this.f28278c = c20581jA2;
        C20581j c20581jA3 = a.a(aVar, j02, 32, "mandatorySystemGestures");
        this.f28279d = c20581jA3;
        this.f28280e = a.a(aVar, j02, 2, "navigationBars");
        this.f28281f = a.a(aVar, j02, 1, "statusBars");
        C20581j c20581jA4 = a.a(aVar, j02, 7, "systemBars");
        this.f28282g = c20581jA4;
        C20581j c20581jA5 = a.a(aVar, j02, 16, "systemGestures");
        this.f28283h = c20581jA5;
        C20581j c20581jA6 = a.a(aVar, j02, 64, "tappableElement");
        this.f28284i = c20581jA6;
        C20631v2 c20631v2 = new C20631v2(A3.d((j02 == null || (c22826jD = j02.d()) == null) ? C22771k.f44774e : c22826jD.a()), "waterfall");
        this.f28285j = c20631v2;
        C20619s2 c20619s2 = new C20619s2(new C20619s2(c20581jA4, c20581jA2), c20581jA);
        this.f28286k = c20619s2;
        C20619s2 c20619s22 = new C20619s2(new C20619s2(new C20619s2(c20581jA6, c20581jA3), c20581jA5), c20631v2);
        this.f28287l = c20619s22;
        this.f28288m = new C20619s2(c20619s2, c20619s22);
        this.f28289n = a.b(aVar, j02, 4, "captionBarIgnoringVisibility");
        this.f28290o = a.b(aVar, j02, 2, "navigationBarsIgnoringVisibility");
        this.f28291p = a.b(aVar, j02, 1, "statusBarsIgnoringVisibility");
        this.f28292q = a.b(aVar, j02, 7, "systemBarsIgnoringVisibility");
        this.f28293r = a.b(aVar, j02, 64, "tappableElementIgnoringVisibility");
        this.f28294s = a.b(aVar, j02, 8, "imeAnimationTarget");
        this.f28295t = a.b(aVar, j02, 8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f28296u = bool != null ? bool.booleanValue() : true;
        this.f28298w = new RunnableC20626u1(this);
    }

    public static void a(G2 g22, androidx.core.view.J0 j02) {
        g22.f28276a.f(j02, 0);
        g22.f28278c.f(j02, 0);
        g22.f28277b.f(j02, 0);
        g22.f28280e.f(j02, 0);
        g22.f28281f.f(j02, 0);
        g22.f28282g.f(j02, 0);
        g22.f28283h.f(j02, 0);
        g22.f28284i.f(j02, 0);
        g22.f28279d.f(j02, 0);
        g22.f28289n.f(A3.d(j02.f(4)));
        g22.f28290o.f(A3.d(j02.f(2)));
        g22.f28291p.f(A3.d(j02.f(1)));
        g22.f28292q.f(A3.d(j02.f(7)));
        g22.f28293r.f(A3.d(j02.f(64)));
        C22826j c22826jD = j02.d();
        if (c22826jD != null) {
            g22.f28285j.f(A3.d(c22826jD.a()));
        }
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l.a.f();
    }
}
