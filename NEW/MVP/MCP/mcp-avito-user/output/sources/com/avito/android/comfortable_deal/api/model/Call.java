package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/Call;", "Landroid/os/Parcelable;", "", FailedBinderCallBack.CALLER_ID, "", "callDuration", "callTime", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "e", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Call implements Parcelable {

    @k
    public static final Parcelable.Creator<Call> CREATOR = new a();

    @c("callDuration")
    @l
    private final Integer callDuration;

    @c(FailedBinderCallBack.CALLER_ID)
    @k
    private final String callId;

    @c("callTime")
    @k
    private final String callTime;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Call> {
        @Override // android.os.Parcelable.Creator
        public final Call createFromParcel(Parcel parcel) {
            return new Call(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Call[] newArray(int i12) {
            return new Call[i12];
        }
    }

    public Call(@k String str, @l Integer num, @k String str2) {
        this.callId = str;
        this.callDuration = num;
        this.callTime = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Integer getCallDuration() {
        return this.callDuration;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getCallTime() {
        return this.callTime;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Call)) {
            return false;
        }
        Call call = (Call) obj;
        return L.f(this.callId, call.callId) && L.f(this.callDuration, call.callDuration) && L.f(this.callTime, call.callTime);
    }

    public final int hashCode() {
        int iHashCode = this.callId.hashCode() * 31;
        Integer num = this.callDuration;
        return this.callTime.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Call(callId=");
        sb2.append(this.callId);
        sb2.append(", callDuration=");
        sb2.append(this.callDuration);
        sb2.append(", callTime=");
        return C22026a.c(sb2, this.callTime, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.callId);
        Integer num = this.callDuration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.callTime);
    }
}
