package HA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiAddSellerAddressInfoV2Response.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"LHA0/b;", "", "LHA0/i;", "friday", "monday", "saturday", "", "standardScheduleText", "sunday", "thursday", "tuesday", "wednesday", "<init>", "(LHA0/i;LHA0/i;LHA0/i;Ljava/lang/String;LHA0/i;LHA0/i;LHA0/i;LHA0/i;)V", "LHA0/i;", "a", "()LHA0/i;", "b", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "g", "h", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c("friday")
    @k
    private final i friday;

    @com.google.gson.annotations.c("monday")
    @k
    private final i monday;

    @com.google.gson.annotations.c("saturday")
    @k
    private final i saturday;

    @com.google.gson.annotations.c("standardScheduleText")
    @l
    private final String standardScheduleText;

    @com.google.gson.annotations.c("sunday")
    @k
    private final i sunday;

    @com.google.gson.annotations.c("thursday")
    @k
    private final i thursday;

    @com.google.gson.annotations.c("tuesday")
    @k
    private final i tuesday;

    @com.google.gson.annotations.c("wednesday")
    @k
    private final i wednesday;

    public b(@k i iVar, @k i iVar2, @k i iVar3, @l String str, @k i iVar4, @k i iVar5, @k i iVar6, @k i iVar7) {
        this.friday = iVar;
        this.monday = iVar2;
        this.saturday = iVar3;
        this.standardScheduleText = str;
        this.sunday = iVar4;
        this.thursday = iVar5;
        this.tuesday = iVar6;
        this.wednesday = iVar7;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final i getFriday() {
        return this.friday;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final i getMonday() {
        return this.monday;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final i getSaturday() {
        return this.saturday;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getStandardScheduleText() {
        return this.standardScheduleText;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final i getSunday() {
        return this.sunday;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final i getThursday() {
        return this.thursday;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final i getTuesday() {
        return this.tuesday;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final i getWednesday() {
        return this.wednesday;
    }
}
