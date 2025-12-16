package com.vk.id.auth;

import X41.j;
import Y61.k;
import Y61.l;
import androidx.camera.core.Q;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuthCodeData.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/vk/id/auth/AuthCodeData;", "", "", "code", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getCode", "getDeviceId", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthCodeData {

    @k
    private final String code;

    @k
    private final String deviceId;

    @j
    public AuthCodeData(@k String str, @k String str2) {
        this.code = str;
        this.deviceId = str2;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!AuthCodeData.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        AuthCodeData authCodeData = (AuthCodeData) other;
        return L.f(this.code, authCodeData.code) && L.f(this.deviceId, authCodeData.deviceId);
    }

    public int hashCode() {
        return this.deviceId.hashCode() + (this.code.hashCode() * 31);
    }

    @k
    public String toString() {
        return Q.a("AuthCodeData(code='", this.code, "', deviceId='", this.deviceId, "')");
    }

    public /* synthetic */ AuthCodeData(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? "" : str2);
    }
}
