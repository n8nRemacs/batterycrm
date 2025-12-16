package dQ0;

import kotlin.Metadata;

/* compiled from: GetProfileAppliesToVacancyV2Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LdQ0/f;", "", "LdQ0/g;", "contacts", "", "createdTime", "LdQ0/h;", "employer", "LdQ0/j;", "status", "LdQ0/k;", "vacancy", "<init>", "(LdQ0/g;JLdQ0/h;LdQ0/j;LdQ0/k;)V", "LdQ0/g;", "a", "()LdQ0/g;", "J", "b", "()J", "LdQ0/h;", "c", "()LdQ0/h;", "LdQ0/j;", "d", "()LdQ0/j;", "LdQ0/k;", "e", "()LdQ0/k;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    @com.google.gson.annotations.c("contacts")
    @Y61.k
    private final g contacts;

    @com.google.gson.annotations.c("createdTime")
    private final long createdTime;

    @com.google.gson.annotations.c("employer")
    @Y61.k
    private final h employer;

    @com.google.gson.annotations.c("status")
    @Y61.k
    private final j status;

    @com.google.gson.annotations.c("vacancy")
    @Y61.k
    private final k vacancy;

    public f(@Y61.k g gVar, long j12, @Y61.k h hVar, @Y61.k j jVar, @Y61.k k kVar) {
        this.contacts = gVar;
        this.createdTime = j12;
        this.employer = hVar;
        this.status = jVar;
        this.vacancy = kVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final g getContacts() {
        return this.contacts;
    }

    /* renamed from: b, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final h getEmployer() {
        return this.employer;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final j getStatus() {
        return this.status;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final k getVacancy() {
        return this.vacancy;
    }
}
