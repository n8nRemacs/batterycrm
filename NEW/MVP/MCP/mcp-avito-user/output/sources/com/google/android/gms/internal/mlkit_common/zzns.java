package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public final class zzns {

    /* renamed from: a, reason: collision with root package name */
    public final String f351667a;

    /* renamed from: b, reason: collision with root package name */
    public final zznq f351668b;

    /* renamed from: c, reason: collision with root package name */
    public final String f351669c;

    /* renamed from: d, reason: collision with root package name */
    public final zznp f351670d;

    public /* synthetic */ zzns(zzno zznoVar, zznr zznrVar) {
        this.f351667a = zznoVar.f351659a;
        this.f351668b = zznoVar.f351660b;
        this.f351669c = zznoVar.f351661c;
        this.f351670d = zznoVar.f351662d;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzns)) {
            return false;
        }
        zzns zznsVar = (zzns) obj;
        return C36727t.a(this.f351667a, zznsVar.f351667a) && C36727t.a(null, null) && C36727t.a(this.f351668b, zznsVar.f351668b) && C36727t.a(null, null) && C36727t.a(this.f351669c, zznsVar.f351669c) && C36727t.a(this.f351670d, zznsVar.f351670d) && C36727t.a(null, null) && C36727t.a(null, null) && C36727t.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f351667a, null, this.f351668b, null, this.f351669c, this.f351670d, null, null, null});
    }

    @zzbn(zza = 6)
    @P
    public final zznp zza() {
        return this.f351670d;
    }

    @zzbn(zza = 3)
    @P
    public final zznq zzb() {
        return this.f351668b;
    }

    @zzbn(zza = 5)
    @P
    public final String zzc() {
        return this.f351669c;
    }

    @zzbn(zza = 1)
    @P
    public final String zzd() {
        return this.f351667a;
    }
}
