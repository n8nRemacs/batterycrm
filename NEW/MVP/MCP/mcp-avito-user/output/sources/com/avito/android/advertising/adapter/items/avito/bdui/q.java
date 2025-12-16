package com.avito.android.advertising.adapter.items.avito.bdui;

import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoNetworkBDUIViewHolder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/t;", "invoke", "()Lcom/avito/android/advertising/adapter/items/avito/bdui/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class q extends N implements Y41.a<t> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Screen f87104l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f87105m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f87106n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Screen screen, r rVar, ScreenPerformanceTracker screenPerformanceTracker) {
        super(0);
        this.f87104l = screen;
        this.f87105m = rVar;
        this.f87106n = screenPerformanceTracker;
    }

    @Override // Y41.a
    public final t invoke() {
        ZS.b bVar = new ZS.b(this.f87104l, s.f87119a, "commercial");
        r rVar = this.f87105m;
        return new t(rVar.f87113h, bVar, this.f87106n, rVar.f87109d, rVar.f87110e, rVar.f87111f, rVar.f87112g);
    }
}
