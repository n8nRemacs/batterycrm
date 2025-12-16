package hu.akarnokd.rxjava3.basetypes;

import java.util.Objects;

/* compiled from: Solo.java */
/* renamed from: hu.akarnokd.rxjava3.basetypes.l1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41073l1<T> implements org.reactivestreams.c<T> {
    public abstract void a(org.reactivestreams.d<? super T> dVar);

    @Override // org.reactivestreams.c
    public final void d(org.reactivestreams.d<? super T> dVar) {
        Objects.requireNonNull(dVar, "s is null");
        try {
            a(dVar);
        } catch (NullPointerException e12) {
            throw e12;
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.a(th2);
            NullPointerException nullPointerException = new NullPointerException();
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
