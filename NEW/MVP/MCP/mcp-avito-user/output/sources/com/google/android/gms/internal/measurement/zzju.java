package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
final class zzju<K> implements Map.Entry<K, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final Map.Entry<K, zzjr> f350903b;

    public zzju() {
        throw null;
    }

    public zzju(Map.Entry entry, zzjt zzjtVar) {
        this.f350903b = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f350903b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f350903b.getValue() == null) {
            return null;
        }
        return zzjr.zza();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzkr) {
            return this.f350903b.getValue().zza((zzkr) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzjr zza() {
        return this.f350903b.getValue();
    }
}
