package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LabelTextAttributes.kt */
@d
@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\f¨\u0006'"}, d2 = {"Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/network/model/FontProperties;", "font", "Lcom/avito/android/beduin/network/model/TextLineProperty;", "strikethrough", "underline", "<init>", "(Lcom/avito/android/beduin/network/model/FontProperties;Lcom/avito/android/beduin/network/model/TextLineProperty;Lcom/avito/android/beduin/network/model/TextLineProperty;)V", "component1", "()Lcom/avito/android/beduin/network/model/FontProperties;", "component2", "()Lcom/avito/android/beduin/network/model/TextLineProperty;", "component3", "copy", "(Lcom/avito/android/beduin/network/model/FontProperties;Lcom/avito/android/beduin/network/model/TextLineProperty;Lcom/avito/android/beduin/network/model/TextLineProperty;)Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/network/model/FontProperties;", "getFont", "Lcom/avito/android/beduin/network/model/TextLineProperty;", "getStrikethrough", "getUnderline", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LabelTextAttributes implements Parcelable {

    @k
    public static final Parcelable.Creator<LabelTextAttributes> CREATOR = new a();

    @l
    private final FontProperties font;

    @l
    private final TextLineProperty strikethrough;

    @l
    private final TextLineProperty underline;

    /* compiled from: LabelTextAttributes.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LabelTextAttributes> {
        @Override // android.os.Parcelable.Creator
        public final LabelTextAttributes createFromParcel(Parcel parcel) {
            return new LabelTextAttributes(parcel.readInt() == 0 ? null : FontProperties.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TextLineProperty.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TextLineProperty.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LabelTextAttributes[] newArray(int i12) {
            return new LabelTextAttributes[i12];
        }
    }

    public LabelTextAttributes(@l FontProperties fontProperties, @l TextLineProperty textLineProperty, @l TextLineProperty textLineProperty2) {
        this.font = fontProperties;
        this.strikethrough = textLineProperty;
        this.underline = textLineProperty2;
    }

    public static /* synthetic */ LabelTextAttributes copy$default(LabelTextAttributes labelTextAttributes, FontProperties fontProperties, TextLineProperty textLineProperty, TextLineProperty textLineProperty2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            fontProperties = labelTextAttributes.font;
        }
        if ((i12 & 2) != 0) {
            textLineProperty = labelTextAttributes.strikethrough;
        }
        if ((i12 & 4) != 0) {
            textLineProperty2 = labelTextAttributes.underline;
        }
        return labelTextAttributes.copy(fontProperties, textLineProperty, textLineProperty2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final FontProperties getFont() {
        return this.font;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final TextLineProperty getStrikethrough() {
        return this.strikethrough;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final TextLineProperty getUnderline() {
        return this.underline;
    }

    @k
    public final LabelTextAttributes copy(@l FontProperties font, @l TextLineProperty strikethrough, @l TextLineProperty underline) {
        return new LabelTextAttributes(font, strikethrough, underline);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LabelTextAttributes)) {
            return false;
        }
        LabelTextAttributes labelTextAttributes = (LabelTextAttributes) other;
        return L.f(this.font, labelTextAttributes.font) && L.f(this.strikethrough, labelTextAttributes.strikethrough) && L.f(this.underline, labelTextAttributes.underline);
    }

    @l
    public final FontProperties getFont() {
        return this.font;
    }

    @l
    public final TextLineProperty getStrikethrough() {
        return this.strikethrough;
    }

    @l
    public final TextLineProperty getUnderline() {
        return this.underline;
    }

    public int hashCode() {
        FontProperties fontProperties = this.font;
        int iHashCode = (fontProperties == null ? 0 : fontProperties.hashCode()) * 31;
        TextLineProperty textLineProperty = this.strikethrough;
        int iHashCode2 = (iHashCode + (textLineProperty == null ? 0 : textLineProperty.hashCode())) * 31;
        TextLineProperty textLineProperty2 = this.underline;
        return iHashCode2 + (textLineProperty2 != null ? textLineProperty2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "LabelTextAttributes(font=" + this.font + ", strikethrough=" + this.strikethrough + ", underline=" + this.underline + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        FontProperties fontProperties = this.font;
        if (fontProperties == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fontProperties.writeToParcel(parcel, flags);
        }
        TextLineProperty textLineProperty = this.strikethrough;
        if (textLineProperty == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textLineProperty.writeToParcel(parcel, flags);
        }
        TextLineProperty textLineProperty2 = this.underline;
        if (textLineProperty2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textLineProperty2.writeToParcel(parcel, flags);
        }
    }
}
