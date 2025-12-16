package Zk0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.profile.generated.api.api_3_internal_banner_rotation_banners_get.InternalBannerPayloadV1;
import kotlin.Metadata;

/* compiled from: Api3InternalBannerRotationBannersGetResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"LZk0/f;", "", "", "closable", "", "closeTimeout", "", "id", "page", "Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1;", "payload", "position", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/lang/Long;", "getCloseTimeout", "()Ljava/lang/Long;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1;", "d", "()Lcom/avito/android/remote/profile/generated/api/api_3_internal_banner_rotation_banners_get/InternalBannerPayloadV1;", "e", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    @com.google.gson.annotations.c("closable")
    @l
    private final Boolean closable;

    @com.google.gson.annotations.c("closeTimeout")
    @l
    private final Long closeTimeout;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("page")
    @k
    private final String page;

    @com.google.gson.annotations.c("payload")
    @l
    private final InternalBannerPayloadV1 payload;

    @com.google.gson.annotations.c("position")
    @k
    private final String position;

    public f(@l Boolean bool, @l Long l12, @k String str, @k String str2, @l InternalBannerPayloadV1 internalBannerPayloadV1, @k String str3) {
        this.closable = bool;
        this.closeTimeout = l12;
        this.id = str;
        this.page = str2;
        this.payload = internalBannerPayloadV1;
        this.position = str3;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Boolean getClosable() {
        return this.closable;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final InternalBannerPayloadV1 getPayload() {
        return this.payload;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getPosition() {
        return this.position;
    }
}
