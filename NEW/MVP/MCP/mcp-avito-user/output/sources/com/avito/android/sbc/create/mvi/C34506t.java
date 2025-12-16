package com.avito.android.sbc.create.mvi;

import Uo0.e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.utils.o;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToMutableStateFrom$9", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sbc.create.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34506t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259877q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259878r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e.r f259879s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34469a f259880t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e.r f259881u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.t$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34506t(com.avito.android.arch.mvi.utils.o oVar, e.r rVar, Continuation continuation, C34469a c34469a, e.r rVar2) {
        super(2, continuation);
        this.f259878r = oVar;
        this.f259879s = rVar;
        this.f259880t = c34469a;
        this.f259881u = rVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34506t c34506t = new C34506t(this.f259878r, this.f259879s, continuation, this.f259880t, this.f259881u);
        c34506t.f259877q = obj;
        return c34506t;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34506t) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259877q;
        o.a aVar = this.f259878r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) aVar.getValue();
        if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
            if (discountDispatchDataLoaded.f259618C != null) {
                C34469a c34469a = this.f259880t;
                InterfaceC28373a interfaceC28373a = c34469a.f259546g;
                String strA = c34469a.f259549j.a();
                String f259609b = c34469a.f259543d.getF259609b();
                e.r rVar = this.f259881u;
                boolean z12 = rVar.f16637a;
                interfaceC28373a.c(new Oo0.h(strA, f259609b, discountDispatchDataLoaded.f259622b, discountDispatchDataLoaded.f259627g, Boxing.boxBoolean(z12), c34469a.C(), c34469a.D()));
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVarA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.d.a(discountDispatchDataLoaded.f259618C, rVar.f16637a ? CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259647b : CreateDiscountDispatchState.DiscountDispatchDataLoaded.AutoDispatchToggleState.f259648c, null, null, null, 254);
                aVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, null, 0L, false, null, null, this.f259880t.v(discountDispatchDataLoaded.f259619D, discountDispatchDataLoaded.f259628h, discountDispatchDataLoaded.f259623c, dVarA, null, discountDispatchDataLoaded.f259638r), false, null, null, false, false, null, null, dVarA, null, null, C34469a.o(discountDispatchDataLoaded.f259623c, discountDispatchDataLoaded.f259644x, discountDispatchDataLoaded.f259619D, dVarA), 939458559));
            }
        }
        return kotlin.G0.f406611a;
    }
}
