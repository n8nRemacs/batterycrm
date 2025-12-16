package com.google.android.gms.internal.auth;

import I41.h;
import android.content.Context;
import androidx.camera.core.Q;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
final class zzcd extends zzda {

    /* renamed from: a, reason: collision with root package name */
    public final Context f350037a;

    /* renamed from: b, reason: collision with root package name */
    public final zzdj f350038b;

    public zzcd(Context context, @h zzdj zzdjVar) {
        this.f350037a = context;
        this.f350038b = zzdjVar;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    public final Context a() {
        return this.f350037a;
    }

    @Override // com.google.android.gms.internal.auth.zzda
    @h
    public final zzdj b() {
        return this.f350038b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzda) {
            zzda zzdaVar = (zzda) obj;
            if (this.f350037a.equals(zzdaVar.a()) && this.f350038b.equals(zzdaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f350037a.hashCode() ^ 1000003) * 1000003) ^ this.f350038b.hashCode();
    }

    public final String toString() {
        return Q.a("FlagsContext{context=", this.f350037a.toString(), ", hermeticFileOverrides=", this.f350038b.toString(), "}");
    }
}
