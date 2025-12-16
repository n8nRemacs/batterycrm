package com.avito.android.remote.model;

import Y61.k;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthSocialsStatusResult.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/AuthSocialInteractionStatus;", "", "(Ljava/lang/String;I)V", "VISIBLE", "DISABLED", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AuthSocialInteractionStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AuthSocialInteractionStatus[] $VALUES;

    @c("visible")
    public static final AuthSocialInteractionStatus VISIBLE = new AuthSocialInteractionStatus("VISIBLE", 0);

    @c(BeduinCartItemModel.DISABLED_STRING)
    public static final AuthSocialInteractionStatus DISABLED = new AuthSocialInteractionStatus("DISABLED", 1);

    private static final /* synthetic */ AuthSocialInteractionStatus[] $values() {
        return new AuthSocialInteractionStatus[]{VISIBLE, DISABLED};
    }

    static {
        AuthSocialInteractionStatus[] authSocialInteractionStatusArr$values = $values();
        $VALUES = authSocialInteractionStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(authSocialInteractionStatusArr$values);
    }

    private AuthSocialInteractionStatus(String str, int i12) {
    }

    @k
    public static a<AuthSocialInteractionStatus> getEntries() {
        return $ENTRIES;
    }

    public static AuthSocialInteractionStatus valueOf(String str) {
        return (AuthSocialInteractionStatus) Enum.valueOf(AuthSocialInteractionStatus.class, str);
    }

    public static AuthSocialInteractionStatus[] values() {
        return (AuthSocialInteractionStatus[]) $VALUES.clone();
    }
}
