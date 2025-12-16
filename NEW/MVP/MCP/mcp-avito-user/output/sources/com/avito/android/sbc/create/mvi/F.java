package com.avito.android.sbc.create.mvi;

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
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToStateFromOverloaded$6", f = "CreateDiscountDispatchActor.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class F extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259283q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259284r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259285s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.E f259286t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259287u;

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
    public F(com.avito.android.arch.mvi.utils.o oVar, e.E e12, Continuation continuation, C34469a c34469a) {
        super(2, continuation);
        this.f259285s = oVar;
        this.f259286t = e12;
        this.f259287u = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        F f12 = new F(this.f259285s, this.f259286t, continuation, this.f259287u);
        f12.f259284r = obj;
        return f12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((F) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259283q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259284r;
            Object value = this.f259285s.f92114c.getValue();
            a aVar = new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) value;
            if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
                CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar = discountDispatchDataLoaded.f259618C;
                if ((dVar != null ? dVar.f259671h : null) != null) {
                    C34469a c34469a = this.f259287u;
                    InterfaceC28373a interfaceC28373a = c34469a.f259546g;
                    String strA = c34469a.f259549j.a();
                    String f259609b = c34469a.f259543d.getF259609b();
                    boolean z12 = discountDispatchDataLoaded.f259619D.f259687c;
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar2 = discountDispatchDataLoaded.f259618C;
                    Boolean boolBoxBoolean = z12 ? Boxing.boxBoolean(com.avito.android.sbc.create.mvi.entity.a.a(dVar2)) : null;
                    interfaceC28373a.c(new Oo0.t(strA, f259609b, discountDispatchDataLoaded.f259622b, discountDispatchDataLoaded.f259627g, boolBoxBoolean, c34469a.C()));
                    f.d dVar3 = new f.d(dVar2.f259671h);
                    this.f259283q = 1;
                    if (aVar.invoke(dVar3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
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
