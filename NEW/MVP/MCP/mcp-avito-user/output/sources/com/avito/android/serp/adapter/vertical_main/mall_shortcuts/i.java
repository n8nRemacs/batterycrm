package com.avito.android.serp.adapter.vertical_main.mall_shortcuts;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MallShortcutsWidgetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/i;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/l;", "Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/MallShortcutsWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements TV0.d<l, MallShortcutsWidgetItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f272992b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272993c;

    @Inject
    public i(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f272992b = aVar;
        this.f272993c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        MallShortcutsWidgetItem mallShortcutsWidgetItem = (MallShortcutsWidgetItem) aVar;
        ((l) eVar).Mq(mallShortcutsWidgetItem, new h(this, i12, mallShortcutsWidgetItem));
    }
}
