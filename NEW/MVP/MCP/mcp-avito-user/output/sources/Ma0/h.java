package MA0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ApiEditSellerAddressInfoV2Response.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b!\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\"\u0010\u0013¨\u0006#"}, d2 = {"LMA0/h;", "", "LMA0/k;", "friday", "", "isCustomSchedule", "isStandardSchedule", "monday", "saturday", "", "standardScheduleText", "sunday", "thursday", "tuesday", "wednesday", "<init>", "(LMA0/k;Ljava/lang/Boolean;ZLMA0/k;LMA0/k;Ljava/lang/String;LMA0/k;LMA0/k;LMA0/k;LMA0/k;)V", "LMA0/k;", "a", "()LMA0/k;", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "Z", "j", "()Z", "b", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "e", "f", "g", "h", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    @com.google.gson.annotations.c("friday")
    @Y61.k
    private final k friday;

    @com.google.gson.annotations.c("isCustomSchedule")
    @l
    private final Boolean isCustomSchedule;

    @com.google.gson.annotations.c("isStandardSchedule")
    private final boolean isStandardSchedule;

    @com.google.gson.annotations.c("monday")
    @Y61.k
    private final k monday;

    @com.google.gson.annotations.c("saturday")
    @Y61.k
    private final k saturday;

    @com.google.gson.annotations.c("standardScheduleText")
    @l
    private final String standardScheduleText;

    @com.google.gson.annotations.c("sunday")
    @Y61.k
    private final k sunday;

    @com.google.gson.annotations.c("thursday")
    @Y61.k
    private final k thursday;

    @com.google.gson.annotations.c("tuesday")
    @Y61.k
    private final k tuesday;

    @com.google.gson.annotations.c("wednesday")
    @Y61.k
    private final k wednesday;

    public h(@Y61.k k kVar, @l Boolean bool, boolean z12, @Y61.k k kVar2, @Y61.k k kVar3, @l String str, @Y61.k k kVar4, @Y61.k k kVar5, @Y61.k k kVar6, @Y61.k k kVar7) {
        this.friday = kVar;
        this.isCustomSchedule = bool;
        this.isStandardSchedule = z12;
        this.monday = kVar2;
        this.saturday = kVar3;
        this.standardScheduleText = str;
        this.sunday = kVar4;
        this.thursday = kVar5;
        this.tuesday = kVar6;
        this.wednesday = kVar7;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final k getFriday() {
        return this.friday;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final k getMonday() {
        return this.monday;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final k getSaturday() {
        return this.saturday;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getStandardScheduleText() {
        return this.standardScheduleText;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final k getSunday() {
        return this.sunday;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final k getThursday() {
        return this.thursday;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final k getTuesday() {
        return this.tuesday;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final k getWednesday() {
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
