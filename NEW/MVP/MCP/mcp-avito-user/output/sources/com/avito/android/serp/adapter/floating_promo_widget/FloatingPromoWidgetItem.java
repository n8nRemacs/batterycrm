package com.avito.android.serp.adapter.floating_promo_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FloatingPromoWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/floating_promo_widget/FloatingPromoWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FloatingPromoWidgetItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<FloatingPromoWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f269976b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f269977c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f269978d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f269979e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f269980f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DeepLink f269981g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f269982h;

    /* renamed from: i, reason: collision with root package name */
    public final int f269983i;

    /* compiled from: FloatingPromoWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FloatingPromoWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final FloatingPromoWidgetItem createFromParcel(Parcel parcel) {
            return new FloatingPromoWidgetItem(parcel.readString(), (AttributedText) parcel.readParcelable(FloatingPromoWidgetItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(FloatingPromoWidgetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(FloatingPromoWidgetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(FloatingPromoWidgetItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(FloatingPromoWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FloatingPromoWidgetItem[] newArray(int i12) {
            return new FloatingPromoWidgetItem[i12];
        }
    }

    public FloatingPromoWidgetItem(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k UniversalImage universalImage, @Y61.l UniversalImage universalImage2, @Y61.k DeepLink deepLink) {
        this.f269976b = str;
        this.f269977c = attributedText;
        this.f269978d = attributedText2;
        this.f269979e = universalImage;
        this.f269980f = universalImage2;
        this.f269981g = deepLink;
        this.f269982h = SerpViewType.f268585e;
        this.f269983i = 6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatingPromoWidgetItem)) {
            return false;
        }
        FloatingPromoWidgetItem floatingPromoWidgetItem = (FloatingPromoWidgetItem) obj;
        return L.f(this.f269976b, floatingPromoWidgetItem.f269976b) && L.f(this.f269977c, floatingPromoWidgetItem.f269977c) && L.f(this.f269978d, floatingPromoWidgetItem.f269978d) && L.f(this.f269979e, floatingPromoWidgetItem.f269979e) && L.f(this.f269980f, floatingPromoWidgetItem.f269980f) && L.f(this.f269981g, floatingPromoWidgetItem.f269981g);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF270317l() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF94264b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270316k() {
        return this.f269983i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270307b() {
        return this.f269976b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270315j() {
        return this.f269982h;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f269976b.hashCode() * 31, 31, this.f269977c);
        AttributedText attributedText = this.f269978d;
        int iA2 = com.avito.android.actions_sheet.a.a((iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f269979e);
        UniversalImage universalImage = this.f269980f;
        return this.f269981g.hashCode() + ((iA2 + (universalImage != null ? universalImage.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FloatingPromoWidgetItem(stringId=");
        sb2.append(this.f269976b);
        sb2.append(", title=");
        sb2.append(this.f269977c);
        sb2.append(", text=");
        sb2.append(this.f269978d);
        sb2.append(", backgroundImage=");
        sb2.append(this.f269979e);
        sb2.append(", image=");
        sb2.append(this.f269980f);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f269981g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f269976b);
        parcel.writeParcelable(this.f269977c, i12);
        parcel.writeParcelable(this.f269978d, i12);
        parcel.writeParcelable(this.f269979e, i12);
        parcel.writeParcelable(this.f269980f, i12);
        parcel.writeParcelable(this.f269981g, i12);
    }

    public /* synthetic */ FloatingPromoWidgetItem(String str, AttributedText attributedText, AttributedText attributedText2, UniversalImage universalImage, UniversalImage universalImage2, DeepLink deepLink, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "floating_promo_widget_item_id" : str, attributedText, attributedText2, universalImage, universalImage2, deepLink);
    }
}
