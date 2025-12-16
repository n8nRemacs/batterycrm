package com.avito.android.str_calendar.seller.calandar_parameters;

import Cd.C13243a;
import Ey0.C13545a;
import Gy0.InterfaceC13931a;
import Gy0.c;
import Gy0.d;
import Ty0.InterfaceC15425a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.StrCalendarParametersScreen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment;
import com.avito.android.str_calendar.seller.warning_dialog.StrCalendarWarningDialogFragment;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogData;
import com.avito.android.str_cancellation_settings.analytics.FromPageLabel;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35976x4;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import i.b;
import java.util.Date;
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
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: StrCalendarParametersFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/StrCalendarParametersFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrCalendarParametersFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f286684D0;

    /* renamed from: E0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f286685E0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f286686A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public d f286687B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f286688C0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public K f286689n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f286690o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f286691p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.core.c f286692q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f286693r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f286694s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.str_calendar.seller.warning_dialog.e f286695t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC15425a f286696u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f286697v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f286698w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f286699x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f286700y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f286701z0;

    /* compiled from: StrCalendarParametersFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/StrCalendarParametersFragment$a;", "", "<init>", "()V", "", "ADVERT_ID_NULL_ERROR", "Ljava/lang/String;", "EXTRA_END_DATE", "EXTRA_START_DATE", "", "TOOLTIP_DELAY", "J", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrCalendarParametersFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$onCreateView$1", f = "StrCalendarParametersFragment.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f286702q;

        /* compiled from: StrCalendarParametersFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$onCreateView$1$1", f = "StrCalendarParametersFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f286704q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrCalendarParametersFragment f286705r;

            /* compiled from: StrCalendarParametersFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$onCreateView$1$1$1", f = "StrCalendarParametersFragment.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$a, reason: collision with other inner class name */
            public static final class C8588a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f286706q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrCalendarParametersFragment f286707r;

                /* compiled from: StrCalendarParametersFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGy0/c;", "it", "Lkotlin/G0;", "invoke", "(LGy0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$a$a, reason: collision with other inner class name */
                public static final class C8589a extends N implements Y41.l<Gy0.c, G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ StrCalendarParametersFragment f286708l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C8589a(StrCalendarParametersFragment strCalendarParametersFragment) {
                        super(1);
                        this.f286708l = strCalendarParametersFragment;
                    }

                    @Override // Y41.l
                    public final G0 invoke(Gy0.c cVar) {
                        Gy0.c cVar2 = cVar;
                        a aVar = StrCalendarParametersFragment.f286684D0;
                        StrCalendarParametersFragment strCalendarParametersFragment = this.f286708l;
                        F f12 = new F(1, strCalendarParametersFragment.r5(), J.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        boolean z12 = cVar2 instanceof c.b;
                        com.avito.android.progress_overlay.l lVar = strCalendarParametersFragment.q5().f286678a;
                        if (z12) {
                            lVar.j();
                            com.avito.konveyor.adapter.d dVar = strCalendarParametersFragment.f286697v0;
                            (dVar != null ? dVar : null).l(((c.b) cVar2).f6847d, new com.avito.android.publish.screen.objects.view.actions.h(f12, 18));
                        } else if (cVar2 instanceof c.d) {
                            lVar.k(null);
                        } else if (cVar2 instanceof c.C0387c) {
                            lVar.a("");
                        }
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$a$b, reason: collision with other inner class name */
                public static final class C8590b implements InterfaceC43160i<Gy0.c> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f286709b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$a$b$a, reason: collision with other inner class name */
                    public static final class C8591a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f286710b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$onCreateView$1$1$1$invokeSuspend$$inlined$map$1$2", f = "StrCalendarParametersFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C8592a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f286711q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f286712r;

                            public C8592a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f286711q = obj;
                                this.f286712r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C8591a.this.emit(null, this);
                            }
                        }

                        public C8591a(InterfaceC43172j interfaceC43172j) {
                            this.f286710b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment.b.a.C8588a.C8590b.C8591a.C8592a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$a$b$a$a r0 = (com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment.b.a.C8588a.C8590b.C8591a.C8592a) r0
                                int r1 = r0.f286712r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f286712r = r1
                                goto L18
                            L13:
                                com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$a$b$a$a r0 = new com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f286711q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f286712r
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
                                Gy0.e r5 = (Gy0.e) r5
                                Gy0.c r5 = r5.f6894u
                                r0.f286712r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f286710b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment.b.a.C8588a.C8590b.C8591a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public C8590b(n2 n2Var) {
                        this.f286709b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super Gy0.c> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f286709b.collect(new C8591a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8588a(StrCalendarParametersFragment strCalendarParametersFragment, Continuation<? super C8588a> continuation) {
                    super(2, continuation);
                    this.f286707r = strCalendarParametersFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8588a(this.f286707r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8588a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f286706q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StrCalendarParametersFragment.f286684D0;
                        StrCalendarParametersFragment strCalendarParametersFragment = this.f286707r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new C8590b(strCalendarParametersFragment.r5().getState()));
                        ScreenPerformanceTracker screenPerformanceTracker = strCalendarParametersFragment.f286691p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8589a c8589a = new C8589a(strCalendarParametersFragment);
                        this.f286706q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iR, screenPerformanceTracker, c8589a, this) == coroutine_suspended) {
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

            /* compiled from: StrCalendarParametersFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$onCreateView$1$1$2", f = "StrCalendarParametersFragment.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$b, reason: collision with other inner class name */
            public static final class C8593b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f286714q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrCalendarParametersFragment f286715r;

                /* compiled from: StrCalendarParametersFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8594a extends kotlin.jvm.internal.H implements Y41.l<Gy0.b, G0> {
                    @Override // Y41.l
                    public final G0 invoke(Gy0.b bVar) {
                        Gy0.b bVar2 = bVar;
                        StrCalendarParametersFragment strCalendarParametersFragment = (StrCalendarParametersFragment) this.receiver;
                        a aVar = StrCalendarParametersFragment.f286684D0;
                        I iQ5 = strCalendarParametersFragment.q5();
                        TextView textView = iQ5.f286682e;
                        if (textView != null) {
                            PrintableText printableText = bVar2.f6841b;
                            I5.a(textView, printableText != null ? printableText.k0(textView.getContext()) : null, false);
                        }
                        int i12 = bVar2.f6843d ? 0 : 4;
                        View view = iQ5.f286680c;
                        view.setVisibility(i12);
                        view.setEnabled(bVar2.f6842c);
                        com.avito.konveyor.adapter.d dVar = strCalendarParametersFragment.f286699x0;
                        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
                        C47313c c47313c = strCalendarParametersFragment.f286686A0;
                        kotlin.reflect.n<Object> nVar = StrCalendarParametersFragment.f286685E0[1];
                        dVar2.l(bVar2.f6844e, ((com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.c) c47313c.a()).f286740d);
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$b$b, reason: collision with other inner class name */
                public static final class C8595b implements InterfaceC43160i<Gy0.b> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f286716b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$b$b$a, reason: collision with other inner class name */
                    public static final class C8596a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f286717b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$onCreateView$1$1$2$invokeSuspend$$inlined$map$1$2", f = "StrCalendarParametersFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$b$b$a$a, reason: collision with other inner class name */
                        public static final class C8597a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f286718q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f286719r;

                            public C8597a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f286718q = obj;
                                this.f286719r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C8596a.this.emit(null, this);
                            }
                        }

                        public C8596a(InterfaceC43172j interfaceC43172j) {
                            this.f286717b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment.b.a.C8593b.C8595b.C8596a.C8597a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$b$b$a$a r0 = (com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment.b.a.C8593b.C8595b.C8596a.C8597a) r0
                                int r1 = r0.f286719r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f286719r = r1
                                goto L18
                            L13:
                                com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$b$b$a$a r0 = new com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$b$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f286718q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f286719r
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
                                Gy0.e r5 = (Gy0.e) r5
                                Gy0.b r5 = r5.f6893t
                                r0.f286719r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f286717b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment.b.a.C8593b.C8595b.C8596a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public C8595b(n2 n2Var) {
                        this.f286716b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super Gy0.b> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f286716b.collect(new C8596a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8593b(StrCalendarParametersFragment strCalendarParametersFragment, Continuation<? super C8593b> continuation) {
                    super(2, continuation);
                    this.f286715r = strCalendarParametersFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8593b(this.f286715r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8593b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f286714q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StrCalendarParametersFragment.f286684D0;
                        StrCalendarParametersFragment strCalendarParametersFragment = this.f286715r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new C8595b(strCalendarParametersFragment.r5().getState()));
                        ScreenPerformanceTracker screenPerformanceTracker = strCalendarParametersFragment.f286691p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8594a c8594a = new C8594a(1, strCalendarParametersFragment, StrCalendarParametersFragment.class, "renderCore", "renderCore(Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersCoreViewState;)V", 0);
                        this.f286714q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iR, screenPerformanceTracker, c8594a, this) == coroutine_suspended) {
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

            /* compiled from: StrCalendarParametersFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$onCreateView$1$1$3", f = "StrCalendarParametersFragment.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f286721q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrCalendarParametersFragment f286722r;

                /* compiled from: StrCalendarParametersFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_calendar.seller.calandar_parameters.StrCalendarParametersFragment$b$a$c$a, reason: collision with other inner class name */
                public /* synthetic */ class C8598a implements InterfaceC43172j, kotlin.jvm.internal.D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrCalendarParametersFragment f286723b;

                    public C8598a(StrCalendarParametersFragment strCalendarParametersFragment) {
                        this.f286723b = strCalendarParametersFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        final Gy0.d dVar = (Gy0.d) obj;
                        a aVar = StrCalendarParametersFragment.f286684D0;
                        final StrCalendarParametersFragment strCalendarParametersFragment = this.f286723b;
                        if (dVar instanceof d.e) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = strCalendarParametersFragment.f286693r0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((d.e) dVar).f6860a, null, null, 6);
                        } else if (dVar instanceof d.f) {
                            C43259k.d(C22981N.a(strCalendarParametersFragment.getLifecycle()), null, null, new B(strCalendarParametersFragment, dVar, null), 3);
                        } else if (dVar instanceof d.k) {
                            d.k kVar = (d.k) dVar;
                            com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, strCalendarParametersFragment, kVar.f6868a, null, null, kVar.f6869b, 0, null, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
                        } else {
                            boolean z12 = dVar instanceof d.a;
                            C47313c c47313c = strCalendarParametersFragment.f286686A0;
                            if (z12) {
                                kotlin.reflect.n<Object> nVar = StrCalendarParametersFragment.f286685E0[1];
                                com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.c cVar = (com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.c) c47313c.a();
                                com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.e eVar = cVar.f286739c;
                                if (eVar != null) {
                                    eVar.r();
                                }
                                cVar.f286739c = null;
                            } else if (dVar instanceof d.C0388d) {
                                InterfaceC15425a interfaceC15425a = strCalendarParametersFragment.f286696u0;
                                InterfaceC15425a interfaceC15425a2 = interfaceC15425a != null ? interfaceC15425a : null;
                                d.C0388d c0388d = (d.C0388d) dVar;
                                long j12 = c0388d.f6857a;
                                FromPageLabel.a aVar3 = FromPageLabel.f288145c;
                                strCalendarParametersFragment.f286688C0.b(interfaceC15425a2.a(j12, c0388d.f6858b, c0388d.f6859c, "str_inventory_edit"));
                            } else if (dVar instanceof d.i) {
                                C43259k.d(C22981N.a(strCalendarParametersFragment.getLifecycle()), null, null, new C(strCalendarParametersFragment, dVar, null), 3);
                            } else if (dVar instanceof d.b) {
                                K2.e(strCalendarParametersFragment);
                                C43259k.d(C22981N.a(strCalendarParametersFragment.getLifecycle()), null, null, new D(strCalendarParametersFragment, dVar, null), 3);
                            } else if (dVar instanceof d.c) {
                                K2.e(strCalendarParametersFragment);
                                kotlin.reflect.n<Object> nVar2 = StrCalendarParametersFragment.f286685E0[1];
                                d.c cVar2 = (d.c) dVar;
                                ((com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.c) c47313c.a()).a(strCalendarParametersFragment.requireContext(), cVar2.f6855a, cVar2.f6856b);
                            } else if (dVar instanceof d.j) {
                                C43259k.d(C22981N.a(strCalendarParametersFragment.getLifecycle()), null, null, new E(strCalendarParametersFragment, dVar, null), 3);
                            } else if (dVar instanceof d.h) {
                                d dVar2 = strCalendarParametersFragment.f286687B0;
                                if (dVar2 != null) {
                                    RecyclerView.m layoutManager = strCalendarParametersFragment.q5().f286679b.getLayoutManager();
                                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                    if (linearLayoutManager != null) {
                                        dVar2.f53878a = ((d.h) dVar).f6864a;
                                        linearLayoutManager.x1(dVar2);
                                    }
                                }
                            } else if (dVar instanceof d.m) {
                                K2.e(strCalendarParametersFragment);
                                com.avito.android.str_calendar.seller.warning_dialog.e eVar2 = strCalendarParametersFragment.f286695t0;
                                new P0(strCalendarParametersFragment, new com.avito.android.str_calendar.seller.warning_dialog.g(eVar2 != null ? eVar2 : null)).a(com.avito.android.str_calendar.seller.warning_dialog.f.class);
                                StrCalendarWarningDialogFragment.a aVar4 = StrCalendarWarningDialogFragment.f288060i0;
                                WarningDialogData warningDialogData = ((d.m) dVar).f6872a;
                                aVar4.getClass();
                                StrCalendarWarningDialogFragment strCalendarWarningDialogFragment = new StrCalendarWarningDialogFragment();
                                strCalendarWarningDialogFragment.setArguments(C22777e.b(new Q("warning_dialog_data", warningDialogData)));
                                strCalendarWarningDialogFragment.show(strCalendarParametersFragment.getChildFragmentManager(), "StrCalendarWarningDialogFragment");
                            } else if (dVar instanceof d.g) {
                                d.g gVar = (d.g) dVar;
                                strCalendarParametersFragment.r5().accept(new InterfaceC13931a.z(gVar.f6862a, gVar.f6863b));
                            } else if (dVar instanceof d.l) {
                                strCalendarParametersFragment.q5().f286679b.postDelayed(new Runnable() { // from class: com.avito.android.str_calendar.seller.calandar_parameters.y
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        StrCalendarParametersFragment.a aVar5 = StrCalendarParametersFragment.f286684D0;
                                        StrCalendarParametersFragment strCalendarParametersFragment2 = strCalendarParametersFragment;
                                        I iQ5 = strCalendarParametersFragment2.q5();
                                        d.l lVar = (d.l) dVar;
                                        RecyclerView.C cP2 = iQ5.f286679b.P(lVar.f6870a);
                                        if (cP2 != null) {
                                            View view = cP2.itemView;
                                            com.avito.android.lib.design.tooltip.k kVar2 = strCalendarParametersFragment2.f286700y0;
                                            if (kVar2 != null) {
                                                kVar2.dismiss();
                                            }
                                            strCalendarParametersFragment2.f286700y0 = null;
                                            com.avito.android.lib.design.tooltip.k kVar3 = new com.avito.android.lib.design.tooltip.k(strCalendarParametersFragment2.requireContext(), 0, 0, 6, null);
                                            kVar3.f181224j = new r.a(null, 1, null);
                                            kVar3.f181228n = -2;
                                            kVar3.f181229o = -2;
                                            com.avito.android.lib.design.tooltip.p.a(kVar3, new G(lVar.f6871b));
                                            strCalendarParametersFragment2.f286700y0 = kVar3.f(view);
                                        }
                                    }
                                }, 500L);
                            }
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                            return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f286723b, StrCalendarParametersFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(StrCalendarParametersFragment strCalendarParametersFragment, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f286722r = strCalendarParametersFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new c(this.f286722r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f286721q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = StrCalendarParametersFragment.f286684D0;
                        StrCalendarParametersFragment strCalendarParametersFragment = this.f286722r;
                        InterfaceC43160i<Gy0.d> events = strCalendarParametersFragment.r5().getEvents();
                        C8598a c8598a = new C8598a(strCalendarParametersFragment);
                        this.f286721q = 1;
                        if (events.collect(c8598a, this) == coroutine_suspended) {
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
            public a(StrCalendarParametersFragment strCalendarParametersFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f286705r = strCalendarParametersFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f286705r, continuation);
                aVar.f286704q = obj;
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
                T t12 = (T) this.f286704q;
                StrCalendarParametersFragment strCalendarParametersFragment = this.f286705r;
                C43259k.d(t12, null, null, new C8588a(strCalendarParametersFragment, null), 3);
                C43259k.d(t12, null, null, new C8593b(strCalendarParametersFragment, null), 3);
                C43259k.d(t12, null, null, new c(strCalendarParametersFragment, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrCalendarParametersFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f286702q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                StrCalendarParametersFragment strCalendarParametersFragment = StrCalendarParametersFragment.this;
                a aVar = new a(strCalendarParametersFragment, null);
                this.f286702q = 1;
                if (C23056p0.b(strCalendarParametersFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StrCalendarParametersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.l<InterfaceC13931a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13931a interfaceC13931a) {
            ((J) this.receiver).accept(interfaceC13931a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrCalendarParametersFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_calendar/seller/calandar_parameters/StrCalendarParametersFragment$d", "Landroidx/recyclerview/widget/z;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends C23434z {
        @Override // androidx.recyclerview.widget.C23434z
        public final int n() {
            return -1;
        }
    }

    /* compiled from: StrCalendarParametersFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.l<InterfaceC13931a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13931a interfaceC13931a) {
            ((J) this.receiver).accept(interfaceC13931a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrCalendarParametersFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGy0/a;", "it", "Lkotlin/G0;", "invoke", "(LGy0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC13931a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13931a interfaceC13931a) {
            a aVar = StrCalendarParametersFragment.f286684D0;
            StrCalendarParametersFragment.this.r5().accept(interfaceC13931a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f286725l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f286725l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f286725l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return StrCalendarParametersFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f286727l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f286727l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f286727l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f286728l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f286728l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f286728l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f286729l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f286729l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f286729l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrCalendarParametersFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/J;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_calendar/seller/calandar_parameters/J;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<J> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final J invoke() {
            K k12 = StrCalendarParametersFragment.this.f286689n0;
            if (k12 == null) {
                k12 = null;
            }
            return (J) k12.get();
        }
    }

    static {
        Y y12 = new Y(StrCalendarParametersFragment.class, "parametersViewHolder", "getParametersViewHolder()Lcom/avito/android/str_calendar/seller/calandar_parameters/StrCalendarParametersViewHolder;", 0);
        n0 n0Var = m0.f406844a;
        f286685E0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(StrCalendarParametersFragment.class, "bottomPickerView", "getBottomPickerView()Lcom/avito/android/str_calendar/seller/calandar_parameters/bottom_picker/BottomPickerView;", 0, n0Var)};
        f286684D0 = new a(null);
    }

    public StrCalendarParametersFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f286690o0 = new O0(m0.f406844a.b(J.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f286701z0 = new C47313c(null, 1, null);
        this.f286686A0 = new C47313c(null, 1, null);
        this.f286688C0 = registerForActivityResult(new b.m(), new L91.o(this, 29));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f286691p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        View viewInflate = layoutInflater.inflate(R.layout.str_calendar_parameters_fragment, viewGroup, false);
        InterfaceC28373a interfaceC28373a = this.f286694s0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        I i12 = new I(viewInflate, interfaceC28373a);
        C47313c c47313c = this.f286701z0;
        kotlin.reflect.n<Object>[] nVarArr = f286685E0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, i12);
        com.avito.konveyor.adapter.d dVar = this.f286699x0;
        com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.c cVar = new com.avito.android.str_calendar.seller.calandar_parameters.bottom_picker.c(new c(1, r5(), J.class, "accept", "accept(Ljava/lang/Object;)V", 0), dVar != null ? dVar : null);
        C47313c c47313c2 = this.f286686A0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, cVar);
        this.f286687B0 = new d(q5().f286679b.getContext());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.lib.design.tooltip.k kVar = this.f286700y0;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f286700y0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) throws Resources.NotFoundException {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f286691p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        e eVar = new e(1, r5(), J.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        I iQ5 = q5();
        iQ5.f286681d.setOnClickListener(new com.avito.android.seller_promotions.b(12, eVar));
        iQ5.f286680c.setOnClickListener(new com.avito.android.seller_promotions.b(13, eVar));
        iQ5.f286678a.f231600j = new z(eVar);
        com.avito.konveyor.adapter.d dVar = this.f286697v0;
        if (dVar == null) {
            dVar = null;
        }
        RecyclerView recyclerView = iQ5.f286679b;
        recyclerView.setAdapter(dVar);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        C35976x4.a(recyclerView);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.seller_edit_calendar_recycler_view_horizontal_padding);
        com.avito.konveyor.a aVar = this.f286698w0;
        if (aVar == null) {
            aVar = null;
        }
        C13545a c13545a = new C13545a(aVar, dimensionPixelSize);
        PV.a aVar2 = new PV.a(0, recyclerView.getResources().getDimensionPixelSize(R.dimen.seller_edit_calendar_recycler_view_bottom_padding), 0, 0, 12, null);
        recyclerView.l(c13545a, -1);
        recyclerView.l(aVar2, -1);
        C43175k.K(new C43197r1(new A(this, null), kotlinx.coroutines.rx3.y.a(K2.h(requireActivity()))), C22984Q.a(getViewLifecycleOwner()));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Date date;
        Date date2;
        Object serializable;
        Object serializable2;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("advert_id") : null;
        if (string == null) {
            throw new IllegalStateException("advertId not set");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = arguments2.getSerializable("extra_start_date", Date.class);
            } else {
                Object serializable3 = arguments2.getSerializable("extra_start_date");
                if (!(serializable3 instanceof Date)) {
                    serializable3 = null;
                }
                serializable2 = (Date) serializable3;
            }
            date = (Date) serializable2;
        } else {
            date = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments3.getSerializable("extra_end_date", Date.class);
            } else {
                Object serializable4 = arguments3.getSerializable("extra_end_date");
                if (!(serializable4 instanceof Date)) {
                    serializable4 = null;
                }
                serializable = (Date) serializable4;
            }
            date2 = (Date) serializable;
        } else {
            date2 = null;
        }
        Bundle arguments4 = getArguments();
        boolean z12 = arguments4 != null ? arguments4.getBoolean("should_close_flow_after_apply") : false;
        com.avito.android.str_calendar.seller.calandar_parameters.di.b.a().a(cv.c.b(this), (com.avito.android.str_calendar.seller.core.di.c) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.core.di.c.class), (com.avito.android.str_calendar.seller.calandar_parameters.di.n) C29972i.a(C29972i.b(this), com.avito.android.str_calendar.seller.calandar_parameters.di.n.class), new f(), new C28478k(StrCalendarParametersScreen.f90509d, com.avito.android.analytics.screens.s.c(this), null, 4, null), date, date2, string, getResources(), z12).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f286691p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final I q5() {
        C47313c c47313c = this.f286701z0;
        kotlin.reflect.n<Object> nVar = f286685E0[0];
        return (I) c47313c.a();
    }

    public final J r5() {
        return (J) this.f286690o0.getValue();
    }
}
