package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.util.E;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SerializerCache.java */
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<E, com.fasterxml.jackson.databind.l<Object>> f342331a = new HashMap<>(64);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference<com.fasterxml.jackson.databind.ser.impl.l> f342332b = new AtomicReference<>();

    public final com.fasterxml.jackson.databind.l<Object> a(com.fasterxml.jackson.databind.h hVar) {
        com.fasterxml.jackson.databind.l<Object> lVar;
        synchronized (this) {
            lVar = this.f342331a.get(new E(hVar, false));
        }
        return lVar;
    }

    public final com.fasterxml.jackson.databind.l<Object> b(Class<?> cls) {
        com.fasterxml.jackson.databind.l<Object> lVar;
        synchronized (this) {
            lVar = this.f342331a.get(new E(false, (Class) cls));
        }
        return lVar;
    }
}
