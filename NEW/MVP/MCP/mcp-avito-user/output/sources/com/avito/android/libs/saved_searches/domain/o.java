package com.avito.android.libs.saved_searches.domain;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSubscriptionInteractorRx.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/saved_searches/model/SavedSearchData;", "result", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class o<T, R> implements l41.o {
    static {
        new o();
    }

    @Override // l41.o
    public final Object apply(Object obj) throws InterruptedException {
        TypedResult typedResult = (TypedResult) obj;
        boolean z12 = typedResult instanceof TypedResult.Error;
        if (z12) {
            Thread.sleep(800L);
        }
        if (typedResult instanceof TypedResult.Success) {
            return new P2.b(((TypedResult.Success) typedResult).getResult());
        }
        if (z12) {
            return new P2.a(((TypedResult.Error) typedResult).getError());
        }
        throw new NoWhenBranchMatchedException();
    }
}
