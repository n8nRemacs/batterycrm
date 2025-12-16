package com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain;

import Vn0.InterfaceC15696b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin_shared.model.utils.m;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
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

/* compiled from: UniversalDeliveryTypeShippingCompetitionUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/shipping_competition/domain/a;", "", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final UniversalDeliveryTypeContent.Tab.ShippingCompetition f256807a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.safedeal.universal_delivery_type.shipping_competition.a f256808b;

    /* compiled from: UniversalDeliveryTypeShippingCompetitionUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVn0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain.UniversalDeliveryTypeShippingCompetitionUseCase$invoke$1", f = "UniversalDeliveryTypeShippingCompetitionUseCase.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.safedeal.universal_delivery_type.shipping_competition.domain.a$a, reason: collision with other inner class name */
    public static final class C7699a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC15696b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f256809q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f256810r;

        public C7699a(Continuation<? super C7699a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C7699a c7699a = a.this.new C7699a(continuation);
            c7699a.f256810r = obj;
            return c7699a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC15696b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7699a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f256809q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f256810r;
                a aVar = a.this;
                String mainFormId = aVar.f256807a.getMainFormId();
                if (mainFormId == null) {
                    mainFormId = "main";
                }
                InterfaceC15696b.d dVar = new InterfaceC15696b.d(mainFormId, m.a(aVar.f256808b.f256768a, mainFormId, aVar.f256807a.getMainComponents()));
                this.f256809q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
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

    @Inject
    public a(@k UniversalDeliveryTypeContent.Tab.ShippingCompetition shippingCompetition, @k com.avito.android.safedeal.universal_delivery_type.shipping_competition.a aVar) {
        this.f256807a = shippingCompetition;
        this.f256808b = aVar;
    }

    @k
    public final InterfaceC43160i<InterfaceC15696b> a() {
        return C43175k.G(new C7699a(null));
    }
}
