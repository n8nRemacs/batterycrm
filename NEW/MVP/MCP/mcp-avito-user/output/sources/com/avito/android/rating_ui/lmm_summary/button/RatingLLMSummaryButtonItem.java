package com.avito.android.rating_ui.lmm_summary.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingLLMSummaryButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/lmm_summary/button/RatingLLMSummaryButtonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingLLMSummaryButtonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<RatingLLMSummaryButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250076b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f250077c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f250078d;

    /* compiled from: RatingLLMSummaryButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingLLMSummaryButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final RatingLLMSummaryButtonItem createFromParcel(Parcel parcel) {
            return new RatingLLMSummaryButtonItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(RatingLLMSummaryButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RatingLLMSummaryButtonItem[] newArray(int i12) {
            return new RatingLLMSummaryButtonItem[i12];
        }
    }

    public RatingLLMSummaryButtonItem(@k String str, @k String str2, @k DeepLink deepLink) {
        this.f250076b = str;
        this.f250077c = str2;
        this.f250078d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingLLMSummaryButtonItem)) {
            return false;
        }
        RatingLLMSummaryButtonItem ratingLLMSummaryButtonItem = (RatingLLMSummaryButtonItem) obj;
        return L.f(this.f250076b, ratingLLMSummaryButtonItem.f250076b) && L.f(this.f250077c, ratingLLMSummaryButtonItem.f250077c) && L.f(this.f250078d, ratingLLMSummaryButtonItem.f250078d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186614b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF185996b() {
        return this.f250076b;
    }

    public final int hashCode() {
        return this.f250078d.hashCode() + H.d(this.f250076b.hashCode() * 31, 31, this.f250077c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingLLMSummaryButtonItem(stringId=");
        sb2.append(this.f250076b);
        sb2.append(", title=");
        sb2.append(this.f250077c);
        sb2.append(", action=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f250078d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250076b);
        parcel.writeString(this.f250077c);
        parcel.writeParcelable(this.f250078d, i12);
    }
}
