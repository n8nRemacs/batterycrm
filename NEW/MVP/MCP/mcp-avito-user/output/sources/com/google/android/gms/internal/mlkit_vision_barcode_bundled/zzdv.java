package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzdv implements zzfj {

    /* renamed from: a, reason: collision with root package name */
    public static final zzdv f352434a = new zzdv();

    public static zzdv zza() {
        return f352434a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final zzfi zzb(Class cls) {
        if (!zzec.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (zzfi) zzec.d(cls.asSubclass(zzec.class)).m(3, null);
        } catch (Exception e12) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e12);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfj
    public final boolean zzc(Class cls) {
        return zzec.class.isAssignableFrom(cls);
    }
}
