package com.google.android.gms.internal.mlkit_vision_face_bundled;

import java.io.IOException;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzaf extends zzvn implements zzwt {
    private static final zzaf zzb;
    private int zzd;
    private zzzh zze;
    private byte zzf = 2;

    static {
        zzaf zzafVar = new zzaf();
        zzb = zzafVar;
        zzvn.d(zzaf.class, zzafVar);
    }

    public static zzaf zzb(byte[] bArr, zzuy zzuyVar) throws zzvv {
        zzaf zzafVar = zzb;
        int length = bArr.length;
        zzvn zzvnVar = (zzvn) zzafVar.h(4, null);
        try {
            zzxf zzxfVarZzb = zzxb.zza().zzb(zzvnVar.getClass());
            zzxfVarZzb.zzh(zzvnVar, bArr, 0, length, new zzty(zzuyVar));
            zzxfVarZzb.zzf(zzvnVar);
            if (zzvnVar.zzt()) {
                return (zzaf) zzvnVar;
            }
            zzvv zzvvVarZza = new zzxv(zzvnVar).zza();
            zzvvVarZza.zzf(zzvnVar);
            throw zzvvVarZza;
        } catch (zzvv e12) {
            e12.zzf(zzvnVar);
            throw e12;
        } catch (zzxv e13) {
            zzvv zzvvVarZza2 = e13.zza();
            zzvvVarZza2.zzf(zzvnVar);
            throw zzvvVarZza2;
        } catch (IOException e14) {
            if (e14.getCause() instanceof zzvv) {
                throw ((zzvv) e14.getCause());
            }
            zzvv zzvvVar = new zzvv(e14);
            zzvvVar.zzf(zzvnVar);
            throw zzvvVar;
        } catch (IndexOutOfBoundsException unused) {
            zzvv zzvvVarD = zzvv.d();
            zzvvVarD.zzf(zzvnVar);
            throw zzvvVarD;
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face_bundled.zzvn
    public final Object h(int i12, zzvn zzvnVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i13 == 2) {
            return new zzxd(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i13 == 3) {
            return new zzaf();
        }
        zzr zzrVar = null;
        if (i13 == 4) {
            return new zzae(zzrVar);
        }
        if (i13 == 5) {
            return zzb;
        }
        this.zzf = zzvnVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final zzzh zzc() {
        zzzh zzzhVar = this.zze;
        return zzzhVar == null ? zzzh.zzd() : zzzhVar;
    }
}
