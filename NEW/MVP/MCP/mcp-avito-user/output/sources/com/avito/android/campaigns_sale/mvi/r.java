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
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$5", f = "CampaignsSaleActor.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class r extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114275q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114276r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f114277s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114278t;

    /* compiled from: CampaignsSaleActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$5$1", f = "CampaignsSaleActor.kt", i = {}, l = {62, 63}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114279q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<CampaignsSaleInternalAction> f114280r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ w f114281s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ CampaignsSaleState f114282t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, w wVar, CampaignsSaleState campaignsSaleState, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f114280r = interfaceC43172j;
            this.f114281s = wVar;
            this.f114282t = campaignsSaleState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f114280r, this.f114281s, this.f114282t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114279q;
            w wVar = this.f114281s;
            InterfaceC43172j<CampaignsSaleInternalAction> interfaceC43172j = this.f114280r;
            if (i12 == 0) {
                C42729a0.b(obj);
                CampaignsSaleInternalAction.TrackClickStreamEvent trackClickStreamEvent = new CampaignsSaleInternalAction.TrackClickStreamEvent(new em.g(wVar.f114306c));
                this.f114279q = 1;
                if (interfaceC43172j.emit(trackClickStreamEvent, this) == coroutine_suspended) {
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
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iE = wVar.f114304a.e(C40706c.a(this.f114282t.f114191e), null);
            this.f114279q = 2;
            if (C43175k.u(this, interfaceC43160iE, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar, CampaignsSaleState campaignsSaleState, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f114277s = wVar;
        this.f114278t = campaignsSaleState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r rVar = new r(this.f114277s, this.f114278t, continuation);
        rVar.f114276r = obj;
        return rVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((r) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114275q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114276r;
            w wVar = this.f114277s;
            CampaignsSaleState campaignsSaleState = this.f114278t;
            a aVar = new a(interfaceC43172j, wVar, campaignsSaleState, null);
            this.f114275q = 1;
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
