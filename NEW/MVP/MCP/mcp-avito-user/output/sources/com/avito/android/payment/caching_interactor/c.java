package com.avito.android.payment.caching_interactor;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: SealedResultCachingInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lcom/avito/android/remote/model/TypedResult;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final c<T, R> f213998b = new c<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return new P2.b(((TypedResult.Success) typedResult).getResult());
        }
        if (typedResult instanceof TypedResult.Error) {
            return new P2.a(((TypedResult.Error) typedResult).getError());
        }
        throw new NoWhenBranchMatchedException();
    }
}
