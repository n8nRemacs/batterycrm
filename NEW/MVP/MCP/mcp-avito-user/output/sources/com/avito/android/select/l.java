package com.avito.android.select;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectDialogPaginationInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LZp0/e;", "response", "apply", "(Lcom/avito/android/remote/model/TypedResult;)LZp0/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final l<T, R> f265553b = new l<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) throws ApiException {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            throw new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, 0 == true ? 1 : 0);
        }
        if (!(typedResult instanceof TypedResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Success success = (TypedResult.Success) typedResult;
        return Zp0.e.a((Zp0.e) success.getResult(), ((Zp0.e) success.getResult()).f20507a);
    }
}
