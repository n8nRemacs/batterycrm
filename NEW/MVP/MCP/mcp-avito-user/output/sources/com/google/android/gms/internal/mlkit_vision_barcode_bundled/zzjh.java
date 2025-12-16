package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzjh extends zzdy implements zzfm {
    private static final zzjh zze;
    private byte zzf = 2;

    static {
        zzjh zzjhVar = new zzjh();
        zze = zzjhVar;
        zzec.k(zzjh.class, zzjhVar);
    }

    public static zzjh zzf() {
        return zze;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzec
    public final Object m(int i12, zzec zzecVar) {
        int i13 = i12 - 1;
        if (i13 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i13 == 2) {
            return new zzfw(zze, "\u0003\u0000", null);
        }
        if (i13 == 3) {
            return new zzjh();
        }
        if (i13 == 4) {
            return new zzjg(null);
        }
        if (i13 == 5) {
            return zze;
        }
        this.zzf = zzecVar == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
