package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o8c implements Parcelable {
    public static final Parcelable.Creator<o8c> CREATOR = new wcb(13);
    public final LinkedHashMap a;
    public final ArrayList b;
    public final zea c;

    public o8c(LinkedHashMap linkedHashMap, ArrayList arrayList, zea zeaVar) {
        this.a = linkedHashMap;
        this.b = arrayList;
        this.c = zeaVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8c)) {
            return false;
        }
        o8c o8cVar = (o8c) obj;
        return this.a.equals(o8cVar.a) && this.b.equals(o8cVar.b) && fni.a(this.c, o8cVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        zea zeaVar = this.c;
        return iHashCode + (zeaVar == null ? 0 : zeaVar.hashCode());
    }

    public final String toString() {
        return "PresetAvatarsModel(categories=" + this.a + ", avatars=" + this.b + ", selectedAvatar=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        LinkedHashMap linkedHashMap = this.a;
        parcel.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
        ArrayList arrayList = this.b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((zea) it.next()).writeToParcel(parcel, i);
        }
        zea zeaVar = this.c;
        if (zeaVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zeaVar.writeToParcel(parcel, i);
        }
    }
}
