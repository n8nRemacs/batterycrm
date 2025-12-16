package GA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiAddSellerAddressInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"LGA0/b;", "", "LGA0/h;", "friday", "monday", "saturday", "", "standardScheduleText", "sunday", "thursday", "tuesday", "wednesday", "<init>", "(LGA0/h;LGA0/h;LGA0/h;Ljava/lang/String;LGA0/h;LGA0/h;LGA0/h;LGA0/h;)V", "LGA0/h;", "a", "()LGA0/h;", "b", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "g", "h", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c("friday")
    @k
    private final h friday;

    @com.google.gson.annotations.c("monday")
    @k
    private final h monday;

    @com.google.gson.annotations.c("saturday")
    @k
    private final h saturday;

    @com.google.gson.annotations.c("standardScheduleText")
    @l
    private final String standardScheduleText;

    @com.google.gson.annotations.c("sunday")
    @k
    private final h sunday;

    @com.google.gson.annotations.c("thursday")
    @k
    private final h thursday;

    @com.google.gson.annotations.c("tuesday")
    @k
    private final h tuesday;

    @com.google.gson.annotations.c("wednesday")
    @k
    private final h wednesday;

    public b(@k h hVar, @k h hVar2, @k h hVar3, @l String str, @k h hVar4, @k h hVar5, @k h hVar6, @k h hVar7) {
        this.friday = hVar;
        this.monday = hVar2;
        this.saturday = hVar3;
        this.standardScheduleText = str;
        this.sunday = hVar4;
        this.thursday = hVar5;
        this.tuesday = hVar6;
        this.wednesday = hVar7;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final h getFriday() {
        return this.friday;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final h getMonday() {
        return this.monday;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final h getSaturday() {
        return this.saturday;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getStandardScheduleText() {
        return this.standardScheduleText;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final h getSunday() {
        return this.sunday;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final h getThursday() {
        return this.thursday;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final h getTuesday() {
        return this.tuesday;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final h getWednesday() {
        return this.wednesday;
    }
}
