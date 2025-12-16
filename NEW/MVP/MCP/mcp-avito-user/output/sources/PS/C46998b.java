package pS;

import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.render.android_view.n;
import dagger.internal.h;
import dagger.internal.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import nS.C44327b;

/* compiled from: AvitoLazyColumnComponentModule_LazyColumnFactory.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0002¢\u0006\u0002\b\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"LpS/b;", "Ldagger/internal/h;", "Lcom/avito/beduin/v2/render/android_view/n;", "LX41/o;", "a", "_design-modules_beduin-v2_renderer_component_lazy-column"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pS.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C46998b implements h<n<?>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f428537b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f428538a;

    /* compiled from: AvitoLazyColumnComponentModule_LazyColumnFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpS/b$a;", "", "<init>", "()V", "_design-modules_beduin-v2_renderer_component_lazy-column"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pS.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C46998b(@k l lVar) {
        this.f428538a = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        ScreenPerformanceTracker screenPerformanceTracker = (ScreenPerformanceTracker) this.f428538a.f393949a;
        f428537b.getClass();
        C46997a.f428536a.getClass();
        return new C44327b(screenPerformanceTracker);
    }
}
