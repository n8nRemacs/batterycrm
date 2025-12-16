package com.avito.android.survey_vacancy_reliability;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: JobSurveyVacancyReliabilityLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/survey_vacancy_reliability/JobSurveyVacancyReliabilityLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_survey-vacancy-reliability_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class JobSurveyVacancyReliabilityLink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobSurveyVacancyReliabilityLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f292520b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f292521c;

    /* compiled from: JobSurveyVacancyReliabilityLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobSurveyVacancyReliabilityLink> {
        @Override // android.os.Parcelable.Creator
        public final JobSurveyVacancyReliabilityLink createFromParcel(Parcel parcel) {
            return new JobSurveyVacancyReliabilityLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobSurveyVacancyReliabilityLink[] newArray(int i12) {
            return new JobSurveyVacancyReliabilityLink[i12];
        }
    }

    public JobSurveyVacancyReliabilityLink(@l String str, @l String str2) {
        this.f292520b = str;
        this.f292521c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobSurveyVacancyReliabilityLink)) {
            return false;
        }
        JobSurveyVacancyReliabilityLink jobSurveyVacancyReliabilityLink = (JobSurveyVacancyReliabilityLink) obj;
        return L.f(this.f292520b, jobSurveyVacancyReliabilityLink.f292520b) && L.f(this.f292521c, jobSurveyVacancyReliabilityLink.f292521c);
    }

    public final int hashCode() {
        String str = this.f292520b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f292521c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobSurveyVacancyReliabilityLink(sellerId=");
        sb2.append(this.f292520b);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f292521c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f292520b);
        parcel.writeString(this.f292521c);
    }
}
