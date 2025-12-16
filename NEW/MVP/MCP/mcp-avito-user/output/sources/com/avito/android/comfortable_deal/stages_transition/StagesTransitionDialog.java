package com.avito.android.comfortable_deal.stages_transition;

import Cd.C13243a;
import Y41.p;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.C;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
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
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.ComfortableDealStagesTransitionScreen;
import com.avito.android.comfortable_deal.date_time_pickers.date.DatePickerDialog;
import com.avito.android.comfortable_deal.date_time_pickers.date.model.DatePickerArguments;
import com.avito.android.comfortable_deal.date_time_pickers.time.TimePickerDialog;
import com.avito.android.comfortable_deal.date_time_pickers.time.model.TimePickerArguments;
import com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionArguments;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResult;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionResultStrategy;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.L5;
import fq.InterfaceC40463a;
import fq.InterfaceC40465c;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: StagesTransitionDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/StagesTransitionDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StagesTransitionDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public static final a f122782m0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.stages_transition.h f122783h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f122784i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f122785j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.stages_transition.mvi.builder.e f122786k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.stages_transition.d f122787l0;

    /* compiled from: StagesTransitionDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/StagesTransitionDialog$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: StagesTransitionDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$a$a, reason: collision with other inner class name */
        public static final class C3641a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ StagesTransitionArguments f122788l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3641a(StagesTransitionArguments stagesTransitionArguments) {
                super(1);
                this.f122788l = stagesTransitionArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("STAGES_TRANSITION_ARGUMENTS", this.f122788l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static StagesTransitionDialog a(@Y61.k StagesTransitionArguments stagesTransitionArguments) {
            StagesTransitionDialog stagesTransitionDialog = new StagesTransitionDialog();
            C35966w1.a(stagesTransitionDialog, -1, new C3641a(stagesTransitionArguments));
            return stagesTransitionDialog;
        }

        public a() {
        }
    }

    /* compiled from: StagesTransitionDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comfortable_deal/stages_transition/StagesTransitionDialog$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, 0, 2, null);
        }

        @Override // androidx.view.r, android.app.Dialog
        @InterfaceC42830m
        public final void onBackPressed() {
            a aVar = StagesTransitionDialog.f122782m0;
            StagesTransitionDialog.this.f5().accept(InterfaceC40463a.e.f396133a);
            super.onBackPressed();
        }
    }

    /* compiled from: StagesTransitionDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.comfortable_deal.stages_transition.c) this.receiver).a(view);
            return G0.f406611a;
        }
    }

    /* compiled from: StagesTransitionDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.comfortable_deal.stages_transition.c) this.receiver).b(view);
            return G0.f406611a;
        }
    }

    /* compiled from: StagesTransitionDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = StagesTransitionDialog.f122782m0;
            StagesTransitionDialog.this.f5().accept(InterfaceC40463a.e.f396133a);
            return G0.f406611a;
        }
    }

    /* compiled from: StagesTransitionDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$onCreateDialog$2$4", f = "StagesTransitionDialog.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122791q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f122792r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StagesTransitionDialog f122793s;

        /* compiled from: StagesTransitionDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$onCreateDialog$2$4$1", f = "StagesTransitionDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f122794q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StagesTransitionDialog f122795r;

            /* compiled from: StagesTransitionDialog.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$onCreateDialog$2$4$1$1", f = "StagesTransitionDialog.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$a, reason: collision with other inner class name */
            public static final class C3642a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f122796q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StagesTransitionDialog f122797r;

                /* compiled from: StagesTransitionDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C3643a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.comfortable_deal.stages_transition.c f122798b;

                    public C3643a(com.avito.android.comfortable_deal.stages_transition.c cVar) {
                        this.f122798b = cVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f122798b.c((fq.f) obj);
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
                        return new C42801a(2, this.f122798b, com.avito.android.comfortable_deal.stages_transition.c.class, "renderState", "renderState(Lcom/avito/android/comfortable_deal/stages_transition/mvi/entity/StagesTransitionViewState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$a$b */
                public static final class b implements InterfaceC43160i<fq.f> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f122799b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.comfortable_deal.stages_transition.mvi.builder.e f122800c;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$a$b$a, reason: collision with other inner class name */
                    public static final class C3644a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f122801b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ com.avito.android.comfortable_deal.stages_transition.mvi.builder.e f122802c;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$onCreateDialog$2$4$1$1$invokeSuspend$$inlined$map$1$2", f = "StagesTransitionDialog.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C3645a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f122803q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f122804r;

                            public C3645a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f122803q = obj;
                                this.f122804r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C3644a.this.emit(null, this);
                            }
                        }

                        public C3644a(InterfaceC43172j interfaceC43172j, com.avito.android.comfortable_deal.stages_transition.mvi.builder.e eVar) {
                            this.f122801b = interfaceC43172j;
                            this.f122802c = eVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC43172j
                        @Y61.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog.f.a.C3642a.b.C3644a.C3645a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$a$b$a$a r0 = (com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog.f.a.C3642a.b.C3644a.C3645a) r0
                                int r1 = r0.f122804r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f122804r = r1
                                goto L18
                            L13:
                                com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$a$b$a$a r0 = new com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f122803q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f122804r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L47
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                fq.d r5 = (fq.d) r5
                                com.avito.android.comfortable_deal.stages_transition.mvi.builder.e r6 = r4.f122802c
                                fq.f r5 = r6.a(r5)
                                r0.f122804r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f122801b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L47
                                return r1
                            L47:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog.f.a.C3642a.b.C3644a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public b(n2 n2Var, com.avito.android.comfortable_deal.stages_transition.mvi.builder.e eVar) {
                        this.f122799b = n2Var;
                        this.f122800c = eVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super fq.f> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f122799b.collect(new C3644a(interfaceC43172j, this.f122800c), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3642a(StagesTransitionDialog stagesTransitionDialog, Continuation<? super C3642a> continuation) {
                    super(2, continuation);
                    this.f122797r = stagesTransitionDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3642a(this.f122797r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3642a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f122796q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StagesTransitionDialog.f122782m0;
                        StagesTransitionDialog stagesTransitionDialog = this.f122797r;
                        n2<fq.d> state = stagesTransitionDialog.f5().getState();
                        com.avito.android.comfortable_deal.stages_transition.mvi.builder.e eVar = stagesTransitionDialog.f122786k0;
                        if (eVar == null) {
                            eVar = null;
                        }
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new b(state, eVar));
                        com.avito.android.comfortable_deal.stages_transition.d dVar = stagesTransitionDialog.f122787l0;
                        C3643a c3643a = new C3643a(dVar != null ? dVar : null);
                        this.f122796q = 1;
                        if (interfaceC43160iR.collect(c3643a, this) == coroutine_suspended) {
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

            /* compiled from: StagesTransitionDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$onCreateDialog$2$4$1$2", f = "StagesTransitionDialog.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f122806q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StagesTransitionDialog f122807r;

                /* compiled from: StagesTransitionDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.stages_transition.StagesTransitionDialog$f$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3646a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StagesTransitionDialog f122808b;

                    public C3646a(StagesTransitionDialog stagesTransitionDialog) {
                        this.f122808b = stagesTransitionDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC40465c interfaceC40465c = (InterfaceC40465c) obj;
                        a aVar = StagesTransitionDialog.f122782m0;
                        StagesTransitionDialog stagesTransitionDialog = this.f122808b;
                        if (interfaceC40465c instanceof InterfaceC40465c.a) {
                            StagesTransitionResult stagesTransitionResult = ((InterfaceC40465c.a) interfaceC40465c).f396149a;
                            FragmentManager parentFragmentManager = stagesTransitionDialog.getParentFragmentManager();
                            StagesTransitionArguments stagesTransitionArguments = (StagesTransitionArguments) stagesTransitionDialog.requireArguments().getParcelable("STAGES_TRANSITION_ARGUMENTS");
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("result.key", stagesTransitionResult);
                            G0 g02 = G0.f406611a;
                            parentFragmentManager.o0(bundle, stagesTransitionArguments.f122952b);
                            if (stagesTransitionResult.f122956b == StagesTransitionResultStrategy.f122959b) {
                                stagesTransitionDialog.getParentFragmentManager().o0(Bundle.EMPTY, "reload_clients_list_request");
                            }
                            stagesTransitionDialog.dismiss();
                        } else if (interfaceC40465c instanceof InterfaceC40465c.C11178c) {
                            String strK0 = ((InterfaceC40465c.C11178c) interfaceC40465c).f396151a.k0(stagesTransitionDialog.requireContext());
                            Context context = stagesTransitionDialog.getContext();
                            if (context != null) {
                                L5.b(context, strK0, 0);
                            }
                        } else if (interfaceC40465c instanceof InterfaceC40465c.b) {
                            DatePickerDialog.a aVar2 = DatePickerDialog.f120906l0;
                            DatePickerArguments datePickerArguments = new DatePickerArguments("REQUEST_DATE_PICKER", ((InterfaceC40465c.b) interfaceC40465c).f396150a);
                            aVar2.getClass();
                            DatePickerDialog.a.a(datePickerArguments).show(stagesTransitionDialog.getParentFragmentManager(), "DatePickerDialog");
                        } else if (interfaceC40465c instanceof InterfaceC40465c.d) {
                            TimePickerDialog.a aVar3 = TimePickerDialog.f120922l0;
                            TimePickerArguments timePickerArguments = new TimePickerArguments("REQUEST_TIME_PICKER", ((InterfaceC40465c.d) interfaceC40465c).f396152a);
                            aVar3.getClass();
                            TimePickerDialog.a.a(timePickerArguments).show(stagesTransitionDialog.getParentFragmentManager(), "TimePickerDialog");
                        }
                        G0 g03 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g03;
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
                        return new C42801a(2, this.f122808b, StagesTransitionDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/stages_transition/mvi/entity/StagesTransitionOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(StagesTransitionDialog stagesTransitionDialog, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f122807r = stagesTransitionDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f122807r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f122806q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StagesTransitionDialog.f122782m0;
                        StagesTransitionDialog stagesTransitionDialog = this.f122807r;
                        InterfaceC43160i<InterfaceC40465c> events = stagesTransitionDialog.f5().getEvents();
                        C3646a c3646a = new C3646a(stagesTransitionDialog);
                        this.f122806q = 1;
                        if (events.collect(c3646a, this) == coroutine_suspended) {
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
            public a(StagesTransitionDialog stagesTransitionDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f122795r = stagesTransitionDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f122795r, continuation);
                aVar.f122794q = obj;
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
                T t12 = (T) this.f122794q;
                StagesTransitionDialog stagesTransitionDialog = this.f122795r;
                C43259k.d(t12, null, null, new C3642a(stagesTransitionDialog, null), 3);
                C43259k.d(t12, null, null, new b(stagesTransitionDialog, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar, StagesTransitionDialog stagesTransitionDialog, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f122792r = bVar;
            this.f122793s = stagesTransitionDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f122792r, this.f122793s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122791q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f122793s, null);
                this.f122791q = 1;
                if (C23056p0.b(this.f122792r, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StagesTransitionDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfq/a;", "it", "Lkotlin/G0;", "invoke", "(Lfq/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC40463a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40463a interfaceC40463a) {
            a aVar = StagesTransitionDialog.f122782m0;
            StagesTransitionDialog.this.f5().accept(interfaceC40463a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f122810l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f122810l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f122810l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StagesTransitionDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f122812l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f122812l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f122812l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f122813l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f122813l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f122813l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f122814l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f122814l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f122814l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StagesTransitionDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/comfortable_deal/stages_transition/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.comfortable_deal.stages_transition.g> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.comfortable_deal.stages_transition.g invoke() {
            com.avito.android.comfortable_deal.stages_transition.h hVar = StagesTransitionDialog.this.f122783h0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.comfortable_deal.stages_transition.g) hVar.get();
        }
    }

    public StagesTransitionDialog() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f122784i0 = new O0(m0.f406844a.b(com.avito.android.comfortable_deal.stages_transition.g.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.stages_transition.di.a.a().a((com.avito.android.comfortable_deal.di.a) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.di.a.class), new C28478k(ComfortableDealStagesTransitionScreen.f119747d, s.b(this), null, 4, null), (StagesTransitionArguments) requireArguments().getParcelable("STAGES_TRANSITION_ARGUMENTS"), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f122785j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.comfortable_deal.stages_transition.g f5() {
        return (com.avito.android.comfortable_deal.stages_transition.g) this.f122784i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f122785j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        final int i12 = 0;
        getParentFragmentManager().p0("REQUEST_DATE_PICKER", this, new C(this) { // from class: com.avito.android.comfortable_deal.stages_transition.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StagesTransitionDialog f122817c;

            {
                this.f122817c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                StagesTransitionDialog stagesTransitionDialog = this.f122817c;
                switch (i12) {
                    case 0:
                        StagesTransitionDialog.a aVar = StagesTransitionDialog.f122782m0;
                        DatePickerDialog.f120906l0.getClass();
                        Serializable serializable = bundle2.getSerializable("result.key");
                        stagesTransitionDialog.f5().accept(new InterfaceC40463a.d(serializable instanceof org.threeten.bp.e ? (org.threeten.bp.e) serializable : null));
                        break;
                    default:
                        StagesTransitionDialog.a aVar2 = StagesTransitionDialog.f122782m0;
                        TimePickerDialog.f120922l0.getClass();
                        Serializable serializable2 = bundle2.getSerializable("result.key");
                        stagesTransitionDialog.f5().accept(new InterfaceC40463a.i(serializable2 instanceof org.threeten.bp.g ? (org.threeten.bp.g) serializable2 : null));
                        break;
                }
            }
        });
        final int i13 = 1;
        getParentFragmentManager().p0("REQUEST_TIME_PICKER", this, new C(this) { // from class: com.avito.android.comfortable_deal.stages_transition.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StagesTransitionDialog f122817c;

            {
                this.f122817c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                StagesTransitionDialog stagesTransitionDialog = this.f122817c;
                switch (i13) {
                    case 0:
                        StagesTransitionDialog.a aVar = StagesTransitionDialog.f122782m0;
                        DatePickerDialog.f120906l0.getClass();
                        Serializable serializable = bundle2.getSerializable("result.key");
                        stagesTransitionDialog.f5().accept(new InterfaceC40463a.d(serializable instanceof org.threeten.bp.e ? (org.threeten.bp.e) serializable : null));
                        break;
                    default:
                        StagesTransitionDialog.a aVar2 = StagesTransitionDialog.f122782m0;
                        TimePickerDialog.f120922l0.getClass();
                        Serializable serializable2 = bundle2.getSerializable("result.key");
                        stagesTransitionDialog.f5().accept(new InterfaceC40463a.i(serializable2 instanceof org.threeten.bp.g ? (org.threeten.bp.g) serializable2 : null));
                        break;
                }
            }
        });
        b bVar = new b(requireContext());
        com.avito.android.comfortable_deal.stages_transition.d dVar = this.f122787l0;
        c cVar = new c(1, dVar != null ? dVar : null, com.avito.android.comfortable_deal.stages_transition.c.class, "attachContentView", "attachContentView(Landroid/view/View;)V", 0);
        com.avito.android.comfortable_deal.stages_transition.d dVar2 = this.f122787l0;
        bVar.B(R.layout.stages_transition_dialog, R.layout.common_comment_dialog_footer, cVar, new d(1, dVar2 != null ? dVar2 : null, com.avito.android.comfortable_deal.stages_transition.c.class, "attachFooterView", "attachFooterView(Landroid/view/View;)V", 0), false);
        com.avito.android.lib.design.bottom_sheet.d.M(bVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.d.I(bVar, true);
        bVar.f178527u = true;
        bVar.R(new e());
        C43259k.d(C22981N.a(bVar.getLifecycle()), null, null, new f(bVar, this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f122785j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.avito.android.comfortable_deal.stages_transition.d dVar = this.f122787l0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f122821d = null;
        dVar.f122822e = null;
    }
}
