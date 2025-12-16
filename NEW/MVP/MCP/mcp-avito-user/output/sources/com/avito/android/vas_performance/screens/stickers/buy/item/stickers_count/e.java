package com.avito.android.vas_performance.screens.stickers.buy.item.stickers_count;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StickersCountItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers_count/e;", "Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers_count/d;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.setTitle(aVar2.f320682c);
        gVar.L(aVar2.f320683d);
        gVar.x(com.avito.android.image_loader.b.b(aVar2.f320684e));
        Image image = aVar2.f320685f;
        gVar.x1(image != null ? com.avito.android.image_loader.b.b(image) : null);
    }
}
