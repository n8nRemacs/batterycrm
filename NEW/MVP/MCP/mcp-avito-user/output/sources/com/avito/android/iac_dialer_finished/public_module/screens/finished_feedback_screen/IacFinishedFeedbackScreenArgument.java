package com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen;

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
import com.avito.android.iac_dialer_models.abstract_module.IacPiiImage;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiInt;
import com.avito.android.iac_dialer_models.abstract_module.IacPiiString;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedFeedbackScreenArgument.kt */
@d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0019\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001aJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015HÆ\u0003¢\u0006\u0004\b+\u0010,J\u009e\u0001\u0010-\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001aJ\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u00052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000200HÖ\u0001¢\u0006\u0004\b7\u00102J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000200HÖ\u0001¢\u0006\u0004\b<\u0010=R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010>\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\b\u0006\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bE\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010#R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bH\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\bI\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bK\u0010'R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\bL\u0010\u001aR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u0010*R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010O\u001a\u0004\bP\u0010,¨\u0006Q"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", FailedBinderCallBack.CALLER_ID, "", "isVideo", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "peerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "peerAvatar", "peerRating", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "peerCallerReviewCount", "scenario", "status", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "direction", "itemId", "", "duration", "", "availableProblems", "<init>", "(Ljava/lang/String;ZLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "component4", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "component5", "component6", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "component7", "component8", "component9", "()Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "component10", "component11", "()Ljava/lang/Long;", "component12", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZLcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;)Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCallId", "Z", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiString;", "getPeerName", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiImage;", "getPeerAvatar", "getPeerRating", "Lcom/avito/android/iac_dialer_models/abstract_module/IacPiiInt;", "getPeerCallerReviewCount", "getScenario", "getStatus", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCallDirection;", "getDirection", "getItemId", "Ljava/lang/Long;", "getDuration", "Ljava/util/List;", "getAvailableProblems", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacFinishedFeedbackScreenArgument implements Parcelable {

    @k
    public static final Parcelable.Creator<IacFinishedFeedbackScreenArgument> CREATOR = new a();

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

    /* compiled from: IacFinishedFeedbackScreenArgument.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacFinishedFeedbackScreenArgument> {
        @Override // android.os.Parcelable.Creator
        public final IacFinishedFeedbackScreenArgument createFromParcel(Parcel parcel) {
            return new IacFinishedFeedbackScreenArgument(parcel.readString(), parcel.readInt() != 0, (IacPiiString) parcel.readParcelable(IacFinishedFeedbackScreenArgument.class.getClassLoader()), (IacPiiImage) parcel.readParcelable(IacFinishedFeedbackScreenArgument.class.getClassLoader()), (IacPiiString) parcel.readParcelable(IacFinishedFeedbackScreenArgument.class.getClassLoader()), (IacPiiInt) parcel.readParcelable(IacFinishedFeedbackScreenArgument.class.getClassLoader()), parcel.readString(), parcel.readString(), IacCallDirection.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final IacFinishedFeedbackScreenArgument[] newArray(int i12) {
            return new IacFinishedFeedbackScreenArgument[i12];
        }
    }

    public IacFinishedFeedbackScreenArgument(@k String str, boolean z12, @l IacPiiString iacPiiString, @l IacPiiImage iacPiiImage, @l IacPiiString iacPiiString2, @l IacPiiInt iacPiiInt, @k String str2, @k String str3, @k IacCallDirection iacCallDirection, @l String str4, @l Long l12, @k List<String> list) {
        this.callId = str;
        this.isVideo = z12;
        this.peerName = iacPiiString;
        this.peerAvatar = iacPiiImage;
        this.peerRating = iacPiiString2;
        this.peerCallerReviewCount = iacPiiInt;
        this.scenario = str2;
        this.status = str3;
        this.direction = iacCallDirection;
        this.itemId = str4;
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
    public final IacFinishedFeedbackScreenArgument copy(@k String callId, boolean isVideo, @l IacPiiString peerName, @l IacPiiImage peerAvatar, @l IacPiiString peerRating, @l IacPiiInt peerCallerReviewCount, @k String scenario, @k String status, @k IacCallDirection direction, @l String itemId, @l Long duration, @k List<String> availableProblems) {
        return new IacFinishedFeedbackScreenArgument(callId, isVideo, peerName, peerAvatar, peerRating, peerCallerReviewCount, scenario, status, direction, itemId, duration, availableProblems);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacFinishedFeedbackScreenArgument)) {
            return false;
        }
        IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument = (IacFinishedFeedbackScreenArgument) other;
        return L.f(this.callId, iacFinishedFeedbackScreenArgument.callId) && this.isVideo == iacFinishedFeedbackScreenArgument.isVideo && L.f(this.peerName, iacFinishedFeedbackScreenArgument.peerName) && L.f(this.peerAvatar, iacFinishedFeedbackScreenArgument.peerAvatar) && L.f(this.peerRating, iacFinishedFeedbackScreenArgument.peerRating) && L.f(this.peerCallerReviewCount, iacFinishedFeedbackScreenArgument.peerCallerReviewCount) && L.f(this.scenario, iacFinishedFeedbackScreenArgument.scenario) && L.f(this.status, iacFinishedFeedbackScreenArgument.status) && this.direction == iacFinishedFeedbackScreenArgument.direction && L.f(this.itemId, iacFinishedFeedbackScreenArgument.itemId) && L.f(this.duration, iacFinishedFeedbackScreenArgument.duration) && L.f(this.availableProblems, iacFinishedFeedbackScreenArgument.availableProblems);
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
        String str = this.itemId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Long l12 = this.duration;
        return this.availableProblems.hashCode() + ((iHashCode5 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    public final boolean isVideo() {
        return this.isVideo;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacFinishedFeedbackScreenArgument(callId=");
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
        parcel.writeParcelable(this.peerName, flags);
        parcel.writeParcelable(this.peerAvatar, flags);
        parcel.writeParcelable(this.peerRating, flags);
        parcel.writeParcelable(this.peerCallerReviewCount, flags);
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
