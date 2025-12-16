package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.remote.model.advertising.AvitoAdType;
import com.avito.android.remote.model.advertising.AvitoTargetingPromoType;
import com.avito.android.remote.model.advertising.AvitoTargetingRawAsset;
import com.avito.android.remote.model.advertising.AvitoTargetingRawConfig;
import com.avito.android.remote.model.advertising.AvitoTargetingRawEventUrls;
import com.avito.android.remote.model.advertising.AvitoTargetingRawResponse;
import com.avito.android.remote.model.advertising.BuzzoolaAdType;
import com.avito.android.remote.model.advertising.BuzzoolaPromoType;
import com.avito.android.remote.model.advertising.BuzzoolaRawAsset;
import com.avito.android.remote.model.advertising.BuzzoolaRawConfig;
import com.avito.android.remote.model.advertising.BuzzoolaRawEventUrls;
import com.avito.android.remote.model.advertising.BuzzoolaRawResponse;
import com.avito.android.remote.model.advertising.PremiumBannerType;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoTargetingBannerMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/r;", "Lcom/avito/android/advertising/loaders/avito_targeting/q;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements q {

    /* compiled from: AvitoTargetingBannerMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88057a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f88058b;

        static {
            int[] iArr = new int[AvitoAdType.values().length];
            try {
                iArr[AvitoAdType.AVITO_DIRECT_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvitoAdType.AVITO_PREMIUM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvitoAdType.AVITO_PREMIUM_BANNER_V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AvitoAdType.AVITO_CREDIT_BUTTON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AvitoAdType.AVITO_VIDEO_LENTA_NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AvitoAdType.AVITO_VIDEO_LENTA_MEDIA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AvitoAdType.AVITO_MAIN_MEDIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AvitoAdType.AVITO_MAIN_HTML.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AvitoAdType.AVITO_DIRECT_BANNER_HTML.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AvitoAdType.AVITO_PREMIUM_MEDIA_X2_BANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f88057a = iArr;
            int[] iArr2 = new int[AvitoTargetingPromoType.values().length];
            try {
                iArr2[AvitoTargetingPromoType.EXTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AvitoTargetingPromoType.SOCIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AvitoTargetingPromoType.INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f88058b = iArr2;
        }
    }

    @Inject
    public r() {
    }

    @Override // com.avito.android.advertising.loaders.avito_targeting.q
    @Y61.k
    public final BuzzoolaRawResponse a(@Y61.k AvitoTargetingRawResponse avitoTargetingRawResponse) {
        BuzzoolaAdType buzzoolaAdType;
        ArrayList arrayList;
        BuzzoolaRawConfig buzzoolaRawConfig;
        BuzzoolaAdType buzzoolaAdType2;
        String adNetworkName = avitoTargetingRawResponse.getAdNetworkName();
        AvitoAdType adType = avitoTargetingRawResponse.getAdType();
        BuzzoolaPromoType buzzoolaPromoType = null;
        if (adType != null) {
            switch (a.f88057a[adType.ordinal()]) {
                case 1:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_DIRECT_BANNER;
                    break;
                case 2:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_PREMIUM_BANNER;
                    break;
                case 3:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_PREMIUM_BANNER_V2;
                    break;
                case 4:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_CREDIT_BUTTON;
                    break;
                case 5:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_VIDEO_LENTA_NATIVE;
                    break;
                case 6:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_VIDEO_LENTA_MEDIA;
                    break;
                case 7:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_MAIN_MEDIA;
                    break;
                case 8:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_MAIN_HTML;
                    break;
                case 9:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_DIRECT_BANNER_HTML;
                    break;
                case 10:
                    buzzoolaAdType2 = BuzzoolaAdType.AVITO_PREMIUM_MEDIA_X2_BANNER;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            buzzoolaAdType = buzzoolaAdType2;
        } else {
            buzzoolaAdType = null;
        }
        List<AvitoTargetingRawAsset> assets = avitoTargetingRawResponse.getAssets();
        if (assets != null) {
            List<AvitoTargetingRawAsset> list = assets;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (AvitoTargetingRawAsset avitoTargetingRawAsset : list) {
                arrayList.add(new BuzzoolaRawAsset(avitoTargetingRawAsset.getType(), avitoTargetingRawAsset.getValue(), avitoTargetingRawAsset.getExt()));
            }
        } else {
            arrayList = null;
        }
        AvitoTargetingRawEventUrls eventUrls = avitoTargetingRawResponse.getEventUrls();
        BuzzoolaRawEventUrls buzzoolaRawEventUrls = eventUrls != null ? new BuzzoolaRawEventUrls(eventUrls.getLoadUrls(), eventUrls.getImpressionUrls(), eventUrls.getClickUrls(), eventUrls.getAvitoImpressionUrls()) : null;
        AvitoTargetingRawConfig config = avitoTargetingRawResponse.getConfig();
        if (config != null) {
            PremiumBannerType bannerType = config.getBannerType();
            String brandSlug = config.getBrandSlug();
            String link = config.getLink();
            String percent = config.getPercent();
            String initialFee = config.getInitialFee();
            String creditTerm = config.getCreditTerm();
            int creativeId = config.getCreativeId();
            String domain = config.getDomain();
            AvitoTargetingPromoType promoType = config.getPromoType();
            if (promoType != null) {
                int i12 = a.f88058b[promoType.ordinal()];
                if (i12 == 1) {
                    buzzoolaPromoType = BuzzoolaPromoType.EXTERNAL;
                } else if (i12 == 2) {
                    buzzoolaPromoType = BuzzoolaPromoType.SOCIAL;
                } else {
                    if (i12 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    buzzoolaPromoType = BuzzoolaPromoType.INTERNAL;
                }
            }
            buzzoolaRawConfig = new BuzzoolaRawConfig(bannerType, brandSlug, link, percent, initialFee, creditTerm, creativeId, domain, buzzoolaPromoType, config.getInfoLink(), config.getBannerStyle());
        } else {
            buzzoolaRawConfig = null;
        }
        return new BuzzoolaRawResponse(adNetworkName, buzzoolaAdType, arrayList, buzzoolaRawEventUrls, buzzoolaRawConfig);
    }
}
