package com.avito.android.profile.user_profile.cards.wallet;

import Sa0.C15167a;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.account.E;
import com.avito.android.clientEventBus.ConnectionState;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse;
import com.avito.android.util.R0;
import io.reactivex.rxjava3.internal.operators.observable.U;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import mx0.InterfaceC44149a;

/* compiled from: AvitoFinanceItemDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/wallet/f;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/profile/user_profile/cards/wallet/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends M0 implements com.avito.android.profile.user_profile.cards.wallet.d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34401z0> f225648E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final N90.p f225649J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C43189o1 f225650K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C43189o1 f225651L;

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.wallet.AvitoFinanceItemViewModel$special$$inlined$flatMapLatest$1", f = "AvitoFinanceItemDelegate.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super AvitoFinanceResponse>, Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f225652q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f225653r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f225654s;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super AvitoFinanceResponse> interfaceC43172j, Boolean bool, Continuation<? super G0> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f225653r = interfaceC43172j;
            aVar.f225654s = bool;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f225652q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f225653r;
                InterfaceC43160i c43210w = ((Boolean) this.f225654s).booleanValue() ? f.this.f225650K : new C43210w(null);
                this.f225652q = 1;
                if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
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

    /* compiled from: ClientEventBuses.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx0/a;", "EventT", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/clientEventBus/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.clientEventBus.a f225656b;

        public b(com.avito.android.clientEventBus.a aVar) {
            this.f225656b = aVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return g.f225771a[((ConnectionState) obj).ordinal()] == 1 ? this.f225656b.c(C15167a.class).l0(h.f225772b) : U.f403867b;
        }
    }

    /* compiled from: ClientEventBuses.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmx0/a;", "EventT", "Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/clientEventBus/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.clientEventBus.a f225657b;

        public c(com.avito.android.clientEventBus.a aVar) {
            this.f225657b = aVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return i.f225773a[((ConnectionState) obj).ordinal()] == 1 ? this.f225657b.c(Sa0.b.class).l0(j.f225774b) : U.f403867b;
        }
    }

    /* compiled from: AvitoFinanceItemDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmx0/a;", "it", "Lcom/avito/android/remote/model/user_profile/items/AvitoFinanceResponse;", "<anonymous>", "(Lmx0/a;)Lcom/avito/android/remote/model/user_profile/items/AvitoFinanceResponse;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.cards.wallet.AvitoFinanceItemViewModel$updateEvents$1", f = "AvitoFinanceItemDelegate.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC44149a, Continuation<? super AvitoFinanceResponse>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f225658q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return f.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC44149a interfaceC44149a, Continuation<? super AvitoFinanceResponse> continuation) {
            return ((d) create(interfaceC44149a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f225658q;
            if (i12 == 0) {
                C42729a0.b(obj);
                this.f225658q = 1;
                obj = f.this.E5(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.clientEventBus.a aVar, @Y61.k h31.e<InterfaceC34401z0> eVar, @Y61.k R0 r02, @Y61.k E e12, @Y61.k N90.p pVar) {
        this.f225648E = eVar;
        this.f225649J = pVar;
        this.f225650K = new C43189o1(C43175k.L(new d(null), C43175k.N(y.a(aVar.a().y0(new b(aVar))), y.a(aVar.a().y0(new c(aVar))))));
        kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(C43175k.r(y.a(e12.g())), new a(null));
        C43238h c43238hF = kotlinx.coroutines.U.f(N0.a(this), r02.a());
        i2.f411430a.getClass();
        this.f225651L = new C43189o1(C43175k.S(lVarY, c43238hF, i2.a.f411433c, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.profile.user_profile.cards.wallet.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E5(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.profile.user_profile.cards.wallet.e
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.profile.user_profile.cards.wallet.e r0 = (com.avito.android.profile.user_profile.cards.wallet.e) r0
            int r1 = r0.f225647s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225647s = r1
            goto L18
        L13:
            com.avito.android.profile.user_profile.cards.wallet.e r0 = new com.avito.android.profile.user_profile.cards.wallet.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f225645q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f225647s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            h31.e<com.avito.android.remote.z0> r5 = r4.f225648E
            java.lang.Object r5 = r5.get()
            com.avito.android.remote.z0 r5 = (com.avito.android.remote.InterfaceC34401z0) r5
            N90.p r2 = r4.f225649J
            java.lang.String r2 = r2.f11258a
            r0.f225647s = r3
            java.lang.Object r5 = r5.j(r2, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r0 == 0) goto L58
            com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
            java.lang.Object r5 = r5.getResult()
            com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse r5 = (com.avito.android.remote.model.user_profile.items.AvitoFinanceResponse) r5
            return r5
        L58:
            boolean r0 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L75
            com.avito.android.remote.model.TypedResult$Error r5 = (com.avito.android.remote.model.TypedResult.Error) r5
            com.avito.android.remote.error.ApiError r0 = r5.getError()
            java.lang.Throwable r5 = r5.getCause()
            com.avito.android.util.ApiException r5 = com.avito.android.util.C35936s.a(r0, r5)
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a
            java.lang.String r1 = "DEFAULT_TAG"
            java.lang.String r2 = "Update Avito Finance error"
            r0.a(r1, r2, r5)
            r5 = 0
            return r5
        L75:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.cards.wallet.f.E5(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.profile.user_profile.cards.wallet.d
    @Y61.k
    /* renamed from: e5, reason: from getter */
    public final C43189o1 getF225651L() {
        return this.f225651L;
    }
}
