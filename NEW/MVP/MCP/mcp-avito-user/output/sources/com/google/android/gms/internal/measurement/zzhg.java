package com.google.android.gms.internal.measurement;

import com.google.common.base.M;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzhg {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f350831a;

    public zzhg(zzhj zzhjVar) {
        M.j(zzhjVar, "BuildInfo must be non-null");
        this.f350831a = !zzhjVar.zza();
    }

    public final boolean zza(String str) {
        M.j(str, "flagName must not be null");
        if (this.f350831a) {
            return zzhi.zza.get().containsValue(str);
        }
        return true;
    }
}
