package com.avito.android.sbc.create.mvi;

import Uo0.e;
import Uo0.f;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/s"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToStateFromOverloaded$4", f = "CreateDiscountDispatchActor.kt", i = {}, l = {348}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class D extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259270q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259272s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.G f259273t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e.G f259274u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C34469a f259275v;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(com.avito.android.arch.mvi.utils.o oVar, e.G g12, Continuation continuation, e.G g13, C34469a c34469a) {
        super(2, continuation);
        this.f259272s = oVar;
        this.f259273t = g12;
        this.f259274u = g13;
        this.f259275v = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        D d12 = new D(this.f259272s, this.f259273t, continuation, this.f259274u, this.f259275v);
        d12.f259271r = obj;
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((D) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259270q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259271r;
            Object value = this.f259272s.f92114c.getValue();
            a aVar = new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) value;
            e.G g12 = this.f259274u;
            boolean z12 = g12.f16616b;
            CharSequence charSequenceC = null;
            C34469a c34469a = this.f259275v;
            if (z12) {
                InterfaceC28373a interfaceC28373a = c34469a.f259546g;
                String strA = c34469a.f259549j.a();
                String strD = c34469a.D();
                CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState : null;
                interfaceC28373a.c(new Oo0.B(strA, strD, c34469a.f259554o, discountDispatchDataLoaded != null ? Boxing.boxLong(discountDispatchDataLoaded.f259622b) : null, c34469a.C()));
            }
            AttributedText attributedText = g12.f16615a;
            if (attributedText != null) {
                H0 h02 = c34469a.f259540a;
                charSequenceC = h02.f259300c.c(h02.f259301d, attributedText);
            } else {
                c34469a.getClass();
            }
            Uo0.f pVar = charSequenceC != null ? new f.p(charSequenceC) : f.o.f16660a;
            this.f259270q = 1;
            if (aVar.invoke(pVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
