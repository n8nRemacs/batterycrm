package com.avito.android.gig_motivation_payment.ui.mvi;

import com.avito.android.error.z;
import com.avito.android.gig_motivation_payment.ui.mvi.entity.MotivationPaymentInternalAction;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rH.InterfaceC47543a;
import sH.C48049a;

/* compiled from: MotivationPaymentBootstrap.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_motivation_payment/ui/mvi/entity/MotivationPaymentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.mvi.MotivationPaymentBootstrap$getMotivationPayout$1", f = "MotivationPaymentBootstrap.kt", i = {0}, l = {65, 66}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MotivationPaymentInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f160246q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f160247r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f160248s;

    /* compiled from: MotivationPaymentBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LsH/a;", "it", "Lkotlin/G0;", "<anonymous>", "(LsH/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.mvi.MotivationPaymentBootstrap$getMotivationPayout$1$1", f = "MotivationPaymentBootstrap.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<C48049a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160249q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160250r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<MotivationPaymentInternalAction> f160251s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super MotivationPaymentInternalAction> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f160251s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f160251s, continuation);
            aVar.f160250r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(C48049a c48049a, Continuation<? super G0> continuation) {
            return ((a) create(c48049a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160249q;
            if (i12 == 0) {
                C42729a0.b(obj);
                MotivationPaymentInternalAction.ContentLoaded contentLoaded = new MotivationPaymentInternalAction.ContentLoaded((C48049a) this.f160250r);
                this.f160249q = 1;
                if (this.f160251s.emit(contentLoaded, this) == coroutine_suspended) {
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

    /* compiled from: MotivationPaymentBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.mvi.MotivationPaymentBootstrap$getMotivationPayout$1$2", f = "MotivationPaymentBootstrap.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160252q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160253r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<MotivationPaymentInternalAction> f160254s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43172j<? super MotivationPaymentInternalAction> interfaceC43172j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f160254s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f160254s, continuation);
            bVar.f160253r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((b) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160252q;
            if (i12 == 0) {
                C42729a0.b(obj);
                MotivationPaymentInternalAction.b bVar = new MotivationPaymentInternalAction.b((String) this.f160253r);
                this.f160252q = 1;
                if (this.f160254s.emit(bVar, this) == coroutine_suspended) {
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
    public j(l lVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f160248s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f160248s, continuation);
        jVar.f160247r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MotivationPaymentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f160246q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f160247r;
            l lVar = this.f160248s;
            InterfaceC47543a interfaceC47543a = lVar.f160258b;
            String str = lVar.f160257a.f160119b;
            this.f160247r = interfaceC43172j;
            this.f160246q = 1;
            obj = interfaceC47543a.a(str, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f160247r;
            C42729a0.b(obj);
        }
        a aVar = new a(interfaceC43172j, null);
        b bVar = new b(interfaceC43172j, null);
        this.f160247r = null;
        this.f160246q = 2;
        if (z.s((TypedResult) obj, aVar, bVar, null, null, this, 60) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
