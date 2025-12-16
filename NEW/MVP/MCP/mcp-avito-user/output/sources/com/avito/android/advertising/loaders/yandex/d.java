package com.avito.android.advertising.loaders.yandex;

import Db.InterfaceC13381a;
import Y61.k;
import android.content.Context;
import android.location.Location;
import com.avito.android.C30828i;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.advertising.loaders.yandex.YandexBannerLoader;
import com.avito.android.advertising.loaders.yandex.d;
import com.avito.android.permissions.u;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import com.avito.android.util.InterfaceC35745a5;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.MobileAds;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import com.yandex.mobile.ads.nativeads.NativeAdRequestConfiguration;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import rb.InterfaceC47628b;

/* compiled from: YandexBannerLoader.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/yandex/d;", "Lcom/avito/android/advertising/loaders/yandex/YandexBannerLoader;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements YandexBannerLoader {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f88504a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC13381a f88505b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC47628b f88506c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f88507d;

    /* compiled from: YandexBannerLoader.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/yandex/d$a;", "Lcom/yandex/mobile/ads/nativeads/NativeAdLoadListener;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements NativeAdLoadListener {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final B<? super com.avito.android.advertising.loaders.yandex.a> f88508a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC47628b f88509b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final YandexNetworkBannerItem f88510c;

        public a(@k B<? super com.avito.android.advertising.loaders.yandex.a> b12, @k InterfaceC47628b interfaceC47628b, @k YandexNetworkBannerItem yandexNetworkBannerItem) {
            this.f88508a = b12;
            this.f88509b = interfaceC47628b;
            this.f88510c = yandexNetworkBannerItem;
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public final void onAdFailedToLoad(@k AdRequestError adRequestError) {
            Throwable yandexBannerLoadingException;
            if (adRequestError.getCode() == 4) {
                adRequestError.getCode();
                adRequestError.getDescription();
                yandexBannerLoadingException = new YandexBannerLoader.YandexBannerLoadingNoAdException(null, 1, null);
            } else {
                int code = adRequestError.getCode();
                adRequestError.getDescription();
                yandexBannerLoadingException = new YandexBannerLoader.YandexBannerLoadingException(code);
            }
            this.f88508a.g(yandexBannerLoadingException);
        }

        @Override // com.yandex.mobile.ads.nativeads.NativeAdLoadListener
        public final void onAdLoaded(@k NativeAd nativeAd) {
            String domain = nativeAd.getAdAssets().getDomain();
            boolean z12 = domain == null || domain.length() == 0;
            boolean z13 = !z12;
            YandexNetworkBannerItem yandexNetworkBannerItem = this.f88510c;
            String bannerCode = yandexNetworkBannerItem.getBannerCode();
            if (bannerCode == null) {
                bannerCode = "unknown";
            }
            this.f88509b.e("yandex", bannerCode, yandexNetworkBannerItem.getBlockId(), z13);
            B<? super com.avito.android.advertising.loaders.yandex.a> b12 = this.f88508a;
            if (z12) {
                b12.g(new YandexBannerLoader.YandexBannerLoadingException(999));
            } else {
                b12.onNext(new com.avito.android.advertising.loaders.yandex.a(nativeAd));
                b12.e();
            }
        }
    }

    @Inject
    public d(@k Context context, @k InterfaceC35745a5 interfaceC35745a5, @k C30828i c30828i, @k InterfaceC13381a interfaceC13381a, @k u uVar, @k InterfaceC47628b interfaceC47628b) {
        this.f88504a = interfaceC35745a5;
        this.f88505b = interfaceC13381a;
        this.f88506c = interfaceC47628b;
        Context applicationContext = context.getApplicationContext();
        this.f88507d = applicationContext;
        MobileAds.initialize(applicationContext, new l(19));
        MobileAds.setLocationConsent(uVar.b("android.permission.ACCESS_COARSE_LOCATION"));
        n<Object> nVar = C30828i.f164256k[0];
        if (((Boolean) c30828i.f164258c.a().invoke()).booleanValue()) {
            MobileAds.enableDebugErrorIndicator(true);
            MobileAds.enableLogging(true);
        }
    }

    @Override // com.avito.android.advertising.loaders.yandex.YandexBannerLoader
    @k
    public final I0 a(@k final YandexNetworkBannerItem yandexNetworkBannerItem) {
        return new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.advertising.loaders.yandex.b
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                final d dVar = this.f88500b;
                final NativeAdLoader nativeAdLoader = new NativeAdLoader(dVar.f88507d);
                YandexNetworkBannerItem yandexNetworkBannerItem2 = yandexNetworkBannerItem;
                nativeAdLoader.setNativeAdLoadListener(new d.a(b12, dVar.f88506c, yandexNetworkBannerItem2));
                LinkedHashMap linkedHashMapJ = P0.j(new Q("stat_id", yandexNetworkBannerItem2.getStatId()));
                String hash = yandexNetworkBannerItem2.getHash();
                if (hash != null) {
                    linkedHashMapJ.put("crpt", hash);
                }
                Map<String, String> params = yandexNetworkBannerItem2.getParams();
                if (params != null) {
                    for (Map.Entry<String, String> entry : params.entrySet()) {
                        linkedHashMapJ.put(entry.getKey(), entry.getValue());
                    }
                }
                NativeAdRequestConfiguration.Builder parameters = new NativeAdRequestConfiguration.Builder(yandexNetworkBannerItem2.getBlockId()).setShouldLoadImagesAutomatically(false).setContextTags(yandexNetworkBannerItem2.getContextTags()).setParameters(linkedHashMapJ);
                Coordinates location = yandexNetworkBannerItem2.getLocation();
                if (location != null) {
                    Location location2 = new Location("");
                    location2.setLongitude(location.getLongitude());
                    location2.setLatitude(location.getLatitude());
                    parameters.setLocation(location2);
                }
                String query = yandexNetworkBannerItem2.getQuery();
                if (query != null && query.length() != 0) {
                    parameters.setContextQuery(yandexNetworkBannerItem2.getQuery());
                }
                nativeAdLoader.loadAd(parameters.build());
                b12.f(new l41.f() { // from class: com.avito.android.advertising.loaders.yandex.c
                    @Override // l41.f
                    public final void cancel() {
                        NativeAdLoader nativeAdLoader2 = nativeAdLoader;
                        nativeAdLoader2.setNativeAdLoadListener(null);
                        if (dVar.f88505b.c()) {
                            return;
                        }
                        nativeAdLoader2.cancelLoading();
                    }
                });
            }
        }).j0(this.f88504a.a());
    }
}
