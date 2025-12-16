package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.a.a;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class i<TResult> implements com.huawei.hmf.tasks.e<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public com.huawei.hmf.tasks.h f363192a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f363193b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f363194c = new Object();

    public i(Executor executor, com.huawei.hmf.tasks.h hVar) {
        this.f363192a = hVar;
        this.f363193b = executor;
    }

    @Override // com.huawei.hmf.tasks.e
    public final void a(s sVar) {
        if (sVar.f() || sVar.f363203c) {
            return;
        }
        ((a.ExecutorC10749a) this.f363193b).execute(new h(this, sVar));
    }

    @Override // com.huawei.hmf.tasks.e
    public final void cancel() {
        synchronized (this.f363194c) {
            this.f363192a = null;
        }
    }
}
