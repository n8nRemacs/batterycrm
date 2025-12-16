package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public class zzis {

    /* renamed from: b, reason: collision with root package name */
    public static volatile zzis f350871b;

    /* renamed from: c, reason: collision with root package name */
    public static final zzis f350872c = new zzis(0);

    /* renamed from: a, reason: collision with root package name */
    public final Map<zza, zzjf.zzf<?, ?>> f350873a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
    public static final class zza {

        /* renamed from: a, reason: collision with root package name */
        public final zzkr f350874a;

        /* renamed from: b, reason: collision with root package name */
        public final int f350875b;

        public zza(zzkr zzkrVar, int i12) {
            this.f350874a = zzkrVar;
            this.f350875b = i12;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.f350874a == zzaVar.f350874a && this.f350875b == zzaVar.f350875b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f350874a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f350875b;
        }
    }

    public zzis() {
        this.f350873a = new HashMap();
    }

    public static zzis zza() {
        zzis zzisVar = f350871b;
        if (zzisVar != null) {
            return zzisVar;
        }
        synchronized (zzis.class) {
            try {
                zzis zzisVar2 = f350871b;
                if (zzisVar2 != null) {
                    return zzisVar2;
                }
                zzis zzisVarA = zzjd.a();
                f350871b = zzisVarA;
                return zzisVarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public zzis(int i12) {
        this.f350873a = Collections.emptyMap();
    }

    public final <ContainingType extends zzkr> zzjf.zzf<ContainingType, ?> zza(ContainingType containingtype, int i12) {
        return (zzjf.zzf) this.f350873a.get(new zza(containingtype, i12));
    }
}
