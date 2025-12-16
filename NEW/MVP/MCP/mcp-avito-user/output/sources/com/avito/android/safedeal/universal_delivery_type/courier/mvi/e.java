package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.entity.UniversalDeliveryTypeCourierInternalAction;
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

/* compiled from: UniversalDeliveryTypeCourierBootstrap.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u00002\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u00040\u0000H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "mainComponents", "bottomComponents", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ContentChanged;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;)Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction$ContentChanged;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal.universal_delivery_type.courier.mvi.UniversalDeliveryTypeCourierBootstrap$formContentChangedFlow$1", f = "UniversalDeliveryTypeCourierBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements Y41.q<List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>>, Continuation<? super UniversalDeliveryTypeCourierInternalAction.ContentChanged>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ List f256524q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ List f256525r;

    public e() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, Continuation<? super UniversalDeliveryTypeCourierInternalAction.ContentChanged> continuation) {
        e eVar = new e(3, continuation);
        eVar.f256524q = list;
        eVar.f256525r = list2;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return new UniversalDeliveryTypeCourierInternalAction.ContentChanged(this.f256524q, this.f256525r);
    }
}
