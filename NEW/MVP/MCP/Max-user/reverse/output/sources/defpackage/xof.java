package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class xof extends vof implements Parcelable {
    public static final wof CREATOR = new wof();
    public final hb4 b;

    public xof(hb4 hb4Var) {
        super(String.valueOf(hb4Var.a));
        this.b = hb4Var;
    }

    @Override // defpackage.vof, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.vof, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hb4 hb4Var = this.b;
        Bundle bundleC = hb4Var.c();
        Bitmap bitmap = hb4Var.d;
        if (bitmap != null) {
            bundleC.putParcelable(hb4.w, bitmap);
        }
        parcel.writeBundle(bundleC);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public xof(Parcel parcel) {
        Bundle bundle = parcel.readBundle(hb4.class.getClassLoader());
        this(hb4.b(bundle == null ? Bundle.EMPTY : bundle));
    }
}
