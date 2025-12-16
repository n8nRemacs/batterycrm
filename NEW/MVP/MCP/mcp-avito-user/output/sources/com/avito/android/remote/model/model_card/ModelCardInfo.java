package com.avito.android.remote.model.model_card;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModelCardInfo.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JL\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/model_card/ModelCardInfo;", "Landroid/os/Parcelable;", "", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/model_card/CatalogInfo;", "catalogInfo", "Lcom/avito/android/remote/model/model_card/LinkInfo;", "linkInfo", "Lcom/avito/android/remote/model/model_card/PriceInfo;", "priceInfo", "Lcom/avito/android/remote/model/model_card/GalleryTeaser;", "galleryItem", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/model_card/CatalogInfo;Lcom/avito/android/remote/model/model_card/LinkInfo;Lcom/avito/android/remote/model/model_card/PriceInfo;Lcom/avito/android/remote/model/model_card/GalleryTeaser;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/model_card/CatalogInfo;", "component3", "()Lcom/avito/android/remote/model/model_card/LinkInfo;", "component4", "()Lcom/avito/android/remote/model/model_card/PriceInfo;", "component5", "()Lcom/avito/android/remote/model/model_card/GalleryTeaser;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/model_card/CatalogInfo;Lcom/avito/android/remote/model/model_card/LinkInfo;Lcom/avito/android/remote/model/model_card/PriceInfo;Lcom/avito/android/remote/model/model_card/GalleryTeaser;)Lcom/avito/android/remote/model/model_card/ModelCardInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "Lcom/avito/android/remote/model/model_card/CatalogInfo;", "getCatalogInfo", "Lcom/avito/android/remote/model/model_card/LinkInfo;", "getLinkInfo", "Lcom/avito/android/remote/model/model_card/PriceInfo;", "getPriceInfo", "Lcom/avito/android/remote/model/model_card/GalleryTeaser;", "getGalleryItem", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ModelCardInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ModelCardInfo> CREATOR = new Creator();

    @c("catalogInfo")
    @l
    private final CatalogInfo catalogInfo;

    @c("galleryItem")
    @l
    private final GalleryTeaser galleryItem;

    @c("linkInfo")
    @l
    private final LinkInfo linkInfo;

    @c("priceInfo")
    @l
    private final PriceInfo priceInfo;

    @c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    /* compiled from: ModelCardInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ModelCardInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelCardInfo createFromParcel(@k Parcel parcel) {
            return new ModelCardInfo(parcel.readString(), parcel.readInt() == 0 ? null : CatalogInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PriceInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? GalleryTeaser.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ModelCardInfo[] newArray(int i12) {
            return new ModelCardInfo[i12];
        }
    }

    public ModelCardInfo(@l String str, @l CatalogInfo catalogInfo, @l LinkInfo linkInfo, @l PriceInfo priceInfo, @l GalleryTeaser galleryTeaser) {
        this.url = str;
        this.catalogInfo = catalogInfo;
        this.linkInfo = linkInfo;
        this.priceInfo = priceInfo;
        this.galleryItem = galleryTeaser;
    }

    public static /* synthetic */ ModelCardInfo copy$default(ModelCardInfo modelCardInfo, String str, CatalogInfo catalogInfo, LinkInfo linkInfo, PriceInfo priceInfo, GalleryTeaser galleryTeaser, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = modelCardInfo.url;
        }
        if ((i12 & 2) != 0) {
            catalogInfo = modelCardInfo.catalogInfo;
        }
        CatalogInfo catalogInfo2 = catalogInfo;
        if ((i12 & 4) != 0) {
            linkInfo = modelCardInfo.linkInfo;
        }
        LinkInfo linkInfo2 = linkInfo;
        if ((i12 & 8) != 0) {
            priceInfo = modelCardInfo.priceInfo;
        }
        PriceInfo priceInfo2 = priceInfo;
        if ((i12 & 16) != 0) {
            galleryTeaser = modelCardInfo.galleryItem;
        }
        return modelCardInfo.copy(str, catalogInfo2, linkInfo2, priceInfo2, galleryTeaser);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final CatalogInfo getCatalogInfo() {
        return this.catalogInfo;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final GalleryTeaser getGalleryItem() {
        return this.galleryItem;
    }

    @k
    public final ModelCardInfo copy(@l String url, @l CatalogInfo catalogInfo, @l LinkInfo linkInfo, @l PriceInfo priceInfo, @l GalleryTeaser galleryItem) {
        return new ModelCardInfo(url, catalogInfo, linkInfo, priceInfo, galleryItem);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModelCardInfo)) {
            return false;
        }
        ModelCardInfo modelCardInfo = (ModelCardInfo) other;
        return L.f(this.url, modelCardInfo.url) && L.f(this.catalogInfo, modelCardInfo.catalogInfo) && L.f(this.linkInfo, modelCardInfo.linkInfo) && L.f(this.priceInfo, modelCardInfo.priceInfo) && L.f(this.galleryItem, modelCardInfo.galleryItem);
    }

    @l
    public final CatalogInfo getCatalogInfo() {
        return this.catalogInfo;
    }

    @l
    public final GalleryTeaser getGalleryItem() {
        return this.galleryItem;
    }

    @l
    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    @l
    public final PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CatalogInfo catalogInfo = this.catalogInfo;
        int iHashCode2 = (iHashCode + (catalogInfo == null ? 0 : catalogInfo.hashCode())) * 31;
        LinkInfo linkInfo = this.linkInfo;
        int iHashCode3 = (iHashCode2 + (linkInfo == null ? 0 : linkInfo.hashCode())) * 31;
        PriceInfo priceInfo = this.priceInfo;
        int iHashCode4 = (iHashCode3 + (priceInfo == null ? 0 : priceInfo.hashCode())) * 31;
        GalleryTeaser galleryTeaser = this.galleryItem;
        return iHashCode4 + (galleryTeaser != null ? galleryTeaser.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ModelCardInfo(url=" + this.url + ", catalogInfo=" + this.catalogInfo + ", linkInfo=" + this.linkInfo + ", priceInfo=" + this.priceInfo + ", galleryItem=" + this.galleryItem + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.url);
        CatalogInfo catalogInfo = this.catalogInfo;
        if (catalogInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            catalogInfo.writeToParcel(parcel, flags);
        }
        LinkInfo linkInfo = this.linkInfo;
        if (linkInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInfo.writeToParcel(parcel, flags);
        }
        PriceInfo priceInfo = this.priceInfo;
        if (priceInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceInfo.writeToParcel(parcel, flags);
        }
        GalleryTeaser galleryTeaser = this.galleryItem;
        if (galleryTeaser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            galleryTeaser.writeToParcel(parcel, flags);
        }
    }
}
