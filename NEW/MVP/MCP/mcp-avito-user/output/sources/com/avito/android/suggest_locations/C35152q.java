package com.avito.android.suggest_locations;

import com.avito.android.geo_common.model.CoordsByAddressResult;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SuggestLocationsInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/geo_common/model/CoordsByAddressResult;", "it", "Lcom/avito/android/remote/model/TypedResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.suggest_locations.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35152q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C35152q<T, R> f292353b = new C35152q<>();

    @Override // l41.o
    public final Object apply(Object obj) throws Throwable {
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Error)) {
            if (typedResult instanceof TypedResult.Success) {
                return (CoordsByAddressResult) ((TypedResult.Success) typedResult).getResult();
            }
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        Throwable cause = error.getCause();
        if (cause == null) {
            throw new Throwable(error.getError().getF244063c());
        }
        throw cause;
    }
}
