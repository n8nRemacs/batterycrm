package hu.akarnokd.rxjava3.debug;

import hu.akarnokd.rxjava3.debug.z;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.L;
import io.reactivex.rxjava3.internal.fuseable.ScalarSupplier;

/* compiled from: SingleOnAssemblyScalarSupplier.java */
/* loaded from: classes8.dex */
final class A<T> extends I<T> implements ScalarSupplier<T> {

    /* renamed from: b, reason: collision with root package name */
    public final I f397806b;

    /* renamed from: c, reason: collision with root package name */
    public final RxJavaAssemblyException f397807c = new RxJavaAssemblyException();

    public A(I i12) {
        this.f397806b = i12;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(L<? super T> l12) {
        this.f397806b.a(new z.a(l12, this.f397807c));
    }
}
