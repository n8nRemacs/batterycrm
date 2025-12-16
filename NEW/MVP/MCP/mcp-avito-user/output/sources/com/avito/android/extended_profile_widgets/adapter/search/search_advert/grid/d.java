package com.avito.android.extended_profile_widgets.adapter.search.search_advert.grid;

import Y61.k;
import com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem;
import com.avito.android.serp.adapter.InterfaceC34689c;
import com.avito.android.serp.adapter.InterfaceC34729e;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchAdvertGridItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_advert/grid/d;", "Lcom/avito/android/extended_profile_widgets/adapter/search/search_advert/grid/c;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC34689c f154701b;

    @Inject
    public d(@k InterfaceC34689c interfaceC34689c) {
        this.f154701b = interfaceC34689c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        this.f154701b.O5((InterfaceC34729e) eVar, ((SearchAdvertItem) aVar).f154691d, i12);
    }
}
