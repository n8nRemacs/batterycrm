package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzr extends zzal {

    /* renamed from: d, reason: collision with root package name */
    public final zzv f351168d;

    public zzr(zzv zzvVar) {
        super("internal.logger");
        this.f351168d = zzvVar;
        this.f350561c.put("log", new zzu(this, false, true));
        this.f350561c.put("silent", new zzq("silent"));
        ((zzal) this.f350561c.get("silent")).zza("log", new zzu(this, true, true));
        this.f350561c.put("unmonitored", new zzt("unmonitored"));
        ((zzal) this.f350561c.get("unmonitored")).zza("log", new zzu(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq zza(zzh zzhVar, List<zzaq> list) {
        return zzaq.zzc;
    }
}
