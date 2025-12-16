package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReferralEntryPoint.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b.\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b/\u0010\u000e¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/ReferralEntryPoint;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "title", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/DeeplinkAction;", "action", "userType", "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/DeeplinkAction;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()Lcom/avito/android/remote/model/DeeplinkAction;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/DeeplinkAction;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/user_profile/items/ReferralEntryPoint;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/DeeplinkAction;", "getAction", "getUserType", "getBadge", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ReferralEntryPoint extends UserProfileItem {

    @k
    public static final Parcelable.Creator<ReferralEntryPoint> CREATOR = new Creator();

    @c("action")
    @k
    private final DeeplinkAction action;

    @c("badge")
    @l
    private final String badge;

    @c("description")
    @k
    private final String description;

    @c("imageSquare")
    @k
    private final UniversalImage image;

    @c("title")
    @k
    private final String title;

    @c("userType")
    @k
    private final String userType;

    /* compiled from: ReferralEntryPoint.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReferralEntryPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReferralEntryPoint createFromParcel(@k Parcel parcel) {
            return new ReferralEntryPoint(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(ReferralEntryPoint.class.getClassLoader()), (DeeplinkAction) parcel.readParcelable(ReferralEntryPoint.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ReferralEntryPoint[] newArray(int i12) {
            return new ReferralEntryPoint[i12];
        }
    }

    public ReferralEntryPoint(@k String str, @k String str2, @k UniversalImage universalImage, @k DeeplinkAction deeplinkAction, @k String str3, @l String str4) {
        this.title = str;
        this.description = str2;
        this.image = universalImage;
        this.action = deeplinkAction;
        this.userType = str3;
        this.badge = str4;
    }

    public static /* synthetic */ ReferralEntryPoint copy$default(ReferralEntryPoint referralEntryPoint, String str, String str2, UniversalImage universalImage, DeeplinkAction deeplinkAction, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = referralEntryPoint.title;
        }
        if ((i12 & 2) != 0) {
            str2 = referralEntryPoint.description;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            universalImage = referralEntryPoint.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 8) != 0) {
            deeplinkAction = referralEntryPoint.action;
        }
        DeeplinkAction deeplinkAction2 = deeplinkAction;
        if ((i12 & 16) != 0) {
            str3 = referralEntryPoint.userType;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            str4 = referralEntryPoint.badge;
        }
        return referralEntryPoint.copy(str, str5, universalImage2, deeplinkAction2, str6, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    @k
    public final ReferralEntryPoint copy(@k String title, @k String description, @k UniversalImage image, @k DeeplinkAction action, @k String userType, @l String badge) {
        return new ReferralEntryPoint(title, description, image, action, userType, badge);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferralEntryPoint)) {
            return false;
        }
        ReferralEntryPoint referralEntryPoint = (ReferralEntryPoint) other;
        return L.f(this.title, referralEntryPoint.title) && L.f(this.description, referralEntryPoint.description) && L.f(this.image, referralEntryPoint.image) && L.f(this.action, referralEntryPoint.action) && L.f(this.userType, referralEntryPoint.userType) && L.f(this.badge, referralEntryPoint.badge);
    }

    @k
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @l
    public final String getBadge() {
        return this.badge;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        int iD2 = H.d((this.action.hashCode() + a.a(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.image)) * 31, 31, this.userType);
        String str = this.badge;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ReferralEntryPoint(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", userType=");
        sb2.append(this.userType);
        sb2.append(", badge=");
        return C22026a.c(sb2, this.badge, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.action, flags);
        parcel.writeString(this.userType);
        parcel.writeString(this.badge);
    }
}
