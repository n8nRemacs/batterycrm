package com.avito.android.iac_outgoing_call_ability.impl_module.api.remote;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CanCallResult.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/remote/CanCallResult;", "Landroid/os/Parcelable;", "", "callAvailable", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "", "cannotCallReason", "analyticsInfo", "canVideoCall", "callOptionsType", "calleeId", "<init>", "(ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "Z", "d", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "c", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "e", "f", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CanCallResult implements Parcelable {

    @k
    public static final Parcelable.Creator<CanCallResult> CREATOR = new a();

    @c("action")
    @l
    private final DeepLink action;

    @c("analyticsInfo")
    @l
    private final String analyticsInfo;

    @c("can")
    private final boolean callAvailable;

    @c("callOptionsType")
    @l
    private final String callOptionsType;

    @c("calleeHashId")
    @l
    private final String calleeId;

    @c("canVideoCall")
    @l
    private final Boolean canVideoCall;

    @c("reason")
    @l
    private final String cannotCallReason;

    /* compiled from: CanCallResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CanCallResult> {
        @Override // android.os.Parcelable.Creator
        public final CanCallResult createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            boolean z12 = parcel.readInt() != 0;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(CanCallResult.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CanCallResult(z12, deepLink, string, string2, boolValueOf, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CanCallResult[] newArray(int i12) {
            return new CanCallResult[i12];
        }
    }

    public CanCallResult(boolean z12, @l DeepLink deepLink, @l String str, @l String str2, @l Boolean bool, @l String str3, @l String str4) {
        this.callAvailable = z12;
        this.action = deepLink;
        this.cannotCallReason = str;
        this.analyticsInfo = str2;
        this.canVideoCall = bool;
        this.callOptionsType = str3;
        this.calleeId = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getAnalyticsInfo() {
        return this.analyticsInfo;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getCallAvailable() {
        return this.callAvailable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getCallOptionsType() {
        return this.callOptionsType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CanCallResult)) {
            return false;
        }
        CanCallResult canCallResult = (CanCallResult) obj;
        return this.callAvailable == canCallResult.callAvailable && L.f(this.action, canCallResult.action) && L.f(this.cannotCallReason, canCallResult.cannotCallReason) && L.f(this.analyticsInfo, canCallResult.analyticsInfo) && L.f(this.canVideoCall, canCallResult.canVideoCall) && L.f(this.callOptionsType, canCallResult.callOptionsType) && L.f(this.calleeId, canCallResult.calleeId);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getCalleeId() {
        return this.calleeId;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getCanVideoCall() {
        return this.canVideoCall;
    }

    @l
    public final DeepLink getAction() {
        return this.action;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getCannotCallReason() {
        return this.cannotCallReason;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.callAvailable) * 31;
        DeepLink deepLink = this.action;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.cannotCallReason;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.analyticsInfo;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.canVideoCall;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.callOptionsType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.calleeId;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CanCallResult(callAvailable=");
        sb2.append(this.callAvailable);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", cannotCallReason=");
        sb2.append(this.cannotCallReason);
        sb2.append(", analyticsInfo=");
        sb2.append(this.analyticsInfo);
        sb2.append(", canVideoCall=");
        sb2.append(this.canVideoCall);
        sb2.append(", callOptionsType=");
        sb2.append(this.callOptionsType);
        sb2.append(", calleeId=");
        return C22026a.c(sb2, this.calleeId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.callAvailable ? 1 : 0);
        parcel.writeParcelable(this.action, i12);
        parcel.writeString(this.cannotCallReason);
        parcel.writeString(this.analyticsInfo);
        Boolean bool = this.canVideoCall;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.callOptionsType);
        parcel.writeString(this.calleeId);
    }

    public /* synthetic */ CanCallResult(boolean z12, DeepLink deepLink, String str, String str2, Boolean bool, String str3, String str4, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? Boolean.FALSE : bool, (i12 & 32) != 0 ? null : str3, (i12 & 64) == 0 ? str4 : null);
    }
}
