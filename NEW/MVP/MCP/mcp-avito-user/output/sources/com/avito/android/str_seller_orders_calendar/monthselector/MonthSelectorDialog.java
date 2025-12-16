package com.avito.android.str_seller_orders_calendar.monthselector;

import Cd.C13243a;
import Mz0.C14552d;
import Mz0.InterfaceC14549a;
import Mz0.InterfaceC14550b;
import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
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

/* compiled from: MonthSelectorDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/MonthSelectorDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MonthSelectorDialog extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: l0, reason: collision with root package name */
    @k
    public static final a f290373l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_seller_orders_calendar.monthselector.e f290374h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final O0 f290375i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f290376j0;

    /* renamed from: k0, reason: collision with root package name */
    public RecyclerView f290377k0;

    /* compiled from: MonthSelectorDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/MonthSelectorDialog$a;", "", "<init>", "()V", "", "MONTH_SELECTOR_RESULT_ID", "Ljava/lang/String;", "SELECTED_MONTH_ID_KEY", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: MonthSelectorDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$a$a, reason: collision with other inner class name */
        public static final class C8763a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f290378l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8763a(String str) {
                super(1);
                this.f290378l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("selected_month_id", this.f290378l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static MonthSelectorDialog a(@Y61.l String str) {
            MonthSelectorDialog monthSelectorDialog = new MonthSelectorDialog();
            C35966w1.a(monthSelectorDialog, -1, new C8763a(str));
            return monthSelectorDialog;
        }

        public a() {
        }
    }

    /* compiled from: MonthSelectorDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$onCreateDialog$1", f = "MonthSelectorDialog.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290379q;

        /* compiled from: MonthSelectorDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$onCreateDialog$1$1", f = "MonthSelectorDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f290381q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ MonthSelectorDialog f290382r;

            /* compiled from: MonthSelectorDialog.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$onCreateDialog$1$1$1", f = "MonthSelectorDialog.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$a, reason: collision with other inner class name */
            public static final class C8764a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290383q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ MonthSelectorDialog f290384r;

                /* compiled from: MonthSelectorDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C8765a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MonthSelectorDialog f290385b;

                    public C8765a(MonthSelectorDialog monthSelectorDialog) {
                        this.f290385b = monthSelectorDialog;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        C14552d c14552d = (C14552d) obj;
                        com.avito.konveyor.adapter.d dVar = this.f290385b.f290376j0;
                        B b12 = dVar;
                        if (dVar == null) {
                            b12 = 0;
                        }
                        b12.l(c14552d.f11166b, null);
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
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f290385b, MonthSelectorDialog.class, "render", "render(Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorViewState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$a$b, reason: collision with other inner class name */
                public static final class C8766b implements InterfaceC43160i<C14552d> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f290386b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$a$b$a, reason: collision with other inner class name */
                    public static final class C8767a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f290387b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$onCreateDialog$1$1$1$invokeSuspend$$inlined$map$1$2", f = "MonthSelectorDialog.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C8768a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f290388q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f290389r;

                            public C8768a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@k Object obj) {
                                this.f290388q = obj;
                                this.f290389r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C8767a.this.emit(null, this);
                            }
                        }

                        public C8767a(InterfaceC43172j interfaceC43172j) {
                            this.f290387b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog.b.a.C8764a.C8766b.C8767a.C8768a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$a$b$a$a r0 = (com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog.b.a.C8764a.C8766b.C8767a.C8768a) r0
                                int r1 = r0.f290389r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f290389r = r1
                                goto L18
                            L13:
                                com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$a$b$a$a r0 = new com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f290388q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f290389r
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
                                Mz0.c r5 = (Mz0.C14551c) r5
                                Mz0.d r5 = r5.f11162e
                                r0.f290389r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f290387b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog.b.a.C8764a.C8766b.C8767a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public C8766b(n2 n2Var) {
                        this.f290386b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@k InterfaceC43172j<? super C14552d> interfaceC43172j, @k Continuation continuation) {
                        Object objCollect = this.f290386b.collect(new C8767a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8764a(MonthSelectorDialog monthSelectorDialog, Continuation<? super C8764a> continuation) {
                    super(2, continuation);
                    this.f290384r = monthSelectorDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C8764a(this.f290384r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8764a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290383q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        MonthSelectorDialog monthSelectorDialog = this.f290384r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new C8766b(((com.avito.android.str_seller_orders_calendar.monthselector.d) monthSelectorDialog.f290375i0.getValue()).getState()));
                        C8765a c8765a = new C8765a(monthSelectorDialog);
                        this.f290383q = 1;
                        if (interfaceC43160iR.collect(c8765a, this) == coroutine_suspended) {
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

            /* compiled from: MonthSelectorDialog.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$onCreateDialog$1$1$2", f = "MonthSelectorDialog.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$b, reason: collision with other inner class name */
            public static final class C8769b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290391q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ MonthSelectorDialog f290392r;

                /* compiled from: MonthSelectorDialog.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8770a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MonthSelectorDialog f290393b;

                    public C8770a(MonthSelectorDialog monthSelectorDialog) {
                        this.f290393b = monthSelectorDialog;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC14550b interfaceC14550b = (InterfaceC14550b) obj;
                        a aVar = MonthSelectorDialog.f290373l0;
                        MonthSelectorDialog monthSelectorDialog = this.f290393b;
                        if (interfaceC14550b instanceof InterfaceC14550b.c) {
                            RecyclerView recyclerView = monthSelectorDialog.f290377k0;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            recyclerView.post(new RunnableC34589p(14, monthSelectorDialog, interfaceC14550b));
                        } else if (interfaceC14550b instanceof InterfaceC14550b.a) {
                            monthSelectorDialog.dismiss();
                        } else if (interfaceC14550b instanceof InterfaceC14550b.C0716b) {
                            monthSelectorDialog.getParentFragmentManager().o0(C22777e.b(new Q("selected_month_id", ((InterfaceC14550b.C0716b) interfaceC14550b).f11155a)), "month_selector_result");
                            monthSelectorDialog.dismiss();
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
                    @k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f290393b, MonthSelectorDialog.class, "handleEvent", "handleEvent(Lcom/avito/android/str_seller_orders_calendar/monthselector/mvi/entity/MonthSelectorOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8769b(MonthSelectorDialog monthSelectorDialog, Continuation<? super C8769b> continuation) {
                    super(2, continuation);
                    this.f290392r = monthSelectorDialog;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C8769b(this.f290392r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8769b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290391q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        MonthSelectorDialog monthSelectorDialog = this.f290392r;
                        InterfaceC43160i<InterfaceC14550b> events = ((com.avito.android.str_seller_orders_calendar.monthselector.d) monthSelectorDialog.f290375i0.getValue()).getEvents();
                        C8770a c8770a = new C8770a(monthSelectorDialog);
                        this.f290391q = 1;
                        if (events.collect(c8770a, this) == coroutine_suspended) {
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
            public a(MonthSelectorDialog monthSelectorDialog, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f290382r = monthSelectorDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f290382r, continuation);
                aVar.f290381q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f290381q;
                MonthSelectorDialog monthSelectorDialog = this.f290382r;
                C43259k.d(t12, null, null, new C8764a(monthSelectorDialog, null), 3);
                C43259k.d(t12, null, null, new C8769b(monthSelectorDialog, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return MonthSelectorDialog.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f290379q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                MonthSelectorDialog monthSelectorDialog = MonthSelectorDialog.this;
                a aVar = new a(monthSelectorDialog, null);
                this.f290379q = 1;
                if (C23056p0.b(monthSelectorDialog, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: MonthSelectorDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LMz0/a;", "it", "Lkotlin/G0;", "invoke", "(LMz0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<InterfaceC14549a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14549a interfaceC14549a) {
            ((com.avito.android.str_seller_orders_calendar.monthselector.d) MonthSelectorDialog.this.f290375i0.getValue()).accept(interfaceC14549a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f290395l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f290395l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f290395l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return MonthSelectorDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f290397l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f290397l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f290397l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f290398l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f290398l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f290398l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f290399l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f290399l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f290399l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: MonthSelectorDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/monthselector/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders_calendar/monthselector/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.str_seller_orders_calendar.monthselector.d> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.str_seller_orders_calendar.monthselector.d invoke() {
            com.avito.android.str_seller_orders_calendar.monthselector.e eVar = MonthSelectorDialog.this.f290374h0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.str_seller_orders_calendar.monthselector.d) eVar.get();
        }
    }

    public MonthSelectorDialog() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f290375i0 = new O0(m0.f406844a.b(com.avito.android.str_seller_orders_calendar.monthselector.d.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        Bundle arguments = getArguments();
        com.avito.android.str_seller_orders_calendar.monthselector.di.a.a().a(arguments != null ? arguments.getString("selected_month_id") : null, new c()).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        RecyclerView recyclerView = null;
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, requireContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextThemeWrapperB, 0, 2, null);
        dVar.setContentView(R.layout.str_orders_calendar_month_selector_fragment);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, contextThemeWrapperB.getString(R.string.str_orders_calendar_month_selector_title), true, true, 2);
        dVar.z(C35835l0.k(R.drawable.common_ic_arrow_back_24, contextThemeWrapperB));
        dVar.S(C35835l0.g(contextThemeWrapperB).y);
        dVar.K(false);
        dVar.setCanceledOnTouchOutside(true);
        RecyclerView recyclerView2 = (RecyclerView) dVar.findViewById(R.id.recycler_view);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
            com.avito.konveyor.adapter.d dVar2 = this.f290376j0;
            recyclerView2.setAdapter(dVar2 != null ? dVar2 : null);
            recyclerView = recyclerView2;
        }
        if (recyclerView != null) {
            this.f290377k0 = recyclerView;
        }
        return dVar;
    }
}
