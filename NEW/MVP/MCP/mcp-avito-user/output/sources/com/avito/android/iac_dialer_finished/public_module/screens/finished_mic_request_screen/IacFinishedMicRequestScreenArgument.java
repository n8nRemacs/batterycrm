package com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiInt;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedMicRequestScreenArgument.kt */
@d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u001d\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001eJ\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001eJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0012\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u0010$J\u0012\u00102\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b4\u00103JÊ\u0001\u00105\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001eJ\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010=\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u000208HÖ\u0001¢\u0006\u0004\b?\u0010:J \u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u000208HÖ\u0001¢\u0006\u0004\bD\u0010ER\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010F\u001a\u0004\bG\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\b\u0006\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bM\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u0010'R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bP\u0010\u001eR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bQ\u0010\u001eR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\bU\u0010-R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010F\u001a\u0004\bV\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\bW\u0010\"R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bX\u0010\"R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010K\u001a\u0004\bY\u0010$R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010Z\u001a\u0004\b[\u00103R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010Z\u001a\u0004\b\\\u00103¨\u0006]"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "peerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "peerAvatar", "peerRating", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "peerCallerReviewCount", "scenario", "status", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "", "duration", "itemId", "itemTitle", "itemPrice", "itemImage", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "iacLink", "cancelLink", "<init>", "(Ljava/lang/String;ZLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "component5", "component6", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "component7", "component8", "component9", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component10", "()Ljava/lang/Long;", "component11", "component12", "component13", "component14", "component15", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "component16", "copy", "(Ljava/lang/String;ZLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Long;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;)Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCallId", "Z", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getPeerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "getPeerAvatar", "getPeerRating", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "getPeerCallerReviewCount", "getScenario", "getStatus", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "Ljava/lang/Long;", "getDuration", "getItemId", "getItemTitle", "getItemPrice", "getItemImage", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiDeepLink;", "getIacLink", "getCancelLink", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacFinishedMicRequestScreenArgument implements Parcelable {

    @k
    public static final Parcelable.Creator<IacFinishedMicRequestScreenArgument> CREATOR = new a();

    @k
    private final String callId;

    @l
    private final IacPiiDeepLink cancelLink;

    @k
    private final IacCallDirection direction;

    @l
    private final Long duration;

    @l
    private final IacPiiDeepLink iacLink;
    private final boolean isVideo;

    @l
    private final String itemId;

    @l
    private final IacPiiImage itemImage;

    @l
    private final IacPiiString itemPrice;

    @l
    private final IacPiiString itemTitle;

    @l
    private final IacPiiImage peerAvatar;

    @l
    private final IacPiiInt peerCallerReviewCount;

    @l
    private final IacPiiString peerName;

    @l
    private final IacPiiString peerRating;

    @k
    private final String scenario;

    @k
    private final String status;

    /* compiled from: IacFinishedMicRequestScreenArgument.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacFinishedMicRequestScreenArgument> {
        @Override // android.os.Parcelable.Creator
        public final IacFinishedMicRequestScreenArgument createFromParcel(Parcel parcel) {
            return new IacFinishedMicRequestScreenArgument(parcel.readString(), parcel.readInt() != 0, (IacPiiString) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()), (IacPiiImage) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()), (IacPiiString) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()), (IacPiiInt) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()), parcel.readString(), parcel.readString(), IacCallDirection.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (IacPiiString) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()), (IacPiiString) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()), (IacPiiImage) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()), (IacPiiDeepLink) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()), (IacPiiDeepLink) parcel.readParcelable(IacFinishedMicRequestScreenArgument.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacFinishedMicRequestScreenArgument[] newArray(int i12) {
            return new IacFinishedMicRequestScreenArgument[i12];
        }
    }

    public IacFinishedMicRequestScreenArgument(@k String str, boolean z12, @l IacPiiString iacPiiString, @l IacPiiImage iacPiiImage, @l IacPiiString iacPiiString2, @l IacPiiInt iacPiiInt, @k String str2, @k String str3, @k IacCallDirection iacCallDirection, @l Long l12, @l String str4, @l IacPiiString iacPiiString3, @l IacPiiString iacPiiString4, @l IacPiiImage iacPiiImage2, @l IacPiiDeepLink iacPiiDeepLink, @l IacPiiDeepLink iacPiiDeepLink2) {
        this.callId = str;
        this.isVideo = z12;
        this.peerName = iacPiiString;
        this.peerAvatar = iacPiiImage;
        this.peerRating = iacPiiString2;
        this.peerCallerReviewCount = iacPiiInt;
        this.scenario = str2;
        this.status = str3;
        this.direction = iacCallDirection;
        this.duration = l12;
        this.itemId = str4;
        this.itemTitle = iacPiiString3;
        this.itemPrice = iacPiiString4;
        this.itemImage = iacPiiImage2;
        this.iacLink = iacPiiDeepLink;
        this.cancelLink = iacPiiDeepLink2;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final IacPiiString getItemTitle() {
        return this.itemTitle;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final IacPiiString getItemPrice() {
        return this.itemPrice;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final IacPiiImage getItemImage() {
        return this.itemImage;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final IacPiiDeepLink getIacLink() {
        return this.iacLink;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final IacPiiDeepLink getCancelLink() {
        return this.cancelLink;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final IacPiiString getPeerName() {
        return this.peerName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final IacPiiImage getPeerAvatar() {
        return this.peerAvatar;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final IacPiiString getPeerRating() {
        return this.peerRating;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final IacPiiInt getPeerCallerReviewCount() {
        return this.peerCallerReviewCount;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final String getScenario() {
        return this.scenario;
    }

    @k
    /* renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @k
    /* renamed from: component9, reason: from getter */
    public final IacCallDirection getDirection() {
        return this.direction;
    }

    @k
    public final IacFinishedMicRequestScreenArgument copy(@k String callId, boolean isVideo, @l IacPiiString peerName, @l IacPiiImage peerAvatar, @l IacPiiString peerRating, @l IacPiiInt peerCallerReviewCount, @k String scenario, @k String status, @k IacCallDirection direction, @l Long duration, @l String itemId, @l IacPiiString itemTitle, @l IacPiiString itemPrice, @l IacPiiImage itemImage, @l IacPiiDeepLink iacLink, @l IacPiiDeepLink cancelLink) {
        return new IacFinishedMicRequestScreenArgument(callId, isVideo, peerName, peerAvatar, peerRating, peerCallerReviewCount, scenario, status, direction, duration, itemId, itemTitle, itemPrice, itemImage, iacLink, cancelLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacFinishedMicRequestScreenArgument)) {
            return false;
        }
        IacFinishedMicRequestScreenArgument iacFinishedMicRequestScreenArgument = (IacFinishedMicRequestScreenArgument) other;
        return L.f(this.callId, iacFinishedMicRequestScreenArgument.callId) && this.isVideo == iacFinishedMicRequestScreenArgument.isVideo && L.f(this.peerName, iacFinishedMicRequestScreenArgument.peerName) && L.f(this.peerAvatar, iacFinishedMicRequestScreenArgument.peerAvatar) && L.f(this.peerRating, iacFinishedMicRequestScreenArgument.peerRating) && L.f(this.peerCallerReviewCount, iacFinishedMicRequestScreenArgument.peerCallerReviewCount) && L.f(this.scenario, iacFinishedMicRequestScreenArgument.scenario) && L.f(this.status, iacFinishedMicRequestScreenArgument.status) && this.direction == iacFinishedMicRequestScreenArgument.direction && L.f(this.duration, iacFinishedMicRequestScreenArgument.duration) && L.f(this.itemId, iacFinishedMicRequestScreenArgument.itemId) && L.f(this.itemTitle, iacFinishedMicRequestScreenArgument.itemTitle) && L.f(this.itemPrice, iacFinishedMicRequestScreenArgument.itemPrice) && L.f(this.itemImage, iacFinishedMicRequestScreenArgument.itemImage) && L.f(this.iacLink, iacFinishedMicRequestScreenArgument.iacLink) && L.f(this.cancelLink, iacFinishedMicRequestScreenArgument.cancelLink);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @l
    public final IacPiiDeepLink getCancelLink() {
        return this.cancelLink;
    }

    @k
    public final IacCallDirection getDirection() {
        return this.direction;
    }

    @l
    public final Long getDuration() {
        return this.duration;
    }

    @l
    public final IacPiiDeepLink getIacLink() {
        return this.iacLink;
    }

    @l
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final IacPiiImage getItemImage() {
        return this.itemImage;
    }

    @l
    public final IacPiiString getItemPrice() {
        return this.itemPrice;
    }

    @l
    public final IacPiiString getItemTitle() {
        return this.itemTitle;
    }

    @l
    public final IacPiiImage getPeerAvatar() {
        return this.peerAvatar;
    }

    @l
    public final IacPiiInt getPeerCallerReviewCount() {
        return this.peerCallerReviewCount;
    }

    @l
    public final IacPiiString getPeerName() {
        return this.peerName;
    }

    @l
    public final IacPiiString getPeerRating() {
        return this.peerRating;
    }

    @k
    public final String getScenario() {
        return this.scenario;
    }

    @k
    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i12 = r.i(this.callId.hashCode() * 31, 31, this.isVideo);
        IacPiiString iacPiiString = this.peerName;
        int iHashCode = (i12 + (iacPiiString == null ? 0 : iacPiiString.hashCode())) * 31;
        IacPiiImage iacPiiImage = this.peerAvatar;
        int iHashCode2 = (iHashCode + (iacPiiImage == null ? 0 : iacPiiImage.hashCode())) * 31;
        IacPiiString iacPiiString2 = this.peerRating;
        int iHashCode3 = (iHashCode2 + (iacPiiString2 == null ? 0 : iacPiiString2.hashCode())) * 31;
        IacPiiInt iacPiiInt = this.peerCallerReviewCount;
        int iHashCode4 = (this.direction.hashCode() + H.d(H.d((iHashCode3 + (iacPiiInt == null ? 0 : iacPiiInt.hashCode())) * 31, 31, this.scenario), 31, this.status)) * 31;
        Long l12 = this.duration;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.itemId;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        IacPiiString iacPiiString3 = this.itemTitle;
        int iHashCode7 = (iHashCode6 + (iacPiiString3 == null ? 0 : iacPiiString3.hashCode())) * 31;
        IacPiiString iacPiiString4 = this.itemPrice;
        int iHashCode8 = (iHashCode7 + (iacPiiString4 == null ? 0 : iacPiiString4.hashCode())) * 31;
        IacPiiImage iacPiiImage2 = this.itemImage;
        int iHashCode9 = (iHashCode8 + (iacPiiImage2 == null ? 0 : iacPiiImage2.hashCode())) * 31;
        IacPiiDeepLink iacPiiDeepLink = this.iacLink;
        int iHashCode10 = (iHashCode9 + (iacPiiDeepLink == null ? 0 : iacPiiDeepLink.hashCode())) * 31;
        IacPiiDeepLink iacPiiDeepLink2 = this.cancelLink;
        return iHashCode10 + (iacPiiDeepLink2 != null ? iacPiiDeepLink2.hashCode() : 0);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public String toString() {
        return "IacFinishedMicRequestScreenArgument(callId=" + this.callId + ", isVideo=" + this.isVideo + ", peerName=" + this.peerName + ", peerAvatar=" + this.peerAvatar + ", peerRating=" + this.peerRating + ", peerCallerReviewCount=" + this.peerCallerReviewCount + ", scenario=" + this.scenario + ", status=" + this.status + ", direction=" + this.direction + ", duration=" + this.duration + ", itemId=" + this.itemId + ", itemTitle=" + this.itemTitle + ", itemPrice=" + this.itemPrice + ", itemImage=" + this.itemImage + ", iacLink=" + this.iacLink + ", cancelLink=" + this.cancelLink + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.callId);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeParcelable(this.peerName, flags);
        parcel.writeParcelable(this.peerAvatar, flags);
        parcel.writeParcelable(this.peerRating, flags);
        parcel.writeParcelable(this.peerCallerReviewCount, flags);
        parcel.writeString(this.scenario);
        parcel.writeString(this.status);
        parcel.writeString(this.direction.name());
        Long l12 = this.duration;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.itemId);
        parcel.writeParcelable(this.itemTitle, flags);
        parcel.writeParcelable(this.itemPrice, flags);
        parcel.writeParcelable(this.itemImage, flags);
        parcel.writeParcelable(this.iacLink, flags);
        parcel.writeParcelable(this.cancelLink, flags);
    }
}
