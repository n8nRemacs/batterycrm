package androidx.core.app;

import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RestrictTo;
import j.X;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* compiled from: FrameMetricsAggregator.java */
/* renamed from: androidx.core.app.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22759q {

    /* compiled from: FrameMetricsAggregator.java */
    @X
    /* renamed from: androidx.core.app.q$a */
    public static class a extends b {

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: androidx.core.app.q$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC1718a implements Window.OnFrameMetricsAvailableListener {
            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i12) {
                throw null;
            }
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    /* renamed from: androidx.core.app.q$b */
    public static class b {
    }

    /* compiled from: FrameMetricsAggregator.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* renamed from: androidx.core.app.q$c */
    public @interface c {
    }

    public C22759q() {
        new a();
        new ArrayList();
    }
}
