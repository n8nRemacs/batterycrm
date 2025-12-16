package bolts;

import defpackage.ao6;
import defpackage.ar0;
import defpackage.b2g;
import defpackage.c2g;
import defpackage.c5e;
import defpackage.d2g;
import defpackage.e2g;
import defpackage.f2g;
import defpackage.g2g;
import defpackage.h2g;
import defpackage.i2g;
import defpackage.j2g;
import defpackage.o2g;
import defpackage.od;
import defpackage.ox4;
import defpackage.p44;
import defpackage.r98;
import defpackage.s42;
import defpackage.srg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    private static final Executor IMMEDIATE_EXECUTOR;
    private static Task<?> TASK_CANCELLED;
    private static Task<Boolean> TASK_FALSE;
    private static Task<?> TASK_NULL;
    private static Task<Boolean> TASK_TRUE;
    public static final Executor UI_THREAD_EXECUTOR;
    private static volatile j2g unobservedExceptionHandler;
    private boolean cancelled;
    private boolean complete;
    private Exception error;
    private boolean errorHasBeenObserved;
    private TResult result;
    private srg unobservedErrorNotifier;
    private final Object lock = new Object();
    private List<p44> continuations = new ArrayList();

    static {
        ar0 ar0Var = ar0.d;
        BACKGROUND_EXECUTOR = ar0Var.a;
        IMMEDIATE_EXECUTOR = ar0Var.c;
        UI_THREAD_EXECUTOR = od.b.a;
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    public Task() {
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, null);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> cancelled() {
        return (Task<TResult>) TASK_CANCELLED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeAfterTask(o2g o2gVar, p44 p44Var, Task<TResult> task, Executor executor, s42 s42Var) {
        try {
            executor.execute(new d2g(o2gVar, p44Var, task, 1));
        } catch (Exception e) {
            o2gVar.b(new ExecutorException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeImmediately(o2g o2gVar, p44 p44Var, Task<TResult> task, Executor executor, s42 s42Var) {
        try {
            executor.execute(new d2g(o2gVar, p44Var, task, 0));
        } catch (Exception e) {
            o2gVar.b(new ExecutorException(e));
        }
    }

    public static <TResult> i2g create() {
        new Task();
        return new i2g();
    }

    public static Task<Void> delay(long j) {
        return delay(j, ar0.d.b, null);
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        Task<TResult> task = new Task<>();
        if (task.trySetError(exc)) {
            return task;
        }
        throw new IllegalStateException("Cannot set the error on a completed task.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == 0) {
            return (Task<TResult>) TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (Task<TResult>) TASK_TRUE : (Task<TResult>) TASK_FALSE;
        }
        Task<TResult> task = new Task<>();
        if (task.trySetResult(tresult)) {
            return task;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }

    public static j2g getUnobservedExceptionHandler() {
        return null;
    }

    private void runContinuations() {
        synchronized (this.lock) {
            Iterator<p44> it = this.continuations.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.continuations = null;
        }
    }

    public static void setUnobservedExceptionHandler(j2g j2gVar) {
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        o2g o2gVar = new o2g();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new h2g(obj, arrayList, atomicBoolean, atomicInteger, o2gVar));
        }
        return o2gVar.a;
    }

    public static <TResult> Task<List<TResult>> whenAllResult(Collection<? extends Task<TResult>> collection) {
        return (Task<List<TResult>>) whenAll(collection).onSuccess(new e2g(1, collection));
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        o2g o2gVar = new o2g();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new g2g(atomicBoolean, o2gVar, 1));
        }
        return o2gVar.a;
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        o2g o2gVar = new o2g();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<TResult>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new g2g(atomicBoolean, o2gVar, 0));
        }
        return o2gVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> Task<TOut> cast() {
        return this;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, p44 p44Var) {
        return continueWhile(callable, p44Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(p44 p44Var, Executor executor) {
        return continueWith(p44Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(p44 p44Var, Executor executor) {
        return continueWithTask(p44Var, executor, null);
    }

    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            try {
                exc = this.error;
                if (exc != null) {
                    this.errorHasBeenObserved = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.lock) {
            z = this.cancelled;
        }
        return z;
    }

    public boolean isCompleted() {
        boolean z;
        synchronized (this.lock) {
            z = this.complete;
        }
        return z;
    }

    public boolean isFaulted() {
        boolean z;
        synchronized (this.lock) {
            z = getError() != null;
        }
        return z;
    }

    public Task<Void> makeVoid() {
        return continueWithTask(new f2g());
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(p44 p44Var, Executor executor) {
        return onSuccess(p44Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(p44 p44Var, Executor executor) {
        return onSuccessTask(p44Var, executor, null);
    }

    public boolean trySetCancelled() {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.cancelled = true;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean trySetError(Exception exc) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.error = exc;
                this.errorHasBeenObserved = false;
                this.lock.notifyAll();
                runContinuations();
                if (!this.errorHasBeenObserved) {
                    getUnobservedExceptionHandler();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean trySetResult(TResult tresult) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.result = tresult;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void waitForCompletion() throws InterruptedException {
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, s42 s42Var) {
        o2g o2gVar = new o2g();
        try {
            executor.execute(new c5e(o2gVar, 5, callable));
        } catch (Exception e) {
            o2gVar.b(new ExecutorException(e));
        }
        return o2gVar.a;
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, s42 s42Var) {
        return call(callable, BACKGROUND_EXECUTOR, s42Var);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, p44 p44Var, s42 s42Var) {
        return continueWhile(callable, p44Var, IMMEDIATE_EXECUTOR, s42Var);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(p44 p44Var, Executor executor, s42 s42Var) {
        boolean zIsCompleted;
        o2g o2gVar = new o2g();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new b2g(o2gVar, p44Var, executor, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            completeImmediately(o2gVar, p44Var, this, executor, s42Var);
        }
        return o2gVar.a;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(p44 p44Var, Executor executor, s42 s42Var) {
        boolean zIsCompleted;
        o2g o2gVar = new o2g();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new b2g(o2gVar, p44Var, executor, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            completeAfterTask(o2gVar, p44Var, this, executor, s42Var);
        }
        return o2gVar.a;
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(p44 p44Var, Executor executor, s42 s42Var) {
        return continueWithTask(new c2g(p44Var, 0), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(p44 p44Var, Executor executor, s42 s42Var) {
        return continueWithTask(new c2g(p44Var, 1), executor);
    }

    public static Task<Void> delay(long j, s42 s42Var) {
        return delay(j, ar0.d.b, s42Var);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, p44 p44Var, Executor executor) {
        return continueWhile(callable, p44Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(p44 p44Var) {
        return onSuccess(p44Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(p44 p44Var) {
        return onSuccessTask(p44Var, IMMEDIATE_EXECUTOR);
    }

    private Task(TResult tresult) {
        trySetResult(tresult);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, p44 p44Var, Executor executor, s42 s42Var) {
        ao6 ao6Var = new ao6(8, (byte) 0);
        ao6Var.b = new ox4(callable, p44Var, executor, ao6Var);
        return makeVoid().continueWithTask((ox4) ao6Var.b, executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(p44 p44Var, s42 s42Var) {
        return onSuccess(p44Var, IMMEDIATE_EXECUTOR, s42Var);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(p44 p44Var, s42 s42Var) {
        return onSuccessTask(p44Var, IMMEDIATE_EXECUTOR, s42Var);
    }

    public static Task<Void> delay(long j, ScheduledExecutorService scheduledExecutorService, s42 s42Var) {
        if (j <= 0) {
            return forResult(null);
        }
        o2g o2gVar = new o2g();
        scheduledExecutorService.schedule(new r98(25, o2gVar), j, TimeUnit.MILLISECONDS);
        return o2gVar.a;
    }

    public boolean waitForCompletion(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean zIsCompleted;
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait(timeUnit.toMillis(j));
                }
                zIsCompleted = isCompleted();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCompleted;
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, IMMEDIATE_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, s42 s42Var) {
        return call(callable, IMMEDIATE_EXECUTOR, s42Var);
    }

    private Task(boolean z) {
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(p44 p44Var) {
        return continueWith(p44Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(p44 p44Var) {
        return continueWithTask(p44Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(p44 p44Var, s42 s42Var) {
        return continueWith(p44Var, IMMEDIATE_EXECUTOR, s42Var);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(p44 p44Var, s42 s42Var) {
        return continueWithTask(p44Var, IMMEDIATE_EXECUTOR, s42Var);
    }
}
