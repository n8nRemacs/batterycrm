package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes6.dex */
public abstract class z0 extends zzb implements y0 {
    public z0() {
        super("com.google.android.gms.maps.internal.IOnCameraChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        m0();
        throw null;
    }
}
