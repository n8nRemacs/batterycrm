package com.avito.android.remote.model.text;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FontParameter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter;", "Landroid/os/Parcelable;", "()V", "describeContents", "", "ColorParameter", "ParagraphSpacingParameter", "ParagraphSpacingRelativeParameter", "Re23StrikethroughParameter", "StrikethroughParameter", "StyleParameter", "TextAlignmentParameter", "TextStyleDataParameter", "TextStyleParameter", "UnderlineParameter", "UseParagraphingParameter", "Lcom/avito/android/remote/model/text/FontParameter$ColorParameter;", "Lcom/avito/android/remote/model/text/FontParameter$ParagraphSpacingParameter;", "Lcom/avito/android/remote/model/text/FontParameter$Re23StrikethroughParameter;", "Lcom/avito/android/remote/model/text/FontParameter$StrikethroughParameter;", "Lcom/avito/android/remote/model/text/FontParameter$StyleParameter;", "Lcom/avito/android/remote/model/text/FontParameter$TextAlignmentParameter;", "Lcom/avito/android/remote/model/text/FontParameter$TextStyleDataParameter;", "Lcom/avito/android/remote/model/text/FontParameter$TextStyleParameter;", "Lcom/avito/android/remote/model/text/FontParameter$UnderlineParameter;", "Lcom/avito/android/remote/model/text/FontParameter$UseParagraphingParameter;", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class FontParameter implements Parcelable {

    /* compiled from: FontParameter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$ColorParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "Lcom/avito/android/remote/model/Color;", "color", "colorDark", "", "colorKey", "<init>", "(Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/Color;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;)Lcom/avito/android/remote/model/text/FontParameter$ColorParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Color;", "getColor", "getColorDark", "Ljava/lang/String;", "getColorKey", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    @com.avito.android.gson.d
    public static final /* data */ class ColorParameter extends FontParameter {

        @k
        public static final Parcelable.Creator<ColorParameter> CREATOR = new Creator();

        @c("value")
        @l
        private final Color color;

        @c("valueDark")
        @l
        private final Color colorDark;

        @c("valueName")
        @l
        private final String colorKey;

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ColorParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ColorParameter createFromParcel(@k Parcel parcel) {
                return new ColorParameter((Color) parcel.readParcelable(ColorParameter.class.getClassLoader()), (Color) parcel.readParcelable(ColorParameter.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ColorParameter[] newArray(int i12) {
                return new ColorParameter[i12];
            }
        }

        public ColorParameter(@l Color color, @l Color color2, @l String str) {
            super(null);
            this.color = color;
            this.colorDark = color2;
            this.colorKey = str;
        }

        public static /* synthetic */ ColorParameter copy$default(ColorParameter colorParameter, Color color, Color color2, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                color = colorParameter.color;
            }
            if ((i12 & 2) != 0) {
                color2 = colorParameter.colorDark;
            }
            if ((i12 & 4) != 0) {
                str = colorParameter.colorKey;
            }
            return colorParameter.copy(color, color2, str);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Color getColor() {
            return this.color;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Color getColorDark() {
            return this.colorDark;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getColorKey() {
            return this.colorKey;
        }

        @k
        public final ColorParameter copy(@l Color color, @l Color colorDark, @l String colorKey) {
            return new ColorParameter(color, colorDark, colorKey);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ColorParameter)) {
                return false;
            }
            ColorParameter colorParameter = (ColorParameter) other;
            return L.f(this.color, colorParameter.color) && L.f(this.colorDark, colorParameter.colorDark) && L.f(this.colorKey, colorParameter.colorKey);
        }

        @l
        public final Color getColor() {
            return this.color;
        }

        @l
        public final Color getColorDark() {
            return this.colorDark;
        }

        @l
        public final String getColorKey() {
            return this.colorKey;
        }

        public int hashCode() {
            Color color = this.color;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            Color color2 = this.colorDark;
            int iHashCode2 = (iHashCode + (color2 == null ? 0 : color2.hashCode())) * 31;
            String str = this.colorKey;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ColorParameter(color=");
            sb2.append(this.color);
            sb2.append(", colorDark=");
            sb2.append(this.colorDark);
            sb2.append(", colorKey=");
            return C22026a.c(sb2, this.colorKey, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.color, flags);
            parcel.writeParcelable(this.colorDark, flags);
            parcel.writeString(this.colorKey);
        }
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$ParagraphSpacingParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "", "value", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/avito/android/remote/model/text/FontParameter$ParagraphSpacingParameter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getValue", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ParagraphSpacingParameter extends FontParameter {

        @k
        public static final Parcelable.Creator<ParagraphSpacingParameter> CREATOR = new Creator();

        @c("value")
        private final float value;

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ParagraphSpacingParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ParagraphSpacingParameter createFromParcel(@k Parcel parcel) {
                return new ParagraphSpacingParameter(parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ParagraphSpacingParameter[] newArray(int i12) {
                return new ParagraphSpacingParameter[i12];
            }
        }

        public ParagraphSpacingParameter(float f12) {
            super(null);
            this.value = f12;
        }

        public static /* synthetic */ ParagraphSpacingParameter copy$default(ParagraphSpacingParameter paragraphSpacingParameter, float f12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                f12 = paragraphSpacingParameter.value;
            }
            return paragraphSpacingParameter.copy(f12);
        }

        /* renamed from: component1, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        @k
        public final ParagraphSpacingParameter copy(float value) {
            return new ParagraphSpacingParameter(value);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ParagraphSpacingParameter) && Float.compare(this.value, ((ParagraphSpacingParameter) other).value) == 0;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return Float.hashCode(this.value);
        }

        @k
        public String toString() {
            return r.k(')', this.value, new StringBuilder("ParagraphSpacingParameter(value="));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeFloat(this.value);
        }
    }

    /* compiled from: FontParameter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$ParagraphSpacingRelativeParameter;", "Lcom/avito/android/remote/model/text/FontParameter$UseParagraphingParameter;", "", "value", "<init>", "(F)V", "component1", "()F", "copy", "(F)Lcom/avito/android/remote/model/text/FontParameter$ParagraphSpacingRelativeParameter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getValue", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    @d
    public static final /* data */ class ParagraphSpacingRelativeParameter extends UseParagraphingParameter {

        @k
        public static final Parcelable.Creator<ParagraphSpacingRelativeParameter> CREATOR = new Creator();

        @c("value")
        private final float value;

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ParagraphSpacingRelativeParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ParagraphSpacingRelativeParameter createFromParcel(@k Parcel parcel) {
                return new ParagraphSpacingRelativeParameter(parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ParagraphSpacingRelativeParameter[] newArray(int i12) {
                return new ParagraphSpacingRelativeParameter[i12];
            }
        }

        public ParagraphSpacingRelativeParameter(float f12) {
            this.value = f12;
        }

        public static /* synthetic */ ParagraphSpacingRelativeParameter copy$default(ParagraphSpacingRelativeParameter paragraphSpacingRelativeParameter, float f12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                f12 = paragraphSpacingRelativeParameter.value;
            }
            return paragraphSpacingRelativeParameter.copy(f12);
        }

        /* renamed from: component1, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        @k
        public final ParagraphSpacingRelativeParameter copy(float value) {
            return new ParagraphSpacingRelativeParameter(value);
        }

        @Override // com.avito.android.remote.model.text.FontParameter, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.text.FontParameter.UseParagraphingParameter
        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ParagraphSpacingRelativeParameter) && Float.compare(this.value, ((ParagraphSpacingRelativeParameter) other).value) == 0;
        }

        public final float getValue() {
            return this.value;
        }

        @Override // com.avito.android.remote.model.text.FontParameter.UseParagraphingParameter
        public int hashCode() {
            return Float.hashCode(this.value);
        }

        @k
        public String toString() {
            return r.k(')', this.value, new StringBuilder("ParagraphSpacingRelativeParameter(value="));
        }

        @Override // com.avito.android.remote.model.text.FontParameter.UseParagraphingParameter, android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeFloat(this.value);
        }
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$Re23StrikethroughParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "Lcom/avito/android/remote/model/Color;", "color", "colorDark", "<init>", "(Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;)V", "component1", "()Lcom/avito/android/remote/model/Color;", "component2", "copy", "(Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;)Lcom/avito/android/remote/model/text/FontParameter$Re23StrikethroughParameter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Color;", "getColor", "getColorDark", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Re23StrikethroughParameter extends FontParameter {

        @k
        public static final Parcelable.Creator<Re23StrikethroughParameter> CREATOR = new Creator();

        @c("value")
        @l
        private final Color color;

        @c("valueDark")
        @l
        private final Color colorDark;

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Re23StrikethroughParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Re23StrikethroughParameter createFromParcel(@k Parcel parcel) {
                return new Re23StrikethroughParameter((Color) parcel.readParcelable(Re23StrikethroughParameter.class.getClassLoader()), (Color) parcel.readParcelable(Re23StrikethroughParameter.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Re23StrikethroughParameter[] newArray(int i12) {
                return new Re23StrikethroughParameter[i12];
            }
        }

        public Re23StrikethroughParameter(@l Color color, @l Color color2) {
            super(null);
            this.color = color;
            this.colorDark = color2;
        }

        public static /* synthetic */ Re23StrikethroughParameter copy$default(Re23StrikethroughParameter re23StrikethroughParameter, Color color, Color color2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                color = re23StrikethroughParameter.color;
            }
            if ((i12 & 2) != 0) {
                color2 = re23StrikethroughParameter.colorDark;
            }
            return re23StrikethroughParameter.copy(color, color2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Color getColor() {
            return this.color;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Color getColorDark() {
            return this.colorDark;
        }

        @k
        public final Re23StrikethroughParameter copy(@l Color color, @l Color colorDark) {
            return new Re23StrikethroughParameter(color, colorDark);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Re23StrikethroughParameter)) {
                return false;
            }
            Re23StrikethroughParameter re23StrikethroughParameter = (Re23StrikethroughParameter) other;
            return L.f(this.color, re23StrikethroughParameter.color) && L.f(this.colorDark, re23StrikethroughParameter.colorDark);
        }

        @l
        public final Color getColor() {
            return this.color;
        }

        @l
        public final Color getColorDark() {
            return this.colorDark;
        }

        public int hashCode() {
            Color color = this.color;
            int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
            Color color2 = this.colorDark;
            return iHashCode + (color2 != null ? color2.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Re23StrikethroughParameter(color=" + this.color + ", colorDark=" + this.colorDark + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.color, flags);
            parcel.writeParcelable(this.colorDark, flags);
        }
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$StrikethroughParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "<init>", "()V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StrikethroughParameter extends FontParameter {

        @k
        public static final StrikethroughParameter INSTANCE = new StrikethroughParameter();

        @k
        public static final Parcelable.Creator<StrikethroughParameter> CREATOR = new Creator();

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StrikethroughParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StrikethroughParameter createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return StrikethroughParameter.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StrikethroughParameter[] newArray(int i12) {
                return new StrikethroughParameter[i12];
            }
        }

        private StrikethroughParameter() {
            super(null);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof StrikethroughParameter) {
                return StrikethroughParameter.class.equals(other.getClass());
            }
            return false;
        }

        public int hashCode() {
            return StrikethroughParameter.class.getSimpleName().hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$StyleParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/text/FontParameter$StyleParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StyleParameter extends FontParameter {

        @k
        public static final Parcelable.Creator<StyleParameter> CREATOR = new Creator();

        @c("value")
        @k
        private final String style;

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StyleParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StyleParameter createFromParcel(@k Parcel parcel) {
                return new StyleParameter(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StyleParameter[] newArray(int i12) {
                return new StyleParameter[i12];
            }
        }

        public StyleParameter(@k String str) {
            super(null);
            this.style = str;
        }

        public static /* synthetic */ StyleParameter copy$default(StyleParameter styleParameter, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = styleParameter.style;
            }
            return styleParameter.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        public final StyleParameter copy(@k String style) {
            return new StyleParameter(style);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StyleParameter) && L.f(this.style, ((StyleParameter) other).style);
        }

        @k
        public final String getStyle() {
            return this.style;
        }

        public int hashCode() {
            return this.style.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("StyleParameter(style="), this.style, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.style);
        }
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$TextAlignmentParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "Lcom/avito/android/remote/model/text/TextAlignment;", "alignment", "<init>", "(Lcom/avito/android/remote/model/text/TextAlignment;)V", "component1", "()Lcom/avito/android/remote/model/text/TextAlignment;", "copy", "(Lcom/avito/android/remote/model/text/TextAlignment;)Lcom/avito/android/remote/model/text/FontParameter$TextAlignmentParameter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/TextAlignment;", "getAlignment", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextAlignmentParameter extends FontParameter {

        @k
        public static final Parcelable.Creator<TextAlignmentParameter> CREATOR = new Creator();

        @c("value")
        @l
        private final TextAlignment alignment;

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextAlignmentParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextAlignmentParameter createFromParcel(@k Parcel parcel) {
                return new TextAlignmentParameter(parcel.readInt() == 0 ? null : TextAlignment.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextAlignmentParameter[] newArray(int i12) {
                return new TextAlignmentParameter[i12];
            }
        }

        public TextAlignmentParameter(@l TextAlignment textAlignment) {
            super(null);
            this.alignment = textAlignment;
        }

        public static /* synthetic */ TextAlignmentParameter copy$default(TextAlignmentParameter textAlignmentParameter, TextAlignment textAlignment, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                textAlignment = textAlignmentParameter.alignment;
            }
            return textAlignmentParameter.copy(textAlignment);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final TextAlignment getAlignment() {
            return this.alignment;
        }

        @k
        public final TextAlignmentParameter copy(@l TextAlignment alignment) {
            return new TextAlignmentParameter(alignment);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextAlignmentParameter) && this.alignment == ((TextAlignmentParameter) other).alignment;
        }

        @l
        public final TextAlignment getAlignment() {
            return this.alignment;
        }

        public int hashCode() {
            TextAlignment textAlignment = this.alignment;
            if (textAlignment == null) {
                return 0;
            }
            return textAlignment.hashCode();
        }

        @k
        public String toString() {
            return "TextAlignmentParameter(alignment=" + this.alignment + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            TextAlignment textAlignment = this.alignment;
            if (textAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(textAlignment.name());
            }
        }
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$TextStyleDataParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "LQK0/a;", "textStyleData", "<init>", "(LQK0/a;)V", "component1", "()LQK0/a;", "copy", "(LQK0/a;)Lcom/avito/android/remote/model/text/FontParameter$TextStyleDataParameter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "LQK0/a;", "getTextStyleData", "getTextStyleData$annotations", "()V", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextStyleDataParameter extends FontParameter {

        @k
        public static final Parcelable.Creator<TextStyleDataParameter> CREATOR = new Creator();

        @l
        private final QK0.a textStyleData;

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextStyleDataParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextStyleDataParameter createFromParcel(@k Parcel parcel) {
                return new TextStyleDataParameter(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextStyleDataParameter[] newArray(int i12) {
                return new TextStyleDataParameter[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TextStyleDataParameter() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ TextStyleDataParameter copy$default(TextStyleDataParameter textStyleDataParameter, QK0.a aVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                aVar = textStyleDataParameter.textStyleData;
            }
            return textStyleDataParameter.copy(aVar);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final QK0.a getTextStyleData() {
            return this.textStyleData;
        }

        @k
        public final TextStyleDataParameter copy(@l QK0.a textStyleData) {
            return new TextStyleDataParameter(textStyleData);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TextStyleDataParameter) && L.f(this.textStyleData, ((TextStyleDataParameter) other).textStyleData);
        }

        @l
        public final QK0.a getTextStyleData() {
            return this.textStyleData;
        }

        public int hashCode() {
            QK0.a aVar = this.textStyleData;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public String toString() {
            return "TextStyleDataParameter(textStyleData=" + this.textStyleData + ')';
        }

        public /* synthetic */ TextStyleDataParameter(QK0.a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar);
        }

        public TextStyleDataParameter(@l QK0.a aVar) {
            super(null);
            this.textStyleData = aVar;
        }

        public static /* synthetic */ void getTextStyleData$annotations() {
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
        }
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$UnderlineParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "<init>", "()V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnderlineParameter extends FontParameter {

        @k
        public static final UnderlineParameter INSTANCE = new UnderlineParameter();

        @k
        public static final Parcelable.Creator<UnderlineParameter> CREATOR = new Creator();

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UnderlineParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UnderlineParameter createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return UnderlineParameter.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UnderlineParameter[] newArray(int i12) {
                return new UnderlineParameter[i12];
            }
        }

        private UnderlineParameter() {
            super(null);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof UnderlineParameter) {
                return UnderlineParameter.class.equals(other.getClass());
            }
            return false;
        }

        public int hashCode() {
            return UnderlineParameter.class.getSimpleName().hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$UseParagraphingParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "<init>", "()V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static class UseParagraphingParameter extends FontParameter {

        @k
        public static final Parcelable.Creator<UseParagraphingParameter> CREATOR = new Creator();

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<UseParagraphingParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UseParagraphingParameter createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return new UseParagraphingParameter();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final UseParagraphingParameter[] newArray(int i12) {
                return new UseParagraphingParameter[i12];
            }
        }

        public UseParagraphingParameter() {
            super(null);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof UseParagraphingParameter) {
                return getClass().equals(other.getClass());
            }
            return false;
        }

        public int hashCode() {
            return getClass().getSimpleName().hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ FontParameter(C42822w c42822w) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FontParameter() {
    }

    /* compiled from: FontParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001f\u0010\b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/text/FontParameter$TextStyleParameter;", "Lcom/avito/android/remote/model/text/FontParameter;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "attribute", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/text/FontParameter$TextStyleParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "getStyle$annotations", "()V", "getAttribute", "_common_network-attributed-text_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TextStyleParameter extends FontParameter {

        @k
        public static final Parcelable.Creator<TextStyleParameter> CREATOR = new Creator();

        @c("value")
        @l
        private final String attribute;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        /* compiled from: FontParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TextStyleParameter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextStyleParameter createFromParcel(@k Parcel parcel) {
                return new TextStyleParameter(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TextStyleParameter[] newArray(int i12) {
                return new TextStyleParameter[i12];
            }
        }

        public TextStyleParameter(@l String str, @l String str2) {
            super(null);
            this.style = str;
            this.attribute = str2;
        }

        public static /* synthetic */ TextStyleParameter copy$default(TextStyleParameter textStyleParameter, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = textStyleParameter.style;
            }
            if ((i12 & 2) != 0) {
                str2 = textStyleParameter.attribute;
            }
            return textStyleParameter.copy(str, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getAttribute() {
            return this.attribute;
        }

        @k
        public final TextStyleParameter copy(@l String style, @l String attribute) {
            return new TextStyleParameter(style, attribute);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextStyleParameter)) {
                return false;
            }
            TextStyleParameter textStyleParameter = (TextStyleParameter) other;
            return L.f(this.style, textStyleParameter.style) && L.f(this.attribute, textStyleParameter.attribute);
        }

        @l
        public final String getAttribute() {
            return this.attribute;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        public int hashCode() {
            String str = this.style;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.attribute;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("TextStyleParameter(style=");
            sb2.append(this.style);
            sb2.append(", attribute=");
            return C22026a.c(sb2, this.attribute, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.style);
            parcel.writeString(this.attribute);
        }

        @InterfaceC42830m
        public static /* synthetic */ void getStyle$annotations() {
        }
    }
}
