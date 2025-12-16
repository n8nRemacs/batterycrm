package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public abstract class n5e {
    public static final cj0 a = new cj0(16);

    public static Object a(Task task) throws InterruptedException {
        s5j.f("Must not be called on the main application thread");
        s5j.e();
        s5j.h(task, "Task must not be null");
        if (task.g()) {
            return g(task);
        }
        vgd vgdVar = new vgd(13);
        Executor executor = u2g.b;
        task.d(executor, vgdVar);
        task.c(executor, vgdVar);
        task.a(executor, vgdVar);
        ((CountDownLatch) vgdVar.b).await();
        return g(task);
    }

    public static Object b(Task task, long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        s5j.f("Must not be called on the main application thread");
        s5j.e();
        s5j.h(task, "Task must not be null");
        s5j.h(timeUnit, "TimeUnit must not be null");
        if (task.g()) {
            return g(task);
        }
        vgd vgdVar = new vgd(13);
        Executor executor = u2g.b;
        task.d(executor, vgdVar);
        task.c(executor, vgdVar);
        task.a(executor, vgdVar);
        if (((CountDownLatch) vgdVar.b).await(j, timeUnit)) {
            return g(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static final int c(RecyclerView recyclerView, int i, int i2) {
        int width = (recyclerView.getWidth() - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        if (width <= 0) {
            width = (recyclerView.getContext().getResources().getDisplayMetrics().widthPixels - recyclerView.getPaddingLeft()) - recyclerView.getPaddingRight();
        }
        int i3 = width - (i * i2);
        int i4 = i2 - 1;
        return i3 / (i4 >= 1 ? i4 : 1);
    }

    public static ybj d(Callable callable, Executor executor) {
        s5j.h(executor, "Executor must not be null");
        ybj ybjVar = new ybj();
        executor.execute(new c5e(ybjVar, 17, callable));
        return ybjVar;
    }

    public static ybj e(Exception exc) {
        ybj ybjVar = new ybj();
        ybjVar.n(exc);
        return ybjVar;
    }

    public static ybj f(Object obj) {
        ybj ybjVar = new ybj();
        ybjVar.o(obj);
        return ybjVar;
    }

    public static Object g(Task task) throws ExecutionException {
        if (task.h()) {
            return task.f();
        }
        if (((ybj) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.e());
    }
}
