package com.avito.android.str_seller_orders_calendar.strorderscalendar;

import Uz0.b;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarFragment;
import com.avito.android.str_seller_orders_calendar.utils.DynamicScrollGridLayoutManager;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.internal.K;

/* compiled from: StrOrdersCalendarView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/StrOrdersCalendarView;", "", "b", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StrOrdersCalendarView {

    /* renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f290540Q = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final DynamicScrollGridLayoutManager f290541A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final StrOrdersCalendarView$flatInfoLayoutManager$1 f290542B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView f290543C;

    /* renamed from: D, reason: collision with root package name */
    public final RecyclerView f290544D;

    /* renamed from: E, reason: collision with root package name */
    public final RecyclerView f290545E;

    /* renamed from: F, reason: collision with root package name */
    public final m f290546F;

    /* renamed from: G, reason: collision with root package name */
    public final n f290547G;

    /* renamed from: H, reason: collision with root package name */
    public final l f290548H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f290549I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final c f290550J;

    /* renamed from: K, reason: collision with root package name */
    public final int f290551K;

    /* renamed from: L, reason: collision with root package name */
    public final int f290552L;

    /* renamed from: M, reason: collision with root package name */
    public final int f290553M;

    /* renamed from: N, reason: collision with root package name */
    public final int f290554N;

    /* renamed from: O, reason: collision with root package name */
    public int f290555O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C43238h f290556P;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Uz0.b, G0> f290557a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y1<Float> f290558b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f290559c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f290560d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f290561e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f290562f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f290563g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Button f290564h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f290565i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f290566j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f290567k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f290568l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final TextView f290569m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final View f290570n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final View f290571o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final View f290572p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final TextView f290573q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final TextView f290574r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final ImageView f290575s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final ImageView f290576t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final View f290577u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final ImageView f290578v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextView f290579w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final TextView f290580x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final View f290581y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final StrOrdersCalendarView$datesLayoutManager$1 f290582z;

    /* compiled from: StrOrdersCalendarView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarView$1", f = "StrOrdersCalendarView.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f290583q;

        /* compiled from: StrOrdersCalendarView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newAlpha", "Lkotlin/G0;", "emit", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.str_seller_orders_calendar.strorderscalendar.StrOrdersCalendarView$a$a, reason: collision with other inner class name */
        public static final class C8788a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StrOrdersCalendarView f290585b;

            public C8788a(StrOrdersCalendarView strOrdersCalendarView) {
                this.f290585b = strOrdersCalendarView;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                float fFloatValue = ((Number) obj).floatValue();
                StrOrdersCalendarView strOrdersCalendarView = this.f290585b;
                strOrdersCalendarView.f290568l.setAlpha(fFloatValue);
                strOrdersCalendarView.f290569m.setAlpha(1.0f - fFloatValue);
                return G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return StrOrdersCalendarView.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f290583q;
            if (i12 == 0) {
                C42729a0.b(obj);
                StrOrdersCalendarView strOrdersCalendarView = StrOrdersCalendarView.this;
                Y1<Float> y12 = strOrdersCalendarView.f290558b;
                C8788a c8788a = new C8788a(strOrdersCalendarView);
                this.f290583q = 1;
                if (y12.collect(c8788a, this) == coroutine_suspended) {
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

    /* compiled from: StrOrdersCalendarView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/strorderscalendar/StrOrdersCalendarView$b;", "", "<init>", "()V", "", "AGGRESSIVE_SCROLL_THRESHOLD", "I", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StrOrdersCalendarView(@Y61.k View view, @Y61.k Y41.l<? super Uz0.b, G0> lVar, @Y61.k Y1<Float> y12) {
        this.f290557a = lVar;
        this.f290558b = y12;
        View viewFindViewById = view.findViewById(R.id.group_header);
        this.f290559c = viewFindViewById;
        this.f290560d = (TextView) view.findViewById(R.id.header_tv);
        this.f290561e = view.findViewById(R.id.back_iv);
        this.f290562f = view.findViewById(R.id.refresh_ic);
        this.f290563g = (ViewGroup) view.findViewById(R.id.shortcuts_group);
        this.f290564h = (Button) view.findViewById(R.id.today_button);
        this.f290565i = (Button) view.findViewById(R.id.rotation_button);
        this.f290566j = (ConstraintLayout) view.findViewById(R.id.content_group);
        this.f290567k = (FrameLayout) view.findViewById(R.id.current_month_group);
        this.f290568l = (TextView) view.findViewById(R.id.current_month_tv);
        this.f290569m = (TextView) view.findViewById(R.id.short_current_month_tv);
        this.f290570n = view.findViewById(R.id.current_month_stub);
        this.f290571o = view.findViewById(R.id.banner_container);
        this.f290572p = view.findViewById(R.id.banner_root_view);
        this.f290573q = (TextView) view.findViewById(R.id.banner_title_tv);
        this.f290574r = (TextView) view.findViewById(R.id.banner_subtitle_tv);
        this.f290575s = (ImageView) view.findViewById(R.id.banner_image_view);
        this.f290576t = (ImageView) view.findViewById(R.id.banner_close_icon_iv);
        this.f290577u = view.findViewById(R.id.error_group);
        this.f290578v = (ImageView) view.findViewById(R.id.error_iv);
        this.f290579w = (TextView) view.findViewById(R.id.error_title_tv);
        this.f290580x = (TextView) view.findViewById(R.id.error_subtitle_tv);
        this.f290581y = view.findViewById(R.id.retry_btn);
        view.getContext();
        StrOrdersCalendarView$datesLayoutManager$1 strOrdersCalendarView$datesLayoutManager$1 = new StrOrdersCalendarView$datesLayoutManager$1(0, false);
        this.f290582z = strOrdersCalendarView$datesLayoutManager$1;
        DynamicScrollGridLayoutManager dynamicScrollGridLayoutManager = new DynamicScrollGridLayoutManager();
        dynamicScrollGridLayoutManager.f291193r = DynamicScrollGridLayoutManager.Companion.Type.f291206c;
        dynamicScrollGridLayoutManager.f291198w = 15;
        dynamicScrollGridLayoutManager.i1();
        this.f290541A = dynamicScrollGridLayoutManager;
        view.getContext();
        StrOrdersCalendarView$flatInfoLayoutManager$1 strOrdersCalendarView$flatInfoLayoutManager$1 = new StrOrdersCalendarView$flatInfoLayoutManager$1(1, false);
        this.f290542B = strOrdersCalendarView$flatInfoLayoutManager$1;
        this.f290550J = new c();
        int iB2 = kotlin.math.b.b(view.getContext().getResources().getDimension(R.dimen.str_calendar_flat_info_width_redesign));
        this.f290551K = iB2;
        int iB3 = kotlin.math.b.b(view.getContext().getResources().getDimension(R.dimen.str_calendar_flat_info_collapsed_width));
        this.f290552L = iB3;
        this.f290553M = (iB2 + iB3) / 2;
        this.f290554N = iB2 - iB3;
        this.f290555O = iB2;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        C43238h c43238hA = U.a(K.f411877a);
        this.f290556P = c43238hA;
        this.f290548H = new l(this);
        this.f290546F = new m(this);
        this.f290547G = new n(this);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.flat_info_rv);
        recyclerView.setLayoutManager(strOrdersCalendarView$flatInfoLayoutManager$1);
        recyclerView.s();
        recyclerView.setHasFixedSize(true);
        l lVar2 = this.f290548H;
        recyclerView.o(lVar2 == null ? null : lVar2);
        this.f290543C = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.main_calendar_rv);
        recyclerView2.setChildDrawingOrderCallback(new C31685o(15));
        recyclerView2.setLayoutManager(dynamicScrollGridLayoutManager);
        recyclerView2.s();
        recyclerView2.setHasFixedSize(true);
        m mVar = this.f290546F;
        recyclerView2.o(mVar == null ? null : mVar);
        this.f290544D = recyclerView2;
        RecyclerView recyclerView3 = (RecyclerView) view.findViewById(R.id.dates_rv);
        recyclerView3.setLayoutManager(strOrdersCalendarView$datesLayoutManager$1);
        recyclerView3.s();
        recyclerView3.setHasFixedSize(true);
        n nVar = this.f290547G;
        recyclerView3.o(nVar == null ? null : nVar);
        this.f290545E = recyclerView3;
        viewFindViewById.setVisibility(view.getResources().getBoolean(R.bool.is_str_calendar_toolbar_visible) ? 0 : 8);
        C43259k.d(c43238hA, null, null, new a(null), 3);
    }

    public static final void a(StrOrdersCalendarView strOrdersCalendarView) {
        StrOrdersCalendarView$datesLayoutManager$1 strOrdersCalendarView$datesLayoutManager$1 = strOrdersCalendarView.f290582z;
        int iK1 = strOrdersCalendarView$datesLayoutManager$1.K1();
        RecyclerView recyclerView = strOrdersCalendarView.f290545E;
        if (recyclerView == null) {
            recyclerView = null;
        }
        RecyclerView.C cP2 = recyclerView.P(iK1);
        int iM1 = strOrdersCalendarView$datesLayoutManager$1.M1();
        RecyclerView recyclerView2 = strOrdersCalendarView.f290545E;
        RecyclerView.C cP3 = (recyclerView2 != null ? recyclerView2 : null).P(iM1);
        b.p pVar = new b.p((iK1 + iM1) / 2);
        StrOrdersCalendarFragment.d dVar = (StrOrdersCalendarFragment.d) strOrdersCalendarView.f290557a;
        dVar.invoke(pVar);
        boolean z12 = strOrdersCalendarView.f290549I;
        if (!z12 && (cP2 instanceof com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_stub_item.f) && (cP3 instanceof com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item.e)) {
            dVar.invoke(b.q.f16834a);
            strOrdersCalendarView.f290549I = true;
        } else if (!z12 && (cP2 instanceof com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item.e) && (cP3 instanceof com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_stub_item.f)) {
            dVar.invoke(b.r.f16835a);
            strOrdersCalendarView.f290549I = true;
        } else if ((cP2 instanceof com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item.e) && (cP3 instanceof com.avito.android.str_seller_orders_calendar.strorderscalendar.items.date_item.e)) {
            strOrdersCalendarView.f290549I = false;
        }
    }

    public final void b(boolean z12) {
        this.f290555O = z12 ? this.f290552L : this.f290551K;
        RecyclerView recyclerView = this.f290543C;
        if (recyclerView == null) {
            recyclerView = null;
        }
        TransitionManager.endTransitions(recyclerView);
        TransitionManager.beginDelayedTransition(recyclerView);
        RecyclerView recyclerView2 = this.f290543C;
        ViewGroup.LayoutParams layoutParams = (recyclerView2 != null ? recyclerView2 : null).getLayoutParams();
        layoutParams.width = this.f290555O;
        recyclerView.setLayoutParams(layoutParams);
        FrameLayout frameLayout = this.f290567k;
        TransitionManager.endTransitions(frameLayout);
        TransitionManager.beginDelayedTransition(frameLayout);
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        layoutParams2.width = this.f290555O;
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.post(new k(frameLayout, this, 1));
        this.f290558b.K5(Float.valueOf(z12 ? 0.0f : 1.0f));
    }

    /* compiled from: StrOrdersCalendarView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_seller_orders_calendar/strorderscalendar/StrOrdersCalendarView$c", "Landroidx/recyclerview/widget/RecyclerView$q;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements RecyclerView.q {
        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final boolean b(@Y61.k RecyclerView recyclerView, @Y61.k MotionEvent motionEvent) {
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(boolean z12) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void g2(@Y61.k MotionEvent motionEvent) {
        }
    }
}
