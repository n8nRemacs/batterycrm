package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import com.avito.android.delivery_tarifikator.DeliveryTarifikatorParams;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
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

/* compiled from: TarifikatorMainBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/r;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements com.avito.android.arch.mvi.b<TarifikatorMainInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final DeliveryTarifikatorParams f135711a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e f135712b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Mv.e f135713c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Mv.i f135714d;

    /* compiled from: TarifikatorMainBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.TarifikatorMainBootstrap$produce$1", f = "TarifikatorMainBootstrap.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TarifikatorMainInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f135715q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f135716r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = r.this.new a(continuation);
            aVar.f135716r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TarifikatorMainInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f135715q;
            r rVar = r.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f135716r;
                TarifikatorMainInternalAction.SetScreenName setScreenNameC = TarifikatorMainInternalAction.SetScreenName.c(rVar.f135711a.f135221c);
                this.f135716r = interfaceC43172j;
                this.f135715q = 1;
                if (interfaceC43172j.emit(setScreenNameC, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f135716r;
                C42729a0.b(obj);
            }
            InterfaceC43160i<TarifikatorMainInternalAction> interfaceC43160iA = rVar.f135712b.a();
            this.f135716r = null;
            this.f135715q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public r(@Y61.k DeliveryTarifikatorParams deliveryTarifikatorParams, @Y61.k com.avito.android.delivery_tarifikator.presentation.main_screen.domain.e eVar, @Y61.k Mv.e eVar2, @Y61.k Mv.i iVar) {
        this.f135711a = deliveryTarifikatorParams;
        this.f135712b = eVar;
        this.f135713c = eVar2;
        this.f135714d = iVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<TarifikatorMainInternalAction> a() {
        String str = this.f135711a.f135220b;
        this.f135713c.a(str);
        this.f135714d.a(str);
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
