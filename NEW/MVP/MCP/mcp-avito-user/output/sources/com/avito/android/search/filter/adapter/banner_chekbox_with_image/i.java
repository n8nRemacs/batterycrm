package com.avito.android.search.filter.adapter.banner_chekbox_with_image;

import Cp0.C13337a;
import Y61.k;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.search.filter.InterfaceC34581l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BannerCheckBoxWithImagePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/banner_chekbox_with_image/i;", "Lcom/avito/android/search/filter/adapter/banner_chekbox_with_image/g;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<C13337a> f261975b;

    @Inject
    public i(@k InterfaceC34581l interfaceC34581l) {
        this.f261975b = interfaceC34581l.getF263705E();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        d dVar = (d) eVar;
        C13337a c13337a = (C13337a) aVar;
        dVar.Ia(c13337a.f2691f);
        dVar.j(c13337a.f2692g);
        dVar.b(c13337a.f2689d);
        dVar.M(c13337a.f2694i);
        Badge badge = c13337a.f2693h;
        dVar.uA(badge != null ? badge.getTitle() : null, badge != null ? badge.getTitleColor() : null, badge != null ? badge.getBackgroundColor() : null);
        boolean z12 = c13337a.f2690e;
        dVar.u6(z12);
        dVar.Bc(z12);
        dVar.MC(new h(c13337a, this));
    }
}
