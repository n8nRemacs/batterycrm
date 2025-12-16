package com.avito.android.preloading;

import io.reactivex.rxjava3.core.B;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PreloadingExt.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class f extends H implements Y41.l<Object, G0> {
    @Override // Y41.l
    public final G0 invoke(Object obj) {
        ((B) this.receiver).onNext(obj);
        return G0.f406611a;
    }
}
