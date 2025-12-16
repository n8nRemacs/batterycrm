package com.avito.android.comfortable_deal.select_agent;

import Cd.C13243a;
import Y41.p;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.P;
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
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.comfortable_deal.ComfortableDealSelectAgent;
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.L5;
import dq.InterfaceC39778a;
import dq.b;
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
import kotlin.jvm.internal.L;
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

/* compiled from: SelectAgentDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/SelectAgentDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SelectAgentDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f122641l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.select_agent.h f122642h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f122643i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f122644j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.comfortable_deal.select_agent.d f122645k0;

    /* compiled from: SelectAgentDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/SelectAgentDialog$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SelectAgentDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$a$a, reason: collision with other inner class name */
        public static final class C3631a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SelectAgentArguments f122646l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3631a(SelectAgentArguments selectAgentArguments) {
                super(1);
                this.f122646l = selectAgentArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("select_agent_data", this.f122646l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static SelectAgentDialog a(@Y61.k SelectAgentArguments selectAgentArguments) {
            SelectAgentDialog selectAgentDialog = new SelectAgentDialog();
            C35966w1.a(selectAgentDialog, -1, new C3631a(selectAgentArguments));
            return selectAgentDialog;
        }

        public a() {
        }
    }

    /* compiled from: SelectAgentDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comfortable_deal/select_agent/SelectAgentDialog$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, 0, 2, null);
        }

        @Override // androidx.view.r, android.app.Dialog
        @InterfaceC42830m
        public final void onBackPressed() {
            a aVar = SelectAgentDialog.f122641l0;
            SelectAgentDialog.this.f5();
            super.onBackPressed();
        }
    }

    /* compiled from: SelectAgentDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.comfortable_deal.select_agent.b) this.receiver).a(view);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectAgentDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.comfortable_deal.select_agent.b) this.receiver).b(view);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectAgentDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SelectAgentDialog.f122641l0;
            SelectAgentDialog.this.f5();
            return G0.f406611a;
        }
    }

    /* compiled from: SelectAgentDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$onCreateDialog$2$4", f = "SelectAgentDialog.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f122649q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f122650r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SelectAgentDialog f122651s;

        /* compiled from: SelectAgentDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$onCreateDialog$2$4$1", f = "SelectAgentDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f122652q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ SelectAgentDialog f122653r;

            /* compiled from: SelectAgentDialog.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$onCreateDialog$2$4$1$1", f = "SelectAgentDialog.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$a, reason: collision with other inner class name */
            public static final class C3632a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f122654q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectAgentDialog f122655r;

                /* compiled from: SelectAgentDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C3633a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.comfortable_deal.select_agent.b f122656b;

                    public C3633a(com.avito.android.comfortable_deal.select_agent.b bVar) {
                        this.f122656b = bVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f122656b.c((dq.d) obj);
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
                        return new C42801a(2, this.f122656b, com.avito.android.comfortable_deal.select_agent.b.class, "renderState", "renderState(Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentViewState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$a$b */
                public static final class b implements InterfaceC43160i<dq.d> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f122657b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$a$b$a, reason: collision with other inner class name */
                    public static final class C3634a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f122658b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$onCreateDialog$2$4$1$1$invokeSuspend$$inlined$map$1$2", f = "SelectAgentDialog.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C3635a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f122659q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f122660r;

                            public C3635a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f122659q = obj;
                                this.f122660r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C3634a.this.emit(null, this);
                            }
                        }

                        public C3634a(InterfaceC43172j interfaceC43172j) {
                            this.f122658b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.comfortable_deal.select_agent.SelectAgentDialog.f.a.C3632a.b.C3634a.C3635a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$a$b$a$a r0 = (com.avito.android.comfortable_deal.select_agent.SelectAgentDialog.f.a.C3632a.b.C3634a.C3635a) r0
                                int r1 = r0.f122660r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f122660r = r1
                                goto L18
                            L13:
                                com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$a$b$a$a r0 = new com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f122659q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f122660r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L43
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                dq.c r5 = (dq.c) r5
                                dq.d r5 = r5.f394088h
                                r0.f122660r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f122658b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.select_agent.SelectAgentDialog.f.a.C3632a.b.C3634a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public b(n2 n2Var) {
                        this.f122657b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super dq.d> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f122657b.collect(new C3634a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3632a(SelectAgentDialog selectAgentDialog, Continuation<? super C3632a> continuation) {
                    super(2, continuation);
                    this.f122655r = selectAgentDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C3632a(this.f122655r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C3632a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f122654q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        SelectAgentDialog selectAgentDialog = this.f122655r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new b(((com.avito.android.comfortable_deal.select_agent.g) selectAgentDialog.f122643i0.getValue()).getState()));
                        com.avito.android.comfortable_deal.select_agent.d dVar = selectAgentDialog.f122645k0;
                        if (dVar == null) {
                            dVar = null;
                        }
                        C3633a c3633a = new C3633a(dVar);
                        this.f122654q = 1;
                        if (interfaceC43160iR.collect(c3633a, this) == coroutine_suspended) {
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

            /* compiled from: SelectAgentDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$onCreateDialog$2$4$1$2", f = "SelectAgentDialog.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f122662q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ SelectAgentDialog f122663r;

                /* compiled from: SelectAgentDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.comfortable_deal.select_agent.SelectAgentDialog$f$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C3636a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ SelectAgentDialog f122664b;

                    public C3636a(SelectAgentDialog selectAgentDialog) {
                        this.f122664b = selectAgentDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        dq.b bVar = (dq.b) obj;
                        a aVar = SelectAgentDialog.f122641l0;
                        SelectAgentDialog selectAgentDialog = this.f122664b;
                        if (L.f(bVar, b.a.f394078a)) {
                            selectAgentDialog.f5();
                            selectAgentDialog.dismiss();
                        } else if (bVar instanceof b.C11036b) {
                            String strK0 = ((b.C11036b) bVar).f394079a.k0(selectAgentDialog.requireContext());
                            Context context = selectAgentDialog.getContext();
                            if (context != null) {
                                L5.b(context, strK0, 0);
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
                        return new C42801a(2, this.f122664b, SelectAgentDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/comfortable_deal/select_agent/mvi/entity/SelectAgentOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(SelectAgentDialog selectAgentDialog, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f122663r = selectAgentDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f122663r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f122662q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        SelectAgentDialog selectAgentDialog = this.f122663r;
                        InterfaceC43160i<dq.b> events = ((com.avito.android.comfortable_deal.select_agent.g) selectAgentDialog.f122643i0.getValue()).getEvents();
                        C3636a c3636a = new C3636a(selectAgentDialog);
                        this.f122662q = 1;
                        if (events.collect(c3636a, this) == coroutine_suspended) {
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
            public a(SelectAgentDialog selectAgentDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f122653r = selectAgentDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f122653r, continuation);
                aVar.f122652q = obj;
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
                T t12 = (T) this.f122652q;
                SelectAgentDialog selectAgentDialog = this.f122653r;
                C43259k.d(t12, null, null, new C3632a(selectAgentDialog, null), 3);
                C43259k.d(t12, null, null, new b(selectAgentDialog, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(b bVar, SelectAgentDialog selectAgentDialog, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f122650r = bVar;
            this.f122651s = selectAgentDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f122650r, this.f122651s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f122649q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f122651s, null);
                this.f122649q = 1;
                if (C23056p0.b(this.f122650r, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SelectAgentDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldq/a;", "it", "Lkotlin/G0;", "invoke", "(Ldq/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC39778a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC39778a interfaceC39778a) {
            ((com.avito.android.comfortable_deal.select_agent.g) SelectAgentDialog.this.f122643i0.getValue()).accept(interfaceC39778a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f122666l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f122666l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f122666l);
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
            return SelectAgentDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f122668l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f122668l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f122668l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f122669l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f122669l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f122669l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f122670l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f122670l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f122670l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectAgentDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/comfortable_deal/select_agent/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.comfortable_deal.select_agent.g> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.comfortable_deal.select_agent.g invoke() {
            com.avito.android.comfortable_deal.select_agent.h hVar = SelectAgentDialog.this.f122642h0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.comfortable_deal.select_agent.g) hVar.get();
        }
    }

    public SelectAgentDialog() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f122643i0 = new O0(m0.f406844a.b(com.avito.android.comfortable_deal.select_agent.g.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.comfortable_deal.select_agent.di.a.a().a((com.avito.android.comfortable_deal.di.a) C29972i.a(C29972i.b(this), com.avito.android.comfortable_deal.di.a.class), new C28478k(ComfortableDealSelectAgent.f119745d, s.b(this), null, 4, null), (SelectAgentArguments) requireArguments().getParcelable("select_agent_data"), new g()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f122644j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final void f5() {
        getParentFragmentManager().o0(new Bundle(), ((SelectAgentArguments) requireArguments().getParcelable("select_agent_data")).f122733b);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f122644j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        b bVar = new b(requireContext());
        com.avito.android.lib.design.bottom_sheet.d.I(bVar, true);
        com.avito.android.lib.design.bottom_sheet.d.M(bVar, null, false, true, 7);
        com.avito.android.comfortable_deal.select_agent.d dVar = this.f122645k0;
        c cVar = new c(1, dVar != null ? dVar : null, com.avito.android.comfortable_deal.select_agent.b.class, "attachContentView", "attachContentView(Landroid/view/View;)V", 0);
        com.avito.android.comfortable_deal.select_agent.d dVar2 = this.f122645k0;
        bVar.B(R.layout.select_agent_dialog, R.layout.select_agent_dialog_footer, cVar, new d(1, dVar2 != null ? dVar2 : null, com.avito.android.comfortable_deal.select_agent.b.class, "attachFooterView", "attachFooterView(Landroid/view/View;)V", 0), false);
        bVar.R(new e());
        C43259k.d(C22981N.a(bVar.getLifecycle()), null, null, new f(bVar, this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f122644j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.avito.android.comfortable_deal.select_agent.d dVar = this.f122645k0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.f122677d = null;
        dVar.f122678e = null;
    }
}
