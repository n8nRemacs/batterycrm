package com.google.photos.vision.barhopper;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdb;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdn;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzek;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfm;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* renamed from: com.google.photos.vision.barhopper.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C37647a extends zzec<C37647a, z> implements zzfm {
    private static final C37647a zza;
    private int zze;
    private int zzg;
    private byte zzj = 2;
    private zzek zzf = zzec.h();
    private String zzh = "";
    private zzdb zzi = zzdb.zzb;

    static {
        C37647a c37647a = new C37647a();
        zza = c37647a;
        zzec.k(C37647a.class, c37647a);
    }

    public static C37647a o(byte[] bArr, zzdn zzdnVar) {
        return (C37647a) zzec.e(zza, bArr, zzdnVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    @j.N
    public final Object m(int i12, @j.N zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i13 == 2) {
            return zzec.j(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ᔌ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", s.class, "zzg", C37656j.f362587a, "zzh", "zzi"});
        }
        if (i13 == 3) {
            return new C37647a();
        }
        C37648b c37648b = null;
        if (i13 == 4) {
            return new z(c37648b);
        }
        if (i13 == 5) {
            return zza;
        }
        this.zzj = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }

    @j.N
    public final zzek p() {
        return this.zzf;
    }
}
