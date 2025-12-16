package com.avito.android.remote.model.item_reviews;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.item_reviews.ItemReviewsEntry;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: RatingButtonEntry.kt */
@d
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/RatingButtonEntry;", "Lcom/avito/android/remote/model/item_reviews/ItemReviewsEntry;", "Lcom/avito/android/remote/model/item_reviews/RatingButtonEntry$FillType;", "type", "Lcom/avito/android/remote/model/DeeplinkAction;", "action", "<init>", "(Lcom/avito/android/remote/model/item_reviews/RatingButtonEntry$FillType;Lcom/avito/android/remote/model/DeeplinkAction;)V", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/item_reviews/RatingButtonEntry$FillType;", "getType", "()Lcom/avito/android/remote/model/item_reviews/RatingButtonEntry$FillType;", "Lcom/avito/android/remote/model/DeeplinkAction;", "getAction", "()Lcom/avito/android/remote/model/DeeplinkAction;", "FillType", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RatingButtonEntry implements ItemReviewsEntry {

    @k
    public static final Parcelable.Creator<RatingButtonEntry> CREATOR = new Creator();

    @c("action")
    @l
    private final DeeplinkAction action;

    @c("type")
    @k
    private final FillType type;

    /* compiled from: RatingButtonEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingButtonEntry> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingButtonEntry createFromParcel(@k Parcel parcel) {
            return new RatingButtonEntry(FillType.valueOf(parcel.readString()), (DeeplinkAction) parcel.readParcelable(RatingButtonEntry.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RatingButtonEntry[] newArray(int i12) {
            return new RatingButtonEntry[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RatingButtonEntry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/item_reviews/RatingButtonEntry$FillType;", "", "(Ljava/lang/String;I)V", "FULL_WIDTH", "WRAP_CONTENT", "_avito-discouraged_avito-api_rating"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FillType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ FillType[] $VALUES;

        @c("fullWidth")
        public static final FillType FULL_WIDTH = new FillType("FULL_WIDTH", 0);

        @c("wrapContent")
        public static final FillType WRAP_CONTENT = new FillType("WRAP_CONTENT", 1);

        private static final /* synthetic */ FillType[] $values() {
            return new FillType[]{FULL_WIDTH, WRAP_CONTENT};
        }

        static {
            FillType[] fillTypeArr$values = $values();
            $VALUES = fillTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(fillTypeArr$values);
        }

        private FillType(String str, int i12) {
        }

        @k
        public static a<FillType> getEntries() {
            return $ENTRIES;
        }

        public static FillType valueOf(String str) {
            return (FillType) Enum.valueOf(FillType.class, str);
        }

        public static FillType[] values() {
            return (FillType[]) $VALUES.clone();
        }
    }

    public RatingButtonEntry(@k FillType fillType, @l DeeplinkAction deeplinkAction) {
        this.type = fillType;
        this.action = deeplinkAction;
    }

    @Override // com.avito.android.remote.model.item_reviews.ItemReviewsEntry, android.os.Parcelable
    public int describeContents() {
        return ItemReviewsEntry.DefaultImpls.describeContents(this);
    }

    @l
    public final DeeplinkAction getAction() {
        return this.action;
    }

    @k
    public final FillType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type.name());
        parcel.writeParcelable(this.action, flags);
    }
}
