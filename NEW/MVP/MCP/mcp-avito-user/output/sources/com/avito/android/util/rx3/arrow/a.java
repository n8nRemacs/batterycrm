package com.avito.android.util.rx3.arrow;

import Y61.k;
import arrow.core.AbstractC23662a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: Either.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_rx_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: Either.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0014\b\u0002\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "A", "B", "Larrow/core/a;", "O", "option", "Lio/reactivex/rxjava3/core/E;", "apply", "(Larrow/core/a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.util.rx3.arrow.a$a, reason: collision with other inner class name */
    public static final class C9888a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final C9888a<T, R> f319014b = new C9888a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            AbstractC23662a abstractC23662a = (AbstractC23662a) obj;
            if (abstractC23662a instanceof AbstractC23662a.c) {
                return U.f403867b;
            }
            if (abstractC23662a instanceof AbstractC23662a.b) {
                return z.c0(((AbstractC23662a.b) abstractC23662a).f56268b);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: Either.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001\"\u0014\b\u0002\u0010\u0004*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"A", "", "B", "Larrow/core/a;", "O", "option", "Lio/reactivex/rxjava3/core/E;", "apply", "(Larrow/core/a;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f319015b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            AbstractC23662a abstractC23662a = (AbstractC23662a) obj;
            if (abstractC23662a instanceof AbstractC23662a.c) {
                return z.c0(((AbstractC23662a.c) abstractC23662a).f56269b);
            }
            if (abstractC23662a instanceof AbstractC23662a.b) {
                return U.f403867b;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @k
    public static final <A, B, O extends AbstractC23662a<? extends A, ? extends B>> z<A> a(@k z<O> zVar) {
        return (z<A>) zVar.u(C9888a.f319014b);
    }

    @k
    public static final <A, B, O extends AbstractC23662a<? extends A, ? extends B>> z<B> b(@k z<O> zVar) {
        return (z<B>) zVar.u(b.f319015b);
    }
}
