package com.huawei.hmf.tasks.a;

import com.huawei.hmf.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class s<TResult> extends Task<TResult> {

    /* renamed from: b, reason: collision with root package name */
    public boolean f363202b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f363203c;

    /* renamed from: d, reason: collision with root package name */
    public TResult f363204d;

    /* renamed from: e, reason: collision with root package name */
    public Exception f363205e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f363201a = new Object();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f363206f = new ArrayList();

    @Override // com.huawei.hmf.tasks.Task
    public final s a(com.huawei.hmf.tasks.h hVar) {
        g(new i(com.huawei.hmf.tasks.m.f363210c.f363212b, hVar));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final s b(com.huawei.hmf.tasks.i iVar) {
        g(new l(com.huawei.hmf.tasks.m.f363210c.f363212b, iVar));
        return this;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final Exception c() {
        Exception exc;
        synchronized (this.f363201a) {
            exc = this.f363205e;
        }
        return exc;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final TResult d() {
        TResult tresult;
        synchronized (this.f363201a) {
            try {
                if (this.f363205e != null) {
                    throw new RuntimeException(this.f363205e);
                }
                tresult = this.f363204d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return tresult;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean e() {
        boolean z12;
        synchronized (this.f363201a) {
            z12 = this.f363202b;
        }
        return z12;
    }

    @Override // com.huawei.hmf.tasks.Task
    public final boolean f() {
        boolean z12;
        synchronized (this.f363201a) {
            try {
                z12 = this.f363202b && !this.f363203c && this.f363205e == null;
            } finally {
            }
        }
        return z12;
    }

    public final void g(com.huawei.hmf.tasks.e eVar) {
        boolean zE2;
        synchronized (this.f363201a) {
            try {
                zE2 = e();
                if (!zE2) {
                    this.f363206f.add(eVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zE2) {
            eVar.a(this);
        }
    }

    public final void h() {
        synchronized (this.f363201a) {
            try {
                Iterator it = this.f363206f.iterator();
                while (it.hasNext()) {
                    try {
                        try {
                            ((com.huawei.hmf.tasks.e) it.next()).a(this);
                        } catch (RuntimeException e12) {
                            throw e12;
                        }
                    } catch (Exception e13) {
                        throw new RuntimeException(e13);
                    }
                }
                this.f363206f = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
