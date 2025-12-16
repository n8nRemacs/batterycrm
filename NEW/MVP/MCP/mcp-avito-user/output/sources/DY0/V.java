package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzaa;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes6.dex */
public abstract class V extends zzb implements U {
    public V() {
        super("com.google.android.gms.maps.internal.IOnPolylineClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        j0(zzaa.zzi(parcel.readStrongBinder()));
        throw null;
    }
}
