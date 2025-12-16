package com.avito.android.profile.pro;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProArguments.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/ProfileProArguments;", "Landroid/os/Parcelable;", "a", "StartScreen", "UserType", "_avito_profile-pro_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProArguments implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final StartScreen f222423b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UserType f222424c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f222422d = new a(null);

    @k
    public static final Parcelable.Creator<ProfileProArguments> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileProArguments.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/ProfileProArguments$StartScreen;", "", "_avito_profile-pro_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartScreen {

        /* renamed from: b, reason: collision with root package name */
        public static final StartScreen f222425b;

        /* renamed from: c, reason: collision with root package name */
        public static final StartScreen f222426c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ StartScreen[] f222427d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f222428e;

        static {
            StartScreen startScreen = new StartScreen("NONE", 0);
            f222425b = startScreen;
            StartScreen startScreen2 = new StartScreen("CALL_SETTINGS", 1);
            f222426c = startScreen2;
            StartScreen[] startScreenArr = {startScreen, startScreen2};
            f222427d = startScreenArr;
            f222428e = c.a(startScreenArr);
        }

        public StartScreen() {
            throw null;
        }

        public static StartScreen valueOf(String str) {
            return (StartScreen) Enum.valueOf(StartScreen.class, str);
        }

        public static StartScreen[] values() {
            return (StartScreen[]) f222427d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileProArguments.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/ProfileProArguments$UserType;", "", "_avito_profile-pro_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UserType {

        /* renamed from: b, reason: collision with root package name */
        public static final UserType f222429b;

        /* renamed from: c, reason: collision with root package name */
        public static final UserType f222430c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ UserType[] f222431d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f222432e;

        static {
            UserType userType = new UserType("PRIVATE", 0);
            f222429b = userType;
            UserType userType2 = new UserType("PRO", 1);
            f222430c = userType2;
            UserType[] userTypeArr = {userType, userType2};
            f222431d = userTypeArr;
            f222432e = c.a(userTypeArr);
        }

        public UserType() {
            throw null;
        }

        public static UserType valueOf(String str) {
            return (UserType) Enum.valueOf(UserType.class, str);
        }

        public static UserType[] values() {
            return (UserType[]) f222431d.clone();
        }
    }

    /* compiled from: ProfileProArguments.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/pro/ProfileProArguments$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_profile-pro_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static ProfileProArguments a(@k Bundle bundle) {
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("com.avito.android.profile.pro.ProfileProArguments", ProfileProArguments.class) : bundle.getParcelable("com.avito.android.profile.pro.ProfileProArguments");
            if (parcelable != null) {
                return (ProfileProArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public a() {
        }
    }

    /* compiled from: ProfileProArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProfileProArguments> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProArguments createFromParcel(Parcel parcel) {
            return new ProfileProArguments(StartScreen.valueOf(parcel.readString()), UserType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProArguments[] newArray(int i12) {
            return new ProfileProArguments[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileProArguments() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProArguments)) {
            return false;
        }
        ProfileProArguments profileProArguments = (ProfileProArguments) obj;
        return this.f222423b == profileProArguments.f222423b && this.f222424c == profileProArguments.f222424c;
    }

    public final int hashCode() {
        return this.f222424c.hashCode() + (this.f222423b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ProfileProArguments(startScreen=" + this.f222423b + ", userType=" + this.f222424c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f222423b.name());
        parcel.writeString(this.f222424c.name());
    }

    public ProfileProArguments(@k StartScreen startScreen, @k UserType userType) {
        this.f222423b = startScreen;
        this.f222424c = userType;
    }

    public /* synthetic */ ProfileProArguments(StartScreen startScreen, UserType userType, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? StartScreen.f222425b : startScreen, (i12 & 2) != 0 ? UserType.f222430c : userType);
    }
}
