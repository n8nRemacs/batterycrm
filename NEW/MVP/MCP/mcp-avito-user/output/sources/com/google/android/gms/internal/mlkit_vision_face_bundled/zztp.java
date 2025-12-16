package com.google.android.gms.internal.mlkit_vision_face_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public abstract class zztp extends zzb implements zztq {
    public zztp() {
        super("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
    }

    public static zztq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.face.aidls.IFaceDetectorCreator");
        return iInterfaceQueryLocalInterface instanceof zztq ? (zztq) iInterfaceQueryLocalInterface : new zzto(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 != 1) {
            return false;
        }
        d dVarF4 = d.a.f4(parcel.readStrongBinder());
        zzti zztiVar = (zzti) zzc.zza(parcel, zzti.CREATOR);
        zzc.zzb(parcel);
        zztn zztnVarNewFaceDetector = newFaceDetector(dVarF4, zztiVar);
        parcel2.writeNoException();
        if (zztnVarNewFaceDetector == null) {
            parcel2.writeStrongBinder(null);
        } else {
            parcel2.writeStrongBinder(zztnVarNewFaceDetector.asBinder());
        }
        return true;
    }
}
