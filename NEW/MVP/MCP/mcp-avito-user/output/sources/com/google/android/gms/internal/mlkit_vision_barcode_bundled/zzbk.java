package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import java.util.List;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public abstract class zzbk extends zzb implements zzbl {
    public zzbk() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            zzc();
            parcel2.writeNoException();
        } else if (i12 == 2) {
            zzd();
            parcel2.writeNoException();
        } else {
            if (i12 != 3) {
                return false;
            }
            List listZzb = zzb(d.a.f4(parcel.readStrongBinder()), (zzbu) zzc.zza(parcel, zzbu.CREATOR));
            parcel2.writeNoException();
            parcel2.writeTypedList(listZzb);
        }
        return true;
    }
}
