package com.avito.android.advertising.loaders.my_target;

import com.avito.android.advertising.loaders.NoAdException;
import com.avito.android.remote.model.advertising.MyTargetNetworkBannerItem;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.Metadata;

/* compiled from: MyTargetBannerLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/MyTargetBannerLoader;", "", "MyTargetBannerLoaderException", "MyTargetBannerLoaderNoAdException", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MyTargetBannerLoader {

    /* compiled from: MyTargetBannerLoader.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/MyTargetBannerLoader$MyTargetBannerLoaderException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MyTargetBannerLoaderException extends Exception {
    }

    /* compiled from: MyTargetBannerLoader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/my_target/MyTargetBannerLoader$MyTargetBannerLoaderNoAdException;", "Lcom/avito/android/advertising/loaders/NoAdException;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MyTargetBannerLoaderNoAdException extends NoAdException {
    }

    @Y61.k
    C a(@Y61.k MyTargetNetworkBannerItem myTargetNetworkBannerItem);
}
