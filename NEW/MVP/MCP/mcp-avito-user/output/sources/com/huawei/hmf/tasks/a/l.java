package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.a.a;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class l<TResult> implements com.huawei.hmf.tasks.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public com.huawei.hmf.tasks.i<TResult> f363198a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f363199b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f363200c = new Object();

    public l(Executor executor, com.huawei.hmf.tasks.i<TResult> iVar) {
        this.f363198a = iVar;
        this.f363199b = executor;
    }

    @Override // com.huawei.hmf.tasks.e
    public final void a(s sVar) {
        if (!sVar.f() || sVar.f363203c) {
            return;
        }
        ((a.ExecutorC10749a) this.f363199b).execute(new k(this, sVar));
    }

    @Override // com.huawei.hmf.tasks.e
    public final void cancel() {
        synchronized (this.f363200c) {
            this.f363198a = null;
        }
    }
}
