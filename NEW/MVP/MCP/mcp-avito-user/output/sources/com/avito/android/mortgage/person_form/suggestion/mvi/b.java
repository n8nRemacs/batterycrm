package com.avito.android.mortgage.person_form.suggestion.mvi;

import H00.a;
import Y41.p;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SuggestionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.suggestion.mvi.SuggestionActor$process$1", f = "SuggestionActor.kt", i = {0, 0}, l = {33, 36}, m = "invokeSuspend", n = {"$this$channelFlow", "suggest"}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
final class b extends SuspendLambda implements p<I0<? super SuggestionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public SuggestionContainer f201423q;

    /* renamed from: r, reason: collision with root package name */
    public int f201424r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f201425s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H00.a f201426t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H00.c f201427u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.mortgage.person_form.suggestion.mvi.a f201428v;

    /* compiled from: SuggestionActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.suggestion.mvi.SuggestionActor$process$1$1", f = "SuggestionActor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201429q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mortgage.person_form.suggestion.mvi.a f201430r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ H00.c f201431s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SuggestionContainer<? extends Suggestion> f201432t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ I0<SuggestionInternalAction> f201433u;

        /* compiled from: SuggestionActor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.person_form.suggestion.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C5969a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I0<SuggestionInternalAction> f201434b;

            /* JADX WARN: Multi-variable type inference failed */
            public C5969a(I0<? super SuggestionInternalAction> i02) {
                this.f201434b = i02;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Object objSend = this.f201434b.send((SuggestionInternalAction) obj, continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.android.mortgage.person_form.suggestion.mvi.a aVar, H00.c cVar, SuggestionContainer<? extends Suggestion> suggestionContainer, I0<? super SuggestionInternalAction> i02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f201430r = aVar;
            this.f201431s = cVar;
            this.f201432t = suggestionContainer;
            this.f201433u = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f201430r, this.f201431s, this.f201432t, this.f201433u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201429q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i<SuggestionInternalAction> interfaceC43160iA = this.f201430r.f201420a.a(this.f201431s.f6918f, this.f201432t.getValue());
                C5969a c5969a = new C5969a(this.f201433u);
                this.f201429q = 1;
                if (interfaceC43160iA.collect(c5969a, this) == coroutine_suspended) {
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
    public b(H00.a aVar, H00.c cVar, com.avito.android.mortgage.person_form.suggestion.mvi.a aVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f201426t = aVar;
        this.f201427u = cVar;
        this.f201428v = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f201426t, this.f201427u, this.f201428v, continuation);
        bVar.f201425s = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super SuggestionInternalAction> i02, Continuation<? super G0> continuation) {
        return ((b) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        SuggestionContainer suggestionContainer;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201424r;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i03 = (I0) this.f201425s;
            SuggestionContainer<? extends Suggestion> suggestionContainer2 = ((a.C0392a) this.f201426t).f6908a;
            SuggestionContainer suggestionContainerA = SuggestionContainer.a(suggestionContainer2, null, suggestionContainer2.getValue().concat(" "), 1);
            SuggestionInternalAction.SuggestApplied suggestApplied = new SuggestionInternalAction.SuggestApplied(suggestionContainerA);
            this.f201425s = i03;
            this.f201423q = suggestionContainerA;
            this.f201424r = 1;
            if (i03.send(suggestApplied, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i02 = i03;
            suggestionContainer = suggestionContainerA;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            SuggestionContainer suggestionContainer3 = this.f201423q;
            I0 i04 = (I0) this.f201425s;
            C42729a0.b(obj);
            suggestionContainer = suggestionContainer3;
            i02 = i04;
        }
        if (suggestionContainer.c0()) {
            H00.c cVar = this.f201427u;
            SuggestionInternalAction.BackClicked backClicked = new SuggestionInternalAction.BackClicked(cVar.f6914b, cVar.f6916d, suggestionContainer);
            this.f201425s = null;
            this.f201423q = null;
            this.f201424r = 2;
            if (i02.send(backClicked, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            com.avito.android.mortgage.person_form.suggestion.mvi.a aVar = this.f201428v;
            N0 n02 = aVar.f201421b;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            aVar.f201421b = C43259k.d(U.a(getF411447c()), null, null, new a(this.f201428v, this.f201427u, suggestionContainer, i02, null), 3);
        }
        return G0.f406611a;
    }
}
