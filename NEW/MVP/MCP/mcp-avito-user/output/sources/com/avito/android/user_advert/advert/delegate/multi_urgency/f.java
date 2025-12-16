package com.avito.android.user_advert.advert.delegate.multi_urgency;

import Y41.p;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.l;
import com.avito.android.util.R0;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;
import nH0.InterfaceC44256a;

/* compiled from: MultiUrgencyPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/multi_urgency/f;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/multi_urgency/d;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC40291a implements d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final l f308688d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.e f308689e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f308690f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC44256a f308691g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f308692h;

    /* compiled from: MultiUrgencyPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.multi_urgency.MultiUrgencyPresenterDelegateImpl$toggle$1", f = "MultiUrgencyPresenterDelegate.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308693q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<e> f308694r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f f308695s;

        /* compiled from: MultiUrgencyPresenterDelegate.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_advert.advert.delegate.multi_urgency.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C9473a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.jakewharton.rxrelay3.c<InterfaceC40292b> f308696b;

            public C9473a(com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar) {
                this.f308696b = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f308696b.accept((InterfaceC40292b) obj);
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f308696b, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43160i<? extends e> interfaceC43160i, f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f308694r = interfaceC43160i;
            this.f308695s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new a(this.f308694r, this.f308695s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308693q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C9473a c9473a = new C9473a(this.f308695s.f395801b);
                this.f308693q = 1;
                if (this.f308694r.collect(c9473a, this) == coroutine_suspended) {
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

    /* compiled from: MultiUrgencyPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.multi_urgency.MultiUrgencyPresenterDelegateImpl$urgencyTypeChange$1", f = "MultiUrgencyPresenterDelegate.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308697q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i<e> f308698r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f f308699s;

        /* compiled from: MultiUrgencyPresenterDelegate.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.jakewharton.rxrelay3.c<InterfaceC40292b> f308700b;

            public a(com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar) {
                this.f308700b = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f308700b.accept((InterfaceC40292b) obj);
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                    return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f308700b, com.jakewharton.rxrelay3.c.class, "accept", "accept(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43160i<? extends e> interfaceC43160i, f fVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f308698r = interfaceC43160i;
            this.f308699s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new b(this.f308698r, this.f308699s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308697q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = new a(this.f308699s.f395801b);
                this.f308697q = 1;
                if (this.f308698r.collect(aVar, this) == coroutine_suspended) {
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

    @Inject
    public f(@k l lVar, @k com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.e eVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC44256a interfaceC44256a, @k R0 r02) {
        this.f308688d = lVar;
        this.f308689e = eVar;
        this.f308690f = aVar;
        this.f308691g = interfaceC44256a;
        this.f308692h = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
    }

    @Override // com.avito.android.user_advert.advert.delegate.multi_urgency.d
    public final void K(@k com.avito.android.user_advert.advert.items.multi_urgency.c cVar, @k com.avito.android.user_advert.advert.items.multi_urgency.l lVar) {
        C43259k.d(this.f308692h, null, null, new b(this.f308688d.a(cVar, lVar), this, null), 3);
    }

    @Override // com.avito.android.user_advert.advert.delegate.multi_urgency.d
    public final void P(@k com.avito.android.user_advert.advert.items.multi_urgency.c cVar, @k DeepLink deepLink) {
        b.a.a(this.f308690f, deepLink, null, null, 6);
        this.f308691g.b(cVar);
    }

    @Override // com.avito.android.user_advert.advert.delegate.multi_urgency.d
    public final void b(@k com.avito.android.user_advert.advert.items.multi_urgency.c cVar, boolean z12) {
        if (z12 != cVar.f309647k) {
            C43259k.d(this.f308692h, null, null, new a(this.f308689e.b(cVar, z12), this, null), 3);
        }
    }

    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        super.dispose();
        U.b(this.f308692h, null);
    }
}
