package com.avito.android.select.new_metro;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.metro_lines.MetroLine;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.metro_lines.MetroStation;
import com.avito.android.select.new_metro.item.MetroFilterItem;
import com.avito.android.select.new_metro.item.MetroLineItem;
import com.avito.android.select.new_metro.item.MetroListOutputTypeItem;
import com.avito.android.select.new_metro.item.MetroSelectedStationsItem;
import com.avito.android.select.new_metro.item.MetroStationItem;
import com.avito.android.select.new_metro.item.SelectedStationInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ItemsHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/MetroResponseToItemsConverter;", "Lcom/avito/android/select/new_metro/ItemsHolder;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes3.dex */
public final class MetroResponseToItemsConverter implements ItemsHolder {

    @Y61.k
    public static final Parcelable.Creator<MetroResponseToItemsConverter> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MetroResponseBody f265898b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f265899c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f265900d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f265901e = C42727D.c(new d());

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f265902f = C42727D.c(new g());

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f265903g = C42727D.c(new e());

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f265904h = C42727D.c(new c());

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f265905i = C42727D.c(new b());

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final MetroListOutputTypeItem f265906j = new MetroListOutputTypeItem("SwitcherItem", MetroListOutputTypeItem.OutputType.f266189b);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f265907k = C42727D.c(new f());

