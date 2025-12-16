package com.avito.android.mortgage.selected_appeal;

import Cd.C13243a;
import Y41.p;
import Y61.l;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.P;
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
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealComment;
import com.avito.android.mortgage.di.o;
import com.avito.android.mortgage.screens.MortgageSelectedAppealScreen;
import com.avito.android.mortgage.selected_appeal.a;
import com.avito.android.mortgage.selected_appeal.di.c;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealArguments;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealCreditInfoField;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealResult;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import javax.inject.Inject;
import k10.C42473c;
import k10.InterfaceC42471a;
import k10.InterfaceC42472b;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
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
import z1.AbstractC50339a;

/* compiled from: SelectedAppealDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/SelectedAppealDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectedAppealDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f203389n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f203390h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.selected_appeal.h f203391i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final O0 f203392j0;

    /* renamed from: k0, reason: collision with root package name */
    @l
    public com.avito.android.mortgage.selected_appeal.f f203393k0;

    /* renamed from: l0, reason: collision with root package name */
    @l
    public com.avito.android.mortgage.selected_appeal.a f203394l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.selected_appeal.e f203395m0;

    /* compiled from: SelectedAppealDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/SelectedAppealDialog$a;", "", "<init>", "()V", "", "SELECTED_APPEAL_RESULT", "Ljava/lang/String;", "SELECTED_APPEAL_RESULT_KEY", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SelectedAppealDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$a$a, reason: collision with other inner class name */
        public static final class C6047a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SelectedAppealArguments f203396l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6047a(SelectedAppealArguments selectedAppealArguments) {
                super(1);
                this.f203396l = selectedAppealArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("SELECTED_APPEAL_ARGS", this.f203396l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SelectedAppealDialog a(@Y61.k SelectedAppealArguments selectedAppealArguments) {
            SelectedAppealDialog selectedAppealDialog = new SelectedAppealDialog();
            C35966w1.a(selectedAppealDialog, -1, new C6047a(selectedAppealArguments));
            return selectedAppealDialog;
        }

        public a() {
        }
    }

    /* compiled from: SelectedAppealDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$onCreateDialog$1", f = "SelectedAppealDialog.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f203397q;

        /* compiled from: SelectedAppealDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$onCreateDialog$1$1", f = "SelectedAppealDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f203399q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SelectedAppealDialog f203400r;

            /* compiled from: SelectedAppealDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$onCreateDialog$1$1$1", f = "SelectedAppealDialog.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$b$a$a, reason: collision with other inner class name */
            public static final class C6048a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f203401q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectedAppealDialog f203402r;

                /* compiled from: SelectedAppealDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C6049a extends H implements Y41.l<C42473c, G0> {
                    public final void f(@Y61.k C42473c c42473c) {
                        SelectedAppealDialog selectedAppealDialog = (SelectedAppealDialog) this.receiver;
                        com.avito.android.mortgage.selected_appeal.f fVar = selectedAppealDialog.f203393k0;
                        if (fVar != null) {
                            ImageView imageView = fVar.f203434b;
                            ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
                            Drawable drawableU = D6.u(imageView, R.drawable.placeholder_circle_bg);
                            ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169473d;
                            aVar.f169492j = drawableU;
                            aVar.f169493k = scaleType;
                            aVar.f169485c = Integer.valueOf(R.drawable.placeholder_circle_bg);
                            aVar.f(Uri.parse(c42473c.f405995d));
                            aVar.c();
                        }
                        com.avito.android.mortgage.selected_appeal.f fVar2 = selectedAppealDialog.f203393k0;
                        if (fVar2 != null) {
                            fVar2.f203435c.setText(c42473c.f405996e);
                        }
                        com.avito.android.mortgage.selected_appeal.f fVar3 = selectedAppealDialog.f203393k0;
                        if (fVar3 != null) {
                            com.avito.android.util.text.j.a(fVar3.f203436d, c42473c.f405997f, null);
                        }
                        com.avito.android.mortgage.selected_appeal.a aVar2 = selectedAppealDialog.f203394l0;
                        if (aVar2 != null) {
                            int i12 = 0;
                            for (Object obj : aVar2.f203415a) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    C42745f0.H0();
                                    throw null;
                                }
                                a.C6052a c6052a = (a.C6052a) obj;
                                ViewGroup viewGroup = c6052a.f203418a;
                                SelectedAppealCreditInfoField selectedAppealCreditInfoField = (SelectedAppealCreditInfoField) C42745f0.K(i12, c42473c.f405998g);
                                if (selectedAppealCreditInfoField == null) {
                                    viewGroup.setVisibility(8);
                                } else {
                                    viewGroup.setVisibility(0);
                                    c6052a.f203419b.setText(selectedAppealCreditInfoField.f203449b);
                                    c6052a.f203420c.setText(selectedAppealCreditInfoField.f203450c);
                                }
                                i12 = i13;
                            }
                        }
                        com.avito.android.mortgage.selected_appeal.a aVar3 = selectedAppealDialog.f203394l0;
                        if (aVar3 != null) {
                            ApplicationAppealComment applicationAppealComment = c42473c.f405999h;
                            I5.a(aVar3.f203416b, applicationAppealComment != null ? applicationAppealComment.getTitle() : null, false);
                            com.avito.android.util.text.j.a(aVar3.f203417c, applicationAppealComment != null ? applicationAppealComment.getText() : null, null);
                        }
                        com.avito.android.mortgage.selected_appeal.e eVar = selectedAppealDialog.f203395m0;
                        Button button = eVar.f203432a;
                        if (button != null) {
                            com.avito.android.lib.design.button.b.a(button, c42473c.f406000i, false);
                        }
                        Button button2 = eVar.f203432a;
                        if (button2 != null) {
                            button2.setLoading(c42473c.f406003l);
                        }
                    }

                    @Override // Y41.l
                    public final /* bridge */ /* synthetic */ G0 invoke(C42473c c42473c) {
                        f(c42473c);
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6048a(SelectedAppealDialog selectedAppealDialog, Continuation<? super C6048a> continuation) {
                    super(2, continuation);
                    this.f203402r = selectedAppealDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6048a(this.f203402r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6048a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f203401q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        SelectedAppealDialog selectedAppealDialog = this.f203402r;
                        n2<C42473c> state = ((com.avito.android.mortgage.selected_appeal.g) selectedAppealDialog.f203392j0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = selectedAppealDialog.f203390h0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C6049a c6049a = new C6049a(1, selectedAppealDialog, SelectedAppealDialog.class, "renderState", "renderState(Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealState;)V", 0);
                        this.f203401q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c6049a, this) == coroutine_suspended) {
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

            /* compiled from: SelectedAppealDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$onCreateDialog$1$1$2", f = "SelectedAppealDialog.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$b$a$b, reason: collision with other inner class name */
            public static final class C6050b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f203403q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectedAppealDialog f203404r;

                /* compiled from: SelectedAppealDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.selected_appeal.SelectedAppealDialog$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C6051a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SelectedAppealDialog f203405b;

                    public C6051a(SelectedAppealDialog selectedAppealDialog) {
                        this.f203405b = selectedAppealDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC42472b interfaceC42472b = (InterfaceC42472b) obj;
                        a aVar = SelectedAppealDialog.f203389n0;
                        SelectedAppealDialog selectedAppealDialog = this.f203405b;
                        if (interfaceC42472b instanceof InterfaceC42472b.a) {
                            selectedAppealDialog.dismiss();
                        } else if (interfaceC42472b instanceof InterfaceC42472b.C11601b) {
                            selectedAppealDialog.getParentFragmentManager().o0(C22777e.b(new Q("SELECTED_APPEAL_RESULT", SelectedAppealResult.ReloadApplication.f203451b)), "SELECTED_APPEAL_RESULT_KEY");
                            selectedAppealDialog.dismiss();
                        } else if (interfaceC42472b instanceof InterfaceC42472b.c) {
                            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, selectedAppealDialog, ((InterfaceC42472b.c) interfaceC42472b).f405991a, null, null, null, 0, null, 1022);
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
                        return new C42801a(2, this.f203405b, SelectedAppealDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/selected_appeal/mvi/entity/SelectedAppealOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6050b(SelectedAppealDialog selectedAppealDialog, Continuation<? super C6050b> continuation) {
                    super(2, continuation);
                    this.f203404r = selectedAppealDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6050b(this.f203404r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6050b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f203403q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        SelectedAppealDialog selectedAppealDialog = this.f203404r;
                        InterfaceC43160i<InterfaceC42472b> events = ((com.avito.android.mortgage.selected_appeal.g) selectedAppealDialog.f203392j0.getValue()).getEvents();
                        C6051a c6051a = new C6051a(selectedAppealDialog);
                        this.f203403q = 1;
                        if (events.collect(c6051a, this) == coroutine_suspended) {
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
            public a(SelectedAppealDialog selectedAppealDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f203400r = selectedAppealDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f203400r, continuation);
                aVar.f203399q = obj;
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
                T t12 = (T) this.f203399q;
                SelectedAppealDialog selectedAppealDialog = this.f203400r;
                C43259k.d(t12, null, null, new C6048a(selectedAppealDialog, null), 3);
                C43259k.d(t12, null, null, new C6050b(selectedAppealDialog, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return SelectedAppealDialog.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f203397q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                SelectedAppealDialog selectedAppealDialog = SelectedAppealDialog.this;
                a aVar = new a(selectedAppealDialog, null);
                this.f203397q = 1;
                if (C23056p0.b(selectedAppealDialog, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SelectedAppealDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            ((com.avito.android.mortgage.selected_appeal.g) SelectedAppealDialog.this.f203392j0.getValue()).accept(InterfaceC42471a.C11600a.f405987a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectedAppealDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<View, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            com.avito.android.mortgage.selected_appeal.a aVar = new com.avito.android.mortgage.selected_appeal.a(view);
            SelectedAppealDialog selectedAppealDialog = SelectedAppealDialog.this;
            selectedAppealDialog.f203394l0 = aVar;
            ScreenPerformanceTracker screenPerformanceTracker = selectedAppealDialog.f203390h0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectedAppealDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<View, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            SelectedAppealDialog selectedAppealDialog = SelectedAppealDialog.this;
            com.avito.android.mortgage.selected_appeal.e eVar = selectedAppealDialog.f203395m0;
            eVar.getClass();
            eVar.f203432a = (Button) view.findViewById(R.id.select_bank);
            com.avito.android.mortgage.selected_appeal.b bVar = new com.avito.android.mortgage.selected_appeal.b(selectedAppealDialog);
            Button button = eVar.f203432a;
            if (button != null) {
                button.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(2, bVar));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f203409l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f203409l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f203409l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectedAppealDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f203411l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f203411l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f203411l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f203412l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f203412l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f203412l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f203413l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f203413l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f203413l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectedAppealDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/selected_appeal/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.mortgage.selected_appeal.g> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage.selected_appeal.g invoke() {
            com.avito.android.mortgage.selected_appeal.h hVar = SelectedAppealDialog.this.f203391i0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.mortgage.selected_appeal.g) hVar.get();
        }
    }

    public SelectedAppealDialog() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f203392j0 = new O0(m0.f406844a.b(com.avito.android.mortgage.selected_appeal.g.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f203395m0 = new com.avito.android.mortgage.selected_appeal.e();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgageSelectedAppealScreen.f203387d, s.b(this), null, 4, null);
        c.a aVarA = com.avito.android.mortgage.selected_appeal.di.a.a();
        o oVar = (o) C29972i.a(C29972i.b(this), o.class);
        Bundle bundleRequireArguments = requireArguments();
        aVarA.a(oVar, (SelectedAppealArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("SELECTED_APPEAL_ARGS", SelectedAppealArguments.class) : bundleRequireArguments.getParcelable("SELECTED_APPEAL_ARGS")), c28478k).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f203390h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f203390h0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f203390h0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
        View viewInflate = View.inflate(dVar.getContext(), R.layout.mortgage_selected_appeal_header_layout, null);
        com.avito.android.mortgage.selected_appeal.f fVar = new com.avito.android.mortgage.selected_appeal.f(viewInflate);
        this.f203393k0 = fVar;
        fVar.f203433a.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(3, new c()));
        dVar.H(viewInflate);
        dVar.B(R.layout.mortgage_selected_appeal_content_layout, R.layout.mortgage_selected_appeal_footer_layout, new d(), new e(), false);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f203390h0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f203393k0 = null;
        this.f203394l0 = null;
        this.f203395m0.f203432a = null;
    }
}
