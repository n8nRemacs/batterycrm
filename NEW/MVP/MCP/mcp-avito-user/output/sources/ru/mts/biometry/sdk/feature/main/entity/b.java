package ru.mts.biometry.sdk.feature.main.entity;

import V91.a;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class b implements Parcelable {

    @k
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f436462b;

    /* renamed from: c, reason: collision with root package name */
    public final d f436463c;

    public b(boolean z12, d dVar) {
        this.f436462b = z12;
        this.f436463c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f436462b == bVar.f436462b && L.f(this.f436463c, bVar.f436463c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f436462b) * 31;
        d dVar = this.f436463c;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "BioConfig(successPage=" + this.f436462b + ", documentPhoto=" + this.f436463c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeInt(this.f436462b ? 1 : 0);
        d dVar = this.f436463c;
        if (dVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(dVar.f436464b ? 1 : 0);
        parcel.writeInt(dVar.f436465c);
    }
}
