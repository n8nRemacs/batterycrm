package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes6.dex */
public abstract class B0 extends zzb implements A0 {
    public B0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        d0();
        parcel2.writeNoException();
        return true;
    }
}
