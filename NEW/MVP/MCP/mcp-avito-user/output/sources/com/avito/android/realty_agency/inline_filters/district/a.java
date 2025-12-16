package com.avito.android.realty_agency.inline_filters.district;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.C22984Q;
import androidx.view.Lifecycle;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.inline_filters.dialog.select.adapter.i;
import com.avito.android.lib.design.input.n;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.konveyor.adapter.j;
import ii0.C41413d;
import ii0.InterfaceC41410a;
import ii0.InterfaceC41412c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;

/* compiled from: DistrictFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/district/a;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/realty_agency/inline_filters/district/e;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends AbstractC30998a<com.avito.android.realty_agency.inline_filters.district.e> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Filter f251560d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final N f251561e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public g f251562f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC42726C f251563g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public j f251564h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f251565i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final View f251566j;

    /* compiled from: DistrictFilterDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.inline_filters.district.a$a, reason: collision with other inner class name */
    public static final class C7546a extends N implements Y41.a<G0> {
        public C7546a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.e().accept(InterfaceC41410a.C11387a.f398688a);
            return G0.f406611a;
        }
    }

    /* compiled from: DistrictFilterDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.e().accept(InterfaceC41410a.d.f398691a);
            return G0.f406611a;
        }
    }

    /* compiled from: DistrictFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<InterfaceC41412c, G0> {
        /* JADX WARN: Type inference failed for: r4v5, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(InterfaceC41412c interfaceC41412c) {
            InterfaceC41412c interfaceC41412c2 = interfaceC41412c;
            a aVar = (a) this.receiver;
            aVar.getClass();
            if (!(interfaceC41412c2 instanceof InterfaceC41412c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.f251561e.invoke(aVar.f251560d, new InlineFilterValue.InlineFilterMultiSelectValue(((InterfaceC41412c.a) interfaceC41412c2).f398697a));
            aVar.c();
            return G0.f406611a;
        }
    }

    /* compiled from: DistrictFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<C41413d, G0> {
        @Override // Y41.l
        public final G0 invoke(C41413d c41413d) {
            C41413d c41413d2 = c41413d;
            a aVar = (a) this.receiver;
            E e12 = aVar.f171147c;
            com.avito.android.realty_agency.inline_filters.district.e eVar = e12 instanceof com.avito.android.realty_agency.inline_filters.district.e ? (com.avito.android.realty_agency.inline_filters.district.e) e12 : null;
            if (eVar != null) {
                eVar.f251584b.c(new UV0.c(c41413d2.f398702c));
                eVar.f251583a.notifyDataSetChanged();
            }
            aVar.f171146b.w(c41413d2.f398703d);
            return G0.f406611a;
        }
    }

    /* compiled from: DistrictFilterDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/district/f;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/realty_agency/inline_filters/district/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<f> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final f invoke() {
            g gVar = a.this.f251562f;
            if (gVar == null) {
                gVar = null;
            }
            return (f) gVar.get();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Context context, @k Filter filter, @k List<i> list, @k p<? super Filter, ? super InlineFilterValue, G0> pVar) {
        super(context, 0, 2, null);
        this.f251560d = filter;
        this.f251561e = (N) pVar;
        this.f251563g = C42727D.c(new e());
        this.f251566j = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.dialog_district_filter, (ViewGroup) null);
        List<i> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(i.a((i) it.next()));
        }
        com.avito.android.realty_agency.inline_filters.district.di.a.a().a(new com.avito.android.realty_agency.inline_filters.district.b(this), arrayList).a(this);
        View view = this.f251566j;
        j jVar = this.f251564h;
        jVar = jVar == null ? null : jVar;
        com.avito.konveyor.adapter.a aVar = this.f251565i;
        com.avito.android.realty_agency.inline_filters.district.e eVar = new com.avito.android.realty_agency.inline_filters.district.e(view, jVar, aVar == null ? null : aVar, new C7546a());
        C43175k.K(new C43152f0(new C43197r1(new com.avito.android.realty_agency.inline_filters.district.c(this, null), y.a(n.e(eVar.f251586d))), new com.avito.android.realty_agency.inline_filters.district.d(3, null)), C22984Q.a(this.f171146b));
        this.f171147c = eVar;
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f171146b;
        dVar.G(this.f251566j, false);
        dVar.L(this.f251560d.getTitle(), this.f171146b.getContext().getString(R.string.realty_agency_inline_filters_inline_filter_district_reset_button_title), true, true);
        dVar.P(new b());
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.K(true);
        dVar.J(true);
        com.avito.android.arch.mvi.android.f.a(e(), this.f171146b, Lifecycle.State.f46682e, new c(1, this, a.class, "handleEvent", "handleEvent(Lcom/avito/android/realty_agency/inline_filters/district/mvi/entity/DistrictOneTimeEvent;)V", 0), new d(1, this, a.class, "render", "render(Lcom/avito/android/realty_agency/inline_filters/district/mvi/entity/DistrictState;)V", 0));
    }

    public final f e() {
        return (f) this.f251563g.getValue();
    }
}
