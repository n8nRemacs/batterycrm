package com.avito.android.remote.model.category_parameters.slot.promoblock;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: PromoblockSlotConfig.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/promoblock/PromoblockSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "title", "text", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "type", "Lcom/avito/android/remote/model/category_parameters/slot/promoblock/PromoblockSlotItemMargins;", "margins", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/PromoStyle;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/slot/promoblock/PromoblockSlotItemMargins;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getStyle", "()Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getType", "Lcom/avito/android/remote/model/category_parameters/slot/promoblock/PromoblockSlotItemMargins;", "getMargins", "()Lcom/avito/android/remote/model/category_parameters/slot/promoblock/PromoblockSlotItemMargins;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PromoblockSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<PromoblockSlotConfig> CREATOR = new Creator();

    @c("margins")
    @l
    private final PromoblockSlotItemMargins margins;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final PromoStyle style;

    @c("text")
    @l
    private final String text;

    @c("title")
    @l
    private final String title;

    @c("type")
    @l
    private final String type;

    /* compiled from: PromoblockSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoblockSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoblockSlotConfig createFromParcel(@k Parcel parcel) {
            return new PromoblockSlotConfig(parcel.readString(), parcel.readString(), (PromoStyle) parcel.readParcelable(PromoblockSlotConfig.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : PromoblockSlotItemMargins.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoblockSlotConfig[] newArray(int i12) {
            return new PromoblockSlotConfig[i12];
        }
    }

    public PromoblockSlotConfig(@l String str, @l String str2, @l PromoStyle promoStyle, @l String str3, @l PromoblockSlotItemMargins promoblockSlotItemMargins) {
        this.title = str;
        this.text = str2;
        this.style = promoStyle;
        this.type = str3;
        this.margins = promoblockSlotItemMargins;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final PromoblockSlotItemMargins getMargins() {
        return this.margins;
    }

    @l
    public final PromoStyle getStyle() {
        return this.style;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.style, flags);
        parcel.writeString(this.type);
        PromoblockSlotItemMargins promoblockSlotItemMargins = this.margins;
        if (promoblockSlotItemMargins == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoblockSlotItemMargins.writeToParcel(parcel, flags);
        }
    }
}
