package com.avito.android.profile.user_profile;

import Zk0.C19572b;
import Zk0.C19573c;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.promoblock.TnsPromoBlockItem;
import com.avito.android.remote.profile.generated.api.api_3_internal_banner_rotation_banners_get.InternalBannerPayloadV1;
import com.avito.android.remote.profile.generated.api.api_3_internal_banner_rotation_banners_get.InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest;
import com.avito.android.service.short_task.ShortTask;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: UserProfileBannerConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/e;", "Lcom/avito/android/profile/user_profile/d;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile.user_profile.e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33386e implements InterfaceC33369d {

    /* compiled from: UserProfileBannerConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.user_profile.e$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f226144a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f226145b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f226146c;

        static {
            int[] iArr = new int[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.BackoffPolicy.values().length];
            try {
                iArr[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.BackoffPolicy.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.BackoffPolicy.EXPONENTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f226144a = iArr;
            int[] iArr2 = new int[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.RequiredNetworkState.values().length];
            try {
                iArr2[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.RequiredNetworkState.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.RequiredNetworkState.METERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.RequiredNetworkState.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.RequiredNetworkState.NOTROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.RequiredNetworkState.TEMPORARILYUNMETERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.RequiredNetworkState.NOTREQUIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            f226145b = iArr2;
            int[] iArr3 = new int[InternalBannerPayloadV1.Style.values().length];
            try {
                iArr3[InternalBannerPayloadV1.Style.White.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[InternalBannerPayloadV1.Style.Blue.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[InternalBannerPayloadV1.Style.Green.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[InternalBannerPayloadV1.Style.Red.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[InternalBannerPayloadV1.Style.Orange.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[InternalBannerPayloadV1.Style.Beige.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[InternalBannerPayloadV1.Style.Violet.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            f226146c = iArr3;
        }
    }

    @Inject
    public C33386e() {
    }

    public static CardItem.SilentUpdateSettings c(InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest internalBannerSpecificParamAndroidDownloadUpdateConfigRequest) {
        ShortTask.BackoffPolicy backoffPolicy;
        ShortTask.NetworkState networkState;
        InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.RequiredNetworkState requiredNetworkState;
        Long initialDelayMs;
        InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest.BackoffPolicy backoffPolicy2;
        Long backoffDelayMs;
        long jLongValue = (internalBannerSpecificParamAndroidDownloadUpdateConfigRequest == null || (backoffDelayMs = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getBackoffDelayMs()) == null) ? 30000L : backoffDelayMs.longValue();
        if (internalBannerSpecificParamAndroidDownloadUpdateConfigRequest == null || (backoffPolicy2 = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getBackoffPolicy()) == null) {
            backoffPolicy = ShortTask.BackoffPolicy.f274019b;
        } else {
            int i12 = a.f226144a[backoffPolicy2.ordinal()];
            if (i12 == 1) {
                backoffPolicy = ShortTask.BackoffPolicy.f274020c;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                backoffPolicy = ShortTask.BackoffPolicy.f274019b;
            }
        }
        Long flexIntervalMs = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest != null ? internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getFlexIntervalMs() : null;
        long jLongValue2 = (internalBannerSpecificParamAndroidDownloadUpdateConfigRequest == null || (initialDelayMs = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getInitialDelayMs()) == null) ? 1000L : initialDelayMs.longValue();
        boolean z12 = !(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest != null ? L.f(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getIsBatteryNotLowRequired(), Boolean.FALSE) : false);
        boolean z13 = !(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest != null ? L.f(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getIsChargingRequired(), Boolean.FALSE) : false);
        boolean zF2 = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest != null ? L.f(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getIsDeviceIdleRequired(), Boolean.TRUE) : false;
        boolean z14 = !(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest != null ? L.f(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getIsStorageNotLowRequired(), Boolean.FALSE) : false);
        Long repeatIntervalMs = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest != null ? internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getRepeatIntervalMs() : null;
        if (internalBannerSpecificParamAndroidDownloadUpdateConfigRequest == null || (requiredNetworkState = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getRequiredNetworkState()) == null) {
            networkState = ShortTask.NetworkState.f274025d;
        } else {
            switch (a.f226145b[requiredNetworkState.ordinal()]) {
                case 1:
                    networkState = ShortTask.NetworkState.f274024c;
                    break;
                case 2:
                    networkState = ShortTask.NetworkState.f274027f;
                    break;
                case 3:
                    networkState = ShortTask.NetworkState.f274025d;
                    break;
                case 4:
                    networkState = ShortTask.NetworkState.f274026e;
                    break;
                case 5:
                case 6:
                    networkState = ShortTask.NetworkState.f274023b;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return new CardItem.SilentUpdateSettings(jLongValue, backoffPolicy, flexIntervalMs, jLongValue2, z12, z13, zF2, z14, repeatIntervalMs, networkState, !(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest != null ? L.f(internalBannerSpecificParamAndroidDownloadUpdateConfigRequest.getUpdateCurrent(), Boolean.FALSE) : false));
    }

    @Override // com.avito.android.profile.user_profile.InterfaceC33369d
    @Y61.k
    public final CardItem.PromoBlockItem a(@Y61.k Zk0.f fVar) {
        TnsPromoBlockItem.Style style;
        TnsPromoBlockItem.Button button;
        TnsPromoBlockItem.Button button2;
        C19572b secondaryAction;
        DeepLink uri;
        C19572b secondaryAction2;
        C19572b action;
        DeepLink uri2;
        C19572b action2;
        String id2 = fVar.getId();
        String position = fVar.getPosition();
        InternalBannerPayloadV1 payload = fVar.getPayload();
        String title = null;
        String title2 = payload != null ? payload.getTitle() : null;
        String str = title2 == null ? "" : title2;
        InternalBannerPayloadV1 payload2 = fVar.getPayload();
        String text = payload2 != null ? payload2.getText() : null;
        String str2 = text == null ? "" : text;
        InternalBannerPayloadV1 payload3 = fVar.getPayload();
        InternalBannerPayloadV1.Style style2 = payload3 != null ? payload3.getStyle() : null;
        switch (style2 == null ? -1 : a.f226146c[style2.ordinal()]) {
            case 1:
                style = TnsPromoBlockItem.Style.f231760b;
                break;
            case 2:
                style = TnsPromoBlockItem.Style.f231761c;
                break;
            case 3:
                style = TnsPromoBlockItem.Style.f231762d;
                break;
            case 4:
                style = TnsPromoBlockItem.Style.f231763e;
                break;
            case 5:
                style = TnsPromoBlockItem.Style.f231764f;
                break;
            case 6:
                style = TnsPromoBlockItem.Style.f231765g;
                break;
            case 7:
                style = TnsPromoBlockItem.Style.f231766h;
                break;
            default:
                style = TnsPromoBlockItem.Style.f231761c;
                break;
        }
        TnsPromoBlockItem.Style style3 = style;
        Boolean closable = fVar.getClosable();
        boolean zBooleanValue = closable != null ? closable.booleanValue() : false;
        Boolean closable2 = fVar.getClosable();
        boolean zBooleanValue2 = closable2 != null ? closable2.booleanValue() : false;
        String page = fVar.getPage();
        InternalBannerPayloadV1 payload4 = fVar.getPayload();
        if (payload4 == null || (action = payload4.getAction()) == null || (uri2 = action.getUri()) == null) {
            button = null;
        } else {
            InternalBannerPayloadV1 payload5 = fVar.getPayload();
            String title3 = (payload5 == null || (action2 = payload5.getAction()) == null) ? null : action2.getTitle();
            button = new TnsPromoBlockItem.Button(title3 == null ? "" : title3, uri2, false, 4, null);
        }
        InternalBannerPayloadV1 payload6 = fVar.getPayload();
        if (payload6 == null || (secondaryAction = payload6.getSecondaryAction()) == null || (uri = secondaryAction.getUri()) == null) {
            button2 = null;
        } else {
            InternalBannerPayloadV1 payload7 = fVar.getPayload();
            if (payload7 != null && (secondaryAction2 = payload7.getSecondaryAction()) != null) {
                title = secondaryAction2.getTitle();
            }
            button2 = new TnsPromoBlockItem.Button(title == null ? "" : title, uri, false, 4, null);
        }
        return new CardItem.PromoBlockItem(id2, position, str, str2, null, style3, zBooleanValue, zBooleanValue2, null, button, button2, page, 272, null);
    }

    @Override // com.avito.android.profile.user_profile.InterfaceC33369d
    @Y61.k
    public final CardItem.SilentUpdateItem b(@Y61.k Zk0.f fVar) {
        List<String> listB;
        C19573c androidDownloadUpdateConfig;
        C19573c androidDownloadUpdateConfig2;
        Zk0.d specificParams;
        CardItem.PromoBlockItem promoBlockItemA = a(fVar);
        InternalBannerPayloadV1 payload = fVar.getPayload();
        InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest periodicDownloadRequest = null;
        Zk0.e selfUpdateBannerSpecificParams = (payload == null || (specificParams = payload.getSpecificParams()) == null) ? null : specificParams.getSelfUpdateBannerSpecificParams();
        boolean zF2 = selfUpdateBannerSpecificParams != null ? L.f(selfUpdateBannerSpecificParams.getPeriodicDownloadDisabled(), Boolean.TRUE) : false;
        String maxVersion = selfUpdateBannerSpecificParams != null ? selfUpdateBannerSpecificParams.getMaxVersion() : null;
        if (selfUpdateBannerSpecificParams == null || (listB = selfUpdateBannerSpecificParams.b()) == null) {
            listB = C42784z0.f406748b;
        }
        List<String> list = listB;
        CardItem.SilentUpdateSettings silentUpdateSettingsC = c((selfUpdateBannerSpecificParams == null || (androidDownloadUpdateConfig2 = selfUpdateBannerSpecificParams.getAndroidDownloadUpdateConfig()) == null) ? null : androidDownloadUpdateConfig2.getOneTimeDownloadRequest());
        if (selfUpdateBannerSpecificParams != null && (androidDownloadUpdateConfig = selfUpdateBannerSpecificParams.getAndroidDownloadUpdateConfig()) != null) {
            periodicDownloadRequest = androidDownloadUpdateConfig.getPeriodicDownloadRequest();
        }
        return new CardItem.SilentUpdateItem(promoBlockItemA, new CardItem.SilentUpdateConfig(zF2, maxVersion, list, silentUpdateSettingsC, c(periodicDownloadRequest)));
    }
}
