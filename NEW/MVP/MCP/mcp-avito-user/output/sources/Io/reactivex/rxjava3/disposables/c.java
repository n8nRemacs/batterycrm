package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.m;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: CompositeDisposable.java */
/* loaded from: classes8.dex */
public final class c implements d, e {

    /* renamed from: b, reason: collision with root package name */
    public m<d> f401977b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f401978c;

    public c() {
    }

    public static void f(@j41.f m mVar) {
        if (mVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : mVar.f404839e) {
            if (obj instanceof d) {
                try {
                    ((d) obj).dispose();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.a(th2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw io.reactivex.rxjava3.internal.util.h.f((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean a(@j41.e d dVar) {
        if (!c(dVar)) {
            return false;
        }
        dVar.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean b(@j41.e d dVar) {
        Objects.requireNonNull(dVar, "disposable is null");
        if (!this.f401978c) {
            synchronized (this) {
                try {
                    if (!this.f401978c) {
                        m<d> mVar = this.f401977b;
                        if (mVar == null) {
                            mVar = new m<>();
                            this.f401977b = mVar;
                        }
                        mVar.a(dVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        dVar.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean c(@j41.e d dVar) {
        Objects.requireNonNull(dVar, "disposable is null");
        if (this.f401978c) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f401978c) {
                    return false;
                }
                m<d> mVar = this.f401977b;
                if (mVar != null && mVar.b(dVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void d(@j41.e d... dVarArr) {
        int i12 = 0;
        if (!this.f401978c) {
            synchronized (this) {
                try {
                    if (!this.f401978c) {
                        m<d> mVar = this.f401977b;
                        if (mVar == null) {
                            mVar = new m<>(dVarArr.length + 1, 0);
                            this.f401977b = mVar;
                        }
                        int length = dVarArr.length;
                        while (i12 < length) {
                            d dVar = dVarArr[i12];
                            Objects.requireNonNull(dVar, "A Disposable in the disposables array is null");
                            mVar.a(dVar);
                            i12++;
                        }
                        return;
                    }
                } finally {
                }
            }
        }
        int length2 = dVarArr.length;
        while (i12 < length2) {
            dVarArr[i12].dispose();
            i12++;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (this.f401978c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f401978c) {
                    return;
                }
                this.f401978c = true;
                m<d> mVar = this.f401977b;
                this.f401977b = null;
                f(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        if (this.f401978c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f401978c) {
                    return;
                }
                m<d> mVar = this.f401977b;
                this.f401977b = null;
                f(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int g() {
        if (this.f401978c) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f401978c) {
                    return 0;
                }
                m<d> mVar = this.f401977b;
                return mVar != null ? mVar.f404837c : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return this.f401978c;
    }

    public c(@j41.e d... dVarArr) {
        this.f401977b = new m<>(dVarArr.length + 1, 0);
        for (d dVar : dVarArr) {
            Objects.requireNonNull(dVar, "A Disposable in the disposables array is null");
            this.f401977b.a(dVar);
        }
    }
}
