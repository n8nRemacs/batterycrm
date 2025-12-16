package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Stage.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/DisplayColors;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "progressColor", "statusColor", "stageColor", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "e", "d", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DisplayColors implements Parcelable {

    @k
    public static final Parcelable.Creator<DisplayColors> CREATOR = new a();

    @c("progress")
    @k
    private final UniversalColor progressColor;

    @c("stage")
    @k
    private final UniversalColor stageColor;

    @c("status")
    @k
    private final UniversalColor statusColor;

    /* compiled from: Stage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DisplayColors> {
        @Override // android.os.Parcelable.Creator
        public final DisplayColors createFromParcel(Parcel parcel) {
            return new DisplayColors((UniversalColor) parcel.readParcelable(DisplayColors.class.getClassLoader()), (UniversalColor) parcel.readParcelable(DisplayColors.class.getClassLoader()), (UniversalColor) parcel.readParcelable(DisplayColors.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DisplayColors[] newArray(int i12) {
            return new DisplayColors[i12];
        }
    }

    public DisplayColors(@k UniversalColor universalColor, @k UniversalColor universalColor2, @k UniversalColor universalColor3) {
        this.progressColor = universalColor;
        this.statusColor = universalColor2;
        this.stageColor = universalColor3;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final UniversalColor getProgressColor() {
        return this.progressColor;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final UniversalColor getStageColor() {
        return this.stageColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final UniversalColor getStatusColor() {
        return this.statusColor;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayColors)) {
            return false;
        }
        DisplayColors displayColors = (DisplayColors) obj;
        return L.f(this.progressColor, displayColors.progressColor) && L.f(this.statusColor, displayColors.statusColor) && L.f(this.stageColor, displayColors.stageColor);
    }

    public final int hashCode() {
        return this.stageColor.hashCode() + com.avito.android.actions_sheet.a.i(this.statusColor, this.progressColor.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayColors(progressColor=");
        sb2.append(this.progressColor);
        sb2.append(", statusColor=");
        sb2.append(this.statusColor);
        sb2.append(", stageColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.stageColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.progressColor, i12);
        parcel.writeParcelable(this.statusColor, i12);
        parcel.writeParcelable(this.stageColor, i12);
    }
}
