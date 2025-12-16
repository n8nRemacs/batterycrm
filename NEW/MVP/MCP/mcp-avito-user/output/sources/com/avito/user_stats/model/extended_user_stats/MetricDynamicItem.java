package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/MetricDynamicItem;", "Landroid/os/Parcelable;", "", "slug", "", "value", "missingValueTooltip", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "J", "c", "()J", "getMissingValueTooltip", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricDynamicItem implements Parcelable {

    @k
    public static final Parcelable.Creator<MetricDynamicItem> CREATOR = new a();

    @c("missingValueTooltip")
    @l
    private final String missingValueTooltip;

    @c("slug")
    @k
    private final String slug;

    @c("value")
    private final long value;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricDynamicItem> {
        @Override // android.os.Parcelable.Creator
        public final MetricDynamicItem createFromParcel(Parcel parcel) {
            return new MetricDynamicItem(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MetricDynamicItem[] newArray(int i12) {
            return new MetricDynamicItem[i12];
        }
    }

    public MetricDynamicItem(@k String str, long j12, @l String str2) {
        this.slug = str;
        this.value = j12;
        this.missingValueTooltip = str2;
    }

    /* renamed from: c, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricDynamicItem)) {
            return false;
        }
        MetricDynamicItem metricDynamicItem = (MetricDynamicItem) obj;
        return L.f(this.slug, metricDynamicItem.slug) && this.value == metricDynamicItem.value && L.f(this.missingValueTooltip, metricDynamicItem.missingValueTooltip);
    }

    public final int hashCode() {
        int iG2 = r.g(this.slug.hashCode() * 31, 31, this.value);
        String str = this.missingValueTooltip;
        return iG2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricDynamicItem(slug=");
        sb2.append(this.slug);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", missingValueTooltip=");
        return C22026a.c(sb2, this.missingValueTooltip, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.slug);
        parcel.writeLong(this.value);
        parcel.writeString(this.missingValueTooltip);
    }
}
