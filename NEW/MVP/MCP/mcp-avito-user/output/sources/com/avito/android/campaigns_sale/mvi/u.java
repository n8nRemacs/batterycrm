package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import gm.C40706c;
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

/* compiled from: CampaignsSaleActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$8", f = "CampaignsSaleActor.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114288q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114289r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f114290s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114291t;

    /* compiled from: CampaignsSaleActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$8$1", f = "CampaignsSaleActor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114292q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<CampaignsSaleInternalAction> f114293r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w f114294s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ CampaignsSaleState f114295t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, w wVar, CampaignsSaleState campaignsSaleState, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f114293r = interfaceC43172j;
            this.f114294s = wVar;
            this.f114295t = campaignsSaleState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f114293r, this.f114294s, this.f114295t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114292q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iB = this.f114294s.f114304a.b(C40706c.a(this.f114295t.f114191e), false, null);
                this.f114292q = 1;
                if (C43175k.u(this, interfaceC43160iB, this.f114293r) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, CampaignsSaleState campaignsSaleState, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f114290s = wVar;
        this.f114291t = campaignsSaleState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        u uVar = new u(this.f114290s, this.f114291t, continuation);
        uVar.f114289r = obj;
        return uVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((u) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114288q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114289r;
            w wVar = this.f114290s;
            CampaignsSaleState campaignsSaleState = this.f114291t;
            a aVar = new a(interfaceC43172j, wVar, campaignsSaleState, null);
            this.f114288q = 1;
            if (w.d(wVar, interfaceC43172j, campaignsSaleState, aVar, this) == coroutine_suspended) {
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
