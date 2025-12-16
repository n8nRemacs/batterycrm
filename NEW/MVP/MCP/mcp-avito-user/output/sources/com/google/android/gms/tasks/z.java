package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f355696b;

    public z(A a12) {
        this.f355696b = a12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f355696b.f355631c) {
            try {
                InterfaceC37021d interfaceC37021d = this.f355696b.f355632d;
                if (interfaceC37021d != null) {
                    interfaceC37021d.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
