package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaTeaserItemResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/MileageParamInsight;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/InsightType;", "insightType", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "reportLink", "<init>", "(Lcom/avito/android/remote/model/autotekateaser/InsightType;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;)V", "component1", "()Lcom/avito/android/remote/model/autotekateaser/InsightType;", "component2", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "copy", "(Lcom/avito/android/remote/model/autotekateaser/InsightType;Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;)Lcom/avito/android/remote/model/autotekateaser/MileageParamInsight;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/autotekateaser/InsightType;", "getInsightType", "Lcom/avito/android/remote/model/autotekateaser/AutotekaReportLink;", "getReportLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MileageParamInsight implements Parcelable {

    @k
    public static final Parcelable.Creator<MileageParamInsight> CREATOR = new Creator();

    @c("insightType")
    @l
    private final InsightType insightType;

    @c("reportLink")
    @l
    private final AutotekaReportLink reportLink;

    /* compiled from: AutotekaTeaserItemResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MileageParamInsight> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MileageParamInsight createFromParcel(@k Parcel parcel) {
            return new MileageParamInsight(parcel.readInt() == 0 ? null : InsightType.valueOf(parcel.readString()), parcel.readInt() != 0 ? AutotekaReportLink.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MileageParamInsight[] newArray(int i12) {
            return new MileageParamInsight[i12];
        }
    }

    public MileageParamInsight(@l InsightType insightType, @l AutotekaReportLink autotekaReportLink) {
        this.insightType = insightType;
        this.reportLink = autotekaReportLink;
    }

    public static /* synthetic */ MileageParamInsight copy$default(MileageParamInsight mileageParamInsight, InsightType insightType, AutotekaReportLink autotekaReportLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            insightType = mileageParamInsight.insightType;
        }
        if ((i12 & 2) != 0) {
            autotekaReportLink = mileageParamInsight.reportLink;
        }
        return mileageParamInsight.copy(insightType, autotekaReportLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final InsightType getInsightType() {
        return this.insightType;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    @k
    public final MileageParamInsight copy(@l InsightType insightType, @l AutotekaReportLink reportLink) {
        return new MileageParamInsight(insightType, reportLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MileageParamInsight)) {
            return false;
        }
        MileageParamInsight mileageParamInsight = (MileageParamInsight) other;
        return this.insightType == mileageParamInsight.insightType && L.f(this.reportLink, mileageParamInsight.reportLink);
    }

    @l
    public final InsightType getInsightType() {
        return this.insightType;
    }

    @l
    public final AutotekaReportLink getReportLink() {
        return this.reportLink;
    }

    public int hashCode() {
        InsightType insightType = this.insightType;
        int iHashCode = (insightType == null ? 0 : insightType.hashCode()) * 31;
        AutotekaReportLink autotekaReportLink = this.reportLink;
        return iHashCode + (autotekaReportLink != null ? autotekaReportLink.hashCode() : 0);
    }

    @k
    public String toString() {
        return "MileageParamInsight(insightType=" + this.insightType + ", reportLink=" + this.reportLink + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        InsightType insightType = this.insightType;
        if (insightType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(insightType.name());
        }
        AutotekaReportLink autotekaReportLink = this.reportLink;
        if (autotekaReportLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaReportLink.writeToParcel(parcel, flags);
        }
    }
}
