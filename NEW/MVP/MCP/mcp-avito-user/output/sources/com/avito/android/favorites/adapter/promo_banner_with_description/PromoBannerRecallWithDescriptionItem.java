package com.avito.android.favorites.adapter.promo_banner_with_description;

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

/* compiled from: PromoBannerRecallWithDescriptionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo_banner_with_description/PromoBannerRecallWithDescriptionItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoBannerRecallWithDescriptionItem implements FavoriteListItem {

    @Y61.k
    public static final Parcelable.Creator<PromoBannerRecallWithDescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f156760b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f156761c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f156762d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f156763e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f156764f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributedText f156765g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalImage f156766h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final List<String> f156767i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f156768j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f156769k;

    /* compiled from: PromoBannerRecallWithDescriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoBannerRecallWithDescriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final PromoBannerRecallWithDescriptionItem createFromParcel(Parcel parcel) {
            return new PromoBannerRecallWithDescriptionItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PromoBannerRecallWithDescriptionItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(PromoBannerRecallWithDescriptionItem.class.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoBannerRecallWithDescriptionItem[] newArray(int i12) {
            return new PromoBannerRecallWithDescriptionItem[i12];
        }
    }

    public PromoBannerRecallWithDescriptionItem(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k AttributedText attributedText, @l UniversalImage universalImage, @Y61.k List<String> list, boolean z12, boolean z13) {
        this.f156760b = str;
        this.f156761c = str2;
        this.f156762d = str3;
        this.f156763e = str4;
        this.f156764f = str5;
        this.f156765g = attributedText;
        this.f156766h = universalImage;
        this.f156767i = list;
        this.f156768j = z12;
        this.f156769k = z13;
    }

    public static PromoBannerRecallWithDescriptionItem a(PromoBannerRecallWithDescriptionItem promoBannerRecallWithDescriptionItem, boolean z12, boolean z13, int i12) {
        String str = promoBannerRecallWithDescriptionItem.f156760b;
        String str2 = promoBannerRecallWithDescriptionItem.f156761c;
        String str3 = promoBannerRecallWithDescriptionItem.f156762d;
        String str4 = promoBannerRecallWithDescriptionItem.f156763e;
        String str5 = promoBannerRecallWithDescriptionItem.f156764f;
        AttributedText attributedText = promoBannerRecallWithDescriptionItem.f156765g;
        UniversalImage universalImage = promoBannerRecallWithDescriptionItem.f156766h;
        List<String> list = promoBannerRecallWithDescriptionItem.f156767i;
        if ((i12 & 256) != 0) {
            z12 = promoBannerRecallWithDescriptionItem.f156768j;
        }
        boolean z14 = z12;
        if ((i12 & 512) != 0) {
            z13 = promoBannerRecallWithDescriptionItem.f156769k;
        }
        promoBannerRecallWithDescriptionItem.getClass();
        return new PromoBannerRecallWithDescriptionItem(str, str2, str3, str4, str5, attributedText, universalImage, list, z14, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoBannerRecallWithDescriptionItem)) {
            return false;
        }
        PromoBannerRecallWithDescriptionItem promoBannerRecallWithDescriptionItem = (PromoBannerRecallWithDescriptionItem) obj;
        return L.f(this.f156760b, promoBannerRecallWithDescriptionItem.f156760b) && L.f(this.f156761c, promoBannerRecallWithDescriptionItem.f156761c) && L.f(this.f156762d, promoBannerRecallWithDescriptionItem.f156762d) && L.f(this.f156763e, promoBannerRecallWithDescriptionItem.f156763e) && L.f(this.f156764f, promoBannerRecallWithDescriptionItem.f156764f) && L.f(this.f156765g, promoBannerRecallWithDescriptionItem.f156765g) && L.f(this.f156766h, promoBannerRecallWithDescriptionItem.f156766h) && L.f(this.f156767i, promoBannerRecallWithDescriptionItem.f156767i) && this.f156768j == promoBannerRecallWithDescriptionItem.f156768j && this.f156769k == promoBannerRecallWithDescriptionItem.f156769k;
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
        return this.f156760b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(H.d(H.d(H.d(H.d(this.f156760b.hashCode() * 31, 31, this.f156761c), 31, this.f156762d), 31, this.f156763e), 31, this.f156764f), 31, this.f156765g);
        UniversalImage universalImage = this.f156766h;
        return Boolean.hashCode(this.f156769k) + r.i(H.e((iB2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f156767i), 31, this.f156768j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoBannerRecallWithDescriptionItem(stringId=");
        sb2.append(this.f156760b);
        sb2.append(", title=");
        sb2.append(this.f156761c);
        sb2.append(", description=");
        sb2.append(this.f156762d);
        sb2.append(", buttonText=");
        sb2.append(this.f156763e);
        sb2.append(", inputTitle=");
        sb2.append(this.f156764f);
        sb2.append(", disclaimer=");
        sb2.append(this.f156765g);
        sb2.append(", backgroundImage=");
        sb2.append(this.f156766h);
        sb2.append(", closeItems=");
        sb2.append(this.f156767i);
        sb2.append(", needToUseConfirmationToClose=");
        sb2.append(this.f156768j);
        sb2.append(", closed=");
        return r.x(sb2, this.f156769k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156760b);
        parcel.writeString(this.f156761c);
        parcel.writeString(this.f156762d);
        parcel.writeString(this.f156763e);
        parcel.writeString(this.f156764f);
        parcel.writeParcelable(this.f156765g, i12);
        parcel.writeParcelable(this.f156766h, i12);
        parcel.writeStringList(this.f156767i);
        parcel.writeInt(this.f156768j ? 1 : 0);
        parcel.writeInt(this.f156769k ? 1 : 0);
    }

    public /* synthetic */ PromoBannerRecallWithDescriptionItem(String str, String str2, String str3, String str4, String str5, AttributedText attributedText, UniversalImage universalImage, List list, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, attributedText, universalImage, list, (i12 & 256) != 0 ? true : z12, (i12 & 512) != 0 ? false : z13);
    }
}
