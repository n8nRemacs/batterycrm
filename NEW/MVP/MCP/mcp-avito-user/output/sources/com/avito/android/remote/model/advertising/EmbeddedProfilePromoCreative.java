package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.advertising.AvitoNetworkBannerRaw;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmbeddedProfilePromo.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0011J \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b0\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b1\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001a¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromoCreative;", "Landroid/os/Parcelable;", "", "id", "", "title", "description", "image", TooltipAttribute.PARAM_DEEP_LINK, "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;", "markInfo", "", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$HideReason;", "hideReasons", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;Ljava/util/List;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;", "component7", "()Ljava/util/List;", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;Ljava/util/List;)Lcom/avito/android/remote/model/advertising/EmbeddedProfilePromoCreative;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getId", "Ljava/lang/String;", "getTitle", "getDescription", "getImage", "getUri", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw$MarkInfo;", "getMarkInfo", "Ljava/util/List;", "getHideReasons", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EmbeddedProfilePromoCreative implements Parcelable {

    @k
    public static final Parcelable.Creator<EmbeddedProfilePromoCreative> CREATOR = new Creator();

    @c("description")
    @k
    private final String description;

    @c("hideReasons")
    @l
    private final List<AvitoNetworkBannerRaw.HideReason> hideReasons;

    @c("id")
    private final int id;

    @c("image")
    @k
    private final String image;

    @c("markInfo")
    @l
    private final AvitoNetworkBannerRaw.MarkInfo markInfo;

    @c("title")
    @k
    private final String title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final String uri;

    /* compiled from: EmbeddedProfilePromo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmbeddedProfilePromoCreative> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmbeddedProfilePromoCreative createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList = null;
            AvitoNetworkBannerRaw.MarkInfo markInfoCreateFromParcel = parcel.readInt() == 0 ? null : AvitoNetworkBannerRaw.MarkInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(AvitoNetworkBannerRaw.HideReason.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new EmbeddedProfilePromoCreative(i12, string, string2, string3, string4, markInfoCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EmbeddedProfilePromoCreative[] newArray(int i12) {
            return new EmbeddedProfilePromoCreative[i12];
        }
    }

    public EmbeddedProfilePromoCreative(int i12, @k String str, @k String str2, @k String str3, @k String str4, @l AvitoNetworkBannerRaw.MarkInfo markInfo, @l List<AvitoNetworkBannerRaw.HideReason> list) {
        this.id = i12;
        this.title = str;
        this.description = str2;
        this.image = str3;
        this.uri = str4;
        this.markInfo = markInfo;
        this.hideReasons = list;
    }

    public static /* synthetic */ EmbeddedProfilePromoCreative copy$default(EmbeddedProfilePromoCreative embeddedProfilePromoCreative, int i12, String str, String str2, String str3, String str4, AvitoNetworkBannerRaw.MarkInfo markInfo, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = embeddedProfilePromoCreative.id;
        }
        if ((i13 & 2) != 0) {
            str = embeddedProfilePromoCreative.title;
        }
        String str5 = str;
        if ((i13 & 4) != 0) {
            str2 = embeddedProfilePromoCreative.description;
        }
        String str6 = str2;
        if ((i13 & 8) != 0) {
            str3 = embeddedProfilePromoCreative.image;
        }
        String str7 = str3;
        if ((i13 & 16) != 0) {
            str4 = embeddedProfilePromoCreative.uri;
        }
        String str8 = str4;
        if ((i13 & 32) != 0) {
            markInfo = embeddedProfilePromoCreative.markInfo;
        }
        AvitoNetworkBannerRaw.MarkInfo markInfo2 = markInfo;
        if ((i13 & 64) != 0) {
            list = embeddedProfilePromoCreative.hideReasons;
        }
        return embeddedProfilePromoCreative.copy(i12, str5, str6, str7, str8, markInfo2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final AvitoNetworkBannerRaw.MarkInfo getMarkInfo() {
        return this.markInfo;
    }

    @l
    public final List<AvitoNetworkBannerRaw.HideReason> component7() {
        return this.hideReasons;
    }

    @k
    public final EmbeddedProfilePromoCreative copy(int id2, @k String title, @k String description, @k String image, @k String uri, @l AvitoNetworkBannerRaw.MarkInfo markInfo, @l List<AvitoNetworkBannerRaw.HideReason> hideReasons) {
        return new EmbeddedProfilePromoCreative(id2, title, description, image, uri, markInfo, hideReasons);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedProfilePromoCreative)) {
            return false;
        }
        EmbeddedProfilePromoCreative embeddedProfilePromoCreative = (EmbeddedProfilePromoCreative) other;
        return this.id == embeddedProfilePromoCreative.id && L.f(this.title, embeddedProfilePromoCreative.title) && L.f(this.description, embeddedProfilePromoCreative.description) && L.f(this.image, embeddedProfilePromoCreative.image) && L.f(this.uri, embeddedProfilePromoCreative.uri) && L.f(this.markInfo, embeddedProfilePromoCreative.markInfo) && L.f(this.hideReasons, embeddedProfilePromoCreative.hideReasons);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<AvitoNetworkBannerRaw.HideReason> getHideReasons() {
        return this.hideReasons;
    }

    public final int getId() {
        return this.id;
    }

    @k
    public final String getImage() {
        return this.image;
    }

    @l
    public final AvitoNetworkBannerRaw.MarkInfo getMarkInfo() {
        return this.markInfo;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.description), 31, this.image), 31, this.uri);
        AvitoNetworkBannerRaw.MarkInfo markInfo = this.markInfo;
        int iHashCode = (iD2 + (markInfo == null ? 0 : markInfo.hashCode())) * 31;
        List<AvitoNetworkBannerRaw.HideReason> list = this.hideReasons;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EmbeddedProfilePromoCreative(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", uri=");
        sb2.append(this.uri);
        sb2.append(", markInfo=");
        sb2.append(this.markInfo);
        sb2.append(", hideReasons=");
        return H.p(sb2, this.hideReasons, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.image);
        parcel.writeString(this.uri);
        AvitoNetworkBannerRaw.MarkInfo markInfo = this.markInfo;
        if (markInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            markInfo.writeToParcel(parcel, flags);
        }
        List<AvitoNetworkBannerRaw.HideReason> list = this.hideReasons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((AvitoNetworkBannerRaw.HideReason) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
