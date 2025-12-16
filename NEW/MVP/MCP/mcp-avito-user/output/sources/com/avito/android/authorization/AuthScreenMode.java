package com.avito.android.authorization;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthScreenMode.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/AuthScreenMode;", "", "Landroid/os/Parcelable;", "_avito_authorization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthScreenMode implements Parcelable {

    @k
    public static final Parcelable.Creator<AuthScreenMode> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final AuthScreenMode f92662b;

    /* renamed from: c, reason: collision with root package name */
    public static final AuthScreenMode f92663c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AuthScreenMode[] f92664d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f92665e;

    static {
        AuthScreenMode authScreenMode = new AuthScreenMode("SHEET", 0);
        f92662b = authScreenMode;
        AuthScreenMode authScreenMode2 = new AuthScreenMode("FULLSCREEN", 1);
        f92663c = authScreenMode2;
        AuthScreenMode[] authScreenModeArr = {authScreenMode, authScreenMode2};
        f92664d = authScreenModeArr;
        f92665e = c.a(authScreenModeArr);
        CREATOR = new Parcelable.Creator<AuthScreenMode>() { // from class: com.avito.android.authorization.AuthScreenMode.a
            @Override // android.os.Parcelable.Creator
            public final AuthScreenMode createFromParcel(Parcel parcel) {
                return AuthScreenMode.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AuthScreenMode[] newArray(int i12) {
                return new AuthScreenMode[i12];
            }
        };
    }

    public AuthScreenMode() {
        throw null;
    }

    public static AuthScreenMode valueOf(String str) {
        return (AuthScreenMode) Enum.valueOf(AuthScreenMode.class, str);
    }

    public static AuthScreenMode[] values() {
        return (AuthScreenMode[]) f92664d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
