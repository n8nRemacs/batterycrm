package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

/* loaded from: classes6.dex */
public abstract class v0 extends zzb implements u0 {
    public v0() {
        super("com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            r0(zzu.zzg(parcel.readStrongBinder()));
            throw null;
        }
        if (i12 != 2) {
            return false;
        }
        x0(zzu.zzg(parcel.readStrongBinder()));
        throw null;
    }
}
