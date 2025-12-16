package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.C36729v;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* renamed from: com.google.android.gms.tasks.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37030m {
    public static <TResult> TResult a(@j.N Task<TResult> task) throws InterruptedException {
        C36729v.i("Must not be called on the main application thread");
        C36729v.h();
        C36729v.k(task, "Task must not be null");
        if (task.q()) {
            return (TResult) h(task);
        }
        r rVar = new r(null);
        Executor executor = C37029l.f355674b;
        task.h(executor, rVar);
        task.f(executor, rVar);
        task.b(executor, rVar);
        rVar.f355676b.await();
        return (TResult) h(task);
    }

    public static <TResult> TResult b(@j.N Task<TResult> task, long j12, @j.N TimeUnit timeUnit) throws TimeoutException {
        C36729v.i("Must not be called on the main application thread");
        C36729v.h();
        C36729v.k(task, "Task must not be null");
        C36729v.k(timeUnit, "TimeUnit must not be null");
        if (task.q()) {
            return (TResult) h(task);
        }
        r rVar = new r(null);
        Executor executor = C37029l.f355674b;
        task.h(executor, rVar);
        task.f(executor, rVar);
        task.b(executor, rVar);
        if (rVar.f355676b.await(j12, timeUnit)) {
            return (TResult) h(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @j.N
    @Deprecated
    public static Task c(@j.N Callable callable, @j.N Executor executor) {
        C36729v.k(executor, "Executor must not be null");
        P p12 = new P();
        executor.execute(new T(p12, callable));
        return p12;
    }

    @j.N
    public static <TResult> Task<TResult> d() {
        P p12 = new P();
        p12.w();
        return p12;
    }

    @j.N
    public static <TResult> Task<TResult> e(@j.N Exception exc) {
        P p12 = new P();
        p12.u(exc);
        return p12;
    }

    @j.N
    public static <TResult> Task<TResult> f(TResult tresult) {
        P p12 = new P();
        p12.v(tresult);
        return p12;
    }

    @j.N
    public static Task g(@j.P List list) {
        if (list == null || list.isEmpty()) {
            return f(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        P p12 = new P();
        C37036t c37036t = new C37036t(list.size(), p12);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            Executor executor = C37029l.f355674b;
            task.h(executor, c37036t);
            task.f(executor, c37036t);
            task.b(executor, c37036t);
        }
        return p12;
    }

    public static Object h(@j.N Task task) throws ExecutionException {
        if (task.r()) {
            return task.n();
        }
        if (task.p()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.m());
    }
}
