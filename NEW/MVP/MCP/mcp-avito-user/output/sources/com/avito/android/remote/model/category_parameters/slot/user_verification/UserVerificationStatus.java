package com.avito.android.remote.model.category_parameters.slot.user_verification;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserVerificationSlotConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/UserVerificationStatus;", "", "(Ljava/lang/String;I)V", "cannotProceed", "", "Default", "Recover", "Waiting", "Verified", "Unverified", "Blocked", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserVerificationStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserVerificationStatus[] $VALUES;

    @c("not_started")
    public static final UserVerificationStatus Default = new UserVerificationStatus("Default", 0);

    @c("recover")
    public static final UserVerificationStatus Recover = new UserVerificationStatus("Recover", 1);

    @c("waiting")
    public static final UserVerificationStatus Waiting = new UserVerificationStatus("Waiting", 2);

    @c("verified")
    public static final UserVerificationStatus Verified = new UserVerificationStatus("Verified", 3);

    @c("unverified")
    public static final UserVerificationStatus Unverified = new UserVerificationStatus("Unverified", 4);

    @c("blocked")
    public static final UserVerificationStatus Blocked = new UserVerificationStatus("Blocked", 5);

    private static final /* synthetic */ UserVerificationStatus[] $values() {
        return new UserVerificationStatus[]{Default, Recover, Waiting, Verified, Unverified, Blocked};
    }

    static {
        UserVerificationStatus[] userVerificationStatusArr$values = $values();
        $VALUES = userVerificationStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(userVerificationStatusArr$values);
    }

    private UserVerificationStatus(String str, int i12) {
    }

    @k
    public static a<UserVerificationStatus> getEntries() {
        return $ENTRIES;
    }

    public static UserVerificationStatus valueOf(String str) {
        return (UserVerificationStatus) Enum.valueOf(UserVerificationStatus.class, str);
    }

    public static UserVerificationStatus[] values() {
        return (UserVerificationStatus[]) $VALUES.clone();
    }

    public final boolean cannotProceed() {
        return this == Unverified || this == Blocked;
    }
}
