package com.avito.android.recent_query_search;

import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import kotlin.Metadata;

/* compiled from: RecentQuerySearchItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f252259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecentQuerySearchItem f252260c;

    public i(e eVar, RecentQuerySearchItem recentQuerySearchItem) {
        this.f252259b = eVar;
        this.f252260c = recentQuerySearchItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f252259b.f252250c.get().v(new vs0.h(this.f252260c, null, 2, null));
    }
}
