package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.android.gms.common.internal.C36727t;
import j.P;
import java.util.Arrays;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzne {

    /* renamed from: a, reason: collision with root package name */
    public final zznb f353923a;

    /* renamed from: b, reason: collision with root package name */
    public final zzmz f353924b;

    /* renamed from: c, reason: collision with root package name */
    public final zznc f353925c;

    /* renamed from: d, reason: collision with root package name */
    public final zzna f353926d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f353927e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f353928f;

    public /* synthetic */ zzne(zzmy zzmyVar, zznd zzndVar) {
        this.f353923a = zzmyVar.f353908a;
        this.f353924b = zzmyVar.f353909b;
        this.f353925c = zzmyVar.f353910c;
        this.f353926d = zzmyVar.f353911d;
        this.f353927e = zzmyVar.f353912e;
        this.f353928f = zzmyVar.f353913f;
    }

    public final boolean equals(@P Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzne)) {
            return false;
        }
        zzne zzneVar = (zzne) obj;
        return C36727t.a(this.f353923a, zzneVar.f353923a) && C36727t.a(this.f353924b, zzneVar.f353924b) && C36727t.a(this.f353925c, zzneVar.f353925c) && C36727t.a(this.f353926d, zzneVar.f353926d) && C36727t.a(this.f353927e, zzneVar.f353927e) && C36727t.a(this.f353928f, zzneVar.f353928f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f353923a, this.f353924b, this.f353925c, this.f353926d, this.f353927e, this.f353928f});
    }

    @zzcb(zza = 2)
    @P
    public final zzmz zza() {
        return this.f353924b;
    }

    @zzcb(zza = 4)
    @P
    public final zzna zzb() {
        return this.f353926d;
    }

    @zzcb(zza = 1)
    @P
    public final zznb zzc() {
        return this.f353923a;
    }

    @zzcb(zza = 3)
    @P
    public final zznc zzd() {
        return this.f353925c;
    }

    @zzcb(zza = 5)
    @P
    public final Boolean zze() {
        return this.f353927e;
    }

    @zzcb(zza = 6)
    @P
    public final Float zzf() {
        return this.f353928f;
    }
}
