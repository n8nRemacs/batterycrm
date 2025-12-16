package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import java.util.List;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public abstract class zztm extends zzb implements zztn {
    public zztm() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetector");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzb
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
            d dVarF4 = d.a.f4(parcel.readStrongBinder());
            zzte zzteVar = (zzte) zzc.zza(parcel, zzte.CREATOR);
            zzc.zzb(parcel);
            List listZzb = zzb(dVarF4, zzteVar);
            parcel2.writeNoException();
            parcel2.writeTypedList(listZzb);
        }
        return true;
    }
}
