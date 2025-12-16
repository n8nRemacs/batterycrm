package com.avito.android.location_picker.providers;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import yW.AbstractC50189b;

/* compiled from: AddressGeoCoder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LuF/g;", "response", "LyW/b;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)LyW/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final o<T, R> f182463b = new o<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return new AbstractC50189b.C12904b((uF.g) ((TypedResult.Success) typedResult).getResult());
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        return error.getError() instanceof ApiError.NetworkIOError ? new AbstractC50189b.a() : new AbstractC50189b.c(error.getError().getF244063c());
    }
}
