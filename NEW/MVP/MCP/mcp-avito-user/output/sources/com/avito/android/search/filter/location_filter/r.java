package com.avito.android.search.filter.location_filter;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.B2;
import com.avito.android.location.r;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.Quarter;
import com.avito.android.remote.model.QuarterKt;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpDisplayTypeKt;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.LocalPriorityParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SelectCategoryParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SuggestLocationParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.di.o;
import com.avito.android.search.filter.di.w;
import com.avito.android.select.x;
import com.avito.android.util.InterfaceC35745a5;
import gq0.InterfaceC40721a;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.kotlin.A1;
import io.reactivex.rxjava3.kotlin.C42070u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;

/* compiled from: LocationFiltersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/r;", "Lcom/avito/android/search/filter/location_filter/f;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r implements f {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final C43059p f263653A;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FiltersInteractor f263654a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f263655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.converter.j f263656c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f263657d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.analytics.c f263658e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40721a f263659f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.search.filter.tracker.a f263660g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.r f263661h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final x f263662i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final w f263663j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final B2 f263664k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public ParametersTreeWithAdditional f263665l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f263666m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f263667n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final z<? extends com.avito.conveyor_item.a> f263668o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final z<? extends ParameterElement> f263669p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final z<? extends ParameterElement> f263670q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final z<? extends com.avito.android.search.filter.adapter.i> f263671r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.s f263672s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f263673t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public y f263674u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public y f263675v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public u f263676w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public LocationFiltersDialogFragment f263677x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f263678y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public UV0.c f263679z;

    @Inject
    public r(@Y61.k FiltersInteractor filtersInteractor, @Y61.l SearchParams searchParams, @Y61.k InterfaceC34581l interfaceC34581l, @Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k com.avito.android.search.filter.converter.j jVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.search.filter.analytics.c cVar2, @Y61.k InterfaceC40721a interfaceC40721a, @Y61.k com.avito.android.search.filter.tracker.a aVar, @Y61.l @o.h Bundle bundle, @Y61.k com.avito.android.location.r rVar, @Y61.k x xVar, @Y61.k w wVar, @Y61.k B2 b22) {
        ParametersTreeWithAdditional parametersTreeWithAdditional;
        Boolean localPriority;
        this.f263654a = filtersInteractor;
        this.f263655b = cVar;
        this.f263656c = jVar;
        this.f263657d = interfaceC35745a5;
        this.f263658e = cVar2;
        this.f263659f = interfaceC40721a;
        this.f263660g = aVar;
        this.f263661h = rVar;
        this.f263662i = xVar;
        this.f263663j = wVar;
        this.f263664k = b22;
        wVar.f263292c = null;
        wVar.f263293d = null;
        if (bundle != null) {
            parametersTreeWithAdditional = (ParametersTreeWithAdditional) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("parameters_tree", ParametersTreeWithAdditional.class) : bundle.getParcelable("parameters_tree"));
        } else {
            parametersTreeWithAdditional = null;
        }
        this.f263665l = parametersTreeWithAdditional;
        this.f263666m = SerpDisplayTypeKt.orDefault(bundle != null ? SerpDisplayType.valueOf(bundle.getString("display_type", "List")) : null);
        boolean zBooleanValue = false;
        this.f263667n = bundle != null ? bundle.getBoolean("reset_area_on_change", false) : false;
        PresentationType.INSTANCE.defaultValue();
        this.f263668o = interfaceC34581l.getF263724r();
        this.f263669p = interfaceC34581l.getF263726t();
        this.f263670q = interfaceC34581l.getF263725s();
        this.f263671r = interfaceC34581l.getF263728v();
        this.f263672s = new com.avito.android.select.s();
        this.f263673t = new io.reactivex.rxjava3.disposables.c();
        if (searchParams != null && (localPriority = searchParams.getLocalPriority()) != null) {
            zBooleanValue = localPriority.booleanValue();
        }
        this.f263678y = zBooleanValue;
        this.f263653A = new C43059p(InlineFilterValue.InlineFilterDateRangeValue.NUMERIC_ID_REGEX_PATTERN);
    }

    public static final String q(r rVar) {
        SelectCategoryParameter selectCategoryParameter;
        Category value;
        ParametersTreeWithAdditional parametersTreeWithAdditional = rVar.f263665l;
        String id2 = (parametersTreeWithAdditional == null || (selectCategoryParameter = (SelectCategoryParameter) parametersTreeWithAdditional.getFirstParameterOfType(SelectCategoryParameter.class)) == null || (value = selectCategoryParameter.getValue()) == null) ? null : value.getId();
        return id2 == null ? "" : id2;
    }

    public static final void r(r rVar) {
        u uVar = rVar.f263676w;
        if (uVar != null) {
            y yVar = rVar.f263675v;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            rVar.f263675v = A1.h(rVar.f263654a.p(true).j0(rVar.f263657d.e()), null, new j(rVar, uVar), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    public static final void s(r rVar, ParameterElement.v vVar, Cp0.e eVar) {
        ParameterElement.v next;
        UV0.c cVar = rVar.f263679z;
        if (cVar != null) {
            Iterator it = com.avito.konveyor.util.g.b(cVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((com.avito.conveyor_item.a) next).getF281526b(), vVar.f262689b)) {
                        break;
                    }
                }
            }
            ParameterElement.v vVar2 = next instanceof ParameterElement.v ? next : null;
            if (vVar2 == null) {
                return;
            }
            vVar2.f262844g = eVar;
        }
    }

    public static y v(r rVar, Y41.l lVar, int i12) {
        if ((i12 & 2) != 0) {
            lVar = null;
        }
        return (y) rVar.f263654a.q(null).j0(rVar.f263657d.e()).v0(new n(rVar, lVar), new o(rVar), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void a(@Y61.k Context context) {
        this.f263654a.a(context);
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void b() {
        this.f263654a.b();
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void c(@Y61.k Context context) {
        this.f263654a.c(context);
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void c0() {
        this.f263677x = null;
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void d(@Y61.l String str) {
        this.f263654a.d(str);
    }

    @Override // com.avito.android.search.filter.location_filter.f
    @Y61.k
    public final Bundle d0() {
        Bundle bundle = new Bundle();
        bundle.putString("display_type", this.f263666m.name());
        bundle.putParcelable("parameters_tree", this.f263665l);
        bundle.putBoolean("localPriority", this.f263678y);
        bundle.putBoolean("reset_area_on_change", this.f263667n);
        w wVar = this.f263663j;
        wVar.f263292c = bundle;
        wVar.f263293d = this.f263654a.d0();
        return bundle;
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void e(@Y61.k ActivityC22955m activityC22955m) {
        this.f263654a.e(activityC22955m);
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void e0() {
        y yVar = this.f263674u;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        y yVar2 = this.f263675v;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f263673t.e();
        this.f263676w = null;
    }

    @Override // com.avito.android.search.filter.location_filter.f
    @Y61.k
    public final SearchParams f() {
        return this.f263654a.f();
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void g(@Y61.l ArrayList arrayList) {
        AddressesSearchParameter addressesSearchParameter;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263665l;
        if (parametersTreeWithAdditional == null || (addressesSearchParameter = (AddressesSearchParameter) parametersTreeWithAdditional.getFirstParameterOfType(AddressesSearchParameter.class)) == null) {
            return;
        }
        FiltersInteractor.a.a(this.f263654a, addressesSearchParameter, arrayList, null, 60);
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void h(@Y61.l View view) {
        this.f263654a.S();
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void i(@Y61.k u uVar) {
        y yVar;
        this.f263676w = uVar;
        uVar.a();
        y yVar2 = this.f263674u;
        if (yVar2 == null || yVar2.getF318621e()) {
            this.f263674u = v(this, null, 3);
        }
        u uVar2 = this.f263676w;
        InterfaceC35745a5 interfaceC35745a5 = this.f263657d;
        if (uVar2 != null && ((yVar = this.f263675v) == null || yVar.getF318621e())) {
            this.f263675v = A1.h(this.f263654a.p(false).j0(interfaceC35745a5.e()), null, new j(this, uVar2), 3);
        }
        z<G0> zVarB = uVar.b();
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.f401954c;
        io.reactivex.rxjava3.internal.subscribers.n nVarJ = A1.j(C42070u.a(zVarB.G0(backpressureStrategy).m(interfaceC35745a5.e()), r.a.b(this.f263661h, true, 2).G0(backpressureStrategy)), null, new i(this, uVar), 3);
        io.reactivex.rxjava3.disposables.c cVar = this.f263673t;
        cVar.b(nVarJ);
        cVar.b(A1.j(uVar.d().G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new p(this), 3));
        cVar.b(A1.j(uVar.f().G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new h(this), 3));
        BackpressureStrategy backpressureStrategy2 = BackpressureStrategy.f401953b;
        cVar.b(A1.j(this.f263668o.G0(backpressureStrategy2).m(interfaceC35745a5.e()), null, new k(this), 3));
        cVar.b(A1.j(this.f263669p.G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new m(this), 3));
        cVar.b(A1.j(this.f263671r.G0(backpressureStrategy2).m(interfaceC35745a5.e()), null, new q(this), 3));
        cVar.b(A1.j(this.f263670q.G0(backpressureStrategy).m(interfaceC35745a5.e()), null, new l(1, this, r.class, "onParameterClearClicked", "onParameterClearClicked(Lcom/avito/android/search/filter/converter/ParameterElement;)V", 0), 3));
        uVar.onDataChanged();
        uVar.i();
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        y yVar = this.f263674u;
        if (yVar == null || yVar.getF318621e()) {
            this.f263674u = v(this, new g(new l0.a(), this, str, list, str2), 1);
        } else {
            t(str, str2, list);
        }
    }

    @Override // com.avito.android.search.filter.location_filter.f
    /* renamed from: k, reason: from getter */
    public final boolean getF263667n() {
        return this.f263667n;
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void l(@Y61.l Location location) {
        Location locationCopy;
        if (location != null) {
            StringBuilder sb2 = new StringBuilder();
            String internalId = location.getInternalId();
            if (internalId == null) {
                internalId = "";
            }
            sb2.append(internalId);
            sb2.append('_');
            sb2.append(location.getId());
            locationCopy = location.copy((3839 & 1) != 0 ? location.id : sb2.toString(), (3839 & 2) != 0 ? location.names : null, (3839 & 4) != 0 ? location.hasMetro : false, (3839 & 8) != 0 ? location.hasChildren : false, (3839 & 16) != 0 ? location.hasDirections : false, (3839 & 32) != 0 ? location.hasDistricts : false, (3839 & 64) != 0 ? location.parent : null, (3839 & 128) != 0 ? location.from : null, (3839 & 256) != 0 ? location.forcedByUser : false, (3839 & 512) != 0 ? location.coordinates : null, (3839 & 1024) != 0 ? location.forcedLocationForRecommendation : null, (3839 & 2048) != 0 ? location.internalId : null);
        } else {
            locationCopy = null;
        }
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263665l;
        if (parametersTreeWithAdditional != null) {
            FiltersInteractor filtersInteractor = this.f263654a;
            String categoryId = filtersInteractor.f().getCategoryId();
            SuggestLocationParameter suggestLocationParameter = (SuggestLocationParameter) parametersTreeWithAdditional.getFirstParameterOfType(SuggestLocationParameter.class);
            if (suggestLocationParameter == null) {
                return;
            }
            InterfaceC43057n interfaceC43057nB = C43059p.b(this.f263653A, suggestLocationParameter.getId());
            FiltersInteractor.a.a(filtersInteractor, suggestLocationParameter, locationCopy, null, 28);
            this.f263658e.k(categoryId, suggestLocationParameter.getTitle(), interfaceC43057nB != null ? interfaceC43057nB.getValue() : suggestLocationParameter.getId(), Collections.singletonList(String.valueOf(locationCopy != null ? locationCopy.getF119974b() : null)), Collections.singletonList(String.valueOf(locationCopy != null ? locationCopy.getId() : null)), suggestLocationParameter.getType(), null);
        }
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void m(@Y61.l Location location) {
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263665l;
        if (parametersTreeWithAdditional != null) {
            FiltersInteractor filtersInteractor = this.f263654a;
            String categoryId = filtersInteractor.f().getCategoryId();
            LocalPriorityParameter localPriorityParameter = (LocalPriorityParameter) parametersTreeWithAdditional.getFirstParameterOfType(LocalPriorityParameter.class);
            SuggestLocationParameter suggestLocationParameter = (SuggestLocationParameter) parametersTreeWithAdditional.getFirstParameterOfType(SuggestLocationParameter.class);
            Location value = suggestLocationParameter != null ? suggestLocationParameter.getValue() : null;
            Location locationCopy = (localPriorityParameter == null || L.f(localPriorityParameter.getValue(), Boolean.TRUE) || value == null) ? location : location != null ? location.copy((3839 & 1) != 0 ? location.id : value.getId(), (3839 & 2) != 0 ? location.names : null, (3839 & 4) != 0 ? location.hasMetro : false, (3839 & 8) != 0 ? location.hasChildren : false, (3839 & 16) != 0 ? location.hasDirections : false, (3839 & 32) != 0 ? location.hasDistricts : false, (3839 & 64) != 0 ? location.parent : null, (3839 & 128) != 0 ? location.from : null, (3839 & 256) != 0 ? location.forcedByUser : false, (3839 & 512) != 0 ? location.coordinates : null, (3839 & 1024) != 0 ? location.forcedLocationForRecommendation : null, (3839 & 2048) != 0 ? location.internalId : null) : null;
            LocationParameter locationParameter = (LocationParameter) parametersTreeWithAdditional.getFirstParameterOfType(LocationParameter.class);
            if (locationParameter == null) {
                return;
            }
            InterfaceC43057n interfaceC43057nB = C43059p.b(this.f263653A, locationParameter.getId());
            FiltersInteractor.a.a(filtersInteractor, locationParameter, locationCopy, null, 60);
            this.f263658e.k(categoryId, locationParameter.getTitle(), interfaceC43057nB != null ? interfaceC43057nB.getValue() : locationParameter.getId(), Collections.singletonList(String.valueOf(locationCopy != null ? locationCopy.getF119974b() : null)), Collections.singletonList(String.valueOf(locationCopy != null ? locationCopy.getId() : null)), locationParameter.getType(), null);
        }
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void n(@Y61.k LocationFiltersDialogFragment locationFiltersDialogFragment) {
        this.f263677x = locationFiltersDialogFragment;
    }

    @Override // com.avito.android.search.filter.location_filter.f
    public final void o(@Y61.l Radius radius) {
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263665l;
        if (parametersTreeWithAdditional != null) {
            FiltersInteractor filtersInteractor = this.f263654a;
            String categoryId = filtersInteractor.f().getCategoryId();
            RadiusParameter radiusParameter = (RadiusParameter) parametersTreeWithAdditional.getFirstParameterOfType(RadiusParameter.class);
            if (radiusParameter == null) {
                return;
            }
            InterfaceC43057n interfaceC43057nB = C43059p.b(this.f263653A, radiusParameter.getId());
            FiltersInteractor.a.a(filtersInteractor, radiusParameter, radius, null, 60);
            String title = radiusParameter.getTitle();
            String value = interfaceC43057nB != null ? interfaceC43057nB.getValue() : radiusParameter.getId();
            List<String> listSingletonList = Collections.singletonList(String.valueOf(radius != null ? radius.getTitle() : null));
            List<String> listSingletonList2 = Collections.singletonList(String.valueOf(radius != null ? radius.getId() : null));
            String type = radiusParameter.getType();
            DisplayingOptions displayingOptions = radiusParameter.getDisplayingOptions();
            this.f263658e.k(categoryId, title, value, listSingletonList, listSingletonList2, type, displayingOptions != null ? displayingOptions.getType() : null);
        }
    }

    @Override // com.avito.android.search.filter.location_filter.f
    @Y61.l
    /* renamed from: p, reason: from getter */
    public final ParametersTreeWithAdditional getF263665l() {
        return this.f263665l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(String str, String str2, List list) {
        ParameterSlot parameterSlotFindParameter;
        Object next;
        String value = str;
        ParametersTreeWithAdditional parametersTreeWithAdditional = this.f263665l;
        if (parametersTreeWithAdditional == null || (parameterSlotFindParameter = parametersTreeWithAdditional.findParameter(value)) == null) {
            return;
        }
        FiltersInteractor filtersInteractor = this.f263654a;
        String categoryId = filtersInteractor.f().getCategoryId();
        C43059p c43059p = this.f263653A;
        InterfaceC43057n interfaceC43057nB = C43059p.b(c43059p, value);
        y yVar = this.f263674u;
        if (yVar == null || yVar.getF318621e()) {
            this.f263674u = v(this, null, 3);
        }
        if (parameterSlotFindParameter instanceof SelectParameter) {
            if (parameterSlotFindParameter instanceof SelectParameter.Sectioned) {
                this.f263658e.i(((SelectParameter) parameterSlotFindParameter).getTitle(), str2, filtersInteractor.f().getLocationId());
            }
            SelectParameter selectParameter = (SelectParameter) parameterSlotFindParameter;
            u(selectParameter.getResetAreaOnChange());
            EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
            ParcelableEntity parcelableEntity = (ParcelableEntity) C42745f0.G(list);
            FiltersInteractor.a.a(filtersInteractor, editableParameter, parcelableEntity != null ? (String) parcelableEntity.getId() : null, null, 60);
            String title = selectParameter.getTitle();
            if (interfaceC43057nB != null) {
                value = interfaceC43057nB.getValue();
            }
            String str3 = value;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((ParcelableEntity) it.next()).getF119974b()));
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((ParcelableEntity) it2.next()).getId());
            }
            String type = selectParameter.getType();
            SelectParameter.Displaying displaying = selectParameter.getDisplaying();
            this.f263658e.k(categoryId, title, str3, arrayList, arrayList2, type, displaying != null ? displaying.getType() : null);
            return;
        }
        if (parameterSlotFindParameter instanceof MultiselectParameter) {
            MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlotFindParameter;
            u(multiselectParameter.getResetAreaOnChange());
            EditableParameter editableParameter2 = (EditableParameter) parameterSlotFindParameter;
            List list3 = list;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add((String) ((ParcelableEntity) it3.next()).getId());
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter2, arrayList3, null, 60);
            List<MultiselectParameter.Value> values = multiselectParameter.getValues();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : values) {
                MultiselectParameter.Value value2 = (MultiselectParameter.Value) obj;
                List<? extends String> value3 = multiselectParameter.getValue();
                if (value3 != null ? value3.contains(value2.getId()) : false) {
                    arrayList4.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                Object next2 = it4.next();
                String parentId = ((MultiselectParameter.Value) next2).getParentId();
                if (parentId == null) {
                    parentId = parameterSlotFindParameter.getId();
                }
                Object objR = linkedHashMap.get(parentId);
                if (objR == null) {
                    objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, parentId);
                }
                ((List) objR).add(next2);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!((List) entry.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList5 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                String str4 = (String) entry2.getKey();
                List list4 = (List) entry2.getValue();
                InterfaceC43057n interfaceC43057nB2 = C43059p.b(c43059p, str4);
                arrayList5.add(new Q(interfaceC43057nB2 != null ? interfaceC43057nB2.getValue() : parameterSlotFindParameter.getId(), list4));
            }
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                Q q12 = (Q) it5.next();
                String str5 = (String) q12.f406619b;
                List list5 = (List) q12.f406620c;
                String title2 = multiselectParameter.getTitle();
                List list6 = list5;
                ArrayList arrayList6 = new ArrayList(C42745f0.q(list6, 10));
                Iterator it6 = list6.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((MultiselectParameter.Value) it6.next()).getF119974b());
                }
                ArrayList arrayList7 = new ArrayList(C42745f0.q(list6, 10));
                Iterator it7 = list6.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(((MultiselectParameter.Value) it7.next()).getId());
                }
                String type2 = multiselectParameter.getType();
                MultiselectParameter.Displaying displaying2 = multiselectParameter.getDisplaying();
                this.f263658e.k(categoryId, title2, str5, arrayList6, arrayList7, type2, displaying2 != null ? displaying2.getType() : null);
            }
            return;
        }
        if (parameterSlotFindParameter instanceof MetroParameter) {
            MetroParameter metroParameter = (MetroParameter) parameterSlotFindParameter;
            u(metroParameter.getResetAreaOnChange());
            EditableParameter editableParameter3 = (EditableParameter) parameterSlotFindParameter;
            List<ParcelableEntity> list7 = list;
            ArrayList arrayList8 = new ArrayList(C42745f0.q(list7, 10));
            for (ParcelableEntity parcelableEntity2 : list7) {
                String str6 = (String) parcelableEntity2.getId();
                String f119974b = parcelableEntity2.getF119974b();
                if (f119974b == null) {
                    f119974b = "";
                }
                arrayList8.add(new Metro(str6, f119974b, null));
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter3, arrayList8, null, 60);
            String title3 = metroParameter.getTitle();
            if (interfaceC43057nB != null) {
                value = interfaceC43057nB.getValue();
            }
            String str7 = value;
            ArrayList arrayList9 = new ArrayList(C42745f0.q(list7, 10));
            Iterator it8 = list7.iterator();
            while (it8.hasNext()) {
                arrayList9.add(String.valueOf(((ParcelableEntity) it8.next()).getF119974b()));
            }
            ArrayList arrayList10 = new ArrayList(C42745f0.q(list7, 10));
            Iterator it9 = list7.iterator();
            while (it9.hasNext()) {
                arrayList10.add((String) ((ParcelableEntity) it9.next()).getId());
            }
            String type3 = metroParameter.getType();
            DisplayingOptions displayingOptions = metroParameter.getDisplayingOptions();
            this.f263658e.k(categoryId, title3, str7, arrayList9, arrayList10, type3, displayingOptions != null ? displayingOptions.getType() : null);
            return;
        }
        if (parameterSlotFindParameter instanceof DistrictParameter) {
            DistrictParameter districtParameter = (DistrictParameter) parameterSlotFindParameter;
            u(districtParameter.getResetAreaOnChange());
            EditableParameter editableParameter4 = (EditableParameter) parameterSlotFindParameter;
            List<ParcelableEntity> list8 = list;
            ArrayList arrayList11 = new ArrayList(C42745f0.q(list8, 10));
            for (ParcelableEntity parcelableEntity3 : list8) {
                String str8 = (String) parcelableEntity3.getId();
                String f119974b2 = parcelableEntity3.getF119974b();
                arrayList11.add(new District(str8, f119974b2 == null ? "" : f119974b2, null, null, 8, null));
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter4, arrayList11, null, 60);
            String title4 = districtParameter.getTitle();
            if (interfaceC43057nB != null) {
                value = interfaceC43057nB.getValue();
            }
            String str9 = value;
            ArrayList arrayList12 = new ArrayList(C42745f0.q(list8, 10));
            Iterator it10 = list8.iterator();
            while (it10.hasNext()) {
                arrayList12.add(String.valueOf(((ParcelableEntity) it10.next()).getF119974b()));
            }
            ArrayList arrayList13 = new ArrayList(C42745f0.q(list8, 10));
            Iterator it11 = list8.iterator();
            while (it11.hasNext()) {
                arrayList13.add((String) ((ParcelableEntity) it11.next()).getId());
            }
            String type4 = districtParameter.getType();
            DisplayingOptions displayingOptions2 = districtParameter.getDisplayingOptions();
            this.f263658e.k(categoryId, title4, str9, arrayList12, arrayList13, type4, displayingOptions2 != null ? displayingOptions2.getType() : null);
            return;
        }
        if (parameterSlotFindParameter instanceof QuartersParameter) {
            QuartersParameter quartersParameter = (QuartersParameter) parameterSlotFindParameter;
            u(quartersParameter.getResetAreaOnChange());
            EditableParameter editableParameter5 = (EditableParameter) parameterSlotFindParameter;
            Iterator<T> it12 = quartersParameter.getValues().iterator();
            while (true) {
                if (!it12.hasNext()) {
                    next = null;
                    break;
                }
                next = it12.next();
                String id2 = ((Quarter) next).getId();
                ParcelableEntity parcelableEntity4 = (ParcelableEntity) C42745f0.G(list);
                if (L.f(id2, parcelableEntity4 != null ? (String) parcelableEntity4.getId() : null)) {
                    break;
                }
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter5, QuarterKt.toQuartersParameterValue((Quarter) next), null, 60);
            String title5 = quartersParameter.getTitle();
            if (interfaceC43057nB != null) {
                value = interfaceC43057nB.getValue();
            }
            String str10 = value;
            List list9 = list;
            ArrayList arrayList14 = new ArrayList(C42745f0.q(list9, 10));
            Iterator it13 = list9.iterator();
            while (it13.hasNext()) {
                arrayList14.add(String.valueOf(((ParcelableEntity) it13.next()).getF119974b()));
            }
            ArrayList arrayList15 = new ArrayList(C42745f0.q(list9, 10));
            Iterator it14 = list9.iterator();
            while (it14.hasNext()) {
                arrayList15.add((String) ((ParcelableEntity) it14.next()).getId());
            }
            String type5 = quartersParameter.getType();
            DisplayingOptions displaying3 = quartersParameter.getDisplaying();
            this.f263658e.k(categoryId, title5, str10, arrayList14, arrayList15, type5, displaying3 != null ? displaying3.getType() : null);
        }
    }

    public final void u(boolean z12) {
        this.f263667n = z12;
        if (z12) {
            FiltersInteractor filtersInteractor = this.f263654a;
            filtersInteractor.j();
            filtersInteractor.l();
        }
    }

    public final void w() {
        SearchParams searchParamsF = this.f263654a.f();
        String categoryId = searchParamsF.getCategoryId();
        Integer numY0 = categoryId != null ? C43066x.y0(categoryId) : null;
        String locationId = searchParamsF.getLocationId();
        Integer numY02 = locationId != null ? C43066x.y0(locationId) : null;
        if (numY02 != null) {
            this.f263659f.c(numY02.intValue(), numY0);
        }
    }
}
