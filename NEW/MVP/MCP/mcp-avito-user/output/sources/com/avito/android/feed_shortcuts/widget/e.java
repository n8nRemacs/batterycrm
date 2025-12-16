package com.avito.android.feed_shortcuts.widget;

import Oi0.C14701e;
import TV0.g;
import com.avito.android.R;
import com.avito.android.publish.objects.C33947g;
import kotlin.Metadata;

/* compiled from: FeedShortcutsWidgetItemBlueprintImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/feed_shortcuts/widget/e;", "Lcom/avito/android/feed_shortcuts/widget/c;", "_avito_bx-content_widget_feed-shortcuts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f157707a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C33947g f157708b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C14701e f157709c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f157710d = new g.a<>(R.layout.bx_content_widget_feed_shortcuts_layout, new d(this));

    public e(@Y61.k g gVar, @Y61.k C33947g c33947g, @Y61.k C14701e c14701e) {
        this.f157707a = gVar;
        this.f157708b = c33947g;
        this.f157709c = c14701e;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f157707a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f157710d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof FeedShortcutsWidgetItem;
    }
}
