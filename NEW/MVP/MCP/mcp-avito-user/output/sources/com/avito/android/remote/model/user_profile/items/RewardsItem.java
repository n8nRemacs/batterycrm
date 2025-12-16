package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RewardsItem.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJH\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010\r¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/RewardsItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "title", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "badge", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/user_profile/items/RewardsItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getBadge", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RewardsItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<RewardsItem> CREATOR = new Creator();

    @c("badge")
    @l
    private final String badge;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @c("description")
    @l
    private final String description;

    @c("image")
    @l
    private final UniversalImage image;

    @c("title")
    @k
    private final String title;

    /* compiled from: RewardsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RewardsItem createFromParcel(@k Parcel parcel) {
            return new RewardsItem(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(RewardsItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(RewardsItem.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RewardsItem[] newArray(int i12) {
            return new RewardsItem[i12];
        }
    }

    public RewardsItem(@k String str, @l String str2, @l UniversalImage universalImage, @k DeepLink deepLink, @l String str3) {
        this.title = str;
        this.description = str2;
        this.image = universalImage;
        this.deeplink = deepLink;
        this.badge = str3;
    }

    public static /* synthetic */ RewardsItem copy$default(RewardsItem rewardsItem, String str, String str2, UniversalImage universalImage, DeepLink deepLink, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = rewardsItem.title;
        }
        if ((i12 & 2) != 0) {
            str2 = rewardsItem.description;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            universalImage = rewardsItem.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 8) != 0) {
            deepLink = rewardsItem.deeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 16) != 0) {
            str3 = rewardsItem.badge;
        }
        return rewardsItem.copy(str, str4, universalImage2, deepLink2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getBadge() {
        return this.badge;
    }

    @k
    public final RewardsItem copy(@k String title, @l String description, @l UniversalImage image, @k DeepLink deeplink, @l String badge) {
        return new RewardsItem(title, description, image, deeplink, badge);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsItem)) {
            return false;
        }
        RewardsItem rewardsItem = (RewardsItem) other;
        return L.f(this.title, rewardsItem.title) && L.f(this.description, rewardsItem.description) && L.f(this.image, rewardsItem.image) && L.f(this.deeplink, rewardsItem.deeplink) && L.f(this.badge, rewardsItem.badge);
    }

    @l
    public final String getBadge() {
        return this.badge;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iE2 = a.e(this.deeplink, (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31);
        String str2 = this.badge;
        return iE2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RewardsItem(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", badge=");
        return C22026a.c(sb2, this.badge, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.image, flags);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeString(this.badge);
    }
}
