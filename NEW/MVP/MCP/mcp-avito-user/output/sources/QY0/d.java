package Qy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1StrSellerBookingCalendarParametersRefundSettingsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LQy0/d;", "", "", "hint", "", "maxValue", "minValue", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "d", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d {

    @com.google.gson.annotations.c("hint")
    @k
    private final String hint;

    @com.google.gson.annotations.c("maxValue")
    @l
    private final Long maxValue;

    @com.google.gson.annotations.c("minValue")
    @l
    private final Long minValue;

    @com.google.gson.annotations.c("value")
    @l
    private final Long value;

    public d(@k String str, @l Long l12, @l Long l13, @l Long l14) {
        this.hint = str;
        this.maxValue = l12;
        this.minValue = l13;
        this.value = l14;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getMaxValue() {
        return this.maxValue;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Long getMinValue() {
        return this.minValue;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getValue() {
        return this.value;
    }
}
