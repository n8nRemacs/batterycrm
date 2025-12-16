package com.avito.android.advert.item.b2c;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsB2CBottomPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/b2c/d;", "Lcom/avito/android/advert/item/b2c/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f73197b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f73198c = new a();

    /* compiled from: AdvertDetailsB2CBottomPresenter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/b2c/d$a", "Lcom/avito/android/advert_core/safedeal/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.advert_core.safedeal.a {
        public a() {
        }

        @Override // com.avito.android.advert_core.safedeal.a
        public final void a(@k DeepLink deepLink) {
            d.this.f73197b.a(deepLink);
        }
    }

    @Inject
    public d(@k h hVar) {
        this.f73197b = hVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((f) eVar).Vk(((AdvertDetailsB2CBottomItem) aVar).f73187e, this.f73198c);
    }
}
