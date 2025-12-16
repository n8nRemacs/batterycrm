package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class dg3 implements Parcelable {
    public static final Parcelable.Creator<dg3> CREATOR = new e8(22);
    public final int a;
    public final int b;

    public dg3(int i) {
        this.a = 1;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dg3.class != obj.getClass()) {
            return false;
        }
        dg3 dg3Var = (dg3) obj;
        return this.b == dg3Var.b && this.a == dg3Var.a;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i != 0 ? az1.v(i) : 0) * 31) + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        if (this.a != 1) {
            throw null;
        }
        parcel.writeString("ADD");
    }

    public dg3(Parcel parcel) {
        this.b = parcel.readInt();
        String string = parcel.readString();
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("ADD")) {
            this.a = 1;
            return;
        }
        throw new IllegalArgumentException("No enum constant ru.ok.tamtam.photoeditor.state.CommandState.Type.".concat(string));
    }
}
