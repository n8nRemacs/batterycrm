package com.avito.android.sbc.create.mvi;

import Oo0.C14719A;
import Uo0.e;
import Uo0.f;
import com.avito.android.analytics.InterfaceC28373a;
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
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToStateFromOverloaded$5", f = "CreateDiscountDispatchActor.kt", i = {}, l = {355}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class E extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259277q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259278r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259279s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.F f259280t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259281u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e.F f259282v;

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
    public E(com.avito.android.arch.mvi.utils.o oVar, e.F f12, Continuation continuation, C34469a c34469a, e.F f13) {
        super(2, continuation);
        this.f259279s = oVar;
        this.f259280t = f12;
        this.f259281u = c34469a;
        this.f259282v = f13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E e12 = new E(this.f259279s, this.f259280t, continuation, this.f259281u, this.f259282v);
        e12.f259278r = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((E) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259277q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259278r;
            Object value = this.f259279s.f92114c.getValue();
            a aVar = new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) value;
            if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
                C34469a c34469a = this.f259281u;
                InterfaceC28373a interfaceC28373a = c34469a.f259546g;
                String strA = c34469a.f259549j.a();
                String strD = c34469a.D();
                CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
                Long lBoxLong = Boxing.boxLong(discountDispatchDataLoaded.f259622b);
                Boolean boolBoxBoolean = discountDispatchDataLoaded.f259619D.f259687c ? Boxing.boxBoolean(com.avito.android.sbc.create.mvi.entity.a.a(discountDispatchDataLoaded.f259618C)) : null;
                interfaceC28373a.c(new C14719A(strA, lBoxLong, strD, discountDispatchDataLoaded.f259627g, c34469a.f259554o, boolBoxBoolean, c34469a.C()));
            }
            f.j jVar = new f.j(this.f259282v.f16614a);
            this.f259277q = 1;
            if (aVar.invoke(jVar, this) == coroutine_suspended) {
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
