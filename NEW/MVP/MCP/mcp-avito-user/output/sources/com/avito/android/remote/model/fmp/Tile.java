package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.fmp.util.Background;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.Icons;
import com.avito.android.remote.model.fmp.util.Margin;
import com.avito.android.remote.model.fmp.util.Padding;
import com.avito.android.remote.model.fmp.util.Size;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpProducts.kt */
@d
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0094\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020,HÖ\u0001¢\u0006\u0004\b4\u0010.J \u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020,HÖ\u0001¢\u0006\u0004\b9\u0010:R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b?\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010#R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010%R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bJ\u0010%R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010(¨\u0006M"}, d2 = {"Lcom/avito/android/remote/model/fmp/Tile;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "subtitle", "Lcom/avito/android/remote/model/fmp/util/Icons;", "icons", "", Constants.DEEPLINK, "Lcom/avito/android/remote/model/fmp/util/Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/fmp/util/Padding;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Lcom/avito/android/remote/model/fmp/util/Margin;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "", "Lcom/avito/android/remote/model/fmp/util/FmpAnalyticsEvent;", "onClick", "onAppear", "Lcom/avito/android/remote/model/fmp/util/Size;", "size", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/fmp/util/Icons;Ljava/lang/String;Lcom/avito/android/remote/model/fmp/util/Background;Lcom/avito/android/remote/model/fmp/util/Padding;Lcom/avito/android/remote/model/fmp/util/Margin;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/Size;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Lcom/avito/android/remote/model/fmp/util/Icons;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/avito/android/remote/model/fmp/util/Background;", "component6", "()Lcom/avito/android/remote/model/fmp/util/Padding;", "component7", "()Lcom/avito/android/remote/model/fmp/util/Margin;", "component8", "()Ljava/util/List;", "component9", "component10", "()Lcom/avito/android/remote/model/fmp/util/Size;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/fmp/util/Icons;Ljava/lang/String;Lcom/avito/android/remote/model/fmp/util/Background;Lcom/avito/android/remote/model/fmp/util/Padding;Lcom/avito/android/remote/model/fmp/util/Margin;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/Size;)Lcom/avito/android/remote/model/fmp/Tile;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/fmp/util/Icons;", "getIcons", "Ljava/lang/String;", "getDeeplink", "Lcom/avito/android/remote/model/fmp/util/Background;", "getBackground", "Lcom/avito/android/remote/model/fmp/util/Padding;", "getPadding", "Lcom/avito/android/remote/model/fmp/util/Margin;", "getMargin", "Ljava/util/List;", "getOnClick", "getOnAppear", "Lcom/avito/android/remote/model/fmp/util/Size;", "getSize", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Tile implements Parcelable {

    @k
    public static final Parcelable.Creator<Tile> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final Background background;

    @c(Constants.DEEPLINK)
    @l
    private final String deeplink;

    @c("icons")
    @l
    private final Icons icons;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN)
    @l
    private final Margin margin;

    @c("onAppear")
    @l
    private final List<FmpAnalyticsEvent> onAppear;

    @c("onClick")
    @l
    private final List<FmpAnalyticsEvent> onClick;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final Padding padding;

    @c("size")
    @l
    private final Size size;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final AttributedText title;

    /* compiled from: FmpProducts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Tile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Tile createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Tile.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Tile.class.getClassLoader());
            Icons iconsCreateFromParcel = parcel.readInt() == 0 ? null : Icons.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            Background backgroundCreateFromParcel = parcel.readInt() == 0 ? null : Background.CREATOR.createFromParcel(parcel);
            Padding paddingCreateFromParcel = parcel.readInt() == 0 ? null : Padding.CREATOR.createFromParcel(parcel);
            Margin marginCreateFromParcel = parcel.readInt() == 0 ? null : Margin.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new Tile(attributedText, attributedText2, iconsCreateFromParcel, string, backgroundCreateFromParcel, paddingCreateFromParcel, marginCreateFromParcel, arrayList, arrayList2, parcel.readInt() != 0 ? Size.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Tile[] newArray(int i12) {
            return new Tile[i12];
        }
    }

    public Tile(@l AttributedText attributedText, @l AttributedText attributedText2, @l Icons icons, @l String str, @l Background background, @l Padding padding, @l Margin margin, @l List<FmpAnalyticsEvent> list, @l List<FmpAnalyticsEvent> list2, @l Size size) {
        this.title = attributedText;
        this.subtitle = attributedText2;
        this.icons = icons;
        this.deeplink = str;
        this.background = background;
        this.padding = padding;
        this.margin = margin;
        this.onClick = list;
        this.onAppear = list2;
        this.size = size;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Icons getIcons() {
        return this.icons;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Padding getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Margin getMargin() {
        return this.margin;
    }

    @l
    public final List<FmpAnalyticsEvent> component8() {
        return this.onClick;
    }

    @l
    public final List<FmpAnalyticsEvent> component9() {
        return this.onAppear;
    }

    @k
    public final Tile copy(@l AttributedText title, @l AttributedText subtitle, @l Icons icons, @l String deeplink, @l Background background, @l Padding padding, @l Margin margin, @l List<FmpAnalyticsEvent> onClick, @l List<FmpAnalyticsEvent> onAppear, @l Size size) {
        return new Tile(title, subtitle, icons, deeplink, background, padding, margin, onClick, onAppear, size);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tile)) {
            return false;
        }
        Tile tile = (Tile) other;
        return L.f(this.title, tile.title) && L.f(this.subtitle, tile.subtitle) && L.f(this.icons, tile.icons) && L.f(this.deeplink, tile.deeplink) && L.f(this.background, tile.background) && L.f(this.padding, tile.padding) && L.f(this.margin, tile.margin) && L.f(this.onClick, tile.onClick) && L.f(this.onAppear, tile.onAppear) && L.f(this.size, tile.size);
    }

    @l
    public final Background getBackground() {
        return this.background;
    }

    @l
    public final String getDeeplink() {
        return this.deeplink;
    }

    @l
    public final Icons getIcons() {
        return this.icons;
    }

    @l
    public final Margin getMargin() {
        return this.margin;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnAppear() {
        return this.onAppear;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnClick() {
        return this.onClick;
    }

    @l
    public final Padding getPadding() {
        return this.padding;
    }

    @l
    public final Size getSize() {
        return this.size;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.subtitle;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Icons icons = this.icons;
        int iHashCode3 = (iHashCode2 + (icons == null ? 0 : icons.hashCode())) * 31;
        String str = this.deeplink;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Background background = this.background;
        int iHashCode5 = (iHashCode4 + (background == null ? 0 : background.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode6 = (iHashCode5 + (padding == null ? 0 : padding.hashCode())) * 31;
        Margin margin = this.margin;
        int iHashCode7 = (iHashCode6 + (margin == null ? 0 : margin.hashCode())) * 31;
        List<FmpAnalyticsEvent> list = this.onClick;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Size size = this.size;
        return iHashCode9 + (size != null ? size.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Tile(title=" + this.title + ", subtitle=" + this.subtitle + ", icons=" + this.icons + ", deeplink=" + this.deeplink + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", onClick=" + this.onClick + ", onAppear=" + this.onAppear + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.subtitle, flags);
        Icons icons = this.icons;
        if (icons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icons.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.deeplink);
        Background background = this.background;
        if (background == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            background.writeToParcel(parcel, flags);
        }
        Padding padding = this.padding;
        if (padding == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            padding.writeToParcel(parcel, flags);
        }
        Margin margin = this.margin;
        if (margin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            margin.writeToParcel(parcel, flags);
        }
        List<FmpAnalyticsEvent> list = this.onClick;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((FmpAnalyticsEvent) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((FmpAnalyticsEvent) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        Size size = this.size;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, flags);
        }
    }
}
