package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CampaignsSaleActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale/mvi/entity/CampaignsSaleInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$11", f = "CampaignsSaleActor.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.campaigns_sale.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29303c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114135q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114136r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f114137s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114138t;

    /* compiled from: CampaignsSaleActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$11$1", f = "CampaignsSaleActor.kt", i = {1, 1, 2, 3}, l = {112, 142, 143, 144, 145}, m = "invokeSuspend", n = {"addedBlockUUID", "resolvedBlocks", "resolvedBlocks", "resolvedBlocks"}, s = {"L$0", "L$1", "L$0", "L$0"})
    /* renamed from: com.avito.android.campaigns_sale.mvi.c$a */
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f114139q;

        /* renamed from: r, reason: collision with root package name */
        public ArrayList f114140r;

        /* renamed from: s, reason: collision with root package name */
        public int f114141s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<CampaignsSaleInternalAction> f114142t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ w f114143u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ CampaignsSaleState f114144v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, w wVar, CampaignsSaleState campaignsSaleState, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f114142t = interfaceC43172j;
            this.f114143u = wVar;
            this.f114144v = campaignsSaleState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f114142t, this.f114143u, this.f114144v, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00e8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010a A[RETURN] */
        /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r24) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.C29303c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29303c(w wVar, CampaignsSaleState campaignsSaleState, Continuation<? super C29303c> continuation) {
        super(2, continuation);
        this.f114137s = wVar;
        this.f114138t = campaignsSaleState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29303c c29303c = new C29303c(this.f114137s, this.f114138t, continuation);
        c29303c.f114136r = obj;
        return c29303c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29303c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114135q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114136r;
            w wVar = this.f114137s;
            CampaignsSaleState campaignsSaleState = this.f114138t;
            a aVar = new a(interfaceC43172j, wVar, campaignsSaleState, null);
            this.f114135q = 1;
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
