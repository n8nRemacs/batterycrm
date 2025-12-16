package Zk0;

import Y61.l;
import com.avito.android.remote.profile.generated.api.api_3_internal_banner_rotation_banners_get.InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest;
import kotlin.Metadata;

/* compiled from: Api3InternalBannerRotationBannersGetResponse.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LZk0/c;", "", "Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest;", "oneTimeDownloadRequest", "periodicDownloadRequest", "<init>", "(Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest;Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest;)V", "Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest;", "a", "()Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest;", "b", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zk0.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C19573c {

    @com.google.gson.annotations.c("oneTimeDownloadRequest")
    @l
    private final InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest oneTimeDownloadRequest;

    @com.google.gson.annotations.c("periodicDownloadRequest")
    @l
    private final InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest periodicDownloadRequest;

    public C19573c(@l InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest internalBannerSpecificParamAndroidDownloadUpdateConfigRequest, @l InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest internalBannerSpecificParamAndroidDownloadUpdateConfigRequest2) {
        this.oneTimeDownloadRequest = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest;
        this.periodicDownloadRequest = internalBannerSpecificParamAndroidDownloadUpdateConfigRequest2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest getOneTimeDownloadRequest() {
        return this.oneTimeDownloadRequest;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final InternalBannerSpecificParamAndroidDownloadUpdateConfigRequest getPeriodicDownloadRequest() {
        return this.periodicDownloadRequest;
    }
}
