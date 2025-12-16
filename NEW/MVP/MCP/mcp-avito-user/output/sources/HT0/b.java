package Ht0;

import Y61.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api2BookingFormRequest.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\r\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"LHt0/b;", "", "", "advertId", "bookingId", "", "", "params", "stepId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "Ljava/lang/String;", "getAdvertId", "()Ljava/lang/String;", "getBookingId", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "getStepId", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    @com.google.gson.annotations.c("advertId")
    @l
    private final String advertId;

    @com.google.gson.annotations.c("bookingId")
    @l
    private final String bookingId;

    @com.google.gson.annotations.c("params")
    @l
    private final Map<String, List<String>> params;

    @com.google.gson.annotations.c("stepId")
    @l
    private final String stepId;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@l String str, @l String str2, @l Map<String, ? extends List<String>> map, @l String str3) {
        this.advertId = str;
        this.bookingId = str2;
        this.params = map;
        this.stepId = str3;
    }
}
