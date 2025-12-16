package ru.mts.biometry.sdk.domain.entity.selector;

import G91.c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class f implements Parcelable {

    @k
    public static final Parcelable.Creator<f> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public final Object f436415b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f436416c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f436417d;

    public f(Map map, Map map2, List list) {
        this.f436415b = list;
        this.f436416c = map;
        this.f436417d = map2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f436415b, fVar.f436415b) && this.f436416c.equals(fVar.f436416c) && this.f436417d.equals(fVar.f436417d);
    }

    public final int hashCode() {
        return this.f436417d.hashCode() + C23088b.a(this.f436415b.hashCode() * 31, 31, this.f436416c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentSelector(countries=");
        sb2.append(this.f436415b);
        sb2.append(", documents=");
        sb2.append(this.f436416c);
        sb2.append(", allowedDocuments=");
        return H.n(sb2, this.f436417d, ')');
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        ?? r02 = this.f436415b;
        parcel.writeInt(r02.size());
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            ((d) it.next()).writeToParcel(parcel, i12);
        }
        Iterator itO = com.avito.android.bxcontent.mvi.entity.f.o(this.f436416c, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            b bVar = (b) entry.getValue();
            bVar.getClass();
            parcel.writeString(bVar.f436410b);
            parcel.writeString(bVar.f436411c);
        }
        Iterator itO2 = com.avito.android.bxcontent.mvi.entity.f.o(this.f436417d, parcel);
        while (itO2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itO2.next();
            parcel.writeString((String) entry2.getKey());
            parcel.writeStringList((List) entry2.getValue());
        }
    }
}
