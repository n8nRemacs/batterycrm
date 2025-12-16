package com.avito.android.code_check.phone_list;

import Ro.b;
import android.view.View;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_check.phone_list.PhoneListFragment;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.util.D6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import okhttp3.internal.ws.WebSocketProtocol;
import qK0.C47313c;

/* compiled from: PhoneListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.code_check.phone_list.PhoneListFragment$observeViewModel$1", f = "PhoneListFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f118963q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PhoneListFragment f118964r;

    /* compiled from: PhoneListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.phone_list.PhoneListFragment$observeViewModel$1$1", f = "PhoneListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f118965q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ PhoneListFragment f118966r;

        /* compiled from: PhoneListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check.phone_list.PhoneListFragment$observeViewModel$1$1$1", f = "PhoneListFragment.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.code_check.phone_list.d$a$a, reason: collision with other inner class name */
        public static final class C3472a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f118967q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PhoneListFragment f118968r;

            /* compiled from: PhoneListFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.code_check.phone_list.d$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C3473a extends H implements Y41.l<u, G0> {
                @Override // Y41.l
                public final G0 invoke(u uVar) {
                    u uVar2 = uVar;
                    PhoneListFragment phoneListFragment = (PhoneListFragment) this.receiver;
                    C47313c c47313c = phoneListFragment.f118864C0;
                    kotlin.reflect.n<Object> nVar = PhoneListFragment.f118861G0[4];
                    D6.G((View) c47313c.a(), uVar2.f119030c);
                    com.avito.konveyor.adapter.d dVar = phoneListFragment.f118867s0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(uVar2.f119029b, null);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3472a(PhoneListFragment phoneListFragment, Continuation<? super C3472a> continuation) {
                super(2, continuation);
                this.f118968r = phoneListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C3472a(this.f118968r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3472a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f118967q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PhoneListFragment phoneListFragment = this.f118968r;
                    n2<u> n2Var = ((s) phoneListFragment.f118866E0.getValue()).f119020L;
                    ScreenPerformanceTracker screenPerformanceTracker = phoneListFragment.f118872x0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C3473a c3473a = new C3473a(1, phoneListFragment, PhoneListFragment.class, "renderState", "renderState(Lcom/avito/android/code_check/phone_list/PhoneListViewState;)V", 0);
                    this.f118967q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(n2Var, screenPerformanceTracker, c3473a, this) == coroutine_suspended) {
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

        /* compiled from: PhoneListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check.phone_list.PhoneListFragment$observeViewModel$1$1$2", f = "PhoneListFragment.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f118969q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PhoneListFragment f118970r;

            /* compiled from: PhoneListFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.code_check.phone_list.d$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C3474a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PhoneListFragment f118971b;

                public C3474a(PhoneListFragment phoneListFragment) {
                    this.f118971b = phoneListFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Ro.b bVar = (Ro.b) obj;
                    PhoneListFragment.a aVar = PhoneListFragment.f118860F0;
                    PhoneListFragment phoneListFragment = this.f118971b;
                    phoneListFragment.getClass();
                    if (bVar instanceof b.a) {
                        b.a aVar2 = (b.a) bVar;
                        phoneListFragment.v5(aVar2.f14623a, aVar2.f14624b, aVar2.f14625c);
                    } else {
                        if (bVar instanceof b.C0979b) {
                            PhoneList phoneList = phoneListFragment.f118870v0;
                            com.avito.android.code_check.p.a(phoneListFragment, (phoneList != null ? phoneList : null).f119302b.f119385a);
                        } else if (bVar instanceof b.c) {
                            com.avito.android.code_check.p.a(phoneListFragment, ((b.c) bVar).f14627a);
                        } else if (bVar instanceof b.f) {
                            ((b.f) bVar).getClass();
                            phoneListFragment.w5(null);
                        } else if (bVar instanceof b.g) {
                            com.avito.android.code_check.p.a(phoneListFragment, new a.InterfaceC3494a.c(((b.g) bVar).f14630a, null, 2, null));
                        } else if (bVar instanceof b.d) {
                            phoneListFragment.v5(((b.d) bVar).f14628a, null, null);
                        } else {
                            boolean z12 = bVar instanceof b.e;
                        }
                    }
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
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f118971b, PhoneListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PhoneListFragment phoneListFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f118970r = phoneListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f118970r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f118969q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PhoneListFragment phoneListFragment = this.f118970r;
                    s sVar = (s) phoneListFragment.f118866E0.getValue();
                    C3474a c3474a = new C3474a(phoneListFragment);
                    this.f118969q = 1;
                    Object objCollect = sVar.f119018J.f91928q.collect(c3474a, this);
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

        /* compiled from: PhoneListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check.phone_list.PhoneListFragment$observeViewModel$1$1$3", f = "PhoneListFragment.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f118972q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PhoneListFragment f118973r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(PhoneListFragment phoneListFragment, Continuation<? super c> continuation) {
                super(2, continuation);
                this.f118973r = phoneListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new c(this.f118973r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f118972q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f118972q = 1;
                    if (PhoneListFragment.x5(this.f118973r, this) == coroutine_suspended) {
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
        public a(PhoneListFragment phoneListFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f118966r = phoneListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f118966r, continuation);
            aVar.f118965q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f118965q;
            PhoneListFragment phoneListFragment = this.f118966r;
            C43259k.d(t12, null, null, new C3472a(phoneListFragment, null), 3);
            C43259k.d(t12, null, null, new b(phoneListFragment, null), 3);
            C43259k.d(t12, null, null, new c(phoneListFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PhoneListFragment phoneListFragment, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f118964r = phoneListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f118964r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f118963q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            PhoneListFragment phoneListFragment = this.f118964r;
            a aVar = new a(phoneListFragment, null);
            this.f118963q = 1;
            if (C23056p0.b(phoneListFragment, state, aVar, this) == coroutine_suspended) {
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
