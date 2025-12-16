package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f355691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f355692c;

    public x(y yVar, Task task) {
        this.f355692c = yVar;
        this.f355691b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f355692c;
        try {
            Task task = (Task) yVar.f355694c.then(this.f355691b);
            if (task == null) {
                yVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C37029l.f355674b;
            task.h(executor, yVar);
            task.f(executor, yVar);
            task.b(executor, yVar);
        } catch (RuntimeExecutionException e12) {
            if (e12.getCause() instanceof Exception) {
                yVar.f355695d.u((Exception) e12.getCause());
            } else {
                yVar.f355695d.u(e12);
            }
        } catch (Exception e13) {
            yVar.f355695d.u(e13);
        }
    }
}
