package com.avito.android.user_favorites;

import com.avito.android.remote.model.BeduinV2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: UserFavoritesPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class A extends C42801a implements Y41.p<BeduinV2, Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(BeduinV2 beduinV2, Continuation<? super G0> continuation) {
        ((J) this.receiver).a(beduinV2);
        return G0.f406611a;
    }
}
