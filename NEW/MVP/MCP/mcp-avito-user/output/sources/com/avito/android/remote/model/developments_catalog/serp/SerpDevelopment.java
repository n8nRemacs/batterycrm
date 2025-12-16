package com.avito.android.remote.model.developments_catalog.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.developer_profile.DeveloperProfile;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.section.SectionElement;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SerpDevelopment.kt */
@d
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0099\u0001\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b-\u0010,R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b.\u0010)R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b/\u0010&R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b0\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b7\u0010)R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b8\u0010)R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010<\u001a\u0004\b=\u0010>R(\u0010@\u001a\u00020?8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b@\u0010A\u0012\u0004\bF\u0010G\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/avito/android/remote/model/developments_catalog/serp/SerpDevelopment;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SerpElement;", "Lcom/avito/android/remote/model/section/SectionElement;", "", "Lcom/avito/android/remote/model/Image;", "imageList", "", "name", "Lcom/avito/android/remote/model/AdvertActions;", "contacts", "galleryContacts", "developer", "additionalLines", "Lcom/avito/android/remote/model/GeoReference;", "geoReferences", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "developmentId", "price", "promoPrice", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/developer_profile/DeveloperProfile;", "developerProfile", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertActions;Lcom/avito/android/remote/model/AdvertActions;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/developer_profile/DeveloperProfile;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getImageList", "()Ljava/util/List;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/AdvertActions;", "getContacts", "()Lcom/avito/android/remote/model/AdvertActions;", "getGalleryContacts", "getDeveloper", "getAdditionalLines", "getGeoReferences", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Integer;", "getDevelopmentId", "()Ljava/lang/Integer;", "getPrice", "getPromoPrice", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "Lcom/avito/android/remote/model/developer_profile/DeveloperProfile;", "getDeveloperProfile", "()Lcom/avito/android/remote/model/developer_profile/DeveloperProfile;", "", "uniqueId", "J", "getUniqueId", "()J", "setUniqueId", "(J)V", "getUniqueId$annotations", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerpDevelopment implements Parcelable, SerpElement, SectionElement {

    @k
    public static final Parcelable.Creator<SerpDevelopment> CREATOR = new Creator();

    @c("additionalLines")
    @l
    private final List<String> additionalLines;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @l
    private final SerpBadgeBar badgeBar;

    @c("contacts")
    @l
    private final AdvertActions contacts;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("developer")
    @l
    private final String developer;

    @c("developerProfile")
    @l
    private final DeveloperProfile developerProfile;

    @c("developmentId")
    @l
    private final Integer developmentId;

    @c("galleryContacts")
    @l
    private final AdvertActions galleryContacts;

    @c("geoReferences")
    @l
    private final List<GeoReference> geoReferences;

    @c("imageList")
    @l
    private final List<Image> imageList;

    @c("name")
    @k
    private final String name;

    @c("price")
    @l
    private final String price;

    @c("promoPrice")
    @l
    private final String promoPrice;
    private long uniqueId;

    /* compiled from: SerpDevelopment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SerpDevelopment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpDevelopment createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(SerpDevelopment.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            String string = parcel.readString();
            AdvertActions advertActionsCreateFromParcel = parcel.readInt() == 0 ? null : AdvertActions.CREATOR.createFromParcel(parcel);
            AdvertActions advertActionsCreateFromParcel2 = parcel.readInt() == 0 ? null : AdvertActions.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(GeoReference.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new SerpDevelopment(arrayList, string, advertActionsCreateFromParcel, advertActionsCreateFromParcel2, string2, arrayListCreateStringArrayList, arrayList2, (DeepLink) parcel.readParcelable(SerpDevelopment.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : SerpBadgeBar.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DeveloperProfile.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpDevelopment[] newArray(int i12) {
            return new SerpDevelopment[i12];
        }
    }

    public SerpDevelopment(@l List<Image> list, @k String str, @l AdvertActions advertActions, @l AdvertActions advertActions2, @l String str2, @l List<String> list2, @l List<GeoReference> list3, @l DeepLink deepLink, @l Integer num, @l String str3, @l String str4, @l SerpBadgeBar serpBadgeBar, @l DeveloperProfile developerProfile) {
        this.imageList = list;
        this.name = str;
        this.contacts = advertActions;
        this.galleryContacts = advertActions2;
        this.developer = str2;
        this.additionalLines = list2;
        this.geoReferences = list3;
        this.deepLink = deepLink;
        this.developmentId = num;
        this.price = str3;
        this.promoPrice = str4;
        this.badgeBar = serpBadgeBar;
        this.developerProfile = developerProfile;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final List<String> getAdditionalLines() {
        return this.additionalLines;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final AdvertActions getContacts() {
        return this.contacts;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getDeveloper() {
        return this.developer;
    }

    @l
    public final DeveloperProfile getDeveloperProfile() {
        return this.developerProfile;
    }

    @l
    public final Integer getDevelopmentId() {
        return this.developmentId;
    }

    @l
    public final AdvertActions getGalleryContacts() {
        return this.galleryContacts;
    }

    @l
    public final List<GeoReference> getGeoReferences() {
        return this.geoReferences;
    }

    @l
    public final List<Image> getImageList() {
        return this.imageList;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final String getPromoPrice() {
        return this.promoPrice;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<Image> list = this.imageList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.name);
        AdvertActions advertActions = this.contacts;
        if (advertActions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertActions.writeToParcel(parcel, flags);
        }
        AdvertActions advertActions2 = this.galleryContacts;
        if (advertActions2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertActions2.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.developer);
        parcel.writeStringList(this.additionalLines);
        List<GeoReference> list2 = this.geoReferences;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((GeoReference) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeParcelable(this.deepLink, flags);
        Integer num = this.developmentId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.price);
        parcel.writeString(this.promoPrice);
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        if (serpBadgeBar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpBadgeBar.writeToParcel(parcel, flags);
        }
        DeveloperProfile developerProfile = this.developerProfile;
        if (developerProfile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            developerProfile.writeToParcel(parcel, flags);
        }
    }

    public static /* synthetic */ void getUniqueId$annotations() {
    }
}
