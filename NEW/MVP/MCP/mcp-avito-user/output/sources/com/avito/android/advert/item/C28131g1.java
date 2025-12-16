package com.avito.android.advert.item;

import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertDetailsStyles.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/g1;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.g1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28131g1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C28131g1 f75660a = new C28131g1();

    /* compiled from: AdvertDetailsStyles.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.g1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75661a;

        static {
            int[] iArr = new int[AdvertDetails.AdvertisementStyle.values().length];
            try {
                iArr[AdvertDetails.AdvertisementStyle.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertDetails.AdvertisementStyle.AvitoBlack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertDetails.AdvertisementStyle.AvitoMall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvertDetails.AdvertisementStyle.AvitoBusiness.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f75661a = iArr;
        }
    }

    @Y61.k
    public static AdvertDetailsStyle a(@Y61.k AdvertDetailsFastOpenParams advertDetailsFastOpenParams, @Y61.k AdvertDetails advertDetails) {
        AdvertDetails.AdvertisementStyle advertisementStyle = advertDetails.getAdvertisementStyle();
        return advertisementStyle != null ? b(advertisementStyle) : advertDetailsFastOpenParams.f71332i;
    }

    @Y61.k
    public static AdvertDetailsStyle b(@Y61.k AdvertDetails.AdvertisementStyle advertisementStyle) {
        int i12 = a.f75661a[advertisementStyle.ordinal()];
        if (i12 == 1) {
            return AdvertDetailsStyle.f84409c;
        }
        if (i12 == 2) {
            return AdvertDetailsStyle.f84410d;
        }
        if (i12 == 3) {
            return AdvertDetailsStyle.f84411e;
        }
        if (i12 == 4) {
            return AdvertDetailsStyle.f84412f;
        }
        throw new NoWhenBranchMatchedException();
    }
}
