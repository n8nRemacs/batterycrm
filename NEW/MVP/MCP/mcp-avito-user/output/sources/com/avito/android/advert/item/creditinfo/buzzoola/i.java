package com.avito.android.advert.item.creditinfo.buzzoola;

import Hq0.C14020b;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.util.InterfaceC35745a5;
import fa.InterfaceC40383a;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.F;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rb.C47627a;
import rb.InterfaceC47628b;

/* compiled from: BuzzoolaCreditBannerLoader.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/i;", "Lcom/avito/android/advert/item/creditinfo/buzzoola/BuzzoolaCreditBannerLoader;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements BuzzoolaCreditBannerLoader {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f74950a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC40383a> f74951b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.loaders.buzzoola.f f74952c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f74953d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47628b f74954e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.a f74955f;

    @Inject
    public i(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e<InterfaceC40383a> eVar, @Y61.k com.avito.android.advertising.loaders.buzzoola.f fVar, @Y61.k com.avito.android.advert_core.analytics.a aVar, @Y61.k InterfaceC47628b interfaceC47628b, @Y61.k com.avito.android.server_time.a aVar2) {
        this.f74950a = interfaceC35745a5;
        this.f74951b = eVar;
        this.f74952c = fVar;
        this.f74953d = aVar;
        this.f74954e = interfaceC47628b;
        this.f74955f = aVar2;
    }

    @Override // com.avito.android.advert.item.creditinfo.buzzoola.BuzzoolaCreditBannerLoader
    @Y61.k
    public final C41982q1 a(@Y61.k AdvertDetails advertDetails) {
        return new F(new C14020b(2, this, advertDetails)).T(new h(this, advertDetails), Integer.MAX_VALUE).x0(this.f74950a.a());
    }

    public final C47627a b(BannerInfo bannerInfo) {
        this.f74955f.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - bannerInfo.f87892w;
        String bannerCode = bannerInfo.getBannerCode();
        if (bannerCode == null) {
            bannerCode = "unknown";
        }
        return new C47627a(bannerCode, "buzzoola_premium", 0, jCurrentTimeMillis);
    }
}
