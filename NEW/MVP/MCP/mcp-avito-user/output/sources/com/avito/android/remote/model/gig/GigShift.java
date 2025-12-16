package com.avito.android.remote.model.gig;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GigShifts.kt */
@d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ`\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0012J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0012J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b5\u0010\u0014R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b7\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010\u001d¨\u0006:"}, d2 = {"Lcom/avito/android/remote/model/gig/GigShift;", "Landroid/os/Parcelable;", "", "durationMinutes", "", "startTime", "endTime", "pricePerHour", "", "shiftID", "totalPrice", "Lcom/avito/android/remote/model/gig/GigShiftAction;", "action", "", "hotShift", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/avito/android/remote/model/gig/GigShiftAction;Z)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()J", "component6", "component7", "()Lcom/avito/android/remote/model/gig/GigShiftAction;", "component8", "()Z", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lcom/avito/android/remote/model/gig/GigShiftAction;Z)Lcom/avito/android/remote/model/gig/GigShift;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getDurationMinutes", "Ljava/lang/String;", "getStartTime", "getEndTime", "getPricePerHour", "J", "getShiftID", "getTotalPrice", "Lcom/avito/android/remote/model/gig/GigShiftAction;", "getAction", "Z", "getHotShift", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GigShift implements Parcelable {

    @k
    public static final Parcelable.Creator<GigShift> CREATOR = new Creator();

    @c("actionButton")
    @k
    private final GigShiftAction action;

    @c("durationMinutes")
    private final int durationMinutes;

    @c("endTime")
    @k
    private final String endTime;

    @c("hotShift")
    private final boolean hotShift;

    @c("pricePerHour")
    @k
    private final String pricePerHour;

    @c("shiftID")
    private final long shiftID;

    @c("startTime")
    @k
    private final String startTime;

    @c("totalPrice")
    @k
    private final String totalPrice;

    /* compiled from: GigShifts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GigShift> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigShift createFromParcel(@k Parcel parcel) {
            return new GigShift(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), GigShiftAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GigShift[] newArray(int i12) {
            return new GigShift[i12];
        }
    }

    public GigShift(int i12, @k String str, @k String str2, @k String str3, long j12, @k String str4, @k GigShiftAction gigShiftAction, boolean z12) {
        this.durationMinutes = i12;
        this.startTime = str;
        this.endTime = str2;
        this.pricePerHour = str3;
        this.shiftID = j12;
        this.totalPrice = str4;
        this.action = gigShiftAction;
        this.hotShift = z12;
    }

    /* renamed from: component1, reason: from getter */
    public final int getDurationMinutes() {
        return this.durationMinutes;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getPricePerHour() {
        return this.pricePerHour;
    }

    /* renamed from: component5, reason: from getter */
    public final long getShiftID() {
        return this.shiftID;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final GigShiftAction getAction() {
        return this.action;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getHotShift() {
        return this.hotShift;
    }

    @k
    public final GigShift copy(int durationMinutes, @k String startTime, @k String endTime, @k String pricePerHour, long shiftID, @k String totalPrice, @k GigShiftAction action, boolean hotShift) {
        return new GigShift(durationMinutes, startTime, endTime, pricePerHour, shiftID, totalPrice, action, hotShift);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GigShift)) {
            return false;
        }
        GigShift gigShift = (GigShift) other;
        return this.durationMinutes == gigShift.durationMinutes && L.f(this.startTime, gigShift.startTime) && L.f(this.endTime, gigShift.endTime) && L.f(this.pricePerHour, gigShift.pricePerHour) && this.shiftID == gigShift.shiftID && L.f(this.totalPrice, gigShift.totalPrice) && L.f(this.action, gigShift.action) && this.hotShift == gigShift.hotShift;
    }

    @k
    public final GigShiftAction getAction() {
        return this.action;
    }

    public final int getDurationMinutes() {
        return this.durationMinutes;
    }

    @k
    public final String getEndTime() {
        return this.endTime;
    }

    public final boolean getHotShift() {
        return this.hotShift;
    }

    @k
    public final String getPricePerHour() {
        return this.pricePerHour;
    }

    public final long getShiftID() {
        return this.shiftID;
    }

    @k
    public final String getStartTime() {
        return this.startTime;
    }

    @k
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hotShift) + ((this.action.hashCode() + H.d(r.g(H.d(H.d(H.d(Integer.hashCode(this.durationMinutes) * 31, 31, this.startTime), 31, this.endTime), 31, this.pricePerHour), 31, this.shiftID), 31, this.totalPrice)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GigShift(durationMinutes=");
        sb2.append(this.durationMinutes);
        sb2.append(", startTime=");
        sb2.append(this.startTime);
        sb2.append(", endTime=");
        sb2.append(this.endTime);
        sb2.append(", pricePerHour=");
        sb2.append(this.pricePerHour);
        sb2.append(", shiftID=");
        sb2.append(this.shiftID);
        sb2.append(", totalPrice=");
        sb2.append(this.totalPrice);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", hotShift=");
        return r.x(sb2, this.hotShift, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.durationMinutes);
        parcel.writeString(this.startTime);
        parcel.writeString(this.endTime);
        parcel.writeString(this.pricePerHour);
        parcel.writeLong(this.shiftID);
        parcel.writeString(this.totalPrice);
        this.action.writeToParcel(parcel, flags);
        parcel.writeInt(this.hotShift ? 1 : 0);
    }
}
