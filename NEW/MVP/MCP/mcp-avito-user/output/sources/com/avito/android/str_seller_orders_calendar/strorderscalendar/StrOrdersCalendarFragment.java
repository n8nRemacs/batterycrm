package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import Ay0.InterfaceC13105a;
import Cd.C13243a;
import Uz0.b;
import Uz0.c;
import Vz0.InterfaceC15733a;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Q;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.str_seller_orders_calendar.monthselector.MonthSelectorDialog;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a;
import com.avito.android.str_seller_orders_calendar.utils.DynamicScrollGridLayoutManager;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Date;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.n2;
import m.C43852a;
import qK0.C47313c;
import sK0.C48065c;
import z1.AbstractC50339a;

/* compiled from: StrOrdersCalendarFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/StrOrdersCalendarFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrOrdersCalendarFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f290490A0 = {m0.f406844a.e(new Y(StrOrdersCalendarFragment.class, "viewHolder", "getViewHolder()Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/StrOrdersCalendarView;", 0))};

    /* renamed from: B0, reason: collision with root package name */
    @InterfaceC42150f
    public static final int f290491B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public p f290492n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f290493o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f290494p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f290495q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC13105a f290496r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f290497s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f290498t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f290499u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public C f290500v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public Y1<Float> f290501w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC15733a f290502x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C47313c f290503y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public N0 f290504z0;

    /* compiled from: StrOrdersCalendarFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/StrOrdersCalendarFragment$a;", "", "<init>", "()V", "", "BANNER_FADE_DURATION", "J", "", "DEFAULT_SCROLL_POSITION_OFFSET", "I", "DEF_BANNER_COLOR_ATTR", "SCREEN_ROTATION_UNLOCK_TIMEOUT", "", "SELLER_CALENDAR_REQUEST_KEY", "Ljava/lang/String;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrOrdersCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onConfigurationChanged$1", f = "StrOrdersCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f290505q;

        /* compiled from: StrOrdersCalendarFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onConfigurationChanged$1$1", f = "StrOrdersCalendarFragment.kt", i = {0}, l = {169}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f290507q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f290508r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ StrOrdersCalendarFragment f290509s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(StrOrdersCalendarFragment strOrdersCalendarFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f290509s = strOrdersCalendarFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f290509s, continuation);
                aVar.f290508r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                T t12;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f290507q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    T t13 = (T) this.f290508r;
                    this.f290508r = t13;
                    this.f290507q = 1;
                    if (C43131e0.b(5000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    t12 = t13;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t12 = (T) this.f290508r;
                    C42729a0.b(obj);
                }
                U.d(t12);
                kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290509s;
                if (Settings.System.getInt(strOrdersCalendarFragment.requireContext().getContentResolver(), "accelerometer_rotation", 0) == 1) {
                    strOrdersCalendarFragment.requireActivity().setRequestedOrientation(-1);
                }
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = StrOrdersCalendarFragment.this.new b(continuation);
            bVar.f290505q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f290505q;
            StrOrdersCalendarFragment strOrdersCalendarFragment = StrOrdersCalendarFragment.this;
            N0 n02 = strOrdersCalendarFragment.f290504z0;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            strOrdersCalendarFragment.f290504z0 = C43259k.d(t12, null, null, new a(strOrdersCalendarFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onCreateView$1", f = "StrOrdersCalendarFragment.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290510q;

        /* compiled from: StrOrdersCalendarFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onCreateView$1$1", f = "StrOrdersCalendarFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f290512q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ StrOrdersCalendarFragment f290513r;

            /* compiled from: StrOrdersCalendarFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onCreateView$1$1$1", f = "StrOrdersCalendarFragment.kt", i = {}, l = {192}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$a, reason: collision with other inner class name */
            public static final class C8778a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290514q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrOrdersCalendarFragment f290515r;

                /* compiled from: StrOrdersCalendarFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C8779a extends H implements Y41.l<com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.b, G0> {
                    @Override // Y41.l
                    public final G0 invoke(com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.b bVar) {
                        com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.b bVar2 = bVar;
                        StrOrdersCalendarFragment strOrdersCalendarFragment = (StrOrdersCalendarFragment) this.receiver;
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        StrOrdersCalendarView strOrdersCalendarViewQ5 = strOrdersCalendarFragment.q5();
                        ArrayList arrayList = bVar2.f291078c;
                        DynamicScrollGridLayoutManager dynamicScrollGridLayoutManager = strOrdersCalendarViewQ5.f290541A;
                        int size = arrayList != null ? arrayList.size() : dynamicScrollGridLayoutManager.E1();
                        if (dynamicScrollGridLayoutManager.E1() != size) {
                            dynamicScrollGridLayoutManager.f291193r = DynamicScrollGridLayoutManager.Companion.Type.f291206c;
                            dynamicScrollGridLayoutManager.f291198w = size;
                            dynamicScrollGridLayoutManager.i1();
                        }
                        ArrayList arrayList2 = bVar2.f291077b;
                        if (O2.a(arrayList2)) {
                            com.avito.konveyor.adapter.d dVar = strOrdersCalendarFragment.f290497s0;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.l(arrayList2, null);
                        }
                        if (O2.a(arrayList)) {
                            com.avito.konveyor.adapter.d dVar2 = strOrdersCalendarFragment.f290498t0;
                            if (dVar2 == null) {
                                dVar2 = null;
                            }
                            dVar2.l(arrayList, null);
                        }
                        ArrayList arrayList3 = bVar2.f291079d;
                        if (O2.a(arrayList3)) {
                            com.avito.konveyor.adapter.d dVar3 = strOrdersCalendarFragment.f290499u0;
                            if (dVar3 == null) {
                                dVar3 = null;
                            }
                            dVar3.l(arrayList3, null);
                        }
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$a$b */
                public static final class b implements InterfaceC43160i<com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.b> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f290516b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$a$b$a, reason: collision with other inner class name */
                    public static final class C8780a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f290517b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onCreateView$1$1$1$invokeSuspend$$inlined$map$1$2", f = "StrOrdersCalendarFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$a$b$a$a, reason: collision with other inner class name */
                        public static final class C8781a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f290518q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f290519r;

                            public C8781a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f290518q = obj;
                                this.f290519r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C8780a.this.emit(null, this);
                            }
                        }

                        public C8780a(InterfaceC43172j interfaceC43172j) {
                            this.f290517b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment.c.a.C8778a.b.C8780a.C8781a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$a$b$a$a r0 = (com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment.c.a.C8778a.b.C8780a.C8781a) r0
                                int r1 = r0.f290519r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f290519r = r1
                                goto L18
                            L13:
                                com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$a$b$a$a r0 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$a$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f290518q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f290519r
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
                                com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState r5 = (com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState) r5
                                com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.b r5 = r5.f291058q
                                r0.f290519r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f290517b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment.c.a.C8778a.b.C8780a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public b(n2 n2Var) {
                        this.f290516b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.b> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f290516b.collect(new C8780a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8778a(StrOrdersCalendarFragment strOrdersCalendarFragment, Continuation<? super C8778a> continuation) {
                    super(2, continuation);
                    this.f290515r = strOrdersCalendarFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8778a(this.f290515r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8778a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290514q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290515r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new b(strOrdersCalendarFragment.r5().getState()));
                        ScreenPerformanceTracker screenPerformanceTracker = strOrdersCalendarFragment.f290494p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8779a c8779a = new C8779a(1, strOrdersCalendarFragment, StrOrdersCalendarFragment.class, "renderRecyclers", "renderRecyclers(Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/RecyclersViewState;)V", 0);
                        this.f290514q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iR, screenPerformanceTracker, c8779a, this) == coroutine_suspended) {
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

            /* compiled from: StrOrdersCalendarFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onCreateView$1$1$2", f = "StrOrdersCalendarFragment.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290521q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrOrdersCalendarFragment f290522r;

                /* compiled from: StrOrdersCalendarFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C8782a extends H implements Y41.l<com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a, G0> {
                    @Override // Y41.l
                    public final G0 invoke(com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a aVar) {
                        com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a aVar2 = aVar;
                        StrOrdersCalendarFragment strOrdersCalendarFragment = (StrOrdersCalendarFragment) this.receiver;
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        StrOrdersCalendarView strOrdersCalendarViewQ5 = strOrdersCalendarFragment.q5();
                        boolean z12 = aVar2 instanceof a.b;
                        View view = strOrdersCalendarViewQ5.f290577u;
                        ConstraintLayout constraintLayout = strOrdersCalendarViewQ5.f290566j;
                        if (z12) {
                            D6.H(constraintLayout);
                            D6.w(view);
                            a.b bVar = (a.b) aVar2;
                            strOrdersCalendarViewQ5.f290564h.setVisibility(!bVar.f291069f ? 8 : 0);
                            String str = bVar.f291067d;
                            View view2 = strOrdersCalendarViewQ5.f290570n;
                            TextView textView = strOrdersCalendarViewQ5.f290569m;
                            TextView textView2 = strOrdersCalendarViewQ5.f290568l;
                            if (str == null || str.length() == 0) {
                                D6.H(view2);
                                D6.w(textView2);
                                D6.w(textView);
                            } else {
                                D6.w(view2);
                                D6.H(textView2);
                                D6.H(textView);
                                I5.a(textView2, str, false);
                                FV.a aVar3 = FV.a.f4720a;
                                aVar3.f(textView2, R.attr.textIconArrowDownIos, y6.d(4));
                                I5.a(textView, bVar.f291068e, false);
                                aVar3.f(textView, R.attr.textIconArrowDownIos, y6.d(2));
                            }
                            boolean z13 = bVar.f291070g;
                            strOrdersCalendarViewQ5.f290555O = z13 ? strOrdersCalendarViewQ5.f290552L : strOrdersCalendarViewQ5.f290551K;
                            RecyclerView recyclerView = strOrdersCalendarViewQ5.f290543C;
                            RecyclerView recyclerView2 = recyclerView != null ? recyclerView : null;
                            if (recyclerView == null) {
                                recyclerView = null;
                            }
                            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                            layoutParams.width = strOrdersCalendarViewQ5.f290555O;
                            recyclerView2.setLayoutParams(layoutParams);
                            FrameLayout frameLayout = strOrdersCalendarViewQ5.f290567k;
                            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                            layoutParams2.width = strOrdersCalendarViewQ5.f290555O;
                            frameLayout.setLayoutParams(layoutParams2);
                            frameLayout.post(new com.avito.android.str_seller_orders_calendar.strorderscalendar.k(frameLayout, strOrdersCalendarViewQ5, 0));
                            strOrdersCalendarViewQ5.f290558b.K5(Float.valueOf(z13 ? 0.0f : 1.0f));
                            BF0.a aVar4 = bVar.f291071h;
                            View view3 = strOrdersCalendarViewQ5.f290571o;
                            if (aVar4 != null) {
                                Image imageDependsOnTheme = UniversalImageKt.getImageDependsOnTheme(aVar4.f1264d, com.avito.android.lib.util.darkTheme.c.b(strOrdersCalendarFragment.requireContext()));
                                ImageView imageView = strOrdersCalendarViewQ5.f290575s;
                                if (imageView != null) {
                                    com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(imageDependsOnTheme));
                                }
                                TextView textView3 = strOrdersCalendarViewQ5.f290573q;
                                if (textView3 != null) {
                                    textView3.setText(aVar4.f1262b);
                                }
                                TextView textView4 = strOrdersCalendarViewQ5.f290574r;
                                if (textView4 != null) {
                                    com.avito.android.util.text.j.a(textView4, aVar4.f1263c, null);
                                }
                                View view4 = strOrdersCalendarViewQ5.f290572p;
                                if (view4 != null) {
                                    view4.setBackgroundTintList(C48065c.a(strOrdersCalendarFragment.requireContext(), aVar4.f1265e, StrOrdersCalendarFragment.f290491B0));
                                }
                                if (view3 != null) {
                                    D6.n(view3, 200L);
                                }
                            } else if (view3 != null) {
                                D6.o(view3, 200L);
                            }
                        } else {
                            if (!(aVar2 instanceof a.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            D6.w(constraintLayout);
                            D6.H(view);
                            a.c cVar = (a.c) aVar2;
                            strOrdersCalendarViewQ5.f290578v.setImageDrawable(C35835l0.h(cVar.f291072d, strOrdersCalendarFragment.requireContext()));
                            strOrdersCalendarViewQ5.f290579w.setText(cVar.f291073e);
                            strOrdersCalendarViewQ5.f290580x.setText(cVar.f291074f);
                        }
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$b$b, reason: collision with other inner class name */
                public static final class C8783b implements InterfaceC43160i<com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n2 f290523b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$b$b$a, reason: collision with other inner class name */
                    public static final class C8784a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f290524b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onCreateView$1$1$2$invokeSuspend$$inlined$map$1$2", f = "StrOrdersCalendarFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$b$b$a$a, reason: collision with other inner class name */
                        public static final class C8785a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f290525q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f290526r;

                            public C8785a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Y61.l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f290525q = obj;
                                this.f290526r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C8784a.this.emit(null, this);
                            }
                        }

                        public C8784a(InterfaceC43172j interfaceC43172j) {
                            this.f290524b = interfaceC43172j;
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
                                boolean r0 = r6 instanceof com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment.c.a.b.C8783b.C8784a.C8785a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$b$b$a$a r0 = (com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment.c.a.b.C8783b.C8784a.C8785a) r0
                                int r1 = r0.f290526r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f290526r = r1
                                goto L18
                            L13:
                                com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$b$b$a$a r0 = new com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$b$b$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f290525q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f290526r
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
                                com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState r5 = (com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.StrOrdersCalendarState) r5
                                com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a r5 = r5.f291057p
                                r0.f290526r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f290524b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment.c.a.b.C8783b.C8784a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public C8783b(n2 n2Var) {
                        this.f290523b = n2Var;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @Y61.l
                    public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.str_seller_orders_calendar.strorderscalendar.mvi.entity.a> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f290523b.collect(new C8784a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(StrOrdersCalendarFragment strOrdersCalendarFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f290522r = strOrdersCalendarFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f290522r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290521q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290522r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new C8783b(strOrdersCalendarFragment.r5().getState()));
                        ScreenPerformanceTracker screenPerformanceTracker = strOrdersCalendarFragment.f290494p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C8782a c8782a = new C8782a(1, strOrdersCalendarFragment, StrOrdersCalendarFragment.class, "renderCore", "renderCore(Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/mvi/entity/CoreCalendarViewState;)V", 0);
                        this.f290521q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(interfaceC43160iR, screenPerformanceTracker, c8782a, this) == coroutine_suspended) {
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

            /* compiled from: StrOrdersCalendarFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$onCreateView$1$1$3", f = "StrOrdersCalendarFragment.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$c, reason: collision with other inner class name */
            public static final class C8786c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f290528q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ StrOrdersCalendarFragment f290529r;

                /* compiled from: StrOrdersCalendarFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUz0/c;", "it", "Lkotlin/G0;", "emit", "(LUz0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment$c$a$c$a, reason: collision with other inner class name */
                public static final class C8787a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ StrOrdersCalendarFragment f290530b;

                    public C8787a(StrOrdersCalendarFragment strOrdersCalendarFragment) {
                        this.f290530b = strOrdersCalendarFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        String strD;
                        Uz0.c cVar = (Uz0.c) obj;
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290530b;
                        com.avito.android.str_seller_orders_calendar.strorderscalendar.i iVar = new com.avito.android.str_seller_orders_calendar.strorderscalendar.i(1, strOrdersCalendarFragment.r5(), o.class, "accept", "accept(Ljava/lang/Object;)V", 0);
                        if (cVar instanceof c.a) {
                            strOrdersCalendarFragment.requireActivity().onBackPressed();
                        } else {
                            String strD2 = null;
                            if (cVar instanceof c.b) {
                                com.avito.android.deeplink_handler.handler.composite.a aVar = strOrdersCalendarFragment.f290495q0;
                                if (aVar == null) {
                                    aVar = null;
                                }
                                b.a.a(aVar, ((c.b) cVar).f16841a, null, null, 6);
                            } else if (cVar instanceof c.h) {
                                InterfaceC15733a interfaceC15733a = strOrdersCalendarFragment.f290502x0;
                                (interfaceC15733a != null ? interfaceC15733a : null).a(((c.h) cVar).f16849a);
                            } else if (cVar instanceof c.f) {
                                StrOrdersCalendarView strOrdersCalendarViewQ5 = strOrdersCalendarFragment.q5();
                                int i12 = ((c.f) cVar).f16847a - 3;
                                RecyclerView recyclerView = strOrdersCalendarViewQ5.f290544D;
                                (recyclerView != null ? recyclerView : null).postDelayed(new com.avito.android.str_seller_orders_calendar.strorderscalendar.d(strOrdersCalendarViewQ5, i12, 0), 300L);
                            } else if (cVar instanceof c.C1158c) {
                                MonthSelectorDialog.a aVar2 = MonthSelectorDialog.f290373l0;
                                String str = ((c.C1158c) cVar).f16842a;
                                aVar2.getClass();
                                MonthSelectorDialog.a.a(str).show(strOrdersCalendarFragment.getChildFragmentManager(), "MonthSelectorFragment");
                            } else if (cVar instanceof c.i) {
                                c.i iVar2 = (c.i) cVar;
                                strOrdersCalendarFragment.q5().b(iVar2.f16850a);
                                StrOrdersCalendarView strOrdersCalendarViewQ52 = strOrdersCalendarFragment.q5();
                                ViewGroup viewGroup = strOrdersCalendarViewQ52.f290563g;
                                Q.b(viewGroup);
                                Q.a(viewGroup, null);
                                strOrdersCalendarViewQ52.f290565i.setState(new UU.a(iVar2.f16851b.k0(strOrdersCalendarFragment.requireContext()), null, false, false, false, new com.avito.android.str_seller_orders_calendar.strorderscalendar.g(strOrdersCalendarFragment), C43852a.a(strOrdersCalendarFragment.requireContext(), R.drawable.str_calendar_rotate_screen_ic), null, null, false, 926, null));
                            } else if (cVar instanceof c.e) {
                                strOrdersCalendarFragment.requireActivity().setRequestedOrientation(C35835l0.p(strOrdersCalendarFragment.requireContext()) ? 1 : 0);
                            } else if (cVar instanceof c.d) {
                                InterfaceC13105a interfaceC13105a = strOrdersCalendarFragment.f290496r0;
                                if (interfaceC13105a == null) {
                                    interfaceC13105a = null;
                                }
                                c.d dVar = (c.d) cVar;
                                String str2 = dVar.f16843a;
                                Date date = dVar.f16844b;
                                if (date != null) {
                                    com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
                                    strD = com.avito.android.str_seller_orders_calendar.utils.a.d(date);
                                } else {
                                    strD = null;
                                }
                                Date date2 = dVar.f16845c;
                                if (date2 != null) {
                                    com.avito.android.str_seller_orders_calendar.utils.a.f291211a.getClass();
                                    strD2 = com.avito.android.str_seller_orders_calendar.utils.a.d(date2);
                                }
                                com.avito.android.lib.util.g.b(interfaceC13105a.a(str2, strD, strD2), strOrdersCalendarFragment.requireContext(), strOrdersCalendarFragment.getChildFragmentManager(), "StrSellerCalendarDialog");
                            } else if (cVar instanceof c.g) {
                                strOrdersCalendarFragment.requireView().postDelayed(new com.avito.android.str_seller_orders_calendar.strorderscalendar.f(strOrdersCalendarFragment, strOrdersCalendarFragment.requireView().getResources().getString(R.string.error_layout_refresh), iVar), 300L);
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C8786c(StrOrdersCalendarFragment strOrdersCalendarFragment, Continuation<? super C8786c> continuation) {
                    super(2, continuation);
                    this.f290529r = strOrdersCalendarFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C8786c(this.f290529r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C8786c) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f290528q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290529r;
                        InterfaceC43160i<Uz0.c> events = strOrdersCalendarFragment.r5().getEvents();
                        C8787a c8787a = new C8787a(strOrdersCalendarFragment);
                        this.f290528q = 1;
                        if (events.collect(c8787a, this) == coroutine_suspended) {
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
            public a(StrOrdersCalendarFragment strOrdersCalendarFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f290513r = strOrdersCalendarFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f290513r, continuation);
                aVar.f290512q = obj;
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
                T t12 = (T) this.f290512q;
                StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290513r;
                C43259k.d(t12, null, null, new C8778a(strOrdersCalendarFragment, null), 3);
                C43259k.d(t12, null, null, new b(strOrdersCalendarFragment, null), 3);
                C43259k.d(t12, null, null, new C8786c(strOrdersCalendarFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrOrdersCalendarFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f290510q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                StrOrdersCalendarFragment strOrdersCalendarFragment = StrOrdersCalendarFragment.this;
                a aVar = new a(strOrdersCalendarFragment, null);
                this.f290510q = 1;
                if (C23056p0.b(strOrdersCalendarFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: StrOrdersCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUz0/b;", "it", "Lkotlin/G0;", "invoke", "(LUz0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Uz0.b, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Uz0.b bVar) {
            kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
            StrOrdersCalendarFragment.this.r5().accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
            StrOrdersCalendarFragment.this.r5().accept(b.n.f16831a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrOrdersCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUz0/b;", "it", "Lkotlin/G0;", "invoke", "(LUz0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Uz0.b, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Uz0.b bVar) {
            kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
            StrOrdersCalendarFragment.this.r5().accept(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f290534l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f290534l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f290534l);
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
            return StrOrdersCalendarFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f290536l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f290536l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f290536l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f290537l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f290537l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f290537l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f290538l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f290538l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f290538l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: StrOrdersCalendarFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<o> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = StrOrdersCalendarFragment.this.f290492n0;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    static {
        new a(null);
        f290491B0 = R.attr.blue50;
    }

    public StrOrdersCalendarFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f290493o0 = new O0(m0.f406844a.b(o.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f290503y0 = new C47313c(new C31685o(14));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@Y61.k Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r5().accept(new b.k(getResources().getConfiguration().orientation));
        q5().f290559c.setVisibility(getResources().getBoolean(R.bool.is_str_calendar_toolbar_visible) ? 0 : 8);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        s5();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f290494p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
        getChildFragmentManager().p0("StrSellerCalendarDialog", getViewLifecycleOwner(), new com.avito.android.str_seller_orders_calendar.strorderscalendar.c(this, 1));
        return layoutInflater.inflate(R.layout.str_orders_calendar_fragment_redesign, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        d dVar = new d();
        Y1<Float> y12 = this.f290501w0;
        if (y12 == null) {
            y12 = null;
        }
        StrOrdersCalendarView strOrdersCalendarView = new StrOrdersCalendarView(view, dVar, y12);
        C47313c c47313c = this.f290503y0;
        kotlin.reflect.n<Object> nVar = f290490A0[0];
        c47313c.b(this, strOrdersCalendarView);
        s5();
        StrOrdersCalendarView strOrdersCalendarViewQ5 = q5();
        RecyclerView recyclerView = strOrdersCalendarViewQ5.f290544D;
        if (recyclerView == null) {
            recyclerView = null;
        }
        com.avito.konveyor.adapter.d dVar2 = this.f290497s0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        recyclerView.setAdapter(dVar2);
        RecyclerView recyclerView2 = strOrdersCalendarViewQ5.f290543C;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        com.avito.konveyor.adapter.d dVar3 = this.f290498t0;
        if (dVar3 == null) {
            dVar3 = null;
        }
        recyclerView2.setAdapter(dVar3);
        RecyclerView recyclerView3 = strOrdersCalendarViewQ5.f290545E;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        com.avito.konveyor.adapter.d dVar4 = this.f290499u0;
        if (dVar4 == null) {
            dVar4 = null;
        }
        recyclerView3.setAdapter(dVar4);
        final int i12 = 0;
        strOrdersCalendarViewQ5.f290561e.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrOrdersCalendarFragment f290812c;

            {
                this.f290812c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290812c;
                switch (i12) {
                    case 0:
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.a.f16816a);
                        break;
                    case 1:
                        kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.l.f16829a);
                        break;
                    case 2:
                        kotlin.reflect.n<Object>[] nVarArr3 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.m.f16830a);
                        break;
                    case 3:
                        kotlin.reflect.n<Object>[] nVarArr4 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.i.f16826a);
                        break;
                    case 4:
                        kotlin.reflect.n<Object>[] nVarArr5 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.v.f16839a);
                        break;
                    case 5:
                        kotlin.reflect.n<Object>[] nVarArr6 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.c.f16818a);
                        break;
                    case 6:
                        kotlin.reflect.n<Object>[] nVarArr7 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.C1157b.f16817a);
                        break;
                    default:
                        kotlin.reflect.n<Object>[] nVarArr8 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.h.f16825a);
                        break;
                }
            }
        });
        final int i13 = 1;
        strOrdersCalendarViewQ5.f290562f.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrOrdersCalendarFragment f290812c;

            {
                this.f290812c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290812c;
                switch (i13) {
                    case 0:
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.a.f16816a);
                        break;
                    case 1:
                        kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.l.f16829a);
                        break;
                    case 2:
                        kotlin.reflect.n<Object>[] nVarArr3 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.m.f16830a);
                        break;
                    case 3:
                        kotlin.reflect.n<Object>[] nVarArr4 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.i.f16826a);
                        break;
                    case 4:
                        kotlin.reflect.n<Object>[] nVarArr5 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.v.f16839a);
                        break;
                    case 5:
                        kotlin.reflect.n<Object>[] nVarArr6 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.c.f16818a);
                        break;
                    case 6:
                        kotlin.reflect.n<Object>[] nVarArr7 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.C1157b.f16817a);
                        break;
                    default:
                        kotlin.reflect.n<Object>[] nVarArr8 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.h.f16825a);
                        break;
                }
            }
        });
        final int i14 = 2;
        strOrdersCalendarViewQ5.f290581y.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrOrdersCalendarFragment f290812c;

            {
                this.f290812c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290812c;
                switch (i14) {
                    case 0:
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.a.f16816a);
                        break;
                    case 1:
                        kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.l.f16829a);
                        break;
                    case 2:
                        kotlin.reflect.n<Object>[] nVarArr3 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.m.f16830a);
                        break;
                    case 3:
                        kotlin.reflect.n<Object>[] nVarArr4 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.i.f16826a);
                        break;
                    case 4:
                        kotlin.reflect.n<Object>[] nVarArr5 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.v.f16839a);
                        break;
                    case 5:
                        kotlin.reflect.n<Object>[] nVarArr6 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.c.f16818a);
                        break;
                    case 6:
                        kotlin.reflect.n<Object>[] nVarArr7 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.C1157b.f16817a);
                        break;
                    default:
                        kotlin.reflect.n<Object>[] nVarArr8 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.h.f16825a);
                        break;
                }
            }
        });
        final int i15 = 3;
        strOrdersCalendarViewQ5.f290568l.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrOrdersCalendarFragment f290812c;

            {
                this.f290812c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290812c;
                switch (i15) {
                    case 0:
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.a.f16816a);
                        break;
                    case 1:
                        kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.l.f16829a);
                        break;
                    case 2:
                        kotlin.reflect.n<Object>[] nVarArr3 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.m.f16830a);
                        break;
                    case 3:
                        kotlin.reflect.n<Object>[] nVarArr4 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.i.f16826a);
                        break;
                    case 4:
                        kotlin.reflect.n<Object>[] nVarArr5 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.v.f16839a);
                        break;
                    case 5:
                        kotlin.reflect.n<Object>[] nVarArr6 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.c.f16818a);
                        break;
                    case 6:
                        kotlin.reflect.n<Object>[] nVarArr7 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.C1157b.f16817a);
                        break;
                    default:
                        kotlin.reflect.n<Object>[] nVarArr8 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.h.f16825a);
                        break;
                }
            }
        });
        final int i16 = 4;
        strOrdersCalendarViewQ5.f290564h.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.e

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ StrOrdersCalendarFragment f290812c;

            {
                this.f290812c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290812c;
                switch (i16) {
                    case 0:
                        kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.a.f16816a);
                        break;
                    case 1:
                        kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.l.f16829a);
                        break;
                    case 2:
                        kotlin.reflect.n<Object>[] nVarArr3 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.m.f16830a);
                        break;
                    case 3:
                        kotlin.reflect.n<Object>[] nVarArr4 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.i.f16826a);
                        break;
                    case 4:
                        kotlin.reflect.n<Object>[] nVarArr5 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.v.f16839a);
                        break;
                    case 5:
                        kotlin.reflect.n<Object>[] nVarArr6 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.c.f16818a);
                        break;
                    case 6:
                        kotlin.reflect.n<Object>[] nVarArr7 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.C1157b.f16817a);
                        break;
                    default:
                        kotlin.reflect.n<Object>[] nVarArr8 = StrOrdersCalendarFragment.f290490A0;
                        strOrdersCalendarFragment.r5().accept(b.h.f16825a);
                        break;
                }
            }
        });
        ImageView imageView = strOrdersCalendarViewQ5.f290576t;
        if (imageView != null) {
            final int i17 = 5;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ StrOrdersCalendarFragment f290812c;

                {
                    this.f290812c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290812c;
                    switch (i17) {
                        case 0:
                            kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.a.f16816a);
                            break;
                        case 1:
                            kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.l.f16829a);
                            break;
                        case 2:
                            kotlin.reflect.n<Object>[] nVarArr3 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.m.f16830a);
                            break;
                        case 3:
                            kotlin.reflect.n<Object>[] nVarArr4 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.i.f16826a);
                            break;
                        case 4:
                            kotlin.reflect.n<Object>[] nVarArr5 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.v.f16839a);
                            break;
                        case 5:
                            kotlin.reflect.n<Object>[] nVarArr6 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.c.f16818a);
                            break;
                        case 6:
                            kotlin.reflect.n<Object>[] nVarArr7 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.C1157b.f16817a);
                            break;
                        default:
                            kotlin.reflect.n<Object>[] nVarArr8 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.h.f16825a);
                            break;
                    }
                }
            });
        }
        View view2 = strOrdersCalendarViewQ5.f290572p;
        if (view2 != null) {
            final int i18 = 6;
            view2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ StrOrdersCalendarFragment f290812c;

                {
                    this.f290812c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290812c;
                    switch (i18) {
                        case 0:
                            kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.a.f16816a);
                            break;
                        case 1:
                            kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.l.f16829a);
                            break;
                        case 2:
                            kotlin.reflect.n<Object>[] nVarArr3 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.m.f16830a);
                            break;
                        case 3:
                            kotlin.reflect.n<Object>[] nVarArr4 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.i.f16826a);
                            break;
                        case 4:
                            kotlin.reflect.n<Object>[] nVarArr5 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.v.f16839a);
                            break;
                        case 5:
                            kotlin.reflect.n<Object>[] nVarArr6 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.c.f16818a);
                            break;
                        case 6:
                            kotlin.reflect.n<Object>[] nVarArr7 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.C1157b.f16817a);
                            break;
                        default:
                            kotlin.reflect.n<Object>[] nVarArr8 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.h.f16825a);
                            break;
                    }
                }
            });
        }
        strOrdersCalendarViewQ5.f290565i.setState(new UU.a(null, null, false, false, false, new e(), C43852a.a(requireContext(), R.drawable.str_calendar_rotate_screen_ic), null, null, false, 927, null));
        C c12 = this.f290500v0;
        if (c12 == null) {
            c12 = null;
        }
        if (!c12.l()) {
            final int i19 = 7;
            strOrdersCalendarViewQ5.f290560d.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.str_seller_orders_calendar.strorderscalendar.e

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ StrOrdersCalendarFragment f290812c;

                {
                    this.f290812c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view22) {
                    StrOrdersCalendarFragment strOrdersCalendarFragment = this.f290812c;
                    switch (i19) {
                        case 0:
                            kotlin.reflect.n<Object>[] nVarArr = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.a.f16816a);
                            break;
                        case 1:
                            kotlin.reflect.n<Object>[] nVarArr2 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.l.f16829a);
                            break;
                        case 2:
                            kotlin.reflect.n<Object>[] nVarArr3 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.m.f16830a);
                            break;
                        case 3:
                            kotlin.reflect.n<Object>[] nVarArr4 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.i.f16826a);
                            break;
                        case 4:
                            kotlin.reflect.n<Object>[] nVarArr5 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.v.f16839a);
                            break;
                        case 5:
                            kotlin.reflect.n<Object>[] nVarArr6 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.c.f16818a);
                            break;
                        case 6:
                            kotlin.reflect.n<Object>[] nVarArr7 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.C1157b.f16817a);
                            break;
                        default:
                            kotlin.reflect.n<Object>[] nVarArr8 = StrOrdersCalendarFragment.f290490A0;
                            strOrdersCalendarFragment.r5().accept(b.h.f16825a);
                            break;
                    }
                }
            });
        }
        getChildFragmentManager().p0("month_selector_result", getViewLifecycleOwner(), new com.avito.android.str_seller_orders_calendar.strorderscalendar.c(this, 0));
        ScreenPerformanceTracker screenPerformanceTracker = this.f290494p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.str_seller_orders_calendar.strorderscalendar.di.a.a().a((com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h) C29972i.a(C29972i.b(this), com.avito.android.str_seller_orders_calendar.strorderscalendar.di.h.class), cv.c.b(this), s.c(this), new f(), getResources().getConfiguration().orientation).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f290494p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        if (bundle != null) {
            r5().accept(b.o.f16832a);
        }
    }

    public final StrOrdersCalendarView q5() {
        C47313c c47313c = this.f290503y0;
        kotlin.reflect.n<Object> nVar = f290490A0[0];
        return (StrOrdersCalendarView) c47313c.a();
    }

    public final o r5() {
        return (o) this.f290493o0.getValue();
    }

    public final void s5() {
        StrOrdersCalendarView strOrdersCalendarViewQ5 = q5();
        if (strOrdersCalendarViewQ5.f290571o != null) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            ConstraintLayout constraintLayout = strOrdersCalendarViewQ5.f290566j;
            dVar.g(constraintLayout);
            if (requireContext().getResources().getBoolean(R.bool.is_tablet) || C35835l0.p(requireContext())) {
                dVar.z(R.id.banner_container, 4, y6.b(8));
                dVar.p(R.id.banner_container).f44269e.f44313a0 = y6.b(364);
            } else {
                dVar.z(R.id.banner_container, 4, y6.b(24));
                dVar.p(R.id.banner_container).f44269e.f44313a0 = constraintLayout.getWidth();
            }
            dVar.c(constraintLayout);
        }
    }
}
