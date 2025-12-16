package ZM;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.imv_cars_details.presentation.f;
import com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.ImvCarsDetailsLineChartItem;
import com.avito.android.imv_cars_details.presentation.items.imv_cars_line_chart.line_chart_view.LineChartPoint;
import com.avito.android.remote.imv_cars_details.models.MarketPriceDynamics;
import com.avito.android.remote.imv_cars_details.models.PricePoint;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ImvLineChartItemConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZM/b;", "LZM/a;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f20112a;

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f20113b = Calendar.getInstance();

    @Inject
    public b(@k f fVar) {
        this.f20112a = fVar;
    }

    @Override // ZM.a
    @l
    public final ImvCarsDetailsLineChartItem a(@l MarketPriceDynamics marketPriceDynamics) {
        List<PricePoint> items;
        if (marketPriceDynamics == null || (items = marketPriceDynamics.getItems()) == null) {
            return null;
        }
        int i12 = 2;
        if (items.size() < 2) {
            return null;
        }
        String title = marketPriceDynamics.getTitle();
        List<PricePoint> list = items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (PricePoint pricePoint : list) {
            long timestamp = pricePoint.getTimestamp();
            long priceLow = (pricePoint.getPriceLow() + pricePoint.getPriceHigh()) / i12;
            long timestamp2 = pricePoint.getTimestamp();
            Calendar calendar = this.f20113b;
            calendar.clear();
            calendar.setTime(new Date(1000 * timestamp2));
            String strI = H.i(' ', this.f20112a.getF170039b()[calendar.get(2)], String.valueOf(calendar.get(1)).substring(2));
            String label = pricePoint.getLabel();
            if (label == null) {
                label = "";
            }
            arrayList.add(new LineChartPoint(timestamp, strI, priceLow, label));
            i12 = 2;
        }
        return new ImvCarsDetailsLineChartItem(null, title, arrayList, 1, null);
    }
}
