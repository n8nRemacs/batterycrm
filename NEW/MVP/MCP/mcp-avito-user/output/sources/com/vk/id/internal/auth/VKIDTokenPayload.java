package com.vk.id.internal.auth;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VKIDTokenPayload.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH×\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001f\u0010\u000e¨\u0006 "}, d2 = {"Lcom/vk/id/internal/auth/VKIDTokenPayload;", "", "", "accessToken", "refreshToken", "idToken", "", "expiresIn", ChannelContext.Item.USER_ID, VoiceInfo.STATE, "scope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccessToken", "getRefreshToken", "getIdToken", "J", "getExpiresIn", "()J", "getUserId", "getState", "getScope", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VKIDTokenPayload {

    @k
    private final String accessToken;
    private final long expiresIn;

    @k
    private final String idToken;

    @k
    private final String refreshToken;

    @k
    private final String scope;

    @k
    private final String state;
    private final long userId;

    public VKIDTokenPayload(@k String str, @k String str2, @k String str3, long j12, long j13, @k String str4, @k String str5) {
        this.accessToken = str;
        this.refreshToken = str2;
        this.idToken = str3;
        this.expiresIn = j12;
        this.userId = j13;
        this.state = str4;
        this.scope = str5;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VKIDTokenPayload)) {
            return false;
        }
        VKIDTokenPayload vKIDTokenPayload = (VKIDTokenPayload) other;
        return L.f(this.accessToken, vKIDTokenPayload.accessToken) && L.f(this.refreshToken, vKIDTokenPayload.refreshToken) && L.f(this.idToken, vKIDTokenPayload.idToken) && this.expiresIn == vKIDTokenPayload.expiresIn && this.userId == vKIDTokenPayload.userId && L.f(this.state, vKIDTokenPayload.state) && L.f(this.scope, vKIDTokenPayload.scope);
    }

    @k
    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    @k
    public final String getIdToken() {
        return this.idToken;
    }

    @k
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @k
    public final String getScope() {
        return this.scope;
    }

    @k
    public final String getState() {
        return this.state;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.scope.hashCode() + H.d(r.g(r.g(H.d(H.d(this.accessToken.hashCode() * 31, 31, this.refreshToken), 31, this.idToken), 31, this.expiresIn), 31, this.userId), 31, this.state);
    }

    @k
    public String toString() {
        String str = this.accessToken;
        String str2 = this.refreshToken;
        String str3 = this.idToken;
        long j12 = this.expiresIn;
        long j13 = this.userId;
        String str4 = this.state;
        String str5 = this.scope;
        StringBuilder sbB = C23088b.b("VKIDTokenPayload(accessToken=", str, ", refreshToken=", str2, ", idToken=");
        sbB.append(str3);
        sbB.append(", expiresIn=");
        sbB.append(j12);
        sbB.append(", userId=");
        sbB.append(j13);
        sbB.append(", state=");
        return G.h(sbB, str4, ", scope=", str5, ")");
    }
}
