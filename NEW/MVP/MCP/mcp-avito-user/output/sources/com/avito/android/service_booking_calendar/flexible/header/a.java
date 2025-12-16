package com.avito.android.service_booking_calendar.flexible.header;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23069w;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.search.filter.RunnableC34589p;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.service_booking_calendar.day.schedule.domain.FlexibleCalendarDayItem;
import com.avito.android.service_booking_calendar.domain.ToolbarAction;
import com.avito.android.service_booking_calendar.flexible.data.domain.WeekItem;
import com.avito.android.service_booking_calendar.flexible.di.x;
import com.avito.android.service_booking_calendar.flexible.di.y;
import com.avito.android.service_booking_calendar.flexible.di.z;
import com.avito.android.service_booking_calendar.flexible.header.mvi.entity.CalendarHeaderState;
import com.avito.android.service_booking_calendar.flexible.header.view.ScheduleInfoPanelView;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.V2;
import i31.InterfaceC41220a;
import it0.C42107b;
import it0.C42108c;
import it0.InterfaceC42106a;
import java.util.Collections;
import java.util.List;
import jt0.InterfaceC42425a;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarHeaderStateRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/a;", "", "e", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f275859a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f275860b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f275861c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f275862d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f275863e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.flexible.header.recycler.f f275864f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.flexible.header.toolbar.c f275865g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.flexible.header.g f275866h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.service_booking_calendar.flexible.header.h f275867i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.tooltip.k f275868j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public InterfaceC42106a f275869k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public CalendarHeaderState.MODE f275870l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final InterfaceC42726C f275871m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final j f275872n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final i f275873o;

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/day/schedule/domain/FlexibleCalendarDayItem;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.CalendarHeaderStateRenderer$2$1", f = "CalendarHeaderStateRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.service_booking_calendar.flexible.header.a$a, reason: collision with other inner class name */
    public static final class C8186a extends SuspendLambda implements q<InterfaceC43172j<? super FlexibleCalendarDayItem>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f275874q;

        public C8186a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super FlexibleCalendarDayItem> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C8186a c8186a = new C8186a(3, continuation);
            c8186a.f275874q = th2;
            return c8186a.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f275874q;
            V2.f318762a.b("An error occurred while click day item: " + th2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/day/schedule/domain/FlexibleCalendarDayItem;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/service_booking_calendar/day/schedule/domain/FlexibleCalendarDayItem;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.CalendarHeaderStateRenderer$2$2", f = "CalendarHeaderStateRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<FlexibleCalendarDayItem, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f275875q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.service_booking_calendar.flexible.d, G0> f275876r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f275876r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f275876r, continuation);
            bVar.f275875q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(FlexibleCalendarDayItem flexibleCalendarDayItem, Continuation<? super G0> continuation) {
            return ((b) create(flexibleCalendarDayItem, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            this.f275876r.invoke(new InterfaceC42425a.i((FlexibleCalendarDayItem) this.f275875q));
            return G0.f406611a;
        }
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_booking_calendar/domain/ToolbarAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.CalendarHeaderStateRenderer$2$3", f = "CalendarHeaderStateRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements q<InterfaceC43172j<? super ToolbarAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f275877q;

        public c() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ToolbarAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            c cVar = new c(3, continuation);
            cVar.f275877q = th2;
            return cVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Throwable th2 = this.f275877q;
            V2.f318762a.b("An error occurred while click toolbar action: " + th2, null);
            return G0.f406611a;
        }
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_booking_calendar/domain/ToolbarAction;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/service_booking_calendar/domain/ToolbarAction;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.header.CalendarHeaderStateRenderer$2$4", f = "CalendarHeaderStateRenderer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<ToolbarAction, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f275878q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.service_booking_calendar.flexible.d, G0> f275879r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f275879r = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = new d(this.f275879r, continuation);
            dVar.f275878q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(ToolbarAction toolbarAction, Continuation<? super G0> continuation) {
            return ((d) create(toolbarAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ToolbarAction toolbarAction = (ToolbarAction) this.f275878q;
            this.f275879r.invoke(new InterfaceC42425a.g(toolbarAction.f275534d, toolbarAction.f275535e));
            return G0.f406611a;
        }
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_calendar/flexible/header/a$e;", "", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface e {
        @k
        a a(@k View view, @k Y41.l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar);
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f {
        static {
            int[] iArr = new int[CalendarHeaderState.MODE.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CalendarHeaderState.MODE mode = CalendarHeaderState.MODE.f276021b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC42106a f275880l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f275881m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l0.a f275882n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ a f275883o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.service_booking_calendar.flexible.d, G0> f275884p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.avito.android.lib.design.tooltip.k kVar, a aVar, l0.a aVar2, Y41.l lVar, InterfaceC42106a interfaceC42106a) {
            super(1);
            this.f275880l = interfaceC42106a;
            this.f275881m = kVar;
            this.f275882n = aVar2;
            this.f275883o = aVar;
            this.f275884p = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            o oVar2 = oVar;
            InterfaceC42106a interfaceC42106a = this.f275880l;
            oVar2.i(interfaceC42106a.getF405346b());
            oVar2.b(interfaceC42106a.getF405347c());
            oVar2.d(interfaceC42106a.getF405345a());
            Y41.l<com.avito.android.service_booking_calendar.flexible.d, G0> lVar = this.f275884p;
            l0.a aVar = this.f275882n;
            com.avito.android.lib.design.tooltip.k kVar = this.f275881m;
            oVar2.c(new com.avito.android.service_booking_calendar.flexible.header.c(aVar, kVar, this.f275883o, lVar, interfaceC42106a));
            kVar.d(new com.avito.android.service_booking_calendar.flexible.header.c(kVar, this.f275883o, aVar, lVar, interfaceC42106a));
            return G0.f406611a;
        }
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends N implements Y41.a<Integer> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf(a.this.f275866h.f275909b.getResources().getDimensionPixelSize(R.dimen.flexible_calendar_week_day_item_size_with_paddings));
        }
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_booking_calendar/flexible/header/a$i", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.service_booking_calendar.flexible.d, G0> f275886b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Y41.l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar) {
            this.f275886b = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            int iH1;
            if (i12 != 0) {
                return;
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (iH1 = linearLayoutManager.H1()) == -1) {
                return;
            }
            this.f275886b.invoke(new InterfaceC42425a.j(iH1));
        }
    }

    /* compiled from: CalendarHeaderStateRenderer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_booking_calendar/flexible/header/a$j", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends RecyclerView.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l<com.avito.android.service_booking_calendar.flexible.d, G0> f275887b;

        /* JADX WARN: Multi-variable type inference failed */
        public j(Y41.l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar) {
            this.f275887b = lVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            int iH1;
            if (i12 == 0) {
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || (iH1 = linearLayoutManager.H1()) == -1) {
                    return;
                }
                this.f275887b.invoke(new InterfaceC42425a.m(iH1));
            }
        }
    }

    @i31.c
    public a(@InterfaceC41220a @k View view, @InterfaceC41220a @k Y41.l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar, @y @k com.avito.konveyor.adapter.a aVar, @y @k com.avito.konveyor.adapter.j jVar, @k @z com.avito.konveyor.adapter.a aVar2, @k @z com.avito.konveyor.adapter.j jVar2, @x @k com.avito.konveyor.adapter.a aVar3, @x @k com.avito.konveyor.adapter.j jVar3, @x @k com.avito.konveyor.a aVar4, @k @z RecyclerView.t tVar, @k com.avito.android.service_booking_calendar.flexible.header.recycler.f fVar, @k com.avito.android.service_booking_calendar.flexible.header.toolbar.c cVar) {
        this.f275859a = aVar;
        this.f275860b = jVar;
        this.f275861c = aVar2;
        this.f275862d = aVar3;
        this.f275863e = jVar3;
        this.f275864f = fVar;
        this.f275865g = cVar;
        com.avito.android.service_booking_calendar.flexible.header.g gVar = new com.avito.android.service_booking_calendar.flexible.header.g(view);
        this.f275866h = gVar;
        com.avito.android.service_booking_calendar.flexible.header.h hVar = new com.avito.android.service_booking_calendar.flexible.header.h(aVar4, gVar);
        this.f275867i = hVar;
        this.f275871m = C42727D.c(new h());
        j jVar4 = new j(lVar);
        this.f275872n = jVar4;
        i iVar = new i(lVar);
        this.f275873o = iVar;
        gVar.f275913f.setAdapter(jVar);
        RecyclerView recyclerView = gVar.f275918k;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(jVar2);
        recyclerView.setRecycledViewPool(tVar);
        new J().b(recyclerView);
        recyclerView.o(jVar4);
        MonthCalendarLayoutManager monthCalendarLayoutManager = new MonthCalendarLayoutManager(gVar.f275909b, 6);
        RecyclerView recyclerView2 = gVar.f275919l;
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(monthCalendarLayoutManager);
        recyclerView2.setAdapter(jVar3);
        recyclerView2.setRecycledViewPool(tVar);
        new com.avito.android.service_booking_calendar.flexible.header.i(aVar4).b(recyclerView2);
        recyclerView2.o(iVar);
        recyclerView2.o(hVar);
        gVar.f275910c.setNavigationOnClickListener(new com.avito.android.seller_promotions.b(6, lVar));
        recyclerView.o(jVar4);
        InterfaceC22983P interfaceC22983PA = V0.a(view);
        if (interfaceC22983PA != null) {
            InterfaceC43160i<FlexibleCalendarDayItem> interfaceC43160iL0 = fVar.L0();
            Lifecycle lifecycle = interfaceC22983PA.getLifecycle();
            Lifecycle.State state = Lifecycle.State.f46682e;
            C43175k.K(new C43197r1(new b(lVar, null), new C43152f0(C23069w.a(interfaceC43160iL0, lifecycle, state), new C8186a(3, null))), C22981N.a(interfaceC22983PA.getLifecycle()));
            com.avito.android.authorization.auto_recovery.phone_confirm.b.n(interfaceC22983PA, new C43197r1(new d(lVar, null), new C43152f0(C23069w.a(cVar.getF276084c(), interfaceC22983PA.getLifecycle(), state), new c(3, null))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.avito.android.lib.design.tooltip.k a(InterfaceC42106a interfaceC42106a, Y41.l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar) {
        InterfaceC42106a interfaceC42106a2 = this.f275869k;
        com.avito.android.lib.design.tooltip.h hVar = null;
        Object[] objArr = 0;
        if (interfaceC42106a2 != null && interfaceC42106a2.equals(interfaceC42106a)) {
            return null;
        }
        com.avito.android.lib.design.tooltip.k kVar = this.f275868j;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f275868j = null;
        this.f275869k = interfaceC42106a;
        l0.a aVar = new l0.a();
        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(this.f275866h.f275908a.getContext(), 0, 0, 6, null);
        com.avito.android.lib.design.tooltip.p.a(kVar2, new g(kVar2, this, aVar, lVar, interfaceC42106a));
        kVar2.setOutsideTouchable(false);
        kVar2.f181224j = new r.a(hVar, 1, objArr == true ? 1 : 0);
        this.f275868j = kVar2;
        return kVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@k CalendarHeaderState calendarHeaderState, @k Y41.l<? super com.avito.android.service_booking_calendar.flexible.d, G0> lVar) {
        InterfaceC42106a interfaceC42106a;
        com.avito.android.lib.design.tooltip.k kVarA;
        View viewZ;
        WeekItem weekItem;
        Integer num;
        org.threeten.bp.f f275369c;
        CharSequence charSequenceE;
        int i12;
        com.avito.android.service_booking_calendar.flexible.header.g gVar = this.f275866h;
        D6.G(gVar.f275911d, calendarHeaderState.f276007d);
        Integer num2 = calendarHeaderState.f276012i;
        CalendarHeaderState.MODE mode = calendarHeaderState.f276006c;
        List<WeekItem> list = calendarHeaderState.f276011h;
        TextView textView = gVar.f275912e;
        if (num2 != null && (weekItem = list.get(num2.intValue())) != null && (num = weekItem.f275676d) != null) {
            FlexibleCalendarDayItem flexibleCalendarDayItem = weekItem.f275675c.get(num.intValue());
            if (flexibleCalendarDayItem != null && (f275369c = flexibleCalendarDayItem.getF275369c()) != null) {
                InterfaceC42726C interfaceC42726C = com.avito.android.service_booking_calendar.p.f276163a;
                String strA = f275369c.f421948b.f421941b == org.threeten.bp.f.F().f421948b.f421941b ? f275369c.A((org.threeten.bp.format.c) com.avito.android.service_booking_calendar.p.f276163a.getValue()) : f275369c.A((org.threeten.bp.format.c) com.avito.android.service_booking_calendar.p.f276164b.getValue());
                if (strA != null) {
                    FV.a aVar = FV.a.f4720a;
                    Context context = textView.getContext();
                    int iOrdinal = mode.ordinal();
                    if (iOrdinal == 0) {
                        i12 = R.attr.textIconExpandMore;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i12 = R.attr.textIconExpandLess;
                    }
                    charSequenceE = aVar.e(strA, context, i12, FV.a.f4721b);
                } else {
                    charSequenceE = null;
                }
                textView.setText(charSequenceE);
            }
        }
        CalendarHeaderState.MODE mode2 = this.f275870l;
        RecyclerView recyclerView = gVar.f275918k;
        RecyclerView recyclerView2 = gVar.f275919l;
        if (mode2 != mode) {
            int iOrdinal2 = mode.ordinal();
            if (iOrdinal2 == 0) {
                D6.G(recyclerView, true);
                D6.w(recyclerView2);
            } else if (iOrdinal2 == 1) {
                int iIntValue = ((Number) this.f275871m.getValue()).intValue() * calendarHeaderState.f276015l;
                ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iIntValue;
                    recyclerView2.setLayoutParams(layoutParams);
                }
                D6.w(recyclerView);
                D6.G(recyclerView2, true);
                this.f275863e.notifyDataSetChanged();
            }
            this.f275870l = mode;
        }
        CalendarHeaderState.b bVar = calendarHeaderState.f276010g;
        boolean z12 = bVar instanceof CalendarHeaderState.b.C8188b;
        ScheduleInfoPanelView scheduleInfoPanelView = gVar.f275916i;
        if (z12) {
            scheduleInfoPanelView.setOnClickListener(null);
            D6.w(scheduleInfoPanelView.f276099e);
            D6.H(scheduleInfoPanelView.f276100f);
        } else if (bVar instanceof CalendarHeaderState.b.a) {
            D6.w(scheduleInfoPanelView.f276100f);
            D6.H(scheduleInfoPanelView.f276099e);
            CalendarHeaderState.b.a aVar2 = (CalendarHeaderState.b.a) bVar;
            I5.a(scheduleInfoPanelView.f276096b, aVar2.f276025a, false);
            I5.a(scheduleInfoPanelView.f276101g, aVar2.f276030f, false);
            I5.a(scheduleInfoPanelView.f276097c, aVar2.f276026b, false);
            com.avito.android.service_booking_calendar.flexible.header.b bVar2 = new com.avito.android.service_booking_calendar.flexible.header.b(bVar, lVar);
            Button button = scheduleInfoPanelView.f276098d;
            com.avito.android.lib.design.button.b.a(button, aVar2.f276027c, false);
            Integer num3 = aVar2.f276028d;
            if (num3 != null) {
                button.setAppearanceFromAttr(num3.intValue());
            }
            button.setOnClickListener(new com.avito.android.vas_planning_checkout.item.checkout.i(27, bVar2));
            scheduleInfoPanelView.setOnClickListener(new m(29, bVar, lVar));
        }
        textView.setOnClickListener(new m(28, lVar, calendarHeaderState));
        boolean z13 = calendarHeaderState.f276008e;
        C42670a c42670a = gVar.f275917j;
        if (z13) {
            C42670a.d(c42670a);
            return;
        }
        String str = calendarHeaderState.f276009f;
        if (str != null) {
            c42670a.b();
            c.a.C3719a c3719a = new c.a.C3719a(gVar.f275909b.getString(R.string.service_booking_calendar_flexible_refresh_action), true, null, new com.avito.android.service_booking_calendar.flexible.header.d(lVar), 4, null);
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.b(cVar, gVar.f275914g, printableTextF, null, Collections.singletonList(c3719a), null, f.c.a.b(), -1, null, null, false, false, null, null, 4042);
            return;
        }
        c42670a.b();
        this.f275859a.c(new UV0.c(calendarHeaderState.f276005b));
        this.f275860b.notifyDataSetChanged();
        this.f275861c.c(new UV0.c(list));
        this.f275862d.c(new UV0.c(list));
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            j jVar = this.f275872n;
            recyclerView.v0(jVar);
            recyclerView.A0(iIntValue2);
            recyclerView.o(jVar);
        }
        Integer num4 = calendarHeaderState.f276013j;
        if (num4 != null) {
            int iIntValue3 = num4.intValue();
            i iVar = this.f275873o;
            recyclerView2.v0(iVar);
            com.avito.android.service_booking_calendar.flexible.header.h hVar = this.f275867i;
            recyclerView2.v0(hVar);
            recyclerView2.A0(iIntValue3);
            recyclerView2.o(hVar);
            recyclerView2.o(iVar);
        }
        if (calendarHeaderState.f276019p && (interfaceC42106a = (InterfaceC42106a) C42745f0.G(calendarHeaderState.f276018o)) != null) {
            if (!(interfaceC42106a instanceof C42108c)) {
                if (!(interfaceC42106a instanceof C42107b) || (kVarA = a(interfaceC42106a, lVar)) == null) {
                    return;
                }
                int i13 = 1;
                if (scheduleInfoPanelView.getContext().getResources().getConfiguration().orientation == 1) {
                    kVarA.f181224j = new r.a(null, i13, 0 == true ? 1 : 0);
                } else {
                    kVarA.f181224j = new r.b(null, i13, 0 == true ? 1 : 0);
                }
                kVarA.f(scheduleInfoPanelView.f276098d);
                return;
            }
            com.avito.android.lib.design.tooltip.k kVarA2 = a(interfaceC42106a, lVar);
            if (kVarA2 != null) {
                RecyclerView recyclerView3 = gVar.f275913f;
                RecyclerView.m layoutManager = recyclerView3.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager == null || (viewZ = linearLayoutManager.Z(((C42108c) interfaceC42106a).f405349e)) == null) {
                    return;
                }
                recyclerView3.post(new RunnableC34589p(10, kVarA2, viewZ));
            }
        }
    }
}
