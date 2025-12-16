package com.avito.android.component.user_hat;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PassportProfileKonveyor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/ProfileStatus;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProfileStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final ProfileStatus f125284b;

    /* renamed from: c, reason: collision with root package name */
    public static final ProfileStatus f125285c;

    /* renamed from: d, reason: collision with root package name */
    public static final ProfileStatus f125286d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ProfileStatus[] f125287e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f125288f;

    static {
        ProfileStatus profileStatus = new ProfileStatus("WARNING", 0);
        f125284b = profileStatus;
        ProfileStatus profileStatus2 = new ProfileStatus("PENDING", 1);
        f125285c = profileStatus2;
        ProfileStatus profileStatus3 = new ProfileStatus("FINALIZED", 2);
        f125286d = profileStatus3;
        ProfileStatus[] profileStatusArr = {profileStatus, profileStatus2, profileStatus3};
        f125287e = profileStatusArr;
        f125288f = kotlin.enums.c.a(profileStatusArr);
    }

    public ProfileStatus() {
        throw null;
    }

    public static ProfileStatus valueOf(String str) {
        return (ProfileStatus) Enum.valueOf(ProfileStatus.class, str);
    }

    public static ProfileStatus[] values() {
        return (ProfileStatus[]) f125287e.clone();
    }
}
