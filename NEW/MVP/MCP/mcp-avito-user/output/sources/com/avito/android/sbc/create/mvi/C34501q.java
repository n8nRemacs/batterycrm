package com.avito.android.sbc.create.mvi;

import Uo0.e;
import android.content.res.Resources;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.sbc.create.model.Offer;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import java.time.LocalDate;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handle$$inlined$flowWithAccessToMutableStateFrom$6", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.sbc.create.mvi.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34501q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259859q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259860r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e.m f259861s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34469a f259862t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e.m f259863u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.sbc.create.mvi.q$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34501q(com.avito.android.arch.mvi.utils.o oVar, e.m mVar, Continuation continuation, C34469a c34469a, e.m mVar2) {
        super(2, continuation);
        this.f259860r = oVar;
        this.f259861s = mVar;
        this.f259862t = c34469a;
        this.f259863u = mVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34501q c34501q = new C34501q(this.f259860r, this.f259861s, continuation, this.f259862t, this.f259863u);
        c34501q.f259859q = obj;
        return c34501q;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C34501q) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Resources.NotFoundException {
        e.m mVar;
        Object next;
        boolean z12;
        boolean z13;
        LocalDate localDate;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259859q;
        o.a aVar = this.f259860r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        CreateDiscountDispatchState createDiscountDispatchState = (CreateDiscountDispatchState) aVar.getValue();
        if (createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded) {
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState;
            Iterator it = discountDispatchDataLoaded.f259619D.f259692h.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                mVar = this.f259863u;
                if (!zHasNext) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((Offer) next).getF259204b(), mVar.f16632a)) {
                    break;
                }
            }
            Offer offer = (Offer) next;
            C34469a c34469a = this.f259862t;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVar = discountDispatchDataLoaded.f259619D;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVarN = offer != null ? c34469a.N(offer, hVar) : null;
            if (iVarN != null && !iVarN.equals(discountDispatchDataLoaded.f259623c)) {
                boolean z14 = iVarN instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b;
                String str = discountDispatchDataLoaded.f259641u;
                String str2 = discountDispatchDataLoaded.f259640t;
                if (z14 && !C43066x.K(str2)) {
                    z12 = true;
                    z13 = false;
                } else if (!(iVarN instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) || C43066x.K(str)) {
                    z12 = false;
                    z13 = false;
                } else {
                    z13 = true;
                    z12 = false;
                }
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.a aVar2 = CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.a.f259739a;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar = discountDispatchDataLoaded.f259644x;
                if (kotlin.jvm.internal.L.f(jVar, aVar2)) {
                    localDate = null;
                } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.b) {
                    localDate = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.b) jVar).f259740a;
                } else if (jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) {
                    localDate = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.c) jVar).f259742a;
                } else {
                    if (!(jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    localDate = ((CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar).f259748a;
                }
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVarW = c34469a.w(iVarN, localDate);
                String strB = this.f259862t.B(discountDispatchDataLoaded.f259635o, iVarN, discountDispatchDataLoaded.f259640t, discountDispatchDataLoaded.f259641u, jVarW);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.h hVarA = CreateDiscountDispatchState.DiscountDispatchDataLoaded.h.a(hVar, -1, false, 7679);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.e eVarT = C34469a.t(c34469a, hVarA, jVarW, 12);
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar = discountDispatchDataLoaded.f259618C;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVarQ = dVar == null ? c34469a.q(discountDispatchDataLoaded.f259627g, iVarN, hVarA) : dVar;
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.f fVarO = C34469a.o(iVarN, jVarW, hVarA, dVarQ);
                String strA = c34469a.f259549j.a();
                Boolean boolBoxBoolean = hVar.f259687c ? Boxing.boxBoolean(com.avito.android.sbc.create.mvi.entity.a.a(dVar)) : null;
                c34469a.f259546g.c(new Oo0.u(strA, c34469a.D(), c34469a.f259554o, Boxing.boxLong(discountDispatchDataLoaded.f259622b), boolBoxBoolean, discountDispatchDataLoaded.f259627g, mVar.f16632a, c34469a.C()));
                CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar2 = dVarQ;
                aVar.setValue(CreateDiscountDispatchState.DiscountDispatchDataLoaded.a(discountDispatchDataLoaded, iVarN, 0L, false, null, strB, this.f259862t.v(hVarA, discountDispatchDataLoaded.f259628h, iVarN, dVar2, null, discountDispatchDataLoaded.f259638r), false, null, null, false, false, jVarW, null, dVar2, hVarA, eVarT, fVarO, 129941501));
                if (z12) {
                    C34469a.j(c34469a, aVar, str2);
                } else if (z13) {
                    C34469a.i(c34469a, aVar, str);
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
