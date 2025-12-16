package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class ece implements Parcelable {
    public static final Parcelable.Creator<ece> CREATOR = new z6e(1);
    public final RectF X;
    public final Rect Y;
    public final Uri Z;
    public final vd8 a;
    public final boolean b;
    public final Uri c;
    public final Uri d;
    public final String o;

    public ece(vd8 vd8Var, boolean z, Uri uri, Uri uri2, String str, RectF rectF, Rect rect, Uri uri3) {
        this.a = vd8Var;
        this.b = z;
        this.c = uri;
        this.d = uri2;
        this.o = str;
        this.X = rectF;
        this.Y = rect;
        this.Z = uri3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ece)) {
            return false;
        }
        ece eceVar = (ece) obj;
        return fni.a(this.a, eceVar.a) && this.b == eceVar.b && fni.a(this.c, eceVar.c) && fni.a(this.d, eceVar.d) && fni.a(this.o, eceVar.o) && fni.a(this.X, eceVar.X) && fni.a(this.Y, eceVar.Y) && fni.a(this.Z, eceVar.Z);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + a9h.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.o;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        RectF rectF = this.X;
        int iHashCode3 = (iHashCode2 + (rectF == null ? 0 : rectF.hashCode())) * 31;
        Rect rect = this.Y;
        int iHashCode4 = (iHashCode3 + (rect == null ? 0 : rect.hashCode())) * 31;
        Uri uri = this.Z;
        return iHashCode4 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "SelectedLocalMediaItem(localMediaItem=" + this.a + ", isFile=" + this.b + ", photoEditorUri=" + this.c + ", thumbnail=" + this.d + ", photoEditorFilePath=" + this.o + ", relativeCrop=" + this.X + ", absoluteCrop=" + this.Y + ", overlay=" + this.Z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.o);
        parcel.writeParcelable(this.X, i);
        parcel.writeParcelable(this.Y, i);
        parcel.writeParcelable(this.Z, i);
    }
}
