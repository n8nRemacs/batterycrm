package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileResult.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\rR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0011¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfile;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ExtendedProfileResultOk;", "Lcom/avito/android/remote/model/ExtendedProfile$ProfileData;", "data", "", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "widgets", "Lcom/avito/android/remote/model/ExtendedProfileBeduin;", BeduinParameter.TYPE, "<init>", "(Lcom/avito/android/remote/model/ExtendedProfile$ProfileData;Ljava/util/List;Lcom/avito/android/remote/model/ExtendedProfileBeduin;)V", "component1", "()Lcom/avito/android/remote/model/ExtendedProfile$ProfileData;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/ExtendedProfileBeduin;", "copy", "(Lcom/avito/android/remote/model/ExtendedProfile$ProfileData;Ljava/util/List;Lcom/avito/android/remote/model/ExtendedProfileBeduin;)Lcom/avito/android/remote/model/ExtendedProfile;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ExtendedProfile$ProfileData;", "getData", "Ljava/util/List;", "getWidgets", "Lcom/avito/android/remote/model/ExtendedProfileBeduin;", "getBeduin", "ProfileData", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfile implements Parcelable, ExtendedProfileResultOk {

    @k
    public static final Parcelable.Creator<ExtendedProfile> CREATOR = new Creator();

    @c(BeduinParameter.TYPE)
    @l
    private final ExtendedProfileBeduin beduin;

    @c("data")
    @k
    private final ProfileData data;

    @c("widgets")
    @l
    private final List<ExtendedProfileElement> widgets;

    /* compiled from: ExtendedProfileResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfile createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ProfileData profileDataCreateFromParcel = ProfileData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ExtendedProfile.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ExtendedProfile(profileDataCreateFromParcel, arrayList, parcel.readInt() != 0 ? ExtendedProfileBeduin.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfile[] newArray(int i12) {
            return new ExtendedProfile[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfile(@k ProfileData profileData, @l List<? extends ExtendedProfileElement> list, @l ExtendedProfileBeduin extendedProfileBeduin) {
        this.data = profileData;
        this.widgets = list;
        this.beduin = extendedProfileBeduin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExtendedProfile copy$default(ExtendedProfile extendedProfile, ProfileData profileData, List list, ExtendedProfileBeduin extendedProfileBeduin, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            profileData = extendedProfile.data;
        }
        if ((i12 & 2) != 0) {
            list = extendedProfile.widgets;
        }
        if ((i12 & 4) != 0) {
            extendedProfileBeduin = extendedProfile.beduin;
        }
        return extendedProfile.copy(profileData, list, extendedProfileBeduin);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final ProfileData getData() {
        return this.data;
    }

    @l
    public final List<ExtendedProfileElement> component2() {
        return this.widgets;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ExtendedProfileBeduin getBeduin() {
        return this.beduin;
    }

    @k
    public final ExtendedProfile copy(@k ProfileData data, @l List<? extends ExtendedProfileElement> widgets, @l ExtendedProfileBeduin beduin) {
        return new ExtendedProfile(data, widgets, beduin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfile)) {
            return false;
        }
        ExtendedProfile extendedProfile = (ExtendedProfile) other;
        return L.f(this.data, extendedProfile.data) && L.f(this.widgets, extendedProfile.widgets) && L.f(this.beduin, extendedProfile.beduin);
    }

    @l
    public final ExtendedProfileBeduin getBeduin() {
        return this.beduin;
    }

    @k
    public final ProfileData getData() {
        return this.data;
    }

    @l
    public final List<ExtendedProfileElement> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int iHashCode = this.data.hashCode() * 31;
        List<ExtendedProfileElement> list = this.widgets;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        ExtendedProfileBeduin extendedProfileBeduin = this.beduin;
        return iHashCode2 + (extendedProfileBeduin != null ? extendedProfileBeduin.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ExtendedProfile(data=" + this.data + ", widgets=" + this.widgets + ", beduin=" + this.beduin + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.data.writeToParcel(parcel, flags);
        List<ExtendedProfileElement> list = this.widgets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        ExtendedProfileBeduin extendedProfileBeduin = this.beduin;
        if (extendedProfileBeduin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedProfileBeduin.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: ExtendedProfileResult.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001GBm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0016J\u0086\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020)HÖ\u0001¢\u0006\u0004\b0\u0010+J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020)HÖ\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b=\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\b?\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bA\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bB\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\b\u0011\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\bF\u0010\u0016¨\u0006H"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfile$ProfileData;", "Landroid/os/Parcelable;", "", "name", "hashUserId", "Lcom/avito/android/remote/model/AvatarShape;", "avatarShape", "Lcom/avito/android/remote/model/Image;", "avatar", "Lcom/avito/android/remote/model/advert_details/UserIconType;", "profileType", "Lcom/avito/android/remote/model/Sharing;", "sharing", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/remote/model/ExtendedProfile$ProfileData$AnalyticParams;", "analyticParams", "", "isNeedToHideItemImages", "uxFeedbackEventName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AvatarShape;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/advert_details/UserIconType;Lcom/avito/android/remote/model/Sharing;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfile$ProfileData$AnalyticParams;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/AvatarShape;", "component4", "()Lcom/avito/android/remote/model/Image;", "component5", "()Lcom/avito/android/remote/model/advert_details/UserIconType;", "component6", "()Lcom/avito/android/remote/model/Sharing;", "component7", "component8", "()Lcom/avito/android/remote/model/ExtendedProfile$ProfileData$AnalyticParams;", "component9", "()Ljava/lang/Boolean;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AvatarShape;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/advert_details/UserIconType;Lcom/avito/android/remote/model/Sharing;Ljava/lang/String;Lcom/avito/android/remote/model/ExtendedProfile$ProfileData$AnalyticParams;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfile$ProfileData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getHashUserId", "Lcom/avito/android/remote/model/AvatarShape;", "getAvatarShape", "Lcom/avito/android/remote/model/Image;", "getAvatar", "Lcom/avito/android/remote/model/advert_details/UserIconType;", "getProfileType", "Lcom/avito/android/remote/model/Sharing;", "getSharing", "getDisclaimer", "Lcom/avito/android/remote/model/ExtendedProfile$ProfileData$AnalyticParams;", "getAnalyticParams", "Ljava/lang/Boolean;", "getUxFeedbackEventName", "AnalyticParams", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ProfileData implements Parcelable {

        @k
        public static final Parcelable.Creator<ProfileData> CREATOR = new Creator();

        @c("analyticParams")
        @l
        private final AnalyticParams analyticParams;

        @c("avatar")
        @l
        private final Image avatar;

        @c("avatarShape")
        @l
        private final AvatarShape avatarShape;

        @c(ServiceTransportationWidget.DisclaimerField.TYPE)
        @l
        private final String disclaimer;

        @c("profileUserHash")
        @l
        private final String hashUserId;

        @c("isNeedToHideItemImages")
        @l
        private final Boolean isNeedToHideItemImages;

        @c("username")
        @k
        private final String name;

        @c("profileType")
        @l
        private final UserIconType profileType;

        @c("sharing")
        @l
        private final Sharing sharing;

        @c("uxFeedbackEventName")
        @l
        private final String uxFeedbackEventName;

        /* compiled from: ExtendedProfileResult.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfile$ProfileData$AnalyticParams;", "Landroid/os/Parcelable;", "", "fromPage", "profileSession", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfile$ProfileData$AnalyticParams;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getFromPage", "getProfileSession", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AnalyticParams implements Parcelable {

            @k
            public static final Parcelable.Creator<AnalyticParams> CREATOR = new Creator();

            @c("fromPage")
            @l
            private final String fromPage;

            @c("bpSession")
            @l
            private final String profileSession;

            /* compiled from: ExtendedProfileResult.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AnalyticParams> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final AnalyticParams createFromParcel(@k Parcel parcel) {
                    return new AnalyticParams(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final AnalyticParams[] newArray(int i12) {
                    return new AnalyticParams[i12];
                }
            }

            public AnalyticParams(@l String str, @l String str2) {
                this.fromPage = str;
                this.profileSession = str2;
            }

            public static /* synthetic */ AnalyticParams copy$default(AnalyticParams analyticParams, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = analyticParams.fromPage;
                }
                if ((i12 & 2) != 0) {
                    str2 = analyticParams.profileSession;
                }
                return analyticParams.copy(str, str2);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getFromPage() {
                return this.fromPage;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getProfileSession() {
                return this.profileSession;
            }

            @k
            public final AnalyticParams copy(@l String fromPage, @l String profileSession) {
                return new AnalyticParams(fromPage, profileSession);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AnalyticParams)) {
                    return false;
                }
                AnalyticParams analyticParams = (AnalyticParams) other;
                return L.f(this.fromPage, analyticParams.fromPage) && L.f(this.profileSession, analyticParams.profileSession);
            }

            @l
            public final String getFromPage() {
                return this.fromPage;
            }

            @l
            public final String getProfileSession() {
                return this.profileSession;
            }

            public int hashCode() {
                String str = this.fromPage;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.profileSession;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("AnalyticParams(fromPage=");
                sb2.append(this.fromPage);
                sb2.append(", profileSession=");
                return C22026a.c(sb2, this.profileSession, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.fromPage);
                parcel.writeString(this.profileSession);
            }
        }

        /* compiled from: ExtendedProfileResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProfileData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ProfileData createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                AvatarShape avatarShapeValueOf = parcel.readInt() == 0 ? null : AvatarShape.valueOf(parcel.readString());
                Image image = (Image) parcel.readParcelable(ProfileData.class.getClassLoader());
                UserIconType userIconTypeValueOf = parcel.readInt() == 0 ? null : UserIconType.valueOf(parcel.readString());
                Sharing sharing = (Sharing) parcel.readParcelable(ProfileData.class.getClassLoader());
                String string3 = parcel.readString();
                AnalyticParams analyticParamsCreateFromParcel = parcel.readInt() == 0 ? null : AnalyticParams.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ProfileData(string, string2, avatarShapeValueOf, image, userIconTypeValueOf, sharing, string3, analyticParamsCreateFromParcel, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ProfileData[] newArray(int i12) {
                return new ProfileData[i12];
            }
        }

        public ProfileData(@k String str, @l String str2, @l AvatarShape avatarShape, @l Image image, @l UserIconType userIconType, @l Sharing sharing, @l String str3, @l AnalyticParams analyticParams, @l Boolean bool, @l String str4) {
            this.name = str;
            this.hashUserId = str2;
            this.avatarShape = avatarShape;
            this.avatar = image;
            this.profileType = userIconType;
            this.sharing = sharing;
            this.disclaimer = str3;
            this.analyticParams = analyticParams;
            this.isNeedToHideItemImages = bool;
            this.uxFeedbackEventName = str4;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component10, reason: from getter */
        public final String getUxFeedbackEventName() {
            return this.uxFeedbackEventName;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getHashUserId() {
            return this.hashUserId;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AvatarShape getAvatarShape() {
            return this.avatarShape;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final UserIconType getProfileType() {
            return this.profileType;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final Sharing getSharing() {
            return this.sharing;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final AnalyticParams getAnalyticParams() {
            return this.analyticParams;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final Boolean getIsNeedToHideItemImages() {
            return this.isNeedToHideItemImages;
        }

        @k
        public final ProfileData copy(@k String name, @l String hashUserId, @l AvatarShape avatarShape, @l Image avatar, @l UserIconType profileType, @l Sharing sharing, @l String disclaimer, @l AnalyticParams analyticParams, @l Boolean isNeedToHideItemImages, @l String uxFeedbackEventName) {
            return new ProfileData(name, hashUserId, avatarShape, avatar, profileType, sharing, disclaimer, analyticParams, isNeedToHideItemImages, uxFeedbackEventName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProfileData)) {
                return false;
            }
            ProfileData profileData = (ProfileData) other;
            return L.f(this.name, profileData.name) && L.f(this.hashUserId, profileData.hashUserId) && this.avatarShape == profileData.avatarShape && L.f(this.avatar, profileData.avatar) && this.profileType == profileData.profileType && L.f(this.sharing, profileData.sharing) && L.f(this.disclaimer, profileData.disclaimer) && L.f(this.analyticParams, profileData.analyticParams) && L.f(this.isNeedToHideItemImages, profileData.isNeedToHideItemImages) && L.f(this.uxFeedbackEventName, profileData.uxFeedbackEventName);
        }

        @l
        public final AnalyticParams getAnalyticParams() {
            return this.analyticParams;
        }

        @l
        public final Image getAvatar() {
            return this.avatar;
        }

        @l
        public final AvatarShape getAvatarShape() {
            return this.avatarShape;
        }

        @l
        public final String getDisclaimer() {
            return this.disclaimer;
        }

        @l
        public final String getHashUserId() {
            return this.hashUserId;
        }

        @k
        public final String getName() {
            return this.name;
        }

        @l
        public final UserIconType getProfileType() {
            return this.profileType;
        }

        @l
        public final Sharing getSharing() {
            return this.sharing;
        }

        @l
        public final String getUxFeedbackEventName() {
            return this.uxFeedbackEventName;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.hashUserId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AvatarShape avatarShape = this.avatarShape;
            int iHashCode3 = (iHashCode2 + (avatarShape == null ? 0 : avatarShape.hashCode())) * 31;
            Image image = this.avatar;
            int iHashCode4 = (iHashCode3 + (image == null ? 0 : image.hashCode())) * 31;
            UserIconType userIconType = this.profileType;
            int iHashCode5 = (iHashCode4 + (userIconType == null ? 0 : userIconType.hashCode())) * 31;
            Sharing sharing = this.sharing;
            int iHashCode6 = (iHashCode5 + (sharing == null ? 0 : sharing.hashCode())) * 31;
            String str2 = this.disclaimer;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            AnalyticParams analyticParams = this.analyticParams;
            int iHashCode8 = (iHashCode7 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
            Boolean bool = this.isNeedToHideItemImages;
            int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.uxFeedbackEventName;
            return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
        }

        @l
        public final Boolean isNeedToHideItemImages() {
            return this.isNeedToHideItemImages;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ProfileData(name=");
            sb2.append(this.name);
            sb2.append(", hashUserId=");
            sb2.append(this.hashUserId);
            sb2.append(", avatarShape=");
            sb2.append(this.avatarShape);
            sb2.append(", avatar=");
            sb2.append(this.avatar);
            sb2.append(", profileType=");
            sb2.append(this.profileType);
            sb2.append(", sharing=");
            sb2.append(this.sharing);
            sb2.append(", disclaimer=");
            sb2.append(this.disclaimer);
            sb2.append(", analyticParams=");
            sb2.append(this.analyticParams);
            sb2.append(", isNeedToHideItemImages=");
            sb2.append(this.isNeedToHideItemImages);
            sb2.append(", uxFeedbackEventName=");
            return C22026a.c(sb2, this.uxFeedbackEventName, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.hashUserId);
            AvatarShape avatarShape = this.avatarShape;
            if (avatarShape == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(avatarShape.name());
            }
            parcel.writeParcelable(this.avatar, flags);
            UserIconType userIconType = this.profileType;
            if (userIconType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(userIconType.name());
            }
            parcel.writeParcelable(this.sharing, flags);
            parcel.writeString(this.disclaimer);
            AnalyticParams analyticParams = this.analyticParams;
            if (analyticParams == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                analyticParams.writeToParcel(parcel, flags);
            }
            Boolean bool = this.isNeedToHideItemImages;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.uxFeedbackEventName);
        }

        public /* synthetic */ ProfileData(String str, String str2, AvatarShape avatarShape, Image image, UserIconType userIconType, Sharing sharing, String str3, AnalyticParams analyticParams, Boolean bool, String str4, int i12, C42822w c42822w) {
            this(str, str2, avatarShape, image, userIconType, sharing, str3, analyticParams, (i12 & 256) != 0 ? null : bool, (i12 & 512) != 0 ? null : str4);
        }
    }
}
