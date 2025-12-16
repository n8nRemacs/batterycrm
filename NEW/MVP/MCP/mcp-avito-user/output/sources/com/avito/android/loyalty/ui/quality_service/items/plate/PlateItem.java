package com.avito.android.loyalty.ui.quality_service.items.plate;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.remote.model.quality_service.QualityServiceWidget;
import com.avito.android.loyalty.ui.quality_service.items.WidgetItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PlateItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/plate/PlateItem;", "Lcom/avito/android/loyalty/ui/quality_service/items/WidgetItem;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PlateItem implements WidgetItem {

    @k
    public static final Parcelable.Creator<PlateItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183926b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f183927c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f183928d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final QualityServiceWidget.PlatesItem.PlateItem.Color f183929e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f183930f;

    /* compiled from: PlateItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PlateItem> {
        @Override // android.os.Parcelable.Creator
        public final PlateItem createFromParcel(Parcel parcel) {
            return new PlateItem(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), QualityServiceWidget.PlatesItem.PlateItem.Color.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(PlateItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PlateItem[] newArray(int i12) {
            return new PlateItem[i12];
        }
    }

    public PlateItem(@k String str, @l Integer num, @k String str2, @k QualityServiceWidget.PlatesItem.PlateItem.Color color, @l AttributedText attributedText) {
        this.f183926b = str;
        this.f183927c = num;
        this.f183928d = str2;
        this.f183929e = color;
        this.f183930f = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlateItem)) {
            return false;
        }
        PlateItem plateItem = (PlateItem) obj;
        return L.f(this.f183926b, plateItem.f183926b) && L.f(this.f183927c, plateItem.f183927c) && L.f(this.f183928d, plateItem.f183928d) && this.f183929e == plateItem.f183929e && L.f(this.f183930f, plateItem.f183930f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75535g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75536h() {
        return this.f183926b;
    }

    public final int hashCode() {
        int iHashCode = this.f183926b.hashCode() * 31;
        Integer num = this.f183927c;
        int iHashCode2 = (this.f183929e.hashCode() + H.d((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f183928d)) * 31;
        AttributedText attributedText = this.f183930f;
        return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlateItem(stringId=");
        sb2.append(this.f183926b);
        sb2.append(", marginBottom=");
        sb2.append(this.f183927c);
        sb2.append(", title=");
        sb2.append(this.f183928d);
        sb2.append(", color=");
        sb2.append(this.f183929e);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f183930f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f183926b);
        Integer num = this.f183927c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f183928d);
        parcel.writeString(this.f183929e.name());
        parcel.writeParcelable(this.f183930f, i12);
    }

    public /* synthetic */ PlateItem(String str, Integer num, String str2, QualityServiceWidget.PlatesItem.PlateItem.Color color, AttributedText attributedText, int i12, C42822w c42822w) {
        this(str, num, str2, color, (i12 & 16) != 0 ? null : attributedText);
    }
}
