package com.huawei.hmf.tasks;

import com.huawei.hmf.tasks.a.s;

/* loaded from: classes7.dex */
public class l<TResult> {

    /* renamed from: a, reason: collision with root package name */
    public final s<TResult> f363208a = new s<>();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s<TResult> sVar = l.this.f363208a;
            synchronized (sVar.f363201a) {
                try {
                    if (!sVar.f363202b) {
                        sVar.f363202b = true;
                        sVar.f363203c = true;
                        sVar.f363201a.notifyAll();
                        sVar.h();
                    }
                } finally {
                }
            }
        }
    }

    public l() {
    }

    public final void a(Exception exc) {
        s<TResult> sVar = this.f363208a;
        synchronized (sVar.f363201a) {
            try {
                if (!sVar.f363202b) {
                    sVar.f363202b = true;
                    sVar.f363205e = exc;
                    sVar.f363201a.notifyAll();
                    sVar.h();
                }
            } finally {
            }
        }
    }

    public final void b(TResult tresult) {
        s<TResult> sVar = this.f363208a;
        synchronized (sVar.f363201a) {
            try {
                if (!sVar.f363202b) {
                    sVar.f363202b = true;
                    sVar.f363204d = tresult;
                    sVar.f363201a.notifyAll();
                    sVar.h();
                }
            } finally {
            }
        }
    }

    public l(b bVar) {
        bVar.a(new a());
    }
}
