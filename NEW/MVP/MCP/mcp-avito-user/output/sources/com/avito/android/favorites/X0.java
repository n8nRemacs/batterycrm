package com.avito.android.favorites;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: FavoritesListPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class X0 extends C42801a implements Y41.p<String, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
    @Y61.l
    public final Object a(@Y61.k String str) {
        C30684r0 c30684r0 = (C30684r0) this.receiver;
        List list = c30684r0.f157456a0;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        c30684r0.f157442M.c(c30684r0.f157443N.a(list, str, null).j(O0.f156310b));
        return kotlin.G0.f406611a;
    }

    @Override // Y41.p
    public final /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super kotlin.G0> continuation) {
        return a(str);
    }
}
