package com.avito.android.campaigns_sale.mvi;

import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import im.InterfaceC41424a;
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
@DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$10", f = "CampaignsSaleActor.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.campaigns_sale.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29302b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CampaignsSaleInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f114125q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f114126r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f114127s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f114128t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41424a f114129u;

    /* compiled from: CampaignsSaleActor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale.mvi.CampaignsSaleActor$process$10$1", f = "CampaignsSaleActor.kt", i = {}, l = {91, 99, 100}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.campaigns_sale.mvi.b$a */
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114130q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ CampaignsSaleState f114131r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<CampaignsSaleInternalAction> f114132s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ w f114133t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC41424a f114134u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CampaignsSaleState campaignsSaleState, InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, w wVar, InterfaceC41424a interfaceC41424a, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f114131r = campaignsSaleState;
            this.f114132s = interfaceC43172j;
            this.f114133t = wVar;
            this.f114134u = interfaceC41424a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new a(this.f114131r, this.f114132s, this.f114133t, this.f114134u, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f114130q
                im.a r2 = r9.f114134u
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState r3 = r9.f114131r
                r4 = 3
                r5 = 2
                r6 = 1
                com.avito.android.campaigns_sale.mvi.w r7 = r9.f114133t
                kotlinx.coroutines.flow.j<com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction> r8 = r9.f114132s
                if (r1 == 0) goto L2a
                if (r1 == r6) goto L26
                if (r1 == r5) goto L22
                if (r1 != r4) goto L1a
                goto L26
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                kotlin.C42729a0.b(r10)
                goto L60
            L26:
                kotlin.C42729a0.b(r10)
                goto L79
            L2a:
                kotlin.C42729a0.b(r10)
                boolean r10 = r3.f114194h
                if (r10 == 0) goto L4b
                com.avito.android.campaigns_sale.network.a r10 = r7.f114304a
                java.util.List<gm.b> r1 = r3.f114191e
                java.util.ArrayList r1 = gm.C40706c.a(r1)
                im.a$p r2 = (im.InterfaceC41424a.p) r2
                com.avito.android.deep_linking.links.DeepLink r2 = r2.f398733a
                r3 = 0
                kotlinx.coroutines.flow.i r10 = r10.b(r1, r3, r2)
                r9.f114130q = r6
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r8)
                if (r10 != r0) goto L79
                return r0
            L4b:
                com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$TrackClickStreamEvent r10 = new com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleInternalAction$TrackClickStreamEvent
                em.g r1 = new em.g
                java.lang.String r6 = r7.f114306c
                r1.<init>(r6)
                r10.<init>(r1)
                r9.f114130q = r5
                java.lang.Object r10 = r8.emit(r10, r9)
                if (r10 != r0) goto L60
                return r0
            L60:
                com.avito.android.campaigns_sale.network.a r10 = r7.f114304a
                java.util.List<gm.b> r1 = r3.f114191e
                java.util.ArrayList r1 = gm.C40706c.a(r1)
                im.a$p r2 = (im.InterfaceC41424a.p) r2
                com.avito.android.deep_linking.links.DeepLink r2 = r2.f398733a
                kotlinx.coroutines.flow.i r10 = r10.e(r1, r2)
                r9.f114130q = r4
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r8)
                if (r10 != r0) goto L79
                return r0
            L79:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale.mvi.C29302b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29302b(w wVar, CampaignsSaleState campaignsSaleState, InterfaceC41424a interfaceC41424a, Continuation<? super C29302b> continuation) {
        super(2, continuation);
        this.f114127s = wVar;
        this.f114128t = campaignsSaleState;
        this.f114129u = interfaceC41424a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29302b c29302b = new C29302b(this.f114127s, this.f114128t, this.f114129u, continuation);
        c29302b.f114126r = obj;
        return c29302b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CampaignsSaleInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29302b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f114125q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f114126r;
            CampaignsSaleState campaignsSaleState = this.f114128t;
            w wVar = this.f114127s;
            a aVar = new a(campaignsSaleState, interfaceC43172j, wVar, this.f114129u, null);
            this.f114125q = 1;
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
