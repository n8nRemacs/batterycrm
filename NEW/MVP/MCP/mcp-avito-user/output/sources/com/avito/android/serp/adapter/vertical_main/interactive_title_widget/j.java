package com.avito.android.serp.adapter.vertical_main.interactive_title_widget;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InteractiveTitleWidgetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/j;", "Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f272962b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f272963c;

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f272962b = aVar;
        this.f272963c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        InteractiveTitleWidgetItem interactiveTitleWidgetItem = (InteractiveTitleWidgetItem) aVar;
        lVar.IL(interactiveTitleWidgetItem);
        lVar.a(new i(interactiveTitleWidgetItem, this, i12));
    }
}
