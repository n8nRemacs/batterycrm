package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g79 implements Parcelable {
    public static final Parcelable.Creator<g79> CREATOR = new pq8(7);
    public final MediaSession.Token b;
    public db7 c;
    public final Object a = new Object();
    public g0h d = null;

    public g79(MediaSession.Token token, db7 db7Var) {
        this.b = token;
        this.c = db7Var;
    }

    public final db7 a() {
        db7 db7Var;
        synchronized (this.a) {
            db7Var = this.c;
        }
        return db7Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g79) {
            return this.b.equals(((g79) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
