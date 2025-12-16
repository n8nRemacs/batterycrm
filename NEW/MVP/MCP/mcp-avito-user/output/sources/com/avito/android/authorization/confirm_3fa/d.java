package com.avito.android.authorization.confirm_3fa;

import android.view.View;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.confirm_3fa.ConfirmEmailListFragment;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.util.D6;
import ge.C40667c;
import ge.InterfaceC40666b;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import qK0.C47313c;

/* compiled from: ConfirmEmailListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.confirm_3fa.ConfirmEmailListFragment$observeViewModel$1", f = "ConfirmEmailListFragment.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f93573q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ConfirmEmailListFragment f93574r;

    /* compiled from: ConfirmEmailListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.confirm_3fa.ConfirmEmailListFragment$observeViewModel$1$1", f = "ConfirmEmailListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f93575q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ConfirmEmailListFragment f93576r;

        /* compiled from: ConfirmEmailListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.confirm_3fa.ConfirmEmailListFragment$observeViewModel$1$1$1", f = "ConfirmEmailListFragment.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.confirm_3fa.d$a$a, reason: collision with other inner class name */
        public static final class C2772a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f93577q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ConfirmEmailListFragment f93578r;

            /* compiled from: ConfirmEmailListFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.authorization.confirm_3fa.d$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2773a extends H implements Y41.l<C40667c, G0> {
                @Override // Y41.l
                public final G0 invoke(C40667c c40667c) {
                    C40667c c40667c2 = c40667c;
                    ConfirmEmailListFragment confirmEmailListFragment = (ConfirmEmailListFragment) this.receiver;
                    C47313c c47313c = confirmEmailListFragment.f93549w0;
                    kotlin.reflect.n<Object> nVar = ConfirmEmailListFragment.f93538A0[2];
                    D6.G((View) c47313c.a(), c40667c2.f396651c);
                    com.avito.konveyor.adapter.d dVar = confirmEmailListFragment.f93540n0;
                    if (dVar == null) {
                        dVar = null;
                    }
                    dVar.l(c40667c2.f396650b, null);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2772a(ConfirmEmailListFragment confirmEmailListFragment, Continuation<? super C2772a> continuation) {
                super(2, continuation);
                this.f93578r = confirmEmailListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2772a(this.f93578r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2772a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f93577q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ConfirmEmailListFragment confirmEmailListFragment = this.f93578r;
                    n2<C40667c> state = ((n) confirmEmailListFragment.f93551y0.getValue()).getState();
                    ScreenPerformanceTracker screenPerformanceTracker = confirmEmailListFragment.f93545s0;
                    if (screenPerformanceTracker == null) {
                        screenPerformanceTracker = null;
                    }
                    C2773a c2773a = new C2773a(1, confirmEmailListFragment, ConfirmEmailListFragment.class, "renderState", "renderState(Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListState;)V", 0);
                    this.f93577q = 1;
                    if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c2773a, this) == coroutine_suspended) {
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

        /* compiled from: ConfirmEmailListFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.confirm_3fa.ConfirmEmailListFragment$observeViewModel$1$1$2", f = "ConfirmEmailListFragment.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f93579q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ConfirmEmailListFragment f93580r;

            /* compiled from: ConfirmEmailListFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.authorization.confirm_3fa.d$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C2774a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ConfirmEmailListFragment f93581b;

                public C2774a(ConfirmEmailListFragment confirmEmailListFragment) {
                    this.f93581b = confirmEmailListFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    InterfaceC40666b interfaceC40666b = (InterfaceC40666b) obj;
                    ConfirmEmailListFragment.a aVar = ConfirmEmailListFragment.f93539z0;
                    ConfirmEmailListFragment confirmEmailListFragment = this.f93581b;
                    if (interfaceC40666b instanceof InterfaceC40666b.C11216b) {
                        UserDialog userDialog = ((InterfaceC40666b.C11216b) interfaceC40666b).f396647a;
                        InterfaceC30274a interfaceC30274a = confirmEmailListFragment.f93543q0;
                        if (interfaceC30274a == null) {
                            interfaceC30274a = null;
                        }
                        C43175k.K(new X(new C43197r1(new e(confirmEmailListFragment, null), y.a(interfaceC30274a.f(userDialog).q())), new f(confirmEmailListFragment, null)), C22981N.a(confirmEmailListFragment.getLifecycle()));
                    } else if (interfaceC40666b instanceof InterfaceC40666b.c) {
                        PrintableText printableText = ((InterfaceC40666b.c) interfaceC40666b).f396648a;
                        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                        C47313c c47313c = confirmEmailListFragment.f93547u0;
                        kotlin.reflect.n<Object> nVar = ConfirmEmailListFragment.f93538A0[0];
                        View view = (View) c47313c.a();
                        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                        f.c.f125255c.getClass();
                        com.avito.android.component.toast.c.b(cVar, view, printableText, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
                    } else if (interfaceC40666b instanceof InterfaceC40666b.a) {
                        DeepLink deepLink = ((InterfaceC40666b.a) interfaceC40666b).f396646a;
                        com.avito.android.deeplink_handler.handler.composite.a aVar2 = confirmEmailListFragment.f93544r0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        b.a.a(aVar2, deepLink, null, null, 6);
                        confirmEmailListFragment.requireActivity().finish();
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
                    return new C42801a(2, this.f93581b, ConfirmEmailListFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ConfirmEmailListFragment confirmEmailListFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f93580r = confirmEmailListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f93580r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f93579q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    ConfirmEmailListFragment confirmEmailListFragment = this.f93580r;
                    n nVar = (n) confirmEmailListFragment.f93551y0.getValue();
                    C2774a c2774a = new C2774a(confirmEmailListFragment);
                    this.f93579q = 1;
                    if (nVar.ke(c2774a, this) == coroutine_suspended) {
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
        public a(ConfirmEmailListFragment confirmEmailListFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93576r = confirmEmailListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f93576r, continuation);
            aVar.f93575q = obj;
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
            T t12 = (T) this.f93575q;
            ConfirmEmailListFragment confirmEmailListFragment = this.f93576r;
            C43259k.d(t12, null, null, new C2772a(confirmEmailListFragment, null), 3);
            C43259k.d(t12, null, null, new b(confirmEmailListFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConfirmEmailListFragment confirmEmailListFragment, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f93574r = confirmEmailListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f93574r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f93573q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            ConfirmEmailListFragment confirmEmailListFragment = this.f93574r;
            a aVar = new a(confirmEmailListFragment, null);
            this.f93573q = 1;
            if (C23056p0.b(confirmEmailListFragment, state, aVar, this) == coroutine_suspended) {
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
