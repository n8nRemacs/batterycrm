package com.avito.android.autoteka.presentation.confirmEmail;

import Cd.C13243a;
import Jf.InterfaceC14191a;
import Jf.c;
import Oa1.B;
import Y41.p;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
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
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.autoteka.domain.model.confirmEmail.ConfirmEmailDetails;
import com.avito.android.autoteka.helpers.k;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.lib.design.input.s;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.internal.K;
import z1.AbstractC50339a;

/* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/confirmEmail/AutotekaConfirmEmailBottomSheetDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaConfirmEmailBottomSheetDialog extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public static final a f97214n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.autoteka.presentation.confirmEmail.f f97215h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f97216i0;

    /* renamed from: j0, reason: collision with root package name */
    @l
    public s f97217j0;

    /* renamed from: k0, reason: collision with root package name */
    public Input f97218k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f97219l0;

    /* renamed from: m0, reason: collision with root package name */
    public Button f97220m0;

    /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/autoteka/presentation/confirmEmail/AutotekaConfirmEmailBottomSheetDialog$a;", "", "<init>", "()V", "", "CONFIRM_EMAIL_DETAILS", "Ljava/lang/String;", "REQ_KEY_EMAIL_CHANGE", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$a$a, reason: collision with other inner class name */
        public static final class C2900a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ConfirmEmailDetails f97221l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2900a(ConfirmEmailDetails confirmEmailDetails) {
                super(1);
                this.f97221l = confirmEmailDetails;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("ConfirmEmailDetails", this.f97221l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static AutotekaConfirmEmailBottomSheetDialog a(@k ConfirmEmailDetails confirmEmailDetails) {
            AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog = new AutotekaConfirmEmailBottomSheetDialog();
            C35966w1.a(autotekaConfirmEmailBottomSheetDialog, -1, new C2900a(confirmEmailDetails));
            return autotekaConfirmEmailBottomSheetDialog;
        }

        public a() {
        }
    }

    /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$onCreateDialog$1", f = "AutotekaConfirmEmailBottomSheetDialog.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97222q;

        /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$onCreateDialog$1$1", f = "AutotekaConfirmEmailBottomSheetDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f97224q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AutotekaConfirmEmailBottomSheetDialog f97225r;

            /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$onCreateDialog$1$1$1", f = "AutotekaConfirmEmailBottomSheetDialog.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$b$a$a, reason: collision with other inner class name */
            public static final class C2901a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f97226q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutotekaConfirmEmailBottomSheetDialog f97227r;

                /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJf/d;", "it", "Lkotlin/G0;", "emit", "(LJf/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$b$a$a$a, reason: collision with other inner class name */
                public static final class C2902a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AutotekaConfirmEmailBottomSheetDialog f97228b;

                    public C2902a(AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog) {
                        this.f97228b = autotekaConfirmEmailBottomSheetDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Input input;
                        Jf.d dVar = (Jf.d) obj;
                        final AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog = this.f97228b;
                        final com.avito.android.autoteka.presentation.confirmEmail.b bVar = new com.avito.android.autoteka.presentation.confirmEmail.b(1, (com.avito.android.autoteka.presentation.confirmEmail.e) autotekaConfirmEmailBottomSheetDialog.f97216i0.getValue(), com.avito.android.autoteka.presentation.confirmEmail.e.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        Button button = autotekaConfirmEmailBottomSheetDialog.f97220m0;
                        if (button == null) {
                            button = null;
                        }
                        button.setLoading(dVar.f9094b);
                        Button button2 = autotekaConfirmEmailBottomSheetDialog.f97220m0;
                        if (button2 == null) {
                            button2 = null;
                        }
                        button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.autoteka.presentation.confirmEmail.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Input input2 = autotekaConfirmEmailBottomSheetDialog.f97218k0;
                                if (input2 == null) {
                                    input2 = null;
                                }
                                Object objM53getText = input2.m53getText();
                                if (objM53getText == null) {
                                    objM53getText = "";
                                }
                                ((b) bVar).invoke(new InterfaceC14191a.b(C43066x.A0(objM53getText.toString()).toString()));
                            }
                        });
                        Button button3 = autotekaConfirmEmailBottomSheetDialog.f97220m0;
                        if (button3 == null) {
                            button3 = null;
                        }
                        button3.setClickable(!dVar.f9094b);
                        k.a aVar = dVar.f9093a;
                        if (aVar instanceof k.a.C2871a) {
                            TextView textView = autotekaConfirmEmailBottomSheetDialog.f97219l0;
                            if (textView == null) {
                                textView = null;
                            }
                            textView.setText(((k.a.C2871a) aVar).f96666a.k0(autotekaConfirmEmailBottomSheetDialog.requireContext()));
                            TextView textView2 = autotekaConfirmEmailBottomSheetDialog.f97219l0;
                            if (textView2 == null) {
                                textView2 = null;
                            }
                            textView2.setVisibility(0);
                            Input input2 = autotekaConfirmEmailBottomSheetDialog.f97218k0;
                            input = input2 != null ? input2 : null;
                            Input.f179303W.getClass();
                            input.setState(Input.f179305b0);
                        } else {
                            TextView textView3 = autotekaConfirmEmailBottomSheetDialog.f97219l0;
                            if (textView3 == null) {
                                textView3 = null;
                            }
                            textView3.setVisibility(8);
                            Input input3 = autotekaConfirmEmailBottomSheetDialog.f97218k0;
                            input = input3 != null ? input3 : null;
                            Input.f179303W.getClass();
                            input.setState(Input.f179304a0);
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2901a(AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog, Continuation<? super C2901a> continuation) {
                    super(2, continuation);
                    this.f97227r = autotekaConfirmEmailBottomSheetDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2901a(this.f97227r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2901a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f97226q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog = this.f97227r;
                        n2<Jf.d> state = ((com.avito.android.autoteka.presentation.confirmEmail.e) autotekaConfirmEmailBottomSheetDialog.f97216i0.getValue()).getState();
                        C2902a c2902a = new C2902a(autotekaConfirmEmailBottomSheetDialog);
                        this.f97226q = 1;
                        if (state.collect(c2902a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$onCreateDialog$1$1$2", f = "AutotekaConfirmEmailBottomSheetDialog.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$b$a$b, reason: collision with other inner class name */
            public static final class C2903b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f97229q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutotekaConfirmEmailBottomSheetDialog f97230r;

                /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.autoteka.presentation.confirmEmail.AutotekaConfirmEmailBottomSheetDialog$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C2904a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AutotekaConfirmEmailBottomSheetDialog f97231b;

                    public C2904a(AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog) {
                        this.f97231b = autotekaConfirmEmailBottomSheetDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        Jf.c cVar = (Jf.c) obj;
                        a aVar = AutotekaConfirmEmailBottomSheetDialog.f97214n0;
                        AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog = this.f97231b;
                        if (L.f(cVar, c.a.f9089a)) {
                            autotekaConfirmEmailBottomSheetDialog.getParentFragmentManager().o0(C22777e.a(), "requestKeyEmailChange");
                            autotekaConfirmEmailBottomSheetDialog.dismiss();
                        } else if (cVar instanceof c.b) {
                            String strK0 = ((c.b) cVar).f9090a.k0(autotekaConfirmEmailBottomSheetDialog.requireContext());
                            Dialog dialog = autotekaConfirmEmailBottomSheetDialog.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                            if (dVar != null) {
                                com.avito.android.component.toast.c cVar2 = com.avito.android.component.toast.c.f125244a;
                                PrintableText printableTextF = com.avito.android.printable_text.b.f(strK0);
                                f.c.f125255c.getClass();
                                com.avito.android.component.toast.c.d(cVar2, dVar, printableTextF, null, f.c.a.b(), 10000, ToastBarPosition.f181046d, 910);
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f97231b, AutotekaConfirmEmailBottomSheetDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/autoteka/presentation/confirmEmail/mvi/entity/AutotekaConfirmEmailOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2903b(AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog, Continuation<? super C2903b> continuation) {
                    super(2, continuation);
                    this.f97230r = autotekaConfirmEmailBottomSheetDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C2903b(this.f97230r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2903b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f97229q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog = this.f97230r;
                        InterfaceC43160i<Jf.c> events = ((com.avito.android.autoteka.presentation.confirmEmail.e) autotekaConfirmEmailBottomSheetDialog.f97216i0.getValue()).getEvents();
                        C2904a c2904a = new C2904a(autotekaConfirmEmailBottomSheetDialog);
                        this.f97229q = 1;
                        if (events.collect(c2904a, this) == coroutine_suspended) {
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
            public a(AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f97225r = autotekaConfirmEmailBottomSheetDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f97225r, continuation);
                aVar.f97224q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f97224q;
                kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
                AbstractC43129d1 abstractC43129d1 = K.f411877a;
                AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog = this.f97225r;
                C43259k.d(t12, abstractC43129d1, null, new C2901a(autotekaConfirmEmailBottomSheetDialog, null), 2);
                C43259k.d(t12, abstractC43129d1, null, new C2903b(autotekaConfirmEmailBottomSheetDialog, null), 2);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return AutotekaConfirmEmailBottomSheetDialog.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97222q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog = AutotekaConfirmEmailBottomSheetDialog.this;
                a aVar = new a(autotekaConfirmEmailBottomSheetDialog, null);
                this.f97222q = 1;
                if (C23056p0.b(autotekaConfirmEmailBottomSheetDialog, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            AutotekaConfirmEmailBottomSheetDialog autotekaConfirmEmailBottomSheetDialog = AutotekaConfirmEmailBottomSheetDialog.this;
            Input input = autotekaConfirmEmailBottomSheetDialog.f97218k0;
            if (input == null) {
                input = null;
            }
            autotekaConfirmEmailBottomSheetDialog.f97217j0 = n.c(input, new com.avito.android.autoteka.presentation.confirmEmail.c(autotekaConfirmEmailBottomSheetDialog));
            return G0.f406611a;
        }
    }

    /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJf/a;", "it", "Lkotlin/G0;", "invoke", "(LJf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC14191a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14191a interfaceC14191a) {
            ((com.avito.android.autoteka.presentation.confirmEmail.e) AutotekaConfirmEmailBottomSheetDialog.this.f97216i0.getValue()).accept(interfaceC14191a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97234l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f97234l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f97234l);
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
            return AutotekaConfirmEmailBottomSheetDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f97236l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f97236l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f97236l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f97237l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f97237l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f97237l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f97238l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f97238l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f97238l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AutotekaConfirmEmailBottomSheetDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/confirmEmail/e;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/autoteka/presentation/confirmEmail/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.autoteka.presentation.confirmEmail.e> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.autoteka.presentation.confirmEmail.e invoke() {
            com.avito.android.autoteka.presentation.confirmEmail.f fVar = AutotekaConfirmEmailBottomSheetDialog.this.f97215h0;
            if (fVar == null) {
                fVar = null;
            }
            return (com.avito.android.autoteka.presentation.confirmEmail.e) fVar.get();
        }
    }

    public AutotekaConfirmEmailBottomSheetDialog() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f97216i0 = new O0(m0.f406844a.b(com.avito.android.autoteka.presentation.confirmEmail.e.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        ConfirmEmailDetails confirmEmailDetails;
        Bundle arguments = getArguments();
        if (arguments != null) {
            confirmEmailDetails = (ConfirmEmailDetails) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("ConfirmEmailDetails", ConfirmEmailDetails.class) : arguments.getParcelable("ConfirmEmailDetails"));
        } else {
            confirmEmailDetails = null;
        }
        if (confirmEmailDetails == null) {
            throw new IllegalArgumentException("confirmEmailDetails cannot be null");
        }
        com.avito.android.autoteka.di.confirmEmail.c.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.b(this), new d(), confirmEmailDetails).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23)), 0, 2, null);
        dVar.setContentView(R.layout.autoteka_confirm_email_fragment);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.setCancelable(true);
        Window window = dVar.getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, getString(R.string.autoteka_specify_email_address), true, 0, 0, 0, 120);
        this.f97218k0 = (Input) dVar.findViewById(R.id.autoteka_email_input);
        this.f97219l0 = (TextView) dVar.findViewById(R.id.autoteka_email_error);
        this.f97220m0 = (Button) dVar.findViewById(R.id.autoteka_confirm_email_resume);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.util.concurrent.b.f318855a.post(new B(4, new c()));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        s sVar = this.f97217j0;
        if (sVar != null) {
            Input input = this.f97218k0;
            if (input == null) {
                input = null;
            }
            input.h(sVar);
        }
    }
}
