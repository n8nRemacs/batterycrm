package com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen;

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
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiInt;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacFinishedFeedbackScreenLink.kt */
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001PB}\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0003¢\u0006\u0004\b,\u0010-J\u009e\u0001\u0010.\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u0010\u00101\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b7\u00102J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b<\u0010=R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\b\u0006\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\bA\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bD\u0010\u001cR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010E\u001a\u0004\bF\u0010$R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\bG\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bH\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\bK\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010L\u001a\u0004\bM\u0010+R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bO\u0010-¨\u0006Q"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "peerName", "Lcom/avito/android/remote/model/Image;", "peerAvatar", "peerRating", "", "peerCallerReviewCount", "scenario", "status", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "itemId", "", "duration", "", "availableProblems", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;", "toScreenArgument", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component10", "component11", "()Ljava/lang/Long;", "component12", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenLink;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCallId", "Z", "getPeerName", "Lcom/avito/android/remote/model/Image;", "getPeerAvatar", "getPeerRating", "Ljava/lang/Integer;", "getPeerCallerReviewCount", "getScenario", "getStatus", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "getItemId", "Ljava/lang/Long;", "getDuration", "Ljava/util/List;", "getAvailableProblems", "b", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacFinishedFeedbackScreenLink extends DeepLink {

    @k
    public static final Parcelable.Creator<IacFinishedFeedbackScreenLink> CREATOR = new a();

    @k
    private final List<String> availableProblems;

    @k
    private final String callId;

    @k
    private final IacCallDirection direction;

    @l
    private final Long duration;
    private final boolean isVideo;

    @l
    private final String itemId;

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

    /* compiled from: IacFinishedFeedbackScreenLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacFinishedFeedbackScreenLink> {
        @Override // android.os.Parcelable.Creator
        public final IacFinishedFeedbackScreenLink createFromParcel(Parcel parcel) {
            return new IacFinishedFeedbackScreenLink(parcel.readString(), parcel.readInt() != 0, parcel.readString(), (Image) parcel.readParcelable(IacFinishedFeedbackScreenLink.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), IacCallDirection.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final IacFinishedFeedbackScreenLink[] newArray(int i12) {
            return new IacFinishedFeedbackScreenLink[i12];
        }
    }

    /* compiled from: IacFinishedFeedbackScreenLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {
        static {
            new b();
        }
    }

    public IacFinishedFeedbackScreenLink(@k String str, boolean z12, @l String str2, @l Image image, @l String str3, @l Integer num, @k String str4, @k String str5, @k IacCallDirection iacCallDirection, @l String str6, @l Long l12, @k List<String> list) {
        this.callId = str;
        this.isVideo = z12;
        this.peerName = str2;
        this.peerAvatar = image;
        this.peerRating = str3;
        this.peerCallerReviewCount = num;
        this.scenario = str4;
        this.status = str5;
        this.direction = iacCallDirection;
        this.itemId = str6;
        this.duration = l12;
        this.availableProblems = list;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCallId() {
        return this.callId;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @k
    public final List<String> component12() {
        return this.availableProblems;
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
    public final IacFinishedFeedbackScreenLink copy(@k String callId, boolean isVideo, @l String peerName, @l Image peerAvatar, @l String peerRating, @l Integer peerCallerReviewCount, @k String scenario, @k String status, @k IacCallDirection direction, @l String itemId, @l Long duration, @k List<String> availableProblems) {
        return new IacFinishedFeedbackScreenLink(callId, isVideo, peerName, peerAvatar, peerRating, peerCallerReviewCount, scenario, status, direction, itemId, duration, availableProblems);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacFinishedFeedbackScreenLink)) {
            return false;
        }
        IacFinishedFeedbackScreenLink iacFinishedFeedbackScreenLink = (IacFinishedFeedbackScreenLink) other;
        return L.f(this.callId, iacFinishedFeedbackScreenLink.callId) && this.isVideo == iacFinishedFeedbackScreenLink.isVideo && L.f(this.peerName, iacFinishedFeedbackScreenLink.peerName) && L.f(this.peerAvatar, iacFinishedFeedbackScreenLink.peerAvatar) && L.f(this.peerRating, iacFinishedFeedbackScreenLink.peerRating) && L.f(this.peerCallerReviewCount, iacFinishedFeedbackScreenLink.peerCallerReviewCount) && L.f(this.scenario, iacFinishedFeedbackScreenLink.scenario) && L.f(this.status, iacFinishedFeedbackScreenLink.status) && this.direction == iacFinishedFeedbackScreenLink.direction && L.f(this.itemId, iacFinishedFeedbackScreenLink.itemId) && L.f(this.duration, iacFinishedFeedbackScreenLink.duration) && L.f(this.availableProblems, iacFinishedFeedbackScreenLink.availableProblems);
    }

    @k
    public final List<String> getAvailableProblems() {
        return this.availableProblems;
    }

    @k
    public final String getCallId() {
        return this.callId;
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
    public final String getItemId() {
        return this.itemId;
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
        String str3 = this.itemId;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l12 = this.duration;
        return this.availableProblems.hashCode() + ((iHashCode5 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public final IacFinishedFeedbackScreenArgument toScreenArgument() {
        String str = this.callId;
        boolean z12 = this.isVideo;
        String str2 = this.peerName;
        IacPiiString iacPiiString = str2 != null ? new IacPiiString(str2) : null;
        Image image = this.peerAvatar;
        IacPiiImage iacPiiImage = image != null ? new IacPiiImage(image) : null;
        String str3 = this.peerRating;
        IacPiiString iacPiiString2 = str3 != null ? new IacPiiString(str3) : null;
        Integer num = this.peerCallerReviewCount;
        return new IacFinishedFeedbackScreenArgument(str, z12, iacPiiString, iacPiiImage, iacPiiString2, num != null ? new IacPiiInt(num.intValue()) : null, this.scenario, this.status, this.direction, this.itemId, this.duration, this.availableProblems);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacFinishedFeedbackScreenLink(callId=");
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
        sb2.append(", itemId=");
        sb2.append(this.itemId);
        sb2.append(", duration=");
        sb2.append(this.duration);
        sb2.append(", availableProblems=");
        return H.p(sb2, this.availableProblems, ')');
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
        parcel.writeString(this.itemId);
        Long l12 = this.duration;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeStringList(this.availableProblems);
    }
}
