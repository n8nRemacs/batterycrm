package com.avito.android.recent_query_search;

import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import com.avito.android.remote.model.SearchParams;
import io.reactivex.rxjava3.internal.observers.y;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RecentQuerySearchItemPresenterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/recent_query_search/e;", "Lcom/avito/android/recent_query_search/d;", "a", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final SearchParams f252249b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<vs0.d> f252250c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.analytics.widgets_tracker.g f252251d;

    /* compiled from: RecentQuerySearchItemPresenterImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/recent_query_search/e$a;", "", "<init>", "()V", "", "DEFAULT_DESCRIPTION_MAX_LINES", "I", "DESCRIPTION_NO_SPACES_MAX_LINES", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public e(@Y61.l SearchParams searchParams, @Y61.k h31.e<vs0.d> eVar, @Y61.k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f252249b = searchParams;
        this.f252250c = eVar;
        this.f252251d = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Character chValueOf;
        k kVar = (k) eVar;
        RecentQuerySearchItem recentQuerySearchItem = (RecentQuerySearchItem) aVar;
        io.reactivex.rxjava3.disposables.d dVarV0 = kVar.V1().v0(new i(this, recentQuerySearchItem), j.f252261b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        kVar.vR(recentQuerySearchItem.getTitle());
        kVar.Sp(recentQuerySearchItem.getQuery());
        String description = recentQuerySearchItem.getDescription();
        int i13 = 0;
        while (true) {
            if (i13 >= description.length()) {
                chValueOf = null;
                break;
            }
            char cCharAt = description.charAt(i13);
            if (Character.isWhitespace(cCharAt)) {
                chValueOf = Character.valueOf(cCharAt);
                break;
            }
            i13++;
        }
        if (chValueOf == null) {
            kVar.sf(1);
        } else {
            kVar.sf(2);
        }
        kVar.qZ(recentQuerySearchItem.getDescription());
        kVar.O50(recentQuerySearchItem.k1().f252245c);
        kVar.hQ(new f(this, recentQuerySearchItem, i12));
        kVar.CJ(new g(this, recentQuerySearchItem, i12));
        kVar.d(new h((y) dVarV0));
    }

    @Override // XQ.a
    @Y61.l
    public final XQ.b d0() {
        return null;
    }
}
