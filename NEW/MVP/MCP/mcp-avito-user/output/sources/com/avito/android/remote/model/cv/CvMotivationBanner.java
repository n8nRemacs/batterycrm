package com.avito.android.remote.model.cv;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvMotivationBanner.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u0010R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/cv/CvMotivationBanner;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Landroid/net/Uri;", "image1x", "image2x", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Landroid/net/Uri;", "component4", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/cv/CvMotivationBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Landroid/net/Uri;", "getImage1x", "getImage2x", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CvMotivationBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<CvMotivationBanner> CREATOR = new Creator();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deepLink;

    @c("img1xSrc")
    @k
    private final Uri image1x;

    @c("img2xSrc")
    @k
    private final Uri image2x;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: CvMotivationBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CvMotivationBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvMotivationBanner createFromParcel(@k Parcel parcel) {
            return new CvMotivationBanner(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(CvMotivationBanner.class.getClassLoader()), (Uri) parcel.readParcelable(CvMotivationBanner.class.getClassLoader()), (DeepLink) parcel.readParcelable(CvMotivationBanner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CvMotivationBanner[] newArray(int i12) {
            return new CvMotivationBanner[i12];
        }
    }

    public CvMotivationBanner(@k String str, @k String str2, @k Uri uri, @k Uri uri2, @k DeepLink deepLink) {
        this.title = str;
        this.subtitle = str2;
        this.image1x = uri;
        this.image2x = uri2;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ CvMotivationBanner copy$default(CvMotivationBanner cvMotivationBanner, String str, String str2, Uri uri, Uri uri2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cvMotivationBanner.title;
        }
        if ((i12 & 2) != 0) {
            str2 = cvMotivationBanner.subtitle;
        }
        String str3 = str2;
        if ((i12 & 4) != 0) {
            uri = cvMotivationBanner.image1x;
        }
        Uri uri3 = uri;
        if ((i12 & 8) != 0) {
            uri2 = cvMotivationBanner.image2x;
        }
        Uri uri4 = uri2;
        if ((i12 & 16) != 0) {
            deepLink = cvMotivationBanner.deepLink;
        }
        return cvMotivationBanner.copy(str, str3, uri3, uri4, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Uri getImage1x() {
        return this.image1x;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final Uri getImage2x() {
        return this.image2x;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final CvMotivationBanner copy(@k String title, @k String subtitle, @k Uri image1x, @k Uri image2x, @k DeepLink deepLink) {
        return new CvMotivationBanner(title, subtitle, image1x, image2x, deepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvMotivationBanner)) {
            return false;
        }
        CvMotivationBanner cvMotivationBanner = (CvMotivationBanner) other;
        return L.f(this.title, cvMotivationBanner.title) && L.f(this.subtitle, cvMotivationBanner.subtitle) && L.f(this.image1x, cvMotivationBanner.image1x) && L.f(this.image2x, cvMotivationBanner.image2x) && L.f(this.deepLink, cvMotivationBanner.deepLink);
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final Uri getImage1x() {
        return this.image1x;
    }

    @k
    public final Uri getImage2x() {
        return this.image2x;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.deepLink.hashCode() + m.e(this.image2x, m.e(this.image1x, H.d(this.title.hashCode() * 31, 31, this.subtitle), 31), 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CvMotivationBanner(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", image1x=");
        sb2.append(this.image1x);
        sb2.append(", image2x=");
        sb2.append(this.image2x);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.image1x, flags);
        parcel.writeParcelable(this.image2x, flags);
        parcel.writeParcelable(this.deepLink, flags);
    }
}
