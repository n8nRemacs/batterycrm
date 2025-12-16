package com.avito.android.util.rx3.arrow;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.flowable.Y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: Option.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u000f\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005¢\u0006\u0002\b\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Larrow/core/Y0;", "O", "option", "Lorg/reactivestreams/c;", "Lj41/e;", "apply", "(Larrow/core/Y0;)Lorg/reactivestreams/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c<T, R> implements o {
    static {
        new c();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            int i12 = AbstractC41777j.f401972b;
            return Y.f402580c;
        }
        if (y02 instanceof C23703n1) {
            return AbstractC41777j.j(((C23703n1) y02).f56288b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
