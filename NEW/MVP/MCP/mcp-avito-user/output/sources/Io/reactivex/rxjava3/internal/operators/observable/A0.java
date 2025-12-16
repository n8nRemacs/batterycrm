package io.reactivex.rxjava3.internal.operators.observable;

import com.avito.android.util.C35946t2;
import s41.C47998a;

/* compiled from: ObservableLift.java */
/* loaded from: classes8.dex */
public final class A0<R, T> extends AbstractC41932a<T, R> {

    /* renamed from: c, reason: collision with root package name */
    public final C35946t2 f403498c;

    public A0(C c12, C35946t2 c35946t2) {
        super(c12);
        this.f403498c = c35946t2;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(io.reactivex.rxjava3.core.G<? super R> g12) {
        C35946t2 c35946t2 = this.f403498c;
        try {
            io.reactivex.rxjava3.core.G<? super T> gA2 = c35946t2.a(g12);
            StringBuilder sb2 = new StringBuilder("Operator ");
            sb2.append(c35946t2);
            sb2.append(" returned a null Observer");
            this.f403951b.c(gA2);
        } catch (NullPointerException e12) {
            throw e12;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            C47998a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
