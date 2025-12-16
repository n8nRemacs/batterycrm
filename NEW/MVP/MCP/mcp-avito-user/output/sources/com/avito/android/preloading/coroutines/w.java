package com.avito.android.preloading.coroutines;

import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: PreloadingPromiseAsserts.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/preloading/coroutines/w;", "Lcom/avito/android/preloading/coroutines/p;", "<init>", "()V", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class w implements p {
    @Override // com.avito.android.preloading.coroutines.p
    public final void a(boolean z12, @Y61.l Y41.l<? super String, ? extends InterfaceC28464o> lVar, @Y61.k Y41.a<String> aVar) {
        if (z12) {
            return;
        }
        V2.f318762a.d("PreloadingPromise", aVar.invoke());
    }
}
