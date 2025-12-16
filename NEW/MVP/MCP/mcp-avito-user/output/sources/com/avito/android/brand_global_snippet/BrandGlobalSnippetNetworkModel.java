package com.avito.android.brand_global_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandGlobalSnippetNetworkModel.kt */
@K51.d
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001:\u0002+,B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b\f\u0010#R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b*\u0010\u0016¨\u0006-"}, d2 = {"Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel;", "Lcom/avito/android/remote/model/SerpElement;", "", "id", "Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$Category;", "category", "locationName", "", SearchParamsConverterKt.LOCATION_ID, "title", "price", "", "isFavorite", "Lcom/avito/android/deep_linking/links/DeepLink;", "itemDeepLink", "Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$AdvertImage;", "images", "creationDate", "<init>", "(Ljava/lang/String;Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$Category;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZLcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$AdvertImage;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$Category;", "c", "()Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$Category;", "getLocationName", "J", "e", "()J", "getTitle", "getPrice", "Z", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "y2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$AdvertImage;", "d", "()Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$AdvertImage;", "Z3", "AdvertImage", "Category", "_avito_bx-content_snippet_brand-global-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BrandGlobalSnippetNetworkModel implements SerpElement {

    @k
    public static final Parcelable.Creator<BrandGlobalSnippetNetworkModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f107483b;

    @com.google.gson.annotations.c("category")
    @k
    private final Category category;

    @com.google.gson.annotations.c("dateRelative")
    @l
    private final String creationDate;

    @com.google.gson.annotations.c("id")
    @k
    private String id;

    @com.google.gson.annotations.c("images")
    @k
    private final AdvertImage images;

    @com.google.gson.annotations.c("isFavorite")
    private final boolean isFavorite;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink itemDeepLink;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @com.google.gson.annotations.c("location")
    @l
    private final String locationName;

    @com.google.gson.annotations.c("price")
    @k
    private final String price;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* compiled from: BrandGlobalSnippetNetworkModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$AdvertImage;", "Landroid/os/Parcelable;", "", "count", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(ILcom/avito/android/remote/model/Image;)V", "I", "getCount", "()I", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "_avito_bx-content_snippet_brand-global-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AdvertImage implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertImage> CREATOR = new a();

        @com.google.gson.annotations.c("count")
        private final int count;

        @com.google.gson.annotations.c("main")
        @k
        private final Image image;

        /* compiled from: BrandGlobalSnippetNetworkModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdvertImage> {
            @Override // android.os.Parcelable.Creator
            public final AdvertImage createFromParcel(Parcel parcel) {
                return new AdvertImage(parcel.readInt(), (Image) parcel.readParcelable(AdvertImage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertImage[] newArray(int i12) {
                return new AdvertImage[i12];
            }
        }

        public AdvertImage(int i12, @k Image image) {
            this.count = i12;
            this.image = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        public final Image getImage() {
            return this.image;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.count);
            parcel.writeParcelable(this.image, i12);
        }
    }

    /* compiled from: BrandGlobalSnippetNetworkModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/brand_global_snippet/BrandGlobalSnippetNetworkModel$Category;", "Landroid/os/Parcelable;", "", "id", "", "name", "<init>", "(JLjava/lang/String;)V", "J", "getId", "()J", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "_avito_bx-content_snippet_brand-global-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Category implements Parcelable {

        @k
        public static final Parcelable.Creator<Category> CREATOR = new a();

        @com.google.gson.annotations.c("id")
        private final long id;

        @com.google.gson.annotations.c("name")
        @k
        private final String name;

        /* compiled from: BrandGlobalSnippetNetworkModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Category> {
            @Override // android.os.Parcelable.Creator
            public final Category createFromParcel(Parcel parcel) {
                return new Category(parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Category[] newArray(int i12) {
                return new Category[i12];
            }
        }

        public Category(long j12, @k String str) {
            this.id = j12;
            this.name = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return this.id == category.id && L.f(this.name, category.name);
        }

        public final long getId() {
            return this.id;
        }

        @k
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            return this.name.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Category(id=");
            sb2.append(this.id);
            sb2.append(", name=");
            return C22026a.c(sb2, this.name, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.id);
            parcel.writeString(this.name);
        }
    }

    /* compiled from: BrandGlobalSnippetNetworkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BrandGlobalSnippetNetworkModel> {
        @Override // android.os.Parcelable.Creator
        public final BrandGlobalSnippetNetworkModel createFromParcel(Parcel parcel) {
            return new BrandGlobalSnippetNetworkModel(parcel.readString(), Category.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(BrandGlobalSnippetNetworkModel.class.getClassLoader()), AdvertImage.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BrandGlobalSnippetNetworkModel[] newArray(int i12) {
            return new BrandGlobalSnippetNetworkModel[i12];
        }
    }

    public BrandGlobalSnippetNetworkModel(@k String str, @k Category category, @l String str2, long j12, @k String str3, @k String str4, boolean z12, @k DeepLink deepLink, @k AdvertImage advertImage, @l String str5) {
        this.id = str;
        this.category = category;
        this.locationName = str2;
        this.locationId = j12;
        this.title = str3;
        this.price = str4;
        this.isFavorite = z12;
        this.itemDeepLink = deepLink;
        this.images = advertImage;
        this.creationDate = str5;
    }

    @l
    /* renamed from: Z3, reason: from getter */
    public final String getCreationDate() {
        return this.creationDate;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Category getCategory() {
        return this.category;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AdvertImage getImages() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final long getLocationId() {
        return this.locationId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandGlobalSnippetNetworkModel)) {
            return false;
        }
        BrandGlobalSnippetNetworkModel brandGlobalSnippetNetworkModel = (BrandGlobalSnippetNetworkModel) obj;
        return L.f(this.id, brandGlobalSnippetNetworkModel.id) && L.f(this.category, brandGlobalSnippetNetworkModel.category) && L.f(this.locationName, brandGlobalSnippetNetworkModel.locationName) && this.locationId == brandGlobalSnippetNetworkModel.locationId && L.f(this.title, brandGlobalSnippetNetworkModel.title) && L.f(this.price, brandGlobalSnippetNetworkModel.price) && this.isFavorite == brandGlobalSnippetNetworkModel.isFavorite && L.f(this.itemDeepLink, brandGlobalSnippetNetworkModel.itemDeepLink) && L.f(this.images, brandGlobalSnippetNetworkModel.images) && L.f(this.creationDate, brandGlobalSnippetNetworkModel.creationDate);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final String getLocationName() {
        return this.locationName;
    }

    @k
    public final String getPrice() {
        return this.price;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF107483b() {
        return this.f107483b;
    }

    public final int hashCode() {
        int iHashCode = (this.category.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.locationName;
        int iHashCode2 = (this.images.hashCode() + com.avito.android.actions_sheet.a.e(this.itemDeepLink, r.i(H.d(H.d(r.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.locationId), 31, this.title), 31, this.price), 31, this.isFavorite), 31)) * 31;
        String str2 = this.creationDate;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* renamed from: isFavorite, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f107483b = j12;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrandGlobalSnippetNetworkModel(id=");
        sb2.append(this.id);
        sb2.append(", category=");
        sb2.append(this.category);
        sb2.append(", locationName=");
        sb2.append(this.locationName);
        sb2.append(", locationId=");
        sb2.append(this.locationId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", isFavorite=");
        sb2.append(this.isFavorite);
        sb2.append(", itemDeepLink=");
        sb2.append(this.itemDeepLink);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", creationDate=");
        return C22026a.c(sb2, this.creationDate, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        this.category.writeToParcel(parcel, i12);
        parcel.writeString(this.locationName);
        parcel.writeLong(this.locationId);
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeParcelable(this.itemDeepLink, i12);
        this.images.writeToParcel(parcel, i12);
        parcel.writeString(this.creationDate);
    }

    @k
    /* renamed from: y2, reason: from getter */
    public final DeepLink getItemDeepLink() {
        return this.itemDeepLink;
    }
}
