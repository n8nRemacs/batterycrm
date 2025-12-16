package com.avito.android.rating.details.adapter.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.adapter.RatingDetailsItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/button/ButtonItem;", "Lcom/avito/android/adapter/RatingDetailsItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ButtonItem implements RatingDetailsItem {

    @k
    public static final Parcelable.Creator<ButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f246493b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f246494c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f246495d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f246496e;

    /* compiled from: ButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ButtonItem createFromParcel(Parcel parcel) {
            return new ButtonItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ButtonItem.class.getClassLoader()), (RatingItemsMarginHorizontal) parcel.readParcelable(ButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonItem[] newArray(int i12) {
            return new ButtonItem[i12];
        }
    }

    public ButtonItem(@k String str, @k String str2, @k DeepLink deepLink, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        this.f246493b = str;
        this.f246494c = str2;
        this.f246495d = deepLink;
        this.f246496e = ratingItemsMarginHorizontal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonItem)) {
            return false;
        }
        ButtonItem buttonItem = (ButtonItem) obj;
        return L.f(this.f246493b, buttonItem.f246493b) && L.f(this.f246494c, buttonItem.f246494c) && L.f(this.f246495d, buttonItem.f246495d) && L.f(this.f246496e, buttonItem.f246496e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF246478b() {
        return this.f246493b;
    }

    public final int hashCode() {
        return this.f246496e.hashCode() + com.avito.android.actions_sheet.a.e(this.f246495d, H.d(this.f246493b.hashCode() * 31, 31, this.f246494c), 31);
    }

    @k
    public final String toString() {
        return "ButtonItem(stringId=" + this.f246493b + ", title=" + this.f246494c + ", deepLink=" + this.f246495d + ", marginHorizontal=" + this.f246496e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f246493b);
        parcel.writeString(this.f246494c);
        parcel.writeParcelable(this.f246495d, i12);
        parcel.writeParcelable(this.f246496e, i12);
    }

    public /* synthetic */ ButtonItem(String str, String str2, DeepLink deepLink, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, C42822w c42822w) {
        this(str, str2, deepLink, (i12 & 8) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal);
    }
}
