package com.avito.android.util.rx3.arrow;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: Option.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "O", "option", "Lio/reactivex/rxjava3/core/E;", "Lkotlin/G0;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e<T, R> implements o {
    static {
        new e();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            return z.c0(G0.f406611a);
        }
        if (y02 instanceof C23703n1) {
            return U.f403867b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
