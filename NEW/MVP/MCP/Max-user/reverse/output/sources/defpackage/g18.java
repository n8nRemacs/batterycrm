package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class g18 implements Parcelable {
    public static final Parcelable.Creator<g18> CREATOR = new f18(0);
    public final int a;
    public final int b;
    public final int c;
    public final float d;
    public final List o;

    public g18(int i, int i2, float f, List list) {
        this.a = i;
        this.b = 1;
        this.c = i2;
        this.d = f;
        this.o = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g18.class != obj.getClass()) {
            return false;
        }
        g18 g18Var = (g18) obj;
        List list = g18Var.o;
        if (this.a != g18Var.a || this.c != g18Var.c || Float.compare(g18Var.d, this.d) != 0 || this.b != g18Var.b) {
            return false;
        }
        List list2 = this.o;
        return list2 != null ? list2.equals(list) : list == null;
    }

    public final int hashCode() {
        int i = this.a * 31;
        int i2 = this.b;
        int iV = (((i + (i2 != 0 ? az1.v(i2) : 0)) * 31) + this.c) * 31;
        float f = this.d;
        int iFloatToIntBits = (iV + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        List list = this.o;
        return iFloatToIntBits + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b != 1) {
            throw null;
        }
        parcel.writeString("DRAWING");
        parcel.writeInt(this.a);
        parcel.writeInt(this.c);
        parcel.writeFloat(this.d);
        parcel.writeTypedList(this.o);
    }

    public g18(Parcel parcel) {
        String string = parcel.readString();
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("DRAWING")) {
            this.b = 1;
            this.a = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readFloat();
            this.o = parcel.createTypedArrayList(s45.CREATOR);
            return;
        }
        throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.LayerState.Type.".concat(string));
    }
}
