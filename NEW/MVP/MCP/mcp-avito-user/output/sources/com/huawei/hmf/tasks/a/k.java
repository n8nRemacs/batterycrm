package com.huawei.hmf.tasks.a;

/* loaded from: classes7.dex */
final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f363196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f363197c;

    public k(l lVar, s sVar) {
        this.f363197c = lVar;
        this.f363196b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f363197c.f363200c) {
            try {
                com.huawei.hmf.tasks.i<TResult> iVar = this.f363197c.f363198a;
                if (iVar != 0) {
                    iVar.onSuccess(this.f363196b.d());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
