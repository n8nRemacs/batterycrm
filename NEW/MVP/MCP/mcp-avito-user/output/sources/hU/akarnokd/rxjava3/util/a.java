package hu.akarnokd.rxjava3.util;

import io.reactivex.rxjava3.internal.util.m;
import org.reactivestreams.e;

/* compiled from: CompositeSubscription.java */
/* loaded from: classes8.dex */
public final class a implements e {

    /* renamed from: b, reason: collision with root package name */
    public m<e> f398285b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f398286c;

    public final boolean a(e eVar) {
        if (!this.f398286c) {
            synchronized (this) {
                try {
                    if (!this.f398286c) {
                        m<e> mVar = this.f398285b;
                        if (mVar == null) {
                            mVar = new m<>();
                            this.f398285b = mVar;
                        }
                        mVar.a(eVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        eVar.cancel();
        return false;
    }

    public final void b(e eVar) {
        m<e> mVar;
        if (this.f398286c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f398286c && (mVar = this.f398285b) != null) {
                    mVar.b(eVar);
                }
            } finally {
            }
        }
    }

    @Override // org.reactivestreams.e
    public final void cancel() {
        if (this.f398286c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f398286c) {
                    return;
                }
                m<e> mVar = this.f398285b;
                this.f398285b = null;
                this.f398286c = true;
                if (mVar != null) {
                    for (e eVar : mVar.f404839e) {
                        if (eVar != null) {
                            eVar.cancel();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.reactivestreams.e
    public final void request(long j12) {
    }
}
