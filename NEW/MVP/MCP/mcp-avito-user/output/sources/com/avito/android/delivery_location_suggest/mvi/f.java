package com.avito.android.delivery_location_suggest.mvi;

import Y41.p;
import com.avito.android.delivery_location_suggest.DeliveryLocationSuggestParams;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DeliveryLocationSuggestBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements com.avito.android.arch.mvi.b<DeliveryLocationSuggestInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeliveryLocationSuggestParams f135172a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_location_suggest.mvi.useCase.e f135173b;

    /* compiled from: DeliveryLocationSuggestBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_location_suggest.mvi.DeliveryLocationSuggestBootstrap$produce$1", f = "DeliveryLocationSuggestBootstrap.kt", i = {}, l = {23, 23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super DeliveryLocationSuggestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135174q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f135175r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f135177t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f135177t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(this.f135177t, continuation);
            aVar.f135175r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super DeliveryLocationSuggestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f135174q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f135175r;
                com.avito.android.delivery_location_suggest.mvi.useCase.e eVar = f.this.f135173b;
                this.f135175r = interfaceC43172j;
                this.f135174q = 1;
                obj = eVar.a(this.f135177t, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f135175r;
                C42729a0.b(obj);
            }
            this.f135175r = null;
            this.f135174q = 2;
            if (C43175k.u(this, (InterfaceC43160i) obj, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k DeliveryLocationSuggestParams deliveryLocationSuggestParams, @Y61.k com.avito.android.delivery_location_suggest.mvi.useCase.e eVar) {
        this.f135172a = deliveryLocationSuggestParams;
        this.f135173b = eVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<DeliveryLocationSuggestInternalAction> a() {
        String f135039c = this.f135172a.getF135039c();
        return (f135039c == null || f135039c.length() == 0) ? C43175k.w() : C43175k.G(new a(f135039c, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
