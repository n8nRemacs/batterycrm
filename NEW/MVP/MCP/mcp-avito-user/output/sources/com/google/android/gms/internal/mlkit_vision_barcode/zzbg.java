package com.google.android.gms.internal.mlkit_vision_barcode;

import I41.a;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
abstract class zzbg implements zzcp {

    /* renamed from: b, reason: collision with root package name */
    @a
    public transient Set f351778b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient Map f351779c;

    public abstract Map a();

    public abstract Set b();

    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcp) {
            return zzp().equals(((zzcp) obj).zzp());
        }
        return false;
    }

    public final int hashCode() {
        return zzp().hashCode();
    }

    public final String toString() {
        return ((zzaw) zzp()).f351760e.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcp
    public boolean zzo(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcp
    public final Map zzp() {
        Map map = this.f351779c;
        if (map != null) {
            return map;
        }
        Map mapA = a();
        this.f351779c = mapA;
        return mapA;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcp
    public final Set zzq() {
        Set set = this.f351778b;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.f351778b = setB;
        return setB;
    }
}
