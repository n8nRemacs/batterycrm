package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchFormWidget.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/StyleBlock;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "preset", "Lcom/avito/android/remote/model/vertical_main/StyleBlockGradient;", "gradient", "Lcom/avito/android/remote/model/UniversalColor;", "iconColor", "Lcom/avito/android/remote/model/vertical_main/StyleBlockType;", "type", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/vertical_main/PromoStyle;Lcom/avito/android/remote/model/vertical_main/StyleBlockGradient;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/vertical_main/StyleBlockType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTheme", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "getPreset", "()Lcom/avito/android/remote/model/vertical_main/PromoStyle;", "Lcom/avito/android/remote/model/vertical_main/StyleBlockGradient;", "getGradient", "()Lcom/avito/android/remote/model/vertical_main/StyleBlockGradient;", "Lcom/avito/android/remote/model/UniversalColor;", "getIconColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/vertical_main/StyleBlockType;", "getType", "()Lcom/avito/android/remote/model/vertical_main/StyleBlockType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StyleBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<StyleBlock> CREATOR = new Creator();

    @c("gradient")
    @l
    private final StyleBlockGradient gradient;

    @c("iconColor")
    @l
    private final UniversalColor iconColor;

    @c("preset")
    @l
    private final PromoStyle preset;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final String theme;

    @c("type")
    @l
    private final StyleBlockType type;

    /* compiled from: SearchFormWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StyleBlock> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StyleBlock createFromParcel(@k Parcel parcel) {
            return new StyleBlock(parcel.readString(), parcel.readInt() == 0 ? null : PromoStyle.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : StyleBlockGradient.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(StyleBlock.class.getClassLoader()), parcel.readInt() == 0 ? null : StyleBlockType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StyleBlock[] newArray(int i12) {
            return new StyleBlock[i12];
        }
    }

    public StyleBlock(@l String str, @l PromoStyle promoStyle, @l StyleBlockGradient styleBlockGradient, @l UniversalColor universalColor, @l StyleBlockType styleBlockType) {
        this.theme = str;
        this.preset = promoStyle;
        this.gradient = styleBlockGradient;
        this.iconColor = universalColor;
        this.type = styleBlockType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final StyleBlockGradient getGradient() {
        return this.gradient;
    }

    @l
    public final UniversalColor getIconColor() {
        return this.iconColor;
    }

    @l
    public final PromoStyle getPreset() {
        return this.preset;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    @l
    public final StyleBlockType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.theme);
        PromoStyle promoStyle = this.preset;
        if (promoStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoStyle.writeToParcel(parcel, flags);
        }
        StyleBlockGradient styleBlockGradient = this.gradient;
        if (styleBlockGradient == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            styleBlockGradient.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.iconColor, flags);
        StyleBlockType styleBlockType = this.type;
        if (styleBlockType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(styleBlockType.name());
        }
    }

    public /* synthetic */ StyleBlock(String str, PromoStyle promoStyle, StyleBlockGradient styleBlockGradient, UniversalColor universalColor, StyleBlockType styleBlockType, int i12, C42822w c42822w) {
        this(str, promoStyle, styleBlockGradient, universalColor, (i12 & 16) != 0 ? null : styleBlockType);
    }
}
