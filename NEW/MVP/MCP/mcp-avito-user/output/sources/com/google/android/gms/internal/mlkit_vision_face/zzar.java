package com.google.android.gms.internal.mlkit_vision_face;

import I41.a;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
abstract class zzar implements zzca {

    /* renamed from: b, reason: collision with root package name */
    @a
    public transient Set f352964b;

    /* renamed from: c, reason: collision with root package name */
    @a
    public transient Map f352965c;

    public abstract Map a();

    public abstract Set b();

    public final boolean equals(@a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            return zzp().equals(((zzca) obj).zzp());
        }
        return false;
    }

    public final int hashCode() {
        return zzp().hashCode();
    }

    public final String toString() {
        return ((zzah) zzp()).f352946e.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public boolean zzo(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final Map zzp() {
        Map map = this.f352965c;
        if (map != null) {
            return map;
        }
        Map mapA = a();
        this.f352965c = mapA;
        return mapA;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final Set zzq() {
        Set set = this.f352964b;
        if (set != null) {
            return set;
        }
        Set setB = b();
        this.f352964b = setB;
        return setB;
    }
}
