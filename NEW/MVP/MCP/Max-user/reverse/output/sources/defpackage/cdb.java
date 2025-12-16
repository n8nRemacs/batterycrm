package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class cdb implements Parcelable {
    public static final Parcelable.Creator<cdb> CREATOR = new pq8(20);
    public static final cdb Z = new cdb(rcb.a, "", null, ycb.a, new kcb(0, 0, 0, 7), mcb.b, bdb.a);
    public final ocb X;
    public final bdb Y;
    public final ucb a;
    public final CharSequence b;
    public final CharSequence c;
    public final adb d;
    public final kcb o;

    public cdb(ucb ucbVar, CharSequence charSequence, CharSequence charSequence2, adb adbVar, kcb kcbVar, ocb ocbVar, bdb bdbVar) {
        this.a = ucbVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = adbVar;
        this.o = kcbVar;
        this.X = ocbVar;
        this.Y = bdbVar;
    }

    public static cdb a(cdb cdbVar, ucb ucbVar, CharSequence charSequence, CharSequence charSequence2, adb adbVar, kcb kcbVar, ocb ocbVar, bdb bdbVar, int i) {
        if ((i & 1) != 0) {
            ucbVar = cdbVar.a;
        }
        ucb ucbVar2 = ucbVar;
        if ((i & 2) != 0) {
            charSequence = cdbVar.b;
        }
        CharSequence charSequence3 = charSequence;
        if ((i & 4) != 0) {
            charSequence2 = cdbVar.c;
        }
        CharSequence charSequence4 = charSequence2;
        if ((i & 8) != 0) {
            adbVar = cdbVar.d;
        }
        adb adbVar2 = adbVar;
        if ((i & 16) != 0) {
            kcbVar = cdbVar.o;
        }
        kcb kcbVar2 = kcbVar;
        if ((i & 32) != 0) {
            ocbVar = cdbVar.X;
        }
        ocb ocbVar2 = ocbVar;
        if ((i & 64) != 0) {
            bdbVar = cdbVar.Y;
        }
        cdbVar.getClass();
        return new cdb(ucbVar2, charSequence3, charSequence4, adbVar2, kcbVar2, ocbVar2, bdbVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdb)) {
            return false;
        }
        cdb cdbVar = (cdb) obj;
        return fni.a(this.a, cdbVar.a) && fni.a(this.b, cdbVar.b) && fni.a(this.c, cdbVar.c) && fni.a(this.d, cdbVar.d) && fni.a(this.o, cdbVar.o) && fni.a(this.X, cdbVar.X) && this.Y == cdbVar.Y;
    }

    public final int hashCode() {
        int iG = u45.g(this.b, this.a.hashCode() * 31, 31);
        CharSequence charSequence = this.c;
        return this.Y.hashCode() + ((this.X.hashCode() + ((this.o.hashCode() + ((this.d.hashCode() + ((iG + (charSequence == null ? 0 : charSequence.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OneMeSnackbarModel(left=" + this.a + ", title=" + ((Object) this.b) + ", caption=" + ((Object) this.c) + ", right=" + this.d + ", params=" + this.o + ", duration=" + this.X + ", style=" + this.Y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        TextUtils.writeToParcel(this.b, parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeParcelable(this.d, i);
        this.o.writeToParcel(parcel, i);
        parcel.writeParcelable(this.X, i);
        parcel.writeString(this.Y.name());
    }

    public /* synthetic */ cdb(ucb ucbVar, String str, String str2, kcb kcbVar) {
        this(ucbVar, str, str2, ycb.a, kcbVar, mcb.b, bdb.a);
    }
}
