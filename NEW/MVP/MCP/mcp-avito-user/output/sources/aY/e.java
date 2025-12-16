package aY;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.avito_map.marker.MarkerWithFavorite;
import com.avito.android.avito_map.marker.MarkerWithId;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.search.map.Form;
import com.avito.android.remote.model.search.map.Pin;
import com.avito.android.remote.model.search.map.Rash;
import com.avito.android.serp.adapter.S;
import com.google.android.gms.maps.model.LatLng;
import eY.InterfaceC40070a;
import iY.InterfaceC41361a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PinsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LaY/e;", "LaY/d;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements InterfaceC19840d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40070a f20915a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC41361a f20916b;

    @Inject
    public e(@k InterfaceC40070a interfaceC40070a, @k InterfaceC41361a interfaceC41361a) {
        this.f20915a = interfaceC40070a;
        this.f20916b = interfaceC41361a;
    }

    public static MarkerItem g(MarkerItem markerItem, String str) {
        if (markerItem instanceof MarkerItem.Pin) {
            MarkerItem.Pin pin = (MarkerItem.Pin) markerItem;
            return pin.copy((15999 & 1) != 0 ? pin.id : null, (15999 & 2) != 0 ? pin.text : null, (15999 & 4) != 0 ? pin.selected : false, (15999 & 8) != 0 ? pin.coordinates : null, (15999 & 16) != 0 ? pin.count : 0, (15999 & 32) != 0 ? pin.isViewed : false, (15999 & 64) != 0 ? pin.price : null, (15999 & 128) != 0 ? pin.isFavorite : str.length() > 0, (15999 & 256) != 0 ? pin.favoritesIds : str, (15999 & 512) != 0 ? pin.form : null, (15999 & 1024) != 0 ? pin.highlight : null, (15999 & 2048) != 0 ? pin.brand : null, (15999 & 4096) != 0 ? pin.context : null, (15999 & 8192) != 0 ? pin.icon : null);
        }
        if (!(markerItem instanceof MarkerItem.Rash)) {
            return markerItem;
        }
        MarkerItem.Rash rash = (MarkerItem.Rash) markerItem;
        return rash.copy((1855 & 1) != 0 ? rash.id : null, (1855 & 2) != 0 ? rash.selected : false, (1855 & 4) != 0 ? rash.coordinates : null, (1855 & 8) != 0 ? rash.text : null, (1855 & 16) != 0 ? rash.count : 0, (1855 & 32) != 0 ? rash.isViewed : false, (1855 & 64) != 0 ? rash.isFavorite : str.length() > 0, (1855 & 128) != 0 ? rash.favoritesIds : str, (1855 & 256) != 0 ? rash.form : null, (1855 & 512) != 0 ? rash.highlight : null, (1855 & 1024) != 0 ? rash.context : null);
    }

    @Override // aY.InterfaceC19840d
    @k
    public final ArrayList a(@k List list) {
        List<Parcelable> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Parcelable parcelableCopy : list2) {
            boolean z12 = parcelableCopy instanceof MarkerItem.Pin;
            InterfaceC41361a interfaceC41361a = this.f20916b;
            if (z12) {
                MarkerItem.Pin pin = (MarkerItem.Pin) parcelableCopy;
                parcelableCopy = pin.copy((15999 & 1) != 0 ? pin.id : null, (15999 & 2) != 0 ? pin.text : null, (15999 & 4) != 0 ? pin.selected : false, (15999 & 8) != 0 ? pin.coordinates : null, (15999 & 16) != 0 ? pin.count : 0, (15999 & 32) != 0 ? pin.isViewed : interfaceC41361a.b(pin.getListIds()), (15999 & 64) != 0 ? pin.price : null, (15999 & 128) != 0 ? pin.isFavorite : false, (15999 & 256) != 0 ? pin.favoritesIds : null, (15999 & 512) != 0 ? pin.form : null, (15999 & 1024) != 0 ? pin.highlight : null, (15999 & 2048) != 0 ? pin.brand : null, (15999 & 4096) != 0 ? pin.context : null, (15999 & 8192) != 0 ? pin.icon : null);
            } else if (parcelableCopy instanceof MarkerItem.Rash) {
                MarkerItem.Rash rash = (MarkerItem.Rash) parcelableCopy;
                parcelableCopy = rash.copy((1855 & 1) != 0 ? rash.id : null, (1855 & 2) != 0 ? rash.selected : false, (1855 & 4) != 0 ? rash.coordinates : null, (1855 & 8) != 0 ? rash.text : null, (1855 & 16) != 0 ? rash.count : 0, (1855 & 32) != 0 ? rash.isViewed : interfaceC41361a.b(rash.getListIds()), (1855 & 64) != 0 ? rash.isFavorite : false, (1855 & 128) != 0 ? rash.favoritesIds : null, (1855 & 256) != 0 ? rash.form : null, (1855 & 512) != 0 ? rash.highlight : null, (1855 & 1024) != 0 ? rash.context : null);
            }
            arrayList.add(parcelableCopy);
        }
        return arrayList;
    }

    @Override // aY.InterfaceC19840d
    public final void b(@k List<String> list) {
        this.f20916b.a(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.avito.android.avito_map.marker.MarkerItem] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.avito.android.avito_map.marker.MarkerItem] */
    @Override // aY.InterfaceC19840d
    @k
    public final ArrayList c(@k S s5, @k List list) {
        List<??> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (?? G12 : list2) {
            if ((G12 instanceof MarkerWithFavorite) && (G12 instanceof MarkerWithId) && C43066x.q(((MarkerWithId) G12).getId(), s5.getF331245g(), false)) {
                List<String> listFavoritesIds = ((MarkerWithFavorite) G12).getListFavoritesIds();
                if (s5.getF107475k()) {
                    listFavoritesIds.remove(s5.getF331245g());
                } else {
                    listFavoritesIds.add(s5.getF331245g());
                }
                G12 = g(G12, !listFavoritesIds.isEmpty() ? C42745f0.O(listFavoritesIds, ",", null, null, null, 62) : "");
            }
            arrayList.add(G12);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.avito.android.avito_map.marker.MarkerItem] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.avito.android.avito_map.marker.MarkerItem] */
    @Override // aY.InterfaceC19840d
    @k
    public final ArrayList d(@k List list) {
        List<??> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (?? G12 : list2) {
            if ((G12 instanceof MarkerWithFavorite) && (G12 instanceof MarkerWithId)) {
                MarkerWithFavorite markerWithFavorite = (MarkerWithFavorite) G12;
                G12 = g(G12, (String) f(((MarkerWithId) G12).getId(), markerWithFavorite.getFavoritesIds(), markerWithFavorite.isFavorite()).f406620c);
            }
            arrayList.add(G12);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // aY.InterfaceC19840d
    @k
    public final List e(@l List list, @l List list2) {
        boolean z12;
        String strValueOf;
        if (list == null && list2 == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList();
        String str = "9999";
        InterfaceC41361a interfaceC41361a = this.f20916b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pin pin = (Pin) it.next();
                String id2 = pin.getId();
                Boolean isFavorite = pin.getIsFavorite();
                Q qF2 = f(id2, pin.getFavoritesIds(), isFavorite != null ? isFavorite.booleanValue() : false);
                if (pin.getForm() == Form.ChristmasTree) {
                    String id3 = pin.getId();
                    Coordinates coordinates = pin.getCoordinates();
                    arrayList.add(new MarkerItem.SpecialPin(id3, new LatLng(coordinates.getLatitude(), coordinates.getLongitude())));
                } else {
                    String id4 = pin.getId();
                    int itemsCount = pin.getItemsCount();
                    String strValueOf2 = itemsCount > 9999 ? "9999" : itemsCount > 1 ? String.valueOf(itemsCount) : null;
                    boolean zF2 = L.f(pin.getId(), null);
                    Coordinates coordinates2 = pin.getCoordinates();
                    MarkerItem.Pin pin2 = new MarkerItem.Pin(id4, strValueOf2, zF2, new LatLng(coordinates2.getLatitude(), coordinates2.getLongitude()), pin.getItemsCount(), false, pin.getPrice(), ((Boolean) qF2.f406619b).booleanValue(), (String) qF2.f406620c, pin.getForm(), pin.getHighlight(), pin.getBrand(), pin.getContext(), pin.getIcon());
                    pin2.setViewed(interfaceC41361a.b(pin2.getListIds()));
                    arrayList.add(pin2);
                }
            }
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Rash rash = (Rash) it2.next();
                String id5 = rash.getId();
                Coordinates coordinates3 = rash.getCoordinates();
                String str2 = str;
                LatLng latLng = new LatLng(coordinates3.getLatitude(), coordinates3.getLongitude());
                int itemsCount2 = rash.getItemsCount();
                boolean zF3 = L.f(rash.getId(), null);
                int itemsCount3 = rash.getItemsCount();
                if (itemsCount3 > 9999) {
                    strValueOf = str2;
                    z12 = true;
                } else {
                    z12 = true;
                    strValueOf = itemsCount3 > 1 ? String.valueOf(itemsCount3) : null;
                }
                boolean isFavorite2 = rash.getIsFavorite();
                String favoritesIds = rash.getFavoritesIds();
                if (favoritesIds == null) {
                    favoritesIds = "";
                }
                MarkerItem.Rash rash2 = new MarkerItem.Rash(id5, zF3, latLng, strValueOf, itemsCount2, false, isFavorite2, favoritesIds, rash.getForm(), rash.getHighlight(), rash.getContext());
                rash2.setViewed(interfaceC41361a.b(rash2.getListIds()));
                arrayList.add(rash2);
                str = str2;
            }
        }
        return arrayList;
    }

    public final Q f(String str, String str2, boolean z12) {
        ArrayList arrayList = new ArrayList();
        InterfaceC40070a interfaceC40070a = this.f20915a;
        if (z12) {
            if (str2 != null) {
                arrayList.addAll(C43066x.f0(str2, new String[]{","}, 0, 6));
            }
            if (interfaceC40070a.e(arrayList).size() == arrayList.size()) {
                arrayList = new ArrayList(C42784z0.f406748b);
            }
        } else {
            for (Map.Entry<String, Boolean> entry : interfaceC40070a.a(C43066x.f0(str, new String[]{","}, 0, 6)).entrySet()) {
                String key = entry.getKey();
                if (entry.getValue().booleanValue()) {
                    arrayList.add(key);
                }
            }
            z12 = !arrayList.isEmpty();
        }
        return new Q(Boolean.valueOf(z12), !arrayList.isEmpty() ? C42745f0.O(arrayList, ",", null, null, null, 62) : "");
    }
}
