package com.avito.android.sbc.create.mvi;

import Uo0.InterfaceC15546c;
import Uo0.e;
import Vo0.InterfaceC15701b;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToMutableStateFrom$13", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sbc.create.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34489k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259822q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259823r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e.q f259824s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e.q f259825t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259826u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.k$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34489k(com.avito.android.arch.mvi.utils.o oVar, e.q qVar, Continuation continuation, e.q qVar2, C34469a c34469a) {
        super(2, continuation);
        this.f259823r = oVar;
        this.f259824s = qVar;
        this.f259825t = qVar2;
        this.f259826u = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34489k c34489k = new C34489k(this.f259823r, this.f259824s, continuation, this.f259825t, this.f259826u);
        c34489k.f259822q = obj;
        return c34489k;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34489k) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded;
        CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar;
        Object next;
        InterfaceC15701b interfaceC15701bA;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259822q;
        o.a aVar = this.f259823r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) aVar.getValue();
        if ((createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) && (dVar = (discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState).f259618C) != null) {
            Iterator it = dVar.f259665b.f259663a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC15546c) next).getF16684a()) {
                    break;
                }
            }
            InterfaceC15546c interfaceC15546c = (InterfaceC15546c) next;
            e.q qVar = this.f259825t;
            if (interfaceC15546c == null || qVar.f16636a != interfaceC15546c.getF16685b()) {
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar2 = discountDispatchDataLoaded.f259618C;
                ArrayList<InterfaceC15546c> arrayList = dVar2.f259665b.f259663a;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                for (InterfaceC15546c interfaceC15546c2 : arrayList) {
                    if (interfaceC15546c2 instanceof InterfaceC15546c.a) {
                        InterfaceC15546c.a aVar2 = (InterfaceC15546c.a) interfaceC15546c2;
                        ((InterfaceC15546c.a) interfaceC15546c2).getClass();
                        boolean z12 = -1 == qVar.f16636a;
                        aVar2.getClass();
                        interfaceC15701bA = new InterfaceC15546c.a(z12);
                    } else {
                        if (!(interfaceC15546c2 instanceof InterfaceC15546c.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC15701bA = InterfaceC15546c.b.a((InterfaceC15546c.b) interfaceC15546c2, ((InterfaceC15546c.b) interfaceC15546c2).f16604b == qVar.f16636a);
                    }
                    arrayList2.add(interfaceC15701bA);
                }
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.c cVar = new CreateDiscountDispatchState.DiscountDispatchDataLoaded.c(arrayList2);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.b bVar = dVar2.f259666c;
                this.f259826u.getClass();
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.b bVarS = C34469a.s(bVar, cVar);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.a aVar3 = dVar2.f259667d;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar = discountDispatchDataLoaded.f259623c;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVarA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.d.a(discountDispatchDataLoaded.f259618C, null, cVar, bVarS, this.f259826u.r(cVar, bVarS, aVar3, iVar.getF259736d(), discountDispatchDataLoaded.f259627g, discountDispatchDataLoaded.f259619D), 241);
                aVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, null, 0L, false, null, null, this.f259826u.v(discountDispatchDataLoaded.f259619D, discountDispatchDataLoaded.f259628h, discountDispatchDataLoaded.f259623c, dVarA, null, discountDispatchDataLoaded.f259638r), false, null, null, false, false, null, null, dVarA, null, null, C34469a.o(iVar, discountDispatchDataLoaded.f259644x, discountDispatchDataLoaded.f259619D, dVarA), 939458559));
            }
        }
        return kotlin.G0.f406611a;
    }
}
