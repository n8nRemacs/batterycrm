package com.avito.android.service_booking_calendar;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C22985S;
import androidx.view.C23069w;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import mt0.InterfaceC44132a;
import pt0.C47139a;

/* compiled from: CalendarView.kt */
@s0
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001JJ!\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020\u00048\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R5\u0010?\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0002\b\u0003\u0012\u0002\b\u000307¢\u0006\u0002\b8068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R#\u0010E\u001a\n @*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/avito/android/service_booking_calendar/CalendarView;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/P;", "Lkotlin/Function1;", "Lcom/avito/konveyor/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "decoration", "Lkotlin/G0;", "setDecoration", "(LY41/l;)V", "", "Lcom/avito/android/service_booking_calendar/a;", "days", "setCalendarData", "(Ljava/util/List;)V", "Lcom/avito/android/service_booking_calendar/view/day/d;", "onDayClickListener", "setOnDayClickListener", "", "isRedesign", "setupComponent", "(Z)V", "Ljavax/inject/Provider;", "Lcom/avito/android/service_booking_calendar/m;", "b", "Ljavax/inject/Provider;", "getViewModelProvider$_avito_discouraged_avito_libs_service_booking_calendar", "()Ljavax/inject/Provider;", "setViewModelProvider$_avito_discouraged_avito_libs_service_booking_calendar", "(Ljavax/inject/Provider;)V", "viewModelProvider", "Lcom/avito/konveyor/adapter/j;", "c", "Lcom/avito/konveyor/adapter/j;", "getRecyclerAdapter$_avito_discouraged_avito_libs_service_booking_calendar", "()Lcom/avito/konveyor/adapter/j;", "setRecyclerAdapter$_avito_discouraged_avito_libs_service_booking_calendar", "(Lcom/avito/konveyor/adapter/j;)V", "recyclerAdapter", "Lcom/avito/konveyor/adapter/a;", "d", "Lcom/avito/konveyor/adapter/a;", "getAdapterPresenter$_avito_discouraged_avito_libs_service_booking_calendar", "()Lcom/avito/konveyor/adapter/a;", "setAdapterPresenter$_avito_discouraged_avito_libs_service_booking_calendar", "(Lcom/avito/konveyor/adapter/a;)V", "adapterPresenter", "e", "Lcom/avito/konveyor/a;", "getItemBinder$_avito_discouraged_avito_libs_service_booking_calendar", "()Lcom/avito/konveyor/a;", "setItemBinder$_avito_discouraged_avito_libs_service_booking_calendar", "(Lcom/avito/konveyor/a;)V", "itemBinder", "", "LTV0/d;", "LX41/o;", "f", "Ljava/util/Set;", "getItemPresenterSet$_avito_discouraged_avito_libs_service_booking_calendar", "()Ljava/util/Set;", "setItemPresenterSet$_avito_discouraged_avito_libs_service_booking_calendar", "(Ljava/util/Set;)V", "itemPresenterSet", "kotlin.jvm.PlatformType", "k", "Lkotlin/C;", "getViewModel", "()Lcom/avito/android/service_booking_calendar/m;", "viewModel", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "a", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalendarView extends FrameLayout implements InterfaceC22983P {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f275229l = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Inject
    public Provider<m> viewModelProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Inject
    public com.avito.konveyor.adapter.j recyclerAdapter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Inject
    public com.avito.konveyor.adapter.a adapterPresenter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Inject
    public com.avito.konveyor.a itemBinder;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Inject
    public Set<TV0.d<?, ?>> itemPresenterSet;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super com.avito.android.service_booking_calendar.view.day.d, G0> f275235g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C22985S f275236h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f275237i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f275238j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final O0 f275239k;

    /* compiled from: CalendarView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/service_booking_calendar/CalendarView$a;", "", "<init>", "()V", "", "COLUMNS_COUNT", "I", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @X41.j
    public CalendarView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getViewModel() {
        return (m) this.f275239k.getValue();
    }

    private final void setupComponent(boolean isRedesign) {
        com.avito.android.service_booking_calendar.di.j.a().a(isRedesign, (com.avito.android.service_booking_calendar.di.b) C29972i.a(C29972i.b(this), com.avito.android.service_booking_calendar.di.b.class)).a(this);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new g(this, null), 3);
    }

    public final void b(int i12) {
        getViewModel().accept(new InterfaceC44132a.b(i12));
    }

    @Y61.k
    public final com.avito.konveyor.adapter.a getAdapterPresenter$_avito_discouraged_avito_libs_service_booking_calendar() {
        com.avito.konveyor.adapter.a aVar = this.adapterPresenter;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Y61.k
    public final com.avito.konveyor.a getItemBinder$_avito_discouraged_avito_libs_service_booking_calendar() {
        com.avito.konveyor.a aVar = this.itemBinder;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Y61.k
    public final Set<TV0.d<?, ?>> getItemPresenterSet$_avito_discouraged_avito_libs_service_booking_calendar() {
        Set<TV0.d<?, ?>> set = this.itemPresenterSet;
        if (set != null) {
            return set;
        }
        return null;
    }

    @Override // androidx.view.InterfaceC22983P
    @Y61.k
    public Lifecycle getLifecycle() {
        return this.f275236h;
    }

    @Y61.k
    public final com.avito.konveyor.adapter.j getRecyclerAdapter$_avito_discouraged_avito_libs_service_booking_calendar() {
        com.avito.konveyor.adapter.j jVar = this.recyclerAdapter;
        if (jVar != null) {
            return jVar;
        }
        return null;
    }

    @Y61.k
    public final Provider<m> getViewModelProvider$_avito_discouraged_avito_libs_service_booking_calendar() {
        Provider<m> provider = this.viewModelProvider;
        if (provider != null) {
            return provider;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f275236h.f(Lifecycle.Event.ON_START);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f275236h.f(Lifecycle.Event.ON_STOP);
    }

    public final void setAdapterPresenter$_avito_discouraged_avito_libs_service_booking_calendar(@Y61.k com.avito.konveyor.adapter.a aVar) {
        this.adapterPresenter = aVar;
    }

    public final void setCalendarData(@Y61.k List<? extends com.avito.android.service_booking_calendar.a> days) {
        getViewModel().accept(new InterfaceC44132a.C11846a(days));
    }

    public final void setDecoration(@Y61.k Y41.l<? super com.avito.konveyor.a, ? extends RecyclerView.l> decoration) {
        this.f275237i.l(decoration.invoke(getItemBinder$_avito_discouraged_avito_libs_service_booking_calendar()), -1);
    }

    public final void setItemBinder$_avito_discouraged_avito_libs_service_booking_calendar(@Y61.k com.avito.konveyor.a aVar) {
        this.itemBinder = aVar;
    }

    public final void setItemPresenterSet$_avito_discouraged_avito_libs_service_booking_calendar(@Y61.k Set<TV0.d<?, ?>> set) {
        this.itemPresenterSet = set;
    }

    public final void setOnDayClickListener(@Y61.k Y41.l<? super com.avito.android.service_booking_calendar.view.day.d, G0> onDayClickListener) {
        this.f275235g = onDayClickListener;
    }

    public final void setRecyclerAdapter$_avito_discouraged_avito_libs_service_booking_calendar(@Y61.k com.avito.konveyor.adapter.j jVar) {
        this.recyclerAdapter = jVar;
    }

    public final void setViewModelProvider$_avito_discouraged_avito_libs_service_booking_calendar(@Y61.k Provider<m> provider) {
        this.viewModelProvider = provider;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CalendarView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        attributeSet = (i14 & 2) != 0 ? null : attributeSet;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        i13 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet, i12, i13);
        this.f275235g = h.f276118l;
        this.f275236h = new C22985S(this, true);
        Context baseContext = context instanceof androidx.view.n ? context : context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        androidx.view.n nVar = baseContext instanceof androidx.view.n ? (androidx.view.n) baseContext : null;
        if (nVar == null) {
            throw new IllegalArgumentException("Context must be instance of activity");
        }
        this.f275239k = new O0(m0.f406844a.b(m.class), new j(nVar), new i(new l(this)), new k(nVar));
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_calendar, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C47139a.g.f428822a, i12, i13);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f275238j = typedArrayObtainStyledAttributes.getBoolean(0, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        setupComponent(this.f275238j);
        View viewFindViewById = viewInflate.findViewById(R.id.calendar_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f275237i = recyclerView;
        recyclerView.getRecycledViewPool().e(getItemBinder$_avito_discouraged_avito_libs_service_booking_calendar().Y(com.avito.android.service_booking_calendar.view.month.a.class), recyclerView.getResources().getInteger(R.integer.calendar_max_recycled_views_count_month_item));
        recyclerView.getRecycledViewPool().e(getItemBinder$_avito_discouraged_avito_libs_service_booking_calendar().Y(com.avito.android.service_booking_calendar.view.day.a.class), recyclerView.getResources().getInteger(R.integer.calendar_max_recycled_views_count_day_item));
        viewInflate.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(7);
        gridLayoutManager.f53667M = new c(getAdapterPresenter$_avito_discouraged_avito_libs_service_booking_calendar(), this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(getRecyclerAdapter$_avito_discouraged_avito_libs_service_booking_calendar());
        Iterator<T> it = getItemPresenterSet$_avito_discouraged_avito_libs_service_booking_calendar().iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.service_booking_calendar.view.day.e) {
                C43175k.K(new C43197r1(new e(this, null), new C43152f0(C23069w.a(((com.avito.android.service_booking_calendar.view.day.e) dVar).getF276194b(), this.f275236h, Lifecycle.State.f46682e), new d(3, null))), C22981N.a(getLifecycle()));
            }
        }
        this.f275236h.f(Lifecycle.Event.ON_START);
    }
}
