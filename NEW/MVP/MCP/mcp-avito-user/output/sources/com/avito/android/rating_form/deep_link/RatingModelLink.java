package com.avito.android.rating_form.deep_link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: RatingModelLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/deep_link/RatingModelLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_rating-form_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final /* data */ class RatingModelLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RatingModelLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f248044b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f248045c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f248046d;

    /* renamed from: e, reason: collision with root package name */
    public final int f248047e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f248048f;

    /* compiled from: RatingModelLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingModelLink> {
        @Override // android.os.Parcelable.Creator
        public final RatingModelLink createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            return new RatingModelLink(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), string, string2, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingModelLink[] newArray(int i12) {
            return new RatingModelLink[i12];
        }
    }

    public RatingModelLink(int i12, @l Integer num, @l String str, @l String str2, boolean z12) {
        this.f248044b = str;
        this.f248045c = str2;
        this.f248046d = num;
        this.f248047e = i12;
        this.f248048f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingModelLink)) {
            return false;
        }
        RatingModelLink ratingModelLink = (RatingModelLink) obj;
        return L.f(this.f248044b, ratingModelLink.f248044b) && L.f(this.f248045c, ratingModelLink.f248045c) && L.f(this.f248046d, ratingModelLink.f248046d) && this.f248047e == ratingModelLink.f248047e && this.f248048f == ratingModelLink.f248048f;
    }

    public final int hashCode() {
        String str = this.f248044b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f248045c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f248046d;
        return Boolean.hashCode(this.f248048f) + r.e(this.f248047e, (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingModelLink(pageFrom=");
        sb2.append(this.f248044b);
        sb2.append(", modelPath=");
        sb2.append(this.f248045c);
        sb2.append(", catalogId=");
        sb2.append(this.f248046d);
        sb2.append(", categoryId=");
        sb2.append(this.f248047e);
        sb2.append(", fromPush=");
        return r.x(sb2, this.f248048f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f248044b);
        parcel.writeString(this.f248045c);
        Integer num = this.f248046d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f248047e);
        parcel.writeInt(this.f248048f ? 1 : 0);
    }
}
