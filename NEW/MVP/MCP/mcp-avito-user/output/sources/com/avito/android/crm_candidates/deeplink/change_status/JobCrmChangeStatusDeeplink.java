package com.avito.android.crm_candidates.deeplink.change_status;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: JobCrmChangeStatusDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/change_status/JobCrmChangeStatusDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "JobApplicationStatusConfig", "b", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class JobCrmChangeStatusDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobCrmChangeStatusDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JobApplicationStatusConfig f129147b;

    /* compiled from: JobCrmChangeStatusDeeplink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/change_status/JobCrmChangeStatusDeeplink$JobApplicationStatusConfig;", "Landroid/os/Parcelable;", "", "", "currentStatus", "availableStatuses", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "c", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class JobApplicationStatusConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<JobApplicationStatusConfig> CREATOR = new a();

        @com.google.gson.annotations.c("available_statuses")
        @k
        private final Map<String, String> availableStatuses;

        @com.google.gson.annotations.c("current_status")
        @k
        private final Map<String, String> currentStatus;

        /* compiled from: JobCrmChangeStatusDeeplink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<JobApplicationStatusConfig> {
            @Override // android.os.Parcelable.Creator
            public final JobApplicationStatusConfig createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                int iA3 = 0;
                while (iA3 != i12) {
                    iA3 = C0.a(parcel, linkedHashMap, parcel.readString(), iA3, 1);
                }
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                return new JobApplicationStatusConfig(linkedHashMap, linkedHashMap2);
            }

            @Override // android.os.Parcelable.Creator
            public final JobApplicationStatusConfig[] newArray(int i12) {
                return new JobApplicationStatusConfig[i12];
            }
        }

        public JobApplicationStatusConfig(@k Map<String, String> map, @k Map<String, String> map2) {
            this.currentStatus = map;
            this.availableStatuses = map2;
        }

        @k
        public final Map<String, String> c() {
            return this.availableStatuses;
        }

        @k
        public final Map<String, String> d() {
            return this.currentStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof JobApplicationStatusConfig)) {
                return false;
            }
            JobApplicationStatusConfig jobApplicationStatusConfig = (JobApplicationStatusConfig) obj;
            return L.f(this.currentStatus, jobApplicationStatusConfig.currentStatus) && L.f(this.availableStatuses, jobApplicationStatusConfig.availableStatuses);
        }

        public final int hashCode() {
            return this.availableStatuses.hashCode() + (this.currentStatus.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("JobApplicationStatusConfig(currentStatus=");
            sb2.append(this.currentStatus);
            sb2.append(", availableStatuses=");
            return r.w(sb2, this.availableStatuses, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itI = C0.i(parcel, this.currentStatus);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
            Iterator itI2 = C0.i(parcel, this.availableStatuses);
            while (itI2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
    }

    /* compiled from: JobCrmChangeStatusDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmChangeStatusDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmChangeStatusDeeplink createFromParcel(Parcel parcel) {
            return new JobCrmChangeStatusDeeplink(JobApplicationStatusConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmChangeStatusDeeplink[] newArray(int i12) {
            return new JobCrmChangeStatusDeeplink[i12];
        }
    }

    /* compiled from: JobCrmChangeStatusDeeplink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/change_status/JobCrmChangeStatusDeeplink$b;", "LJu/c$b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f129148b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f129149c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f129150d;

        public b(@k String str, @k String str2, @k String str3) {
            this.f129148b = str;
            this.f129149c = str2;
            this.f129150d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f129148b, bVar.f129148b) && L.f(this.f129149c, bVar.f129149c) && L.f(this.f129150d, bVar.f129150d);
        }

        public final int hashCode() {
            return this.f129150d.hashCode() + H.d(this.f129148b.hashCode() * 31, 31, this.f129149c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StatusChosen(responseId=");
            sb2.append(this.f129148b);
            sb2.append(", oldStatus=");
            sb2.append(this.f129149c);
            sb2.append(", newStatus=");
            return C22026a.c(sb2, this.f129150d, ')');
        }
    }

    public JobCrmChangeStatusDeeplink(@k JobApplicationStatusConfig jobApplicationStatusConfig) {
        this.f129147b = jobApplicationStatusConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f129147b.writeToParcel(parcel, i12);
    }
}
