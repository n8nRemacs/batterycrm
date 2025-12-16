package com.avito.android.feed_shortcuts.widget;

import com.avito.android.feed_shortcuts.element.FeedShortcutsWidgetElementItem;
import io.reactivex.rxjava3.internal.observers.y;
import js0.d;
import kotlin.Metadata;
import vs0.C49377a;

/* compiled from: FeedShortcutsWidgetItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/j;", "Lcom/avito/android/feed_shortcuts/widget/g;", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<vs0.d> f157715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f157716c;

    public j(@Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar, @Y61.k h31.e eVar) {
        this.f157715b = eVar;
        this.f157716c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        FeedShortcutsWidgetItem feedShortcutsWidgetItem = (FeedShortcutsWidgetItem) aVar;
        kVar.ae(feedShortcutsWidgetItem.getItems());
        kVar.d(new h((y) kVar.V1().t0(new i(this, feedShortcutsWidgetItem, i12))));
    }

    @Override // XQ.a
    @Y61.l
    public final XQ.b d0() {
        return null;
    }

    @Override // com.avito.android.feed_shortcuts.widget.f
    public final void k(@Y61.k FeedShortcutsWidgetElementItem feedShortcutsWidgetElementItem, int i12) {
        this.f157715b.get().v(new C49377a(feedShortcutsWidgetElementItem, new vs0.b(Integer.valueOf(i12), null, null, 6, null)));
        d.a.a(this.f157716c, Integer.valueOf(feedShortcutsWidgetElementItem.f0()), "feedShortcutsWidget", feedShortcutsWidgetElementItem.getTitle(), null, null, null, null, feedShortcutsWidgetElementItem.getAnalytics(), 120);
    }
}
