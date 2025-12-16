package com.avito.android.extended_profile_widgets.adapter.info;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/info/TextItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TextItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<TextItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154460b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154461c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f154462d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f154463e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f154464f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f154465g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f154466h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f154467i;

    /* compiled from: TextItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TextItem> {
        @Override // android.os.Parcelable.Creator
        public final TextItem createFromParcel(Parcel parcel) {
            return new TextItem(parcel.readString(), (GridElementType) parcel.readParcelable(TextItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TextItem[] newArray(int i12) {
            return new TextItem[i12];
        }
    }

    public TextItem(@k String str, @k GridElementType gridElementType, @k String str2, @l String str3, @l Integer num, @l String str4, boolean z12, @l String str5) {
        this.f154460b = str;
        this.f154461c = gridElementType;
        this.f154462d = str2;
        this.f154463e = str3;
        this.f154464f = num;
        this.f154465g = str4;
        this.f154466h = z12;
        this.f154467i = str5;
    }

    public static TextItem a(TextItem textItem) {
        String str = textItem.f154460b;
        GridElementType gridElementType = textItem.f154461c;
        String str2 = textItem.f154462d;
        String str3 = textItem.f154463e;
        Integer num = textItem.f154464f;
        String str4 = textItem.f154465g;
        String str5 = textItem.f154467i;
        textItem.getClass();
        return new TextItem(str, gridElementType, str2, str3, num, str4, false, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextItem)) {
            return false;
        }
        TextItem textItem = (TextItem) obj;
        return L.f(this.f154460b, textItem.f154460b) && L.f(this.f154461c, textItem.f154461c) && L.f(this.f154462d, textItem.f154462d) && L.f(this.f154463e, textItem.f154463e) && L.f(this.f154464f, textItem.f154464f) && L.f(this.f154465g, textItem.f154465g) && this.f154466h == textItem.f154466h && L.f(this.f154467i, textItem.f154467i);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154809c() {
        return this.f154461c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF322441b() {
        return this.f154460b;
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154461c, this.f154460b.hashCode() * 31, 31), 31, this.f154462d);
        String str = this.f154463e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f154464f;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f154465g;
        int i12 = r.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f154466h);
        String str3 = this.f154467i;
        return i12 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextItem(stringId=");
        sb2.append(this.f154460b);
        sb2.append(", gridType=");
        sb2.append(this.f154461c);
        sb2.append(", text=");
        sb2.append(this.f154462d);
        sb2.append(", title=");
        sb2.append(this.f154463e);
        sb2.append(", showMoreLinesCount=");
        sb2.append(this.f154464f);
        sb2.append(", showMoreTitle=");
        sb2.append(this.f154465g);
        sb2.append(", isCollapsed=");
        sb2.append(this.f154466h);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.f154467i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154460b);
        parcel.writeParcelable(this.f154461c, i12);
        parcel.writeString(this.f154462d);
        parcel.writeString(this.f154463e);
        Integer num = this.f154464f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f154465g);
        parcel.writeInt(this.f154466h ? 1 : 0);
        parcel.writeString(this.f154467i);
    }

    public /* synthetic */ TextItem(String str, GridElementType gridElementType, String str2, String str3, Integer num, String str4, boolean z12, String str5, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, str3, num, str4, (i12 & 64) != 0 ? true : z12, str5);
    }
}
