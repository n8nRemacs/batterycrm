package com.avito.android.beduin.common.component.bar_chart;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinBarChartModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJZ\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u0015R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0017R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b2\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u001aR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u00105R\u0011\u00108\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b9\u0010\u0011¨\u0006;"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/BarChartVerticalAxis;", "Landroid/os/Parcelable;", "", "", "items", "Lcom/avito/android/beduin/common/component/bar_chart/VerticalAxisPosition;", "_position", "", "maxValue", "minValue", "Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;", "textSettings", "", "_drawFromZero", "<init>", "(Ljava/util/List;Lcom/avito/android/beduin/common/component/bar_chart/VerticalAxisPosition;DDLcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;Ljava/lang/Boolean;)V", "component2", "()Lcom/avito/android/beduin/common/component/bar_chart/VerticalAxisPosition;", "component6", "()Ljava/lang/Boolean;", "component1", "()Ljava/util/List;", "component3", "()D", "component4", "component5", "()Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;", "copy", "(Ljava/util/List;Lcom/avito/android/beduin/common/component/bar_chart/VerticalAxisPosition;DDLcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/bar_chart/BarChartVerticalAxis;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "Lcom/avito/android/beduin/common/component/bar_chart/VerticalAxisPosition;", "D", "getMaxValue", "getMinValue", "Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;", "getTextSettings", "Ljava/lang/Boolean;", "getDrawFromZero", "()Z", "drawFromZero", "getPosition", "position", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarChartVerticalAxis implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BarChartVerticalAxis> CREATOR = new a();

    @com.google.gson.annotations.c("drawFromZero")
    @Y61.l
    private final Boolean _drawFromZero;

    @com.google.gson.annotations.c("position")
    @Y61.l
    private final VerticalAxisPosition _position;

    @com.google.gson.annotations.c("items")
    @Y61.l
    private final List<String> items;

    @com.google.gson.annotations.c("maxValue")
    private final double maxValue;

    @com.google.gson.annotations.c("minValue")
    private final double minValue;

    @com.google.gson.annotations.c("textSettings")
    @Y61.l
    private final BarChartTextSettings textSettings;

    /* compiled from: BeduinBarChartModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BarChartVerticalAxis> {
        @Override // android.os.Parcelable.Creator
        public final BarChartVerticalAxis createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            VerticalAxisPosition verticalAxisPositionValueOf = parcel.readInt() == 0 ? null : VerticalAxisPosition.valueOf(parcel.readString());
            double d12 = parcel.readDouble();
            double d13 = parcel.readDouble();
            BarChartTextSettings barChartTextSettingsCreateFromParcel = parcel.readInt() == 0 ? null : BarChartTextSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BarChartVerticalAxis(arrayListCreateStringArrayList, verticalAxisPositionValueOf, d12, d13, barChartTextSettingsCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BarChartVerticalAxis[] newArray(int i12) {
            return new BarChartVerticalAxis[i12];
        }
    }

    public BarChartVerticalAxis(@Y61.l List<String> list, @Y61.l VerticalAxisPosition verticalAxisPosition, double d12, double d13, @Y61.l BarChartTextSettings barChartTextSettings, @Y61.l Boolean bool) {
        this.items = list;
        this._position = verticalAxisPosition;
        this.maxValue = d12;
        this.minValue = d13;
        this.textSettings = barChartTextSettings;
        this._drawFromZero = bool;
    }

    /* renamed from: component2, reason: from getter */
    private final VerticalAxisPosition get_position() {
        return this._position;
    }

    /* renamed from: component6, reason: from getter */
    private final Boolean get_drawFromZero() {
        return this._drawFromZero;
    }

    @Y61.l
    public final List<String> component1() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final double getMaxValue() {
        return this.maxValue;
    }

    /* renamed from: component4, reason: from getter */
    public final double getMinValue() {
        return this.minValue;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final BarChartTextSettings getTextSettings() {
        return this.textSettings;
    }

    @Y61.k
    public final BarChartVerticalAxis copy(@Y61.l List<String> items, @Y61.l VerticalAxisPosition _position, double maxValue, double minValue, @Y61.l BarChartTextSettings textSettings, @Y61.l Boolean _drawFromZero) {
        return new BarChartVerticalAxis(items, _position, maxValue, minValue, textSettings, _drawFromZero);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarChartVerticalAxis)) {
            return false;
        }
        BarChartVerticalAxis barChartVerticalAxis = (BarChartVerticalAxis) other;
        return L.f(this.items, barChartVerticalAxis.items) && this._position == barChartVerticalAxis._position && Double.compare(this.maxValue, barChartVerticalAxis.maxValue) == 0 && Double.compare(this.minValue, barChartVerticalAxis.minValue) == 0 && L.f(this.textSettings, barChartVerticalAxis.textSettings) && L.f(this._drawFromZero, barChartVerticalAxis._drawFromZero);
    }

    public final boolean getDrawFromZero() {
        Boolean bool = this._drawFromZero;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Y61.l
    public final List<String> getItems() {
        return this.items;
    }

    public final double getMaxValue() {
        return this.maxValue;
    }

    public final double getMinValue() {
        return this.minValue;
    }

    @Y61.k
    public final VerticalAxisPosition getPosition() {
        VerticalAxisPosition verticalAxisPosition = this._position;
        return verticalAxisPosition == null ? VerticalAxisPosition.LEFT : verticalAxisPosition;
    }

    @Y61.l
    public final BarChartTextSettings getTextSettings() {
        return this.textSettings;
    }

    public int hashCode() {
        List<String> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        VerticalAxisPosition verticalAxisPosition = this._position;
        int iD2 = androidx.compose.ui.graphics.colorspace.e.d(androidx.compose.ui.graphics.colorspace.e.d((iHashCode + (verticalAxisPosition == null ? 0 : verticalAxisPosition.hashCode())) * 31, 31, this.maxValue), 31, this.minValue);
        BarChartTextSettings barChartTextSettings = this.textSettings;
        int iHashCode2 = (iD2 + (barChartTextSettings == null ? 0 : barChartTextSettings.hashCode())) * 31;
        Boolean bool = this._drawFromZero;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BarChartVerticalAxis(items=");
        sb2.append(this.items);
        sb2.append(", _position=");
        sb2.append(this._position);
        sb2.append(", maxValue=");
        sb2.append(this.maxValue);
        sb2.append(", minValue=");
        sb2.append(this.minValue);
        sb2.append(", textSettings=");
        sb2.append(this.textSettings);
        sb2.append(", _drawFromZero=");
        return C0.g(sb2, this._drawFromZero, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeStringList(this.items);
        VerticalAxisPosition verticalAxisPosition = this._position;
        if (verticalAxisPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verticalAxisPosition.name());
        }
        parcel.writeDouble(this.maxValue);
        parcel.writeDouble(this.minValue);
        BarChartTextSettings barChartTextSettings = this.textSettings;
        if (barChartTextSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            barChartTextSettings.writeToParcel(parcel, flags);
        }
        Boolean bool = this._drawFromZero;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
