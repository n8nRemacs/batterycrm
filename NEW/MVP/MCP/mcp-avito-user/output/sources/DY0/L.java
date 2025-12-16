package dY0;

import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes6.dex */
public abstract class L extends zzb implements K {
    public L() {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        V(d.a.f4(parcel.readStrongBinder()));
        throw null;
    }
}
