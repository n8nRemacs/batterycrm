package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class j8f extends z7f {
    public static final Parcelable.Creator<j8f> CREATOR = new z6e(16);
    public final List a;

    public j8f(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new i8f(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            i8f i8fVar = (i8f) list.get(i2);
            parcel.writeLong(i8fVar.a);
            parcel.writeByte(i8fVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(i8fVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(i8fVar.d ? (byte) 1 : (byte) 0);
            List list2 = i8fVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                h8f h8fVar = (h8f) list2.get(i3);
                parcel.writeInt(h8fVar.a);
                parcel.writeLong(h8fVar.b);
            }
            parcel.writeLong(i8fVar.e);
            parcel.writeByte(i8fVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(i8fVar.h);
            parcel.writeInt(i8fVar.i);
            parcel.writeInt(i8fVar.j);
            parcel.writeInt(i8fVar.k);
        }
    }

    public j8f(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
