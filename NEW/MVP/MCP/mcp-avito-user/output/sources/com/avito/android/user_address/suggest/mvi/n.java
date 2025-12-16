package com.avito.android.user_address.suggest.mvi;

import com.avito.android.user_address.suggest.mvi.f;
import com.avito.android.user_address.suggest.mvi.g;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: UserAddressSuggestMviActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/user_address/suggest/mvi/g$a;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_address/suggest/mvi/f;", "<name for destructuring parameter 0>", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviActor$process$2", f = "UserAddressSuggestMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class n extends SuspendLambda implements Y41.p<Q<? extends g.a, ? extends InterfaceC43160i<? extends f>>, Continuation<? super InterfaceC43160i<? extends UserAddressSuggestMviInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f308134q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f308135r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<UserAddressSuggestMviState> f308136s;

    /* compiled from: UserAddressSuggestMviActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/f;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "<anonymous>", "(Lcom/avito/android/user_address/suggest/mvi/f;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviActor$process$2$1", f = "UserAddressSuggestMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<f, Continuation<? super InterfaceC43160i<? extends UserAddressSuggestMviInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f308137q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ g f308138r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<UserAddressSuggestMviState> f308139s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(g gVar, Y41.a<? extends UserAddressSuggestMviState> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f308138r = gVar;
            this.f308139s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f308138r, this.f308139s, continuation);
            aVar.f308137q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(f fVar, Continuation<? super InterfaceC43160i<? extends UserAddressSuggestMviInternalAction>> continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f fVar = (f) this.f308137q;
            g gVar = this.f308138r;
            gVar.f308112c = (f.d) fVar;
            return gVar.b(fVar, this.f308139s.invoke());
        }
    }

    /* compiled from: UserAddressSuggestMviActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/f;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "<anonymous>", "(Lcom/avito/android/user_address/suggest/mvi/f;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviActor$process$2$2", f = "UserAddressSuggestMviActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<f, Continuation<? super InterfaceC43160i<? extends UserAddressSuggestMviInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f308140q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ g f308141r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<UserAddressSuggestMviState> f308142s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(g gVar, Y41.a<? extends UserAddressSuggestMviState> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f308141r = gVar;
            this.f308142s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f308141r, this.f308142s, continuation);
            bVar.f308140q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(f fVar, Continuation<? super InterfaceC43160i<? extends UserAddressSuggestMviInternalAction>> continuation) {
            return ((b) create(fVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f308141r.b((f) this.f308140q, this.f308142s.invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(g gVar, Y41.a<? extends UserAddressSuggestMviState> aVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f308135r = gVar;
        this.f308136s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f308135r, this.f308136s, continuation);
        nVar.f308134q = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends g.a, ? extends InterfaceC43160i<? extends f>> q12, Continuation<? super InterfaceC43160i<? extends UserAddressSuggestMviInternalAction>> continuation) {
        return ((n) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f308134q;
        g.a aVar = (g.a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(aVar, g.a.b.f308114a);
        Y41.a<UserAddressSuggestMviState> aVar2 = this.f308136s;
        g gVar = this.f308135r;
        if (zF2) {
            return C43175k.B(new a(gVar, aVar2, null), C43175k.n(C43175k.r(interfaceC43160i), 300L));
        }
        if (L.f(aVar, g.a.C9460a.f308113a)) {
            return C43175k.C(new b(gVar, aVar2, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
