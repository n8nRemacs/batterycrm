package com.avito.android.mortgage.person_form.suggestion.mvi;

import H00.a;
import Y41.p;
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
@DebugMetadata(c = "com.avito.android.mortgage.person_form.suggestion.mvi.SuggestionActor$process$2", f = "SuggestionActor.kt", i = {0}, l = {68}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements p<I0<? super SuggestionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f201435q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f201436r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H00.a f201437s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.mortgage.person_form.suggestion.mvi.a f201438t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ H00.c f201439u;

    /* compiled from: SuggestionActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.suggestion.mvi.SuggestionActor$process$2$1", f = "SuggestionActor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f201440q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.mortgage.person_form.suggestion.mvi.a f201441r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ H00.c f201442s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ H00.a f201443t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ I0<SuggestionInternalAction> f201444u;

        /* compiled from: SuggestionActor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.person_form.suggestion.mvi.c$a$a, reason: collision with other inner class name */
        public static final class C5970a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I0<SuggestionInternalAction> f201445b;

            /* JADX WARN: Multi-variable type inference failed */
            public C5970a(I0<? super SuggestionInternalAction> i02) {
                this.f201445b = i02;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Object objSend = this.f201445b.send((SuggestionInternalAction) obj, continuation);
                return objSend == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.android.mortgage.person_form.suggestion.mvi.a aVar, H00.c cVar, H00.a aVar2, I0<? super SuggestionInternalAction> i02, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f201441r = aVar;
            this.f201442s = cVar;
            this.f201443t = aVar2;
            this.f201444u = i02;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f201441r, this.f201442s, this.f201443t, this.f201444u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f201440q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i<SuggestionInternalAction> interfaceC43160iA = this.f201441r.f201420a.a(this.f201442s.f6918f, ((a.d) this.f201443t).f6911a);
                C5970a c5970a = new C5970a(this.f201444u);
                this.f201440q = 1;
                if (interfaceC43160iA.collect(c5970a, this) == coroutine_suspended) {
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
    public c(H00.a aVar, H00.c cVar, com.avito.android.mortgage.person_form.suggestion.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f201437s = aVar;
        this.f201438t = aVar2;
        this.f201439u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        com.avito.android.mortgage.person_form.suggestion.mvi.a aVar = this.f201438t;
        c cVar = new c(this.f201437s, this.f201439u, aVar, continuation);
        cVar.f201436r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super SuggestionInternalAction> i02, Continuation<? super G0> continuation) {
        return ((c) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        I0 i02;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f201435q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i03 = (I0) this.f201436r;
            SuggestionInternalAction.ValueChanged valueChanged = new SuggestionInternalAction.ValueChanged(((a.d) this.f201437s).f6911a);
            this.f201436r = i03;
            this.f201435q = 1;
            if (i03.send(valueChanged, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i02 = i03;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            I0 i04 = (I0) this.f201436r;
            C42729a0.b(obj);
            i02 = i04;
        }
        com.avito.android.mortgage.person_form.suggestion.mvi.a aVar = this.f201438t;
        N0 n02 = aVar.f201421b;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        aVar.f201421b = C43259k.d(U.a(getF411447c()), null, null, new a(this.f201438t, this.f201439u, this.f201437s, i02, null), 3);
        return G0.f406611a;
    }
}
