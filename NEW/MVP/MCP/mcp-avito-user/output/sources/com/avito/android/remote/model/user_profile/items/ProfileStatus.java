package com.avito.android.remote.model.user_profile.items;

import Y61.k;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PassportItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/ProfileStatus;", "", "(Ljava/lang/String;I)V", "WARNING", "PENDING", "FINALIZED", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ProfileStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ProfileStatus[] $VALUES;

    @c(ConstraintKt.WARNING)
    public static final ProfileStatus WARNING = new ProfileStatus("WARNING", 0);

    @c("pending")
    public static final ProfileStatus PENDING = new ProfileStatus("PENDING", 1);

    @c("finalized")
    public static final ProfileStatus FINALIZED = new ProfileStatus("FINALIZED", 2);

    private static final /* synthetic */ ProfileStatus[] $values() {
        return new ProfileStatus[]{WARNING, PENDING, FINALIZED};
    }

    static {
        ProfileStatus[] profileStatusArr$values = $values();
        $VALUES = profileStatusArr$values;
        $ENTRIES = kotlin.enums.c.a(profileStatusArr$values);
    }

    private ProfileStatus(String str, int i12) {
    }

    @k
    public static a<ProfileStatus> getEntries() {
        return $ENTRIES;
    }

    public static ProfileStatus valueOf(String str) {
        return (ProfileStatus) Enum.valueOf(ProfileStatus.class, str);
    }

    public static ProfileStatus[] values() {
        return (ProfileStatus[]) $VALUES.clone();
    }
}
