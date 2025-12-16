package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public interface c extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    public static abstract class a extends zzb implements c {
        public a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean e4(int i12, @N Parcel parcel, @N Parcel parcel2) {
            switch (i12) {
                case 2:
                    f fVarZzg = zzg();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, fVarZzg);
                    return true;
                case 3:
                    Bundle bundleZzd = zzd();
                    parcel2.writeNoException();
                    zzc.zzd(parcel2, bundleZzd);
                    return true;
                case 4:
                    int iZzb = zzb();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzb);
                    return true;
                case 5:
                    c cVarZze = zze();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, cVarZze);
                    return true;
                case 6:
                    f fVarZzh = zzh();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, fVarZzh);
                    return true;
                case 7:
                    boolean zZzs = zzs();
                    parcel2.writeNoException();
                    int i13 = zzc.zza;
                    parcel2.writeInt(zZzs ? 1 : 0);
                    return true;
                case 8:
                    String strZzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeString(strZzj);
                    return true;
                case 9:
                    c cVarZzf = zzf();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, cVarZzf);
                    return true;
                case 10:
                    int iZzc = zzc();
                    parcel2.writeNoException();
                    parcel2.writeInt(iZzc);
                    return true;
                case 11:
                    boolean zZzt = zzt();
                    parcel2.writeNoException();
                    int i14 = zzc.zza;
                    parcel2.writeInt(zZzt ? 1 : 0);
                    return true;
                case 12:
                    f fVarZzi = zzi();
                    parcel2.writeNoException();
                    zzc.zze(parcel2, fVarZzi);
                    return true;
                case 13:
                    boolean zZzu = zzu();
                    parcel2.writeNoException();
                    int i15 = zzc.zza;
                    parcel2.writeInt(zZzu ? 1 : 0);
                    return true;
                case 14:
                    boolean zZzv = zzv();
                    parcel2.writeNoException();
                    int i16 = zzc.zza;
                    parcel2.writeInt(zZzv ? 1 : 0);
                    return true;
                case 15:
                    boolean zZzw = zzw();
                    parcel2.writeNoException();
                    int i17 = zzc.zza;
                    parcel2.writeInt(zZzw ? 1 : 0);
                    return true;
                case 16:
                    boolean zZzx = zzx();
                    parcel2.writeNoException();
                    int i18 = zzc.zza;
                    parcel2.writeInt(zZzx ? 1 : 0);
                    return true;
                case 17:
                    boolean zZzy = zzy();
                    parcel2.writeNoException();
                    int i19 = zzc.zza;
                    parcel2.writeInt(zZzy ? 1 : 0);
                    return true;
                case 18:
                    boolean zZzz = zzz();
                    parcel2.writeNoException();
                    int i22 = zzc.zza;
                    parcel2.writeInt(zZzz ? 1 : 0);
                    return true;
                case 19:
                    boolean zP1 = P1();
                    parcel2.writeNoException();
                    int i23 = zzc.zza;
                    parcel2.writeInt(zP1 ? 1 : 0);
                    return true;
                case 20:
                    d dVarF4 = d.a.f4(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    U3(dVarF4);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean zZzf = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    e0(zZzf);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean zZzf2 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    g0(zZzf2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean zZzf3 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    l0(zZzf3);
                    parcel2.writeNoException();
                    return true;
                case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                    boolean zZzf4 = zzc.zzf(parcel);
                    zzc.zzb(parcel);
                    I0(zZzf4);
                    parcel2.writeNoException();
                    return true;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    Intent intent = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    zzc.zzb(parcel);
                    u2(intent);
                    parcel2.writeNoException();
                    return true;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    Intent intent2 = (Intent) zzc.zza(parcel, Intent.CREATOR);
                    int i24 = parcel.readInt();
                    zzc.zzb(parcel);
                    j1(i24, intent2);
                    parcel2.writeNoException();
                    return true;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    d dVarF42 = d.a.f4(parcel.readStrongBinder());
                    zzc.zzb(parcel);
                    m3(dVarF42);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    void I0(boolean z12);

    boolean P1();

    void U3(@N d dVar);

    void e0(boolean z12);

    void g0(boolean z12);

    void j1(int i12, @N Intent intent);

    void l0(boolean z12);

    void m3(@N d dVar);

    void u2(@N Intent intent);

    int zzb();

    int zzc();

    @P
    Bundle zzd();

    @P
    c zze();

    @P
    c zzf();

    @N
    f zzg();

    @N
    f zzh();

    @N
    f zzi();

    @P
    String zzj();

    boolean zzs();

    boolean zzt();

    boolean zzu();

    boolean zzv();

    boolean zzw();

    boolean zzx();

    boolean zzy();

    boolean zzz();
}
