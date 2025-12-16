package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPreviewResponse.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/autoteka/model/MiniReportInsight;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/autoteka/model/InsightState;", VoiceInfo.STATE, "Lcom/avito/android/remote/autoteka/model/InsightStatus;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/autoteka/model/InsightState;Lcom/avito/android/remote/autoteka/model/InsightStatus;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "Lcom/avito/android/remote/autoteka/model/InsightState;", "c", "()Lcom/avito/android/remote/autoteka/model/InsightState;", "Lcom/avito/android/remote/autoteka/model/InsightStatus;", "d", "()Lcom/avito/android/remote/autoteka/model/InsightStatus;", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MiniReportInsight implements Parcelable {

    @k
    public static final Parcelable.Creator<MiniReportInsight> CREATOR = new a();

    @c(VoiceInfo.STATE)
    @l
    private final InsightState state;

    @c("status")
    @l
    private final InsightStatus status;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: AutotekaPreviewResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MiniReportInsight> {
        @Override // android.os.Parcelable.Creator
        public final MiniReportInsight createFromParcel(Parcel parcel) {
            return new MiniReportInsight(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : InsightState.valueOf(parcel.readString()), parcel.readInt() != 0 ? InsightStatus.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MiniReportInsight[] newArray(int i12) {
            return new MiniReportInsight[i12];
        }
    }

    public MiniReportInsight(@k String str, @l String str2, @l InsightState insightState, @l InsightStatus insightStatus) {
        this.title = str;
        this.subtitle = str2;
        this.state = insightState;
        this.status = insightStatus;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final InsightState getState() {
        return this.state;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final InsightStatus getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniReportInsight)) {
            return false;
        }
        MiniReportInsight miniReportInsight = (MiniReportInsight) obj;
        return L.f(this.title, miniReportInsight.title) && L.f(this.subtitle, miniReportInsight.subtitle) && this.state == miniReportInsight.state && this.status == miniReportInsight.status;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InsightState insightState = this.state;
        int iHashCode3 = (iHashCode2 + (insightState == null ? 0 : insightState.hashCode())) * 31;
        InsightStatus insightStatus = this.status;
        return iHashCode3 + (insightStatus != null ? insightStatus.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MiniReportInsight(title=" + this.title + ", subtitle=" + this.subtitle + ", state=" + this.state + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        InsightState insightState = this.state;
        if (insightState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(insightState.name());
        }
        InsightStatus insightStatus = this.status;
        if (insightStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(insightStatus.name());
        }
    }
}
