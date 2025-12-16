package com.avito.android.rating.details.adapter.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.adapter.RatingDetailsItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/text/TextItem;", "Lcom/avito/android/adapter/RatingDetailsItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class TextItem implements RatingDetailsItem {

    @k
    public static final Parcelable.Creator<TextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f246563b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f246564c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f246565d;

    /* compiled from: TextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TextItem> {
        @Override // android.os.Parcelable.Creator
        public final TextItem createFromParcel(Parcel parcel) {
            return new TextItem(parcel.readString(), parcel.readString(), (RatingItemsMarginHorizontal) parcel.readParcelable(TextItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TextItem[] newArray(int i12) {
            return new TextItem[i12];
        }
    }

    public TextItem(@k String str, @k String str2, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        this.f246563b = str;
        this.f246564c = str2;
        this.f246565d = ratingItemsMarginHorizontal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextItem)) {
            return false;
        }
        TextItem textItem = (TextItem) obj;
        return L.f(this.f246563b, textItem.f246563b) && L.f(this.f246564c, textItem.f246564c) && L.f(this.f246565d, textItem.f246565d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF213504f() {
        return this.f246563b;
    }

    public final int hashCode() {
        return this.f246565d.hashCode() + H.d(this.f246563b.hashCode() * 31, 31, this.f246564c);
    }

    @k
    public final String toString() {
        return "TextItem(stringId=" + this.f246563b + ", text=" + this.f246564c + ", marginHorizontal=" + this.f246565d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f246563b);
        parcel.writeString(this.f246564c);
        parcel.writeParcelable(this.f246565d, i12);
    }

    public /* synthetic */ TextItem(String str, String str2, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal);
    }
}
