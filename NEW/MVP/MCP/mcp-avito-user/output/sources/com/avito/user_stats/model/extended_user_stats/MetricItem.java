package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b'\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/MetricItem;", "Landroid/os/Parcelable;", "", "slug", "type", "shortTitle", "Lcom/avito/user_stats/model/extended_user_stats/MetricTotal;", "total", "symbol", "", "Lcom/avito/user_stats/model/extended_user_stats/Hint;", "hint", "Lcom/avito/android/remote/model/UniversalColor;", "plotColor", "Lcom/avito/android/remote/model/text/AttributedText;", "plotTitle", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "hidePeriodDetalization", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/user_stats/model/extended_user_stats/MetricTotal;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getSlug", "()Ljava/lang/String;", "getType", "getShortTitle", "Lcom/avito/user_stats/model/extended_user_stats/MetricTotal;", "i", "()Lcom/avito/user_stats/model/extended_user_stats/MetricTotal;", "h", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/avito/android/remote/model/UniversalColor;", "f", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/remote/model/text/AttributedText;", "g", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "Ljava/lang/Boolean;", "d", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class MetricItem implements Parcelable {

    @k
    public static final Parcelable.Creator<MetricItem> CREATOR = new a();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<MetricItem> children;

    @c("hidePeriodDetalization")
    @l
    private final Boolean hidePeriodDetalization;

    @c("hint")
    @l
    private final List<Hint> hint;

    @c("plotColor")
    @l
    private final UniversalColor plotColor;

    @c("plotTitle")
    @l
    private final AttributedText plotTitle;

    @c("shortTitle")
    @l
    private final String shortTitle;

    @c("slug")
    @k
    private final String slug;

    @c("symbol")
    @l
    private final String symbol;

    @c("total")
    @l
    private final MetricTotal total;

    @c("type")
    @l
    private final String type;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MetricItem> {
        @Override // android.os.Parcelable.Creator
        public final MetricItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            MetricTotal metricTotalCreateFromParcel = parcel.readInt() == 0 ? null : MetricTotal.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Hint.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(MetricItem.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(MetricItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = com.avito.android.actions_sheet.a.c(MetricItem.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MetricItem(string, string2, string3, metricTotalCreateFromParcel, string4, arrayList, universalColor, attributedText, arrayList2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MetricItem[] newArray(int i12) {
            return new MetricItem[i12];
        }
    }

    public MetricItem(@k String str, @l String str2, @l String str3, @l MetricTotal metricTotal, @l String str4, @l List<Hint> list, @l UniversalColor universalColor, @l AttributedText attributedText, @l List<MetricItem> list2, @l Boolean bool) {
        this.slug = str;
        this.type = str2;
        this.shortTitle = str3;
        this.total = metricTotal;
        this.symbol = str4;
        this.hint = list;
        this.plotColor = universalColor;
        this.plotTitle = attributedText;
        this.children = list2;
        this.hidePeriodDetalization = bool;
    }

    @l
    public final List<MetricItem> c() {
        return this.children;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Boolean getHidePeriodDetalization() {
        return this.hidePeriodDetalization;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<Hint> e() {
        return this.hint;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetricItem)) {
            return false;
        }
        MetricItem metricItem = (MetricItem) obj;
        return L.f(this.slug, metricItem.slug) && L.f(this.type, metricItem.type) && L.f(this.shortTitle, metricItem.shortTitle) && L.f(this.total, metricItem.total) && L.f(this.symbol, metricItem.symbol) && L.f(this.hint, metricItem.hint) && L.f(this.plotColor, metricItem.plotColor) && L.f(this.plotTitle, metricItem.plotTitle) && L.f(this.children, metricItem.children) && L.f(this.hidePeriodDetalization, metricItem.hidePeriodDetalization);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final UniversalColor getPlotColor() {
        return this.plotColor;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final AttributedText getPlotTitle() {
        return this.plotTitle;
    }

    @k
    public final String getSlug() {
        return this.slug;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public final int hashCode() {
        int iHashCode = this.slug.hashCode() * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shortTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MetricTotal metricTotal = this.total;
        int iHashCode4 = (iHashCode3 + (metricTotal == null ? 0 : metricTotal.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Hint> list = this.hint;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        UniversalColor universalColor = this.plotColor;
        int iHashCode7 = (iHashCode6 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        AttributedText attributedText = this.plotTitle;
        int iHashCode8 = (iHashCode7 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<MetricItem> list2 = this.children;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.hidePeriodDetalization;
        return iHashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final MetricTotal getTotal() {
        return this.total;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricItem(slug=");
        sb2.append(this.slug);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", shortTitle=");
        sb2.append(this.shortTitle);
        sb2.append(", total=");
        sb2.append(this.total);
        sb2.append(", symbol=");
        sb2.append(this.symbol);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", plotColor=");
        sb2.append(this.plotColor);
        sb2.append(", plotTitle=");
        sb2.append(this.plotTitle);
        sb2.append(", children=");
        sb2.append(this.children);
        sb2.append(", hidePeriodDetalization=");
        return C0.g(sb2, this.hidePeriodDetalization, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.slug);
        parcel.writeString(this.type);
        parcel.writeString(this.shortTitle);
        MetricTotal metricTotal = this.total;
        if (metricTotal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            metricTotal.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.symbol);
        List<Hint> list = this.hint;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Hint) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.plotColor, i12);
        parcel.writeParcelable(this.plotTitle, i12);
        List<MetricItem> list2 = this.children;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((MetricItem) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool = this.hidePeriodDetalization;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
