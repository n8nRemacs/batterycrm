package os;

import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1CpaCjmCpxPromoGeoGetDataPostRequest.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Los/n;", "", "", "Los/o;", "autoBidLocations", "Los/u;", "autoBidMergedLocation", "", "context", "manBidLocations", "", "selectedIds", "<init>", "(Ljava/util/List;Los/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "getAutoBidLocations", "()Ljava/util/List;", "Los/u;", "getAutoBidMergedLocation", "()Los/u;", "Ljava/lang/String;", "getContext", "()Ljava/lang/String;", "getManBidLocations", "getSelectedIds", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n {

    @com.google.gson.annotations.c("autoBidLocations")
    @Y61.l
    private final List<o> autoBidLocations;

    @com.google.gson.annotations.c("autoBidMergedLocation")
    @Y61.l
    private final u autoBidMergedLocation;

    @com.google.gson.annotations.c("context")
    @Y61.k
    private final String context;

    @com.google.gson.annotations.c("manBidLocations")
    @Y61.l
    private final List<o> manBidLocations;

    @com.google.gson.annotations.c("selectedIds")
    @Y61.l
    private final List<Long> selectedIds;

    public n(@Y61.l List<o> list, @Y61.l u uVar, @Y61.k String str, @Y61.l List<o> list2, @Y61.l List<Long> list3) {
        this.autoBidLocations = list;
        this.autoBidMergedLocation = uVar;
        this.context = str;
        this.manBidLocations = list2;
        this.selectedIds = list3;
    }
}
