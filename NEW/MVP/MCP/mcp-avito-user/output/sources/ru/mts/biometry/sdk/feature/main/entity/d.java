package ru.mts.biometry.sdk.feature.main.entity;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;

/* loaded from: classes9.dex */
public final class d implements Parcelable {

    @k
    public static final Parcelable.Creator<d> CREATOR = new V91.b();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f436464b;

    /* renamed from: c, reason: collision with root package name */
    public final int f436465c;

    public d(boolean z12, int i12) {
        this.f436464b = z12;
        this.f436465c = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f436464b == dVar.f436464b && this.f436465c == dVar.f436465c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f436465c) + (Boolean.hashCode(this.f436464b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentPhotoConfig(isHologramsCheckEnable=");
        sb2.append(this.f436464b);
        sb2.append(", hologramsPhotoCount=");
        return r.t(sb2, this.f436465c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f436464b ? 1 : 0);
        parcel.writeInt(this.f436465c);
    }
}
