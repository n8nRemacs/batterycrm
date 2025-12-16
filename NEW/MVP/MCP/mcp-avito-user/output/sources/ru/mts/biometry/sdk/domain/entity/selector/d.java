package ru.mts.biometry.sdk.domain.entity.selector;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class d implements Parcelable {

    @k
    public static final Parcelable.Creator<d> CREATOR = new G91.b();

    /* renamed from: b, reason: collision with root package name */
    public final String f436412b;

    /* renamed from: c, reason: collision with root package name */
    public final String f436413c;

    /* renamed from: d, reason: collision with root package name */
    public final List f436414d;

    public d(String str, String str2, List list) {
        this.f436412b = str;
        this.f436413c = str2;
        this.f436414d = list;
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
        return L.f(this.f436412b, dVar.f436412b) && L.f(this.f436413c, dVar.f436413c) && L.f(this.f436414d, dVar.f436414d);
    }

    public final int hashCode() {
        return this.f436414d.hashCode() + H.d(this.f436412b.hashCode() * 31, 31, this.f436413c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentCountry(code=");
        sb2.append(this.f436412b);
        sb2.append(", name=");
        sb2.append(this.f436413c);
        sb2.append(", documentTypes=");
        return H.p(sb2, this.f436414d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f436412b);
        parcel.writeString(this.f436413c);
        parcel.writeStringList(this.f436414d);
    }
}
