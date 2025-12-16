package com.huawei.hmf.tasks;

import android.os.Looper;
import com.huawei.hmf.tasks.a.w;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public class n {
    static {
        new w();
    }

    public static <TResult> TResult a(Task<TResult> task) throws ExecutionException, InterruptedException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("await must not be called on the UI thread");
        }
        if (task.e()) {
            if (task.f()) {
                return task.d();
            }
            throw new ExecutionException(task.c());
        }
        w.a aVar = new w.a();
        task.b(aVar).a(aVar);
        aVar.f363207b.await();
        if (task.f()) {
            return task.d();
        }
        throw new ExecutionException(task.c());
    }
}
