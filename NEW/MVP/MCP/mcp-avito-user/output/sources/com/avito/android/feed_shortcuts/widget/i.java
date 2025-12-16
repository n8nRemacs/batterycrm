package com.avito.android.feed_shortcuts.widget;

import kotlin.Metadata;

/* compiled from: FeedShortcutsWidgetItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f157712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FeedShortcutsWidgetItem f157713c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f157714d;

    public i(j jVar, FeedShortcutsWidgetItem feedShortcutsWidgetItem, int i12) {
        this.f157712b = jVar;
        this.f157713c = feedShortcutsWidgetItem;
        this.f157714d = i12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f157712b.f157715b.get().v(new vs0.h(this.f157713c, new vs0.b(Integer.valueOf(this.f157714d), null, null, 6, null)));
    }
}
