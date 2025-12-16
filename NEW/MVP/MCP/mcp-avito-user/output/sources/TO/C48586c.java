package tO;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiMapGeozonesRequest.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LtO/c;", "", "", "", "districtIds", SearchParamsConverterKt.LOCATION_ID, "metroIds", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "Ljava/util/List;", "getDistrictIds", "()Ljava/util/List;", "Ljava/lang/String;", "getLocationId", "()Ljava/lang/String;", "getMetroIds", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tO.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48586c {

    @com.google.gson.annotations.c("districtIds")
    @l
    private final List<String> districtIds;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    @k
    private final String locationId;

    @com.google.gson.annotations.c("metroIds")
    @l
    private final List<String> metroIds;

    public C48586c(@l List<String> list, @k String str, @l List<String> list2) {
        this.districtIds = list;
        this.locationId = str;
        this.metroIds = list2;
    }
}
