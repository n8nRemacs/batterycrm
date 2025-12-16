package com.avito.android.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: JobApplyCreateLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink/JobApplyCreateLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_apply-only-with-cv_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class JobApplyCreateLink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobApplyCreateLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f134079b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CreateChannelLink f134080c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f134081d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f134082e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f134083f;

    /* compiled from: JobApplyCreateLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobApplyCreateLink> {
        @Override // android.os.Parcelable.Creator
        public final JobApplyCreateLink createFromParcel(Parcel parcel) {
            return new JobApplyCreateLink(parcel.readString(), (CreateChannelLink) parcel.readParcelable(JobApplyCreateLink.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobApplyCreateLink[] newArray(int i12) {
            return new JobApplyCreateLink[i12];
        }
    }

    /* compiled from: JobApplyCreateLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deeplink/JobApplyCreateLink$b;", "", "<init>", "()V", "a", "b", "_avito_job_apply-only-with-cv_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: JobApplyCreateLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink/JobApplyCreateLink$b$a;", "LJu/c$b;", "_avito_job_apply-only-with-cv_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CreateChannelLink f134084b;

            public a(@k CreateChannelLink createChannelLink) {
                this.f134084b = createChannelLink;
            }
        }

        /* compiled from: JobApplyCreateLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deeplink/JobApplyCreateLink$b$b;", "LJu/c$b;", "_avito_job_apply-only-with-cv_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deeplink.JobApplyCreateLink$b$b, reason: collision with other inner class name */
        public static final class C4032b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CvValidationLink f134085b;

            public C4032b(@k CvValidationLink cvValidationLink) {
                this.f134085b = cvValidationLink;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ JobApplyCreateLink(String str, CreateChannelLink createChannelLink, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, createChannelLink, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f134079b);
        parcel.writeParcelable(this.f134080c, i12);
        parcel.writeString(this.f134081d);
        parcel.writeString(this.f134082e);
        parcel.writeString(this.f134083f);
    }

    public JobApplyCreateLink(@k String str, @k CreateChannelLink createChannelLink, @k String str2, @l String str3, @l String str4) {
        this.f134079b = str;
        this.f134080c = createChannelLink;
        this.f134081d = str2;
        this.f134082e = str3;
        this.f134083f = str4;
    }
}
