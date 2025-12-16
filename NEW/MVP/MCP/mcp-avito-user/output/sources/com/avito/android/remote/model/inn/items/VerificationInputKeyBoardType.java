package com.avito.android.remote.model.inn.items;

import Y61.k;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationInputKeyBoardType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/inn/items/VerificationInputKeyBoardType;", "", "(Ljava/lang/String;I)V", "NUMERIC", "PLAIN", "DECIMAL", "EMAIL", "PHONE_NUMBER", "DEFAULT", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationInputKeyBoardType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VerificationInputKeyBoardType[] $VALUES;

    @c(NumericParameter.TYPE)
    public static final VerificationInputKeyBoardType NUMERIC = new VerificationInputKeyBoardType("NUMERIC", 0);

    @c("plain")
    public static final VerificationInputKeyBoardType PLAIN = new VerificationInputKeyBoardType("PLAIN", 1);

    @c("decimal")
    public static final VerificationInputKeyBoardType DECIMAL = new VerificationInputKeyBoardType("DECIMAL", 2);

    @c("email")
    public static final VerificationInputKeyBoardType EMAIL = new VerificationInputKeyBoardType("EMAIL", 3);

    @c("phoneNumber")
    public static final VerificationInputKeyBoardType PHONE_NUMBER = new VerificationInputKeyBoardType("PHONE_NUMBER", 4);

    @c("default")
    public static final VerificationInputKeyBoardType DEFAULT = new VerificationInputKeyBoardType("DEFAULT", 5);

    private static final /* synthetic */ VerificationInputKeyBoardType[] $values() {
        return new VerificationInputKeyBoardType[]{NUMERIC, PLAIN, DECIMAL, EMAIL, PHONE_NUMBER, DEFAULT};
    }

    static {
        VerificationInputKeyBoardType[] verificationInputKeyBoardTypeArr$values = $values();
        $VALUES = verificationInputKeyBoardTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(verificationInputKeyBoardTypeArr$values);
    }

    private VerificationInputKeyBoardType(String str, int i12) {
    }

    @k
    public static a<VerificationInputKeyBoardType> getEntries() {
        return $ENTRIES;
    }

    public static VerificationInputKeyBoardType valueOf(String str) {
        return (VerificationInputKeyBoardType) Enum.valueOf(VerificationInputKeyBoardType.class, str);
    }

    public static VerificationInputKeyBoardType[] values() {
        return (VerificationInputKeyBoardType[]) $VALUES.clone();
    }
}
