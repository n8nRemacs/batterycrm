package com.avito.android.suggest_locations;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import uF.d;

/* compiled from: SuggestLocationsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LuF/d$c;", "it", "LuF/d;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)LuF/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.suggest_locations.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35150o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C35150o<T, R> f292348b = new C35150o<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return (uF.d) ((TypedResult.Success) typedResult).getResult();
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        return error.getError() instanceof ApiError.NetworkIOError ? new d.b(null, 1, null) : new d.a(error.getError().getF244063c(), null, 2, null);
    }
}
