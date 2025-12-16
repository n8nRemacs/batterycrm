package com.avito.android.remote.model;

import Y41.l;
import Y61.k;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TypedResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u0007*\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\u0007*\u00020\n¢\u0006\u0004\b\b\u0010\u000b\u001a'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\f\"\b\b\u0000\u0010\u0000*\u00020\u0007*\u00020\n¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u000f\"\b\b\u0000\u0010\u0000*\u00020\u0007*\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"T", "R", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/Function1;", "mapper", "mapResult", "(Lcom/avito/android/remote/model/TypedResult;LY41/l;)Lcom/avito/android/remote/model/TypedResult;", "", "toTyped", "(Ljava/lang/Object;)Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/error/ApiError;", "(Lcom/avito/android/remote/error/ApiError;)Lcom/avito/android/remote/model/TypedResult;", "Lio/reactivex/rxjava3/core/I;", "toTypedSingle", "(Lcom/avito/android/remote/error/ApiError;)Lio/reactivex/rxjava3/core/I;", "Lio/reactivex/rxjava3/core/z;", "toTypedObservable", "(Lcom/avito/android/remote/error/ApiError;)Lio/reactivex/rxjava3/core/z;", "_common_network-typed-result_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TypedResultKt {
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <T, R> TypedResult<R> mapResult(@k TypedResult<T> typedResult, @k l<? super T, ? extends R> lVar) {
        if (typedResult instanceof TypedResult.Success) {
            return new TypedResult.Success(lVar.invoke((Object) ((TypedResult.Success) typedResult).getResult()));
        }
        if (typedResult instanceof TypedResult.Error) {
            return typedResult;
        }
        throw new NoWhenBranchMatchedException();
    }

    @k
    public static final <T> TypedResult<T> toTyped(@k T t12) {
        return new TypedResult.Success(t12);
    }

    @k
    public static final <T> z<TypedResult<T>> toTypedObservable(@k ApiError apiError) {
        return z.c0(new TypedResult.Error(apiError, null, 2, null));
    }

    @k
    public static final <T> I<TypedResult<T>> toTypedSingle(@k ApiError apiError) {
        return I.q(new TypedResult.Error(apiError, null, 2, null));
    }

    @k
    public static final <T> TypedResult<T> toTyped(@k ApiError apiError) {
        return new TypedResult.Error(apiError, null, 2, null);
    }
}
