package com.avito.android.beduin.common.component.bar_chart;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinBarChartModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarChartTextSettings implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BarChartTextSettings> CREATOR = new a();

    @com.google.gson.annotations.c("color")
    @Y61.l
    private final UniversalColor color;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final String style;

    /* compiled from: BeduinBarChartModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BarChartTextSettings> {
        @Override // android.os.Parcelable.Creator
        public final BarChartTextSettings createFromParcel(Parcel parcel) {
            return new BarChartTextSettings(parcel.readString(), (UniversalColor) parcel.readParcelable(BarChartTextSettings.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BarChartTextSettings[] newArray(int i12) {
            return new BarChartTextSettings[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarChartTextSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BarChartTextSettings copy$default(BarChartTextSettings barChartTextSettings, String str, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = barChartTextSettings.style;
        }
        if ((i12 & 2) != 0) {
            universalColor = barChartTextSettings.color;
        }
        return barChartTextSettings.copy(str, universalColor);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @Y61.k
    public final BarChartTextSettings copy(@Y61.l String style, @Y61.l UniversalColor color) {
        return new BarChartTextSettings(style, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarChartTextSettings)) {
            return false;
        }
        BarChartTextSettings barChartTextSettings = (BarChartTextSettings) other;
        return L.f(this.style, barChartTextSettings.style) && L.f(this.color, barChartTextSettings.color);
    }

    @Y61.l
    public final UniversalColor getColor() {
        return this.color;
    }

    @Y61.l
    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        String str = this.style;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalColor universalColor = this.color;
        return iHashCode + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BarChartTextSettings(style=");
        sb2.append(this.style);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.style);
        parcel.writeParcelable(this.color, flags);
    }

    public BarChartTextSettings(@Y61.l String str, @Y61.l UniversalColor universalColor) {
        this.style = str;
        this.color = universalColor;
    }

    public /* synthetic */ BarChartTextSettings(String str, UniversalColor universalColor, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : universalColor);
    }
}
