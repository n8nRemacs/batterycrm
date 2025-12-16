package com.avito.android.candy;

import io.reactivex.rxjava3.core.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: RemoteCarImageSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class q extends H implements Y41.l<Throwable, G0> {
    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        ((K) this.receiver).onError(th2);
        return G0.f406611a;
    }
}
