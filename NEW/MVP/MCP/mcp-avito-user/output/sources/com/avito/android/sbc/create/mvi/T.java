package com.avito.android.sbc.create.mvi;

import com.avito.android.sbc.create.mvi.C34469a;
import ep0.C40143a;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CreateDiscountDispatchActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$observeRequestsToFetchForecasts$1", f = "CreateDiscountDispatchActor.kt", i = {}, l = {3139}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class T extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259498q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34469a f259499r;

    /* compiled from: CreateDiscountDispatchActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lep0/a;", "forecastResponse", "Lkotlinx/coroutines/flow/i;", "LUo0/f;", "<anonymous>", "(Lep0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$observeRequestsToFetchForecasts$1$1$1", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<C40143a, Continuation<? super InterfaceC43160i<? extends Uo0.f>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f259500q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C34469a f259501r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C34469a.b f259502s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34469a c34469a, C34469a.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f259501r = c34469a;
            this.f259502s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f259501r, this.f259502s, continuation);
            aVar.f259500q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(C40143a c40143a, Continuation<? super InterfaceC43160i<? extends Uo0.f>> continuation) {
            return ((a) create(c40143a, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C40143a c40143a = (C40143a) this.f259500q;
            C34469a c34469a = this.f259501r;
            return C43175k.G(new M(c34469a.f259555p, c34469a, null, this.f259502s, c34469a, c40143a));
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$observeRequestsToFetchForecasts$1$invokeSuspend$$inlined$flatMapLatest$1", f = "CreateDiscountDispatchActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Uo0.f>, C34469a.b, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f259503q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f259504r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f259505s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C34469a f259506t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C34469a c34469a, Continuation continuation) {
            super(3, continuation);
            this.f259506t = c34469a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, C34469a.b bVar, Continuation<? super kotlin.G0> continuation) {
            b bVar2 = new b(this.f259506t, continuation);
            bVar2.f259504r = interfaceC43172j;
            bVar2.f259505s = bVar;
            return bVar2.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f259503q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f259504r;
                C34469a.b bVar = (C34469a.b) this.f259505s;
                C34469a c34469a = this.f259506t;
                c34469a.getClass();
                kotlinx.coroutines.flow.C0 c0B = C43175k.B(new a(c34469a, bVar, null), C43175k.I(c34469a.f259547h.a(), C43175k.G(new C34479f(c34469a, bVar, null))));
                this.f259503q = 1;
                if (C43175k.u(this, c0B, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(C34469a c34469a, Continuation<? super T> continuation) {
        super(2, continuation);
        this.f259499r = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new T(this.f259499r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((T) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259498q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C34469a c34469a = this.f259499r;
            kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(c34469a.f259557r, new b(c34469a, null));
            this.f259498q = 1;
            if (C43175k.i(lVarY, this) == coroutine_suspended) {
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
