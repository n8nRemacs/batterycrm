package com.avito.android.remote.model.category_parameters.slot.item_info;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.car_info_short.CarImage;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ItemInfoSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/item_info/ItemInfoSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "title", "description", "Lcom/avito/android/remote/model/category_parameters/slot/item_info/ImagePosition;", "imagePosition", "", "Lcom/avito/android/remote/model/category_parameters/slot/item_info/ItemInfoField;", LocalPublishState.FIELDS, "", "visibleFieldsCount", "Lcom/avito/android/remote/model/category_parameters/slot/car_info_short/CarImage;", "image", "Lcom/avito/android/remote/model/category_parameters/slot/item_info/Confetti;", "confetti", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/item_info/ImagePosition;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/slot/car_info_short/CarImage;Lcom/avito/android/remote/model/category_parameters/slot/item_info/Confetti;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/category_parameters/slot/item_info/ImagePosition;", "getImagePosition", "()Lcom/avito/android/remote/model/category_parameters/slot/item_info/ImagePosition;", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "Ljava/lang/Integer;", "getVisibleFieldsCount", "()Ljava/lang/Integer;", "Lcom/avito/android/remote/model/category_parameters/slot/car_info_short/CarImage;", "getImage", "()Lcom/avito/android/remote/model/category_parameters/slot/car_info_short/CarImage;", "Lcom/avito/android/remote/model/category_parameters/slot/item_info/Confetti;", "getConfetti", "()Lcom/avito/android/remote/model/category_parameters/slot/item_info/Confetti;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ItemInfoSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<ItemInfoSlotConfig> CREATOR = new Creator();

    @c("confetti")
    @l
    private final Confetti confetti;

    @c("description")
    @l
    private final String description;

    @c(LocalPublishState.FIELDS)
    @l
    private final List<ItemInfoField> fields;

    @c("image")
    @l
    private final CarImage image;

    @c("imagePosition")
    @l
    private final ImagePosition imagePosition;

    @c("title")
    @l
    private final String title;

    @c("visibleFieldsCount")
    @l
    private final Integer visibleFieldsCount;

    /* compiled from: ItemInfoSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemInfoSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemInfoSlotConfig createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            ImagePosition imagePositionValueOf = parcel.readInt() == 0 ? null : ImagePosition.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ItemInfoField.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new ItemInfoSlotConfig(string, string2, imagePositionValueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : CarImage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Confetti.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemInfoSlotConfig[] newArray(int i12) {
            return new ItemInfoSlotConfig[i12];
        }
    }

    public ItemInfoSlotConfig(@l String str, @l String str2, @l ImagePosition imagePosition, @l List<ItemInfoField> list, @l Integer num, @l CarImage carImage, @l Confetti confetti) {
        this.title = str;
        this.description = str2;
        this.imagePosition = imagePosition;
        this.fields = list;
        this.visibleFieldsCount = num;
        this.image = carImage;
        this.confetti = confetti;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Confetti getConfetti() {
        return this.confetti;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<ItemInfoField> getFields() {
        return this.fields;
    }

    @l
    public final CarImage getImage() {
        return this.image;
    }

    @l
    public final ImagePosition getImagePosition() {
        return this.imagePosition;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Integer getVisibleFieldsCount() {
        return this.visibleFieldsCount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        ImagePosition imagePosition = this.imagePosition;
        if (imagePosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(imagePosition.name());
        }
        List<ItemInfoField> list = this.fields;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ItemInfoField) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Integer num = this.visibleFieldsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        CarImage carImage = this.image;
        if (carImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            carImage.writeToParcel(parcel, flags);
        }
        Confetti confetti = this.confetti;
        if (confetti == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            confetti.writeToParcel(parcel, flags);
        }
    }
}
