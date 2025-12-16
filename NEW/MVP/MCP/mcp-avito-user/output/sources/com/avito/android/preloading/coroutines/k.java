package com.avito.android.preloading.coroutines;

import com.avito.android.preloading.coroutines.AbstractC33302a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.H;

/* compiled from: CoroutinesPreloadingPromise.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class k extends H implements Y41.p<Object, Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(Object obj, Continuation<? super G0> continuation) {
        Y41.l lVar = (Y41.l) this.receiver;
        AbstractC33302a.C6710a c6710a = AbstractC33302a.f221798g;
        lVar.invoke(obj);
        return G0.f406611a;
    }
}
