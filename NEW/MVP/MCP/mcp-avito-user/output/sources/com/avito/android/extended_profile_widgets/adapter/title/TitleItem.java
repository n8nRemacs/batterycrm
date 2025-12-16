package com.avito.android.extended_profile_widgets.adapter.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TitleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/title/TitleItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TitleItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<TitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154956b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154957c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154958d;

    /* compiled from: TitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TitleItem> {
        @Override // android.os.Parcelable.Creator
        public final TitleItem createFromParcel(Parcel parcel) {
            return new TitleItem(parcel.readString(), (GridElementType) parcel.readParcelable(TitleItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TitleItem[] newArray(int i12) {
            return new TitleItem[i12];
        }
    }

    public TitleItem(@k String str, @k GridElementType gridElementType, @k String str2) {
        this.f154956b = str;
        this.f154957c = gridElementType;
        this.f154958d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TitleItem)) {
            return false;
        }
        TitleItem titleItem = (TitleItem) obj;
        return L.f(this.f154956b, titleItem.f154956b) && L.f(this.f154957c, titleItem.f154957c) && L.f(this.f154958d, titleItem.f154958d);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154849c() {
        return this.f154957c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154799b() {
        return this.f154956b;
    }

    public final int hashCode() {
        return this.f154958d.hashCode() + com.avito.android.bxcontent.mvi.entity.f.b(this.f154957c, this.f154956b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TitleItem(stringId=");
        sb2.append(this.f154956b);
        sb2.append(", gridType=");
        sb2.append(this.f154957c);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f154958d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154956b);
        parcel.writeParcelable(this.f154957c, i12);
        parcel.writeString(this.f154958d);
    }

    public /* synthetic */ TitleItem(String str, GridElementType gridElementType, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2);
    }
}
