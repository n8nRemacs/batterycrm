package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpCalculatorButton.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/fmp/FmpCalculatorButton;", "Landroid/os/Parcelable;", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/fmp/FmpButtonClick;", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/fmp/FmpButtonClick;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getStyle", "Lcom/avito/android/remote/fmp/FmpButtonClick;", "c", "()Lcom/avito/android/remote/fmp/FmpButtonClick;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FmpCalculatorButton implements Parcelable {

    @k
    public static final Parcelable.Creator<FmpCalculatorButton> CREATOR = new a();

    @c("onClick")
    @l
    private final FmpButtonClick onClick;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("text")
    @l
    private final String text;

    /* compiled from: FmpCalculatorButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FmpCalculatorButton> {
        @Override // android.os.Parcelable.Creator
        public final FmpCalculatorButton createFromParcel(Parcel parcel) {
            return new FmpCalculatorButton(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FmpButtonClick.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FmpCalculatorButton[] newArray(int i12) {
            return new FmpCalculatorButton[i12];
        }
    }

    public FmpCalculatorButton(@l String str, @l String str2, @l FmpButtonClick fmpButtonClick) {
        this.text = str;
        this.style = str2;
        this.onClick = fmpButtonClick;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final FmpButtonClick getOnClick() {
        return this.onClick;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FmpCalculatorButton)) {
            return false;
        }
        FmpCalculatorButton fmpCalculatorButton = (FmpCalculatorButton) obj;
        return L.f(this.text, fmpCalculatorButton.text) && L.f(this.style, fmpCalculatorButton.style) && L.f(this.onClick, fmpCalculatorButton.onClick);
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.style;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FmpButtonClick fmpButtonClick = this.onClick;
        return iHashCode2 + (fmpButtonClick != null ? fmpButtonClick.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "FmpCalculatorButton(text=" + this.text + ", style=" + this.style + ", onClick=" + this.onClick + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeString(this.style);
        FmpButtonClick fmpButtonClick = this.onClick;
        if (fmpButtonClick == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fmpButtonClick.writeToParcel(parcel, i12);
        }
    }
}
