package ru.mts.biometry.sdk.domain.entity.selector;

import G91.a;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class b implements Parcelable {

    @k
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f436410b;

    /* renamed from: c, reason: collision with root package name */
    public final String f436411c;

    public b(String str, String str2) {
        this.f436410b = str;
        this.f436411c = str2;
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
        return L.f(this.f436410b, bVar.f436410b) && L.f(this.f436411c, bVar.f436411c);
    }

    public final int hashCode() {
        return this.f436411c.hashCode() + (this.f436410b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Document(type=");
        sb2.append(this.f436410b);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f436411c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.f436410b);
        parcel.writeString(this.f436411c);
    }
}
