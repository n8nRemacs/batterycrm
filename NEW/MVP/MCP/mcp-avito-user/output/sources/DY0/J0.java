package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzi;

/* loaded from: classes6.dex */
public abstract class J0 extends zzb implements I0 {
    public J0() {
        super("com.google.android.gms.maps.internal.IOnCircleClickListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        D3(zzi.zzc(parcel.readStrongBinder()));
        throw null;
    }
}
