package com.avito.android.publish.slots.item_info.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarImage;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoField;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemInfoItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/item_info/item/l;", "Lcom/avito/android/publish/slots/item_info/item/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final n f244395b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<d> f244396c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Confetti> f244397d = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public l(@Y61.k n nVar) {
        this.f244395b = nVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((q) eVar, (d) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        q qVar = (q) eVar;
        d dVar = (d) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof g) {
                obj = obj2;
            }
        }
        g gVar = (g) (obj instanceof g ? obj : null);
        if (gVar == null) {
            k(qVar, dVar);
            return;
        }
        Boolean bool = gVar.f244388a;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            List<ItemInfoField> list2 = dVar.f244377e;
            if (list2 != null) {
                qVar.TL(list2, dVar.f244378f, zBooleanValue, new i(dVar, this));
            }
        }
    }

    public final void k(@Y61.k q qVar, @Y61.k d dVar) {
        Image image;
        n nVar = this.f244395b;
        nVar.getClass();
        boolean z12 = nVar.f244399a.getBoolean("key_item_info_slot_confetti_animation_was_shown ".concat(dVar.f244381i), false);
        qVar.b(dVar.f244375c);
        qVar.n(dVar.f244383k);
        CarImage carImage = dVar.f244376d;
        if (carImage != null && (image = carImage.getImage()) != null) {
            qVar.l(image);
        }
        qVar.p40(dVar.f244382j, z12, new j(dVar, this));
        List<ItemInfoField> list = dVar.f244377e;
        if (list != null) {
            qVar.TL(list, dVar.f244378f, dVar.f244380h, new k(dVar, this));
        }
    }

    @Override // com.avito.android.publish.slots.item_info.item.h
    @Y61.k
    public final C41981q0 t2() {
        com.jakewharton.rxrelay3.c<Confetti> cVar = this.f244397d;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.publish.slots.item_info.item.h
    @Y61.k
    public final C41981q0 z2() {
        com.jakewharton.rxrelay3.c<d> cVar = this.f244396c;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }
}
