package com.avito.android.favorite_sellers.mvi;

import Y41.q;
import com.avito.android.favorite_sellers.mvi.a;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersInternalAction;
import com.avito.android.favorite_sellers.mvi.entity.FavoriteSellersState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FavoriteSellersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/favorite_sellers/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "LFC/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.favorite_sellers.mvi.FavoriteSellersActor$process$2", f = "FavoriteSellersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends SuspendLambda implements Y41.p<Q<? extends a.AbstractC4567a, ? extends InterfaceC43160i<? extends FC.a>>, Continuation<? super InterfaceC43160i<? extends FavoriteSellersInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f155983q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.favorite_sellers.mvi.a f155984r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<FavoriteSellersState> f155985s;

    /* compiled from: FavoriteSellersActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LFC/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/favorite_sellers/mvi/entity/FavoriteSellersInternalAction;", "<anonymous>", "(LFC/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.mvi.FavoriteSellersActor$process$2$2", f = "FavoriteSellersActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<FC.a, Continuation<? super InterfaceC43160i<? extends FavoriteSellersInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f155986q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.favorite_sellers.mvi.a f155987r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<FavoriteSellersState> f155988s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, com.avito.android.favorite_sellers.mvi.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f155987r = aVar2;
            this.f155988s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f155988s, this.f155987r, continuation);
            aVar.f155986q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(FC.a aVar, Continuation<? super InterfaceC43160i<? extends FavoriteSellersInternalAction>> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f155987r.b((FC.a) this.f155986q, this.f155988s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.favorite_sellers.mvi.FavoriteSellersActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "FavoriteSellersActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super FavoriteSellersInternalAction>, FC.a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f155989q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f155990r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f155991s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.favorite_sellers.mvi.a f155992t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f155993u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, com.avito.android.favorite_sellers.mvi.a aVar2, Continuation continuation) {
            super(3, continuation);
            this.f155992t = aVar2;
            this.f155993u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FavoriteSellersInternalAction> interfaceC43172j, FC.a aVar, Continuation<? super G0> continuation) {
            b bVar = new b(this.f155993u, this.f155992t, continuation);
            bVar.f155990r = interfaceC43172j;
            bVar.f155991s = aVar;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f155989q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f155990r;
                InterfaceC43160i<FavoriteSellersInternalAction> interfaceC43160iC = this.f155992t.b((FC.a) this.f155991s, (FavoriteSellersState) this.f155993u.invoke());
                this.f155989q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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
    public d(Y41.a aVar, com.avito.android.favorite_sellers.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f155984r = aVar2;
        this.f155985s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f155985s, this.f155984r, continuation);
        dVar.f155983q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends a.AbstractC4567a, ? extends InterfaceC43160i<? extends FC.a>> q12, Continuation<? super InterfaceC43160i<? extends FavoriteSellersInternalAction>> continuation) {
        return ((d) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f155983q;
        a.AbstractC4567a abstractC4567a = (a.AbstractC4567a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(abstractC4567a, a.AbstractC4567a.C4568a.f155967a);
        Y41.a<FavoriteSellersState> aVar = this.f155985s;
        com.avito.android.favorite_sellers.mvi.a aVar2 = this.f155984r;
        if (zF2) {
            return C43175k.Y(interfaceC43160i, new b(aVar, aVar2, null));
        }
        if (L.f(abstractC4567a, a.AbstractC4567a.b.f155968a)) {
            return C43175k.C(new a(aVar, aVar2, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
