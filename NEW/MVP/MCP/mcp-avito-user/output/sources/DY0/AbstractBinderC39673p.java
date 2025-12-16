package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzu;

/* renamed from: dY0.p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC39673p extends zzb implements InterfaceC39672o {
    public AbstractBinderC39673p() {
        super("com.google.android.gms.maps.internal.IOnInfoWindowClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        x3(zzu.zzg(parcel.readStrongBinder()));
        throw null;
    }
}
