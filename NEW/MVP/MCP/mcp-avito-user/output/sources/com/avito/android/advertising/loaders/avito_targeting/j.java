package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.remote.model.TypedResult;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoTargetingBannerLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "it", "apply", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final j<T, R> f88042b = new j<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        TypedResult typedResult = (TypedResult) obj;
        if ((typedResult instanceof TypedResult.Success) || !(typedResult instanceof TypedResult.Error)) {
            return G0.f406611a;
        }
        TypedResult.Error error = (TypedResult.Error) typedResult;
        throw new AvitoNetworkHideCreativeException(error.getError().getF244063c(), error.getCause());
    }
}
