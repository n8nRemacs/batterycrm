package HN;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersCalendarPickerAvailabilityChecker.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHN/n;", "LHN/b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<MN.c> f7073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final HashMap<Date, MN.c> f7074b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashMap<Date, Boolean> f7075c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final HashMap<Date, Map<Date, Boolean>> f7076d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final HashMap<Date, Boolean> f7077e = new HashMap<>();

    public n(@Y61.k List<MN.c> list) {
        this.f7073a = list;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            MN.c cVar = (MN.c) obj;
            Date date = cVar.f10662a;
            this.f7074b.put(date, cVar);
            int size = this.f7073a.size() - 1;
            int i14 = cVar.f10663b;
            int iMin = Math.min(size, (i12 + i14) - 1);
            HashMap<Date, Boolean> map = this.f7075c;
            List listX0 = C42745f0.x0(this.f7073a, new kotlin.ranges.l(i13, iMin, 1));
            if (!(listX0 instanceof Collection) || !listX0.isEmpty()) {
                Iterator it = listX0.iterator();
                while (it.hasNext()) {
                    ((MN.c) it.next()).getClass();
                }
            }
            map.put(date, true);
            this.f7077e.put(date, Boolean.TRUE);
            HashMap<Date, Map<Date, Boolean>> map2 = this.f7076d;
            HashMap map3 = new HashMap();
            for (MN.c cVar2 : this.f7073a) {
                if (cVar2.f10662a.compareTo(date) < 0) {
                    map3.put(cVar2.f10662a, Boolean.FALSE);
                } else {
                    Date date2 = cVar2.f10662a;
                    map3.put(date2, Boolean.valueOf(((int) TimeUnit.DAYS.convert(date2.getTime() - date.getTime(), TimeUnit.MILLISECONDS)) >= i14));
                }
            }
            map2.put(date, map3);
            i12 = i13;
        }
    }

    public final boolean a(@Y61.k Date date) {
        Boolean bool = this.f7075c.get(date);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean b(@Y61.k Date date) {
        Boolean bool = this.f7077e.get(date);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalArgumentException("Illegal date " + date);
    }

    public final boolean c(@Y61.k Date date, @Y61.k Date date2) {
        Boolean bool;
        Map<Date, Boolean> map = this.f7076d.get(date2);
        if (map != null && (bool = map.get(date)) != null) {
            return bool.booleanValue();
        }
        throw new IllegalArgumentException("Illegal date " + date);
    }
}
