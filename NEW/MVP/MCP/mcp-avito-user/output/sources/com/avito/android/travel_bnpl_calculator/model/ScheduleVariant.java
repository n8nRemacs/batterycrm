package com.avito.android.travel_bnpl_calculator.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentTypeDetails.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/model/ScheduleVariant;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "termTitle", "Lcom/avito/android/travel_bnpl_calculator/model/ScheduleVariantProgress;", "progress", "planId", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/travel_bnpl_calculator/model/ScheduleVariantProgress;Ljava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubtitle", "e", "Lcom/avito/android/travel_bnpl_calculator/model/ScheduleVariantProgress;", "d", "()Lcom/avito/android/travel_bnpl_calculator/model/ScheduleVariantProgress;", "c", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ScheduleVariant implements Parcelable {

    @k
    public static final Parcelable.Creator<ScheduleVariant> CREATOR = new a();

    @c("planId")
    @k
    private final String planId;

    @c("progress")
    @k
    private final ScheduleVariantProgress progress;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("termTitle")
    @k
    private final String termTitle;

    @c("title")
    @k
    private final AttributedText title;

    @c("type")
    @k
    private final String type;

    /* compiled from: PaymentTypeDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScheduleVariant> {
        @Override // android.os.Parcelable.Creator
        public final ScheduleVariant createFromParcel(Parcel parcel) {
            return new ScheduleVariant(parcel.readString(), (AttributedText) parcel.readParcelable(ScheduleVariant.class.getClassLoader()), (AttributedText) parcel.readParcelable(ScheduleVariant.class.getClassLoader()), parcel.readString(), ScheduleVariantProgress.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleVariant[] newArray(int i12) {
            return new ScheduleVariant[i12];
        }
    }

    public ScheduleVariant(@k String str, @k AttributedText attributedText, @l AttributedText attributedText2, @k String str2, @k ScheduleVariantProgress scheduleVariantProgress, @k String str3) {
        this.type = str;
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.termTitle = str2;
        this.progress = scheduleVariantProgress;
        this.planId = str3;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getPlanId() {
        return this.planId;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final ScheduleVariantProgress getProgress() {
        return this.progress;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTermTitle() {
        return this.termTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleVariant)) {
            return false;
        }
        ScheduleVariant scheduleVariant = (ScheduleVariant) obj;
        return L.f(this.type, scheduleVariant.type) && L.f(this.title, scheduleVariant.title) && L.f(this.subtitle, scheduleVariant.subtitle) && L.f(this.termTitle, scheduleVariant.termTitle) && L.f(this.progress, scheduleVariant.progress) && L.f(this.planId, scheduleVariant.planId);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.type.hashCode() * 31, 31, this.title);
        AttributedText attributedText = this.subtitle;
        return this.planId.hashCode() + ((this.progress.hashCode() + H.d((iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.termTitle)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScheduleVariant(type=");
        sb2.append(this.type);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", termTitle=");
        sb2.append(this.termTitle);
        sb2.append(", progress=");
        sb2.append(this.progress);
        sb2.append(", planId=");
        return C22026a.c(sb2, this.planId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.type);
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.subtitle, i12);
        parcel.writeString(this.termTitle);
        this.progress.writeToParcel(parcel, i12);
        parcel.writeString(this.planId);
    }
}
