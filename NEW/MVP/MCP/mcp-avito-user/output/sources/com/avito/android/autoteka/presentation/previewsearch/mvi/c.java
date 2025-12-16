package com.avito.android.autoteka.presentation.previewsearch.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.autoteka.presentation.previewsearch.mvi.a;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchInternalAction;
import com.avito.android.autoteka.presentation.previewsearch.mvi.entity.AutotekaPreviewSearchState;
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

/* compiled from: AutotekaPreviewSearchActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "<name for destructuring parameter 0>", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$process$7", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements p<Q<? extends a.InterfaceC2914a, ? extends InterfaceC43160i<? extends AutotekaPreviewSearchAction>>, Continuation<? super InterfaceC43160i<? extends AutotekaPreviewSearchInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f97579q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.autoteka.presentation.previewsearch.mvi.a f97580r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<AutotekaPreviewSearchState> f97581s;

    /* compiled from: AutotekaPreviewSearchActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchInternalAction;", "<anonymous>", "(Lcom/avito/android/autoteka/presentation/previewsearch/mvi/entity/AutotekaPreviewSearchAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$process$7$2", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<AutotekaPreviewSearchAction, Continuation<? super InterfaceC43160i<? extends AutotekaPreviewSearchInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f97582q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.autoteka.presentation.previewsearch.mvi.a f97583r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<AutotekaPreviewSearchState> f97584s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f97583r = aVar2;
            this.f97584s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f97584s, this.f97583r, continuation);
            aVar.f97582q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(AutotekaPreviewSearchAction autotekaPreviewSearchAction, Continuation<? super InterfaceC43160i<? extends AutotekaPreviewSearchInternalAction>> continuation) {
            return ((a) create(autotekaPreviewSearchAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f97583r.b((AutotekaPreviewSearchAction) this.f97582q, this.f97584s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.previewsearch.mvi.AutotekaPreviewSearchActor$process$7$invokeSuspend$$inlined$flatMapLatest$1", f = "AutotekaPreviewSearchActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super AutotekaPreviewSearchInternalAction>, AutotekaPreviewSearchAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97585q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f97586r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f97587s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.autoteka.presentation.previewsearch.mvi.a f97588t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97589u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar2, Continuation continuation) {
            super(3, continuation);
            this.f97588t = aVar2;
            this.f97589u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AutotekaPreviewSearchInternalAction> interfaceC43172j, AutotekaPreviewSearchAction autotekaPreviewSearchAction, Continuation<? super G0> continuation) {
            b bVar = new b(this.f97589u, this.f97588t, continuation);
            bVar.f97586r = interfaceC43172j;
            bVar.f97587s = autotekaPreviewSearchAction;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97585q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f97586r;
                InterfaceC43160i<AutotekaPreviewSearchInternalAction> interfaceC43160iB = this.f97588t.b((AutotekaPreviewSearchAction) this.f97587s, (AutotekaPreviewSearchState) this.f97589u.invoke());
                this.f97585q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
    public c(Y41.a aVar, com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f97580r = aVar2;
        this.f97581s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f97581s, this.f97580r, continuation);
        cVar.f97579q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends a.InterfaceC2914a, ? extends InterfaceC43160i<? extends AutotekaPreviewSearchAction>> q12, Continuation<? super InterfaceC43160i<? extends AutotekaPreviewSearchInternalAction>> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f97579q;
        a.InterfaceC2914a interfaceC2914a = (a.InterfaceC2914a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC2914a instanceof a.InterfaceC2914a.b;
        Y41.a<AutotekaPreviewSearchState> aVar = this.f97581s;
        com.avito.android.autoteka.presentation.previewsearch.mvi.a aVar2 = this.f97580r;
        if (z12) {
            return C43175k.Y(interfaceC43160i, new b(aVar, aVar2, null));
        }
        if (interfaceC2914a instanceof a.InterfaceC2914a.C2915a) {
            return C43175k.C(new a(aVar, aVar2, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
