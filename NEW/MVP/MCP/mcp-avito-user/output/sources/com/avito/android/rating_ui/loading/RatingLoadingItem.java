package com.avito.android.rating_ui.loading;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingLoadingItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/loading/RatingLoadingItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingLoadingItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<RatingLoadingItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f250109b;

    /* compiled from: RatingLoadingItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingLoadingItem> {
        @Override // android.os.Parcelable.Creator
        public final RatingLoadingItem createFromParcel(Parcel parcel) {
            return new RatingLoadingItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingLoadingItem[] newArray(int i12) {
            return new RatingLoadingItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingLoadingItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RatingLoadingItem) && L.f(this.f250109b, ((RatingLoadingItem) obj).f250109b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF248509c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248601b() {
        return this.f250109b;
    }

    public final int hashCode() {
        return this.f250109b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("RatingLoadingItem(stringId="), this.f250109b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f250109b);
    }

    public RatingLoadingItem(@k String str) {
        this.f250109b = str;
    }

    public /* synthetic */ RatingLoadingItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "loading_item" : str);
    }
}
