package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class x2b implements Parcelable, t98 {
    public static final Parcelable.Creator<x2b> CREATOR = new pq8(17);
    public final s5g X;
    public final String a;
    public final int b;
    public final s5g c;
    public final CharSequence d;
    public final Integer o;

    public /* synthetic */ x2b(String str, int i, s5g s5gVar, Spannable spannable) {
        this(str, i, s5gVar, spannable, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2b)) {
            return false;
        }
        x2b x2bVar = (x2b) obj;
        return fni.a(this.a, x2bVar.a) && this.b == x2bVar.b && fni.a(this.c, x2bVar.c) && fni.a(this.d, x2bVar.d) && fni.a(this.o, x2bVar.o) && fni.a(this.X, x2bVar.X);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a.hashCode();
    }

    public final int hashCode() {
        int iD = xc0.d(xrf.k(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        CharSequence charSequence = this.d;
        int iHashCode = (iD + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Integer num = this.o;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        s5g s5gVar = this.X;
        return iHashCode2 + (s5gVar != null ? s5gVar.hashCode() : 0);
    }

    @Override // defpackage.t98
    public final int m() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbM = utb.m(this.b, "OneMeCountryModel(countryNameCode=", this.a, ", countryPhoneCode=", ", countryName=");
        sbM.append(this.c);
        sbM.append(", flagEmoji=");
        sbM.append((Object) this.d);
        sbM.append(", maxNumbersSize=");
        sbM.append(this.o);
        sbM.append(", hint=");
        sbM.append(this.X);
        sbM.append(")");
        return sbM.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, i);
        TextUtils.writeToParcel(this.d, parcel, i);
        Integer num = this.o;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeParcelable(this.X, i);
    }

    public x2b(String str, int i, s5g s5gVar, CharSequence charSequence, Integer num, s5g s5gVar2) {
        this.a = str;
        this.b = i;
        this.c = s5gVar;
        this.d = charSequence;
        this.o = num;
        this.X = s5gVar2;
    }
}
