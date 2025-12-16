package com.avito.android.work_profile.domain.entity;

import Y61.k;
import Y61.l;
import aQ0.AbstractC19808b;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancy.kt */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0017¨\u0006/"}, d2 = {"Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyInfo;", "LaQ0/b;", "Lcom/avito/android/work_profile/domain/entity/ContactBar;", "contacts", "", "createdTime", "Lcom/avito/android/work_profile/domain/entity/Employer;", "employer", "Lcom/avito/android/work_profile/domain/entity/Status;", "status", "Lcom/avito/android/work_profile/domain/entity/Vacancy;", "vacancy", "<init>", "(Lcom/avito/android/work_profile/domain/entity/ContactBar;JLcom/avito/android/work_profile/domain/entity/Employer;Lcom/avito/android/work_profile/domain/entity/Status;Lcom/avito/android/work_profile/domain/entity/Vacancy;)V", "component1", "()Lcom/avito/android/work_profile/domain/entity/ContactBar;", "component2", "()J", "component3", "()Lcom/avito/android/work_profile/domain/entity/Employer;", "component4", "()Lcom/avito/android/work_profile/domain/entity/Status;", "component5", "()Lcom/avito/android/work_profile/domain/entity/Vacancy;", "copy", "(Lcom/avito/android/work_profile/domain/entity/ContactBar;JLcom/avito/android/work_profile/domain/entity/Employer;Lcom/avito/android/work_profile/domain/entity/Status;Lcom/avito/android/work_profile/domain/entity/Vacancy;)Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/work_profile/domain/entity/ContactBar;", "getContacts", "J", "getCreatedTime", "Lcom/avito/android/work_profile/domain/entity/Employer;", "getEmployer", "Lcom/avito/android/work_profile/domain/entity/Status;", "getStatus", "Lcom/avito/android/work_profile/domain/entity/Vacancy;", "getVacancy", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AppliesToVacancyInfo extends AbstractC19808b {

    @k
    private final ContactBar contacts;
    private final long createdTime;

    @k
    private final Employer employer;

    @k
    private final Status status;

    @k
    private final Vacancy vacancy;

    public AppliesToVacancyInfo(@k ContactBar contactBar, long j12, @k Employer employer, @k Status status, @k Vacancy vacancy) {
        super(null);
        this.contacts = contactBar;
        this.createdTime = j12;
        this.employer = employer;
        this.status = status;
        this.vacancy = vacancy;
    }

    public static /* synthetic */ AppliesToVacancyInfo copy$default(AppliesToVacancyInfo appliesToVacancyInfo, ContactBar contactBar, long j12, Employer employer, Status status, Vacancy vacancy, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            contactBar = appliesToVacancyInfo.contacts;
        }
        if ((i12 & 2) != 0) {
            j12 = appliesToVacancyInfo.createdTime;
        }
        long j13 = j12;
        if ((i12 & 4) != 0) {
            employer = appliesToVacancyInfo.employer;
        }
        Employer employer2 = employer;
        if ((i12 & 8) != 0) {
            status = appliesToVacancyInfo.status;
        }
        Status status2 = status;
        if ((i12 & 16) != 0) {
            vacancy = appliesToVacancyInfo.vacancy;
        }
        return appliesToVacancyInfo.copy(contactBar, j13, employer2, status2, vacancy);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ContactBar getContacts() {
        return this.contacts;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCreatedTime() {
        return this.createdTime;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Employer getEmployer() {
        return this.employer;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final Vacancy getVacancy() {
        return this.vacancy;
    }

    @k
    public final AppliesToVacancyInfo copy(@k ContactBar contacts, long createdTime, @k Employer employer, @k Status status, @k Vacancy vacancy) {
        return new AppliesToVacancyInfo(contacts, createdTime, employer, status, vacancy);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppliesToVacancyInfo)) {
            return false;
        }
        AppliesToVacancyInfo appliesToVacancyInfo = (AppliesToVacancyInfo) other;
        return L.f(this.contacts, appliesToVacancyInfo.contacts) && this.createdTime == appliesToVacancyInfo.createdTime && L.f(this.employer, appliesToVacancyInfo.employer) && L.f(this.status, appliesToVacancyInfo.status) && L.f(this.vacancy, appliesToVacancyInfo.vacancy);
    }

    @k
    public final ContactBar getContacts() {
        return this.contacts;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    @k
    public final Employer getEmployer() {
        return this.employer;
    }

    @k
    public final Status getStatus() {
        return this.status;
    }

    @k
    public final Vacancy getVacancy() {
        return this.vacancy;
    }

    public int hashCode() {
        return this.vacancy.hashCode() + ((this.status.hashCode() + ((this.employer.hashCode() + r.g(this.contacts.hashCode() * 31, 31, this.createdTime)) * 31)) * 31);
    }

    @k
    public String toString() {
        return "AppliesToVacancyInfo(contacts=" + this.contacts + ", createdTime=" + this.createdTime + ", employer=" + this.employer + ", status=" + this.status + ", vacancy=" + this.vacancy + ')';
    }
}
