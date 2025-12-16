package com.google.mlkit.common.sdkinternal;

import java.util.HashMap;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* renamed from: com.google.mlkit.common.sdkinternal.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37638g<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @j.B
    public final HashMap f362334a = new HashMap();

    @j.N
    @RX0.a
    public abstract V a(@j.N K k12);

    @j.N
    @RX0.a
    public V get(@j.N K k12) {
        synchronized (this.f362334a) {
            try {
                if (this.f362334a.containsKey(k12)) {
                    return (V) this.f362334a.get(k12);
                }
                V vA2 = a(k12);
                this.f362334a.put(k12, vA2);
                return vA2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
