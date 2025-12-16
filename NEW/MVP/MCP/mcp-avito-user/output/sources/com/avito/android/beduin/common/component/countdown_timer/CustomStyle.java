package com.avito.android.beduin.common.component.countdown_timer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCountDownTimerModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/beduin/common/component/countdown_timer/CustomStyle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalColor;", "_cellColor", "Lcom/avito/android/beduin/common/component/countdown_timer/CellSize;", "cellSize", "_textColor", "", "_textStyle", "<init>", "(Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/countdown_timer/CellSize;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/beduin/common/component/countdown_timer/CellSize;", "d", "()Lcom/avito/android/beduin/common/component/countdown_timer/CellSize;", "Ljava/lang/String;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CustomStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<CustomStyle> CREATOR = new a();

    @com.google.gson.annotations.c("cellColor")
    @l
    private final UniversalColor _cellColor;

    @com.google.gson.annotations.c("textColor")
    @l
    private final UniversalColor _textColor;

    @com.google.gson.annotations.c("textStyle")
    @l
    private final String _textStyle;

    @com.google.gson.annotations.c("cellSize")
    @l
    private final CellSize cellSize;

    /* compiled from: BeduinCountDownTimerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CustomStyle> {
        @Override // android.os.Parcelable.Creator
        public final CustomStyle createFromParcel(Parcel parcel) {
            return new CustomStyle((UniversalColor) parcel.readParcelable(CustomStyle.class.getClassLoader()), parcel.readInt() == 0 ? null : CellSize.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(CustomStyle.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CustomStyle[] newArray(int i12) {
            return new CustomStyle[i12];
        }
    }

    public CustomStyle(@l UniversalColor universalColor, @l CellSize cellSize, @l UniversalColor universalColor2, @l String str) {
        this._cellColor = universalColor;
        this.cellSize = cellSize;
        this._textColor = universalColor2;
        this._textStyle = str;
    }

    @k
    public final UniversalColor c() {
        UniversalColor universalColor = this._cellColor;
        return universalColor == null ? UniversalColorKt.universalColorOf$default("white", 0, 2, null) : universalColor;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final CellSize getCellSize() {
        return this.cellSize;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final UniversalColor e() {
        UniversalColor universalColor = this._textColor;
        return universalColor == null ? UniversalColorKt.universalColorOf$default(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, 0, 2, null) : universalColor;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomStyle)) {
            return false;
        }
        CustomStyle customStyle = (CustomStyle) obj;
        return L.f(this._cellColor, customStyle._cellColor) && L.f(this.cellSize, customStyle.cellSize) && L.f(this._textColor, customStyle._textColor) && L.f(this._textStyle, customStyle._textStyle);
    }

    @k
    public final String f() {
        String str = this._textStyle;
        return str == null ? "H40" : str;
    }

    public final int hashCode() {
        UniversalColor universalColor = this._cellColor;
        int iHashCode = (universalColor == null ? 0 : universalColor.hashCode()) * 31;
        CellSize cellSize = this.cellSize;
        int iHashCode2 = (iHashCode + (cellSize == null ? 0 : cellSize.hashCode())) * 31;
        UniversalColor universalColor2 = this._textColor;
        int iHashCode3 = (iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        String str = this._textStyle;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomStyle(_cellColor=");
        sb2.append(this._cellColor);
        sb2.append(", cellSize=");
        sb2.append(this.cellSize);
        sb2.append(", _textColor=");
        sb2.append(this._textColor);
        sb2.append(", _textStyle=");
        return C22026a.c(sb2, this._textStyle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this._cellColor, i12);
        CellSize cellSize = this.cellSize;
        if (cellSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cellSize.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this._textColor, i12);
        parcel.writeString(this._textStyle);
    }
}
