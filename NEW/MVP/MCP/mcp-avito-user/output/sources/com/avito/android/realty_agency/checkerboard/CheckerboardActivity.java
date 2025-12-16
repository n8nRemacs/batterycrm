package com.avito.android.realty_agency.checkerboard;

import Aw0.InterfaceC13094a;
import Cd.C13243a;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19562d;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.FragmentManager;
import androidx.view.C22981N;
import androidx.view.C23069w;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import cU0.InterfaceC27108f;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.InlineFiltersSource;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.realty_agency.checkerboard.di.a;
import com.avito.android.realty_agency.checkerboard.model.CheckerboardArguments;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35961v3;
import com.avito.beduin.v2.engine.component.z;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.rx3.y;
import oW.InterfaceC44697a;
import z1.AbstractC50339a;

/* compiled from: CheckerboardActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/CheckerboardActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "LZh0/e;", VoiceInfo.STATE, "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CheckerboardActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public static final a f250899B = new a(null);

    /* renamed from: A, reason: collision with root package name */
    @Inject
    public C36135w2 f250900A;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public p f250901m;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f250903o;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC31062w f250905q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f250906r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.a f250907s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.onboarding_manager.f f250908t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.beduin_v2.feature.item.b f250909u;

    /* renamed from: v, reason: collision with root package name */
    public com.avito.android.realty_agency.inline_filters.m f250910v;

    /* renamed from: w, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f250911w;

    /* renamed from: x, reason: collision with root package name */
    @Inject
    public InterfaceC13094a f250912x;

    /* renamed from: y, reason: collision with root package name */
    @Inject
    public InterfaceC30999b f250913y;

    /* renamed from: z, reason: collision with root package name */
    @Inject
    public com.avito.android.realty_agency.inline_filters.a f250914z;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f250902n = new O0(m0.f406844a.b(o.class), new k(), new j(new m()), new l());

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Object f250904p = C35961v3.a(this);

    /* compiled from: CheckerboardActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/CheckerboardActivity$a;", "", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f250915b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f250916b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.CheckerboardActivity$onCreate$$inlined$map$1$2", f = "CheckerboardActivity.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.realty_agency.checkerboard.CheckerboardActivity$b$a$a, reason: collision with other inner class name */
            public static final class C7531a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f250917q;

                /* renamed from: r, reason: collision with root package name */
                public int f250918r;

                public C7531a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f250917q = obj;
                    this.f250918r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f250916b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.realty_agency.checkerboard.CheckerboardActivity.b.a.C7531a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.realty_agency.checkerboard.CheckerboardActivity$b$a$a r0 = (com.avito.android.realty_agency.checkerboard.CheckerboardActivity.b.a.C7531a) r0
                    int r1 = r0.f250918r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f250918r = r1
                    goto L18
                L13:
                    com.avito.android.realty_agency.checkerboard.CheckerboardActivity$b$a$a r0 = new com.avito.android.realty_agency.checkerboard.CheckerboardActivity$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f250917q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f250918r
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
                    Zh0.e r5 = (Zh0.C19563e) r5
                    boolean r5 = r5.f20458a
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
                    r0.f250918r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f250916b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.checkerboard.CheckerboardActivity.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(n2 n2Var) {
            this.f250915b = n2Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f250915b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: CheckerboardActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(-1876760497, new com.avito.android.realty_agency.checkerboard.c(CheckerboardActivity.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CheckerboardActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<A, Integer, G0> {
        public d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a aVar = CheckerboardActivity.f250899B;
                CheckerboardActivity checkerboardActivity = CheckerboardActivity.this;
                com.akita.compose.theme.re23.c.a(false, r.c(1547037510, new com.avito.android.realty_agency.checkerboard.h(checkerboardActivity, C22126m3.b(checkerboardActivity.a2().getState(), a13)), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CheckerboardActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends C42801a implements Y41.p<InterfaceC19562d, Continuation<? super G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(InterfaceC19562d interfaceC19562d, Continuation<? super G0> continuation) {
            InterfaceC19562d interfaceC19562d2 = interfaceC19562d;
            CheckerboardActivity checkerboardActivity = (CheckerboardActivity) this.receiver;
            a aVar = CheckerboardActivity.f250899B;
            checkerboardActivity.getClass();
            if (!(interfaceC19562d2 instanceof InterfaceC19562d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = checkerboardActivity.f250903o;
            if (aVar2 == null) {
                aVar2 = null;
            }
            InterfaceC19562d.a aVar3 = (InterfaceC19562d.a) interfaceC19562d2;
            b.a.a(aVar2, aVar3.f20454a, aVar3.f20455b, null, 4);
            return G0.f406611a;
        }
    }

    /* compiled from: CheckerboardActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/SearchParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<SearchParams> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final SearchParams invoke() {
            a aVar = CheckerboardActivity.f250899B;
            return CheckerboardActivity.this.a2().getState().getValue().f20459b;
        }
    }

    /* compiled from: CheckerboardActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isLoaded", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Boolean, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = CheckerboardActivity.f250899B;
            CheckerboardActivity.this.a2().accept(new InterfaceC19559a.h(zBooleanValue));
            return G0.f406611a;
        }
    }

    /* compiled from: CheckerboardActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/SearchParams;", "searchParams", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/SearchParams;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<SearchParams, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SearchParams searchParams) {
            a aVar = CheckerboardActivity.f250899B;
            CheckerboardActivity.this.a2().accept(new InterfaceC19559a.i(searchParams));
            return G0.f406611a;
        }
    }

    /* compiled from: CheckerboardActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isInlineFiltersLoaded", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.CheckerboardActivity$onCreate$8", f = "CheckerboardActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ boolean f250925q;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = CheckerboardActivity.this.new i(continuation);
            iVar.f250925q = ((Boolean) obj).booleanValue();
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((i) create(bool2, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            boolean z12 = this.f250925q;
            com.avito.android.realty_agency.inline_filters.m mVar = CheckerboardActivity.this.f250910v;
            if (mVar == null) {
                mVar = null;
            }
            mVar.a(z12, z12, false, false);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f250927l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f250927l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f250927l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return CheckerboardActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return CheckerboardActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: CheckerboardActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/realty_agency/checkerboard/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<o> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = CheckerboardActivity.this.f250901m;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        a.InterfaceC7533a interfaceC7533aA = com.avito.android.realty_agency.checkerboard.di.g.a();
        com.avito.android.realty_agency.checkerboard.di.b bVar = (com.avito.android.realty_agency.checkerboard.di.b) C29972i.a(C29972i.b(this), com.avito.android.realty_agency.checkerboard.di.b.class);
        InterfaceC39417a interfaceC39417aA = cv.c.a(this);
        InterfaceC44697a interfaceC44697a = (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class);
        a.i iVarP1 = P1();
        CheckerboardArguments checkerboardArguments = (CheckerboardArguments) this.f250904p.getValue();
        InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170993b;
        interfaceC7533aA.a(this, bVar, interfaceC39417aA, interfaceC44697a, (com.avito.android.deeplink_handler.view.impl.k) iVarP1, checkerboardArguments, new C28478k(CheckerboardScreen.f250931d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f250911w;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final o a2() {
        return (o) this.f250902n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f250911w;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.realty_agency_checkerboard_activity);
        ComposeView composeView = (ComposeView) findViewById(R.id.toolbar);
        InterfaceC22532u2.e eVar = InterfaceC22532u2.e.f41618b;
        composeView.setViewCompositionStrategy(eVar);
        composeView.setContent(new C22096n(670802378, new c(), true));
        ComposeView composeView2 = (ComposeView) findViewById(R.id.main_content);
        composeView2.setViewCompositionStrategy(eVar);
        composeView2.setContent(new C22096n(1623601665, new d(), true));
        C43175k.K(new C43197r1(new e(2, this, CheckerboardActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/realty_agency/checkerboard/mvi/entity/CheckerboardOneTimeEvent;)V", 4), C23069w.a(a2().getEvents(), getLifecycle(), Lifecycle.State.f46681d)), C22981N.a(getLifecycle()));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f250903o;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new com.avito.android.realty_agency.checkerboard.a(this, null), y.a(aVar.V9())), C22981N.a(getLifecycle()));
        View viewFindViewById = findViewById(R.id.shortcuts_scroll_layout);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        com.avito.android.util.text.a aVar2 = this.f250906r;
        com.avito.android.util.text.a aVar3 = aVar2 != null ? aVar2 : null;
        com.avito.android.onboarding_manager.a aVar4 = this.f250907s;
        com.avito.android.onboarding_manager.a aVar5 = aVar4 != null ? aVar4 : null;
        com.avito.android.onboarding_manager.f fVar = this.f250908t;
        com.avito.android.onboarding_manager.f fVar2 = fVar != null ? fVar : null;
        com.avito.android.lib.beduin_v2.feature.item.b bVar = this.f250909u;
        com.avito.android.lib.beduin_v2.feature.item.b bVar2 = bVar != null ? bVar : null;
        CheckerboardScreen checkerboardScreen = CheckerboardScreen.f250931d;
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f250911w;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        InterfaceC13094a interfaceC13094a = this.f250912x;
        InterfaceC13094a interfaceC13094a2 = interfaceC13094a != null ? interfaceC13094a : null;
        z zVarH4 = a2().f251357N.H4();
        InterfaceC27108f interfaceC27108fEd = a2().f251357N.Ed();
        InterfaceC30999b interfaceC30999b = this.f250913y;
        InterfaceC30999b interfaceC30999b2 = interfaceC30999b != null ? interfaceC30999b : null;
        com.avito.android.realty_agency.inline_filters.a aVar6 = this.f250914z;
        com.avito.android.realty_agency.inline_filters.a aVar7 = aVar6 != null ? aVar6 : null;
        C36135w2 c36135w2 = this.f250900A;
        C36135w2 c36135w22 = c36135w2 != null ? c36135w2 : null;
        InterfaceC31062w interfaceC31062w = this.f250905q;
        com.avito.android.realty_agency.inline_filters.m mVar = new com.avito.android.realty_agency.inline_filters.m(viewFindViewById, null, supportFragmentManager, this, aVar3, aVar5, fVar2, bVar2, checkerboardScreen, screenPerformanceTracker3, interfaceC13094a2, zVarH4, interfaceC27108fEd, interfaceC30999b2, aVar7, c36135w22, interfaceC31062w != null ? interfaceC31062w : null, new f(), null, null, new g(), new h(), 786432, null);
        this.f250910v = mVar;
        InterfaceC31062w interfaceC31062w2 = this.f250905q;
        if (interfaceC31062w2 == null) {
            interfaceC31062w2 = null;
        }
        interfaceC31062w2.w1(mVar, mVar, null, null, null);
        C43175k.K(new C43197r1(new i(null), C43175k.r(new b(a2().getState()))), C22981N.a(getLifecycle()));
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f250911w;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        screenPerformanceTracker4.d();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        com.avito.android.realty_agency.inline_filters.m mVar = this.f250910v;
        if (mVar == null) {
            mVar = null;
        }
        mVar.f251725b.z1(a2().getState().getValue().f20459b, null);
    }
}
