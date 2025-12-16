package com.avito.android.validation;

import com.avito.android.blueprints.publish.delivery_toggles.DeliveryToggle;
import com.avito.android.blueprints.publish.delivery_toggles.PublishDeliveryTogglesItem;
import kotlin.Metadata;

/* compiled from: ParametersListPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/blueprints/publish/delivery_toggles/PublishDeliveryTogglesItem;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/blueprints/publish/delivery_toggles/PublishDeliveryTogglesItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class S0 extends kotlin.jvm.internal.N implements Y41.l<PublishDeliveryTogglesItem, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y0 f319291l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(Y0 y02) {
        super(1);
        this.f319291l = y02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(PublishDeliveryTogglesItem publishDeliveryTogglesItem) {
        DeliveryToggle deliveryToggle = publishDeliveryTogglesItem.f106175d;
        if (deliveryToggle != null) {
            this.f319291l.f319322a.c(deliveryToggle.f106163b, deliveryToggle.f106167f);
        }
        return kotlin.G0.f406611a;
    }
}
