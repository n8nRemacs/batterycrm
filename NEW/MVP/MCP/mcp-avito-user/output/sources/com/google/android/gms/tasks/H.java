package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class H implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Task f355649b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f355650c;

    public H(I i12, Task task) {
        this.f355650c = i12;
        this.f355649b = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I i12 = this.f355650c;
        try {
            Task taskA = i12.f355652c.a(this.f355649b.n());
            if (taskA == null) {
                i12.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C37029l.f355674b;
            taskA.h(executor, i12);
            taskA.f(executor, i12);
            taskA.b(executor, i12);
        } catch (RuntimeExecutionException e12) {
            if (e12.getCause() instanceof Exception) {
                i12.onFailure((Exception) e12.getCause());
            } else {
                i12.onFailure(e12);
            }
        } catch (CancellationException unused) {
            i12.onCanceled();
        } catch (Exception e13) {
            i12.onFailure(e13);
        }
    }
}
