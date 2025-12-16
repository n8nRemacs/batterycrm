package com.avito.android.util.rx3;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TypedSingle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_network-typed-result_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g1 {
    @Y61.k
    public static final C42026y a(@Y61.k io.reactivex.rxjava3.core.I i12) {
        return i12.n(f1.f319023b);
    }

    @Y61.k
    public static final <T> io.reactivex.rxjava3.core.I<T> b(@Y61.k TypedResult<T> typedResult) {
        if (typedResult instanceof TypedResult.Success) {
            return io.reactivex.rxjava3.core.I.q(((TypedResult.Success) typedResult).getResult());
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        return io.reactivex.rxjava3.core.I.l(new ApiException(error.getError(), error.getCause()));
    }
}
