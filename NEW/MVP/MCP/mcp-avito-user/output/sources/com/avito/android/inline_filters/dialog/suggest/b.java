package com.avito.android.inline_filters.dialog.suggest;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C22985S;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.inline_filters.dialog.calendar.DialogInterfaceOnCancelListenerC31002b;
import com.avito.android.inline_filters.dialog.select.SelectFilterView;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.util.K2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: SuggestFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/suggest/b;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/select/SelectFilterView;", "Landroidx/lifecycle/P;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC30998a<SelectFilterView> implements InterfaceC22983P {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Filter f172214d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Parcelable f172215e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.p<Filter, InlineFilterValue, G0> f172216f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f172217g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f172218h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public o f172219i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C22985S f172220j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.toast_bar.b f172221k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f172222l;

    /* compiled from: SuggestFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f172223l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(1);
            this.f172223l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f172223l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestFilterDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.inline_filters.dialog.suggest.b$b, reason: collision with other inner class name */
    public static final class C5083b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f172224l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5083b(Y41.a<G0> aVar) {
            super(0);
            this.f172224l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f172224l.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestFilterDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f172226m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(0);
            this.f172226m = view;
        }

        @Override // Y41.a
        public final G0 invoke() {
            b.this.f172217g.invoke();
            K2.f(this.f172226m, 3);
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f172227b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l lVar) {
            this.f172227b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f172227b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f172227b;
        }

        public final int hashCode() {
            return this.f172227b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f172227b.invoke(obj);
        }
    }

    public /* synthetic */ b(Context context, Filter filter, Parcelable parcelable, SearchParams searchParams, Y41.p pVar, Y41.a aVar, Y41.l lVar, int i12, int i13, C42822w c42822w) {
        this(context, filter, parcelable, searchParams, pVar, aVar, (i13 & 64) != 0 ? new a(aVar) : lVar, i12);
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
        c();
        this.f172222l.e();
        this.f172220j.h(Lifecycle.State.f46679b);
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    @Y61.l
    public final Parcelable b() {
        E e12 = this.f171147c;
        if (e12 != null) {
            return e12.getState();
        }
        return null;
    }

    @Override // androidx.view.InterfaceC22983P
    @Y61.k
    public final Lifecycle getLifecycle() {
        return this.f172220j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@Y61.k Context context, @Y61.k Filter filter, @Y61.l Parcelable parcelable, @Y61.l SearchParams searchParams, @Y61.k Y41.p<? super Filter, ? super InlineFilterValue, G0> pVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super Integer, G0> lVar, int i12) {
        Filter.Config config;
        super(context, i12);
        this.f172214d = filter;
        this.f172215e = parcelable;
        this.f172216f = pVar;
        this.f172217g = aVar;
        this.f172218h = lVar;
        C22985S c22985s = new C22985S(this, true);
        this.f172220j = c22985s;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f172222l = cVar;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.inline_filters_dialog, (ViewGroup) null);
        c cVar2 = new c(viewInflate);
        com.avito.android.inline_filters.di.suggest.a.a().a((com.avito.android.inline_filters.di.suggest.c) C29972i.a(C29972i.b(context), com.avito.android.inline_filters.di.suggest.c.class), searchParams, filter).a(this);
        SelectFilterView selectFilterView = new SelectFilterView(viewInflate, false, null, null, 12, null);
        String title = filter.getTitle();
        title = title == null ? "" : title;
        selectFilterView.setTitle(title);
        Input input = selectFilterView.f172036e;
        input.setHint(title);
        selectFilterView.Qd(new com.avito.android.inline_filters.dialog.suggest.d(this, viewInflate));
        selectFilterView.Sd(new e(this, cVar2));
        selectFilterView.Ud(filter.getValue() != null);
        Filter.Widget widget = filter.getWidget();
        if (widget != null && (config = widget.getConfig()) != null) {
            Boolean resetDisabled = config.getResetDisabled();
            Boolean bool = Boolean.TRUE;
            selectFilterView.Rd(!L.f(resetDisabled, bool));
            boolean zF2 = L.f(config.getWithBackButton(), bool);
            com.avito.android.inline_filters.dialog.D d12 = selectFilterView.f172034c;
            d12.f171136c.setBackground(zF2 ? d12.f171140g : d12.f171139f);
        }
        cVar.b(selectFilterView.f172041j.t0(new f(this, viewInflate)));
        selectFilterView.y(parcelable);
        o oVar = this.f172219i;
        (oVar == null ? null : oVar).f172249N.observe(this, new d(new g(selectFilterView)));
        o oVar2 = this.f172219i;
        (oVar2 == null ? null : oVar2).f172250O.observe(this, new d(new h(this, viewInflate)));
        c22985s.h(Lifecycle.State.f46683f);
        io.reactivex.rxjava3.internal.operators.observable.E eY2 = com.avito.android.lib.design.input.n.e(input).y(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
        final o oVar3 = this.f172219i;
        oVar3 = oVar3 == null ? null : oVar3;
        l41.g gVar = new l41.g() { // from class: com.avito.android.inline_filters.dialog.suggest.i
            @Override // l41.g
            public final void accept(Object obj) {
                oVar3.ke((CharSequence) obj);
            }
        };
        l41.g<? super Throwable> gVar2 = j.f172239b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(eY2.v0(gVar, gVar2, interfaceC43543a));
        B0 b0W = selectFilterView.w();
        k kVar = new k(this, viewInflate);
        final V2 v22 = V2.f318762a;
        cVar.b(b0W.v0(kVar, new l41.g() { // from class: com.avito.android.inline_filters.dialog.suggest.c
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, interfaceC43543a));
        this.f171147c = selectFilterView;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        dVar.G(viewInflate, false);
        dVar.T();
        dVar.R(new C5083b(cVar2));
        dVar.setOnCancelListener(new DialogInterfaceOnCancelListenerC31002b(9, cVar2));
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.K(true);
    }
}
