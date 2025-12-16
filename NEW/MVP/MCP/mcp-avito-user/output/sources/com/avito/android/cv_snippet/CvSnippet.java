package com.avito.android.cv_snippet;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.cv.CvStats;
import com.avito.android.remote.model.cv.CvStatus;
import kotlin.Metadata;

/* compiled from: CvSnippet.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cv_snippet/CvSnippet;", "Landroid/os/Parcelable;", "Lcom/avito/conveyor_item/a;", "_avito_job_cv-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CvSnippet implements Parcelable, com.avito.conveyor_item.a {

    @k
    public static final Parcelable.Creator<CvSnippet> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f131592b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f131593c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f131594d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f131595e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final SerpBadgeBar f131596f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f131597g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final CvStats f131598h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final CvStatus f131599i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final CvStatus f131600j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final DeepLink f131601k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final DeepLink f131602l;

    /* compiled from: CvSnippet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvSnippet> {
        @Override // android.os.Parcelable.Creator
        public final CvSnippet createFromParcel(Parcel parcel) {
            return new CvSnippet(parcel.readString(), (Image) parcel.readParcelable(CvSnippet.class.getClassLoader()), parcel.readString(), parcel.readString(), (SerpBadgeBar) parcel.readParcelable(CvSnippet.class.getClassLoader()), parcel.readString(), (CvStats) parcel.readParcelable(CvSnippet.class.getClassLoader()), (CvStatus) parcel.readParcelable(CvSnippet.class.getClassLoader()), (CvStatus) parcel.readParcelable(CvSnippet.class.getClassLoader()), (DeepLink) parcel.readParcelable(CvSnippet.class.getClassLoader()), (DeepLink) parcel.readParcelable(CvSnippet.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvSnippet[] newArray(int i12) {
            return new CvSnippet[i12];
        }
    }

    public CvSnippet(@k String str, @l Image image, @k String str2, @k String str3, @l SerpBadgeBar serpBadgeBar, @l String str4, @l CvStats cvStats, @l CvStatus cvStatus, @l CvStatus cvStatus2, @k DeepLink deepLink, @l DeepLink deepLink2) {
        this.f131592b = str;
        this.f131593c = image;
        this.f131594d = str2;
        this.f131595e = str3;
        this.f131596f = serpBadgeBar;
        this.f131597g = str4;
        this.f131598h = cvStats;
        this.f131599i = cvStatus;
        this.f131600j = cvStatus2;
        this.f131601k = deepLink;
        this.f131602l = deepLink2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return getF131592b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF131592b() {
        return this.f131592b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f131592b);
        parcel.writeParcelable(this.f131593c, i12);
        parcel.writeString(this.f131594d);
        parcel.writeString(this.f131595e);
        parcel.writeParcelable(this.f131596f, i12);
        parcel.writeString(this.f131597g);
        parcel.writeParcelable(this.f131598h, i12);
        parcel.writeParcelable(this.f131599i, i12);
        parcel.writeParcelable(this.f131600j, i12);
        parcel.writeParcelable(this.f131601k, i12);
        parcel.writeParcelable(this.f131602l, i12);
    }
}
