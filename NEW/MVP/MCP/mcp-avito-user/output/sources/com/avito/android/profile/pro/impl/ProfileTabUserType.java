package com.avito.android.profile.pro.impl;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfileTabUserType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/ProfileTabUserType;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileTabUserType {

    /* renamed from: b, reason: collision with root package name */
    public static final ProfileTabUserType f222434b;

    /* renamed from: c, reason: collision with root package name */
    public static final ProfileTabUserType f222435c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ProfileTabUserType[] f222436d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f222437e;

    static {
        ProfileTabUserType profileTabUserType = new ProfileTabUserType("PRIVATE", 0);
        f222434b = profileTabUserType;
        ProfileTabUserType profileTabUserType2 = new ProfileTabUserType("PRO", 1);
        f222435c = profileTabUserType2;
        ProfileTabUserType[] profileTabUserTypeArr = {profileTabUserType, profileTabUserType2};
        f222436d = profileTabUserTypeArr;
        f222437e = kotlin.enums.c.a(profileTabUserTypeArr);
    }

    public ProfileTabUserType() {
        throw null;
    }

    public static ProfileTabUserType valueOf(String str) {
        return (ProfileTabUserType) Enum.valueOf(ProfileTabUserType.class, str);
    }

    public static ProfileTabUserType[] values() {
        return (ProfileTabUserType[]) f222436d.clone();
    }
}
