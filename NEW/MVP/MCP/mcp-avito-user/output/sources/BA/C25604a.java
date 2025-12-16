package ba;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details.generated.api.api_1_str_booking_neighboring_dates_by_item_id_get.NeighboringDatesV3ItemsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrBookingNeighboringDatesByItemIdGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lba/a;", "", "", "Lcom/avito/android/advert_details/generated/api/api_1_str_booking_neighboring_dates_by_item_id_get/NeighboringDatesV3ItemsItem;", "items", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ba.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C25604a {

    @com.google.gson.annotations.c("items")
    @l
    private final List<NeighboringDatesV3ItemsItem> items;

    public C25604a(@l List<NeighboringDatesV3ItemsItem> list) {
        this.items = list;
    }

    @l
    public final List<NeighboringDatesV3ItemsItem> a() {
        return this.items;
    }
}
