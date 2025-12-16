package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.entity.UniversalDeliveryTypeCourierInternalAction;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lj.InterfaceC43779a;

/* compiled from: UniversalDeliveryTypeCourierBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/safedeal/universal_delivery_type/courier/mvi/entity/UniversalDeliveryTypeCourierInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safedeal.universal_delivery_type.courier.mvi.UniversalDeliveryTypeCourierBootstrap$contentLoadFlow$1", f = "UniversalDeliveryTypeCourierBootstrap.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalDeliveryTypeCourierInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f256513q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f256514r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f256515s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f256515s = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f256515s, continuation);
        cVar.f256514r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UniversalDeliveryTypeCourierInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f256513q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f256514r;
            f fVar = this.f256515s;
            com.avito.android.safedeal.universal_delivery_type.courier.f fVar2 = fVar.f256539c;
            InterfaceC43779a interfaceC43779a = fVar2.f256500a;
            UniversalDeliveryTypeContent.Tab.Courier courier = fVar.f256537a;
            List<AbstractC40112a<BeduinModel, InterfaceC40116e>> listA = com.avito.android.beduin_shared.model.utils.m.a(interfaceC43779a, courier.getMainFormId(), C42745f0.C(courier.getMainComponents()));
            InterfaceC43779a interfaceC43779a2 = fVar.f256539c.f256501b;
            String bottomFormId = courier.getBottomFormId();
            if (bottomFormId == null) {
                bottomFormId = "bottom";
            }
            List<BeduinModel> bottomComponents = courier.getBottomComponents();
            if (bottomComponents == null) {
                bottomComponents = C42784z0.f406748b;
            }
            UniversalDeliveryTypeCourierInternalAction.ContentLoaded contentLoaded = new UniversalDeliveryTypeCourierInternalAction.ContentLoaded(interfaceC43779a.getF103350r(), listA, fVar2.f256501b.getF103350r(), com.avito.android.beduin_shared.model.utils.m.a(interfaceC43779a2, bottomFormId, bottomComponents), courier.getOnInitActions());
            this.f256513q = 1;
            if (interfaceC43172j.emit(contentLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
