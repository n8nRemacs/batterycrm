package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class aud implements Parcelable {
    public static final Parcelable.Creator<aud> CREATOR = new wcb(26);
    public final ArrayList a;
    public final ArrayList b;
    public final List c;
    public final int d;

    public aud(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aud)) {
            return false;
        }
        aud audVar = (aud) obj;
        return this.a.equals(audVar.a) && this.b.equals(audVar.b) && fni.a(this.c, audVar.c) && this.d == audVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.l(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SavedState(savedPagesKeys=");
        sb.append(this.a);
        sb.append(", savedPagesValues=");
        sb.append(this.b);
        sb.append(", savedPageHistory=");
        sb.append(this.c);
        sb.append(", maxPagesToStateSave=");
        return xc0.h(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ArrayList arrayList = this.a;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeLong(((Number) it.next()).longValue());
        }
        ArrayList arrayList2 = this.b;
        parcel.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            parcel.writeBundle((Bundle) it2.next());
        }
        List list = this.c;
        parcel.writeInt(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            parcel.writeLong(((Number) it3.next()).longValue());
        }
        parcel.writeInt(this.d);
    }
}
