package ru.avito.messenger;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lf91/a;", "response", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class Q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final Q<T, R> f430696b = new Q<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return io.reactivex.rxjava3.core.I.q(kotlin.G0.f406611a);
        }
        if (typedResult instanceof TypedResult.Error) {
            return io.reactivex.rxjava3.core.I.l(new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
