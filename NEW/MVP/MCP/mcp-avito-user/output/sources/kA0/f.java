package KA0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;

/* compiled from: ApiEditSellerAddressRequest.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"LKA0/f;", "", "LKA0/e;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "", "isWorkingDay", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "<init>", "(LKA0/e;ZLKA0/e;)V", "LKA0/e;", "getFrom", "()LKA0/e;", "Z", "()Z", "getTo", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @k
    private final e from;

    @com.google.gson.annotations.c("isWorkingDay")
    private final boolean isWorkingDay;

    @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @k
    private final e to;

    public f(@k e eVar, boolean z12, @k e eVar2) {
        this.from = eVar;
        this.isWorkingDay = z12;
        this.to = eVar2;
    }
}
