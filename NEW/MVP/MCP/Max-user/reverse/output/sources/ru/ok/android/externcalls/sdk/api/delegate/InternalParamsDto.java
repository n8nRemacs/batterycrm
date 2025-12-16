package ru.ok.android.externcalls.sdk.api.delegate;

import defpackage.az1;
import defpackage.fni;
import defpackage.ho7;
import defpackage.u45;
import defpackage.wy1;
import defpackage.xrf;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\u0006\u0010\"\u001a\u00020\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/api/delegate/InternalParamsDto;", "", CallAnalyticsApiRequest.KEY_PLATFORM, "", "sdkVersion", "clientAppKey", "deviceId", ApiProtocol.PARAM_PROTOCOL_VERSION, "", ApiProtocol.PARAM_DOMAIN_ID, "onlyAdminCanRecord", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V", "getClientAppKey", "()Ljava/lang/String;", "getDeviceId", "getDomainId", "getOnlyAdminCanRecord", "()Z", "getPlatform", "getProtocolVersion", "()I", "getSdkVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toJson", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InternalParamsDto {
    private final String clientAppKey;
    private final String deviceId;
    private final String domainId;
    private final boolean onlyAdminCanRecord;
    private final String platform;
    private final int protocolVersion;
    private final String sdkVersion;

    public InternalParamsDto(String str, String str2, String str3, String str4, int i, String str5, boolean z) {
        this.platform = str;
        this.sdkVersion = str2;
        this.clientAppKey = str3;
        this.deviceId = str4;
        this.protocolVersion = i;
        this.domainId = str5;
        this.onlyAdminCanRecord = z;
    }

    public static /* synthetic */ InternalParamsDto copy$default(InternalParamsDto internalParamsDto, String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = internalParamsDto.platform;
        }
        if ((i2 & 2) != 0) {
            str2 = internalParamsDto.sdkVersion;
        }
        if ((i2 & 4) != 0) {
            str3 = internalParamsDto.clientAppKey;
        }
        if ((i2 & 8) != 0) {
            str4 = internalParamsDto.deviceId;
        }
        if ((i2 & 16) != 0) {
            i = internalParamsDto.protocolVersion;
        }
        if ((i2 & 32) != 0) {
            str5 = internalParamsDto.domainId;
        }
        if ((i2 & 64) != 0) {
            z = internalParamsDto.onlyAdminCanRecord;
        }
        String str6 = str5;
        boolean z2 = z;
        int i3 = i;
        String str7 = str3;
        return internalParamsDto.copy(str, str2, str7, str4, i3, str6, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientAppKey() {
        return this.clientAppKey;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDomainId() {
        return this.domainId;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getOnlyAdminCanRecord() {
        return this.onlyAdminCanRecord;
    }

    public final InternalParamsDto copy(String platform, String sdkVersion, String clientAppKey, String deviceId, int protocolVersion, String domainId, boolean onlyAdminCanRecord) {
        return new InternalParamsDto(platform, sdkVersion, clientAppKey, deviceId, protocolVersion, domainId, onlyAdminCanRecord);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalParamsDto)) {
            return false;
        }
        InternalParamsDto internalParamsDto = (InternalParamsDto) other;
        return fni.a(this.platform, internalParamsDto.platform) && fni.a(this.sdkVersion, internalParamsDto.sdkVersion) && fni.a(this.clientAppKey, internalParamsDto.clientAppKey) && fni.a(this.deviceId, internalParamsDto.deviceId) && this.protocolVersion == internalParamsDto.protocolVersion && fni.a(this.domainId, internalParamsDto.domainId) && this.onlyAdminCanRecord == internalParamsDto.onlyAdminCanRecord;
    }

    public final String getClientAppKey() {
        return this.clientAppKey;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDomainId() {
        return this.domainId;
    }

    public final boolean getOnlyAdminCanRecord() {
        return this.onlyAdminCanRecord;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final int getProtocolVersion() {
        return this.protocolVersion;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        int iE = u45.e(this.platform.hashCode() * 31, 31, this.sdkVersion);
        String str = this.clientAppKey;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceId;
        int iK = xrf.k(this.protocolVersion, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.domainId;
        return Boolean.hashCode(this.onlyAdminCanRecord) + ((iK + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toJson() {
        return new JSONObject().put(CallAnalyticsApiRequest.KEY_PLATFORM, this.platform).put("sdkVersion", this.sdkVersion).putOpt("clientAppKey", this.clientAppKey).putOpt("deviceId", this.deviceId).put(ApiProtocol.PARAM_PROTOCOL_VERSION, this.protocolVersion).putOpt(ApiProtocol.PARAM_DOMAIN_ID, this.domainId).put("onlyAdminCanRecord", this.onlyAdminCanRecord).toString();
    }

    public String toString() {
        String str = this.platform;
        String str2 = this.sdkVersion;
        String str3 = this.clientAppKey;
        String str4 = this.deviceId;
        int i = this.protocolVersion;
        String str5 = this.domainId;
        boolean z = this.onlyAdminCanRecord;
        StringBuilder sbL = wy1.l("InternalParamsDto(platform=", str, ", sdkVersion=", str2, ", clientAppKey=");
        ho7.r(sbL, str3, ", deviceId=", str4, ", protocolVersion=");
        sbL.append(i);
        sbL.append(", domainId=");
        sbL.append(str5);
        sbL.append(", onlyAdminCanRecord=");
        return az1.k(sbL, z, ")");
    }
}
