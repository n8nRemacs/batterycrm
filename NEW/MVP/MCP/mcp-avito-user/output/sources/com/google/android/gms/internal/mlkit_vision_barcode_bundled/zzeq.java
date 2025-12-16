package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* loaded from: classes6.dex */
final class zzeq implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public final Map.Entry f352453b;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f352453b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((zzes) this.f352453b.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzfl) {
            return ((zzes) this.f352453b.getValue()).zzc((zzfl) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzes zza() {
        return (zzes) this.f352453b.getValue();
    }
}
