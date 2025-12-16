package com.avito.android.developments_advice.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactInfoResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/avito/android/developments_advice/remote/model/CallInterval;", "Landroid/os/Parcelable;", "", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "fromByCalltrackingOffset", "toByCalltrackingOffset", "", "asSoonAsPossible", "asSoonAsPossibleTitle", "dayTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "h", "g", "i", "Z", "c", "()Z", "d", "e", "_avito-discouraged_avito-network_developments-advice"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CallInterval implements Parcelable {

    @k
    public static final Parcelable.Creator<CallInterval> CREATOR = new a();

    @c("asSoonAsPossible")
    private final boolean asSoonAsPossible;

    @c("asSoonAsPossibleTitle")
    @l
    private final String asSoonAsPossibleTitle;

    /* renamed from: b, reason: collision with root package name */
    public transient boolean f136192b;

    @c("dayTitle")
    @l
    private final String dayTitle;

    @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    @l
    private final String from;

    @c("fromByCalltrackingOffset")
    @l
    private final String fromByCalltrackingOffset;

    @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    @l
    private final String to;

    @c("toByCalltrackingOffset")
    @l
    private final String toByCalltrackingOffset;

    /* compiled from: ContactInfoResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CallInterval> {
        @Override // android.os.Parcelable.Creator
        public final CallInterval createFromParcel(Parcel parcel) {
            return new CallInterval(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CallInterval[] newArray(int i12) {
            return new CallInterval[i12];
        }
    }

    public CallInterval(@l String str, @l String str2, @l String str3, @l String str4, boolean z12, @l String str5, @l String str6) {
        this.from = str;
        this.to = str2;
        this.fromByCalltrackingOffset = str3;
        this.toByCalltrackingOffset = str4;
        this.asSoonAsPossible = z12;
        this.asSoonAsPossibleTitle = str5;
        this.dayTitle = str6;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAsSoonAsPossible() {
        return this.asSoonAsPossible;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getAsSoonAsPossibleTitle() {
        return this.asSoonAsPossibleTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getDayTitle() {
        return this.dayTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallInterval)) {
            return false;
        }
        CallInterval callInterval = (CallInterval) obj;
        return L.f(this.from, callInterval.from) && L.f(this.to, callInterval.to) && L.f(this.fromByCalltrackingOffset, callInterval.fromByCalltrackingOffset) && L.f(this.toByCalltrackingOffset, callInterval.toByCalltrackingOffset) && this.asSoonAsPossible == callInterval.asSoonAsPossible && L.f(this.asSoonAsPossibleTitle, callInterval.asSoonAsPossibleTitle) && L.f(this.dayTitle, callInterval.dayTitle);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getFromByCalltrackingOffset() {
        return this.fromByCalltrackingOffset;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getTo() {
        return this.to;
    }

    public final int hashCode() {
        String str = this.from;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.to;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fromByCalltrackingOffset;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.toByCalltrackingOffset;
        int i12 = r.i((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.asSoonAsPossible);
        String str5 = this.asSoonAsPossibleTitle;
        int iHashCode4 = (i12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dayTitle;
        return iHashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getToByCalltrackingOffset() {
        return this.toByCalltrackingOffset;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CallInterval(from=");
        sb2.append(this.from);
        sb2.append(", to=");
        sb2.append(this.to);
        sb2.append(", fromByCalltrackingOffset=");
        sb2.append(this.fromByCalltrackingOffset);
        sb2.append(", toByCalltrackingOffset=");
        sb2.append(this.toByCalltrackingOffset);
        sb2.append(", asSoonAsPossible=");
        sb2.append(this.asSoonAsPossible);
        sb2.append(", asSoonAsPossibleTitle=");
        sb2.append(this.asSoonAsPossibleTitle);
        sb2.append(", dayTitle=");
        return C22026a.c(sb2, this.dayTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.fromByCalltrackingOffset);
        parcel.writeString(this.toByCalltrackingOffset);
        parcel.writeInt(this.asSoonAsPossible ? 1 : 0);
        parcel.writeString(this.asSoonAsPossibleTitle);
        parcel.writeString(this.dayTitle);
    }

    public /* synthetic */ CallInterval(String str, String str2, String str3, String str4, boolean z12, String str5, String str6, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, z12, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6);
    }
}
