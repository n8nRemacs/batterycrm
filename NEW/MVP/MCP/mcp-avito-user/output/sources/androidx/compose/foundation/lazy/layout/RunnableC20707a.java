package androidx.compose.foundation.lazy.layout;

import android.view.Choreographer;
import android.view.View;
import androidx.compose.foundation.W0;
import androidx.compose.runtime.B2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PrefetchScheduler.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/a;", "Landroidx/compose/foundation/lazy/layout/K0;", "Landroidx/compose/runtime/B2;", "Ljava/lang/Runnable;", "Landroid/view/Choreographer$FrameCallback;", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@W0
/* renamed from: androidx.compose.foundation.lazy.layout.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC20707a implements K0, B2, Runnable, Choreographer.FrameCallback {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final C1594a f29379h = new C1594a(null);

    /* renamed from: i, reason: collision with root package name */
    public static long f29380i;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f29381b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29383d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29385f;

    /* renamed from: g, reason: collision with root package name */
    public long f29386g;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<I0> f29382c = new androidx.compose.runtime.collection.e<>(new I0[16], 0);

    /* renamed from: e, reason: collision with root package name */
    public final Choreographer f29384e = Choreographer.getInstance();

    /* compiled from: PrefetchScheduler.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/a$a;", "", "<init>", "()V", "", "frameIntervalNs", "J", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.a$a, reason: collision with other inner class name */
    public static final class C1594a {
        public /* synthetic */ C1594a(C42822w c42822w) {
            this();
        }

        public C1594a() {
        }
    }

    /* compiled from: PrefetchScheduler.android.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/a$b;", "Landroidx/compose/foundation/lazy/layout/J0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.a$b */
    public static final class b implements J0 {

        /* renamed from: a, reason: collision with root package name */
        public final long f29387a;

        public b(long j12) {
            this.f29387a = j12;
        }

        public final long a() {
            return Math.max(0L, this.f29387a - System.nanoTime());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC20707a(@Y61.k android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f29381b = r5
            androidx.compose.runtime.collection.e r0 = new androidx.compose.runtime.collection.e
            r1 = 16
            androidx.compose.foundation.lazy.layout.I0[] r1 = new androidx.compose.foundation.lazy.layout.I0[r1]
            r2 = 0
            r0.<init>(r1, r2)
            r4.f29382c = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f29384e = r0
            androidx.compose.foundation.lazy.layout.a$a r0 = androidx.compose.foundation.lazy.layout.RunnableC20707a.f29379h
            r0.getClass()
            long r0 = androidx.compose.foundation.lazy.layout.RunnableC20707a.f29380i
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L45
            android.view.Display r0 = r5.getDisplay()
            boolean r5 = r5.isInEditMode()
            if (r5 != 0) goto L3b
            if (r0 == 0) goto L3b
            float r5 = r0.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L3b
            goto L3d
        L3b:
            r5 = 1114636288(0x42700000, float:60.0)
        L3d:
            r0 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r0 = (float) r0
            float r0 = r0 / r5
            long r0 = (long) r0
            androidx.compose.foundation.lazy.layout.RunnableC20707a.f29380i = r0
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.RunnableC20707a.<init>(android.view.View):void");
    }

    @Override // androidx.compose.foundation.lazy.layout.K0
    public final void a(@Y61.k I0 i02) {
        this.f29382c.b(i02);
        if (this.f29383d) {
            return;
        }
        this.f29383d = true;
        this.f29381b.post(this);
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
        this.f29385f = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j12) {
        if (this.f29385f) {
            this.f29386g = j12;
            this.f29381b.post(this);
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        this.f29385f = false;
        this.f29381b.removeCallbacks(this);
        this.f29384e.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.compose.runtime.collection.e<I0> eVar = this.f29382c;
        if (eVar.f38262d == 0 || !this.f29383d || !this.f29385f || this.f29381b.getWindowVisibility() != 0) {
            this.f29383d = false;
            return;
        }
        b bVar = new b(this.f29386g + f29380i);
        boolean z12 = false;
        while (eVar.f38262d != 0 && !z12) {
            if (bVar.a() <= 0 || eVar.f38260b[0].a(bVar)) {
                z12 = true;
            } else {
                eVar.k(0);
            }
        }
        if (z12) {
            this.f29384e.postFrameCallback(this);
        } else {
            this.f29383d = false;
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
    }
}
