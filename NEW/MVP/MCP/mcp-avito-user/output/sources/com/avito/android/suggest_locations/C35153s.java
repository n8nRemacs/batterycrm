package com.avito.android.suggest_locations;

import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.suggest_locations.W;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SuggestLocationsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LtF/e$c;", "response", "Lcom/avito/android/suggest_locations/W;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/suggest_locations/W;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.suggest_locations.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35153s<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35154t f292356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f292357c;

    public C35153s(C35154t c35154t, String str) {
        this.f292356b = c35154t;
        this.f292357c = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return this.f292356b.f292380c.b((tF.e) ((TypedResult.Success) typedResult).getResult(), this.f292357c);
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        return error.getError() instanceof ApiError.NetworkIOError ? new W.b(error.getError()) : new W.a(error.getError());
    }
}
