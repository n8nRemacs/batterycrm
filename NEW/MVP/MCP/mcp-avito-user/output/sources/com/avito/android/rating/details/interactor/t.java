package com.avito.android.rating.details.interactor;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UserReviewsInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "response", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/remote/model/TypedResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final t<T, R> f247166b = new t<>();

    @Override // l41.o
    public final Object apply(Object obj) throws ApiException {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return (TypedResult.Success) typedResult;
        }
        if (typedResult instanceof TypedResult.Error) {
            throw new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
