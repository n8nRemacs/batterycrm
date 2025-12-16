package com.avito.android.authorization.auth;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthPresenter.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/auth/FastLoginState;", "", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FastLoginState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FastLoginState> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final FastLoginState f92852b;

    /* renamed from: c, reason: collision with root package name */
    public static final FastLoginState f92853c;

    /* renamed from: d, reason: collision with root package name */
    public static final FastLoginState f92854d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ FastLoginState[] f92855e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f92856f;

    static {
        FastLoginState fastLoginState = new FastLoginState("CREDMAN", 0);
        f92852b = fastLoginState;
        FastLoginState fastLoginState2 = new FastLoginState("SUGGEST", 1);
        f92853c = fastLoginState2;
        FastLoginState fastLoginState3 = new FastLoginState("SKIP", 2);
        f92854d = fastLoginState3;
        FastLoginState[] fastLoginStateArr = {fastLoginState, fastLoginState2, fastLoginState3};
        f92855e = fastLoginStateArr;
        f92856f = kotlin.enums.c.a(fastLoginStateArr);
        CREATOR = new Parcelable.Creator<FastLoginState>() { // from class: com.avito.android.authorization.auth.FastLoginState.a
            @Override // android.os.Parcelable.Creator
            public final FastLoginState createFromParcel(Parcel parcel) {
                return FastLoginState.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FastLoginState[] newArray(int i12) {
                return new FastLoginState[i12];
            }
        };
    }

    public FastLoginState() {
        throw null;
    }

    public static FastLoginState valueOf(String str) {
        return (FastLoginState) Enum.valueOf(FastLoginState.class, str);
    }

    public static FastLoginState[] values() {
        return (FastLoginState[]) f92855e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
