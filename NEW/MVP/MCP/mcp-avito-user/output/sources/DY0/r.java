package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

/* loaded from: classes6.dex */
public abstract class r extends zzb implements InterfaceC39674q {
    public r() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowCloseListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        k0(zzu.zzg(parcel.readStrongBinder()));
        throw null;
    }
}
