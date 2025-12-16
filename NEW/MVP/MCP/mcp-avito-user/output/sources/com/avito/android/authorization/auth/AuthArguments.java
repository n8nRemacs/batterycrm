package com.avito.android.authorization.auth;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.authorization.AuthScreenMode;
import kotlin.Metadata;

/* compiled from: AuthArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/AuthArguments;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AuthArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AuthArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f92810b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Intent f92811c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92812d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f92813e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AuthScreenMode f92814f;

    /* compiled from: AuthArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuthArguments> {
        @Override // android.os.Parcelable.Creator
        public final AuthArguments createFromParcel(Parcel parcel) {
            return new AuthArguments(parcel.readString(), (Intent) parcel.readParcelable(AuthArguments.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (AuthScreenMode) parcel.readParcelable(AuthArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthArguments[] newArray(int i12) {
            return new AuthArguments[i12];
        }
    }

    public AuthArguments(@Y61.l String str, @Y61.l Intent intent, boolean z12, boolean z13, @Y61.k AuthScreenMode authScreenMode) {
        this.f92810b = str;
        this.f92811c = intent;
        this.f92812d = z12;
        this.f92813e = z13;
        this.f92814f = authScreenMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthArguments)) {
            return false;
        }
        AuthArguments authArguments = (AuthArguments) obj;
        return kotlin.jvm.internal.L.f(this.f92810b, authArguments.f92810b) && kotlin.jvm.internal.L.f(this.f92811c, authArguments.f92811c) && this.f92812d == authArguments.f92812d && this.f92813e == authArguments.f92813e && this.f92814f == authArguments.f92814f;
    }

    public final int hashCode() {
        String str = this.f92810b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Intent intent = this.f92811c;
        return this.f92814f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode + (intent != null ? intent.hashCode() : 0)) * 31, 31, this.f92812d), 31, this.f92813e);
    }

    @Y61.k
    public final String toString() {
        return "AuthArguments(src=" + this.f92810b + ", intent=" + this.f92811c + ", resultOk=" + this.f92812d + ", isRegistered=" + this.f92813e + ", screenMode=" + this.f92814f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f92810b);
        parcel.writeParcelable(this.f92811c, i12);
        parcel.writeInt(this.f92812d ? 1 : 0);
        parcel.writeInt(this.f92813e ? 1 : 0);
        parcel.writeParcelable(this.f92814f, i12);
    }
}
