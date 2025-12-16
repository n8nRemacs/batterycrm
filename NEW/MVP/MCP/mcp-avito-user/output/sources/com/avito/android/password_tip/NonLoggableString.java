package com.avito.android.password_tip;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NonLoggableString.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/password_tip/NonLoggableString;", "Landroid/os/Parcelable;", "value", "", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@X41.g
/* loaded from: classes15.dex */
public final class NonLoggableString implements Parcelable {

    @k
    public static final Parcelable.Creator<NonLoggableString> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f213949b;

    /* compiled from: NonLoggableString.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NonLoggableString> {
        @Override // android.os.Parcelable.Creator
        public final NonLoggableString createFromParcel(Parcel parcel) {
            return NonLoggableString.a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NonLoggableString[] newArray(int i12) {
            return new NonLoggableString[i12];
        }
    }

    private /* synthetic */ NonLoggableString(String str) {
        this.f213949b = str;
    }

    public static final /* synthetic */ NonLoggableString a(String str) {
        return new NonLoggableString(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NonLoggableString) {
            return L.f(this.f213949b, ((NonLoggableString) obj).f213949b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f213949b.hashCode();
    }

    @k
    public final String toString() {
        return "";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f213949b);
    }
}
