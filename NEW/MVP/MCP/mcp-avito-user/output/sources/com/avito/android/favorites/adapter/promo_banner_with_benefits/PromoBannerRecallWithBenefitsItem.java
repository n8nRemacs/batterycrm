package com.avito.android.favorites.adapter.promo_banner_with_benefits;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoBannerRecallWithBenefitsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo_banner_with_benefits/PromoBannerRecallWithBenefitsItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoBannerRecallWithBenefitsItem implements FavoriteListItem {

    @Y61.k
    public static final Parcelable.Creator<PromoBannerRecallWithBenefitsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f156715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f156716c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f156717d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f156718e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f156719f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributedText f156720g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalImage f156721h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final UniversalImage f156722i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f156723j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f156724k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<String> f156725l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f156726m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f156727n;

    /* compiled from: PromoBannerRecallWithBenefitsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoBannerRecallWithBenefitsItem> {
        @Override // android.os.Parcelable.Creator
        public final PromoBannerRecallWithBenefitsItem createFromParcel(Parcel parcel) {
            return new PromoBannerRecallWithBenefitsItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PromoBannerRecallWithBenefitsItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(PromoBannerRecallWithBenefitsItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(PromoBannerRecallWithBenefitsItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoBannerRecallWithBenefitsItem[] newArray(int i12) {
            return new PromoBannerRecallWithBenefitsItem[i12];
        }
    }

    public PromoBannerRecallWithBenefitsItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k AttributedText attributedText, @l UniversalImage universalImage, @l UniversalImage universalImage2, @Y61.k String str6, @Y61.k String str7, @Y61.k List<String> list, boolean z12, boolean z13) {
        this.f156715b = str;
        this.f156716c = str2;
        this.f156717d = str3;
        this.f156718e = str4;
        this.f156719f = str5;
        this.f156720g = attributedText;
        this.f156721h = universalImage;
        this.f156722i = universalImage2;
        this.f156723j = str6;
        this.f156724k = str7;
        this.f156725l = list;
        this.f156726m = z12;
        this.f156727n = z13;
    }

    public static PromoBannerRecallWithBenefitsItem a(PromoBannerRecallWithBenefitsItem promoBannerRecallWithBenefitsItem, boolean z12, boolean z13, int i12) {
        String str = promoBannerRecallWithBenefitsItem.f156715b;
        String str2 = promoBannerRecallWithBenefitsItem.f156716c;
        String str3 = promoBannerRecallWithBenefitsItem.f156717d;
        String str4 = promoBannerRecallWithBenefitsItem.f156718e;
        String str5 = promoBannerRecallWithBenefitsItem.f156719f;
        AttributedText attributedText = promoBannerRecallWithBenefitsItem.f156720g;
        UniversalImage universalImage = promoBannerRecallWithBenefitsItem.f156721h;
        UniversalImage universalImage2 = promoBannerRecallWithBenefitsItem.f156722i;
        String str6 = promoBannerRecallWithBenefitsItem.f156723j;
        String str7 = promoBannerRecallWithBenefitsItem.f156724k;
        List<String> list = promoBannerRecallWithBenefitsItem.f156725l;
        boolean z14 = (i12 & 2048) != 0 ? promoBannerRecallWithBenefitsItem.f156726m : z12;
        boolean z15 = (i12 & 4096) != 0 ? promoBannerRecallWithBenefitsItem.f156727n : z13;
        promoBannerRecallWithBenefitsItem.getClass();
        return new PromoBannerRecallWithBenefitsItem(str, str2, str3, str4, str5, attributedText, universalImage, universalImage2, str6, str7, list, z14, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoBannerRecallWithBenefitsItem)) {
            return false;
        }
        PromoBannerRecallWithBenefitsItem promoBannerRecallWithBenefitsItem = (PromoBannerRecallWithBenefitsItem) obj;
        return L.f(this.f156715b, promoBannerRecallWithBenefitsItem.f156715b) && L.f(this.f156716c, promoBannerRecallWithBenefitsItem.f156716c) && L.f(this.f156717d, promoBannerRecallWithBenefitsItem.f156717d) && L.f(this.f156718e, promoBannerRecallWithBenefitsItem.f156718e) && L.f(this.f156719f, promoBannerRecallWithBenefitsItem.f156719f) && L.f(this.f156720g, promoBannerRecallWithBenefitsItem.f156720g) && L.f(this.f156721h, promoBannerRecallWithBenefitsItem.f156721h) && L.f(this.f156722i, promoBannerRecallWithBenefitsItem.f156722i) && L.f(this.f156723j, promoBannerRecallWithBenefitsItem.f156723j) && L.f(this.f156724k, promoBannerRecallWithBenefitsItem.f156724k) && L.f(this.f156725l, promoBannerRecallWithBenefitsItem.f156725l) && this.f156726m == promoBannerRecallWithBenefitsItem.f156726m && this.f156727n == promoBannerRecallWithBenefitsItem.f156727n;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF100641b() {
        return this.f156715b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(H.d(H.d(H.d(this.f156715b.hashCode() * 31, 31, this.f156716c), 31, this.f156717d), 31, this.f156718e), 31, this.f156719f), 31, this.f156720g);
        UniversalImage universalImage = this.f156721h;
        int iHashCode = (iB2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.f156722i;
        return Boolean.hashCode(this.f156727n) + r.i(H.e(H.d(H.d((iHashCode + (universalImage2 != null ? universalImage2.hashCode() : 0)) * 31, 31, this.f156723j), 31, this.f156724k), 31, this.f156725l), 31, this.f156726m);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoBannerRecallWithBenefitsItem(stringId=");
        sb2.append(this.f156715b);
        sb2.append(", title=");
        sb2.append(this.f156716c);
        sb2.append(", description=");
        sb2.append(this.f156717d);
        sb2.append(", buttonText=");
        sb2.append(this.f156718e);
        sb2.append(", inputTitle=");
        sb2.append(this.f156719f);
        sb2.append(", disclaimer=");
        sb2.append(this.f156720g);
        sb2.append(", leftImage=");
        sb2.append(this.f156721h);
        sb2.append(", rightImage=");
        sb2.append(this.f156722i);
        sb2.append(", leftText=");
        sb2.append(this.f156723j);
        sb2.append(", rightText=");
        sb2.append(this.f156724k);
        sb2.append(", closeItems=");
        sb2.append(this.f156725l);
        sb2.append(", needToUseConfirmationToClose=");
        sb2.append(this.f156726m);
        sb2.append(", closed=");
        return r.x(sb2, this.f156727n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156715b);
        parcel.writeString(this.f156716c);
        parcel.writeString(this.f156717d);
        parcel.writeString(this.f156718e);
        parcel.writeString(this.f156719f);
        parcel.writeParcelable(this.f156720g, i12);
        parcel.writeParcelable(this.f156721h, i12);
        parcel.writeParcelable(this.f156722i, i12);
        parcel.writeString(this.f156723j);
        parcel.writeString(this.f156724k);
        parcel.writeStringList(this.f156725l);
        parcel.writeInt(this.f156726m ? 1 : 0);
        parcel.writeInt(this.f156727n ? 1 : 0);
    }

    public /* synthetic */ PromoBannerRecallWithBenefitsItem(String str, String str2, String str3, String str4, String str5, AttributedText attributedText, UniversalImage universalImage, UniversalImage universalImage2, String str6, String str7, List list, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, attributedText, universalImage, universalImage2, str6, str7, list, (i12 & 2048) != 0 ? true : z12, (i12 & 4096) != 0 ? false : z13);
    }
}
