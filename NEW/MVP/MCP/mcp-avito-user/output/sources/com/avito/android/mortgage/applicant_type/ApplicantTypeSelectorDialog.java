package com.avito.android.mortgage.applicant_type;

import Cd.C13243a;
import PZ.b;
import Y41.l;
import Y41.p;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
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
import com.avito.android.analytics.screens.MortgageApplicantTypeSelectorScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.mortgage.applicant_type.di.a;
import com.avito.android.mortgage.applicant_type.model.ApplicantType;
import com.avito.android.mortgage.applicant_type.model.ApplicantTypeSelectorArguments;
import com.avito.android.mortgage.di.o;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
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
import z1.AbstractC50339a;

/* compiled from: ApplicantTypeSelectorDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/ApplicantTypeSelectorDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicantTypeSelectorDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f198265l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.mortgage.applicant_type.g f198266h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f198267i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f198268j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.applicant_type.b f198269k0;

    /* compiled from: ApplicantTypeSelectorDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/ApplicantTypeSelectorDialog$a;", "", "<init>", "()V", "", "APPLICANT_TYPE", "Ljava/lang/String;", "APPLICANT_TYPE_SELECTOR_ARGS", "APPLICANT_TYPE_SELECTOR_KEY", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ApplicantTypeSelectorDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog$a$a, reason: collision with other inner class name */
        public static final class C5843a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ApplicantTypeSelectorArguments f198270l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5843a(ApplicantTypeSelectorArguments applicantTypeSelectorArguments) {
                super(1);
                this.f198270l = applicantTypeSelectorArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("APPLICANT_TYPE_SELECTOR_ARGS", this.f198270l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ApplicantTypeSelectorDialog a(@Y61.k ApplicantTypeSelectorArguments applicantTypeSelectorArguments) {
            ApplicantTypeSelectorDialog applicantTypeSelectorDialog = new ApplicantTypeSelectorDialog();
            C35966w1.a(applicantTypeSelectorDialog, -1, new C5843a(applicantTypeSelectorArguments));
            return applicantTypeSelectorDialog;
        }

        public a() {
        }
    }

    /* compiled from: ApplicantTypeSelectorDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ApplicantType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<ApplicantType> creator = ApplicantType.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ApplicantTypeSelectorDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog$onCreateDialog$1", f = "ApplicantTypeSelectorDialog.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f198271q;

        /* compiled from: ApplicantTypeSelectorDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog$onCreateDialog$1$1", f = "ApplicantTypeSelectorDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f198273q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ApplicantTypeSelectorDialog f198274r;

            /* compiled from: ApplicantTypeSelectorDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog$onCreateDialog$1$1$1", f = "ApplicantTypeSelectorDialog.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog$c$a$a, reason: collision with other inner class name */
            public static final class C5844a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f198275q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ApplicantTypeSelectorDialog f198276r;

                /* compiled from: ApplicantTypeSelectorDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C5845a extends H implements l<PZ.c, G0> {
                    @Override // Y41.l
                    public final G0 invoke(PZ.c cVar) {
                        ApplicantTypeSelectorDialog applicantTypeSelectorDialog = (ApplicantTypeSelectorDialog) this.receiver;
                        a aVar = ApplicantTypeSelectorDialog.f198265l0;
                        applicantTypeSelectorDialog.getClass();
                        int iOrdinal = cVar.f13142d.ordinal();
                        com.avito.android.mortgage.applicant_type.b bVar = applicantTypeSelectorDialog.f198269k0;
                        if (iOrdinal == 0) {
                            ListItemRadio listItemRadio = bVar.f198291a;
                            if (listItemRadio != null) {
                                listItemRadio.setChecked(true);
                            }
                            ListItemRadio listItemRadio2 = bVar.f198292b;
                            if (listItemRadio2 != null) {
                                listItemRadio2.setChecked(false);
                            }
                        } else if (iOrdinal == 1) {
                            ListItemRadio listItemRadio3 = bVar.f198291a;
                            if (listItemRadio3 != null) {
                                listItemRadio3.setChecked(false);
                            }
                            ListItemRadio listItemRadio4 = bVar.f198292b;
                            if (listItemRadio4 != null) {
                                listItemRadio4.setChecked(true);
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C5844a(ApplicantTypeSelectorDialog applicantTypeSelectorDialog, Continuation<? super C5844a> continuation) {
                    super(2, continuation);
                    this.f198276r = applicantTypeSelectorDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C5844a(this.f198276r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C5844a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f198275q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ApplicantTypeSelectorDialog applicantTypeSelectorDialog = this.f198276r;
                        n2<PZ.c> state = ((com.avito.android.mortgage.applicant_type.f) applicantTypeSelectorDialog.f198267i0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = applicantTypeSelectorDialog.f198268j0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C5845a c5845a = new C5845a(1, applicantTypeSelectorDialog, ApplicantTypeSelectorDialog.class, "renderState", "renderState(Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorState;)V", 0);
                        this.f198275q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c5845a, this) == coroutine_suspended) {
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

            /* compiled from: ApplicantTypeSelectorDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog$onCreateDialog$1$1$2", f = "ApplicantTypeSelectorDialog.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f198277q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ApplicantTypeSelectorDialog f198278r;

                /* compiled from: ApplicantTypeSelectorDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.mortgage.applicant_type.ApplicantTypeSelectorDialog$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C5846a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ApplicantTypeSelectorDialog f198279b;

                    public C5846a(ApplicantTypeSelectorDialog applicantTypeSelectorDialog) {
                        this.f198279b = applicantTypeSelectorDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        PZ.b bVar = (PZ.b) obj;
                        a aVar = ApplicantTypeSelectorDialog.f198265l0;
                        ApplicantTypeSelectorDialog applicantTypeSelectorDialog = this.f198279b;
                        applicantTypeSelectorDialog.getClass();
                        if (bVar instanceof b.a) {
                            applicantTypeSelectorDialog.getParentFragmentManager().o0(C22777e.b(new Q("APPLICANT_TYPE", ((b.a) bVar).f13137a)), "APPLICANT_TYPE_SELECTOR_KEY");
                            applicantTypeSelectorDialog.dismiss();
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
                        return new C42801a(2, this.f198279b, ApplicantTypeSelectorDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/mortgage/applicant_type/mvi/entity/ApplicantTypeSelectorOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ApplicantTypeSelectorDialog applicantTypeSelectorDialog, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f198278r = applicantTypeSelectorDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f198278r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f198277q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ApplicantTypeSelectorDialog applicantTypeSelectorDialog = this.f198278r;
                        InterfaceC43160i<PZ.b> events = ((com.avito.android.mortgage.applicant_type.f) applicantTypeSelectorDialog.f198267i0.getValue()).getEvents();
                        C5846a c5846a = new C5846a(applicantTypeSelectorDialog);
                        this.f198277q = 1;
                        if (events.collect(c5846a, this) == coroutine_suspended) {
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
            public a(ApplicantTypeSelectorDialog applicantTypeSelectorDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f198274r = applicantTypeSelectorDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f198274r, continuation);
                aVar.f198273q = obj;
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
                T t12 = (T) this.f198273q;
                ApplicantTypeSelectorDialog applicantTypeSelectorDialog = this.f198274r;
                C43259k.d(t12, null, null, new C5844a(applicantTypeSelectorDialog, null), 3);
                C43259k.d(t12, null, null, new b(applicantTypeSelectorDialog, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ApplicantTypeSelectorDialog.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f198271q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ApplicantTypeSelectorDialog applicantTypeSelectorDialog = ApplicantTypeSelectorDialog.this;
                a aVar = new a(applicantTypeSelectorDialog, null);
                this.f198271q = 1;
                if (C23056p0.b(applicantTypeSelectorDialog, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ApplicantTypeSelectorDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<View, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ApplicantTypeSelectorDialog applicantTypeSelectorDialog = ApplicantTypeSelectorDialog.this;
            com.avito.android.mortgage.applicant_type.b bVar = applicantTypeSelectorDialog.f198269k0;
            bVar.getClass();
            View viewFindViewById = view2.findViewById(R.id.spouse_applicant);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemRadio");
            }
            bVar.f198291a = (ListItemRadio) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.general_applicant);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemRadio");
            }
            bVar.f198292b = (ListItemRadio) viewFindViewById2;
            com.avito.android.mortgage.applicant_type.c cVar = new com.avito.android.mortgage.applicant_type.c(applicantTypeSelectorDialog);
            com.avito.android.mortgage.applicant_type.d dVar = new com.avito.android.mortgage.applicant_type.d(applicantTypeSelectorDialog);
            ListItemRadio listItemRadio = bVar.f198291a;
            if (listItemRadio != null) {
                listItemRadio.setOnClickListener(new com.avito.android.lib.design.list_item.a(29, cVar));
            }
            ListItemRadio listItemRadio2 = bVar.f198292b;
            if (listItemRadio2 != null) {
                listItemRadio2.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(0, dVar));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicantTypeSelectorDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<View, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TZ.b f198282m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TZ.b bVar) {
            super(1);
            this.f198282m = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            View viewFindViewById = view2.findViewById(R.id.footer_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.footer_secondary_button);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button2 = (Button) viewFindViewById2;
            D6.G(button2, true);
            button.setText(R.string.applicant_type_selector_accept);
            button2.setText(R.string.applicant_type_selector_decline);
            button.setOnClickListener(new ViewOnClickListenerC31873b(ApplicantTypeSelectorDialog.this, 11));
            button2.setOnClickListener(new TZ.a(this.f198282m, 1));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f198283l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f198283l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f198283l);
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
            return ApplicantTypeSelectorDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f198285l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f198285l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f198285l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f198286l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f198286l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f198286l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f198287l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f198287l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f198287l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ApplicantTypeSelectorDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/applicant_type/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.mortgage.applicant_type.f> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.mortgage.applicant_type.f invoke() {
            com.avito.android.mortgage.applicant_type.g gVar = ApplicantTypeSelectorDialog.this.f198266h0;
            if (gVar == null) {
                gVar = null;
            }
            return (com.avito.android.mortgage.applicant_type.f) gVar.get();
        }
    }

    public ApplicantTypeSelectorDialog() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f198267i0 = new O0(m0.f406844a.b(com.avito.android.mortgage.applicant_type.f.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f198269k0 = new com.avito.android.mortgage.applicant_type.b();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgageApplicantTypeSelectorScreen.f90414d, s.b(this), null, 4, null);
        a.InterfaceC5847a interfaceC5847aA = com.avito.android.mortgage.applicant_type.di.c.a();
        o oVar = (o) C29972i.a(C29972i.b(this), o.class);
        Bundle bundleRequireArguments = requireArguments();
        interfaceC5847aA.a(oVar, (ApplicantTypeSelectorArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("APPLICANT_TYPE_SELECTOR_ARGS", ApplicantTypeSelectorArguments.class) : bundleRequireArguments.getParcelable("APPLICANT_TYPE_SELECTOR_ARGS")), c28478k).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f198268j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f198268j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        TZ.b bVar = new TZ.b(requireContext(), null, 2, null);
        bVar.B(R.layout.applicant_type_selector_content, R.layout.button_footer_layout, new d(), new e(bVar), false);
        bVar.setTitle(R.string.applicant_type_selector_title);
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(true);
        bVar.S(C35835l0.g(bVar.getContext()).y);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f198268j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.avito.android.mortgage.applicant_type.b bVar = this.f198269k0;
        bVar.f198291a = null;
        bVar.f198292b = null;
    }
}
