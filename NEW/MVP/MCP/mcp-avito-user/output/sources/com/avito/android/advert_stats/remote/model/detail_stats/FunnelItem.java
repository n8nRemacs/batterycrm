package com.avito.android.advert_stats.remote.model.detail_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DetailAdvertStatistics.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/advert_stats/remote/model/detail_stats/FunnelItem;", "Landroid/os/Parcelable;", "", "value", "description", "Lcom/avito/android/remote/model/UniversalColor;", "color", "", "hasDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Z)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "Z", "d", "()Z", "_avito-discouraged_avito-api_advert-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FunnelItem implements Parcelable {

    @k
    public static final Parcelable.Creator<FunnelItem> CREATOR = new a();

    @c("color")
    @l
    private final UniversalColor color;

    @c("description")
    @k
    private final String description;

    @c("hasDialog")
    private final boolean hasDialog;

    @c("value")
    @k
    private final String value;

    /* compiled from: DetailAdvertStatistics.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FunnelItem> {
        @Override // android.os.Parcelable.Creator
        public final FunnelItem createFromParcel(Parcel parcel) {
            return new FunnelItem(parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(FunnelItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final FunnelItem[] newArray(int i12) {
            return new FunnelItem[i12];
        }
    }

    public FunnelItem(@k String str, @k String str2, @l UniversalColor universalColor, boolean z12) {
        this.value = str;
        this.description = str2;
        this.color = universalColor;
        this.hasDialog = z12;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getHasDialog() {
        return this.hasDialog;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunnelItem)) {
            return false;
        }
        FunnelItem funnelItem = (FunnelItem) obj;
        return L.f(this.value, funnelItem.value) && L.f(this.description, funnelItem.description) && L.f(this.color, funnelItem.color) && this.hasDialog == funnelItem.hasDialog;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iD2 = H.d(this.value.hashCode() * 31, 31, this.description);
        UniversalColor universalColor = this.color;
        return Boolean.hashCode(this.hasDialog) + ((iD2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FunnelItem(value=");
        sb2.append(this.value);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", hasDialog=");
        return r.x(sb2, this.hasDialog, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.value);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.color, i12);
        parcel.writeInt(this.hasDialog ? 1 : 0);
    }

    public /* synthetic */ FunnelItem(String str, String str2, UniversalColor universalColor, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, universalColor, (i12 & 8) != 0 ? false : z12);
    }
}
