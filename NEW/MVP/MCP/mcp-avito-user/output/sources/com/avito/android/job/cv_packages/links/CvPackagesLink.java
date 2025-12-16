package com.avito.android.job.cv_packages.links;

import Ju.InterfaceC14247a;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CvPackagesLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/job/cv_packages/links/CvPackagesLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_cv-packages_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class CvPackagesLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CvPackagesLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174421b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f174422c;

    /* compiled from: CvPackagesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvPackagesLink> {
        @Override // android.os.Parcelable.Creator
        public final CvPackagesLink createFromParcel(Parcel parcel) {
            return new CvPackagesLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CvPackagesLink[] newArray(int i12) {
            return new CvPackagesLink[i12];
        }
    }

    /* compiled from: CvPackagesLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/job/cv_packages/links/CvPackagesLink$b;", "", "<init>", "()V", "a", "b", "_avito_job_cv-packages_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CvPackagesLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/job/cv_packages/links/CvPackagesLink$b$a;", "LJu/a$a;", "<init>", "()V", "_avito_job_cv-packages_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f174423b = new a();
        }

        /* compiled from: CvPackagesLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/job/cv_packages/links/CvPackagesLink$b$b;", "LJu/a$b;", "_avito_job_cv-packages_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.job.cv_packages.links.CvPackagesLink$b$b, reason: collision with other inner class name */
        public static final class C5141b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            public final boolean f174424b;

            public C5141b(boolean z12) {
                this.f174424b = z12;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ CvPackagesLink(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f174421b);
        parcel.writeString(this.f174422c);
    }

    public CvPackagesLink(@k String str, @l String str2) {
        this.f174421b = str;
        this.f174422c = str2;
    }
}
