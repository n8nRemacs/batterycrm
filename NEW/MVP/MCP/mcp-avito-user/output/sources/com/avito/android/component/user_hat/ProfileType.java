package com.avito.android.component.user_hat;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PassportProfileKonveyor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/ProfileType;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProfileType {

    /* renamed from: b, reason: collision with root package name */
    public static final ProfileType f125289b;

    /* renamed from: c, reason: collision with root package name */
    public static final ProfileType f125290c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ProfileType[] f125291d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f125292e;

    static {
        ProfileType profileType = new ProfileType("DEFAULT", 0);
        f125289b = profileType;
        ProfileType profileType2 = new ProfileType("EMPLOYEE", 1);
        f125290c = profileType2;
        ProfileType[] profileTypeArr = {profileType, profileType2};
        f125291d = profileTypeArr;
        f125292e = kotlin.enums.c.a(profileTypeArr);
    }

    public ProfileType() {
        throw null;
    }

    public static ProfileType valueOf(String str) {
        return (ProfileType) Enum.valueOf(ProfileType.class, str);
    }

    public static ProfileType[] values() {
        return (ProfileType[]) f125291d.clone();
    }
}
