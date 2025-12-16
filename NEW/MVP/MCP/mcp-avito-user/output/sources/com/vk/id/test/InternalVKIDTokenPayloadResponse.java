package com.vk.id.test;

import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InternalVKIDOverrideApi.kt */
@P
@InternalVKIDApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H×\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b \u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b!\u0010\u000f¨\u0006\""}, d2 = {"Lcom/vk/id/test/InternalVKIDTokenPayloadResponse;", "", "", "accessToken", "refreshToken", "idToken", "", "expiresIn", ChannelContext.Item.USER_ID, VoiceInfo.STATE, "error", "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "getRefreshToken", "getIdToken", "Ljava/lang/Long;", "getExpiresIn", "()Ljava/lang/Long;", "getUserId", "getState", "getError", "getScope", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class InternalVKIDTokenPayloadResponse {

    @c("access_token")
    @l
    private final String accessToken;

    @c("error")
    @l
    private final String error;

    @c("expires_in")
    @l
    private final Long expiresIn;

    @c("id_token")
    @l
    private final String idToken;

    @c("refresh_token")
    @l
    private final String refreshToken;

    @c("scope")
    @l
    private final String scope;

    @c(VoiceInfo.STATE)
    @l
    private final String state;

    @c("user_id")
    @l
    private final Long userId;

    public InternalVKIDTokenPayloadResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalVKIDTokenPayloadResponse)) {
            return false;
        }
        InternalVKIDTokenPayloadResponse internalVKIDTokenPayloadResponse = (InternalVKIDTokenPayloadResponse) other;
        return L.f(this.accessToken, internalVKIDTokenPayloadResponse.accessToken) && L.f(this.refreshToken, internalVKIDTokenPayloadResponse.refreshToken) && L.f(this.idToken, internalVKIDTokenPayloadResponse.idToken) && L.f(this.expiresIn, internalVKIDTokenPayloadResponse.expiresIn) && L.f(this.userId, internalVKIDTokenPayloadResponse.userId) && L.f(this.state, internalVKIDTokenPayloadResponse.state) && L.f(this.error, internalVKIDTokenPayloadResponse.error) && L.f(this.scope, internalVKIDTokenPayloadResponse.scope);
    }

    public int hashCode() {
        String str = this.accessToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.refreshToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idToken;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.expiresIn;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.userId;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str4 = this.state;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.error;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.scope;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.idToken;
        Long l12 = this.expiresIn;
        Long l13 = this.userId;
        String str4 = this.state;
        String str5 = this.error;
        String str6 = this.scope;
        StringBuilder sbB = C23088b.b("InternalVKIDTokenPayloadResponse(accessToken=", str, ", refreshToken=", str2, ", idToken=");
        sbB.append(str3);
        sbB.append(", expiresIn=");
        sbB.append(l12);
        sbB.append(", userId=");
        sbB.append(l13);
        sbB.append(", state=");
        sbB.append(str4);
        sbB.append(", error=");
        return G.h(sbB, str5, ", scope=", str6, ")");
    }

    public InternalVKIDTokenPayloadResponse(@l String str, @l String str2, @l String str3, @l Long l12, @l Long l13, @l String str4, @l String str5, @l String str6) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.idToken = str3;
        this.expiresIn = l12;
        this.userId = l13;
        this.state = str4;
        this.error = str5;
        this.scope = str6;
    }

    public /* synthetic */ InternalVKIDTokenPayloadResponse(String str, String str2, String str3, Long l12, Long l13, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : l12, (i12 & 16) != 0 ? null : l13, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : str5, (i12 & 128) == 0 ? str6 : null);
    }
}
