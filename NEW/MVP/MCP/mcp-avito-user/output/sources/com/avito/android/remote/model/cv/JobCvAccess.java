package com.avito.android.remote.model.cv;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: JobCvInfo.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/cv/JobCvAccess;", "Landroid/os/Parcelable;", "", "type", "boughtAt", "managerName", "appliedAt", "Lcom/avito/android/remote/model/text/AttributedText;", "vacancyAttributedText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/cv/JobCvAccess;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getBoughtAt", "getManagerName", "getAppliedAt", "Lcom/avito/android/remote/model/text/AttributedText;", "getVacancyAttributedText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class JobCvAccess implements Parcelable {

    @k
    public static final Parcelable.Creator<JobCvAccess> CREATOR = new Creator();

    @c("appliedAt")
    @l
    private final String appliedAt;

    @c("boughtAt")
    @l
    private final String boughtAt;

    @c("managerName")
    @l
    private final String managerName;

    @c("type")
    @k
    private final String type;

    @c("attributedText")
    @l
    private final AttributedText vacancyAttributedText;

    /* compiled from: JobCvInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<JobCvAccess> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final JobCvAccess createFromParcel(@k Parcel parcel) {
            return new JobCvAccess(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(JobCvAccess.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final JobCvAccess[] newArray(int i12) {
            return new JobCvAccess[i12];
        }
    }

    public JobCvAccess(@k String str, @l String str2, @l String str3, @l String str4, @l AttributedText attributedText) {
        this.type = str;
        this.boughtAt = str2;
        this.managerName = str3;
        this.appliedAt = str4;
        this.vacancyAttributedText = attributedText;
    }

    public static /* synthetic */ JobCvAccess copy$default(JobCvAccess jobCvAccess, String str, String str2, String str3, String str4, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = jobCvAccess.type;
        }
        if ((i12 & 2) != 0) {
            str2 = jobCvAccess.boughtAt;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = jobCvAccess.managerName;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            str4 = jobCvAccess.appliedAt;
        }
        String str7 = str4;
        if ((i12 & 16) != 0) {
            attributedText = jobCvAccess.vacancyAttributedText;
        }
        return jobCvAccess.copy(str, str5, str6, str7, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getBoughtAt() {
        return this.boughtAt;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getManagerName() {
        return this.managerName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getAppliedAt() {
        return this.appliedAt;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getVacancyAttributedText() {
        return this.vacancyAttributedText;
    }

    @k
    public final JobCvAccess copy(@k String type, @l String boughtAt, @l String managerName, @l String appliedAt, @l AttributedText vacancyAttributedText) {
        return new JobCvAccess(type, boughtAt, managerName, appliedAt, vacancyAttributedText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JobCvAccess)) {
            return false;
        }
        JobCvAccess jobCvAccess = (JobCvAccess) other;
        return L.f(this.type, jobCvAccess.type) && L.f(this.boughtAt, jobCvAccess.boughtAt) && L.f(this.managerName, jobCvAccess.managerName) && L.f(this.appliedAt, jobCvAccess.appliedAt) && L.f(this.vacancyAttributedText, jobCvAccess.vacancyAttributedText);
    }

    @l
    public final String getAppliedAt() {
        return this.appliedAt;
    }

    @l
    public final String getBoughtAt() {
        return this.boughtAt;
    }

    @l
    public final String getManagerName() {
        return this.managerName;
    }

    @k
    public final String getType() {
        return this.type;
    }

    @l
    public final AttributedText getVacancyAttributedText() {
        return this.vacancyAttributedText;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.boughtAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.managerName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appliedAt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.vacancyAttributedText;
        return iHashCode4 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JobCvAccess(type=");
        sb2.append(this.type);
        sb2.append(", boughtAt=");
        sb2.append(this.boughtAt);
        sb2.append(", managerName=");
        sb2.append(this.managerName);
        sb2.append(", appliedAt=");
        sb2.append(this.appliedAt);
        sb2.append(", vacancyAttributedText=");
        return a.w(sb2, this.vacancyAttributedText, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type);
        parcel.writeString(this.boughtAt);
        parcel.writeString(this.managerName);
        parcel.writeString(this.appliedAt);
        parcel.writeParcelable(this.vacancyAttributedText, flags);
    }
}
