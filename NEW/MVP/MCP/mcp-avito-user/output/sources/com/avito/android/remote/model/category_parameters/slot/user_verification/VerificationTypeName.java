package com.avito.android.remote.model.category_parameters.slot.user_verification;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserVerificationSlotConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/user_verification/VerificationTypeName;", "", "(Ljava/lang/String;I)V", "UserVerification", "ProUserVerification", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationTypeName {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VerificationTypeName[] $VALUES;

    @c("userVerification")
    public static final VerificationTypeName UserVerification = new VerificationTypeName("UserVerification", 0);

    @c("proUserVerification")
    public static final VerificationTypeName ProUserVerification = new VerificationTypeName("ProUserVerification", 1);

    private static final /* synthetic */ VerificationTypeName[] $values() {
        return new VerificationTypeName[]{UserVerification, ProUserVerification};
    }

    static {
        VerificationTypeName[] verificationTypeNameArr$values = $values();
        $VALUES = verificationTypeNameArr$values;
        $ENTRIES = kotlin.enums.c.a(verificationTypeNameArr$values);
    }

    private VerificationTypeName(String str, int i12) {
    }

    @k
    public static a<VerificationTypeName> getEntries() {
        return $ENTRIES;
    }

    public static VerificationTypeName valueOf(String str) {
        return (VerificationTypeName) Enum.valueOf(VerificationTypeName.class, str);
    }

    public static VerificationTypeName[] values() {
        return (VerificationTypeName[]) $VALUES.clone();
    }
}
