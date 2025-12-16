package dY0;

import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.maps.zzb;

/* renamed from: dY0.i0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC39662i0 extends zzb implements InterfaceC39660h0 {
    public AbstractBinderC39662i0() {
        super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            M();
            throw null;
        }
        if (i12 != 2) {
            return false;
        }
        O(d.a.f4(parcel.readStrongBinder()));
        throw null;
    }
}
