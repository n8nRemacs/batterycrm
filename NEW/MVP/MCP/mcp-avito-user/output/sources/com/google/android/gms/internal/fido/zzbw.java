package com.google.android.gms.internal.fido;

import I41.a;
import java.io.Serializable;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
final class zzbw extends zzcs implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f350276b;

    public zzbw(Comparator comparator) {
        comparator.getClass();
        this.f350276b = comparator;
    }

    @Override // com.google.android.gms.internal.fido.zzcs, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f350276b.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbw) {
            return this.f350276b.equals(((zzbw) obj).f350276b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f350276b.hashCode();
    }

    public final String toString() {
        return this.f350276b.toString();
    }
}
