package com.avito.android.advert_stats;

import com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction;
import com.avito.android.util.P2;
import jb.InterfaceC42343a;
import kb.C42659a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertStatsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/q;", "Lcom/avito/android/advert_stats/p;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42343a f86837a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.preloading.j<String, P2<C42659a>> f86838b;

    /* compiled from: AdvertStatsRepository.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/mvi/entity/AdvertDetailStatsMVIInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_stats.AdvertStatsRepositoryImpl$getAdvertDetailStatsMVI$1", f = "AdvertStatsRepository.kt", i = {0}, l = {33, 34, 34}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertDetailStatsMVIInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public q f86839q;

        /* renamed from: r, reason: collision with root package name */
        public int f86840r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f86841s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f86843u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f86843u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = q.this.new a(this.f86843u, continuation);
            aVar.f86841s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AdvertDetailStatsMVIInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f86840r
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L31
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.C42729a0.b(r7)
                goto L92
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                com.avito.android.advert_stats.q r1 = r6.f86839q
                java.lang.Object r3 = r6.f86841s
                kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
                kotlin.C42729a0.b(r7)
                goto L5e
            L28:
                java.lang.Object r1 = r6.f86841s
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r7)
                r7 = r1
                goto L48
            L31:
                kotlin.C42729a0.b(r7)
                java.lang.Object r7 = r6.f86841s
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
                com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction$Loading r1 = new com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction$Loading
                r1.<init>()
                r6.f86841s = r7
                r6.f86840r = r4
                java.lang.Object r1 = r7.emit(r1, r6)
                if (r1 != r0) goto L48
                return r0
            L48:
                com.avito.android.advert_stats.q r1 = com.avito.android.advert_stats.q.this
                jb.a r4 = r1.f86837a
                r6.f86841s = r7
                r6.f86839q = r1
                r6.f86840r = r3
                java.lang.String r3 = r6.f86843u
                java.lang.Object r3 = r4.a(r3, r6)
                if (r3 != r0) goto L5b
                return r0
            L5b:
                r5 = r3
                r3 = r7
                r7 = r5
            L5e:
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                r1.getClass()
                boolean r1 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r1 == 0) goto L75
                com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction$Content r1 = new com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction$Content
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                lb.a r7 = (lb.C43718a) r7
                r1.<init>(r7)
                goto L84
            L75:
                boolean r1 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r1 == 0) goto L95
                com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction$Error r1 = new com.avito.android.advert_stats.detail.advertdetailstatsmvi.mvi.entity.AdvertDetailStatsMVIInternalAction$Error
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r1.<init>(r7)
            L84:
                r7 = 0
                r6.f86841s = r7
                r6.f86839q = r7
                r6.f86840r = r2
                java.lang.Object r7 = r3.emit(r1, r6)
                if (r7 != r0) goto L92
                return r0
            L92:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L95:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert_stats.q.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public q(@Y61.k InterfaceC42343a interfaceC42343a, @Y61.k com.avito.android.preloading.j<String, P2<C42659a>> jVar) {
        this.f86837a = interfaceC42343a;
        this.f86838b = jVar;
    }

    @Override // com.avito.android.advert_stats.p
    @Y61.k
    public final InterfaceC43160i<AdvertDetailStatsMVIInternalAction> a(@Y61.k String str) {
        return C43175k.G(new a(str, null));
    }

    @Override // com.avito.android.advert_stats.p
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C b(@Y61.k String str) {
        return new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.preloading.e(this.f86838b, str));
    }
}
