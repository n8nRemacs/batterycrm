package com.avito.android.crm_candidates.deeplink.notes;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.crm_candidates.view.list_items.applications_list.application_item.JobCrmApplicationItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: JobCrmNotesDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/notes/JobCrmNotesDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class JobCrmNotesDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobCrmNotesDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f129170b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f129171c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f129172d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f129173e;

    /* compiled from: JobCrmNotesDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCrmNotesDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final JobCrmNotesDeeplink createFromParcel(Parcel parcel) {
            return new JobCrmNotesDeeplink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCrmNotesDeeplink[] newArray(int i12) {
            return new JobCrmNotesDeeplink[i12];
        }
    }

    /* compiled from: JobCrmNotesDeeplink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/notes/JobCrmNotesDeeplink$b;", "LJu/c$b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final JobCrmApplicationItem f129174b;

        public b(@k JobCrmApplicationItem jobCrmApplicationItem) {
            this.f129174b = jobCrmApplicationItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f129174b, ((b) obj).f129174b);
        }

        public final int hashCode() {
            return this.f129174b.hashCode();
        }

        @k
        public final String toString() {
            return "NoteUpdated(item=" + this.f129174b + ')';
        }
    }

    public JobCrmNotesDeeplink(@k String str, @k String str2, @l String str3, @l String str4) {
        this.f129170b = str;
        this.f129171c = str2;
        this.f129172d = str3;
        this.f129173e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f129170b);
        parcel.writeString(this.f129171c);
        parcel.writeString(this.f129172d);
        parcel.writeString(this.f129173e);
    }
}
