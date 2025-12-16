package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpCalculator.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/fmp/CalculatorButton;", "Landroid/os/Parcelable;", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/fmp/ButtonClick;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/fmp/ButtonClick;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/fmp/ButtonClick;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/fmp/ButtonClick;)Lcom/avito/android/remote/model/fmp/CalculatorButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getStyle", "Lcom/avito/android/remote/model/fmp/ButtonClick;", "getOnClick", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CalculatorButton implements Parcelable {

    @k
    public static final Parcelable.Creator<CalculatorButton> CREATOR = new Creator();

    @c("onClick")
    @l
    private final ButtonClick onClick;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("text")
    @l
    private final String text;

    /* compiled from: FmpCalculator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CalculatorButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CalculatorButton createFromParcel(@k Parcel parcel) {
            return new CalculatorButton(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ButtonClick.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CalculatorButton[] newArray(int i12) {
            return new CalculatorButton[i12];
        }
    }

    public CalculatorButton(@l String str, @l String str2, @l ButtonClick buttonClick) {
        this.text = str;
        this.style = str2;
        this.onClick = buttonClick;
    }

    public static /* synthetic */ CalculatorButton copy$default(CalculatorButton calculatorButton, String str, String str2, ButtonClick buttonClick, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = calculatorButton.text;
        }
        if ((i12 & 2) != 0) {
            str2 = calculatorButton.style;
        }
        if ((i12 & 4) != 0) {
            buttonClick = calculatorButton.onClick;
        }
        return calculatorButton.copy(str, str2, buttonClick);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ButtonClick getOnClick() {
        return this.onClick;
    }

    @k
    public final CalculatorButton copy(@l String text, @l String style, @l ButtonClick onClick) {
        return new CalculatorButton(text, style, onClick);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalculatorButton)) {
            return false;
        }
        CalculatorButton calculatorButton = (CalculatorButton) other;
        return L.f(this.text, calculatorButton.text) && L.f(this.style, calculatorButton.style) && L.f(this.onClick, calculatorButton.onClick);
    }

    @l
    public final ButtonClick getOnClick() {
        return this.onClick;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.style;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ButtonClick buttonClick = this.onClick;
        return iHashCode2 + (buttonClick != null ? buttonClick.hashCode() : 0);
    }

    @k
    public String toString() {
        return "CalculatorButton(text=" + this.text + ", style=" + this.style + ", onClick=" + this.onClick + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeString(this.style);
        ButtonClick buttonClick = this.onClick;
        if (buttonClick == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonClick.writeToParcel(parcel, flags);
        }
    }
}
