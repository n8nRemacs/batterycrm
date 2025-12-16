package com.avito.android.remote.model.advert_details;

import Y61.k;
import com.avito.android.remote.model.UserTypeCode;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserIconType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/advert_details/UserIconType;", "", "(Ljava/lang/String;I)V", "PRIVATE", "COMPANY", "SHOP", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserIconType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserIconType[] $VALUES;

    @c(UserTypeCode.PRIVATE)
    public static final UserIconType PRIVATE = new UserIconType("PRIVATE", 0);

    @c(UserTypeCode.COMPANY)
    public static final UserIconType COMPANY = new UserIconType("COMPANY", 1);

    @c("shop")
    public static final UserIconType SHOP = new UserIconType("SHOP", 2);

    private static final /* synthetic */ UserIconType[] $values() {
        return new UserIconType[]{PRIVATE, COMPANY, SHOP};
    }

    static {
        UserIconType[] userIconTypeArr$values = $values();
        $VALUES = userIconTypeArr$values;
        $ENTRIES = kotlin.enums.c.a(userIconTypeArr$values);
    }

    private UserIconType(String str, int i12) {
    }

    @k
    public static a<UserIconType> getEntries() {
        return $ENTRIES;
    }

    public static UserIconType valueOf(String str) {
        return (UserIconType) Enum.valueOf(UserIconType.class, str);
    }

    public static UserIconType[] values() {
        return (UserIconType[]) $VALUES.clone();
    }
}
