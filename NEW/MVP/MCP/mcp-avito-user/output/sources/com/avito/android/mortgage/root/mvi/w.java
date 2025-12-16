package com.avito.android.mortgage.root.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.model.MortgageRootArguments;
import com.avito.android.mortgage.root.mvi.domain.InterfaceC32687a;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/w;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class w implements com.avito.android.arch.mvi.b<MortgageRootInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MortgageRootArguments f203358a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.root.mvi.domain.t f203359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32687a f203360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f203361d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f203362e;

    /* compiled from: MortgageRootBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootBootstrap$produce$initialFlow$1", f = "MortgageRootBootstrap.kt", i = {0}, l = {31, 33}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203363q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f203364r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = w.this.new a(continuation);
            aVar.f203364r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203363q;
            w wVar = w.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f203364r;
                if (wVar.f203362e) {
                    return G0.f406611a;
                }
                wVar.f203362e = true;
                MortgageRootInternalAction.InitState initState = new MortgageRootInternalAction.InitState(wVar.f203358a);
                this.f203364r = interfaceC43172j;
                this.f203363q = 1;
                if (interfaceC43172j.emit(initState, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f203364r;
                C42729a0.b(obj);
            }
            InterfaceC43160i<MortgageRootInternalAction> interfaceC43160iA = wVar.f203359b.a(wVar.f203358a.f202933b);
            this.f203364r = null;
            this.f203363q = 2;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public w(@Y61.k MortgageRootArguments mortgageRootArguments, @Y61.k com.avito.android.mortgage.root.mvi.domain.t tVar, @Y61.k InterfaceC32687a interfaceC32687a, @Y61.k R0 r02) {
        this.f203358a = mortgageRootArguments;
        this.f203359b = tVar;
        this.f203360c = interfaceC32687a;
        this.f203361d = r02;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<MortgageRootInternalAction> a() {
        return new C43197r1(new v(this, this.f203358a.f202933b, null), C43175k.N(C43175k.I(this.f203361d.a(), C43175k.G(new a(null))), this.f203360c.a()));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
