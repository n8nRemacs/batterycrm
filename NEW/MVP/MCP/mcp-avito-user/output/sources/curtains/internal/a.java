package curtains.internal;

import Y61.k;
import android.os.Handler;
import android.os.Looper;
import android.view.FrameMetrics;
import android.view.Window;
import j.X;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: CurrentFrameMetricsListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcurtains/internal/a;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "b", "curtains_release"}, k = 1, mv = {1, 4, 1})
@X
/* loaded from: classes8.dex */
public final class a implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f392998a;

    /* compiled from: CurrentFrameMetricsListener.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 4, 1})
    /* renamed from: curtains.internal.a$a, reason: collision with other inner class name */
    public static final class C10997a extends N implements Y41.a<Handler> {

        /* renamed from: l, reason: collision with root package name */
        public static final C10997a f392999l = new C10997a();

        public C10997a() {
            super(0);
        }

        @Override // Y41.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* compiled from: CurrentFrameMetricsListener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcurtains/internal/a$b;", "", "<init>", "()V", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: CurrentFrameMetricsListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    static {
        new b(null);
        f392998a = C42727D.b(LazyThreadSafetyMode.f406616d, C10997a.f392999l);
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(@k Window window, @k FrameMetrics frameMetrics, int i12) {
        if (frameMetrics.getMetric(11) == 0) {
            throw null;
        }
    }
}
