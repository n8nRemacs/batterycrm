package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class b1e implements Parcelable {
    public static final Parcelable.Creator<b1e> CREATOR = new wcb(29);
    public final String a;

    public /* synthetic */ b1e(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return ho7.i("ScopeId(value=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b1e) {
            return fni.a(this.a, ((b1e) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
