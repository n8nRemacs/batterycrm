package com.avito.android.iac_calls_history.impl_module.api.remote.elements;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacCallsHistoryElement.kt */
@d
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b!\u0010\u0013¨\u0006\""}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/api/remote/elements/IacCallsHistoryElement;", "Lcom/avito/android/iac_calls_history/impl_module/api/remote/elements/CallsHistoryElement;", "", FailedBinderCallBack.CALLER_ID, "action", "date", "", "duration", "status", "Lcom/avito/android/remote/model/UniversalColor;", "statusColor", "itemTitle", "", "itemPrice", "userTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "e", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "i", "Lcom/avito/android/remote/model/UniversalColor;", "j", "()Lcom/avito/android/remote/model/UniversalColor;", "h", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "k", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class IacCallsHistoryElement extends CallsHistoryElement {

    @k
    public static final Parcelable.Creator<IacCallsHistoryElement> CREATOR = new a();

    @c("action")
    @k
    private final String action;

    @c(FailedBinderCallBack.CALLER_ID)
    @k
    private final String callId;

    @c("date")
    @k
    private final String date;

    @c("duration")
    @l
    private final Integer duration;

    @c("itemPrice")
    @l
    private final Long itemPrice;

    @c("itemTitle")
    @k
    private final String itemTitle;

    @c("status")
    @k
    private final String status;

    @c("statusColor")
    @k
    private final UniversalColor statusColor;

    @c("userTitle")
    @k
    private final String userTitle;

    /* compiled from: IacCallsHistoryElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacCallsHistoryElement> {
        @Override // android.os.Parcelable.Creator
        public final IacCallsHistoryElement createFromParcel(Parcel parcel) {
            return new IacCallsHistoryElement(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), (UniversalColor) parcel.readParcelable(IacCallsHistoryElement.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacCallsHistoryElement[] newArray(int i12) {
            return new IacCallsHistoryElement[i12];
        }
    }

    public IacCallsHistoryElement(@k String str, @k String str2, @k String str3, @l Integer num, @k String str4, @k UniversalColor universalColor, @k String str5, @l Long l12, @k String str6) {
        this.callId = str;
        this.action = str2;
        this.date = str3;
        this.duration = num;
        this.status = str4;
        this.statusColor = universalColor;
        this.itemTitle = str5;
        this.itemPrice = l12;
        this.userTitle = str6;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacCallsHistoryElement)) {
            return false;
        }
        IacCallsHistoryElement iacCallsHistoryElement = (IacCallsHistoryElement) obj;
        return L.f(this.callId, iacCallsHistoryElement.callId) && L.f(this.action, iacCallsHistoryElement.action) && L.f(this.date, iacCallsHistoryElement.date) && L.f(this.duration, iacCallsHistoryElement.duration) && L.f(this.status, iacCallsHistoryElement.status) && L.f(this.statusColor, iacCallsHistoryElement.statusColor) && L.f(this.itemTitle, iacCallsHistoryElement.itemTitle) && L.f(this.itemPrice, iacCallsHistoryElement.itemPrice) && L.f(this.userTitle, iacCallsHistoryElement.userTitle);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Long getItemPrice() {
        return this.itemPrice;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.callId.hashCode() * 31, 31, this.action), 31, this.date);
        Integer num = this.duration;
        int iD3 = H.d(com.avito.android.actions_sheet.a.i(this.statusColor, H.d((iD2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.status), 31), 31, this.itemTitle);
        Long l12 = this.itemPrice;
        return this.userTitle.hashCode() + ((iD3 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final UniversalColor getStatusColor() {
        return this.statusColor;
    }

    @k
    /* renamed from: k, reason: from getter */
    public final String getUserTitle() {
        return this.userTitle;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("IacCallsHistoryElement(callId="), this.callId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.callId);
        parcel.writeString(this.action);
        parcel.writeString(this.date);
        Integer num = this.duration;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.status);
        parcel.writeParcelable(this.statusColor, i12);
        parcel.writeString(this.itemTitle);
        Long l12 = this.itemPrice;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.userTitle);
    }
}
