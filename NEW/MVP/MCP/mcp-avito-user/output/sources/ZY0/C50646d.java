package zy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api2StrItemBookingCalendarDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lzy0/d;", "", "", "endDate", "minimalDurationCaption", "startDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zy0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50646d {

    @com.google.gson.annotations.c("endDate")
    @k
    private final String endDate;

    @com.google.gson.annotations.c("minimalDurationCaption")
    @l
    private final String minimalDurationCaption;

    @com.google.gson.annotations.c("startDate")
    @k
    private final String startDate;

    public C50646d(@k String str, @l String str2, @k String str3) {
        this.endDate = str;
        this.minimalDurationCaption = str2;
        this.startDate = str3;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getMinimalDurationCaption() {
        return this.minimalDurationCaption;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }
}
