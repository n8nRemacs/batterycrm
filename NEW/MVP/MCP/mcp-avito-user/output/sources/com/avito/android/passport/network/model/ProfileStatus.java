package com.avito.android.passport.network.model;

import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfilesListResponse.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/network/model/ProfileStatus;", "", "(Ljava/lang/String;I)V", "WARNING", "PENDING", "FINALIZED", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileStatus {

    @c("finalized")
    public static final ProfileStatus FINALIZED;

    @c("pending")
    public static final ProfileStatus PENDING;

    @c(ConstraintKt.WARNING)
    public static final ProfileStatus WARNING;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ProfileStatus[] f211143b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f211144c;

    static {
        ProfileStatus profileStatus = new ProfileStatus("WARNING", 0);
        WARNING = profileStatus;
        ProfileStatus profileStatus2 = new ProfileStatus("PENDING", 1);
        PENDING = profileStatus2;
        ProfileStatus profileStatus3 = new ProfileStatus("FINALIZED", 2);
        FINALIZED = profileStatus3;
        ProfileStatus[] profileStatusArr = {profileStatus, profileStatus2, profileStatus3};
        f211143b = profileStatusArr;
        f211144c = kotlin.enums.c.a(profileStatusArr);
    }

    private ProfileStatus(String str, int i12) {
    }

    public static ProfileStatus valueOf(String str) {
        return (ProfileStatus) Enum.valueOf(ProfileStatus.class, str);
    }

    public static ProfileStatus[] values() {
        return (ProfileStatus[]) f211143b.clone();
    }
}
