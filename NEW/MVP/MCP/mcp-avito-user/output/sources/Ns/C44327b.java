package nS;

import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.component.lazy_column.state.j;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: AvitoLazyColumnComponentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LnS/b;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/component/lazy_column/state/a;", "_design-modules_beduin-v2_renderer_component_lazy-column"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nS.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44327b extends n<com.avito.beduin.v2.component.lazy_column.state.a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f415139c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f415140d;

    public C44327b(@k ScreenPerformanceTracker screenPerformanceTracker) {
        super(j.f336015c);
        this.f415139c = screenPerformanceTracker;
        this.f415140d = "LazyColumn";
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    public final InterfaceC36343m b(@k A a12) {
        return new C44326a(a12, this.f415139c);
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    /* renamed from: k, reason: from getter */
    public final String getF415140d() {
        return this.f415140d;
    }
}
