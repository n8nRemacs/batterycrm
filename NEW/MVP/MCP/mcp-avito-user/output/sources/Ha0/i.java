package HA0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: ApiAddSellerAddressInfoV2Response.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LHA0/i;", "", "LHA0/h;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "", "isWorkingDay", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(LHA0/h;ZLHA0/h;)V", "LHA0/h;", "a", "()LHA0/h;", "Z", "c", "()Z", "b", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @k
    private final h from;

    @com.google.gson.annotations.c("isWorkingDay")
    private final boolean isWorkingDay;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @k
    private final h to;

    public i(@k h hVar, boolean z12, @k h hVar2) {
        this.from = hVar;
        this.isWorkingDay = z12;
        this.to = hVar2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final h getFrom() {
        return this.from;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final h getTo() {
        return this.to;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsWorkingDay() {
        return this.isWorkingDay;
    }
}
