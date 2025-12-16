package com.avito.android.select.new_metro.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.metro_lines.MetroLine;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.metro_lines.MetroStation;
import com.avito.android.select.new_metro.ItemsHolder;
import com.avito.android.select.new_metro.SelectMetroParams;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.android.select.new_metro.item.SelectedStationInfo;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroState;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: SelectMetroReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroState;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements com.avito.android.arch.mvi.u<SelectMetroInternalAction, SelectMetroState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectMetroParams f266290b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ItemsHolder f266291c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select.new_metro.d f266292d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public Object f266293e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f266294f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f266295g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f266296h;

    /* compiled from: SelectMetroReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "", "Lcom/avito/android/select/new_metro/item/MetroFilterItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Map<Integer, ? extends Set<? extends MetroFilterItem>>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends Set<? extends MetroFilterItem>> invoke() {
            return o.this.f266291c.h5();
        }
    }

    /* compiled from: SelectMetroReducer.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/select/new_metro/item/MetroStationItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<List<? extends MetroStationItem>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends MetroStationItem> invoke() {
            o oVar = o.this;
            Iterable iterable = (Iterable) oVar.f266293e;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                MetroStationItem metroStationItem = oVar.f266291c.c6().get(Integer.valueOf(((Number) it.next()).intValue()));
                if (metroStationItem != null) {
                    arrayList.add(metroStationItem);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: SelectMetroReducer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/select/new_metro/item/MetroStationItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Map<Integer, ? extends MetroStationItem>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends MetroStationItem> invoke() {
            return o.this.f266291c.c6();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    @Inject
    public o(@Y61.k SelectMetroParams selectMetroParams, @Y61.k ItemsHolder itemsHolder) {
        ?? arrayList;
        ?? arrayList2;
        List<MetroStation> stations;
        List<MetroLine> lines;
        this.f266290b = selectMetroParams;
        this.f266291c = itemsHolder;
        MetroResponseBody metroResponseBody = selectMetroParams.f265940b;
        if (metroResponseBody == null || (lines = metroResponseBody.getLines()) == null) {
            arrayList = C42784z0.f406748b;
        } else {
            List<MetroLine> list = lines;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((MetroLine) it.next()).getId()));
            }
        }
        this.f266292d = new com.avito.android.select.new_metro.d(itemsHolder, arrayList);
        MetroResponseBody metroResponseBody2 = this.f266290b.f265940b;
        if (metroResponseBody2 == null || (stations = metroResponseBody2.getStations()) == null) {
            arrayList2 = C42784z0.f406748b;
        } else {
            List<MetroStation> list2 = stations;
            arrayList2 = new ArrayList(C42745f0.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((MetroStation) it2.next()).getId()));
            }
        }
        this.f266293e = arrayList2;
        this.f266294f = C42727D.c(new b());
        this.f266295g = C42727D.c(new c());
        this.f266296h = C42727D.c(new a());
    }

    @Override // com.avito.android.arch.mvi.u
    public final SelectMetroState a(SelectMetroInternalAction selectMetroInternalAction, SelectMetroState selectMetroState) {
        Object next;
        MetroLineItem metroLineItem;
        SelectMetroInternalAction selectMetroInternalAction2 = selectMetroInternalAction;
        SelectMetroState selectMetroState2 = selectMetroState;
        if (selectMetroInternalAction2 instanceof SelectMetroInternalAction.NewOutputTypeSelected) {
            MetroListOutputTypeItem metroListOutputTypeItem = ((SelectMetroInternalAction.NewOutputTypeSelected) selectMetroInternalAction2).f266241b;
            return SelectMetroState.a(selectMetroState2, metroListOutputTypeItem, null, c(SelectMetroState.a(selectMetroState2, metroListOutputTypeItem, null, null, null, null, 62), true), null, null, 58);
        }
        boolean z12 = selectMetroInternalAction2 instanceof SelectMetroInternalAction.MetroLineItemChanged;
        com.avito.android.select.new_metro.d dVar = this.f266292d;
        if (z12) {
            SelectMetroInternalAction.MetroLineItemChanged metroLineItemChanged = (SelectMetroInternalAction.MetroLineItemChanged) selectMetroInternalAction2;
            Iterator it = dVar.f266144b.iterator();
            int i12 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                metroLineItem = metroLineItemChanged.f266237b;
                if (!zHasNext) {
                    i12 = -1;
                    break;
                }
                if (((ParcelableItem) it.next()).getF82706b() == a.C10492a.a(metroLineItem)) {
                    break;
                }
                i12++;
            }
            if (i12 >= 0) {
                dVar.f266144b.remove(i12);
                dVar.f266144b.add(i12, metroLineItem);
                ArrayList arrayList = dVar.f266144b;
                ArrayList arrayList2 = new ArrayList();
                int i13 = i12 + 1;
                for (int i14 = i13; i14 < arrayList.size() && !(arrayList.get(i14) instanceof MetroLineItem); i14++) {
                    arrayList2.add(arrayList.get(i14));
                }
                v0.a(arrayList).removeAll(arrayList2);
                if (metroLineItem.f266186g) {
                    dVar.f266144b.addAll(i13, dVar.a(metroLineItem));
                }
            }
            return SelectMetroState.a(selectMetroState2, null, null, c(selectMetroState2, false), null, null, 59);
        }
        boolean z13 = selectMetroInternalAction2 instanceof SelectMetroInternalAction.SearchTextChanged;
        InterfaceC42726C interfaceC42726C = this.f266295g;
        if (z13) {
            SelectMetroInternalAction.SearchTextChanged searchTextChanged = (SelectMetroInternalAction.SearchTextChanged) selectMetroInternalAction2;
            String str = searchTextChanged.f266243b;
            if (str.length() == 0) {
                return SelectMetroState.a(selectMetroState2, null, null, null, null, searchTextChanged.f266243b, 31);
            }
            Collection collectionValues = ((Map) interfaceC42726C.getValue()).values();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : collectionValues) {
                String str2 = ((MetroStationItem) obj).f266203f;
                C43059p c43059p = new C43059p("\\p{InCombiningDiacriticalMarks}+");
                Normalizer.Form form = Normalizer.Form.NFD;
                if (C43066x.q(c43059p.f(Normalizer.normalize(str2, form), ""), new C43059p("\\p{InCombiningDiacriticalMarks}+").f(Normalizer.normalize(str, form), ""), true)) {
                    arrayList3.add(obj);
                }
            }
            List listB0 = C42745f0.B0(arrayList3, new r(selectMetroInternalAction2));
            ArrayList arrayList4 = new ArrayList(C42745f0.q(listB0, 10));
            Iterator it2 = listB0.iterator();
            while (it2.hasNext()) {
                arrayList4.add(MetroStationItem.a((MetroStationItem) it2.next(), 383));
            }
            return SelectMetroState.a(selectMetroState2, null, null, b(selectMetroState2, arrayList4, true, false), null, searchTextChanged.f266243b, 27);
        }
        boolean z14 = selectMetroInternalAction2 instanceof SelectMetroInternalAction.StationItemChanged;
        MetroSelectedStationsItem metroSelectedStationsItem = selectMetroState2.f266249c;
        MetroSelectedStationsItem metroSelectedStationsItem2 = selectMetroState2.f266249c;
        ItemsHolder itemsHolder = this.f266291c;
        if (z14) {
            ArrayList arrayList5 = new ArrayList(metroSelectedStationsItem.f266196e);
            MetroStationItem metroStationItem = ((SelectMetroInternalAction.StationItemChanged) selectMetroInternalAction2).f266246b;
            SelectedStationInfo selectedStationInfoL5 = itemsHolder.l5(metroStationItem);
            if (metroStationItem.f266204g) {
                arrayList5.add(selectedStationInfoL5);
            } else {
                Iterator it3 = arrayList5.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    if (L.f(((SelectedStationInfo) next).f266208b, selectedStationInfoL5.f266208b)) {
                        break;
                    }
                }
                SelectedStationInfo selectedStationInfo = (SelectedStationInfo) next;
                if (selectedStationInfo != null) {
                    arrayList5.remove(selectedStationInfo);
                }
            }
            MetroSelectedStationsItem metroSelectedStationsItemA = MetroSelectedStationsItem.a(metroSelectedStationsItem2, arrayList5);
            return SelectMetroState.a(selectMetroState2, null, metroSelectedStationsItemA, c(SelectMetroState.a(selectMetroState2, null, metroSelectedStationsItemA, null, null, null, 61), true), null, null, 57);
        }
        if (selectMetroInternalAction2 instanceof SelectMetroInternalAction.FilterItemChanged) {
            ArrayList arrayList6 = new ArrayList(metroSelectedStationsItem.f266196e);
            MetroFilterItem metroFilterItem = ((SelectMetroInternalAction.FilterItemChanged) selectMetroInternalAction2).f266235b;
            Iterator<T> it4 = metroFilterItem.f266177c.iterator();
            while (it4.hasNext()) {
                MetroStationItem metroStationItem2 = (MetroStationItem) ((Map) interfaceC42726C.getValue()).get(Integer.valueOf(((Number) it4.next()).intValue()));
                if (metroStationItem2 != null) {
                    SelectedStationInfo selectedStationInfoL52 = itemsHolder.l5(metroStationItem2);
                    if (metroFilterItem.f266180f && !arrayList6.contains(selectedStationInfoL52)) {
                        arrayList6.add(selectedStationInfoL52);
                    } else if (!metroFilterItem.f266180f) {
                        arrayList6.remove(selectedStationInfoL52);
                    }
                }
            }
            MetroSelectedStationsItem metroSelectedStationsItemA2 = MetroSelectedStationsItem.a(metroSelectedStationsItem2, arrayList6);
            return SelectMetroState.a(selectMetroState2, null, metroSelectedStationsItemA2, c(SelectMetroState.a(selectMetroState2, null, metroSelectedStationsItemA2, null, null, null, 61), true), null, null, 57);
        }
        if (selectMetroInternalAction2 instanceof SelectMetroInternalAction.SelectedStationsItemChanged) {
            MetroSelectedStationsItem metroSelectedStationsItem3 = ((SelectMetroInternalAction.SelectedStationsItemChanged) selectMetroInternalAction2).f266244b;
            return SelectMetroState.a(selectMetroState2, null, metroSelectedStationsItem3, c(SelectMetroState.a(selectMetroState2, null, metroSelectedStationsItem3, null, null, null, 61), true), null, null, 57);
        }
        if (selectMetroInternalAction2 instanceof SelectMetroInternalAction.Clear) {
            MetroSelectedStationsItem metroSelectedStationsItemA3 = MetroSelectedStationsItem.a(metroSelectedStationsItem, C42784z0.f406748b);
            return SelectMetroState.a(selectMetroState2, null, metroSelectedStationsItemA3, c(SelectMetroState.a(selectMetroState2, null, metroSelectedStationsItemA3, null, null, null, 61), true), null, null, 57);
        }
        if (!(selectMetroInternalAction2 instanceof SelectMetroInternalAction.MetroStationsLoadedSuccessfully)) {
            return selectMetroInternalAction2 instanceof SelectMetroInternalAction.MetroStationsLoadedError ? SelectMetroState.a(selectMetroState2, null, null, null, SelectMetroState.SelectMetroStateLCE.f266256d, null, 47) : selectMetroInternalAction2 instanceof SelectMetroInternalAction.ShowProgressBar ? SelectMetroState.a(selectMetroState2, null, null, null, SelectMetroState.SelectMetroStateLCE.f266254b, null, 47) : selectMetroState2;
        }
        MetroResponseBody metroResponseBody = ((SelectMetroInternalAction.MetroStationsLoadedSuccessfully) selectMetroInternalAction2).f266240b;
        List<MetroStation> stations = metroResponseBody.getStations();
        ArrayList arrayList7 = new ArrayList(C42745f0.q(stations, 10));
        Iterator<T> it5 = stations.iterator();
        while (it5.hasNext()) {
            arrayList7.add(Integer.valueOf(((MetroStation) it5.next()).getId()));
        }
        this.f266293e = arrayList7;
        itemsHolder.H4(metroResponseBody);
        List<MetroLine> lines = metroResponseBody.getLines();
        ArrayList arrayList8 = new ArrayList(C42745f0.q(lines, 10));
        Iterator<T> it6 = lines.iterator();
        while (it6.hasNext()) {
            arrayList8.add(Integer.valueOf(((MetroLine) it6.next()).getId()));
        }
        dVar.f266144b = dVar.b(arrayList8);
        SelectMetroState.f266247h.getClass();
        return SelectMetroState.a.a(metroResponseBody, itemsHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(com.avito.android.select.new_metro.mvi.entity.SelectMetroState r17, java.util.ArrayList r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.new_metro.mvi.o.b(com.avito.android.select.new_metro.mvi.entity.SelectMetroState, java.util.ArrayList, boolean, boolean):java.util.ArrayList");
    }

    public final ArrayList c(SelectMetroState selectMetroState, boolean z12) {
        MetroListOutputTypeItem.OutputType outputType = selectMetroState.f266248b.f266188c;
        MetroListOutputTypeItem.OutputType outputType2 = MetroListOutputTypeItem.OutputType.f266190c;
        Iterable iterable = outputType == outputType2 ? this.f266292d.f266144b : (List) this.f266294f.getValue();
        MetroSelectedStationsItem metroSelectedStationsItem = selectMetroState.f266249c;
        MetroListOutputTypeItem metroListOutputTypeItem = selectMetroState.f266248b;
        return b(selectMetroState, C42745f0.h0(iterable, C42745f0.U(metroSelectedStationsItem, metroListOutputTypeItem)), true ^ (metroListOutputTypeItem.f266188c == outputType2), z12);
    }
}
