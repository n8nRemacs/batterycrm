package com.avito.android.ratings;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReviewReply.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ratings/ReviewReply;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ReviewReply implements Parcelable {

    @k
    public static final Parcelable.Creator<ReviewReply> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f250508b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f250509c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f250510d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Image f250511e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f250512f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<TnsGalleryImage> f250513g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f250514h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ReviewReplyStatus f250515i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f250516j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f250517k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final DeepLink f250518l;

    /* compiled from: ReviewReply.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReviewReply> {
        @Override // android.os.Parcelable.Creator
        public final ReviewReply createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(ReviewReply.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ReviewReply.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ReviewReply(lValueOf, string, string2, image, string3, arrayList, parcel.readInt() != 0, parcel.readInt() != 0 ? ReviewReplyStatus.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ReviewReply.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReviewReply[] newArray(int i12) {
            return new ReviewReply[i12];
        }
    }

    public ReviewReply(@l Long l12, @k String str, @k String str2, @l Image image, @k String str3, @l List<TnsGalleryImage> list, boolean z12, @l ReviewReplyStatus reviewReplyStatus, @l String str4, @l String str5, @l DeepLink deepLink) {
        this.f250508b = l12;
        this.f250509c = str;
        this.f250510d = str2;
        this.f250511e = image;
        this.f250512f = str3;
        this.f250513g = list;
        this.f250514h = z12;
        this.f250515i = reviewReplyStatus;
        this.f250516j = str4;
        this.f250517k = str5;
        this.f250518l = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewReply)) {
            return false;
        }
        ReviewReply reviewReply = (ReviewReply) obj;
        return L.f(this.f250508b, reviewReply.f250508b) && L.f(this.f250509c, reviewReply.f250509c) && L.f(this.f250510d, reviewReply.f250510d) && L.f(this.f250511e, reviewReply.f250511e) && L.f(this.f250512f, reviewReply.f250512f) && L.f(this.f250513g, reviewReply.f250513g) && this.f250514h == reviewReply.f250514h && this.f250515i == reviewReply.f250515i && L.f(this.f250516j, reviewReply.f250516j) && L.f(this.f250517k, reviewReply.f250517k) && L.f(this.f250518l, reviewReply.f250518l);
    }

    public final int hashCode() {
        Long l12 = this.f250508b;
        int iD2 = H.d(H.d((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.f250509c), 31, this.f250510d);
        Image image = this.f250511e;
        int iD3 = H.d((iD2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f250512f);
        List<TnsGalleryImage> list = this.f250513g;
        int i12 = r.i((iD3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f250514h);
        ReviewReplyStatus reviewReplyStatus = this.f250515i;
        int iHashCode = (i12 + (reviewReplyStatus == null ? 0 : reviewReplyStatus.hashCode())) * 31;
        String str = this.f250516j;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f250517k;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f250518l;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReviewReply(id=");
        sb2.append(this.f250508b);
        sb2.append(", title=");
        sb2.append(this.f250509c);
        sb2.append(", answerDate=");
        sb2.append(this.f250510d);
        sb2.append(", avatar=");
        sb2.append(this.f250511e);
        sb2.append(", text=");
        sb2.append(this.f250512f);
        sb2.append(", images=");
        sb2.append(this.f250513g);
        sb2.append(", isShop=");
        sb2.append(this.f250514h);
        sb2.append(", status=");
        sb2.append(this.f250515i);
        sb2.append(", statusText=");
        sb2.append(this.f250516j);
        sb2.append(", rejectMessage=");
        sb2.append(this.f250517k);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f250518l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f250508b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f250509c);
        parcel.writeString(this.f250510d);
        parcel.writeParcelable(this.f250511e, i12);
        parcel.writeString(this.f250512f);
        List<TnsGalleryImage> list = this.f250513g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeInt(this.f250514h ? 1 : 0);
        ReviewReplyStatus reviewReplyStatus = this.f250515i;
        if (reviewReplyStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reviewReplyStatus.name());
        }
        parcel.writeString(this.f250516j);
        parcel.writeString(this.f250517k);
        parcel.writeParcelable(this.f250518l, i12);
    }
}
