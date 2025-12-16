package com.avito.android.services_transportation_widget.cargo_capacity_sheet;

import Av0.C13085a;
import Av0.C13088d;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import java.util.ArrayList;
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
import kotlinx.coroutines.T;

/* compiled from: ServiceTransportationCardSelectPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.services_transportation_widget.cargo_capacity_sheet.ServiceTransportationCardSelectPresenterImpl$requestItems$1", f = "ServiceTransportationCardSelectPresenter.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f280476q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f280477r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f280477r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f280477r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f280476q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e eVar = this.f280477r;
            C13085a c13085a = eVar.f280479b;
            List<ServiceTransportationWidget.CardSelectField.CardSelectValue> list = eVar.f280480c;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (ServiceTransportationWidget.CardSelectField.CardSelectValue cardSelectValue : list) {
                String title = cardSelectValue.getTitle();
                String description = cardSelectValue.getDescription();
                String label = cardSelectValue.getLabel();
                long valueId = cardSelectValue.getValueId();
                UniversalImage image = cardSelectValue.getImage();
                Long imageMaxHeight = cardSelectValue.getImageMaxHeight();
                ServiceTransportationWidget.CardSelectField.CardSelectValue cardSelectValue2 = eVar.f280481d;
                boolean z12 = false;
                if (cardSelectValue2 != null && cardSelectValue2.getValueId() == cardSelectValue.getValueId()) {
                    z12 = true;
                }
                arrayList.add(new C13088d(title, description, label, valueId, image, imageMaxHeight, z12));
            }
            eVar.f280485h = arrayList;
            C42784z0 c42784z0 = C42784z0.f406748b;
            this.f280476q = 1;
            if (e.a(eVar, c42784z0, arrayList, this) == coroutine_suspended) {
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
