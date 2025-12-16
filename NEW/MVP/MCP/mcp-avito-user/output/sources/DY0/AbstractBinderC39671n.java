package dY0;

import android.os.Parcel;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzo;

/* renamed from: dY0.n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC39671n extends zzb implements M0 {
    public AbstractBinderC39671n() {
        super("com.google.android.gms.maps.internal.IOnIndoorStateChangeListener");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            P2();
            throw null;
        }
        if (i12 != 2) {
            return false;
        }
        X3(zzo.zze(parcel.readStrongBinder()));
        throw null;
    }
}
