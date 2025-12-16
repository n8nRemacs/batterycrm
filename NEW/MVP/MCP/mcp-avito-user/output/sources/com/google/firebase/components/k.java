package com.google.firebase.components;

import java.util.Map;
import tZ0.C48621a;
import tZ0.InterfaceC48622b;
import wZ0.InterfaceC49583a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f360749b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f360750c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f360751d;

    public /* synthetic */ k(int i12, Object obj, Object obj2) {
        this.f360749b = i12;
        this.f360751d = obj;
        this.f360750c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC49583a.InterfaceC12820a<T> interfaceC12820a;
        switch (this.f360749b) {
            case 0:
                s sVar = (s) this.f360751d;
                wZ0.b<T> bVar = (wZ0.b) this.f360750c;
                if (sVar.f360785b != s.f360783d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (sVar) {
                    interfaceC12820a = sVar.f360784a;
                    sVar.f360784a = null;
                    sVar.f360785b = bVar;
                }
                interfaceC12820a.d(bVar);
                return;
            case 1:
                q qVar = (q) this.f360751d;
                wZ0.b bVar2 = (wZ0.b) this.f360750c;
                synchronized (qVar) {
                    try {
                        if (qVar.f360779b == null) {
                            qVar.f360778a.add(bVar2);
                        } else {
                            qVar.f360779b.add(bVar2.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                ((InterfaceC48622b) ((Map.Entry) this.f360751d).getKey()).a((C48621a) this.f360750c);
                return;
        }
    }
}
