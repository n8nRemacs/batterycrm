package com.avito.android.search_suggest.mvi;

import Pp0.InterfaceC14823a;
import Pp0.InterfaceC14824b;
import Y41.p;
import Y41.q;
import com.avito.android.search_suggest.mvi.entity.SearchSuggestInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SearchSuggestActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "LPp0/a;", "Lkotlinx/coroutines/flow/i;", "LPp0/b;", "<name for destructuring parameter 0>", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$2", f = "SearchSuggestActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<Q<? extends InterfaceC14823a, ? extends InterfaceC43160i<? extends InterfaceC14824b>>, Continuation<? super InterfaceC43160i<? extends SearchSuggestInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f264273q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f264274r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Pp0.d> f264275s;

    /* compiled from: SearchSuggestActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LPp0/b;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/search_suggest/mvi/entity/SearchSuggestInternalAction;", "<anonymous>", "(LPp0/b;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$2$2", f = "SearchSuggestActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC14824b, Continuation<? super InterfaceC43160i<? extends SearchSuggestInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f264276q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ c f264277r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Pp0.d> f264278s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, c cVar, Continuation continuation) {
            super(2, continuation);
            this.f264277r = cVar;
            this.f264278s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f264278s, this.f264277r, continuation);
            aVar.f264276q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC14824b interfaceC14824b, Continuation<? super InterfaceC43160i<? extends SearchSuggestInternalAction>> continuation) {
            return ((a) create(interfaceC14824b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f264277r.b((InterfaceC14824b) this.f264276q, this.f264278s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.search_suggest.mvi.SearchSuggestActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "SearchSuggestActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.search_suggest.mvi.b$b, reason: collision with other inner class name */
    public static final class C7888b extends SuspendLambda implements q<InterfaceC43172j<? super SearchSuggestInternalAction>, InterfaceC14824b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f264279q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f264280r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f264281s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ c f264282t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f264283u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7888b(Y41.a aVar, c cVar, Continuation continuation) {
            super(3, continuation);
            this.f264282t = cVar;
            this.f264283u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super SearchSuggestInternalAction> interfaceC43172j, InterfaceC14824b interfaceC14824b, Continuation<? super G0> continuation) {
            C7888b c7888b = new C7888b(this.f264283u, this.f264282t, continuation);
            c7888b.f264280r = interfaceC43172j;
            c7888b.f264281s = interfaceC14824b;
            return c7888b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f264279q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f264280r;
                InterfaceC43160i<SearchSuggestInternalAction> interfaceC43160iC = this.f264282t.b((InterfaceC14824b) this.f264281s, (Pp0.d) this.f264283u.invoke());
                this.f264279q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Y41.a aVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.f264274r = cVar;
        this.f264275s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f264275s, this.f264274r, continuation);
        bVar.f264273q = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends InterfaceC14823a, ? extends InterfaceC43160i<? extends InterfaceC14824b>> q12, Continuation<? super InterfaceC43160i<? extends SearchSuggestInternalAction>> continuation) {
        return ((b) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f264273q;
        InterfaceC14823a interfaceC14823a = (InterfaceC14823a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC14823a instanceof InterfaceC14823a.b;
        Y41.a<Pp0.d> aVar = this.f264275s;
        c cVar = this.f264274r;
        if (z12) {
            return C43175k.Y(interfaceC43160i, new C7888b(aVar, cVar, null));
        }
        if (interfaceC14823a instanceof InterfaceC14823a.C0868a) {
            return C43175k.C(new a(aVar, cVar, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
