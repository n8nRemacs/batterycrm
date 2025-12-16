package com.avito.android.mortgage.sending_confirm;

import Cd.C13243a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MortgageSendingConfirmScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.mortgage.sending_confirm.model.Confirmed;
import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.yandex.metrica.YandexMetricaDefaultValues;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import m10.C43861c;
import m10.InterfaceC43860b;
import z1.AbstractC50339a;

/* compiled from: SendingConfirmDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/SendingConfirmDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lm10/c;", VoiceInfo.STATE, "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SendingConfirmDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f203484l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public p f203485h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f203486i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f203487j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final n f203488k0;

    /* compiled from: SendingConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/SendingConfirmDialog$a;", "", "<init>", "()V", "", "SENDING_CONFIRM_DIALOG_REQUEST_KEY", "Ljava/lang/String;", "SENDING_CONFIRM_DIALOG_RESULT", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SendingConfirmDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$a$a, reason: collision with other inner class name */
        public static final class C6057a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SendingConfirmArguments f203489l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6057a(SendingConfirmArguments sendingConfirmArguments) {
                super(1);
                this.f203489l = sendingConfirmArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("SENDING_CONFIRM_ARGS", this.f203489l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SendingConfirmDialog a(@Y61.k SendingConfirmArguments sendingConfirmArguments) {
            SendingConfirmDialog sendingConfirmDialog = new SendingConfirmDialog();
            C35966w1.a(sendingConfirmDialog, -1, new C6057a(sendingConfirmArguments));
            return sendingConfirmDialog;
        }

        public a() {
        }
    }

    /* compiled from: SendingConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$onCreateDialog$1", f = "SendingConfirmDialog.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203490q;

        /* compiled from: SendingConfirmDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$onCreateDialog$1$1", f = "SendingConfirmDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f203492q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SendingConfirmDialog f203493r;

            /* compiled from: SendingConfirmDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$onCreateDialog$1$1$1", f = "SendingConfirmDialog.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$b$a$a, reason: collision with other inner class name */
            public static final class C6058a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f203494q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SendingConfirmDialog f203495r;

                /* compiled from: SendingConfirmDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C6059a extends H implements Y41.l<C43861c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(C43861c c43861c) {
                        C43861c c43861c2 = c43861c;
                        SendingConfirmDialog sendingConfirmDialog = (SendingConfirmDialog) this.receiver;
                        a aVar = SendingConfirmDialog.f203484l0;
                        sendingConfirmDialog.getClass();
                        Button button = sendingConfirmDialog.f203488k0.f203585a;
                        if (button != null) {
                            button.setLoading(c43861c2.f414268g);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6058a(SendingConfirmDialog sendingConfirmDialog, Continuation<? super C6058a> continuation) {
                    super(2, continuation);
                    this.f203495r = sendingConfirmDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6058a(this.f203495r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6058a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f203494q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        SendingConfirmDialog sendingConfirmDialog = this.f203495r;
                        n2<C43861c> state = ((o) sendingConfirmDialog.f203486i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = sendingConfirmDialog.f203487j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6059a c6059a = new C6059a(1, sendingConfirmDialog, SendingConfirmDialog.class, "renderState", "renderState(Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmState;)V", 0);
                        this.f203494q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6059a, this) == coroutine_suspended) {
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

            /* compiled from: SendingConfirmDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$onCreateDialog$1$1$2", f = "SendingConfirmDialog.kt", i = {}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$b$a$b, reason: collision with other inner class name */
            public static final class C6060b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f203496q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SendingConfirmDialog f203497r;

                /* compiled from: SendingConfirmDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.sending_confirm.SendingConfirmDialog$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6061a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SendingConfirmDialog f203498b;

                    public C6061a(SendingConfirmDialog sendingConfirmDialog) {
                        this.f203498b = sendingConfirmDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC43860b interfaceC43860b = (InterfaceC43860b) obj;
                        a aVar = SendingConfirmDialog.f203484l0;
                        SendingConfirmDialog sendingConfirmDialog = this.f203498b;
                        if (interfaceC43860b instanceof InterfaceC43860b.a) {
                            sendingConfirmDialog.getParentFragmentManager().o0(C22777e.b(new Q("SENDING_CONFIRM_DIALOG_RESULT", Confirmed.f203546b)), "SENDING_CONFIRM_DIALOG_REQUEST_KEY");
                            sendingConfirmDialog.dismiss();
                        } else if (interfaceC43860b instanceof InterfaceC43860b.C11813b) {
                            InterfaceC43860b.C11813b c11813b = (InterfaceC43860b.C11813b) interfaceC43860b;
                            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, sendingConfirmDialog, com.avito.android.printable_text.b.f(c11813b.f414260a.getF244063c()), null, null, new f.c(c11813b.f414260a), 0, ToastBarPosition.f181046d, 942);
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
                        return new C42801a(2, this.f203498b, SendingConfirmDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6060b(SendingConfirmDialog sendingConfirmDialog, Continuation<? super C6060b> continuation) {
                    super(2, continuation);
                    this.f203497r = sendingConfirmDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6060b(this.f203497r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6060b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f203496q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        SendingConfirmDialog sendingConfirmDialog = this.f203497r;
                        InterfaceC43160i<InterfaceC43860b> events = ((o) sendingConfirmDialog.f203486i0.getValue()).getEvents();
                        C6061a c6061a = new C6061a(sendingConfirmDialog);
                        this.f203496q = 1;
                        if (events.collect(c6061a, this) == coroutine_suspended) {
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
            public a(SendingConfirmDialog sendingConfirmDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f203493r = sendingConfirmDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f203493r, continuation);
                aVar.f203492q = obj;
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
                T t12 = (T) this.f203492q;
                SendingConfirmDialog sendingConfirmDialog = this.f203493r;
                C43259k.d(t12, null, null, new C6058a(sendingConfirmDialog, null), 3);
                C43259k.d(t12, null, null, new C6060b(sendingConfirmDialog, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return SendingConfirmDialog.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203490q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                SendingConfirmDialog sendingConfirmDialog = SendingConfirmDialog.this;
                a aVar = new a(sendingConfirmDialog, null);
                this.f203490q = 1;
                if (C23056p0.b(sendingConfirmDialog, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SendingConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<View, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            ((ComposeView) view).setContent(new C22096n(1996466478, new com.avito.android.mortgage.sending_confirm.i(SendingConfirmDialog.this), true));
            return G0.f406611a;
        }
    }

    /* compiled from: SendingConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TZ.b f203501m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TZ.b bVar) {
            super(1);
            this.f203501m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            SendingConfirmDialog sendingConfirmDialog = SendingConfirmDialog.this;
            n nVar = sendingConfirmDialog.f203488k0;
            nVar.getClass();
            View viewFindViewById = view2.findViewById(R.id.footer_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            nVar.f203585a = (Button) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.footer_secondary_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById2;
            nVar.f203586b = button;
            D6.G(button, true);
            com.avito.android.mortgage.sending_confirm.j jVar = new com.avito.android.mortgage.sending_confirm.j(sendingConfirmDialog);
            k kVar = new k(this.f203501m);
            Button button2 = nVar.f203585a;
            if (button2 != null) {
                button2.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(4, jVar));
            }
            Button button3 = nVar.f203586b;
            if (button3 != null) {
                button3.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(5, kVar));
            }
            String confirmButton = sendingConfirmDialog.g5().f203547b.getConfirmButton();
            Button button4 = nVar.f203585a;
            if (button4 != null) {
                button4.setText(confirmButton);
            }
            String declineButton = sendingConfirmDialog.g5().f203547b.getDeclineButton();
            Button button5 = nVar.f203586b;
            if (button5 != null) {
                button5.setText(declineButton);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f203502l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f203502l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f203502l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SendingConfirmDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f203504l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f203504l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f203504l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f203505l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f203505l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f203505l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f203506l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f203506l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f203506l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SendingConfirmDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/sending_confirm/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<o> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = SendingConfirmDialog.this.f203485h0;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    public SendingConfirmDialog() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f203486i0 = new O0(m0.f406844a.b(o.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f203488k0 = new n();
    }

    public static final o f5(SendingConfirmDialog sendingConfirmDialog) {
        return (o) sendingConfirmDialog.f203486i0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.mortgage.sending_confirm.di.a.a().a((com.avito.android.mortgage.di.o) C29972i.a(C29972i.b(this), com.avito.android.mortgage.di.o.class), new C28478k(MortgageSendingConfirmScreen.f90428d, s.b(this), null, 4, null), g5()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f203487j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final SendingConfirmArguments g5() {
        Bundle bundleRequireArguments = requireArguments();
        return (SendingConfirmArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("SENDING_CONFIRM_ARGS", SendingConfirmArguments.class) : bundleRequireArguments.getParcelable("SENDING_CONFIRM_ARGS"));
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f203487j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        TZ.b bVar = new TZ.b(requireContext(), null, 2, null);
        bVar.B(R.layout.compose_content_layout, R.layout.button_footer_layout, new c(), new d(bVar), false);
        bVar.setTitle(g5().f203547b.getTitle());
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(true);
        bVar.S(C35835l0.g(bVar.getContext()).y);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f203487j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        n nVar = this.f203488k0;
        nVar.f203585a = null;
        nVar.f203586b = null;
    }
}
