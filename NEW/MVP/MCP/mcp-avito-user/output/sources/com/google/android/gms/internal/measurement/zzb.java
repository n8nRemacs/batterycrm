package com.google.android.gms.internal.measurement;

import XY0.e;
import com.google.android.gms.internal.measurement.zzfp;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzb {

    /* renamed from: a, reason: collision with root package name */
    @e
    public final zzf f350576a;

    /* renamed from: b, reason: collision with root package name */
    @e
    public zzh f350577b;

    /* renamed from: c, reason: collision with root package name */
    @e
    public final zzac f350578c;

    /* renamed from: d, reason: collision with root package name */
    public final zzaa f350579d;

    public zzb() {
        zzf zzfVar = new zzf();
        this.f350576a = zzfVar;
        this.f350577b = zzfVar.f350740b.zza();
        this.f350578c = new zzac();
        this.f350579d = new zzaa();
        zzfVar.zza("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.zza
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzw(this.f350540b.f350579d);
            }
        });
        zzfVar.zza("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.zzd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzk(this.f350610b.f350578c);
            }
        });
    }

    public final zzac zza() {
        return this.f350578c;
    }

    public final boolean zzc() {
        return !this.f350578c.zzc().isEmpty();
    }

    public final boolean zzd() {
        zzac zzacVar = this.f350578c;
        return !zzacVar.zzb().equals(zzacVar.zza());
    }

    public final void zza(zzfp.zzc zzcVar) throws zzc {
        zzal zzalVar;
        zzf zzfVar = this.f350576a;
        try {
            this.f350577b = zzfVar.f350740b.zza();
            if (zzfVar.zza(this.f350577b, (zzfp.zzd[]) zzcVar.zzc().toArray(new zzfp.zzd[0])) instanceof zzaj) {
                throw new IllegalStateException("Program loading failed");
            }
            for (zzfp.zzb zzbVar : zzcVar.zza().zzd()) {
                List<zzfp.zzd> listZzc = zzbVar.zzc();
                String strZzb = zzbVar.zzb();
                Iterator<zzfp.zzd> it = listZzc.iterator();
                while (it.hasNext()) {
                    zzaq zzaqVarZza = zzfVar.zza(this.f350577b, it.next());
                    if (!(zzaqVarZza instanceof zzap)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    zzh zzhVar = this.f350577b;
                    if (zzhVar.zzb(strZzb)) {
                        zzaq zzaqVarZza2 = zzhVar.zza(strZzb);
                        if (!(zzaqVarZza2 instanceof zzal)) {
                            throw new IllegalStateException("Invalid function name: " + strZzb);
                        }
                        zzalVar = (zzal) zzaqVarZza2;
                    } else {
                        zzalVar = null;
                    }
                    if (zzalVar == null) {
                        throw new IllegalStateException("Rule function is undefined: " + strZzb);
                    }
                    zzalVar.zza(this.f350577b, Collections.singletonList(zzaqVarZza));
                }
            }
        } catch (Throwable th2) {
            throw new zzc(th2);
        }
    }

    public final void zza(String str, Callable<? extends zzal> callable) {
        this.f350576a.zza(str, callable);
    }

    public final boolean zza(zzad zzadVar) throws zzc {
        zzac zzacVar = this.f350578c;
        try {
            zzacVar.zza(zzadVar);
            this.f350576a.f350741c.zzc("runtime.counter", new zzai(Double.valueOf(0.0d)));
            this.f350579d.zza(this.f350577b.zza(), zzacVar);
            if (zzd()) {
                return true;
            }
            return zzc();
        } catch (Throwable th2) {
            throw new zzc(th2);
        }
    }
}
