package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
public final class zzdn {

    /* renamed from: b, reason: collision with root package name */
    public static volatile zzdn f352419b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzdn f352420c = new zzdn(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map f352421a;

    public zzdn() {
        this.f352421a = new HashMap();
    }

    public static zzdn zza() {
        zzdn zzdnVar = f352419b;
        if (zzdnVar == null) {
            synchronized (zzdn.class) {
                try {
                    zzdnVar = f352419b;
                    if (zzdnVar == null) {
                        zzdnVar = f352420c;
                        f352419b = zzdnVar;
                    }
                } finally {
                }
            }
        }
        return zzdnVar;
    }

    public final zzea zzb(zzfl zzflVar, int i12) {
        return (zzea) this.f352421a.get(new zzdm(zzflVar, i12));
    }

    public zzdn(int i12) {
        this.f352421a = Collections.emptyMap();
    }
}
