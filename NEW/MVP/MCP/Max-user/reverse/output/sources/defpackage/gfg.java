package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class gfg implements Parcelable {
    public static final Parcelable.Creator<gfg> CREATOR;
    public final ffg a;
    public final List b;

    static {
        List list = Collections.EMPTY_LIST;
        CREATOR = new z6e(26);
    }

    public gfg(ffg ffgVar, List list) {
        this.a = ffgVar;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gfg.class != obj.getClass()) {
            return false;
        }
        gfg gfgVar = (gfg) obj;
        if (this.a.equals(gfgVar.a)) {
            return this.b.equals(gfgVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackContainer{videoTrack=" + this.a + ", audioTracks=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeTypedList(this.b);
    }

    public gfg(Parcel parcel) {
        this.a = (ffg) parcel.readParcelable(ffg.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        parcel.readTypedList(arrayList, ffg.CREATOR);
    }
}
