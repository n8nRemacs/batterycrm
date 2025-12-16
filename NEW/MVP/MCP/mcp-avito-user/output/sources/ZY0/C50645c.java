package zy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api2StrItemBookingCalendarDataGetResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzy0/c;", "", "Lzy0/d;", "availableCheckOutDateRange", "", "date", "", "isCheckInAvailable", "<init>", "(Lzy0/d;Ljava/lang/String;Z)V", "Lzy0/d;", "a", "()Lzy0/d;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "c", "()Z", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zy0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50645c {

    @com.google.gson.annotations.c("availableCheckOutDateRange")
    @l
    private final C50646d availableCheckOutDateRange;

    @com.google.gson.annotations.c("date")
    @k
    private final String date;

    @com.google.gson.annotations.c("isCheckInAvailable")
    private final boolean isCheckInAvailable;

    public C50645c(@l C50646d c50646d, @k String str, boolean z12) {
        this.availableCheckOutDateRange = c50646d;
        this.date = str;
        this.isCheckInAvailable = z12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C50646d getAvailableCheckOutDateRange() {
        return this.availableCheckOutDateRange;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsCheckInAvailable() {
        return this.isCheckInAvailable;
    }
}
