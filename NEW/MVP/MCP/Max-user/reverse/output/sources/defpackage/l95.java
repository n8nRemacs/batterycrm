package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class l95 implements Parcelable {
    public static final Parcelable.Creator<l95> CREATOR = new wf4(10);
    public final ArrayList a;
    public final ArrayList b;
    public final Rect c;
    public final boolean d;

    public l95(ArrayList arrayList, ArrayList arrayList2, Rect rect, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = rect;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l95.class != obj.getClass()) {
            return false;
        }
        l95 l95Var = (l95) obj;
        Rect rect = l95Var.c;
        ArrayList arrayList = l95Var.b;
        ArrayList arrayList2 = l95Var.a;
        ArrayList arrayList3 = this.a;
        if (arrayList3 != null) {
            if (!arrayList3.equals(arrayList2)) {
                return false;
            }
        } else if (arrayList2 != null) {
            return false;
        }
        ArrayList arrayList4 = this.b;
        if (arrayList4 != null) {
            if (!arrayList4.equals(arrayList)) {
                return false;
            }
        } else if (arrayList != null) {
            return false;
        }
        if (this.d != l95Var.d) {
            return false;
        }
        Rect rect2 = this.c;
        return rect2 != null ? rect2.equals(rect) : rect == null;
    }

    public final int hashCode() {
        ArrayList arrayList = this.a;
        int iHashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        ArrayList arrayList2 = this.b;
        int iHashCode2 = (iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        Rect rect = this.c;
        return Boolean.valueOf(this.d).hashCode() + ((iHashCode2 + (rect != null ? rect.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.d ? 1 : 0);
    }

    public l95(Parcel parcel) {
        this.a = parcel.createTypedArrayList(g18.CREATOR);
        this.b = parcel.createTypedArrayList(dg3.CREATOR);
        this.c = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        this.d = parcel.readInt() == 1;
    }
}
