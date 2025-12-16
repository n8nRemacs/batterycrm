package m41;

import io.reactivex.rxjava3.disposables.e;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.schedulers.n;
import io.reactivex.rxjava3.internal.util.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: ListCompositeDisposable.java */
/* renamed from: m41.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43881c implements io.reactivex.rxjava3.disposables.d, e {

    /* renamed from: b, reason: collision with root package name */
    public LinkedList f414306b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f414307c;

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean a(io.reactivex.rxjava3.disposables.d dVar) {
        if (!c(dVar)) {
            return false;
        }
        ((n) dVar).dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.e
    public final boolean b(io.reactivex.rxjava3.disposables.d dVar) {
        if (!this.f414307c) {
            synchronized (this) {
                try {
                    if (!this.f414307c) {
                        LinkedList linkedList = this.f414306b;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f414306b = linkedList;
                        }
                        linkedList.add(dVar);
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
    public final boolean c(io.reactivex.rxjava3.disposables.d dVar) {
        if (this.f414307c) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f414307c) {
                    return false;
                }
                LinkedList linkedList = this.f414306b;
                if (linkedList != null && linkedList.remove(dVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (this.f414307c) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f414307c) {
                    return;
                }
                this.f414307c = true;
                LinkedList linkedList = this.f414306b;
                ArrayList arrayList = null;
                this.f414306b = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((io.reactivex.rxjava3.disposables.d) it.next()).dispose();
                    } catch (Throwable th2) {
                        io.reactivex.rxjava3.exceptions.a.a(th2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th2);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw h.f((Throwable) arrayList.get(0));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public final boolean i() {
        return this.f414307c;
    }
}
