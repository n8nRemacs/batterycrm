package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

/* loaded from: classes6.dex */
public abstract class H extends zzb implements G {
    public H() {
        super("com.google.android.gms.maps.internal.IOnMarkerDragListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            o3(zzu.zzg(parcel.readStrongBinder()));
            throw null;
        }
        if (i12 == 2) {
            t3(zzu.zzg(parcel.readStrongBinder()));
            throw null;
        }
        if (i12 != 3) {
            return false;
        }
        r3(zzu.zzg(parcel.readStrongBinder()));
        throw null;
    }
}
