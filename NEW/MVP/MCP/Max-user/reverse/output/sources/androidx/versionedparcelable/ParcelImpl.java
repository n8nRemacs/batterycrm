package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f0h;
import defpackage.g0h;
import defpackage.wcb;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new wcb(3);
    public final g0h a;

    public ParcelImpl(g0h g0hVar) {
        this.a = g0hVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new f0h(parcel).l(this.a);
    }

    public ParcelImpl(Parcel parcel) {
        this.a = new f0h(parcel).h();
    }
}
