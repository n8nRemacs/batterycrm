package com.avito.android.iac_dialer_finished.public_module.screens.finished_mic_request_screen;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.iac_dialer_models.abstract_module.IacCallDirection;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiDeepLink;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiInt;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacFinishedMicRequestScreenLink.kt */
@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0001[B¡\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001e\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010\u001fJ\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJ\u0012\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b1\u0010$J\u0012\u00102\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b4\u00103JÊ\u0001\u00105\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001fJ\u0010\u00108\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00052\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b>\u00109J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bC\u0010DR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\b\u0006\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bH\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bK\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010L\u001a\u0004\bM\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bN\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bO\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010R\u001a\u0004\bS\u0010-R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bT\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bU\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bV\u0010\u001fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\bW\u0010$R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bY\u00103R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0018\u0010X\u001a\u0004\bZ\u00103¨\u0006\\"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "peerName", "Lcom/avito/android/remote/model/Image;", "peerAvatar", "peerRating", "", "peerCallerReviewCount", "scenario", "status", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "", "duration", "itemId", "itemTitle", "itemPrice", "itemImage", "iacLink", "cancelLink", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "toScreenArgument", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenArgument;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component10", "()Ljava/lang/Long;", "component11", "component12", "component13", "component14", "component15", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component16", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenLink;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCallId", "Z", "getPeerName", "Lcom/avito/android/remote/model/Image;", "getPeerAvatar", "getPeerRating", "Ljava/lang/Integer;", "getPeerCallerReviewCount", "getScenario", "getStatus", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "Ljava/lang/Long;", "getDuration", "getItemId", "getItemTitle", "getItemPrice", "getItemImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getIacLink", "getCancelLink", "b", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacFinishedMicRequestScreenLink extends DeepLink {

    @k
    public static final Parcelable.Creator<IacFinishedMicRequestScreenLink> CREATOR = new a();

    @k
    private final String callId;

    @l
    private final DeepLink cancelLink;

    @k
    private final IacCallDirection direction;

    @l
    private final Long duration;

    @l
    private final DeepLink iacLink;
    private final boolean isVideo;

    @l
    private final String itemId;

    @l
    private final Image itemImage;

    @l
    private final String itemPrice;

    @l
    private final String itemTitle;

    @l
    private final Image peerAvatar;

    @l
    private final Integer peerCallerReviewCount;

    @l
    private final String peerName;

    @l
    private final String peerRating;

    @k
    private final String scenario;

    @k
    private final String status;

    /* compiled from: IacFinishedMicRequestScreenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacFinishedMicRequestScreenLink> {
        @Override // android.os.Parcelable.Creator
        public final IacFinishedMicRequestScreenLink createFromParcel(Parcel parcel) {
            return new IacFinishedMicRequestScreenLink(parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Image) parcel.readParcelable(IacFinishedMicRequestScreenLink.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), IacCallDirection.valueOf(parcel.readString()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(IacFinishedMicRequestScreenLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(IacFinishedMicRequestScreenLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(IacFinishedMicRequestScreenLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IacFinishedMicRequestScreenLink[] newArray(int i12) {
            return new IacFinishedMicRequestScreenLink[i12];
        }
    }

    /* compiled from: IacFinishedMicRequestScreenLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_mic_request_screen/IacFinishedMicRequestScreenLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {
        static {
            new b();
        }
    }

    public IacFinishedMicRequestScreenLink(@k String str, boolean z12, @l String str2, @l Image image, @l String str3, @l Integer num, @k String str4, @k String str5, @k IacCallDirection iacCallDirection, @l Long l12, @l String str6, @l String str7, @l String str8, @l Image image2, @l DeepLink deepLink, @l DeepLink deepLink2) {
        this.callId = str;
        this.isVideo = z12;
        this.peerName = str2;
        this.peerAvatar = image;
        this.peerRating = str3;
        this.peerCallerReviewCount = num;
        this.scenario = str4;
        this.status = str5;
        this.direction = iacCallDirection;
        this.duration = l12;
        this.itemId = str6;
        this.itemTitle = str7;
        this.itemPrice = str8;
        this.itemImage = image2;
        this.iacLink = deepLink;
        this.cancelLink = deepLink2;
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
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final String getItemPrice() {
        return this.itemPrice;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Image getItemImage() {
        return this.itemImage;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final DeepLink getIacLink() {
        return this.iacLink;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final DeepLink getCancelLink() {
        return this.cancelLink;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVideo() {
        return this.isVideo;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getPeerName() {
        return this.peerName;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Image getPeerAvatar() {
        return this.peerAvatar;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getPeerRating() {
        return this.peerRating;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getPeerCallerReviewCount() {
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
    public final IacFinishedMicRequestScreenLink copy(@k String callId, boolean isVideo, @l String peerName, @l Image peerAvatar, @l String peerRating, @l Integer peerCallerReviewCount, @k String scenario, @k String status, @k IacCallDirection direction, @l Long duration, @l String itemId, @l String itemTitle, @l String itemPrice, @l Image itemImage, @l DeepLink iacLink, @l DeepLink cancelLink) {
        return new IacFinishedMicRequestScreenLink(callId, isVideo, peerName, peerAvatar, peerRating, peerCallerReviewCount, scenario, status, direction, duration, itemId, itemTitle, itemPrice, itemImage, iacLink, cancelLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacFinishedMicRequestScreenLink)) {
            return false;
        }
        IacFinishedMicRequestScreenLink iacFinishedMicRequestScreenLink = (IacFinishedMicRequestScreenLink) other;
        return L.f(this.callId, iacFinishedMicRequestScreenLink.callId) && this.isVideo == iacFinishedMicRequestScreenLink.isVideo && L.f(this.peerName, iacFinishedMicRequestScreenLink.peerName) && L.f(this.peerAvatar, iacFinishedMicRequestScreenLink.peerAvatar) && L.f(this.peerRating, iacFinishedMicRequestScreenLink.peerRating) && L.f(this.peerCallerReviewCount, iacFinishedMicRequestScreenLink.peerCallerReviewCount) && L.f(this.scenario, iacFinishedMicRequestScreenLink.scenario) && L.f(this.status, iacFinishedMicRequestScreenLink.status) && this.direction == iacFinishedMicRequestScreenLink.direction && L.f(this.duration, iacFinishedMicRequestScreenLink.duration) && L.f(this.itemId, iacFinishedMicRequestScreenLink.itemId) && L.f(this.itemTitle, iacFinishedMicRequestScreenLink.itemTitle) && L.f(this.itemPrice, iacFinishedMicRequestScreenLink.itemPrice) && L.f(this.itemImage, iacFinishedMicRequestScreenLink.itemImage) && L.f(this.iacLink, iacFinishedMicRequestScreenLink.iacLink) && L.f(this.cancelLink, iacFinishedMicRequestScreenLink.cancelLink);
    }

    @k
    public final String getCallId() {
        return this.callId;
    }

    @l
    public final DeepLink getCancelLink() {
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
    public final DeepLink getIacLink() {
        return this.iacLink;
    }

    @l
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final Image getItemImage() {
        return this.itemImage;
    }

    @l
    public final String getItemPrice() {
        return this.itemPrice;
    }

    @l
    public final String getItemTitle() {
        return this.itemTitle;
    }

    @l
    public final Image getPeerAvatar() {
        return this.peerAvatar;
    }

    @l
    public final Integer getPeerCallerReviewCount() {
        return this.peerCallerReviewCount;
    }

    @l
    public final String getPeerName() {
        return this.peerName;
    }

    @l
    public final String getPeerRating() {
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
        String str = this.peerName;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.peerAvatar;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.peerRating;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.peerCallerReviewCount;
        int iHashCode4 = (this.direction.hashCode() + H.d(H.d((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.scenario), 31, this.status)) * 31;
        Long l12 = this.duration;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.itemId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.itemTitle;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.itemPrice;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Image image2 = this.itemImage;
        int iHashCode9 = (iHashCode8 + (image2 == null ? 0 : image2.hashCode())) * 31;
        DeepLink deepLink = this.iacLink;
        int iHashCode10 = (iHashCode9 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.cancelLink;
        return iHashCode10 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public final IacFinishedMicRequestScreenArgument toScreenArgument() {
        String str = this.callId;
        boolean z12 = this.isVideo;
        String str2 = this.peerName;
        IacPiiString iacPiiString = str2 != null ? new IacPiiString(str2) : null;
        Image image = this.peerAvatar;
        IacPiiImage iacPiiImage = image != null ? new IacPiiImage(image) : null;
        String str3 = this.peerRating;
        IacPiiString iacPiiString2 = str3 != null ? new IacPiiString(str3) : null;
        Integer num = this.peerCallerReviewCount;
        IacPiiInt iacPiiInt = num != null ? new IacPiiInt(num.intValue()) : null;
        String str4 = this.scenario;
        String str5 = this.status;
        IacCallDirection iacCallDirection = this.direction;
        Long l12 = this.duration;
        String str6 = this.itemId;
        String str7 = this.itemTitle;
        IacPiiString iacPiiString3 = str7 != null ? new IacPiiString(str7) : null;
        String str8 = this.itemPrice;
        IacPiiString iacPiiString4 = str8 != null ? new IacPiiString(str8) : null;
        Image image2 = this.itemImage;
        IacPiiImage iacPiiImage2 = image2 != null ? new IacPiiImage(image2) : null;
        DeepLink deepLink = this.iacLink;
        IacPiiDeepLink iacPiiDeepLink = deepLink != null ? new IacPiiDeepLink(deepLink) : null;
        DeepLink deepLink2 = this.cancelLink;
        return new IacFinishedMicRequestScreenArgument(str, z12, iacPiiString, iacPiiImage, iacPiiString2, iacPiiInt, str4, str5, iacCallDirection, l12, str6, iacPiiString3, iacPiiString4, iacPiiImage2, iacPiiDeepLink, deepLink2 != null ? new IacPiiDeepLink(deepLink2) : null);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacFinishedMicRequestScreenLink(callId=");
        sb2.append(this.callId);
        sb2.append(", isVideo=");
        sb2.append(this.isVideo);
        sb2.append(", peerName=");
        sb2.append(this.peerName);
        sb2.append(", peerAvatar=");
        sb2.append(this.peerAvatar);
        sb2.append(", peerRating=");
        sb2.append(this.peerRating);
        sb2.append(", peerCallerReviewCount=");
        sb2.append(this.peerCallerReviewCount);
        sb2.append(", scenario=");
        sb2.append(this.scenario);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", direction=");
        sb2.append(this.direction);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", itemId=");
        sb2.append(this.itemId);
        sb2.append(", itemTitle=");
        sb2.append(this.itemTitle);
        sb2.append(", itemPrice=");
        sb2.append(this.itemPrice);
        sb2.append(", itemImage=");
        sb2.append(this.itemImage);
        sb2.append(", iacLink=");
        sb2.append(this.iacLink);
        sb2.append(", cancelLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.cancelLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.callId);
        parcel.writeInt(this.isVideo ? 1 : 0);
        parcel.writeString(this.peerName);
        parcel.writeParcelable(this.peerAvatar, flags);
        parcel.writeString(this.peerRating);
        Integer num = this.peerCallerReviewCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
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
        parcel.writeString(this.itemTitle);
        parcel.writeString(this.itemPrice);
        parcel.writeParcelable(this.itemImage, flags);
        parcel.writeParcelable(this.iacLink, flags);
        parcel.writeParcelable(this.cancelLink, flags);
    }
}
