package com.avito.android.publish.screen.step.params.domain;

import android.os.Bundle;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.delivery_abuse.price_reduction.deeplink.PriceReductionLink;
import com.avito.android.details.b;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.publish.details.V0;
import com.avito.android.publish.details.seller_protection.SellerProtectionDialogResult;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/screen/step/params/domain/a;", "Lcom/avito/android/publish/details/V0;", "Lcom/avito/android/publish/details/b;", "Lcom/avito/android/details/b$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.screen.step.params.domain.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC34074a extends V0, InterfaceC33678b, b.InterfaceC4110b {

    /* compiled from: PublishDetailsInteractorAsync.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.screen.step.params.domain.a$a, reason: collision with other inner class name */
    public static final class C7221a {
    }

    void D(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar);

    void D5(@Y61.k SellerProtectionDialogResult sellerProtectionDialogResult);

    void J7(@Y61.k PriceReductionLink.b bVar);

    @Y61.k
    Bundle P();

    @Y61.k
    InterfaceC43160i<PublishDetailsInternalAction> Q0();

    void Q7();

    void Ta(boolean z12);

    void b(@Y61.l Bundle bundle);

    void d(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l CategoryPublishStep.Params.Confirmation confirmation, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list, @Y61.l CategoryPublishStep.Params.ParamsToFill paramsToFill);

    void d6();

    void e0();

    void f0();

    void l0();

    void l2(@Y61.k SelectParameter.Value value);

    @Y61.k
    kotlinx.coroutines.flow.internal.m o1();

    void p7(@Y61.k Y41.l<? super InterfaceC33764k0.a, InterfaceC33764k0.a> lVar);

    void qb();

    void r9(@Y61.k SlotType slotType);

    void vb(@Y61.l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction, @Y61.l DeepLink deepLink, @Y61.l List<? extends BeduinAction> list);
}
