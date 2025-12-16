package Py0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: Api1StrSellerBookingCalendarParametersApplyRefundSettingsPostRequest.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LPy0/b;", "", "", "cancellationDiscountEnabled", "", "cancellationDiscountValue", "freeCancellationEnabled", "freeCancellationPeriodID", "itemId", "LPy0/c;", "range", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;ZLjava/lang/Long;JLPy0/c;)V", "Ljava/lang/Boolean;", "getCancellationDiscountEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Long;", "getCancellationDiscountValue", "()Ljava/lang/Long;", "Z", "getFreeCancellationEnabled", "()Z", "getFreeCancellationPeriodID", "J", "getItemId", "()J", "LPy0/c;", "getRange", "()LPy0/c;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Py0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14858b {

    @com.google.gson.annotations.c("cancellationDiscountEnabled")
    @l
    private final Boolean cancellationDiscountEnabled;

    @com.google.gson.annotations.c("cancellationDiscountValue")
    @l
    private final Long cancellationDiscountValue;

    @com.google.gson.annotations.c("freeCancellationEnabled")
    private final boolean freeCancellationEnabled;

    @com.google.gson.annotations.c("freeCancellationPeriodID")
    @l
    private final Long freeCancellationPeriodID;

    @com.google.gson.annotations.c("itemId")
    private final long itemId;

    @com.google.gson.annotations.c("range")
    @l
    private final C14859c range;

    public C14858b(@l Boolean bool, @l Long l12, boolean z12, @l Long l13, long j12, @l C14859c c14859c) {
        this.cancellationDiscountEnabled = bool;
        this.cancellationDiscountValue = l12;
        this.freeCancellationEnabled = z12;
        this.freeCancellationPeriodID = l13;
        this.itemId = j12;
        this.range = c14859c;
    }
}