    /* compiled from: ItemsHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetroResponseToItemsConverter> {
        @Override // android.os.Parcelable.Creator
        public final MetroResponseToItemsConverter createFromParcel(Parcel parcel) {
            MetroResponseBody metroResponseBody = (MetroResponseBody) parcel.readParcelable(MetroResponseToItemsConverter.class.getClassLoader());
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iD2 = 0;
            while (iD2 != i12) {
                iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
            }
            return new MetroResponseToItemsConverter(metroResponseBody, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MetroResponseToItemsConverter[] newArray(int i12) {
            return new MetroResponseToItemsConverter[i12];
        }
    }

    /* compiled from: ItemsHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "", "Lcom/avito/android/select/new_metro/item/MetroFilterItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Map<Integer, ? extends Set<? extends MetroFilterItem>>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends Set<? extends MetroFilterItem>> invoke() {
            Map<Integer, ? extends Set<? extends MetroFilterItem>> mapP;
            List<MetroStation> stations;
            MetroResponseToItemsConverter metroResponseToItemsConverter = MetroResponseToItemsConverter.this;
            MetroResponseBody metroResponseBody = metroResponseToItemsConverter.f265898b;
            if (metroResponseBody == null || (stations = metroResponseBody.getStations()) == null) {
                mapP = null;
            } else {
                List<MetroStation> list = stations;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (MetroStation metroStation : list) {
                    Integer numValueOf = Integer.valueOf(metroStation.getId());
                    List<Integer> lineIds = metroStation.getLineIds();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = lineIds.iterator();
                    while (it.hasNext()) {
                        MetroFilterItem metroFilterItem = metroResponseToItemsConverter.d6().get(Integer.valueOf(((Number) it.next()).intValue()));
                        if (metroFilterItem != null) {
                            arrayList2.add(metroFilterItem);
                        }
                    }
                    arrayList.add(new Q(numValueOf, C42745f0.P0(arrayList2)));
                }
                mapP = P0.p(arrayList);
            }
            return mapP == null ? P0.c() : mapP;
        }
    }

    /* compiled from: ItemsHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/select/new_metro/item/MetroFilterItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Map<Integer, ? extends MetroFilterItem>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends MetroFilterItem> invoke() {
            Map<Integer, ? extends MetroFilterItem> mapP;
            List<MetroLine> lines;
            MetroResponseToItemsConverter metroResponseToItemsConverter = MetroResponseToItemsConverter.this;
            MetroResponseBody metroResponseBody = metroResponseToItemsConverter.f265898b;
            if (metroResponseBody == null || (lines = metroResponseBody.getLines()) == null) {
                mapP = null;
            } else {
                List<MetroLine> list = lines;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (MetroLine metroLine : list) {
                    arrayList.add(new Q(Integer.valueOf(metroLine.getId()), new MetroFilterItem("AllStationPrefix" + metroLine.getId(), C42745f0.P0(metroLine.getStationIds()), metroResponseToItemsConverter.f265899c, metroLine.getId(), false, 16, null)));
                }
                mapP = P0.p(arrayList);
            }
            return mapP == null ? P0.c() : mapP;
        }
    }

    /* compiled from: ItemsHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/remote/model/metro_lines/MetroLine;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Map<Integer, ? extends MetroLine>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends MetroLine> invoke() {
            List<MetroLine> lines;
            MetroResponseBody metroResponseBody = MetroResponseToItemsConverter.this.f265898b;
            if (metroResponseBody == null || (lines = metroResponseBody.getLines()) == null) {
                return null;
            }
            List<MetroLine> list = lines;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (MetroLine metroLine : list) {
                arrayList.add(new Q(Integer.valueOf(metroLine.getId()), metroLine));
            }
            return P0.p(arrayList);
        }
    }

    /* compiled from: ItemsHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/select/new_metro/item/MetroLineItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Map<Integer, ? extends MetroLineItem>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends MetroLineItem> invoke() {
            Map<Integer, ? extends MetroLineItem> mapP;
            List<MetroLine> lines;
            MetroResponseBody metroResponseBody = MetroResponseToItemsConverter.this.f265898b;
            if (metroResponseBody == null || (lines = metroResponseBody.getLines()) == null) {
                mapP = null;
            } else {
                List<MetroLine> list = lines;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (MetroLine metroLine : list) {
                    arrayList.add(new Q(Integer.valueOf(metroLine.getId()), new MetroLineItem(metroLine.getName(), metroLine.getColor().getValue(), metroLine.getId(), metroLine.getStationIds(), "Line" + metroLine.getId(), false, 32, null)));
                }
                mapP = P0.p(arrayList);
            }
            return mapP == null ? P0.c() : mapP;
        }
    }

    /* compiled from: ItemsHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/select/new_metro/item/MetroSelectedStationsItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<MetroSelectedStationsItem> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final MetroSelectedStationsItem invoke() {
            MetroResponseToItemsConverter metroResponseToItemsConverter = MetroResponseToItemsConverter.this;
            List<Integer> list = metroResponseToItemsConverter.f265900d;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                MetroStationItem metroStationItem = metroResponseToItemsConverter.c6().get(Integer.valueOf(((Number) it.next()).intValue()));
                SelectedStationInfo selectedStationInfoL5 = metroStationItem != null ? metroResponseToItemsConverter.l5(metroStationItem) : null;
                if (selectedStationInfoL5 != null) {
                    arrayList.add(selectedStationInfoL5);
                }
            }
            return new MetroSelectedStationsItem("SelectedStationsItem", 0, false, arrayList, 6, null);
        }
    }

    /* compiled from: ItemsHolder.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/avito/android/select/new_metro/item/MetroStationItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<Map<Integer, ? extends MetroStationItem>> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Map<Integer, ? extends MetroStationItem> invoke() {
            Map<Integer, ? extends MetroStationItem> mapP;
            List<MetroStation> stations;
            InterfaceC42726C interfaceC42726C;
            MetroLine metroLine;
            Color color;
            MetroLine metroLine2;
            MetroResponseToItemsConverter metroResponseToItemsConverter = MetroResponseToItemsConverter.this;
            MetroResponseBody metroResponseBody = metroResponseToItemsConverter.f265898b;
            if (metroResponseBody == null || (stations = metroResponseBody.getStations()) == null) {
                mapP = null;
            } else {
                List<MetroStation> list = stations;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (MetroStation metroStation : list) {
                    Integer numValueOf = Integer.valueOf(metroStation.getId());
                    String str = "Station" + metroStation.getId();
                    List<Integer> lineIds = metroStation.getLineIds();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<T> it = lineIds.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        interfaceC42726C = metroResponseToItemsConverter.f265901e;
                        if (!zHasNext) {
                            break;
                        }
                        int iIntValue = ((Number) it.next()).intValue();
                        Map map = (Map) interfaceC42726C.getValue();
                        Color color2 = (map == null || (metroLine2 = (MetroLine) map.get(Integer.valueOf(iIntValue))) == null) ? null : metroLine2.getColor();
                        if (color2 != null) {
                            arrayList2.add(color2);
                        }
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        spannableStringBuilder.append("● ", new ForegroundColorSpan(((Color) it2.next()).getValue()), 17);
                    }
                    String name = metroStation.getName();
                    List<Integer> lineIds2 = metroStation.getLineIds();
                    int id2 = metroStation.getId();
                    List<Integer> lineIds3 = metroStation.getLineIds();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it3 = lineIds3.iterator();
                    while (it3.hasNext()) {
                        int iIntValue2 = ((Number) it3.next()).intValue();
                        Map map2 = (Map) interfaceC42726C.getValue();
                        Integer numValueOf2 = (map2 == null || (metroLine = (MetroLine) map2.get(Integer.valueOf(iIntValue2))) == null || (color = metroLine.getColor()) == null) ? null : Integer.valueOf(color.getValue());
                        if (numValueOf2 != null) {
                            arrayList3.add(numValueOf2);
                        }
                    }
                    arrayList.add(new Q(numValueOf, new MetroStationItem(str, lineIds2, spannableStringBuilder, id2, name, false, false, false, arrayList3, 224, null)));
                }
                mapP = P0.p(arrayList);
            }
            return mapP == null ? P0.c() : mapP;
        }
    }

    public MetroResponseToItemsConverter(@Y61.l MetroResponseBody metroResponseBody, @Y61.k String str, @Y61.k List<Integer> list) {
        this.f265898b = metroResponseBody;
        this.f265899c = str;
        this.f265900d = list;
    }

    @Override // com.avito.android.select.new_metro.ItemsHolder
    @Y61.k
    public final Map<Integer, MetroLineItem> F2() {
        return (Map) this.f265903g.getValue();
    }

    @Override // com.avito.android.select.new_metro.ItemsHolder
    public final void H4(@Y61.k MetroResponseBody metroResponseBody) {
        this.f265898b = metroResponseBody;
    }

    @Override // com.avito.android.select.new_metro.ItemsHolder
    @Y61.k
    public final MetroSelectedStationsItem X3() {
        return (MetroSelectedStationsItem) this.f265907k.getValue();
    }

    @Override // com.avito.android.select.new_metro.ItemsHolder
    @Y61.k
    public final Map<Integer, MetroStationItem> c6() {
        return (Map) this.f265902f.getValue();
    }

    @Override // com.avito.android.select.new_metro.ItemsHolder
    @Y61.k
    public final Map<Integer, MetroFilterItem> d6() {
        return (Map) this.f265904h.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.select.new_metro.ItemsHolder
    @Y61.k
    public final Map<Integer, Set<MetroFilterItem>> h5() {
        return (Map) this.f265905i.getValue();
    }

    @Override // com.avito.android.select.new_metro.ItemsHolder
    @Y61.k
    public final SelectedStationInfo l5(@Y61.k MetroStationItem metroStationItem) {
        return new SelectedStationInfo(metroStationItem.f266199b, new SpannableStringBuilder(metroStationItem.f266201d).append((CharSequence) metroStationItem.f266203f), metroStationItem.f266202e, metroStationItem.f266203f, metroStationItem.f266207j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f265898b, i12);
        parcel.writeString(this.f265899c);
        Iterator itJ = C0.j(this.f265900d, parcel);
        while (itJ.hasNext()) {
            parcel.writeInt(((Number) itJ.next()).intValue());
        }
    }

    @Override // com.avito.android.select.new_metro.ItemsHolder
    @Y61.k
    /* renamed from: x2, reason: from getter */
    public final MetroListOutputTypeItem getF265906j() {
        return this.f265906j;
    }
}
