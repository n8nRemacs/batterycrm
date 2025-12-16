package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.suggestion;

import Y41.p;
import Y61.k;
import android.widget.TextView;
import com.avito.android.user_advert.advert.items.service_booking.i;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchSuggestionItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/suggestion/d;", "LTV0/d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/suggestion/e;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/suggestion/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d implements TV0.d<e, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<a, Integer, G0> f312961b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k p<? super a, ? super Integer, G0> pVar) {
        this.f312961b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        a aVar2 = (a) aVar;
        TextView textView = ((e) eVar).f312963b;
        I5.a(textView, aVar2.f312954b, false);
        textView.setOnClickListener(new i(8, new c(this, aVar2, i12)));
    }
}
