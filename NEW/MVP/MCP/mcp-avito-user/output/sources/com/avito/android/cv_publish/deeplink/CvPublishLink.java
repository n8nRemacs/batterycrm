package com.avito.android.cv_publish.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CvPublishLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_publish/deeplink/CvPublishLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_job_cv-publish_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class CvPublishLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<CvPublishLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f131590b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f131591c;

    /* compiled from: CvPublishLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvPublishLink> {
        @Override // android.os.Parcelable.Creator
        public final CvPublishLink createFromParcel(Parcel parcel) {
            return new CvPublishLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CvPublishLink[] newArray(int i12) {
            return new CvPublishLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CvPublishLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f131590b);
        parcel.writeString(this.f131591c);
    }

    public /* synthetic */ CvPublishLink(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }

    public CvPublishLink(@l String str, @l String str2) {
        this.f131590b = str;
        this.f131591c = str2;
    }
}
