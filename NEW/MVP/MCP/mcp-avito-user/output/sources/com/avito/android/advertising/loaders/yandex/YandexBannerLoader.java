package com.avito.android.advertising.loaders.yandex;

import Y61.k;
import com.avito.android.advertising.loaders.NoAdException;
import com.avito.android.remote.model.advertising.YandexNetworkBannerItem;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import kotlin.Metadata;

/* compiled from: YandexBannerLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/yandex/YandexBannerLoader;", "", "YandexBannerLoadingException", "YandexBannerLoadingNoAdException", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface YandexBannerLoader {

    /* compiled from: YandexBannerLoader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/yandex/YandexBannerLoader$YandexBannerLoadingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class YandexBannerLoadingException extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final int f88498b;

        public YandexBannerLoadingException(int i12) {
            this.f88498b = i12;
        }
    }

    /* compiled from: YandexBannerLoader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/yandex/YandexBannerLoader$YandexBannerLoadingNoAdException;", "Lcom/avito/android/advertising/loaders/NoAdException;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class YandexBannerLoadingNoAdException extends NoAdException {
    }

    @k
    I0 a(@k YandexNetworkBannerItem yandexNetworkBannerItem);
}
