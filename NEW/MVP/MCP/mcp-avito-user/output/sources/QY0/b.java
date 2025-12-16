package Qy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1StrSellerBookingCalendarParametersRefundSettingsGetResponse.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"LQy0/b;", "", "", "LQy0/e;", "freeCancellationPeriodValues", "", "freeCancellationSelectedPeriodID", "", "hasFreeCancellation", "", "subtitle", "title", "<init>", "(Ljava/util/List;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Z", "c", "()Z", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c("freeCancellationPeriodValues")
    @k
    private final List<e> freeCancellationPeriodValues;

    @com.google.gson.annotations.c("freeCancellationSelectedPeriodID")
    @l
    private final Long freeCancellationSelectedPeriodID;

    @com.google.gson.annotations.c("hasFreeCancellation")
    private final boolean hasFreeCancellation;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public b(@k List<e> list, @l Long l12, boolean z12, @k String str, @k String str2) {
        this.freeCancellationPeriodValues = list;
        this.freeCancellationSelectedPeriodID = l12;
        this.hasFreeCancellation = z12;
        this.subtitle = str;
        this.title = str2;
    }

    @k
    public final List<e> a() {
        return this.freeCancellationPeriodValues;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getFreeCancellationSelectedPeriodID() {
        return this.freeCancellationSelectedPeriodID;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getHasFreeCancellation() {
        return this.hasFreeCancellation;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
