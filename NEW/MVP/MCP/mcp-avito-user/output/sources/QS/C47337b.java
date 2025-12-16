package qS;

import Y61.k;
import com.avito.android.C29270c0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.component.lazy_row.state.j;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: AvitoLazyRowComponentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LqS/b;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/component/lazy_row/state/a;", "_design-modules_beduin-v2_renderer_component_lazy-row"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qS.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47337b extends n<com.avito.beduin.v2.component.lazy_row.state.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f429277c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C29270c0 f429278d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f429279e;

    public C47337b(@k ScreenPerformanceTracker screenPerformanceTracker, @k C29270c0 c29270c0) {
        super(j.f336094c);
        this.f429277c = screenPerformanceTracker;
        this.f429278d = c29270c0;
        this.f429279e = "LazyRow";
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    public final InterfaceC36343m b(@k A a12) {
        return new C47336a(a12, this.f429277c, this.f429278d);
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    /* renamed from: k, reason: from getter */
    public final String getF429279e() {
        return this.f429279e;
    }
}
