package com.avito.android.sbc.create.mvi;

import Uo0.e;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import java.time.LocalDate;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToMutableStateFrom$2", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sbc.create.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34493m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259835q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259836r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e.v f259837s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34469a f259838t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e.v f259839u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.m$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34493m(com.avito.android.arch.mvi.utils.o oVar, e.v vVar, Continuation continuation, C34469a c34469a, e.v vVar2) {
        super(2, continuation);
        this.f259836r = oVar;
        this.f259837s = vVar;
        this.f259838t = c34469a;
        this.f259839u = vVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34493m c34493m = new C34493m(this.f259836r, this.f259837s, continuation, this.f259838t, this.f259839u);
        c34493m.f259835q = obj;
        return c34493m;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34493m) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259835q;
        o.a aVar = this.f259836r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) aVar.getValue();
        if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar = discountDispatchDataLoaded.f259644x;
            if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) {
                C34469a c34469a = this.f259838t;
                com.avito.android.sbc.utils.g gVar = c34469a.f259544e;
                e.v vVar = this.f259839u;
                LocalDate localDate = vVar.f16641a;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c cVar = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) jVar;
                LocalDate localDate2 = cVar.f259745d;
                LocalDate localDate3 = cVar.f259746e;
                gVar.getClass();
                if (localDate.compareTo((Object) localDate2) >= 0 && localDate.compareTo((Object) localDate3) <= 0) {
                    LocalDate localDate4 = vVar.f16641a;
                    String strG = c34469a.G(localDate4);
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c cVar2 = (CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) discountDispatchDataLoaded.f259644x;
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c cVar3 = new CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c(localDate4, c34469a.f259544e.d(localDate4), cVar2.f259744c, cVar2.f259745d, cVar2.f259746e, strG);
                    CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVar = discountDispatchDataLoaded.f259619D;
                    aVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, null, 0L, false, null, this.f259838t.B(discountDispatchDataLoaded.f259635o, discountDispatchDataLoaded.f259623c, discountDispatchDataLoaded.f259640t, discountDispatchDataLoaded.f259641u, cVar3), null, false, null, null, false, false, cVar3, null, null, null, C34469a.t(c34469a, hVar, cVar3, 12), C34469a.o(discountDispatchDataLoaded.f259623c, cVar3, hVar, discountDispatchDataLoaded.f259618C), 532660223));
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
