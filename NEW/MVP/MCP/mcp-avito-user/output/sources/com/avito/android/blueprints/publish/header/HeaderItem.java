package com.avito.android.blueprints.publish.header;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.header.SectionSeparatorSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/header/HeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class HeaderItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<HeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f106194b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f106195c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f106196d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f106197e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f106198f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f106199g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f106200h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final SectionSeparatorSlotConfig.Tooltip f106201i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Theme f106202j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Boolean f106203k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f106204l;

    /* compiled from: HeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final HeaderItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(HeaderItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(HeaderItem.class.getClassLoader());
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            SectionSeparatorSlotConfig.Tooltip tooltip = (SectionSeparatorSlotConfig.Tooltip) parcel.readParcelable(HeaderItem.class.getClassLoader());
            Theme themeValueOf = parcel.readInt() == 0 ? null : Theme.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HeaderItem(string, attributedText, attributedText2, string2, z12, numValueOf, numValueOf2, tooltip, themeValueOf, boolValueOf, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final HeaderItem[] newArray(int i12) {
            return new HeaderItem[i12];
        }
    }

    public HeaderItem(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l String str2, boolean z12, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l SectionSeparatorSlotConfig.Tooltip tooltip, @Y61.l Theme theme, @Y61.l Boolean bool, boolean z13) {
        this.f106194b = str;
        this.f106195c = attributedText;
        this.f106196d = attributedText2;
        this.f106197e = str2;
        this.f106198f = z12;
        this.f106199g = num;
        this.f106200h = num2;
        this.f106201i = tooltip;
        this.f106202j = theme;
        this.f106203k = bool;
        this.f106204l = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderItem)) {
            return false;
        }
        HeaderItem headerItem = (HeaderItem) obj;
        return L.f(this.f106194b, headerItem.f106194b) && L.f(this.f106195c, headerItem.f106195c) && L.f(this.f106196d, headerItem.f106196d) && L.f(this.f106197e, headerItem.f106197e) && this.f106198f == headerItem.f106198f && L.f(this.f106199g, headerItem.f106199g) && L.f(this.f106200h, headerItem.f106200h) && L.f(this.f106201i, headerItem.f106201i) && this.f106202j == headerItem.f106202j && L.f(this.f106203k, headerItem.f106203k) && this.f106204l == headerItem.f106204l;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    public final String getStringId() {
        return this.f106194b;
    }

    public final int hashCode() {
        int iHashCode = this.f106194b.hashCode() * 31;
        AttributedText attributedText = this.f106195c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f106196d;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.f106197e;
        int i12 = r.i((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f106198f);
        Integer num = this.f106199g;
        int iHashCode4 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f106200h;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        SectionSeparatorSlotConfig.Tooltip tooltip = this.f106201i;
        int iHashCode6 = (iHashCode5 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
        Theme theme = this.f106202j;
        int iHashCode7 = (iHashCode6 + (theme == null ? 0 : theme.hashCode())) * 31;
        Boolean bool = this.f106203k;
        return Boolean.hashCode(this.f106204l) + ((iHashCode7 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f106194b);
        sb2.append(", attributedTitle=");
        sb2.append(this.f106195c);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.f106196d);
        sb2.append(", badgeText=");
        sb2.append(this.f106197e);
        sb2.append(", showDividerOnTop=");
        sb2.append(this.f106198f);
        sb2.append(", topMargin=");
        sb2.append(this.f106199g);
        sb2.append(", bottomMargin=");
        sb2.append(this.f106200h);
        sb2.append(", tooltip=");
        sb2.append(this.f106201i);
        sb2.append(", theme=");
        sb2.append(this.f106202j);
        sb2.append(", isSectionSeparator=");
        sb2.append(this.f106203k);
        sb2.append(", isRealtyPhotos=");
        return r.x(sb2, this.f106204l, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f106194b);
        parcel.writeParcelable(this.f106195c, i12);
        parcel.writeParcelable(this.f106196d, i12);
        parcel.writeString(this.f106197e);
        parcel.writeInt(this.f106198f ? 1 : 0);
        Integer num = this.f106199g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f106200h;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.f106201i, i12);
        Theme theme = this.f106202j;
        if (theme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(theme.name());
        }
        Boolean bool = this.f106203k;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.f106204l ? 1 : 0);
    }

    public /* synthetic */ HeaderItem(String str, AttributedText attributedText, AttributedText attributedText2, String str2, boolean z12, Integer num, Integer num2, SectionSeparatorSlotConfig.Tooltip tooltip, Theme theme, Boolean bool, boolean z13, int i12, C42822w c42822w) {
        this(str, attributedText, attributedText2, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2, (i12 & 128) != 0 ? null : tooltip, (i12 & 256) != 0 ? null : theme, (i12 & 512) != 0 ? null : bool, (i12 & 1024) != 0 ? false : z13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HeaderItem(String str, String str2, String str3, String str4, boolean z12, Integer num, Integer num2, SectionSeparatorSlotConfig.Tooltip tooltip, Theme theme, boolean z13, int i12, C42822w c42822w) {
        String str5 = (i12 & 4) != 0 ? null : str3;
        this(str, str2 != null ? new AttributedText(str2, C42784z0.f406748b, 0, 4, null) : null, str5 != null ? new AttributedText(str5, C42784z0.f406748b, 0, 4, null) : null, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2, (i12 & 128) != 0 ? null : tooltip, (i12 & 256) != 0 ? null : theme, (Boolean) null, (i12 & 512) != 0 ? false : z13, 512, (C42822w) null);
    }

    public HeaderItem(String str, String str2, AttributedText attributedText, String str3, boolean z12, Integer num, Integer num2, SectionSeparatorSlotConfig.Tooltip tooltip, Theme theme, Boolean bool, boolean z13, int i12, C42822w c42822w) {
        this(str, str2 != null ? new AttributedText(str2, C42784z0.f406748b, 0, 4, null) : null, (i12 & 4) != 0 ? null : attributedText, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : num2, (i12 & 128) != 0 ? null : tooltip, (i12 & 256) != 0 ? null : theme, (i12 & 512) != 0 ? null : bool, (i12 & 1024) == 0 ? z13 : false);
    }

    public HeaderItem(String str, AttributedText attributedText, String str2, String str3, boolean z12, Integer num, Integer num2, SectionSeparatorSlotConfig.Tooltip tooltip, Theme theme, boolean z13, int i12, C42822w c42822w) {
        AttributedText attributedText2 = null;
        String str4 = (i12 & 4) != 0 ? null : str2;
        String str5 = (i12 & 8) != 0 ? null : str3;
        boolean z14 = (i12 & 16) != 0 ? false : z12;
        Integer num3 = (i12 & 32) != 0 ? null : num;
        Integer num4 = (i12 & 64) != 0 ? null : num2;
        SectionSeparatorSlotConfig.Tooltip tooltip2 = (i12 & 128) != 0 ? null : tooltip;
        Theme theme2 = (i12 & 256) != 0 ? null : theme;
        boolean z15 = (i12 & 512) != 0 ? false : z13;
        if (str4 != null) {
            attributedText2 = new AttributedText(str4, C42784z0.f406748b, 0, 4, null);
        }
        this(str, attributedText, attributedText2, str5, z14, num3, num4, tooltip2, theme2, (Boolean) null, z15, 512, (C42822w) null);
    }
}
