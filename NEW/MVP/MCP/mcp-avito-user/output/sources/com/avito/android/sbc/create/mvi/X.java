package com.avito.android.sbc.create.mvi;

import com.avito.android.sbc.create.mvi.C34469a;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/sbc/create/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "LUo0/d;", "<name for destructuring parameter 0>", "LUo0/f;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$process$4", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class X extends SuspendLambda implements Y41.p<kotlin.Q<? extends C34469a.InterfaceC7790a, ? extends InterfaceC43160i<? extends Uo0.d>>, Continuation<? super InterfaceC43160i<? extends Uo0.f>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259519q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C34469a f259520r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<CreateDiscountDispatchState> f259521s;

    /* compiled from: CreateDiscountDispatchActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUo0/d;", "action", "Lkotlinx/coroutines/flow/i;", "LUo0/f;", "<anonymous>", "(LUo0/d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$process$4$1", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Uo0.d, Continuation<? super InterfaceC43160i<? extends Uo0.f>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f259522q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C34469a f259523r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<CreateDiscountDispatchState> f259524s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C34469a c34469a, Y41.a<? extends CreateDiscountDispatchState> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f259523r = c34469a;
            this.f259524s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f259523r, this.f259524s, continuation);
            aVar.f259522q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Uo0.d dVar, Continuation<? super InterfaceC43160i<? extends Uo0.f>> continuation) {
            return ((a) create(dVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Uo0.d dVar = (Uo0.d) this.f259522q;
            if (!(dVar instanceof Uo0.e)) {
                return C43175k.w();
            }
            this.f259524s.invoke();
            return this.f259523r.J((Uo0.e) dVar);
        }
    }

    /* compiled from: CreateDiscountDispatchActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUo0/d;", "action", "Lkotlinx/coroutines/flow/i;", "LUo0/f;", "<anonymous>", "(LUo0/d;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$process$4$2", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<Uo0.d, Continuation<? super InterfaceC43160i<? extends Uo0.f>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f259525q;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f259525q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(Uo0.d dVar, Continuation<? super InterfaceC43160i<? extends Uo0.f>> continuation) {
            return ((b) create(dVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Uo0.d dVar = (Uo0.d) this.f259525q;
            return dVar instanceof Uo0.f ? new C43210w(dVar) : C43175k.w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public X(C34469a c34469a, Y41.a<? extends CreateDiscountDispatchState> aVar, Continuation<? super X> continuation) {
        super(2, continuation);
        this.f259520r = c34469a;
        this.f259521s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        X x12 = new X(this.f259520r, this.f259521s, continuation);
        x12.f259519q = obj;
        return x12;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends C34469a.InterfaceC7790a, ? extends InterfaceC43160i<? extends Uo0.d>> q12, Continuation<? super InterfaceC43160i<? extends Uo0.f>> continuation) {
        return ((X) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f259519q;
        C34469a.InterfaceC7790a interfaceC7790a = (C34469a.InterfaceC7790a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        if (interfaceC7790a instanceof C34469a.InterfaceC7790a.b) {
            return C43175k.B(new a(this.f259520r, this.f259521s, null), interfaceC43160i);
        }
        if (interfaceC7790a instanceof C34469a.InterfaceC7790a.C7791a) {
            return C43175k.B(new b(2, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
