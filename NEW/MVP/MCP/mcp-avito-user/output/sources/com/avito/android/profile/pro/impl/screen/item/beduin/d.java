package com.avito.android.profile.pro.impl.screen.item.beduin;

import Dc0.h;
import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import iT.InterfaceC41342b;
import kotlin.Metadata;

/* compiled from: ProfileTabBeduinItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/beduin/d;", "Lcom/avito/android/profile/pro/impl/screen/item/beduin/c;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.lib.beduin_v2.feature.item.a f223077b;

    public d(@k View view, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.lib.beduin_v2.feature.item.b bVar, @k ZS.b bVar2, @k InterfaceC41342b interfaceC41342b) {
        super(view);
        this.f223077b = bVar.a(bVar2, (FrameLayout) view, interfaceC41342b.invoke().Ed(), screenPerformanceTracker, interfaceC41342b.invoke().H4(), true);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223077b.a();
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        this.f223077b.T3(((h) aVar).f3296c.getJson());
    }
}
