package E4;

import androidx.compose.runtime.internal.P;
import ba.C25607d;
import com.avito.android.advert_details.generated.api.api_1_str_booking_neighboring_dates_by_item_id_get.NeighboringDatesV3ItemsItem;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.SerpViewType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsStrNeighboringDatesItemFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LE4/g;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f3733a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<x> f3734b;

    /* compiled from: AdvertDetailsStrNeighboringDatesItemFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LE4/g$a;", "", "<init>", "()V", "", "STRING_ID", "Ljava/lang/String;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsStrNeighboringDatesItemFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3735a;

        static {
            int[] iArr = new int[NeighboringDatesV3ItemsItem.Type.values().length];
            try {
                iArr[NeighboringDatesV3ItemsItem.Type.SelectDate.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NeighboringDatesV3ItemsItem.Type.StartPositionDate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NeighboringDatesV3ItemsItem.Type.PreloaderDate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f3735a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k com.avito.android.advert.item.similars.j jVar, @Y61.k h31.e<x> eVar) {
        this.f3733a = jVar;
        this.f3734b = eVar;
    }

    public static NeighboringDatesItem.PreloadContext b(NeighboringDatesV3ItemsItem neighboringDatesV3ItemsItem) {
        ba.e previously = neighboringDatesV3ItemsItem.getPreviously();
        if ((previously != null ? previously.getContext() : null) != null) {
            return new NeighboringDatesItem.PreloadContext.Previous(neighboringDatesV3ItemsItem.getPreviously().getContext());
        }
        C25607d later = neighboringDatesV3ItemsItem.getLater();
        if ((later != null ? later.getContext() : null) != null) {
            return new NeighboringDatesItem.PreloadContext.Later(neighboringDatesV3ItemsItem.getLater().getContext());
        }
        return null;
    }

    public static String c(NeighboringDatesV3ItemsItem neighboringDatesV3ItemsItem) {
        if (b.f3735a[neighboringDatesV3ItemsItem.getType().ordinal()] == 3) {
            return "PRELOADER";
        }
        return "DATE_" + neighboringDatesV3ItemsItem.getContent().getChangeParams().getCheckIn() + '_' + neighboringDatesV3ItemsItem.getContent().getChangeParams().getCheckOut();
    }

    @Y61.k
    public final AdvertDetailsNeighboringDatesItem a() {
        return new AdvertDetailsNeighboringDatesItem(this.f3733a.getSpanCount(), "NEIGHBORING_DATES", SerpDisplayType.List, SerpViewType.f268585e, AdvertDetailsNeighboringDatesItem.State.Hide.f84885b);
    }
}
