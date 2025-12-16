package com.avito.android.advert.item.realty_quiz_banner;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RealtyQuizBannerStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/realty_quiz_banner/l;", "Lcom/avito/android/advert/item/realty_quiz_banner/k;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f78375a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f78376b;

    @Inject
    public l(@Y61.k AK0.l lVar, @Y61.k E e12) {
        this.f78375a = lVar;
        this.f78376b = G.f("realty_banner_time_delay", e12.a());
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.k
    public final boolean a() {
        AK0.l lVar = this.f78375a;
        return lVar.getBoolean("realty_banner_show_pref_key", true) || (System.currentTimeMillis() / ((long) 1000)) - lVar.getLong(this.f78376b, -1L) > ((long) 2592000);
    }

    @Override // com.avito.android.advert.item.realty_quiz_banner.k
    public final void b() {
        AK0.l lVar = this.f78375a;
        lVar.putBoolean("realty_banner_show_pref_key", false);
        lVar.putLong(this.f78376b, System.currentTimeMillis() / 1000);
    }
}
