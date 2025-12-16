package eS;

import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.component.gridlayout.state.c;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import com.avito.beduin.v2.render.android_view.n;
import kotlin.Metadata;

/* compiled from: AvitoGridComponentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LeS/b;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/beduin/v2/component/gridlayout/state/c;", "_design-modules_beduin-v2_renderer_component_grid-layout"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eS.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40045b extends n<c> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f395203c;

    public C40045b(@k ScreenPerformanceTracker screenPerformanceTracker) {
        super(com.avito.beduin.v2.component.gridlayout.state.a.f335838c);
        this.f395203c = screenPerformanceTracker;
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @k
    public final InterfaceC36343m b(@k A a12) {
        return new C40044a(a12, this.f395203c);
    }
}
