package com.avito.android.beduin.common.component.rating_stats;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRatingStatsModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/avito/android/beduin/common/component/rating_stats/BeduinRating;", "Landroid/os/Parcelable;", "", "score", "", "title", "", "count", "<init>", "(FLjava/lang/String;I)V", "component1", "()F", "component2", "()Ljava/lang/String;", "component3", "()I", "copy", "(FLjava/lang/String;I)Lcom/avito/android/beduin/common/component/rating_stats/BeduinRating;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getScore", "Ljava/lang/String;", "getTitle", "I", "getCount", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinRating implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinRating> CREATOR = new a();
    private final int count;
    private final float score;

    @k
    private final String title;

    /* compiled from: BeduinRatingStatsModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinRating> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRating createFromParcel(Parcel parcel) {
            return new BeduinRating(parcel.readFloat(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRating[] newArray(int i12) {
            return new BeduinRating[i12];
        }
    }

    public BeduinRating(float f12, @k String str, int i12) {
        this.score = f12;
        this.title = str;
        this.count = i12;
    }

    public static /* synthetic */ BeduinRating copy$default(BeduinRating beduinRating, float f12, String str, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f12 = beduinRating.score;
        }
        if ((i13 & 2) != 0) {
            str = beduinRating.title;
        }
        if ((i13 & 4) != 0) {
            i12 = beduinRating.count;
        }
        return beduinRating.copy(f12, str, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @k
    public final BeduinRating copy(float score, @k String title, int count) {
        return new BeduinRating(score, title, count);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRating)) {
            return false;
        }
        BeduinRating beduinRating = (BeduinRating) other;
        return Float.compare(this.score, beduinRating.score) == 0 && L.f(this.title, beduinRating.title) && this.count == beduinRating.count;
    }

    public final int getCount() {
        return this.count;
    }

    public final float getScore() {
        return this.score;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Integer.hashCode(this.count) + H.d(Float.hashCode(this.score) * 31, 31, this.title);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinRating(score=");
        sb2.append(this.score);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", count=");
        return r.t(sb2, this.count, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeFloat(this.score);
        parcel.writeString(this.title);
        parcel.writeInt(this.count);
    }
}
