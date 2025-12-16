package com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn;

import androidx.recyclerview.widget.C23424o;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.InterfaceC36343m;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;

/* compiled from: ExtendedProfileLazyColumnComponentFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/i;", "Lcom/avito/beduin/v2/render/android_view/n;", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/l;", "_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.beduin.v2.render.android_view.n<l> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.konveyor.a> f151390c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f151391d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C23424o.f<TV0.a> f151392e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.a<GridLayoutManager> f151393f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f151394g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public g f151395h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f151396i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public H f151397j;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@Y61.k Y41.a<com.avito.konveyor.a> aVar, @Y61.k f fVar, @Y61.k C23424o.f<TV0.a> fVar2, @Y61.k Y41.a<? extends GridLayoutManager> aVar2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        super(s.f151420c);
        this.f151390c = aVar;
        this.f151391d = fVar;
        this.f151392e = fVar2;
        this.f151393f = aVar2;
        this.f151394g = screenPerformanceTracker;
        this.f151396i = "ExtendedProfileLazyColumn";
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [Y41.l, kotlin.jvm.internal.H] */
    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    public final InterfaceC36343m b(@Y61.k A a12) {
        ?? r72 = this.f151397j;
        g gVar = new g(a12, this.f151390c, this.f151391d, this.f151392e, this.f151393f, this.f151394g, r72);
        this.f151395h = gVar;
        this.f151391d.a();
        return gVar;
    }

    @Override // com.avito.beduin.v2.render.android_view.n
    @Y61.k
    /* renamed from: k, reason: from getter */
    public final String getF415140d() {
        return this.f151396i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final List<k> o() {
        g gVar = this.f151395h;
        List<k> list = gVar != null ? gVar.f151385w : null;
        return list == null ? C42784z0.f406748b : list;
    }
}
