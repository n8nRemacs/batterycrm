package com.jakewharton.rxbinding4;

import Y61.k;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: InitialValueObservable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/jakewharton/rxbinding4/a;", "T", "Lio/reactivex/rxjava3/core/z;", "<init>", "()V", "a", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes7.dex */
public abstract class a<T> extends z<T> {

    /* compiled from: InitialValueObservable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/a$a;", "Lio/reactivex/rxjava3/core/z;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
    /* renamed from: com.jakewharton.rxbinding4.a$a, reason: collision with other inner class name */
    public final class C10769a extends z<T> {
        public C10769a() {
        }

        @Override // io.reactivex.rxjava3.core.z
        public final void w0(@k G<? super T> g12) {
            a.this.O0(g12);
        }
    }

    public abstract T M0();

    @k
    public final z<T> N0() {
        return new C10769a();
    }

    public abstract void O0(@k G<? super T> g12);

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@k G<? super T> g12) {
        O0(g12);
        g12.onNext(M0());
    }
}
