package com.google.android.gms.internal.measurement;

import I41.h;
import android.content.Context;
import androidx.camera.core.Q;
import com.google.common.base.H;
import com.google.common.base.e0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
final class zzgd extends zzhc {

    /* renamed from: a, reason: collision with root package name */
    public final Context f350784a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public final e0<H<zzgp>> f350785b;

    public zzgd(Context context, @h e0<H<zzgp>> e0Var) {
        this.f350784a = context;
        this.f350785b = e0Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    public final Context a() {
        return this.f350784a;
    }

    @Override // com.google.android.gms.internal.measurement.zzhc
    @h
    public final e0<H<zzgp>> b() {
        return this.f350785b;
    }

    public final boolean equals(Object obj) {
        e0<H<zzgp>> e0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhc) {
            zzhc zzhcVar = (zzhc) obj;
            if (this.f350784a.equals(zzhcVar.a()) && ((e0Var = this.f350785b) != null ? e0Var.equals(zzhcVar.b()) : zzhcVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f350784a.hashCode() ^ 1000003) * 1000003;
        e0<H<zzgp>> e0Var = this.f350785b;
        return iHashCode ^ (e0Var == null ? 0 : e0Var.hashCode());
    }

    public final String toString() {
        return Q.a("FlagsContext{context=", String.valueOf(this.f350784a), ", hermeticFileOverrides=", String.valueOf(this.f350785b), "}");
    }
}
