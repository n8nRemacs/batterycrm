package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

/* renamed from: dY0.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC39676t extends zzb implements InterfaceC39675s {
    public AbstractBinderC39676t() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        f0(zzu.zzg(parcel.readStrongBinder()));
        throw null;
    }
}
