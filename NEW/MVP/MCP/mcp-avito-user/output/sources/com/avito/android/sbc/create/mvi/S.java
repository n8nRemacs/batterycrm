package com.avito.android.sbc.create.mvi;

import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43206u1;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$observeFeatureStateForAnalytics$1", f = "CreateDiscountDispatchActor.kt", i = {}, l = {3123}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class S extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259492q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34469a f259493r;

    /* compiled from: CreateDiscountDispatchActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/sbc/create/mvi/entity/CreateDiscountDispatchState;", "prevState", "newState"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$observeFeatureStateForAnalytics$1$1", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<CreateDiscountDispatchState, CreateDiscountDispatchState, Continuation<? super CreateDiscountDispatchState>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ CreateDiscountDispatchState f259494q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ CreateDiscountDispatchState f259495r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C34469a f259496s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34469a c34469a, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f259496s = c34469a;
        }

        @Override // Y41.q
        public final Object invoke(CreateDiscountDispatchState createDiscountDispatchState, CreateDiscountDispatchState createDiscountDispatchState2, Continuation<? super CreateDiscountDispatchState> continuation) {
            a aVar = new a(this.f259496s, continuation);
            aVar.f259494q = createDiscountDispatchState;
            aVar.f259495r = createDiscountDispatchState2;
            return aVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String str;
            boolean z12;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.a aVar;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar2;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.a aVar2;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar3;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.a aVar3;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.d dVar4;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.a aVar4;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            CreateDiscountDispatchState createDiscountDispatchState = this.f259494q;
            CreateDiscountDispatchState createDiscountDispatchState2 = this.f259495r;
            C34469a c34469a = this.f259496s;
            c34469a.getClass();
            String str2 = null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded = createDiscountDispatchState instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded discountDispatchDataLoaded2 = createDiscountDispatchState2 instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded) createDiscountDispatchState2 : null;
            boolean z13 = true;
            boolean z14 = (discountDispatchDataLoaded == null || !discountDispatchDataLoaded.f259630j) && discountDispatchDataLoaded2 != null && discountDispatchDataLoaded2.f259630j;
            boolean z15 = (discountDispatchDataLoaded == null || !discountDispatchDataLoaded.f259630j || discountDispatchDataLoaded2 == null || !discountDispatchDataLoaded2.f259630j || kotlin.jvm.internal.L.f(discountDispatchDataLoaded.f259631k, discountDispatchDataLoaded2.f259631k)) ? false : true;
            if (z14 || z15) {
                str = discountDispatchDataLoaded2 != null ? discountDispatchDataLoaded2.f259631k : null;
                z12 = true;
            } else {
                str = null;
                z12 = false;
            }
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar = discountDispatchDataLoaded != null ? discountDispatchDataLoaded.f259644x : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d dVar5 = jVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar : null;
            String str3 = dVar5 != null ? dVar5.f259756i : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.j jVar2 = discountDispatchDataLoaded2 != null ? discountDispatchDataLoaded2.f259644x : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d dVar6 = jVar2 instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded.j.d) jVar2 : null;
            String str4 = dVar6 != null ? dVar6.f259756i : null;
            boolean z16 = str3 == null && str4 != null;
            boolean z17 = (str3 == null || str4 == null || str3.equals(str4)) ? false : true;
            if (z16 || z17) {
                z12 = true;
                str = str4;
            }
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar = discountDispatchDataLoaded != null ? discountDispatchDataLoaded.f259623c : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b bVar = iVar instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) iVar : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar2 = discountDispatchDataLoaded2 != null ? discountDispatchDataLoaded2.f259623c : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b bVar2 = iVar2 instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.b) iVar2 : null;
            boolean z18 = (bVar == null || !bVar.f259715f) && bVar2 != null && bVar2.f259715f;
            boolean z19 = (bVar == null || !bVar.f259715f || bVar2 == null || !bVar2.f259715f || kotlin.jvm.internal.L.f(bVar.f259716g, bVar2.f259716g)) ? false : true;
            if (z18 || z19) {
                str = bVar2 != null ? bVar2.f259716g : null;
                z12 = true;
            }
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar3 = discountDispatchDataLoaded != null ? discountDispatchDataLoaded.f259623c : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a aVar5 = iVar3 instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) iVar3 : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i iVar4 = discountDispatchDataLoaded2 != null ? discountDispatchDataLoaded2.f259623c : null;
            CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a aVar6 = iVar4 instanceof CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a ? (CreateDiscountDispatchState.DiscountDispatchDataLoaded.i.a) iVar4 : null;
            boolean z22 = (aVar5 == null || !aVar5.f259703f) && aVar6 != null && aVar6.f259703f;
            boolean z23 = (aVar5 == null || !aVar5.f259703f || aVar6 == null || !aVar6.f259703f || kotlin.jvm.internal.L.f(aVar5.f259704g, aVar6.f259704g)) ? false : true;
            if (z22 || z23) {
                str = aVar6 != null ? aVar6.f259704g : null;
                z12 = true;
            }
            Boolean boolValueOf = (discountDispatchDataLoaded == null || (dVar4 = discountDispatchDataLoaded.f259618C) == null || (aVar4 = dVar4.f259667d) == null) ? null : Boolean.valueOf(aVar4.f259658g);
            Boolean boolValueOf2 = (discountDispatchDataLoaded2 == null || (dVar3 = discountDispatchDataLoaded2.f259618C) == null || (aVar3 = dVar3.f259667d) == null) ? null : Boolean.valueOf(aVar3.f259658g);
            String str5 = (discountDispatchDataLoaded == null || (dVar2 = discountDispatchDataLoaded.f259618C) == null || (aVar2 = dVar2.f259667d) == null) ? null : aVar2.f259659h;
            if (discountDispatchDataLoaded2 != null && (dVar = discountDispatchDataLoaded2.f259618C) != null && (aVar = dVar.f259667d) != null) {
                str2 = aVar.f259659h;
            }
            Boolean bool = Boolean.TRUE;
            boolean z24 = !kotlin.jvm.internal.L.f(boolValueOf, bool) && kotlin.jvm.internal.L.f(boolValueOf2, bool);
            boolean z25 = kotlin.jvm.internal.L.f(boolValueOf, bool) && kotlin.jvm.internal.L.f(boolValueOf2, bool) && !kotlin.jvm.internal.L.f(str5, str2);
            if (z24 || z25) {
                str = str2;
            } else {
                z13 = z12;
            }
            if (z13 && discountDispatchDataLoaded2 != null) {
                c34469a.O(discountDispatchDataLoaded2, str, false);
            }
            return createDiscountDispatchState2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C34469a c34469a, Continuation<? super S> continuation) {
        super(2, continuation);
        this.f259493r = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new S(this.f259493r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((S) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259492q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C34469a c34469a = this.f259493r;
            C43206u1 c43206u1 = new C43206u1(c34469a.f259556q, new a(c34469a, null));
            this.f259492q = 1;
            if (C43175k.i(c43206u1, this) == coroutine_suspended) {
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
