package com.avito.android.user_adverts.root_screen.adverts_host;

import BI0.c;
import BI0.d;
import com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment;
import com.avito.android.user_adverts_filters.host.d;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import nE.C44240b;

/* compiled from: UserAdvertsHostFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindSearchView$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35592p extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f313249q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsHostFragment f313250r;

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindSearchView$1$1", f = "UserAdvertsHostFragment.kt", i = {}, l = {819}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.p$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313251q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f313252r;

        /* compiled from: UserAdvertsHostFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.p$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C9614a implements InterfaceC43172j, kotlin.jvm.internal.D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsHostFragment f313253b;

            public C9614a(UserAdvertsHostFragment userAdvertsHostFragment) {
                this.f313253b = userAdvertsHostFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                b0 b0Var;
                BI0.d dVar = (BI0.d) obj;
                UserAdvertsHostFragment userAdvertsHostFragment = this.f313253b;
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h hVar = userAdvertsHostFragment.f312320d1;
                if (hVar != null) {
                    hVar.b(dVar);
                }
                C44240b c44240b = userAdvertsHostFragment.f312297G0;
                if (c44240b == null) {
                    c44240b = null;
                }
                if (!c44240b.v().invoke().booleanValue() && (b0Var = userAdvertsHostFragment.f312318b1) != null) {
                    boolean z12 = dVar instanceof d.C0052d;
                    NI0.a aVar = b0Var.f312396v;
                    if (z12) {
                        if (((d.C0052d) dVar).f1324a) {
                            aVar.b();
                        } else {
                            aVar.c((3 & 1) != 0, true);
                        }
                    } else if (dVar instanceof d.b) {
                        aVar.c((3 & 1) != 0, true);
                    } else {
                        boolean z13 = dVar instanceof d.c;
                    }
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f313253b, UserAdvertsHostFragment.class, "renderSearchState", "renderSearchState(Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/mvi/entity/SearchState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f313252r = userAdvertsHostFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f313252r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313251q;
            if (i12 == 0) {
                C42729a0.b(obj);
                UserAdvertsHostFragment userAdvertsHostFragment = this.f313252r;
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = userAdvertsHostFragment.f312298H0;
                if (f12 == null) {
                    f12 = null;
                }
                n2<BI0.d> state = f12.getState();
                h31.e<com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b> eVar = userAdvertsHostFragment.f312295E0;
                InterfaceC43160i interfaceC43160iR = C43175k.r(com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.C.a(state, (eVar != null ? eVar : null).get()));
                C9614a c9614a = new C9614a(userAdvertsHostFragment);
                this.f313251q = 1;
                if (interfaceC43160iR.collect(c9614a, this) == coroutine_suspended) {
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

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindSearchView$1$2", f = "UserAdvertsHostFragment.kt", i = {}, l = {822}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.p$b */
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313254q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f313255r;

        /* compiled from: UserAdvertsHostFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.p$b$a */
        public /* synthetic */ class a implements InterfaceC43172j, kotlin.jvm.internal.D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsHostFragment f313256b;

            public a(UserAdvertsHostFragment userAdvertsHostFragment) {
                this.f313256b = userAdvertsHostFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                BI0.c cVar = (BI0.c) obj;
                UserAdvertsHostFragment.a aVar = UserAdvertsHostFragment.f312290o1;
                UserAdvertsHostFragment userAdvertsHostFragment = this.f313256b;
                if (cVar instanceof c.a) {
                    c.a aVar2 = (c.a) cVar;
                    String str = aVar2.f1317b;
                    String str2 = null;
                    if (C43066x.K(str)) {
                        str = null;
                    }
                    if (str == null) {
                        com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0 e0Var = userAdvertsHostFragment.f312302L0;
                        if (e0Var == null) {
                            e0Var = null;
                        }
                        UI0.a aVar3 = e0Var.getState().getValue().f15555d;
                        if (!aVar3.f16332c) {
                            aVar3 = null;
                        }
                        if (aVar3 != null) {
                            str2 = aVar3.f16330a;
                        }
                    } else {
                        str2 = str;
                    }
                    userAdvertsHostFragment.f312327k1.b(new d.a(aVar2.f1316a, str2));
                }
                G0 g02 = G0.f406611a;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return g02;
            }

            public final boolean equals(@Y61.l Object obj) {
                if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                    return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.D
            @Y61.k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f313256b, UserAdvertsHostFragment.class, "handleSearchEvents", "handleSearchEvents(Lcom/avito/android/user_adverts/root_screen/adverts_host/header/search_view/mvi/entity/SearchOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f313255r = userAdvertsHostFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f313255r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313254q;
            if (i12 == 0) {
                C42729a0.b(obj);
                UserAdvertsHostFragment userAdvertsHostFragment = this.f313255r;
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = userAdvertsHostFragment.f312298H0;
                if (f12 == null) {
                    f12 = null;
                }
                InterfaceC43160i<BI0.c> events = f12.getEvents();
                a aVar = new a(userAdvertsHostFragment);
                this.f313254q = 1;
                if (events.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: UserAdvertsHostFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.UserAdvertsHostFragment$bindSearchView$1$3", f = "UserAdvertsHostFragment.kt", i = {}, l = {825}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.p$c */
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f313257q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsHostFragment f313258r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f313258r = userAdvertsHostFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f313258r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f313257q;
            if (i12 == 0) {
                C42729a0.b(obj);
                UserAdvertsHostFragment userAdvertsHostFragment = this.f313258r;
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.F f12 = userAdvertsHostFragment.f312298H0;
                if (f12 == null) {
                    f12 = null;
                }
                n2<BI0.d> state = f12.getState();
                h31.e<com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b> eVar = userAdvertsHostFragment.f312295E0;
                com.avito.android.user_adverts.root_screen.adverts_host.overlay.core.b bVar = (eVar != null ? eVar : null).get();
                this.f313257q = 1;
                Object objCollect = new com.avito.android.user_adverts.root_screen.adverts_host.overlay.host.A(state).collect(bVar, this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = G0.f406611a;
                }
                if (objCollect == coroutine_suspended) {
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
    public C35592p(UserAdvertsHostFragment userAdvertsHostFragment, Continuation<? super C35592p> continuation) {
        super(2, continuation);
        this.f313250r = userAdvertsHostFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C35592p c35592p = new C35592p(this.f313250r, continuation);
        c35592p.f313249q = obj;
        return c35592p;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C35592p) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f313249q;
        UserAdvertsHostFragment userAdvertsHostFragment = this.f313250r;
        C43259k.d(t12, null, null, new a(userAdvertsHostFragment, null), 3);
        C43259k.d(t12, null, null, new b(userAdvertsHostFragment, null), 3);
        C43259k.d(t12, null, null, new c(userAdvertsHostFragment, null), 3);
        return G0.f406611a;
    }
}
