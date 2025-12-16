package com.avito.android.mortgage_calculator.internal.mvi;

import com.avito.android.mortgage_calculator.internal.mvi.C32739a;
import com.avito.android.mortgage_calculator.internal.mvi.entity.CalculatorInternalAction;
import com.avito.android.mortgage_calculator.internal.mvi.entity.h;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CalculatorActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/mortgage_calculator/internal/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$2", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_calculator.internal.mvi.s, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32757s extends SuspendLambda implements Y41.p<kotlin.Q<? extends C32739a.InterfaceC6093a, ? extends InterfaceC43160i<? extends com.avito.android.mortgage_calculator.internal.mvi.entity.a>>, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f204700q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32739a f204701r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<E10.c> f204702s;

    /* compiled from: CalculatorActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "<anonymous>", "(Lcom/avito/android/mortgage_calculator/internal/mvi/entity/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$2$1", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.s$a */
    public static final class a extends SuspendLambda implements Y41.p<com.avito.android.mortgage_calculator.internal.mvi.entity.a, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f204703q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C32739a f204704r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<E10.c> f204705s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C32739a c32739a, Y41.a<E10.c> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f204704r = c32739a;
            this.f204705s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f204704r, this.f204705s, continuation);
            aVar.f204703q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.mortgage_calculator.internal.mvi.entity.a aVar, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.mortgage_calculator.internal.mvi.entity.a aVar = (com.avito.android.mortgage_calculator.internal.mvi.entity.a) this.f204703q;
            boolean z12 = aVar instanceof com.avito.android.mortgage_calculator.internal.mvi.entity.b;
            C32739a c32739a = this.f204704r;
            if (z12) {
                return c32739a.b((com.avito.android.mortgage_calculator.internal.mvi.entity.b) aVar, this.f204705s.invoke());
            }
            if (!(aVar instanceof com.avito.android.mortgage_calculator.internal.mvi.entity.h)) {
                return C43175k.w();
            }
            com.avito.android.mortgage_calculator.internal.mvi.entity.h hVar = (com.avito.android.mortgage_calculator.internal.mvi.entity.h) aVar;
            if (hVar instanceof h.a) {
                return new C43210w(new CalculatorInternalAction.UpdatePrivateState(((h.a) hVar).f204609b));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CalculatorActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/mortgage_calculator/internal/mvi/entity/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/mortgage_calculator/internal/mvi/entity/CalculatorInternalAction;", "<anonymous>", "(Lcom/avito/android/mortgage_calculator/internal/mvi/entity/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.CalculatorActor$process$2$2", f = "CalculatorActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage_calculator.internal.mvi.s$b */
    public static final class b extends SuspendLambda implements Y41.p<com.avito.android.mortgage_calculator.internal.mvi.entity.a, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f204706q;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f204706q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(com.avito.android.mortgage_calculator.internal.mvi.entity.a aVar, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>> continuation) {
            return ((b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.mortgage_calculator.internal.mvi.entity.a aVar = (com.avito.android.mortgage_calculator.internal.mvi.entity.a) this.f204706q;
            return aVar instanceof CalculatorInternalAction ? new C43210w(aVar) : C43175k.w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32757s(C32739a c32739a, Y41.a<E10.c> aVar, Continuation<? super C32757s> continuation) {
        super(2, continuation);
        this.f204701r = c32739a;
        this.f204702s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32757s c32757s = new C32757s(this.f204701r, this.f204702s, continuation);
        c32757s.f204700q = obj;
        return c32757s;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends C32739a.InterfaceC6093a, ? extends InterfaceC43160i<? extends com.avito.android.mortgage_calculator.internal.mvi.entity.a>> q12, Continuation<? super InterfaceC43160i<? extends CalculatorInternalAction>> continuation) {
        return ((C32757s) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f204700q;
        C32739a.InterfaceC6093a interfaceC6093a = (C32739a.InterfaceC6093a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        if (interfaceC6093a instanceof C32739a.InterfaceC6093a.b) {
            return C43175k.B(new a(this.f204701r, this.f204702s, null), interfaceC43160i);
        }
        if (interfaceC6093a instanceof C32739a.InterfaceC6093a.C6094a) {
            return C43175k.C(new b(2, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
