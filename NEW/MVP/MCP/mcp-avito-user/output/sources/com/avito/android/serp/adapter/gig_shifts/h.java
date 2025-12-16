package com.avito.android.serp.adapter.gig_shifts;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.widget_analytics.Analytics;
import javax.inject.Inject;
import js0.d;
import kotlin.Metadata;

/* compiled from: GigShiftsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/gig_shifts/h;", "Lcom/avito/android/serp/adapter/gig_shifts/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f270120b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f270121c;

    @Inject
    public h(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f270120b = aVar;
        this.f270121c = gVar;
    }

    public static final void k(h hVar, DeepLink deepLink, int i12, Analytics analytics) {
        d.a.a(hVar.f270121c, Integer.valueOf(i12), "yourSlotsWidget", null, null, null, null, null, analytics, 124);
        b.a.a(hVar.f270120b, deepLink, null, null, 6);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        GigShiftsItem gigShiftsItem = (GigShiftsItem) aVar;
        ((j) eVar).f270124b.a(gigShiftsItem.f270099c, new e(this, i12, gigShiftsItem), new f(this, i12, gigShiftsItem), new g(this, i12, gigShiftsItem));
    }
}
