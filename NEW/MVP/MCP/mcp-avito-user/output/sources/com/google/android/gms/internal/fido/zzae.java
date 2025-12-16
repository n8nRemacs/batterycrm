package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzae {

    /* renamed from: a, reason: collision with root package name */
    public static final zzbp f350256a;

    static {
        new zzai();
        f350256a = zzbt.zza(new zzbp() { // from class: com.google.android.gms.internal.fido.zzad
            @Override // com.google.android.gms.internal.fido.zzbp
            public final Object zza() {
                throw null;
            }
        });
    }

    public static zzae zza() {
        if (zzah.f350259c == null) {
            zzah.f350259c = new zzag(null);
        }
        synchronized (zzah.f350257a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public static boolean zzb() {
        synchronized (zzah.f350257a) {
        }
        if (zzah.f350258b != null) {
            return false;
        }
        zzah.f350258b = new zzag(null);
        return false;
    }
}
