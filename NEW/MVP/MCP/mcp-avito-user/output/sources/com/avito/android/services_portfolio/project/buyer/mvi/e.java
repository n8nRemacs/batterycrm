package com.avito.android.services_portfolio.project.buyer.mvi;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import com.avito.android.services_portfolio.project.PortfolioProjectArguments;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.PortfolioProjectBuyerInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PortfolioProjectBuyerBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/project/buyer/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.arch.mvi.b<PortfolioProjectBuyerInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.services_portfolio.project.buyer.domain.a f280027a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PortfolioProjectArguments.BuyerArgs f280028b;

    /* compiled from: PortfolioProjectBuyerBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.buyer.mvi.PortfolioProjectBuyerBootstrap$produce$1", f = "PortfolioProjectBuyerBootstrap.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super PortfolioProjectBuyerInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280029q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f280030r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(continuation);
            aVar.f280030r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PortfolioProjectBuyerInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f280029q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f280030r;
                e eVar = e.this;
                com.avito.android.services_portfolio.project.buyer.domain.a aVar = eVar.f280027a;
                PortfolioProjectArguments.BuyerArgs buyerArgs = eVar.f280028b;
                InterfaceC43160i<PortfolioProjectBuyerInternalAction> interfaceC43160iA = aVar.a(buyerArgs.f279992c, buyerArgs.f279991b, buyerArgs.f279993d, buyerArgs.f279994e, buyerArgs.f279995f);
                this.f280029q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: PortfolioProjectBuyerBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/services_portfolio/project/buyer/mvi/entity/PortfolioProjectBuyerInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.services_portfolio.project.buyer.mvi.PortfolioProjectBuyerBootstrap$produce$2", f = "PortfolioProjectBuyerBootstrap.kt", i = {}, l = {31, 33}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super PortfolioProjectBuyerInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f280032q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f280033r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f280034s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super PortfolioProjectBuyerInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f280033r = interfaceC43172j;
            bVar.f280034s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f280032q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f280033r;
                PortfolioProjectBuyerInternalAction.Error error = new PortfolioProjectBuyerInternalAction.Error(new ApiError.UnknownError("Something went wrong", null, null, 6, null));
                this.f280033r = null;
                this.f280032q = 2;
                if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k com.avito.android.services_portfolio.project.buyer.domain.a aVar, @Y61.k PortfolioProjectArguments.BuyerArgs buyerArgs) {
        this.f280027a = aVar;
        this.f280028b = buyerArgs;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PortfolioProjectBuyerInternalAction> a() {
        return new C43152f0(C43175k.G(new a(null)), new b(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
