package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.internal.maps.zzu;

/* loaded from: classes6.dex */
public abstract class F extends zzb implements E {
    public F() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        boolean zG3 = g3(zzu.zzg(parcel.readStrongBinder()));
        parcel2.writeNoException();
        zzc.writeBoolean(parcel2, zG3);
        return true;
    }
}
