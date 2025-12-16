package com.avito.android.extended_profile_widgets.adapter.universal.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetTitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/title/UniversalWidgetTitleItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UniversalWidgetTitleItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<UniversalWidgetTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f155005b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f155006c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f155007d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f155008e;

    /* compiled from: UniversalWidgetTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetTitleItem createFromParcel(Parcel parcel) {
            return new UniversalWidgetTitleItem(parcel.readString(), (GridElementType) parcel.readParcelable(UniversalWidgetTitleItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetTitleItem[] newArray(int i12) {
            return new UniversalWidgetTitleItem[i12];
        }
    }

    public UniversalWidgetTitleItem(@k String str, @k GridElementType gridElementType, @k String str2, @l Integer num) {
        this.f155005b = str;
        this.f155006c = gridElementType;
        this.f155007d = str2;
        this.f155008e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetTitleItem)) {
            return false;
        }
        UniversalWidgetTitleItem universalWidgetTitleItem = (UniversalWidgetTitleItem) obj;
        return L.f(this.f155005b, universalWidgetTitleItem.f155005b) && L.f(this.f155006c, universalWidgetTitleItem.f155006c) && L.f(this.f155007d, universalWidgetTitleItem.f155007d) && L.f(this.f155008e, universalWidgetTitleItem.f155008e);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154235c() {
        return this.f155006c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF136260b() {
        return this.f155005b;
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f155006c, this.f155005b.hashCode() * 31, 31), 31, this.f155007d);
        Integer num = this.f155008e;
        return iD2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetTitleItem(stringId=");
        sb2.append(this.f155005b);
        sb2.append(", gridType=");
        sb2.append(this.f155006c);
        sb2.append(", title=");
        sb2.append(this.f155007d);
        sb2.append(", titleMaxLines=");
        return s.j(sb2, this.f155008e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f155005b);
        parcel.writeParcelable(this.f155006c, i12);
        parcel.writeString(this.f155007d);
        Integer num = this.f155008e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ UniversalWidgetTitleItem(String str, GridElementType gridElementType, String str2, Integer num, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, num);
    }
}
