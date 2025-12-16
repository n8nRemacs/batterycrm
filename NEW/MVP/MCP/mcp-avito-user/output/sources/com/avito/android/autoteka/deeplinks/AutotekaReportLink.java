package com.avito.android.autoteka.deeplinks;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: AutotekaReportLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaReportLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AutotekaReportLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<AutotekaReportLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ReportDetails f96234b;

    /* compiled from: AutotekaReportLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaReportLink> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaReportLink createFromParcel(Parcel parcel) {
            return new AutotekaReportLink(ReportDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaReportLink[] newArray(int i12) {
            return new AutotekaReportLink[i12];
        }
    }

    /* compiled from: AutotekaReportLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/AutotekaReportLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {
        static {
            new b();
        }
    }

    public AutotekaReportLink(@k ReportDetails reportDetails) {
        this.f96234b = reportDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AutotekaReportLink) && L.f(this.f96234b, ((AutotekaReportLink) obj).f96234b);
    }

    public final int hashCode() {
        return this.f96234b.hashCode();
    }

    @k
    public final String toString() {
        return "AutotekaReportLink(details=" + this.f96234b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f96234b.writeToParcel(parcel, i12);
    }
}
