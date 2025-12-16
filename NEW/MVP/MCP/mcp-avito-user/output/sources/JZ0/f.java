package Jz0;

import Y61.l;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrSellerOrdersCalendarBookingsPostRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LJz0/f;", "", "LJz0/g;", "cursor", "LJz0/h;", DateRangeParameter.TYPE, "", "", "itemsIds", "<init>", "(LJz0/g;LJz0/h;Ljava/util/List;)V", "LJz0/g;", "getCursor", "()LJz0/g;", "LJz0/h;", "getDateRange", "()LJz0/h;", "Ljava/util/List;", "getItemsIds", "()Ljava/util/List;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c("cursor")
    @l
    private final g cursor;

    @com.google.gson.annotations.c(DateRangeParameter.TYPE)
    @l
    private final h dateRange;

    @com.google.gson.annotations.c("itemsIds")
    @l
    private final List<String> itemsIds;

    public f(@l g gVar, @l h hVar, @l List<String> list) {
        this.cursor = gVar;
        this.dateRange = hVar;
        this.itemsIds = list;
    }
}
