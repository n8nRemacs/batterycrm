package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class F implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f355644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G f355645c;

    public F(G g12, Task task) {
        this.f355645c = g12;
        this.f355644b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f355645c.f355647c) {
            try {
                InterfaceC37024g interfaceC37024g = this.f355645c.f355648d;
                if (interfaceC37024g != null) {
                    interfaceC37024g.onSuccess(this.f355644b.n());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
