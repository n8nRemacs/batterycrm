package com.avito.android.search_view;

import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestHistoryItem;
import io.reactivex.rxjava3.core.z;
import iw.C42120a;
import j.L;
import j.U;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ToolbarSearchView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/v;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface v {

    /* compiled from: ToolbarSearchView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void A(@Y61.k Y41.l lVar, @Y61.k ArrayList arrayList);

    void a(@Y61.k k kVar, float f12);

    void b();

    void c();

    void close();

    void d(int i12);

    @Y61.k
    z<String> dc();

    @Y61.k
    z<Integer> e5();

    void g(@Y61.k InterfaceC22983P interfaceC22983P);

    @Y61.l
    String getHint();

    @Y61.k
    z<C42120a> getSearchInputLayoutChanges();

    @Y61.k
    z<Boolean> getSearchOpeningChanges();

    @Y61.k
    z<ShareButtonEvent> getShareButtonEvents();

    void h();

    void i();

    void j(boolean z12);

    void k();

    void l(int i12, int i13);

    void m();

    void n(@Y61.k String str);

    void o();

    @Y61.k
    z<String> o6();

    void p(@Y61.k SubscriptionButtonState subscriptionButtonState);

    @Y61.k
    z<Boolean> q();

    @Y61.k
    z<DeepLink> s();

    void setAdapter(@Y61.l RecyclerView.Adapter<?> adapter);

    void setHint(@Y61.k String str);

    void setInputClickListener(@Y61.k Y41.a<G0> aVar);

    void setMenu(@L int i12);

    void setQuery(@Y61.k String str);

    void setSaveSearchInHeaderOnScroll(boolean z12);

    void setSearchEnabled(boolean z12);

    void setTopPadding(@U int i12);

    void setUserMovedMapSinceLastLocationUpdate(boolean z12);

    void u(@Y61.k Y41.a<G0> aVar);

    /* renamed from: v */
    boolean getF264475h0();

    void w();

    void x();

    void y(@Y61.k HistorySuggestItem historySuggestItem, @Y61.k Y41.l<? super SuggestHistoryItem, G0> lVar, @Y61.k Y41.l<? super SuggestHistoryItem, G0> lVar2);

    @Y61.k
    z<G0> z();
}
