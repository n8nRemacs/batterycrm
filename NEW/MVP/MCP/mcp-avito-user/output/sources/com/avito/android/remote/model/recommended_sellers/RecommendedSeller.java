package com.avito.android.remote.model.recommended_sellers;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecommendedSeller.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\u0006\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b%\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010-\"\u0004\b.\u0010/R$\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b\u0010\u0010!\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/avito/android/remote/model/recommended_sellers/RecommendedSeller;", "Lcom/avito/android/remote/model/recommended_sellers/RecommendedSellerElement;", "", "userKey", "description", "", "isShop", "Lcom/avito/android/remote/model/Image;", "avatar", "name", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "Lcom/avito/android/remote/model/recommended_sellers/AdvertImageWithOverlay;", "images", "isSubscribed", "isNotificationsActivated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;ZLjava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserKey", "()Ljava/lang/String;", "getDescription", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/Image;", "getAvatar", "()Lcom/avito/android/remote/model/Image;", "getName", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Z", "()Z", "setSubscribed", "(Z)V", "setNotificationsActivated", "(Ljava/lang/Boolean;)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RecommendedSeller implements RecommendedSellerElement {

    @k
    public static final Parcelable.Creator<RecommendedSeller> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("description")
    @l
    private final String description;

    @c("images")
    @l
    private final List<AdvertImageWithOverlay> images;

    @l
    private Boolean isNotificationsActivated;

    @c("isShop")
    @l
    private final Boolean isShop;
    private boolean isSubscribed;

    @c("title")
    @k
    private final String name;

    @c("hashUserId")
    @k
    private final String userKey;

    /* compiled from: RecommendedSeller.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecommendedSeller> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecommendedSeller createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Image image = (Image) parcel.readParcelable(RecommendedSeller.class.getClassLoader());
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(RecommendedSeller.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AdvertImageWithOverlay.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RecommendedSeller(string, string2, boolValueOf, image, string3, deepLink, arrayList, z12, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RecommendedSeller[] newArray(int i12) {
            return new RecommendedSeller[i12];
        }
    }

    public RecommendedSeller(@k String str, @l String str2, @l Boolean bool, @l Image image, @k String str3, @l DeepLink deepLink, @l List<AdvertImageWithOverlay> list, boolean z12, @l Boolean bool2) {
        this.userKey = str;
        this.description = str2;
        this.isShop = bool;
        this.avatar = image;
        this.name = str3;
        this.deepLink = deepLink;
        this.images = list;
        this.isSubscribed = z12;
        this.isNotificationsActivated = bool2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<AdvertImageWithOverlay> getImages() {
        return this.images;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final String getUserKey() {
        return this.userKey;
    }

    @l
    /* renamed from: isNotificationsActivated, reason: from getter */
    public final Boolean getIsNotificationsActivated() {
        return this.isNotificationsActivated;
    }

    @l
    /* renamed from: isShop, reason: from getter */
    public final Boolean getIsShop() {
        return this.isShop;
    }

    /* renamed from: isSubscribed, reason: from getter */
    public final boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    public final void setNotificationsActivated(@l Boolean bool) {
        this.isNotificationsActivated = bool;
    }

    public final void setSubscribed(boolean z12) {
        this.isSubscribed = z12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.userKey);
        parcel.writeString(this.description);
        Boolean bool = this.isShop;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.name);
        parcel.writeParcelable(this.deepLink, flags);
        List<AdvertImageWithOverlay> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((AdvertImageWithOverlay) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeInt(this.isSubscribed ? 1 : 0);
        Boolean bool2 = this.isNotificationsActivated;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    public /* synthetic */ RecommendedSeller(String str, String str2, Boolean bool, Image image, String str3, DeepLink deepLink, List list, boolean z12, Boolean bool2, int i12, C42822w c42822w) {
        this(str, str2, bool, image, str3, deepLink, list, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? null : bool2);
    }
}
