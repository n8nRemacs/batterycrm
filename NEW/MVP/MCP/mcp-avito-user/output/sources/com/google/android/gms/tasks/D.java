package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class D implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f355638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E f355639c;

    public D(E e12, Task task) {
        this.f355639c = e12;
        this.f355638b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f355639c.f355642c) {
            try {
                InterfaceC37023f interfaceC37023f = this.f355639c.f355643d;
                if (interfaceC37023f != null) {
                    Exception excM = this.f355638b.m();
                    C36729v.j(excM);
                    interfaceC37023f.onFailure(excM);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
