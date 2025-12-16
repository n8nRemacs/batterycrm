package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Stage.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/DisplayStage;", "Landroid/os/Parcelable;", "Lcom/avito/android/comfortable_deal/api/model/DisplayColors;", "colors", "", "stageDisplay", "stageIcon", "statusDisplay", "statusDisplayShort", "statusIcon", "", "progress", "<init>", "(Lcom/avito/android/comfortable_deal/api/model/DisplayColors;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Lcom/avito/android/comfortable_deal/api/model/DisplayColors;", "c", "()Lcom/avito/android/comfortable_deal/api/model/DisplayColors;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "g", "getStatusDisplayShort", "h", "I", "d", "()I", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DisplayStage implements Parcelable {

    @k
    public static final Parcelable.Creator<DisplayStage> CREATOR = new a();

    @c("colors")
    @k
    private final DisplayColors colors;

    @c("progress")
    private final int progress;

    @c("stageDisplay")
    @k
    private final String stageDisplay;

    @c("stageIcon")
    @l
    private final String stageIcon;

    @c("statusDisplay")
    @l
    private final String statusDisplay;

    @c("statusDisplayShort")
    @l
    private final String statusDisplayShort;

    @c("statusIcon")
    @l
    private final String statusIcon;

    /* compiled from: Stage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DisplayStage> {
        @Override // android.os.Parcelable.Creator
        public final DisplayStage createFromParcel(Parcel parcel) {
            return new DisplayStage(DisplayColors.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DisplayStage[] newArray(int i12) {
            return new DisplayStage[i12];
        }
    }

    public DisplayStage(@k DisplayColors displayColors, @k String str, @l String str2, @l String str3, @l String str4, @l String str5, int i12) {
        this.colors = displayColors;
        this.stageDisplay = str;
        this.stageIcon = str2;
        this.statusDisplay = str3;
        this.statusDisplayShort = str4;
        this.statusIcon = str5;
        this.progress = i12;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DisplayColors getColors() {
        return this.colors;
    }

    /* renamed from: d, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getStageDisplay() {
        return this.stageDisplay;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DisplayStage)) {
            return false;
        }
        DisplayStage displayStage = (DisplayStage) obj;
        return L.f(this.colors, displayStage.colors) && L.f(this.stageDisplay, displayStage.stageDisplay) && L.f(this.stageIcon, displayStage.stageIcon) && L.f(this.statusDisplay, displayStage.statusDisplay) && L.f(this.statusDisplayShort, displayStage.statusDisplayShort) && L.f(this.statusIcon, displayStage.statusIcon) && this.progress == displayStage.progress;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getStageIcon() {
        return this.stageIcon;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getStatusDisplay() {
        return this.statusDisplay;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getStatusIcon() {
        return this.statusIcon;
    }

    public final int hashCode() {
        int iD2 = H.d(this.colors.hashCode() * 31, 31, this.stageDisplay);
        String str = this.stageIcon;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.statusDisplay;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusDisplayShort;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.statusIcon;
        return Integer.hashCode(this.progress) + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayStage(colors=");
        sb2.append(this.colors);
        sb2.append(", stageDisplay=");
        sb2.append(this.stageDisplay);
        sb2.append(", stageIcon=");
        sb2.append(this.stageIcon);
        sb2.append(", statusDisplay=");
        sb2.append(this.statusDisplay);
        sb2.append(", statusDisplayShort=");
        sb2.append(this.statusDisplayShort);
        sb2.append(", statusIcon=");
        sb2.append(this.statusIcon);
        sb2.append(", progress=");
        return r.t(sb2, this.progress, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.colors.writeToParcel(parcel, i12);
        parcel.writeString(this.stageDisplay);
        parcel.writeString(this.stageIcon);
        parcel.writeString(this.statusDisplay);
        parcel.writeString(this.statusDisplayShort);
        parcel.writeString(this.statusIcon);
        parcel.writeInt(this.progress);
    }
}
