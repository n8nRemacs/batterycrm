package com.avito.android.rating.details.adapter.action;

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

/* compiled from: ActionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/adapter/action/ActionItem;", "Lcom/avito/android/adapter/RatingDetailsItem;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ActionItem implements RatingDetailsItem {

    @k
    public static final Parcelable.Creator<ActionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f246478b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f246479c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f246480d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RatingItemsMarginHorizontal f246481e;

    /* compiled from: ActionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionItem> {
        @Override // android.os.Parcelable.Creator
        public final ActionItem createFromParcel(Parcel parcel) {
            return new ActionItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ActionItem.class.getClassLoader()), (RatingItemsMarginHorizontal) parcel.readParcelable(ActionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActionItem[] newArray(int i12) {
            return new ActionItem[i12];
        }
    }

    public ActionItem(@k String str, @k String str2, @k DeepLink deepLink, @k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        this.f246478b = str;
        this.f246479c = str2;
        this.f246480d = deepLink;
        this.f246481e = ratingItemsMarginHorizontal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionItem)) {
            return false;
        }
        ActionItem actionItem = (ActionItem) obj;
        return L.f(this.f246478b, actionItem.f246478b) && L.f(this.f246479c, actionItem.f246479c) && L.f(this.f246480d, actionItem.f246480d) && L.f(this.f246481e, actionItem.f246481e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145140b() {
        return this.f246478b;
    }

    public final int hashCode() {
        return this.f246481e.hashCode() + com.avito.android.actions_sheet.a.e(this.f246480d, H.d(this.f246478b.hashCode() * 31, 31, this.f246479c), 31);
    }

    @k
    public final String toString() {
        return "ActionItem(stringId=" + this.f246478b + ", title=" + this.f246479c + ", deepLink=" + this.f246480d + ", marginHorizontal=" + this.f246481e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f246478b);
        parcel.writeString(this.f246479c);
        parcel.writeParcelable(this.f246480d, i12);
        parcel.writeParcelable(this.f246481e, i12);
    }

    public /* synthetic */ ActionItem(String str, String str2, DeepLink deepLink, RatingItemsMarginHorizontal ratingItemsMarginHorizontal, int i12, C42822w c42822w) {
        this(str, str2, deepLink, (i12 & 8) != 0 ? RatingItemsMarginHorizontal.MarginLarge.f249853b : ratingItemsMarginHorizontal);
    }
}
