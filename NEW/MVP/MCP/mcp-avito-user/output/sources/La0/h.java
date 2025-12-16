package LA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiEditSellerAddressInfoResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"LLA0/h;", "", "LLA0/j;", "friday", "", "isCustomSchedule", "isStandardSchedule", "monday", "saturday", "", "standardScheduleText", "sunday", "thursday", "tuesday", "wednesday", "<init>", "(LLA0/j;Ljava/lang/Boolean;ZLLA0/j;LLA0/j;Ljava/lang/String;LLA0/j;LLA0/j;LLA0/j;LLA0/j;)V", "LLA0/j;", "a", "()LLA0/j;", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "Z", "j", "()Z", "b", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "g", "h", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    @com.google.gson.annotations.c("friday")
    @k
    private final j friday;

    @com.google.gson.annotations.c("isCustomSchedule")
    @l
    private final Boolean isCustomSchedule;

    @com.google.gson.annotations.c("isStandardSchedule")
    private final boolean isStandardSchedule;

    @com.google.gson.annotations.c("monday")
    @k
    private final j monday;

    @com.google.gson.annotations.c("saturday")
    @k
    private final j saturday;

    @com.google.gson.annotations.c("standardScheduleText")
    @l
    private final String standardScheduleText;

    @com.google.gson.annotations.c("sunday")
    @k
    private final j sunday;

    @com.google.gson.annotations.c("thursday")
    @k
    private final j thursday;

    @com.google.gson.annotations.c("tuesday")
    @k
    private final j tuesday;

    @com.google.gson.annotations.c("wednesday")
    @k
    private final j wednesday;

    public h(@k j jVar, @l Boolean bool, boolean z12, @k j jVar2, @k j jVar3, @l String str, @k j jVar4, @k j jVar5, @k j jVar6, @k j jVar7) {
        this.friday = jVar;
        this.isCustomSchedule = bool;
        this.isStandardSchedule = z12;
        this.monday = jVar2;
        this.saturday = jVar3;
        this.standardScheduleText = str;
        this.sunday = jVar4;
        this.thursday = jVar5;
        this.tuesday = jVar6;
        this.wednesday = jVar7;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final j getFriday() {
        return this.friday;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final j getMonday() {
        return this.monday;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final j getSaturday() {
        return this.saturday;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getStandardScheduleText() {
        return this.standardScheduleText;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final j getSunday() {
        return this.sunday;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final j getThursday() {
        return this.thursday;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final j getTuesday() {
        return this.tuesday;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final j getWednesday() {
        return this.wednesday;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Boolean getIsCustomSchedule() {
        return this.isCustomSchedule;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsStandardSchedule() {
        return this.isStandardSchedule;
    }
}
