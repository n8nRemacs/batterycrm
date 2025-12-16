package com.avito.android.serp;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;

/* compiled from: SerpSnippetInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "result", "Lio/reactivex/rxjava3/core/E;", "", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n<T, R> implements l41.o {
    static {
        new n();
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            V2.f318762a.c("SerpSnippetInteractor", "Send close recent query search success.", null);
        } else if (typedResult instanceof TypedResult.Error) {
            V2 v22 = V2.f318762a;
            TypedResult.Error error = (TypedResult.Error) typedResult;
            Throwable cause = error.getCause();
            if (cause == null) {
                cause = new Exception(error.getError().getF244063c());
            }
            v22.a("SerpSnippetInteractor", "Send close recent query search error.", cause);
        }
        return U.f403867b;
    }
}
