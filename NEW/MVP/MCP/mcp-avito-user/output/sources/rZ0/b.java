package Rz0;

import Kz0.C14365a;
import Kz0.c;
import Kz0.e;
import Kz0.f;
import Kz0.g;
import Kz0.h;
import Kz0.l;
import Tz0.C15428b;
import Tz0.C15429c;
import Tz0.C15430d;
import Tz0.C15431e;
import Tz0.C15432f;
import Tz0.C15433g;
import Tz0.i;
import Tz0.j;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.str_seller_orders_calendar.strorderscalendar.models.api.DateRange;
import com.avito.android.util.C35787f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: Api3StrSellerOrdersCalendarResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRz0/b;", "", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f14785a = new b();

    @k
    public static Tz0.k a(@k C14365a c14365a) {
        List<Kz0.k> listA = c14365a.a();
        if (listA == null) {
            listA = C42784z0.f406748b;
        }
        List<Kz0.k> list = listA;
        int i12 = 10;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Kz0.k kVar = (Kz0.k) it.next();
            f14785a.getClass();
            String id2 = kVar.getId();
            Kz0.b mainInfo = kVar.getMainInfo();
            DeepLink deeplink = mainInfo.getDeeplink();
            String image = mainInfo.getImage();
            c iconWithTooltip = mainInfo.getIconWithTooltip();
            C15432f c15432f = new C15432f(deeplink, image, iconWithTooltip != null ? new C15431e(b(iconWithTooltip.getIcon().getBackgroundColor()), b(iconWithTooltip.getIcon().getColor()), iconWithTooltip.getIcon().getName(), iconWithTooltip.getText()) : null, mainInfo.getTitle());
            List<e> listD = kVar.d();
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listD, i12));
            for (e eVar : listD) {
                String id3 = eVar.getId();
                String date = eVar.getDate();
                f footer = eVar.getFooter();
                g features = footer.getFeatures();
                Iterator it2 = it;
                i iVar = new i(new C15429c(features.getInstantBooking(), features.getLastMinuteOffer(), features.getPromo()), (int) footer.getMinNights());
                h price = eVar.getPrice();
                arrayList2.add(new C15428b(id3, date, iVar, new j(price.getMain(), price.getExtra())));
                arrayList = arrayList;
                it = it2;
            }
            Iterator it3 = it;
            ArrayList arrayList3 = arrayList;
            List<Kz0.i> listA2 = kVar.a();
            ArrayList arrayList4 = new ArrayList(C42745f0.q(listA2, 10));
            for (Kz0.i iVar2 : listA2) {
                Kz0.j dateRange = iVar2.getDateRange();
                arrayList4.add(new C15430d(new DateRange(dateRange.getStart(), dateRange.getEnd()), iVar2.getTitle()));
            }
            arrayList3.add(new C15433g(id2, c15432f, arrayList2, arrayList4, C42784z0.f406748b));
            it = it3;
            i12 = 10;
            arrayList = arrayList3;
        }
        return new Tz0.k(arrayList);
    }

    public static UniversalColor b(l lVar) {
        Integer numA;
        Integer numA2;
        String value = lVar.getValue();
        Color color = null;
        Color color2 = (value == null || (numA2 = C35787f0.a(value)) == null) ? null : new Color(numA2.intValue());
        String valueDark = lVar.getValueDark();
        if (valueDark != null && (numA = C35787f0.a(valueDark)) != null) {
            color = new Color(numA.intValue());
        }
        return new UniversalColor(lVar.getValueName(), color, color2);
    }
}
