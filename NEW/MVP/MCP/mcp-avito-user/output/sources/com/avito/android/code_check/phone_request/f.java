package com.avito.android.code_check.phone_request;

import Ro.b;
import android.text.Editable;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_check.phone_request.PhoneRequestFragment;
import com.avito.android.code_check_public.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
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
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;

/* compiled from: PhoneRequestFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.code_check.phone_request.PhoneRequestFragment$observeViewModel$1", f = "PhoneRequestFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class f extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f119074q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ PhoneRequestFragment f119075r;

    /* compiled from: PhoneRequestFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.phone_request.PhoneRequestFragment$observeViewModel$1$1", f = "PhoneRequestFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f119076q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ PhoneRequestFragment f119077r;

        /* compiled from: PhoneRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check.phone_request.PhoneRequestFragment$observeViewModel$1$1$1", f = "PhoneRequestFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.code_check.phone_request.f$a$a, reason: collision with other inner class name */
        public static final class C3479a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f119078q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PhoneRequestFragment f119079r;

            /* compiled from: PhoneRequestFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.code_check.phone_request.f$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C3480a extends H implements Y41.l<Ro.c, G0> {
                @Override // Y41.l
                public final G0 invoke(Ro.c cVar) {
                    G0 g02;
                    Ro.c cVar2 = cVar;
                    PhoneRequestFragment phoneRequestFragment = (PhoneRequestFragment) this.receiver;
                    PhoneRequestFragment.a aVar = PhoneRequestFragment.f119032H0;
                    phoneRequestFragment.getClass();
                    PrintableText printableText = cVar2.f14632c;
                    if (printableText != null) {
                        ComponentContainer.n(phoneRequestFragment.y5(), printableText.k0(phoneRequestFragment.y5().getContext()), 2);
                        g02 = G0.f406611a;
                    } else {
                        g02 = null;
                    }
                    if (g02 == null) {
                        ComponentContainer componentContainerY5 = phoneRequestFragment.y5();
                        com.avito.android.code_check_public.screen.d dVar = phoneRequestFragment.f119042t0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        PrintableText printableText2 = dVar.f119364e.f119372f;
                        componentContainerY5.q(printableText2 != null ? printableText2.k0(phoneRequestFragment.x5().getContext()) : null);
                    }
                    C47313c c47313c = phoneRequestFragment.f119048z0;
                    kotlin.reflect.n<Object>[] nVarArr = PhoneRequestFragment.f119033I0;
                    kotlin.reflect.n<Object> nVar = nVarArr[3];
                    Button button = (Button) c47313c.a();
                    boolean z12 = cVar2.f14631b;
                    button.setLoading(z12);
                    kotlin.reflect.n<Object> nVar2 = nVarArr[3];
                    boolean z13 = !z12;
                    ((Button) c47313c.a()).setClickable(z13);
                    C47313c c47313c2 = phoneRequestFragment.f119034A0;
                    kotlin.reflect.n<Object> nVar3 = nVarArr[4];
                    ((Button) c47313c2.a()).setEnabled(z13);
                    phoneRequestFragment.x5().setEnabled(z13);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3479a(PhoneRequestFragment phoneRequestFragment, Continuation<? super C3479a> continuation) {
                super(2, continuation);
                this.f119079r = phoneRequestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C3479a(this.f119079r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C3479a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f119078q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PhoneRequestFragment.a aVar = PhoneRequestFragment.f119032H0;
                    PhoneRequestFragment phoneRequestFragment = this.f119079r;
                    n2<Ro.c> state = phoneRequestFragment.z5().getState();
                    ScreenPerformanceTracker screenPerformanceTracker = phoneRequestFragment.f119043u0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C3480a c3480a = new C3480a(1, phoneRequestFragment, PhoneRequestFragment.class, "render", "render(Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestState;)V", 0);
                    this.f119078q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c3480a, this) == coroutine_suspended) {
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

        /* compiled from: PhoneRequestFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.code_check.phone_request.PhoneRequestFragment$observeViewModel$1$1$2", f = "PhoneRequestFragment.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f119080q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ PhoneRequestFragment f119081r;

            /* compiled from: PhoneRequestFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.code_check.phone_request.f$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C3481a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PhoneRequestFragment f119082b;

                public C3481a(PhoneRequestFragment phoneRequestFragment) {
                    this.f119082b = phoneRequestFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Ro.b bVar = (Ro.b) obj;
                    PhoneRequestFragment.a aVar = PhoneRequestFragment.f119032H0;
                    PhoneRequestFragment phoneRequestFragment = this.f119082b;
                    phoneRequestFragment.getClass();
                    if (bVar instanceof b.a) {
                        b.a aVar2 = (b.a) bVar;
                        phoneRequestFragment.v5(aVar2.f14623a, aVar2.f14624b, aVar2.f14625c);
                    } else {
                        if (L.f(bVar, b.C0979b.f14626a)) {
                            com.avito.android.code_check_public.screen.d dVar = phoneRequestFragment.f119042t0;
                            com.avito.android.code_check.p.a(phoneRequestFragment, (dVar != null ? dVar : null).f119361b.f119385a);
                        } else if (bVar instanceof b.c) {
                            com.avito.android.code_check.p.a(phoneRequestFragment, ((b.c) bVar).f14627a);
                        } else if (bVar instanceof b.f) {
                            ((b.f) bVar).getClass();
                            phoneRequestFragment.w5(null);
                        } else if (bVar instanceof b.g) {
                            com.avito.android.code_check.p.a(phoneRequestFragment, new a.InterfaceC3494a.c(((b.g) bVar).f14630a, null, 2, null));
                        } else if (bVar instanceof b.e) {
                            Editable editableM53getText = phoneRequestFragment.x5().m53getText();
                            if (editableM53getText == null || editableM53getText.length() == 0) {
                                Input.t(phoneRequestFragment.x5(), ((b.e) bVar).f14629a, false, 6);
                            }
                        } else {
                            boolean z12 = bVar instanceof b.d;
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
                    return new C42801a(2, this.f119082b, PhoneRequestFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/code_check/phone_request/mvi/entity/PhoneRequestOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(PhoneRequestFragment phoneRequestFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f119081r = phoneRequestFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f119081r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f119080q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    PhoneRequestFragment.a aVar = PhoneRequestFragment.f119032H0;
                    PhoneRequestFragment phoneRequestFragment = this.f119081r;
                    InterfaceC43160i<Ro.b> events = phoneRequestFragment.z5().getEvents();
                    C3481a c3481a = new C3481a(phoneRequestFragment);
                    this.f119080q = 1;
                    if (events.collect(c3481a, this) == coroutine_suspended) {
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
        public a(PhoneRequestFragment phoneRequestFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f119077r = phoneRequestFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f119077r, continuation);
            aVar.f119076q = obj;
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
            T t12 = (T) this.f119076q;
            PhoneRequestFragment phoneRequestFragment = this.f119077r;
            C43259k.d(t12, null, null, new C3479a(phoneRequestFragment, null), 3);
            C43259k.d(t12, null, null, new b(phoneRequestFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PhoneRequestFragment phoneRequestFragment, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f119075r = phoneRequestFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f119075r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f119074q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            PhoneRequestFragment phoneRequestFragment = this.f119075r;
            a aVar = new a(phoneRequestFragment, null);
            this.f119074q = 1;
            if (C23056p0.b(phoneRequestFragment, state, aVar, this) == coroutine_suspended) {
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
