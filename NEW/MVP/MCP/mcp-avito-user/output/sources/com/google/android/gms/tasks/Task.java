package com.google.android.gms.tasks;

import com.google.android.gms.internal.appset.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
public abstract class Task<TResult> {
    @j.N
    public void a(@j.N InterfaceC37021d interfaceC37021d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @j.N
    public void b(@j.N Executor executor, @j.N InterfaceC37021d interfaceC37021d) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @j.N
    public Task<TResult> c(@j.N InterfaceC37022e<TResult> interfaceC37022e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @j.N
    public void d(@j.N Executor executor, @j.N InterfaceC37022e interfaceC37022e) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @j.N
    public abstract Task<TResult> e(@j.N InterfaceC37023f interfaceC37023f);

    @j.N
    public abstract Task<TResult> f(@j.N Executor executor, @j.N InterfaceC37023f interfaceC37023f);

    @j.N
    public abstract Task<TResult> g(@j.N InterfaceC37024g<? super TResult> interfaceC37024g);

    @j.N
    public abstract Task<TResult> h(@j.N Executor executor, @j.N InterfaceC37024g<? super TResult> interfaceC37024g);

    @j.N
    public <TContinuationResult> Task<TContinuationResult> i(@j.N Executor executor, @j.N InterfaceC37020c<TResult, TContinuationResult> interfaceC37020c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @j.N
    public void j(@j.N InterfaceC37020c interfaceC37020c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @j.N
    public Task k(@j.N zzq zzqVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @j.N
    public <TContinuationResult> Task<TContinuationResult> l(@j.N Executor executor, @j.N InterfaceC37020c<TResult, Task<TContinuationResult>> interfaceC37020c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @j.P
    public abstract Exception m();

    public abstract TResult n();

    public abstract Object o();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();

    @j.N
    public <TContinuationResult> Task<TContinuationResult> s(@j.N InterfaceC37027j<TResult, TContinuationResult> interfaceC37027j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @j.N
    public <TContinuationResult> Task<TContinuationResult> t(@j.N Executor executor, @j.N InterfaceC37027j<TResult, TContinuationResult> interfaceC37027j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
