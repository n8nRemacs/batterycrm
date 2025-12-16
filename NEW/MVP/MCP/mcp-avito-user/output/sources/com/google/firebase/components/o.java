package com.google.firebase.components;

import j.B;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import tZ0.InterfaceC48622b;
import tZ0.InterfaceC48623c;
import tZ0.InterfaceC48624d;

/* compiled from: EventBus.java */
/* loaded from: classes13.dex */
class o implements InterfaceC48624d, InterfaceC48623c {

    /* renamed from: a, reason: collision with root package name */
    @B
    public final HashMap f360772a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @B
    public ArrayDeque f360773b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f360774c;

    public o(Executor executor) {
        this.f360774c = executor;
    }

    @Override // tZ0.InterfaceC48624d
    public final synchronized void a(Executor executor, InterfaceC48622b interfaceC48622b) {
        try {
            interfaceC48622b.getClass();
            executor.getClass();
            if (!this.f360772a.containsKey(com.google.firebase.c.class)) {
                this.f360772a.put(com.google.firebase.c.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f360772a.get(com.google.firebase.c.class)).put(interfaceC48622b, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // tZ0.InterfaceC48624d
    public final void b(com.google.firebase.messaging.q qVar) {
        a(this.f360774c, qVar);
    }
}
