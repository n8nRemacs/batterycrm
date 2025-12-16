package com.avito.android.rating_form.info;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormInfoArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/info/RatingFormInfoArguments;", "Landroid/os/Parcelable;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingFormInfoArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingFormInfoArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f248147b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f248148c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f248149d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f248150e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f248151f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f248152g;

    /* compiled from: RatingFormInfoArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingFormInfoArguments> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormInfoArguments createFromParcel(Parcel parcel) {
            return new RatingFormInfoArguments((DeepLink) parcel.readParcelable(RatingFormInfoArguments.class.getClassLoader()), (UniversalImage) parcel.readParcelable(RatingFormInfoArguments.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormInfoArguments[] newArray(int i12) {
            return new RatingFormInfoArguments[i12];
        }
    }

    public RatingFormInfoArguments(@l DeepLink deepLink, @l UniversalImage universalImage, @k String str, @l String str2, @l String str3, @l String str4) {
        this.f248147b = str;
        this.f248148c = str2;
        this.f248149d = str3;
        this.f248150e = deepLink;
        this.f248151f = universalImage;
        this.f248152g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingFormInfoArguments)) {
            return false;
        }
        RatingFormInfoArguments ratingFormInfoArguments = (RatingFormInfoArguments) obj;
        return L.f(this.f248147b, ratingFormInfoArguments.f248147b) && L.f(this.f248148c, ratingFormInfoArguments.f248148c) && L.f(this.f248149d, ratingFormInfoArguments.f248149d) && L.f(this.f248150e, ratingFormInfoArguments.f248150e) && L.f(this.f248151f, ratingFormInfoArguments.f248151f) && L.f(this.f248152g, ratingFormInfoArguments.f248152g);
    }

    public final int hashCode() {
        int iHashCode = this.f248147b.hashCode() * 31;
        String str = this.f248148c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248149d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f248150e;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f248151f;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str3 = this.f248152g;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingFormInfoArguments(title=");
        sb2.append(this.f248147b);
        sb2.append(", message=");
        sb2.append(this.f248148c);
        sb2.append(", buttonText=");
        sb2.append(this.f248149d);
        sb2.append(", buttonUrl=");
        sb2.append(this.f248150e);
        sb2.append(", image=");
        sb2.append(this.f248151f);
        sb2.append(", publishedRatingUserKey=");
        return C22026a.c(sb2, this.f248152g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f248147b);
        parcel.writeString(this.f248148c);
        parcel.writeString(this.f248149d);
        parcel.writeParcelable(this.f248150e, i12);
        parcel.writeParcelable(this.f248151f, i12);
        parcel.writeString(this.f248152g);
    }

    public /* synthetic */ RatingFormInfoArguments(String str, String str2, String str3, DeepLink deepLink, UniversalImage universalImage, String str4, int i12, C42822w c42822w) {
        this(deepLink, universalImage, str, str2, str3, (i12 & 32) != 0 ? null : str4);
    }
}
