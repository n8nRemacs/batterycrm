package com.avito.android.remote.model.item_popularity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemPopularity.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/item_popularity/ItemPopularity;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/item_popularity/ItemPopularity$Image;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "toastText", "tagText", "", "toastTimeDelay", "<init>", "(Lcom/avito/android/remote/model/item_popularity/ItemPopularity$Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;I)V", "component1", "()Lcom/avito/android/remote/model/item_popularity/ItemPopularity$Image;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "component3", "component4", "()I", "copy", "(Lcom/avito/android/remote/model/item_popularity/ItemPopularity$Image;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;I)Lcom/avito/android/remote/model/item_popularity/ItemPopularity;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/item_popularity/ItemPopularity$Image;", "getImage", "Lcom/avito/android/remote/model/text/AttributedText;", "getToastText", "getTagText", "I", "getToastTimeDelay", "Image", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ItemPopularity implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemPopularity> CREATOR = new Creator();

    @c("image")
    @k
    private final Image image;

    @c("tagText")
    @k
    private final AttributedText tagText;

    @c("toastText")
    @k
    private final AttributedText toastText;

    @c("toastTimeDelay")
    private final int toastTimeDelay;

    /* compiled from: ItemPopularity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemPopularity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemPopularity createFromParcel(@k Parcel parcel) {
            return new ItemPopularity(Image.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ItemPopularity.class.getClassLoader()), (AttributedText) parcel.readParcelable(ItemPopularity.class.getClassLoader()), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemPopularity[] newArray(int i12) {
            return new ItemPopularity[i12];
        }
    }

    /* compiled from: ItemPopularity.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/item_popularity/ItemPopularity$Image;", "Landroid/os/Parcelable;", "", "lottieLightUrl", "lottieDarkUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/item_popularity/ItemPopularity$Image;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLottieLightUrl", "getLottieDarkUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Image implements Parcelable {

        @k
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @c("lottieDarkUrl")
        @k
        private final String lottieDarkUrl;

        @c("lottieLightUrl")
        @k
        private final String lottieLightUrl;

        /* compiled from: ItemPopularity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image createFromParcel(@k Parcel parcel) {
                return new Image(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        public Image(@k String str, @k String str2) {
            this.lottieLightUrl = str;
            this.lottieDarkUrl = str2;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = image.lottieLightUrl;
            }
            if ((i12 & 2) != 0) {
                str2 = image.lottieDarkUrl;
            }
            return image.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getLottieLightUrl() {
            return this.lottieLightUrl;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getLottieDarkUrl() {
            return this.lottieDarkUrl;
        }

        @k
        public final Image copy(@k String lottieLightUrl, @k String lottieDarkUrl) {
            return new Image(lottieLightUrl, lottieDarkUrl);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return L.f(this.lottieLightUrl, image.lottieLightUrl) && L.f(this.lottieDarkUrl, image.lottieDarkUrl);
        }

        @k
        public final String getLottieDarkUrl() {
            return this.lottieDarkUrl;
        }

        @k
        public final String getLottieLightUrl() {
            return this.lottieLightUrl;
        }

        public int hashCode() {
            return this.lottieDarkUrl.hashCode() + (this.lottieLightUrl.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Image(lottieLightUrl=");
            sb2.append(this.lottieLightUrl);
            sb2.append(", lottieDarkUrl=");
            return C22026a.c(sb2, this.lottieDarkUrl, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.lottieLightUrl);
            parcel.writeString(this.lottieDarkUrl);
        }
    }

    public ItemPopularity(@k Image image, @k AttributedText attributedText, @k AttributedText attributedText2, int i12) {
        this.image = image;
        this.toastText = attributedText;
        this.tagText = attributedText2;
        this.toastTimeDelay = i12;
    }

    public static /* synthetic */ ItemPopularity copy$default(ItemPopularity itemPopularity, Image image, AttributedText attributedText, AttributedText attributedText2, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            image = itemPopularity.image;
        }
        if ((i13 & 2) != 0) {
            attributedText = itemPopularity.toastText;
        }
        if ((i13 & 4) != 0) {
            attributedText2 = itemPopularity.tagText;
        }
        if ((i13 & 8) != 0) {
            i12 = itemPopularity.toastTimeDelay;
        }
        return itemPopularity.copy(image, attributedText, attributedText2, i12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AttributedText getToastText() {
        return this.toastText;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final AttributedText getTagText() {
        return this.tagText;
    }

    /* renamed from: component4, reason: from getter */
    public final int getToastTimeDelay() {
        return this.toastTimeDelay;
    }

    @k
    public final ItemPopularity copy(@k Image image, @k AttributedText toastText, @k AttributedText tagText, int toastTimeDelay) {
        return new ItemPopularity(image, toastText, tagText, toastTimeDelay);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemPopularity)) {
            return false;
        }
        ItemPopularity itemPopularity = (ItemPopularity) other;
        return L.f(this.image, itemPopularity.image) && L.f(this.toastText, itemPopularity.toastText) && L.f(this.tagText, itemPopularity.tagText) && this.toastTimeDelay == itemPopularity.toastTimeDelay;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @k
    public final AttributedText getTagText() {
        return this.tagText;
    }

    @k
    public final AttributedText getToastText() {
        return this.toastText;
    }

    public final int getToastTimeDelay() {
        return this.toastTimeDelay;
    }

    public int hashCode() {
        return Integer.hashCode(this.toastTimeDelay) + a.b(a.b(this.image.hashCode() * 31, 31, this.toastText), 31, this.tagText);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ItemPopularity(image=");
        sb2.append(this.image);
        sb2.append(", toastText=");
        sb2.append(this.toastText);
        sb2.append(", tagText=");
        sb2.append(this.tagText);
        sb2.append(", toastTimeDelay=");
        return r.t(sb2, this.toastTimeDelay, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.image.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.toastText, flags);
        parcel.writeParcelable(this.tagText, flags);
        parcel.writeInt(this.toastTimeDelay);
    }
}
