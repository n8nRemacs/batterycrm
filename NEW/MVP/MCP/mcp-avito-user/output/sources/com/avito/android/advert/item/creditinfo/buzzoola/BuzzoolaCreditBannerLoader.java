package com.avito.android.advert.item.creditinfo.buzzoola;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertDetails;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import kotlin.Metadata;

/* compiled from: BuzzoolaCreditBannerLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/BuzzoolaCreditBannerLoader;", "", "BuzzoolaCreditBannerConvertException", "BuzzoolaCreditBannerLoadingException", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface BuzzoolaCreditBannerLoader {

    /* compiled from: BuzzoolaCreditBannerLoader.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/BuzzoolaCreditBannerLoader$BuzzoolaCreditBannerConvertException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuzzoolaCreditBannerConvertException extends Exception {
    }

    /* compiled from: BuzzoolaCreditBannerLoader.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/creditinfo/buzzoola/BuzzoolaCreditBannerLoader$BuzzoolaCreditBannerLoadingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BuzzoolaCreditBannerLoadingException extends Exception {
    }

    @Y61.k
    C41982q1 a(@Y61.k AdvertDetails advertDetails);
}
