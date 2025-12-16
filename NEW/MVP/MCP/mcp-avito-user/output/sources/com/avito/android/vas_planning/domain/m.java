package com.avito.android.vas_planning.domain;

import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VasPlanningInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/DeepLinkResponse;", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/deep_linking/links/DeepLink;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class m<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final m<T, R> f322341b = new m<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            return new P2.b(((DeepLinkResponse) ((TypedResult.Success) typedResult).getResult()).getDeepLink());
        }
        if (typedResult instanceof TypedResult.Error) {
            return new P2.a(((TypedResult.Error) typedResult).getError());
        }
        throw new NoWhenBranchMatchedException();
    }
}
