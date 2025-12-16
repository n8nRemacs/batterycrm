package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacPhoneResponse.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b%\u0010\u001f¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/IacPhoneResponse;", "Landroid/os/Parcelable;", "", "callAvailable", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "", "cannotCallReason", "analyticsInfo", "canVideoCall", "callOptionsType", "calleeId", "<init>", "(ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getCallAvailable", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getCannotCallReason", "()Ljava/lang/String;", "getAnalyticsInfo", "Ljava/lang/Boolean;", "getCanVideoCall", "()Ljava/lang/Boolean;", "getCallOptionsType", "getCalleeId", "_avito-discouraged_avito-api_async-phone"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IacPhoneResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<IacPhoneResponse> CREATOR = new Creator();

    @c("action")
    @l
    private final DeepLink action;

    @c("analyticParams")
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

    /* compiled from: IacPhoneResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IacPhoneResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IacPhoneResponse createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            boolean z12 = parcel.readInt() != 0;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(IacPhoneResponse.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new IacPhoneResponse(z12, deepLink, string, string2, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IacPhoneResponse[] newArray(int i12) {
            return new IacPhoneResponse[i12];
        }
    }

    public IacPhoneResponse(boolean z12, @l DeepLink deepLink, @l String str, @l String str2, @l Boolean bool, @l String str3, @l String str4) {
        this.callAvailable = z12;
        this.action = deepLink;
        this.cannotCallReason = str;
        this.analyticsInfo = str2;
        this.canVideoCall = bool;
        this.callOptionsType = str3;
        this.calleeId = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final DeepLink getAction() {
        return this.action;
    }

    @l
    public final String getAnalyticsInfo() {
        return this.analyticsInfo;
    }

    public final boolean getCallAvailable() {
        return this.callAvailable;
    }

    @l
    public final String getCallOptionsType() {
        return this.callOptionsType;
    }

    @l
    public final String getCalleeId() {
        return this.calleeId;
    }

    @l
    public final Boolean getCanVideoCall() {
        return this.canVideoCall;
    }

    @l
    public final String getCannotCallReason() {
        return this.cannotCallReason;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.callAvailable ? 1 : 0);
        parcel.writeParcelable(this.action, flags);
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

    public /* synthetic */ IacPhoneResponse(boolean z12, DeepLink deepLink, String str, String str2, Boolean bool, String str3, String str4, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? Boolean.FALSE : bool, (i12 & 32) != 0 ? null : str3, (i12 & 64) == 0 ? str4 : null);
    }
}
