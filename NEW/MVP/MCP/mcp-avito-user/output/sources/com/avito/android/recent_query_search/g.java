package com.avito.android.recent_query_search;

import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecentQuerySearchItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f252255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RecentQuerySearchItem f252256m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f252257n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, RecentQuerySearchItem recentQuerySearchItem, int i12) {
        super(0);
        this.f252255l = eVar;
        this.f252256m = recentQuerySearchItem;
        this.f252257n = i12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f252255l;
        eVar.f252250c.get().v(new vs0.c(this.f252256m, new vs0.b(Integer.valueOf(this.f252257n), eVar.f252249b, null, 4, null)));
        return G0.f406611a;
    }
}
