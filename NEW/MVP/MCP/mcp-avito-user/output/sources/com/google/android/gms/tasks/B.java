package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class B implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f355633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f355634c;

    public B(C c12, Task task) {
        this.f355634c = c12;
        this.f355633b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f355634c.f355636c) {
            try {
                InterfaceC37022e interfaceC37022e = this.f355634c.f355637d;
                if (interfaceC37022e != null) {
                    interfaceC37022e.onComplete(this.f355633b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
