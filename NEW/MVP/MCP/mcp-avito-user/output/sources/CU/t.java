package cU;

import C11.b;
import android.content.Context;
import cU.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinRendererComponentImpl.kt */
@C11.b
@D
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LcU/t;", "LcU/s;", "a", "b", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface t extends s {

    /* compiled from: BeduinRendererComponentImpl.kt */
    @ContributesBinding
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcU/t$a;", "LcU/s$a;", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements s.a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b f57890a;

        @Inject
        public a(@Y61.k b bVar) {
            this.f57890a = bVar;
        }

        @Override // cU.s.a
        @Y61.k
        public final t a(@Y61.k Context context, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k aU0.b bVar, @Y61.k m mVar, @Y61.k com.avito.beduin.v2.engine.component.B b12) {
            return this.f57890a.a(context, screenPerformanceTracker, bVar, mVar, b12);
        }
    }

    /* compiled from: BeduinRendererComponentImpl.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LcU/t$b;", "", "_design-modules_beduin-v2_renderer_di_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        @Y61.k
        t a(@F @h31.b @Y61.k Context context, @h31.b @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @h31.b @Y61.k aU0.b bVar, @Y61.k m mVar, @h31.b @Y61.k com.avito.beduin.v2.engine.component.B b12);
    }
}
