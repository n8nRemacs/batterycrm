package com.avito.android.rating_ui.rating_stat;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingStatEntry.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/rating_stat/RatingStatEntry;", "Landroid/os/Parcelable;", "_avito_rating-ui_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RatingStatEntry implements Parcelable {

    @k
    public static final Parcelable.Creator<RatingStatEntry> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final float f250116b;

    /* renamed from: c, reason: collision with root package name */
    public final float f250117c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f250118d;

    /* compiled from: RatingStatEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RatingStatEntry> {
        @Override // android.os.Parcelable.Creator
        public final RatingStatEntry createFromParcel(Parcel parcel) {
            return new RatingStatEntry(parcel.readFloat(), parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingStatEntry[] newArray(int i12) {
            return new RatingStatEntry[i12];
        }
    }

    public RatingStatEntry(float f12, float f13, @k String str) {
        this.f250116b = f12;
        this.f250117c = f13;
        this.f250118d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingStatEntry)) {
            return false;
        }
        RatingStatEntry ratingStatEntry = (RatingStatEntry) obj;
        return Float.compare(this.f250116b, ratingStatEntry.f250116b) == 0 && Float.compare(this.f250117c, ratingStatEntry.f250117c) == 0 && L.f(this.f250118d, ratingStatEntry.f250118d);
    }

    public final int hashCode() {
        return this.f250118d.hashCode() + r.d(this.f250117c, Float.hashCode(this.f250116b) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RatingStatEntry(rating=");
        sb2.append(this.f250116b);
        sb2.append(", counterProgress=");
        sb2.append(this.f250117c);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f250118d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeFloat(this.f250116b);
        parcel.writeFloat(this.f250117c);
        parcel.writeString(this.f250118d);
    }
}
