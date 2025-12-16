package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f355686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f355687c;

    public v(w wVar, Task task) {
        this.f355687c = wVar;
        this.f355686b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.f355686b;
        boolean zP2 = task.p();
        w wVar = this.f355687c;
        if (zP2) {
            wVar.f355690d.w();
            return;
        }
        try {
            wVar.f355690d.v(wVar.f355689c.then(task));
        } catch (RuntimeExecutionException e12) {
            if (e12.getCause() instanceof Exception) {
                wVar.f355690d.u((Exception) e12.getCause());
            } else {
                wVar.f355690d.u(e12);
            }
        } catch (Exception e13) {
            wVar.f355690d.u(e13);
        }
    }
}
