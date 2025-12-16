package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;

/* loaded from: classes6.dex */
public abstract class q0 extends zzb implements p0 {
    public q0() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            s0();
            throw null;
        }
        if (i12 != 2) {
            return false;
        }
        onCancel();
        throw null;
    }
}
