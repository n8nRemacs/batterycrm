package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.operators.single.O;
import io.reactivex.rxjava3.internal.operators.single.f0;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: SingleZipIterable.java */
/* loaded from: classes8.dex */
public final class g0<T, R> extends io.reactivex.rxjava3.core.I<R> {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable<? extends io.reactivex.rxjava3.core.O<? extends T>> f404597b;

    /* renamed from: c, reason: collision with root package name */
    public final l41.o<? super Object[], ? extends R> f404598c;

    /* compiled from: SingleZipIterable.java */
    public final class a implements l41.o<T, R> {
        public a() {
        }

        @Override // l41.o
        public final R apply(T t12) {
            R rApply = g0.this.f404598c.apply(new Object[]{t12});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public g0(Iterable<? extends io.reactivex.rxjava3.core.O<? extends T>> iterable, l41.o<? super Object[], ? extends R> oVar) {
        this.f404597b = iterable;
        this.f404598c = oVar;
    }

    @Override // io.reactivex.rxjava3.core.I
    public final void y(io.reactivex.rxjava3.core.L<? super R> l12) {
        io.reactivex.rxjava3.core.O[] oArr = new io.reactivex.rxjava3.core.O[8];
        try {
            int i12 = 0;
            for (io.reactivex.rxjava3.core.O<? extends T> o12 : this.f404597b) {
                if (o12 == null) {
                    EmptyDisposable.e(new NullPointerException("One of the sources is null"), l12);
                    return;
                }
                if (i12 == oArr.length) {
                    oArr = (io.reactivex.rxjava3.core.O[]) Arrays.copyOf(oArr, (i12 >> 2) + i12);
                }
                int i13 = i12 + 1;
                oArr[i12] = o12;
                i12 = i13;
            }
            if (i12 == 0) {
                EmptyDisposable.e(new NoSuchElementException(), l12);
                return;
            }
            if (i12 == 1) {
                oArr[0].a(new O.a(l12, new a()));
                return;
            }
            f0.b bVar = new f0.b(l12, i12, this.f404598c);
            l12.b(bVar);
            for (int i14 = 0; i14 < i12 && !bVar.getF318621e(); i14++) {
                oArr[i14].a(bVar.f404589d[i14]);
            }
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            EmptyDisposable.e(th2, l12);
        }
    }
}
