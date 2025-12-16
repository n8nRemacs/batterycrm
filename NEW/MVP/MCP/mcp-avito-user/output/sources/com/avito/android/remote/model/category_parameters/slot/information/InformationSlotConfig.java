package com.avito.android.remote.model.category_parameters.slot.information;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.base.WithDependency;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InformationSlotConfig.kt */
@d
@com.avito.android.gson.d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJh\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001aR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00107\u001a\u0004\b;\u0010\u001a¨\u0006<"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/information/InformationSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "Lcom/avito/android/remote/model/category_parameters/base/WithDependency;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "subtitle", "Lcom/avito/android/remote/model/category_parameters/slot/information/TextStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalImage;", "image", "", "topMargin", "", "", "paramsMustBeFilled", "textStartMargin", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/slot/information/TextStyle;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/category_parameters/slot/information/TextStyle;", "component4", "()Lcom/avito/android/remote/model/UniversalImage;", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/util/List;", "component7", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/category_parameters/slot/information/TextStyle;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lcom/avito/android/remote/model/category_parameters/slot/information/InformationSlotConfig;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "getSubtitle", "Lcom/avito/android/remote/model/category_parameters/slot/information/TextStyle;", "getStyle", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Ljava/lang/Integer;", "getTopMargin", "Ljava/util/List;", "getParamsMustBeFilled", "getTextStartMargin", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InformationSlotConfig implements SlotConfig, WithDependency {

    @k
    public static final Parcelable.Creator<InformationSlotConfig> CREATOR = new Creator();

    @c("image")
    @l
    private final UniversalImage image;

    @c("paramsMustBeFilled")
    @l
    private final List<String> paramsMustBeFilled;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final TextStyle style;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("text")
    @k
    private final AttributedText text;

    @c("textStartMargin")
    @l
    private final Integer textStartMargin;

    @c("topMargin")
    @l
    private final Integer topMargin;

    /* compiled from: InformationSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InformationSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InformationSlotConfig createFromParcel(@k Parcel parcel) {
            return new InformationSlotConfig((AttributedText) parcel.readParcelable(InformationSlotConfig.class.getClassLoader()), (AttributedText) parcel.readParcelable(InformationSlotConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : TextStyle.valueOf(parcel.readString()), (UniversalImage) parcel.readParcelable(InformationSlotConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InformationSlotConfig[] newArray(int i12) {
            return new InformationSlotConfig[i12];
        }
    }

    public InformationSlotConfig(@k AttributedText attributedText, @l AttributedText attributedText2, @l TextStyle textStyle, @l UniversalImage universalImage, @l Integer num, @l List<String> list, @l Integer num2) {
        this.text = attributedText;
        this.subtitle = attributedText2;
        this.style = textStyle;
        this.image = universalImage;
        this.topMargin = num;
        this.paramsMustBeFilled = list;
        this.textStartMargin = num2;
    }

    public static /* synthetic */ InformationSlotConfig copy$default(InformationSlotConfig informationSlotConfig, AttributedText attributedText, AttributedText attributedText2, TextStyle textStyle, UniversalImage universalImage, Integer num, List list, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = informationSlotConfig.text;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = informationSlotConfig.subtitle;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 4) != 0) {
            textStyle = informationSlotConfig.style;
        }
        TextStyle textStyle2 = textStyle;
        if ((i12 & 8) != 0) {
            universalImage = informationSlotConfig.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 16) != 0) {
            num = informationSlotConfig.topMargin;
        }
        Integer num3 = num;
        if ((i12 & 32) != 0) {
            list = informationSlotConfig.paramsMustBeFilled;
        }
        List list2 = list;
        if ((i12 & 64) != 0) {
            num2 = informationSlotConfig.textStartMargin;
        }
        return informationSlotConfig.copy(attributedText, attributedText3, textStyle2, universalImage2, num3, list2, num2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @l
    public final List<String> component6() {
        return this.paramsMustBeFilled;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer getTextStartMargin() {
        return this.textStartMargin;
    }

    @k
    public final InformationSlotConfig copy(@k AttributedText text, @l AttributedText subtitle, @l TextStyle style, @l UniversalImage image, @l Integer topMargin, @l List<String> paramsMustBeFilled, @l Integer textStartMargin) {
        return new InformationSlotConfig(text, subtitle, style, image, topMargin, paramsMustBeFilled, textStartMargin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InformationSlotConfig)) {
            return false;
        }
        InformationSlotConfig informationSlotConfig = (InformationSlotConfig) other;
        return L.f(this.text, informationSlotConfig.text) && L.f(this.subtitle, informationSlotConfig.subtitle) && this.style == informationSlotConfig.style && L.f(this.image, informationSlotConfig.image) && L.f(this.topMargin, informationSlotConfig.topMargin) && L.f(this.paramsMustBeFilled, informationSlotConfig.paramsMustBeFilled) && L.f(this.textStartMargin, informationSlotConfig.textStartMargin);
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.WithDependency
    @l
    public List<String> getParamsMustBeFilled() {
        return this.paramsMustBeFilled;
    }

    @l
    public final TextStyle getStyle() {
        return this.style;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final AttributedText getText() {
        return this.text;
    }

    @l
    public final Integer getTextStartMargin() {
        return this.textStartMargin;
    }

    @l
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        AttributedText attributedText = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        TextStyle textStyle = this.style;
        int iHashCode3 = (iHashCode2 + (textStyle == null ? 0 : textStyle.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Integer num = this.topMargin;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.paramsMustBeFilled;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.textStartMargin;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InformationSlotConfig(text=");
        sb2.append(this.text);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", topMargin=");
        sb2.append(this.topMargin);
        sb2.append(", paramsMustBeFilled=");
        sb2.append(this.paramsMustBeFilled);
        sb2.append(", textStartMargin=");
        return s.j(sb2, this.textStartMargin, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.text, flags);
        parcel.writeParcelable(this.subtitle, flags);
        TextStyle textStyle = this.style;
        if (textStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(textStyle.name());
        }
        parcel.writeParcelable(this.image, flags);
        Integer num = this.topMargin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeStringList(this.paramsMustBeFilled);
        Integer num2 = this.textStartMargin;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
    }

    public /* synthetic */ InformationSlotConfig(AttributedText attributedText, AttributedText attributedText2, TextStyle textStyle, UniversalImage universalImage, Integer num, List list, Integer num2, int i12, C42822w c42822w) {
        this(attributedText, (i12 & 2) != 0 ? null : attributedText2, (i12 & 4) != 0 ? null : textStyle, (i12 & 8) != 0 ? null : universalImage, (i12 & 16) != 0 ? null : num, (i12 & 32) != 0 ? null : list, (i12 & 64) == 0 ? num2 : null);
    }
}
