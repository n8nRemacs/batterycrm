package com.avito.android.publish.slots.car_info_short.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarImage;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CarInfoShortItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/car_info_short/item/e;", "Lcom/avito/android/publish/slots/car_info_short/item/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        gVar.O0(aVar2.f243120c, aVar2.f243121d);
        gVar.n30(aVar2.f243123f, aVar2.f243124g);
        List<CarImage> list = aVar2.f243122e;
        gVar.G0(list != null ? C42745f0.E0(list, 3) : null);
    }
}
