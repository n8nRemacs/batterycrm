package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.z;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;

/* compiled from: SingleOnAssemblySupplier.java */
/* loaded from: classes8.dex */
final class B<T> extends I<T> implements l41.s<T> {

    /* renamed from: b, reason: collision with root package name */
    public final I f397808b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397809c = new RxJavaAssemblyException();

    public B(I i12) {
        this.f397808b = i12;
    }

    @Override // l41.s
    public final T get() {
        try {
            return (T) ((l41.s) this.f397808b).get();
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            this.f397809c.a(th2);
            throw th2;
        }
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(L<? super T> l12) {
        this.f397808b.a(new z.a(l12, this.f397809c));
    }
}
