package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.advert_details.reviews.ItemReviewsHeader;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: ItemReviews.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ItemReviews;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/item_reviews/ItemReviews$Type;", "type", "Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;", "header", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain;", "main", "<init>", "(Lcom/avito/android/remote/model/item_reviews/ItemReviews$Type;Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/item_reviews/ItemReviews$Type;", "getType", "()Lcom/avito/android/remote/model/item_reviews/ItemReviews$Type;", "Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;", "getHeader", "()Lcom/avito/android/remote/model/advert_details/reviews/ItemReviewsHeader;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain;", "getMain", "()Lcom/avito/android/remote/model/item_reviews/ItemReviewsMain;", "Type", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ItemReviews implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemReviews> CREATOR = new Creator();

    @c("header")
    @l
    private final ItemReviewsHeader header;

    @c("main")
    @l
    private final ItemReviewsMain main;

    @c("type")
    @l
    private final Type type;

    /* compiled from: ItemReviews.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemReviews> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemReviews createFromParcel(@k Parcel parcel) {
            return new ItemReviews(parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), (ItemReviewsHeader) parcel.readParcelable(ItemReviews.class.getClassLoader()), parcel.readInt() != 0 ? ItemReviewsMain.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemReviews[] newArray(int i12) {
            return new ItemReviews[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ItemReviews.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/ItemReviews$Type;", "", "(Ljava/lang/String;I)V", "SELLER", "MODEL", "HOTEL", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @c("seller")
        public static final Type SELLER = new Type("SELLER", 0);

        @c("model")
        public static final Type MODEL = new Type("MODEL", 1);

        @c("hotel")
        public static final Type HOTEL = new Type("HOTEL", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SELLER, MODEL, HOTEL};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = kotlin.enums.c.a(typeArr$values);
        }

        private Type(String str, int i12) {
        }

        @k
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public ItemReviews(@l Type type, @l ItemReviewsHeader itemReviewsHeader, @l ItemReviewsMain itemReviewsMain) {
        this.type = type;
        this.header = itemReviewsHeader;
        this.main = itemReviewsMain;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final ItemReviewsHeader getHeader() {
        return this.header;
    }

    @l
    public final ItemReviewsMain getMain() {
        return this.main;
    }

    @l
    public final Type getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Type type = this.type;
        if (type == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(type.name());
        }
        parcel.writeParcelable(this.header, flags);
        ItemReviewsMain itemReviewsMain = this.main;
        if (itemReviewsMain == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemReviewsMain.writeToParcel(parcel, flags);
        }
    }
}
