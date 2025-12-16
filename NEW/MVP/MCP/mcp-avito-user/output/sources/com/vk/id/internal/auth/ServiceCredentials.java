package com.vk.id.internal.auth;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceCredentials.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/vk/id/internal/auth/ServiceCredentials;", "", "", "clientID", "clientSecret", "redirectUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getClientID", "getClientSecret", "getRedirectUri", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ServiceCredentials {

    @k
    private final String clientID;

    @k
    private final String clientSecret;

    @k
    private final String redirectUri;

    public ServiceCredentials(@k String str, @k String str2, @k String str3) {
        this.clientID = str;
        this.clientSecret = str2;
        this.redirectUri = str3;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceCredentials)) {
            return false;
        }
        ServiceCredentials serviceCredentials = (ServiceCredentials) other;
        return L.f(this.clientID, serviceCredentials.clientID) && L.f(this.clientSecret, serviceCredentials.clientSecret) && L.f(this.redirectUri, serviceCredentials.redirectUri);
    }

    @k
    public final String getClientID() {
        return this.clientID;
    }

    @k
    public final String getClientSecret() {
        return this.clientSecret;
    }

    @k
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public int hashCode() {
        return this.redirectUri.hashCode() + H.d(this.clientID.hashCode() * 31, 31, this.clientSecret);
    }

    @k
    public String toString() {
        String str = this.clientID;
        String str2 = this.clientSecret;
        return AK.c.s(C23088b.b("ServiceCredentials(clientID=", str, ", clientSecret=", str2, ", redirectUri="), this.redirectUri, ")");
    }
}
