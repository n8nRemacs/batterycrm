package cU;

import android.content.Context;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.InterfaceC29971h;
import kotlin.Metadata;

/* compiled from: BeduinRendererComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LcU/s;", "", "a", "b", "_design-modules_beduin-v2_renderer_di_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface s {

    /* compiled from: BeduinRendererComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcU/s$a;", "", "_design-modules_beduin-v2_renderer_di_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        t a(@F @h31.b @Y61.k Context context, @h31.b @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @h31.b @Y61.k aU0.b bVar, @Y61.k m mVar, @h31.b @Y61.k com.avito.beduin.v2.engine.component.B b12);
    }

    /* compiled from: BeduinRendererComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcU/s$b;", "Lcom/avito/android/di/h;", "_design-modules_beduin-v2_renderer_di_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @Y61.k
        a fd();
    }

    @Y61.k
    com.avito.beduin.v2.theme.k a();

    @Y61.k
    com.avito.beduin.v2.render.android_view.A b();

    @Y61.k
    x c();

    @Y61.k
    ScreenPerformanceTracker getPerformanceTracker();
}
