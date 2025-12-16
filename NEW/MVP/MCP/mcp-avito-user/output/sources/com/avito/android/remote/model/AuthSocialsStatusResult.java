package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuthSocialsStatusResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/AuthSocialsStatusResult;", "", "socials", "", "Lcom/avito/android/remote/model/AuthSocialStatus;", "(Ljava/util/List;)V", "getSocials", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AuthSocialsStatusResult {

    @c("socials")
    @k
    private final List<AuthSocialStatus> socials;

    public AuthSocialsStatusResult(@k List<AuthSocialStatus> list) {
        this.socials = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AuthSocialsStatusResult copy$default(AuthSocialsStatusResult authSocialsStatusResult, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = authSocialsStatusResult.socials;
        }
        return authSocialsStatusResult.copy(list);
    }

    @k
    public final List<AuthSocialStatus> component1() {
        return this.socials;
    }

    @k
    public final AuthSocialsStatusResult copy(@k List<AuthSocialStatus> socials) {
        return new AuthSocialsStatusResult(socials);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AuthSocialsStatusResult) && L.f(this.socials, ((AuthSocialsStatusResult) other).socials);
    }

    @k
    public final List<AuthSocialStatus> getSocials() {
        return this.socials;
    }

    public int hashCode() {
        return this.socials.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("AuthSocialsStatusResult(socials="), this.socials, ')');
    }
}
