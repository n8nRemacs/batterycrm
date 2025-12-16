package com.avito.android.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: JobCvUploadLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink/JobCvUploadLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_cv-upload_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class JobCvUploadLink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobCvUploadLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f134086b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f134087c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f134088d;

    /* compiled from: JobCvUploadLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobCvUploadLink> {
        @Override // android.os.Parcelable.Creator
        public final JobCvUploadLink createFromParcel(Parcel parcel) {
            return new JobCvUploadLink(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobCvUploadLink[] newArray(int i12) {
            return new JobCvUploadLink[i12];
        }
    }

    public /* synthetic */ JobCvUploadLink(String str, boolean z12, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? "" : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JobCvUploadLink)) {
            return false;
        }
        JobCvUploadLink jobCvUploadLink = (JobCvUploadLink) obj;
        return L.f(this.f134086b, jobCvUploadLink.f134086b) && this.f134087c == jobCvUploadLink.f134087c && L.f(this.f134088d, jobCvUploadLink.f134088d);
    }

    public final int hashCode() {
        int i12 = r.i(this.f134086b.hashCode() * 31, 31, this.f134087c);
        String str = this.f134088d;
        return i12 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JobCvUploadLink(fromPage=");
        sb2.append(this.f134086b);
        sb2.append(", shouldShowCvPicker=");
        sb2.append(this.f134087c);
        sb2.append(", cvPickerHint=");
        return C22026a.c(sb2, this.f134088d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f134086b);
        parcel.writeInt(this.f134087c ? 1 : 0);
        parcel.writeString(this.f134088d);
    }

    public JobCvUploadLink(@k String str, boolean z12, @l String str2) {
        this.f134086b = str;
        this.f134087c = z12;
        this.f134088d = str2;
    }
}
