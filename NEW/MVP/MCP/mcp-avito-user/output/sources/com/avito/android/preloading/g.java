package com.avito.android.preloading;

import io.reactivex.rxjava3.core.B;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PreloadingExt.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class g extends H implements Y41.l<Throwable, G0> {
    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        ((B) this.receiver).onError(th2);
        return G0.f406611a;
    }
}
