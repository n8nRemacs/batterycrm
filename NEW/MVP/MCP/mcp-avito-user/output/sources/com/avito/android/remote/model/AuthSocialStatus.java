package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuthSocialsStatusResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/AuthSocialStatus;", "", "provider", "", "status", "Lcom/avito/android/remote/model/AuthSocialInteractionStatus;", "disabledUserDialog", "Lcom/avito/android/remote/model/UserDialog;", "(Ljava/lang/String;Lcom/avito/android/remote/model/AuthSocialInteractionStatus;Lcom/avito/android/remote/model/UserDialog;)V", "getDisabledUserDialog", "()Lcom/avito/android/remote/model/UserDialog;", "getProvider", "()Ljava/lang/String;", "getStatus", "()Lcom/avito/android/remote/model/AuthSocialInteractionStatus;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AuthSocialStatus {

    @c("userDialog")
    @l
    private final UserDialog disabledUserDialog;

    @c("provider")
    @k
    private final String provider;

    @c("status")
    @k
    private final AuthSocialInteractionStatus status;

    public AuthSocialStatus(@k String str, @k AuthSocialInteractionStatus authSocialInteractionStatus, @l UserDialog userDialog) {
        this.provider = str;
        this.status = authSocialInteractionStatus;
        this.disabledUserDialog = userDialog;
    }

    public static /* synthetic */ AuthSocialStatus copy$default(AuthSocialStatus authSocialStatus, String str, AuthSocialInteractionStatus authSocialInteractionStatus, UserDialog userDialog, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = authSocialStatus.provider;
        }
        if ((i12 & 2) != 0) {
            authSocialInteractionStatus = authSocialStatus.status;
        }
        if ((i12 & 4) != 0) {
            userDialog = authSocialStatus.disabledUserDialog;
        }
        return authSocialStatus.copy(str, authSocialInteractionStatus, userDialog);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AuthSocialInteractionStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UserDialog getDisabledUserDialog() {
        return this.disabledUserDialog;
    }

    @k
    public final AuthSocialStatus copy(@k String provider, @k AuthSocialInteractionStatus status, @l UserDialog disabledUserDialog) {
        return new AuthSocialStatus(provider, status, disabledUserDialog);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthSocialStatus)) {
            return false;
        }
        AuthSocialStatus authSocialStatus = (AuthSocialStatus) other;
        return L.f(this.provider, authSocialStatus.provider) && this.status == authSocialStatus.status && L.f(this.disabledUserDialog, authSocialStatus.disabledUserDialog);
    }

    @l
    public final UserDialog getDisabledUserDialog() {
        return this.disabledUserDialog;
    }

    @k
    public final String getProvider() {
        return this.provider;
    }

    @k
    public final AuthSocialInteractionStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = (this.status.hashCode() + (this.provider.hashCode() * 31)) * 31;
        UserDialog userDialog = this.disabledUserDialog;
        return iHashCode + (userDialog == null ? 0 : userDialog.hashCode());
    }

    @k
    public String toString() {
        return "AuthSocialStatus(provider=" + this.provider + ", status=" + this.status + ", disabledUserDialog=" + this.disabledUserDialog + ')';
    }

    public /* synthetic */ AuthSocialStatus(String str, AuthSocialInteractionStatus authSocialInteractionStatus, UserDialog userDialog, int i12, C42822w c42822w) {
        this(str, authSocialInteractionStatus, (i12 & 4) != 0 ? null : userDialog);
    }
}
