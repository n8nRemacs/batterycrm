package com.avito.android.clientEventBus.useCase;

import com.avito.android.clientEventBus.SubscribeToTopicException;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: SubscribeToEventUseCase.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "result", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final j<T, R> f118586b = new j<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            return AbstractC41768a.o(new SubscribeToTopicException(((TypedResult.Error) typedResult).getCause()));
        }
        if (typedResult instanceof TypedResult.Success) {
            return C41823n.f402260b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
