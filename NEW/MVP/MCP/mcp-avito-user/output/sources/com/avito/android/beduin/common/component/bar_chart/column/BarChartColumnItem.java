package com.avito.android.beduin.common.component.bar_chart.column;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BarChartColumnItem.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u0019J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0092\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u001a\u0010.\u001a\u00020\u00142\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b0\u0010\u001dJ \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0014HÂ\u0003¢\u0006\u0004\b7\u00108R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b:\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b<\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010!R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bC\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bD\u0010\u0019R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bE\u0010\u0019R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\bF\u0010\u0019R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010'R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010IR\u0011\u0010J\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/column/BarChartColumnItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "", "stringId", "", "value", "", "width", "Lcom/avito/android/beduin/common/container/Corners;", "corners", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "selectedBackgroundColor", "details", "title", "footer", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "", "_isSelected", "<init>", "(Ljava/lang/String;DILcom/avito/android/beduin/common/container/Corners;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "()I", "component4", "()Lcom/avito/android/beduin/common/container/Corners;", "component5", "()Lcom/avito/android/remote/model/UniversalColor;", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "copy", "(Ljava/lang/String;DILcom/avito/android/beduin/common/container/Corners;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/bar_chart/column/BarChartColumnItem;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component11", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getStringId", "D", "getValue", "I", "getWidth", "Lcom/avito/android/beduin/common/container/Corners;", "getCorners", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getSelectedBackgroundColor", "getDetails", "getTitle", "getFooter", "Ljava/util/List;", "getActions", "Ljava/lang/Boolean;", "isSelected", "()Z", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarChartColumnItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<BarChartColumnItem> CREATOR = new a();

    @l
    private final Boolean _isSelected;

    @com.google.gson.annotations.c("actions")
    @l
    private final List<BeduinAction> actions;

    @com.google.gson.annotations.c("backgroundColor")
    @k
    private final UniversalColor backgroundColor;

    @com.google.gson.annotations.c("corners")
    @l
    private final Corners corners;

    @com.google.gson.annotations.c("details")
    @l
    private final String details;

    @com.google.gson.annotations.c("footer")
    @l
    private final String footer;

    @com.google.gson.annotations.c("selectedBackgroundColor")
    @l
    private final UniversalColor selectedBackgroundColor;

    @com.google.gson.annotations.c("id")
    @k
    private final String stringId;

    @com.google.gson.annotations.c("title")
    @l
    private final String title;

    @com.google.gson.annotations.c("value")
    private final double value;

    @com.google.gson.annotations.c("width")
    private final int width;

    /* compiled from: BarChartColumnItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BarChartColumnItem> {
        @Override // android.os.Parcelable.Creator
        public final BarChartColumnItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            double d12 = parcel.readDouble();
            int i12 = parcel.readInt();
            Corners cornersCreateFromParcel = parcel.readInt() == 0 ? null : Corners.CREATOR.createFromParcel(parcel);
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(BarChartColumnItem.class.getClassLoader());
            UniversalColor universalColor2 = (UniversalColor) parcel.readParcelable(BarChartColumnItem.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BarChartColumnItem.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BarChartColumnItem(string, d12, i12, cornersCreateFromParcel, universalColor, universalColor2, string2, string3, string4, arrayList, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BarChartColumnItem[] newArray(int i12) {
            return new BarChartColumnItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BarChartColumnItem(@k String str, double d12, int i12, @l Corners corners, @k UniversalColor universalColor, @l UniversalColor universalColor2, @l String str2, @l String str3, @l String str4, @l List<? extends BeduinAction> list, @l Boolean bool) {
        this.stringId = str;
        this.value = d12;
        this.width = i12;
        this.corners = corners;
        this.backgroundColor = universalColor;
        this.selectedBackgroundColor = universalColor2;
        this.details = str2;
        this.title = str3;
        this.footer = str4;
        this.actions = list;
        this._isSelected = bool;
    }

    /* renamed from: component11, reason: from getter */
    private final Boolean get_isSelected() {
        return this._isSelected;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getStringId() {
        return this.stringId;
    }

    @l
    public final List<BeduinAction> component10() {
        return this.actions;
    }

    /* renamed from: component2, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Corners getCorners() {
        return this.corners;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final UniversalColor getSelectedBackgroundColor() {
        return this.selectedBackgroundColor;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    @k
    public final BarChartColumnItem copy(@k String stringId, double value, int width, @l Corners corners, @k UniversalColor backgroundColor, @l UniversalColor selectedBackgroundColor, @l String details, @l String title, @l String footer, @l List<? extends BeduinAction> actions, @l Boolean _isSelected) {
        return new BarChartColumnItem(stringId, value, width, corners, backgroundColor, selectedBackgroundColor, details, title, footer, actions, _isSelected);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarChartColumnItem)) {
            return false;
        }
        BarChartColumnItem barChartColumnItem = (BarChartColumnItem) other;
        return L.f(this.stringId, barChartColumnItem.stringId) && Double.compare(this.value, barChartColumnItem.value) == 0 && this.width == barChartColumnItem.width && L.f(this.corners, barChartColumnItem.corners) && L.f(this.backgroundColor, barChartColumnItem.backgroundColor) && L.f(this.selectedBackgroundColor, barChartColumnItem.selectedBackgroundColor) && L.f(this.details, barChartColumnItem.details) && L.f(this.title, barChartColumnItem.title) && L.f(this.footer, barChartColumnItem.footer) && L.f(this.actions, barChartColumnItem.actions) && L.f(this._isSelected, barChartColumnItem._isSelected);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @k
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final Corners getCorners() {
        return this.corners;
    }

    @l
    public final String getDetails() {
        return this.details;
    }

    @l
    public final String getFooter() {
        return this.footer;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF189215e() {
        return getF289965c().hashCode();
    }

    @l
    public final UniversalColor getSelectedBackgroundColor() {
        return this.selectedBackgroundColor;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public String getF289965c() {
        return this.stringId;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final double getValue() {
        return this.value;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iE2 = r.e(this.width, androidx.compose.ui.graphics.colorspace.e.d(this.stringId.hashCode() * 31, 31, this.value), 31);
        Corners corners = this.corners;
        int i12 = com.avito.android.actions_sheet.a.i(this.backgroundColor, (iE2 + (corners == null ? 0 : corners.hashCode())) * 31, 31);
        UniversalColor universalColor = this.selectedBackgroundColor;
        int iHashCode = (i12 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        String str = this.details;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.footer;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this._isSelected;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isSelected() {
        Boolean bool = this._isSelected;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BarChartColumnItem(stringId=");
        sb2.append(this.stringId);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", width=");
        sb2.append(this.width);
        sb2.append(", corners=");
        sb2.append(this.corners);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", selectedBackgroundColor=");
        sb2.append(this.selectedBackgroundColor);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", footer=");
        sb2.append(this.footer);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", _isSelected=");
        return C0.g(sb2, this._isSelected, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.stringId);
        parcel.writeDouble(this.value);
        parcel.writeInt(this.width);
        Corners corners = this.corners;
        if (corners == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            corners.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.selectedBackgroundColor, flags);
        parcel.writeString(this.details);
        parcel.writeString(this.title);
        parcel.writeString(this.footer);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Boolean bool = this._isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ BarChartColumnItem(String str, double d12, int i12, Corners corners, UniversalColor universalColor, UniversalColor universalColor2, String str2, String str3, String str4, List list, Boolean bool, int i13, C42822w c42822w) {
        this(str, d12, i12, corners, universalColor, universalColor2, str2, str3, str4, list, (i13 & 1024) != 0 ? null : bool);
    }
}
