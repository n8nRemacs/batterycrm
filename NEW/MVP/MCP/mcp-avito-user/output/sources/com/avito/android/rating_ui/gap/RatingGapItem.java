package com.avito.android.rating_ui.gap;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingGapItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/gap/RatingGapItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingGapItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<RatingGapItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f250003b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f250004c;

    /* renamed from: d, reason: collision with root package name */
    public final int f250005d;

    /* compiled from: RatingGapItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingGapItem> {
        @Override // android.os.Parcelable.Creator
        public final RatingGapItem createFromParcel(Parcel parcel) {
            return new RatingGapItem(parcel.readInt(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingGapItem[] newArray(int i12) {
            return new RatingGapItem[i12];
        }
    }

    public RatingGapItem(int i12, long j12, @k String str) {
        this.f250003b = j12;
        this.f250004c = str;
        this.f250005d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingGapItem)) {
            return false;
        }
        RatingGapItem ratingGapItem = (RatingGapItem) obj;
        return this.f250003b == ratingGapItem.f250003b && L.f(this.f250004c, ratingGapItem.f250004c) && this.f250005d == ratingGapItem.f250005d;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF222262b() {
        return this.f250003b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF242989b() {
        return this.f250004c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f250005d) + H.d(Long.hashCode(this.f250003b) * 31, 31, this.f250004c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingGapItem(id=");
        sb2.append(this.f250003b);
        sb2.append(", stringId=");
        sb2.append(this.f250004c);
        sb2.append(", height=");
        return r.t(sb2, this.f250005d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f250003b);
        parcel.writeString(this.f250004c);
        parcel.writeInt(this.f250005d);
    }

    public /* synthetic */ RatingGapItem(long j12, String str, int i12, int i13, C42822w c42822w) {
        this(i12, j12, (i13 & 2) != 0 ? String.valueOf(j12) : str);
    }
}
