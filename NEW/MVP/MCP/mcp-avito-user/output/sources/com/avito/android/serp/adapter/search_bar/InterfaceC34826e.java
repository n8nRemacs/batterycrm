package com.avito.android.serp.adapter.search_bar;

import androidx.view.InterfaceC22983P;
import com.avito.android.floating_views.FloatingViewsPresenter;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.search_suggest.SearchSuggestInternalShowLink;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchBarItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/search_bar/e;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.search_bar.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC34826e {

    /* compiled from: SearchBarItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.search_bar.e$a */
    public static final class a {
    }

    void a(@Y61.k com.avito.android.search_view.k kVar, float f12);

    void b();

    void c(@Y61.k FloatingViewsPresenter.Subscriber.b bVar);

    void d(boolean z12);

    void e(@Y61.k M m12, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @Y61.k InterfaceC22983P interfaceC22983P, @Y61.k com.avito.android.ticket_view.mvi.n nVar, @Y61.k CX.b bVar, @Y61.k com.avito.android.onboarding_manager.e eVar, boolean z17, @Y61.k Y41.l lVar);

    void f();

    void g();

    void h(@Y61.l List<UxFeedbackConfigOld> list);

    void i(boolean z12, @Y61.l NavigationBarStyle.DisplayType displayType);

    void invalidate();

    void j(@Y61.k SearchBarItem searchBarItem);

    void k(boolean z12);

    void l(boolean z12, @Y61.l SearchSuggestInternalShowLink searchSuggestInternalShowLink);

    void m(@Y61.k Y41.l<? super com.avito.android.loyalty_program.loyalty_entry_view.utils.b, G0> lVar);

    void n(@Y61.l String str, @Y61.l String str2);

    void o();
}
