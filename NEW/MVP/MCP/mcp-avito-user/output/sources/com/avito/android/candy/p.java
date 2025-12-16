package com.avito.android.candy;

import android.graphics.Bitmap;
import io.reactivex.rxjava3.core.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: RemoteCarImageSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class p extends H implements Y41.l<Bitmap, G0> {
    @Override // Y41.l
    public final G0 invoke(Bitmap bitmap) {
        ((K) this.receiver).onSuccess(bitmap);
        return G0.f406611a;
    }
}
