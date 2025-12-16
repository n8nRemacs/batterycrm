package com.google.android.gms.internal.fido;

import I41.a;
import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzcx extends zzcs implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final zzcs f350313b;

    public zzcx(zzcs zzcsVar) {
        this.f350313b = zzcsVar;
    }

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f350313b.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcx) {
            return this.f350313b.equals(((zzcx) obj).f350313b);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f350313b.hashCode();
    }

    public final String toString() {
        return this.f350313b.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.fido.zzcs
    public final zzcs zza() {
        return this.f350313b;
    }
}
