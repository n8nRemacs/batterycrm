package com.avito.android.blueprints.publish.delivery_toggles;

import Y41.p;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDeliveryTogglesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/blueprints/publish/delivery_toggles/DeliveryToggleType;", "type", "", "newValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/blueprints/publish/delivery_toggles/DeliveryToggleType;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements p<DeliveryToggleType, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublishDeliveryTogglesItem f106187l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f106188m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PublishDeliveryTogglesItem publishDeliveryTogglesItem, g gVar) {
        super(2);
        this.f106187l = publishDeliveryTogglesItem;
        this.f106188m = gVar;
    }

    @Override // Y41.p
    public final G0 invoke(DeliveryToggleType deliveryToggleType, Boolean bool) {
        DeliveryToggle deliveryToggle;
        Object next;
        DeliveryToggleType deliveryToggleType2 = deliveryToggleType;
        boolean zBooleanValue = bool.booleanValue();
        PublishDeliveryTogglesItem publishDeliveryTogglesItem = this.f106187l;
        Iterator<T> it = publishDeliveryTogglesItem.f106174c.iterator();
        while (true) {
            deliveryToggle = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DeliveryToggle) next).f106164c == deliveryToggleType2) {
                break;
            }
        }
        DeliveryToggle deliveryToggle2 = (DeliveryToggle) next;
        if (deliveryToggle2 != null) {
            deliveryToggle = new DeliveryToggle(deliveryToggle2.f106163b, deliveryToggle2.f106164c, deliveryToggle2.f106165d, deliveryToggle2.f106166e, zBooleanValue);
        }
        this.f106188m.f106189b.accept(new PublishDeliveryTogglesItem(publishDeliveryTogglesItem.f106173b, publishDeliveryTogglesItem.f106174c, deliveryToggle));
        return G0.f406611a;
    }
}
