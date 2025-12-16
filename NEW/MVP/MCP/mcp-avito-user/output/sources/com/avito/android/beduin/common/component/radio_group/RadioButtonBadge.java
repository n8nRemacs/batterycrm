package com.avito.android.beduin.common.component.radio_group;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinRadioGroupModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/RadioButtonBadge;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/radio_group/RadioButtonBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getBackground", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RadioButtonBadge implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RadioButtonBadge> CREATOR = new a();

    @Y61.l
    private final UniversalColor background;

    @Y61.l
    private final String text;

    @Y61.l
    private final UniversalColor textColor;

    /* compiled from: BeduinRadioGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RadioButtonBadge> {
        @Override // android.os.Parcelable.Creator
        public final RadioButtonBadge createFromParcel(Parcel parcel) {
            return new RadioButtonBadge(parcel.readString(), (UniversalColor) parcel.readParcelable(RadioButtonBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(RadioButtonBadge.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RadioButtonBadge[] newArray(int i12) {
            return new RadioButtonBadge[i12];
        }
    }

    public RadioButtonBadge(@Y61.l String str, @Y61.l UniversalColor universalColor, @Y61.l UniversalColor universalColor2) {
        this.text = str;
        this.textColor = universalColor;
        this.background = universalColor2;
    }

    public static /* synthetic */ RadioButtonBadge copy$default(RadioButtonBadge radioButtonBadge, String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = radioButtonBadge.text;
        }
        if ((i12 & 2) != 0) {
            universalColor = radioButtonBadge.textColor;
        }
        if ((i12 & 4) != 0) {
            universalColor2 = radioButtonBadge.background;
        }
        return radioButtonBadge.copy(str, universalColor, universalColor2);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getBackground() {
        return this.background;
    }

    @Y61.k
    public final RadioButtonBadge copy(@Y61.l String text, @Y61.l UniversalColor textColor, @Y61.l UniversalColor background) {
        return new RadioButtonBadge(text, textColor, background);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioButtonBadge)) {
            return false;
        }
        RadioButtonBadge radioButtonBadge = (RadioButtonBadge) other;
        return L.f(this.text, radioButtonBadge.text) && L.f(this.textColor, radioButtonBadge.textColor) && L.f(this.background, radioButtonBadge.background);
    }

    @Y61.l
    public final UniversalColor getBackground() {
        return this.background;
    }

    @Y61.l
    public final String getText() {
        return this.text;
    }

    @Y61.l
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalColor universalColor = this.textColor;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.background;
        return iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RadioButtonBadge(text=");
        sb2.append(this.text);
        sb2.append(", textColor=");
        sb2.append(this.textColor);
        sb2.append(", background=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.background, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.textColor, flags);
        parcel.writeParcelable(this.background, flags);
    }
}
