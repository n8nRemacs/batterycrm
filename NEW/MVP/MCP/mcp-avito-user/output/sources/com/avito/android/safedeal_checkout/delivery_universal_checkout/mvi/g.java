package com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.entity.DeliveryUniversalCheckoutInternalAction;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DeliveryUniversalCheckoutBootstrap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u00002\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u00002\u001c\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\u008a@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "topComponents", "mainComponents", "bottomComponents", "Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ContentChanged;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/safedeal_checkout/delivery_universal_checkout/mvi/entity/DeliveryUniversalCheckoutInternalAction$ContentChanged;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal_checkout.delivery_universal_checkout.mvi.DeliveryUniversalCheckoutBootstrap$formContentChangeFlow$1", f = "DeliveryUniversalCheckoutBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class g extends SuspendLambda implements Y41.r<List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, Continuation<? super DeliveryUniversalCheckoutInternalAction.ContentChanged>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ List f257142q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ List f257143r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ List f257144s;

    public g() {
        throw null;
    }

    @Override // Y41.r
    public final Object invoke(List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, Continuation<? super DeliveryUniversalCheckoutInternalAction.ContentChanged> continuation) {
        g gVar = new g(4, continuation);
        gVar.f257142q = list;
        gVar.f257143r = list2;
        gVar.f257144s = list3;
        return gVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new DeliveryUniversalCheckoutInternalAction.ContentChanged(this.f257142q, this.f257143r, this.f257144s);
    }
}
