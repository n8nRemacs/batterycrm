package androidx.metrics.performance;

import android.app.Activity;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: JankStatsApi16Impl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/metrics/performance/b;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "a", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f52693b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Field f52694c;

    /* compiled from: JankStatsApi16Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/metrics/performance/b$a;", "", "<init>", "()V", "metrics-performance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static long a(@Y61.l View view) {
            m.f52726a.getClass();
            if (m.f52727b < 0) {
                Window window = (view != null ? view.getContext() : null) instanceof Activity ? ((Activity) view.getContext()).getWindow() : null;
                float f12 = 60.0f;
                float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
                if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                    f12 = refreshRate;
                }
                m.f52727b = (long) ((1000 / f12) * 1000000);
            }
            return m.f52727b;
        }

        public a() {
        }
    }

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        f52694c = declaredField;
        declaredField.setAccessible(true);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        throw null;
    }
}
