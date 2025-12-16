package GA0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: ApiAddSellerAddressInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LGA0/h;", "", "LGA0/g;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "", "isWorkingDay", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(LGA0/g;ZLGA0/g;)V", "LGA0/g;", "a", "()LGA0/g;", "Z", "c", "()Z", "b", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @k
    private final g from;

    @com.google.gson.annotations.c("isWorkingDay")
    private final boolean isWorkingDay;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @k
    private final g to;

    public h(@k g gVar, boolean z12, @k g gVar2) {
        this.from = gVar;
        this.isWorkingDay = z12;
        this.to = gVar2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final g getFrom() {
        return this.from;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final g getTo() {
        return this.to;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsWorkingDay() {
        return this.isWorkingDay;
    }
}
