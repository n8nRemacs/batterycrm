package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzx extends zzal {

    /* renamed from: d, reason: collision with root package name */
    public final Callable<Object> f351174d;

    public zzx(String str, Callable<Object> callable) {
        super(str);
        this.f351174d = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        try {
            return zzj.zza(this.f351174d.call());
        } catch (Exception unused) {
            return zzaq.zzc;
        }
    }
}
