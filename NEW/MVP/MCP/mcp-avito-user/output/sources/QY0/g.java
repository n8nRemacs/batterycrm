package Qy0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrSellerBookingCalendarParametersRefundSettingsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\f\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LQy0/g;", "", "", "LQy0/h;", "cancellationEnabled", "cancellationNotEnabled", "discountEnabled", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "b", "c", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    @com.google.gson.annotations.c("cancellationEnabled")
    @k
    private final List<h> cancellationEnabled;

    @com.google.gson.annotations.c("cancellationNotEnabled")
    @k
    private final List<h> cancellationNotEnabled;

    @com.google.gson.annotations.c("discountEnabled")
    @k
    private final List<h> discountEnabled;

    public g(@k List<h> list, @k List<h> list2, @k List<h> list3) {
        this.cancellationEnabled = list;
        this.cancellationNotEnabled = list2;
        this.discountEnabled = list3;
    }

    @k
    public final List<h> a() {
        return this.cancellationEnabled;
    }

    @k
    public final List<h> b() {
        return this.cancellationNotEnabled;
    }

    @k
    public final List<h> c() {
        return this.discountEnabled;
    }
}
