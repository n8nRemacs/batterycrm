package com.avito.android.util.rx3.arrow;

import Y61.k;
import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: Option.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_rx_util"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* compiled from: Option.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Larrow/core/Y0;", "O", "option", "Lio/reactivex/rxjava3/core/E;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f319016b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Y0 y02 = (Y0) obj;
            if (y02 instanceof X0) {
                return U.f403867b;
            }
            if (y02 instanceof C23703n1) {
                return z.c0(((C23703n1) y02).f56288b);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @k
    public static final <T, O extends Y0<? extends T>> z<T> a(@k z<O> zVar) {
        return (z<T>) zVar.u(a.f319016b);
    }
}
