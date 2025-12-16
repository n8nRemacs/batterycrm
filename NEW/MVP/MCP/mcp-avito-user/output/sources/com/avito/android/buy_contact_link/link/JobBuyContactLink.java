package com.avito.android.buy_contact_link.link;

import Ju.InterfaceC14247a;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: JobBuyContactLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/buy_contact_link/link/JobBuyContactLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_buy-contact-link_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class JobBuyContactLink extends DeepLink {

    @k
    public static final Parcelable.Creator<JobBuyContactLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f108793b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f108794c;

    /* compiled from: JobBuyContactLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<JobBuyContactLink> {
        @Override // android.os.Parcelable.Creator
        public final JobBuyContactLink createFromParcel(Parcel parcel) {
            return new JobBuyContactLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final JobBuyContactLink[] newArray(int i12) {
            return new JobBuyContactLink[i12];
        }
    }

    /* compiled from: JobBuyContactLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/buy_contact_link/link/JobBuyContactLink$b;", "", "<init>", "()V", "a", "b", "_avito_job_buy-contact-link_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: JobBuyContactLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/buy_contact_link/link/JobBuyContactLink$b$a;", "LJu/a$a;", "_avito_job_buy-contact-link_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14247a.InterfaceC0545a {
            public a() {
                this(null, 1, null);
            }

            public a(Integer num, int i12, C42822w c42822w) {
            }
        }

        /* compiled from: JobBuyContactLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/buy_contact_link/link/JobBuyContactLink$b$b;", "LJu/a$b;", "_avito_job_buy-contact-link_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.buy_contact_link.link.JobBuyContactLink$b$b, reason: collision with other inner class name */
        public static final class C3256b implements InterfaceC14247a.b {
            public C3256b(String str, Integer num, int i12, C42822w c42822w) {
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public JobBuyContactLink(@k String str, @k String str2) {
        this.f108793b = str;
        this.f108794c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f108793b);
        parcel.writeString(this.f108794c);
    }
}
