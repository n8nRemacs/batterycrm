package com.avito.android.autoteka.presentation.reportGeneration;

import Cd.C13243a;
import L91.o;
import Rf.AbstractC15037c;
import Rf.InterfaceC15035a;
import Rf.InterfaceC15036b;
import Y41.l;
import Y41.p;
import Y61.k;
import Zd.InterfaceC19542a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.result.h;
import com.avito.android.R;
import com.avito.android.analytics.screens.AutotekaReportGenerationScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import com.avito.android.di.C29972i;
import com.avito.android.util.P5;
import com.avito.konveyor.adapter.j;
import i.b;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
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
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import z1.AbstractC50339a;

/* compiled from: AutotekaReportGenerationActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/autoteka/presentation/reportGeneration/AutotekaReportGenerationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutotekaReportGenerationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f97756t = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.autoteka.presentation.reportGeneration.e f97757m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public j f97759o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f97760p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f97761q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97762r;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f97758n = new O0(m0.f406844a.b(com.avito.android.autoteka.presentation.reportGeneration.d.class), new e(), new d(new g()), new f());

    /* renamed from: s, reason: collision with root package name */
    @k
    public final h<Intent> f97763s = registerForActivityResult(new b.m(), new o(this, 11));

    /* compiled from: AutotekaReportGenerationActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/autoteka/presentation/reportGeneration/AutotekaReportGenerationActivity$a;", "", "<init>", "()V", "", "KEY_REPORT_GENERATION_DETAILS", "Ljava/lang/String;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AutotekaReportGenerationActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity$onCreate$2", f = "AutotekaReportGenerationActivity.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97764q;

        /* compiled from: AutotekaReportGenerationActivity.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity$onCreate$2$1", f = "AutotekaReportGenerationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f97766q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AutotekaReportGenerationActivity f97767r;

            /* compiled from: AutotekaReportGenerationActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity$onCreate$2$1$1", f = "AutotekaReportGenerationActivity.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity$b$a$a, reason: collision with other inner class name */
            public static final class C2921a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f97768q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutotekaReportGenerationActivity f97769r;

                /* compiled from: AutotekaReportGenerationActivity.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRf/c;", "it", "Lkotlin/G0;", "invoke", "(LRf/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity$b$a$a$a, reason: collision with other inner class name */
                public static final class C2922a extends N implements l<AbstractC15037c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ AutotekaReportGenerationActivity f97770l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2922a(AutotekaReportGenerationActivity autotekaReportGenerationActivity) {
                        super(1);
                        this.f97770l = autotekaReportGenerationActivity;
                    }

                    @Override // Y41.l
                    public final G0 invoke(AbstractC15037c abstractC15037c) {
                        AbstractC15037c abstractC15037c2 = abstractC15037c;
                        AutotekaReportGenerationActivity autotekaReportGenerationActivity = this.f97770l;
                        com.avito.konveyor.adapter.a aVar = autotekaReportGenerationActivity.f97760p;
                        if (aVar == null) {
                            aVar = null;
                        }
                        aVar.c(new UV0.c(Collections.singletonList(abstractC15037c2.getF14542b())));
                        j jVar = autotekaReportGenerationActivity.f97759o;
                        (jVar != null ? jVar : null).notifyDataSetChanged();
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2921a(AutotekaReportGenerationActivity autotekaReportGenerationActivity, Continuation<? super C2921a> continuation) {
                    super(2, continuation);
                    this.f97769r = autotekaReportGenerationActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C2921a(this.f97769r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2921a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f97768q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        int i13 = AutotekaReportGenerationActivity.f97756t;
                        AutotekaReportGenerationActivity autotekaReportGenerationActivity = this.f97769r;
                        n2<AbstractC15037c> state = ((com.avito.android.autoteka.presentation.reportGeneration.d) autotekaReportGenerationActivity.f97758n.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = autotekaReportGenerationActivity.f97762r;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C2922a c2922a = new C2922a(autotekaReportGenerationActivity);
                        this.f97768q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c2922a, this) == coroutine_suspended) {
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

            /* compiled from: AutotekaReportGenerationActivity.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity$onCreate$2$1$2", f = "AutotekaReportGenerationActivity.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity$b$a$b, reason: collision with other inner class name */
            public static final class C2923b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f97771q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AutotekaReportGenerationActivity f97772r;

                /* compiled from: AutotekaReportGenerationActivity.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.autoteka.presentation.reportGeneration.AutotekaReportGenerationActivity$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C2924a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AutotekaReportGenerationActivity f97773b;

                    public C2924a(AutotekaReportGenerationActivity autotekaReportGenerationActivity) {
                        this.f97773b = autotekaReportGenerationActivity;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC15036b interfaceC15036b = (InterfaceC15036b) obj;
                        int i12 = AutotekaReportGenerationActivity.f97756t;
                        AutotekaReportGenerationActivity autotekaReportGenerationActivity = this.f97773b;
                        if (L.f(interfaceC15036b, InterfaceC15036b.a.f14538a)) {
                            autotekaReportGenerationActivity.finish();
                        } else if (interfaceC15036b instanceof InterfaceC15036b.C0968b) {
                            InterfaceC19542a interfaceC19542a = autotekaReportGenerationActivity.f97761q;
                            if (interfaceC19542a == null) {
                                interfaceC19542a = null;
                            }
                            Intent intentA = interfaceC19542a.a(AuthSource.f92691Z);
                            intentA.setFlags(603979776);
                            autotekaReportGenerationActivity.f97763s.b(intentA);
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
                        return new C42801a(2, this.f97773b, AutotekaReportGenerationActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/entity/AutotekaReportGenerationOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2923b(AutotekaReportGenerationActivity autotekaReportGenerationActivity, Continuation<? super C2923b> continuation) {
                    super(2, continuation);
                    this.f97772r = autotekaReportGenerationActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C2923b(this.f97772r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2923b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f97771q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        int i13 = AutotekaReportGenerationActivity.f97756t;
                        AutotekaReportGenerationActivity autotekaReportGenerationActivity = this.f97772r;
                        InterfaceC43160i<InterfaceC15036b> events = ((com.avito.android.autoteka.presentation.reportGeneration.d) autotekaReportGenerationActivity.f97758n.getValue()).getEvents();
                        C2924a c2924a = new C2924a(autotekaReportGenerationActivity);
                        this.f97771q = 1;
                        if (events.collect(c2924a, this) == coroutine_suspended) {
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
            public a(AutotekaReportGenerationActivity autotekaReportGenerationActivity, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f97767r = autotekaReportGenerationActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f97767r, continuation);
                aVar.f97766q = obj;
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
                T t12 = (T) this.f97766q;
                AutotekaReportGenerationActivity autotekaReportGenerationActivity = this.f97767r;
                C43259k.d(t12, null, null, new C2921a(autotekaReportGenerationActivity, null), 3);
                C43259k.d(t12, null, null, new C2923b(autotekaReportGenerationActivity, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return AutotekaReportGenerationActivity.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97764q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                AutotekaReportGenerationActivity autotekaReportGenerationActivity = AutotekaReportGenerationActivity.this;
                a aVar = new a(autotekaReportGenerationActivity, null);
                this.f97764q = 1;
                if (C23056p0.b(autotekaReportGenerationActivity, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: AutotekaReportGenerationActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LRf/a;", "it", "Lkotlin/G0;", "invoke", "(LRf/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<InterfaceC15035a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC15035a interfaceC15035a) {
            int i12 = AutotekaReportGenerationActivity.f97756t;
            ((com.avito.android.autoteka.presentation.reportGeneration.d) AutotekaReportGenerationActivity.this.f97758n.getValue()).accept(interfaceC15035a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f97775l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f97775l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f97775l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return AutotekaReportGenerationActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return AutotekaReportGenerationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: AutotekaReportGenerationActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/reportGeneration/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/autoteka/presentation/reportGeneration/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.autoteka.presentation.reportGeneration.d> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.autoteka.presentation.reportGeneration.d invoke() {
            com.avito.android.autoteka.presentation.reportGeneration.e eVar = AutotekaReportGenerationActivity.this.f97757m;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.autoteka.presentation.reportGeneration.d) eVar.get();
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.autoteka_report_generation_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("ReportGenerationDetails", ReportGenerationDetails.class) : intent.getParcelableExtra("ReportGenerationDetails");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("reportGenerationDetails cannot be null");
        }
        com.avito.android.autoteka.di.reportGeneration.f.a().a((yf.l) C29972i.a(C29972i.b(this), yf.l.class), cv.c.a(this), (ReportGenerationDetails) parcelableExtra, new c(), new C28478k(AutotekaReportGenerationScreen.f90293d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97762r;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97762r;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97762r;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        j jVar = this.f97759o;
        if (jVar == null) {
            jVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.autoteka_item_list);
        if (recyclerView != null) {
            recyclerView.setAdapter(jVar);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        Toolbar toolbar = this.f304539d;
        if (toolbar != null) {
            P5.d(toolbar);
            toolbar.setNavigationOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 0));
        }
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97762r;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
