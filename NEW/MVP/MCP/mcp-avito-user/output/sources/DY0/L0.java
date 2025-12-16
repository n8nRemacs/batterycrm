package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzl;

/* loaded from: classes6.dex */
public abstract class L0 extends zzb implements K0 {
    public L0() {
        super("com.google.android.gms.maps.internal.IOnGroundOverlayClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        O3(zzl.zzd(parcel.readStrongBinder()));
        throw null;
    }
}
