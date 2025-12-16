package com.avito.android.developments_agency_search.screen.location_group;

import Y41.p;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.select.adapter.InlineItemType;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.metro_lines.MetroStation;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.MetroFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import oi0.C44783b;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: LocationGroupDialogFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/b;", "Lcom/avito/android/developments_agency_search/screen/location_group/a;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.developments_agency_search.screen.location_group.a {

    /* compiled from: LocationGroupDialogFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "<anonymous parameter 0>", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "selectedValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<Filter, InlineFilterValue, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<List<String>, G0> f138075l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super List<String>, G0> lVar) {
            super(2);
            this.f138075l = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(Filter filter, InlineFilterValue inlineFilterValue) {
            List<String> selectedOptions = ((InlineFilterValue.InlineFilterMultiSelectValue) inlineFilterValue).getSelectedOptions();
            if (selectedOptions == null) {
                selectedOptions = C42784z0.f406748b;
            }
            this.f138075l.invoke(selectedOptions);
            return G0.f406611a;
        }
    }

    /* compiled from: LocationGroupDialogFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loi0/b;", "location", "Lkotlin/G0;", "invoke", "(Loi0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.developments_agency_search.screen.location_group.b$b, reason: collision with other inner class name */
    public static final class C4164b extends N implements Y41.l<C44783b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<C44783b, G0> f138076l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4164b(Y41.l<? super C44783b, G0> lVar) {
            super(1);
            this.f138076l = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(C44783b c44783b) {
            this.f138076l.invoke(c44783b);
            return G0.f406611a;
        }
    }

    /* compiled from: LocationGroupDialogFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/search/Filter;", "<anonymous parameter 0>", "Lcom/avito/android/remote/model/search/InlineFilterValue;", "selectedValue", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/Filter;Lcom/avito/android/remote/model/search/InlineFilterValue;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements p<Filter, InlineFilterValue, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<List<String>, G0> f138077l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super List<String>, G0> lVar) {
            super(2);
            this.f138077l = lVar;
        }

        @Override // Y41.p
        public final G0 invoke(Filter filter, InlineFilterValue inlineFilterValue) {
            List<String> selectedOptions = ((InlineFilterValue.InlineFilterMultiSelectValue) inlineFilterValue).getSelectedOptions();
            if (selectedOptions == null) {
                selectedOptions = C42784z0.f406748b;
            }
            this.f138077l.invoke(selectedOptions);
            return G0.f406611a;
        }
    }

    /* compiled from: LocationGroupDialogFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f138078l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.developments_agency_search.screen.location_group.a
    @Y61.k
    public final com.avito.android.realty_agency.inline_filters.district.a a(@Y61.k Context context, @Y61.k ParameterElement.s sVar, @Y61.l String str, @Y61.k List<District> list, @Y61.k List<String> list2, @Y61.k Y41.l<? super List<String>, G0> lVar) {
        InlineFilterValue.InlineFilterLocationValue inlineFilterLocationValue = new InlineFilterValue.InlineFilterLocationValue(str);
        Boolean bool = Boolean.FALSE;
        String str2 = sVar.f262817c;
        Filter filter = new Filter(null, sVar.f262689b, null, null, str2, null, str2, bool, inlineFilterLocationValue, null, null, null, null, null, null, false, 59432, null);
        List<District> list3 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        for (District district : list3) {
            arrayList.add(new com.avito.android.inline_filters.dialog.select.adapter.i(district.getId(), district.getId(), district.getF156312c(), list2.contains(district.getId()), InlineItemType.f172055b, null, false, null, null, null, null, null, null, null, null, null, null, null, 262112, null));
        }
        return new com.avito.android.realty_agency.inline_filters.district.a(context, filter, arrayList, new a(lVar));
    }

    @Override // com.avito.android.developments_agency_search.screen.location_group.a
    @Y61.k
    public final com.avito.android.realty_agency.inline_filters.location_suggest.a b(@Y61.k Context context, @Y61.k ParameterElement.v vVar, @Y61.l String str, @Y61.k Y41.l<? super C44783b, G0> lVar) {
        return new com.avito.android.realty_agency.inline_filters.location_suggest.a(context, vVar.f262840c, str, new C4164b(lVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.developments_agency_search.screen.location_group.a
    @Y61.k
    public final com.avito.android.inline_filters.dialog.metro.c c(@Y61.k Context context, @Y61.k FragmentManager fragmentManager, @Y61.k ParameterElement.s sVar, @Y61.k SearchParams searchParams, @Y61.k String str, @Y61.k MetroResponseBody metroResponseBody, @Y61.k List<String> list, @Y61.k Y41.l<? super List<String>, G0> lVar) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            Iterator<T> it = metroResponseBody.getStations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(String.valueOf(((MetroStation) next).getId()), str2)) {
                    break;
                }
            }
            MetroStation metroStation = (MetroStation) next;
            MetroFilterValue metroFilterValue = metroStation != null ? new MetroFilterValue(metroStation.getId(), metroStation.getName(), Integer.parseInt(str)) : null;
            if (metroFilterValue != null) {
                arrayList.add(metroFilterValue);
            }
        }
        InlineFilterValue.InlineFilterMetroValue inlineFilterMetroValue = new InlineFilterValue.InlineFilterMetroValue(arrayList);
        Filter.Widget widget = new Filter.Widget(WidgetType.Metro, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
        Long l12 = null;
        Filter.Payload payload = null;
        String str3 = sVar.f262817c;
        return new com.avito.android.inline_filters.dialog.metro.c(context, new Filter(l12, sVar.f262689b, widget, payload, str3, null, str3, null, inlineFilterMetroValue, null, null, null, null, null, null, false, 59432, null), metroResponseBody, searchParams, fragmentManager, new c(lVar), d.f138078l, 0 == true ? 1 : 0, R.style.Re23_BottomSheet_Default, 128, null);
    }
}
