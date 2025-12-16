package ru.avito.messenger.api.entity.body.item;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.messenger.api.entity.Images;
import ru.avito.messenger.api.entity.Metro;

/* compiled from: Item.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b$\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b)\u0010\u0017¨\u0006+"}, d2 = {"Lru/avito/messenger/api/entity/body/item/Item;", "Lru/avito/messenger/api/entity/body/item/BodyItem;", "", "id", ChannelContext.Item.USER_ID, "title", "categoryId", "category", "", "dateTime", "description", "Lru/avito/messenger/api/entity/Images;", "images", "formattedPrice", "priceMetric", "price", "Lru/avito/messenger/api/entity/Metro;", MetroParameter.TYPE, "location", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lru/avito/messenger/api/entity/Images;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/avito/messenger/api/entity/Metro;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "f", "getTitle", "getCategoryId", "getCategory", "J", "getDateTime", "()J", "getDescription", "Lru/avito/messenger/api/entity/Images;", "d", "()Lru/avito/messenger/api/entity/Images;", "c", "getPriceMetric", "getPrice", "Lru/avito/messenger/api/entity/Metro;", "getMetro", "()Lru/avito/messenger/api/entity/Metro;", "e", "a", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Item implements BodyItem {

    @k
    public static final Parcelable.Creator<Item> CREATOR;

    @c("category")
    @k
    private final String category;

    @c("categoryId")
    @k
    private final String categoryId;

    @c("datetime")
    private final long dateTime;

    @c("description")
    @l
    private final String description;

    @c("priceString")
    @l
    private final String formattedPrice;

    @c("id")
    @k
    private final String id;

    @c("images")
    @l
    private final Images images;

    @c("location")
    @l
    private final String location;

    @c(MetroParameter.TYPE)
    @l
    private final Metro metro;

    @c("price")
    @l
    private final String price;

    @c("metric")
    @l
    private final String priceMetric;

    @c("title")
    @k
    private final String title;

    @c(ChannelContext.Item.USER_ID)
    @l
    private final String userId;

    /* compiled from: Item.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lru/avito/messenger/api/entity/body/item/Item$a;", "", "<init>", "()V", "", "CATEGORY", "Ljava/lang/String;", "CATEGORY_ID", "DATETIME", "DESCRIPTION", "ID", "IMAGES", "LOCATION", "METRIC", "METRO", "PRICE", "PRICES_STRING", "TITLE", "USER_ID", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Item> {
        @Override // android.os.Parcelable.Creator
        public final Item createFromParcel(Parcel parcel) {
            return new Item(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : Images.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Metro.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Item[] newArray(int i12) {
            return new Item[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public Item(@k String str, @l String str2, @k String str3, @k String str4, @k String str5, long j12, @l String str6, @l Images images, @l String str7, @l String str8, @l String str9, @l Metro metro, @l String str10) {
        this.id = str;
        this.userId = str2;
        this.title = str3;
        this.categoryId = str4;
        this.category = str5;
        this.dateTime = j12;
        this.description = str6;
        this.images = images;
        this.formattedPrice = str7;
        this.priceMetric = str8;
        this.price = str9;
        this.metro = metro;
        this.location = str10;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Images getImages() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return L.f(this.id, item.id) && L.f(this.userId, item.userId) && L.f(this.title, item.title) && L.f(this.categoryId, item.categoryId) && L.f(this.category, item.category) && this.dateTime == item.dateTime && L.f(this.description, item.description) && L.f(this.images, item.images) && L.f(this.formattedPrice, item.formattedPrice) && L.f(this.priceMetric, item.priceMetric) && L.f(this.price, item.price) && L.f(this.metro, item.metro) && L.f(this.location, item.location);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.userId;
        int iG2 = r.g(H.d(H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.categoryId), 31, this.category), 31, this.dateTime);
        String str2 = this.description;
        int iHashCode2 = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Images images = this.images;
        int iHashCode3 = (iHashCode2 + (images == null ? 0 : images.hashCode())) * 31;
        String str3 = this.formattedPrice;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.priceMetric;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.price;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Metro metro = this.metro;
        int iHashCode7 = (iHashCode6 + (metro == null ? 0 : metro.hashCode())) * 31;
        String str6 = this.location;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Item(id=");
        sb2.append(this.id);
        sb2.append(", userId=");
        sb2.append(this.userId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", categoryId=");
        sb2.append(this.categoryId);
        sb2.append(", category=");
        sb2.append(this.category);
        sb2.append(", dateTime=");
        sb2.append(this.dateTime);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", formattedPrice=");
        sb2.append(this.formattedPrice);
        sb2.append(", priceMetric=");
        sb2.append(this.priceMetric);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", metro=");
        sb2.append(this.metro);
        sb2.append(", location=");
        return C22026a.c(sb2, this.location, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.userId);
        parcel.writeString(this.title);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.category);
        parcel.writeLong(this.dateTime);
        parcel.writeString(this.description);
        Images images = this.images;
        if (images == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            images.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.formattedPrice);
        parcel.writeString(this.priceMetric);
        parcel.writeString(this.price);
        Metro metro = this.metro;
        if (metro == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            metro.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.location);
    }
}
