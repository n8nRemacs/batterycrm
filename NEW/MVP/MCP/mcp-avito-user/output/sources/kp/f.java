package kP;

import kotlin.Metadata;

/* compiled from: ApiGetFiltersV5Response.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"LkP/f;", "", "", "id", "title", "LkP/a;", "valueAgeFromTo", "LkP/b;", "valueApplicationStatus", "LkP/d;", "valueDateInterval", "LkP/e;", "valueEmployee", "LkP/i;", "valueGender", "LkP/j;", "valueLocation", "LkP/k;", "valueStatus", "LkP/l;", "valueVacancy", "<init>", "(Ljava/lang/String;Ljava/lang/String;LkP/a;LkP/b;LkP/d;LkP/e;LkP/i;LkP/j;LkP/k;LkP/l;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "LkP/a;", "getValueAgeFromTo", "()LkP/a;", "LkP/b;", "c", "()LkP/b;", "LkP/d;", "d", "()LkP/d;", "LkP/e;", "e", "()LkP/e;", "LkP/i;", "f", "()LkP/i;", "LkP/j;", "g", "()LkP/j;", "LkP/k;", "h", "()LkP/k;", "LkP/l;", "i", "()LkP/l;", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {

    @com.google.gson.annotations.c("id")
    @Y61.l
    private final String id;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("valueAgeFromTo")
    @Y61.l
    private final C42613a valueAgeFromTo;

    @com.google.gson.annotations.c("valueApplicationStatus")
    @Y61.l
    private final C42614b valueApplicationStatus;

    @com.google.gson.annotations.c("valueDateInterval")
    @Y61.l
    private final d valueDateInterval;

    @com.google.gson.annotations.c("valueEmployee")
    @Y61.l
    private final e valueEmployee;

    @com.google.gson.annotations.c("valueGender")
    @Y61.l
    private final i valueGender;

    @com.google.gson.annotations.c("valueLocation")
    @Y61.l
    private final j valueLocation;

    @com.google.gson.annotations.c("valueStatus")
    @Y61.l
    private final k valueStatus;

    @com.google.gson.annotations.c("valueVacancy")
    @Y61.l
    private final l valueVacancy;

    public f(@Y61.l String str, @Y61.k String str2, @Y61.l C42613a c42613a, @Y61.l C42614b c42614b, @Y61.l d dVar, @Y61.l e eVar, @Y61.l i iVar, @Y61.l j jVar, @Y61.l k kVar, @Y61.l l lVar) {
        this.id = str;
        this.title = str2;
        this.valueAgeFromTo = c42613a;
        this.valueApplicationStatus = c42614b;
        this.valueDateInterval = dVar;
        this.valueEmployee = eVar;
        this.valueGender = iVar;
        this.valueLocation = jVar;
        this.valueStatus = kVar;
        this.valueVacancy = lVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final C42614b getValueApplicationStatus() {
        return this.valueApplicationStatus;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final d getValueDateInterval() {
        return this.valueDateInterval;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final e getValueEmployee() {
        return this.valueEmployee;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final i getValueGender() {
        return this.valueGender;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final j getValueLocation() {
        return this.valueLocation;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final k getValueStatus() {
        return this.valueStatus;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final l getValueVacancy() {
        return this.valueVacancy;
    }
}
