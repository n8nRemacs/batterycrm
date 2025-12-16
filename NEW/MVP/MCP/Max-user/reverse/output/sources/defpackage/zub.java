package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class zub implements Parcelable {
    public static final Parcelable.Creator<zub> CREATOR = new wcb(8);
    public final Uri a;
    public final Uri b;
    public final da4 c;
    public final l95 d;
    public final Uri o;

    public zub(Uri uri, Uri uri2, da4 da4Var, l95 l95Var, Uri uri3) {
        this.a = uri;
        this.b = uri2;
        this.c = da4Var;
        this.d = l95Var;
        this.o = uri3;
    }

    public static Uri a(zub zubVar, pd8 pd8Var) {
        if (zubVar == null) {
            return Uri.parse(pd8Var.a());
        }
        Uri uri = zubVar.b;
        if (uri != null) {
            return uri;
        }
        Uri uri2 = zubVar.a;
        return uri2 != null ? uri2 : Uri.parse(pd8Var.a());
    }

    public static boolean b(zub zubVar, pd8 pd8Var) {
        if (zubVar == null) {
            return false;
        }
        return (zubVar.d == null && zubVar.c == null && a(zubVar, pd8Var).equals(Uri.parse(pd8Var.a()))) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zub.class != obj.getClass()) {
            return false;
        }
        zub zubVar = (zub) obj;
        if (Objects.equals(this.a, zubVar.a) && Objects.equals(this.b, zubVar.b) && Objects.equals(this.c, zubVar.c) && Objects.equals(this.d, zubVar.d)) {
            return Objects.equals(this.o, zubVar.o);
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        da4 da4Var = this.c;
        int iHashCode3 = (iHashCode2 + (da4Var != null ? da4Var.hashCode() : 0)) * 31;
        l95 l95Var = this.d;
        int iHashCode4 = (iHashCode3 + (l95Var != null ? l95Var.hashCode() : 0)) * 31;
        Uri uri3 = this.o;
        return iHashCode4 + (uri3 != null ? uri3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.o, i);
    }
}
