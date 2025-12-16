package E4;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.optimal_price.AdvertDetailsOptimalPriceItem;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.optimal_price.OptimalPriceWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsStrOptimalPriceItemFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LE4/j;", "LE4/i;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f3738a;

    /* compiled from: AdvertDetailsStrOptimalPriceItemFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LE4/j$a;", "", "<init>", "()V", "", "STRING_ID", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f3738a = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    @Override // E4.i
    @Y61.l
    public final AdvertDetailsOptimalPriceItem a(@Y61.k AdvertDetails advertDetails) {
        OptimalPriceWidget optimalPriceWidget;
        ArrayList arrayList;
        AdvertDetailsOptimalPriceItem.Button button;
        ?? arrayList2;
        AdvertDetailsOptimalPriceItem.Scale.Line line;
        AdvertShortTermRent shortTermRent = advertDetails.getShortTermRent();
        if (shortTermRent == null || (optimalPriceWidget = shortTermRent.getOptimalPriceWidget()) == null) {
            return null;
        }
        List<OptimalPriceWidget.OptimalPriceScaleItem> scale = optimalPriceWidget.getScale();
        if (scale != null) {
            arrayList = new ArrayList();
            for (OptimalPriceWidget.OptimalPriceScaleItem optimalPriceScaleItem : scale) {
                AttributedText name = optimalPriceScaleItem.getName();
                if (name == null) {
                    line = null;
                } else {
                    List<OptimalPriceWidget.OptimalPriceScaleItem.OptimalPriceMarker> markers = optimalPriceScaleItem.getMarkers();
                    if (markers != null) {
                        arrayList2 = new ArrayList();
                        Iterator it = markers.iterator();
                        while (it.hasNext()) {
                            AttributedText title = ((OptimalPriceWidget.OptimalPriceScaleItem.OptimalPriceMarker) it.next()).getTitle();
                            AdvertDetailsOptimalPriceItem.Scale.Line.Marker marker = title == null ? null : new AdvertDetailsOptimalPriceItem.Scale.Line.Marker(title, r8.getPosition() / 100.0f);
                            if (marker != null) {
                                arrayList2.add(marker);
                            }
                        }
                    } else {
                        arrayList2 = C42784z0.f406748b;
                    }
                    line = new AdvertDetailsOptimalPriceItem.Scale.Line(arrayList2, optimalPriceScaleItem.getWidth() / 100.0f, optimalPriceScaleItem.getColor(), name);
                }
                if (line != null) {
                    arrayList.add(line);
                }
            }
        } else {
            arrayList = null;
        }
        AdvertDetailsOptimalPriceItem.Scale scale2 = arrayList != null ? new AdvertDetailsOptimalPriceItem.Scale(arrayList) : null;
        OptimalPriceWidget.OptimalPriceButton button2 = optimalPriceWidget.getButton();
        String title2 = button2 != null ? button2.getTitle() : null;
        if (title2 != null) {
            OptimalPriceWidget.OptimalPriceButton button3 = optimalPriceWidget.getButton();
            button = new AdvertDetailsOptimalPriceItem.Button(title2, button3 != null ? button3.getDeeplink() : null);
        } else {
            button = null;
        }
        return new AdvertDetailsOptimalPriceItem(this.f3738a.getSpanCount(), "OptimalPriceWidget", SerpDisplayType.List, SerpViewType.f268585e, optimalPriceWidget.getTitle(), optimalPriceWidget.getText(), scale2, button);
    }
}
