package us;

import Y61.k;
import com.avito.android.cpx_promo_geo.screens.region_sheet.mvi.entity.RegionSheetState;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RegionSheetLocations.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002*$\b\u0000\u0010\u0003\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¨\u0006\u0004"}, d2 = {"", "", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/mvi/entity/RegionSheetState$Location;", "RegionSheetLocations", "_avito_cpx-promo-geo_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: us.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C49106a {
    @k
    public static final RegionSheetState.Location.CheckboxState a(@k HashMap map, @k RegionSheetState.Location.CheckboxState checkboxState) {
        if (map.values().isEmpty()) {
            return checkboxState;
        }
        Collection collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (!((RegionSheetState.Location) it.next()).b()) {
                    Collection collectionValues2 = map.values();
                    if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                        Iterator it2 = collectionValues2.iterator();
                        while (it2.hasNext()) {
                            if (((RegionSheetState.Location) it2.next()).b()) {
                                return RegionSheetState.Location.CheckboxState.f128407d;
                            }
                        }
                    }
                    return RegionSheetState.Location.CheckboxState.f128408e;
                }
            }
        }
        return RegionSheetState.Location.CheckboxState.f128406c;
    }
}
