package com.vk.id;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.vk.id.common.InternalVKIDApi;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RefreshToken.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/vk/id/RefreshToken;", "", "", "token", "", "scopes", "<init>", "(Ljava/lang/String;Ljava/util/Set;)V", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "Ljava/util/Set;", "getScopes", "()Ljava/util/Set;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RefreshToken {

    @l
    private final Set<String> scopes;

    @k
    private final String token;

    @InternalVKIDApi
    public RefreshToken(@k String str, @l Set<String> set) {
        this.token = str;
        this.scopes = set;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!RefreshToken.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        RefreshToken refreshToken = (RefreshToken) other;
        return L.f(this.token, refreshToken.token) && L.f(this.scopes, refreshToken.scopes);
    }

    @k
    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int iHashCode = this.token.hashCode() * 31;
        Set<String> set = this.scopes;
        return iHashCode + (set != null ? set.hashCode() : 0);
    }
}
