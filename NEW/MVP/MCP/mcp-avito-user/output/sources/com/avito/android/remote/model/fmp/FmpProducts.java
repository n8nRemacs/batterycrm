package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.fmp.util.FmpAnalyticsEvent;
import com.avito.android.remote.model.fmp.util.Margin;
import com.avito.android.remote.model.fmp.util.Padding;
import com.avito.android.remote.model.fmp.util.Size;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpProducts.kt */
@d
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJp\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001cR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b>\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\b@\u0010\u001f¨\u0006A"}, d2 = {"Lcom/avito/android/remote/model/fmp/FmpProducts;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/fmp/Tile;", "tiles", "Lcom/avito/android/remote/model/fmp/MortgageTile;", "mortgageTile", "Lcom/avito/android/remote/model/fmp/util/Padding;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Lcom/avito/android/remote/model/fmp/util/Margin;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/remote/model/fmp/EnumPosition;", "position", "Lcom/avito/android/remote/model/fmp/util/FmpAnalyticsEvent;", "onAppear", "Lcom/avito/android/remote/model/fmp/util/Size;", "size", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/fmp/MortgageTile;Lcom/avito/android/remote/model/fmp/util/Padding;Lcom/avito/android/remote/model/fmp/util/Margin;Lcom/avito/android/remote/model/fmp/EnumPosition;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/Size;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/fmp/MortgageTile;", "component3", "()Lcom/avito/android/remote/model/fmp/util/Padding;", "component4", "()Lcom/avito/android/remote/model/fmp/util/Margin;", "component5", "()Lcom/avito/android/remote/model/fmp/EnumPosition;", "component6", "component7", "()Lcom/avito/android/remote/model/fmp/util/Size;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/fmp/MortgageTile;Lcom/avito/android/remote/model/fmp/util/Padding;Lcom/avito/android/remote/model/fmp/util/Margin;Lcom/avito/android/remote/model/fmp/EnumPosition;Ljava/util/List;Lcom/avito/android/remote/model/fmp/util/Size;)Lcom/avito/android/remote/model/fmp/FmpProducts;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getTiles", "Lcom/avito/android/remote/model/fmp/MortgageTile;", "getMortgageTile", "Lcom/avito/android/remote/model/fmp/util/Padding;", "getPadding", "Lcom/avito/android/remote/model/fmp/util/Margin;", "getMargin", "Lcom/avito/android/remote/model/fmp/EnumPosition;", "getPosition", "getOnAppear", "Lcom/avito/android/remote/model/fmp/util/Size;", "getSize", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FmpProducts implements Parcelable {

    @k
    public static final Parcelable.Creator<FmpProducts> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN)
    @l
    private final Margin margin;

    @c("mortgageTile")
    @l
    private final MortgageTile mortgageTile;

    @c("onAppear")
    @l
    private final List<FmpAnalyticsEvent> onAppear;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final Padding padding;

    @c("position")
    @l
    private final EnumPosition position;

    @c("size")
    @l
    private final Size size;

    @c("tiles")
    @l
    private final List<Tile> tiles;

    /* compiled from: FmpProducts.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FmpProducts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FmpProducts createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(Tile.CREATOR, parcel, arrayList3, iC3, 1);
                }
                arrayList = arrayList3;
            }
            MortgageTile mortgageTileCreateFromParcel = parcel.readInt() == 0 ? null : MortgageTile.CREATOR.createFromParcel(parcel);
            Padding paddingCreateFromParcel = parcel.readInt() == 0 ? null : Padding.CREATOR.createFromParcel(parcel);
            Margin marginCreateFromParcel = parcel.readInt() == 0 ? null : Margin.CREATOR.createFromParcel(parcel);
            EnumPosition enumPositionCreateFromParcel = parcel.readInt() == 0 ? null : EnumPosition.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(FmpAnalyticsEvent.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new FmpProducts(arrayList, mortgageTileCreateFromParcel, paddingCreateFromParcel, marginCreateFromParcel, enumPositionCreateFromParcel, arrayList2, parcel.readInt() != 0 ? Size.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FmpProducts[] newArray(int i12) {
            return new FmpProducts[i12];
        }
    }

    public FmpProducts(@l List<Tile> list, @l MortgageTile mortgageTile, @l Padding padding, @l Margin margin, @l EnumPosition enumPosition, @l List<FmpAnalyticsEvent> list2, @l Size size) {
        this.tiles = list;
        this.mortgageTile = mortgageTile;
        this.padding = padding;
        this.margin = margin;
        this.position = enumPosition;
        this.onAppear = list2;
        this.size = size;
    }

    public static /* synthetic */ FmpProducts copy$default(FmpProducts fmpProducts, List list, MortgageTile mortgageTile, Padding padding, Margin margin, EnumPosition enumPosition, List list2, Size size, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = fmpProducts.tiles;
        }
        if ((i12 & 2) != 0) {
            mortgageTile = fmpProducts.mortgageTile;
        }
        MortgageTile mortgageTile2 = mortgageTile;
        if ((i12 & 4) != 0) {
            padding = fmpProducts.padding;
        }
        Padding padding2 = padding;
        if ((i12 & 8) != 0) {
            margin = fmpProducts.margin;
        }
        Margin margin2 = margin;
        if ((i12 & 16) != 0) {
            enumPosition = fmpProducts.position;
        }
        EnumPosition enumPosition2 = enumPosition;
        if ((i12 & 32) != 0) {
            list2 = fmpProducts.onAppear;
        }
        List list3 = list2;
        if ((i12 & 64) != 0) {
            size = fmpProducts.size;
        }
        return fmpProducts.copy(list, mortgageTile2, padding2, margin2, enumPosition2, list3, size);
    }

    @l
    public final List<Tile> component1() {
        return this.tiles;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final MortgageTile getMortgageTile() {
        return this.mortgageTile;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Padding getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Margin getMargin() {
        return this.margin;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final EnumPosition getPosition() {
        return this.position;
    }

    @l
    public final List<FmpAnalyticsEvent> component6() {
        return this.onAppear;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Size getSize() {
        return this.size;
    }

    @k
    public final FmpProducts copy(@l List<Tile> tiles, @l MortgageTile mortgageTile, @l Padding padding, @l Margin margin, @l EnumPosition position, @l List<FmpAnalyticsEvent> onAppear, @l Size size) {
        return new FmpProducts(tiles, mortgageTile, padding, margin, position, onAppear, size);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FmpProducts)) {
            return false;
        }
        FmpProducts fmpProducts = (FmpProducts) other;
        return L.f(this.tiles, fmpProducts.tiles) && L.f(this.mortgageTile, fmpProducts.mortgageTile) && L.f(this.padding, fmpProducts.padding) && L.f(this.margin, fmpProducts.margin) && this.position == fmpProducts.position && L.f(this.onAppear, fmpProducts.onAppear) && L.f(this.size, fmpProducts.size);
    }

    @l
    public final Margin getMargin() {
        return this.margin;
    }

    @l
    public final MortgageTile getMortgageTile() {
        return this.mortgageTile;
    }

    @l
    public final List<FmpAnalyticsEvent> getOnAppear() {
        return this.onAppear;
    }

    @l
    public final Padding getPadding() {
        return this.padding;
    }

    @l
    public final EnumPosition getPosition() {
        return this.position;
    }

    @l
    public final Size getSize() {
        return this.size;
    }

    @l
    public final List<Tile> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        List<Tile> list = this.tiles;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        MortgageTile mortgageTile = this.mortgageTile;
        int iHashCode2 = (iHashCode + (mortgageTile == null ? 0 : mortgageTile.hashCode())) * 31;
        Padding padding = this.padding;
        int iHashCode3 = (iHashCode2 + (padding == null ? 0 : padding.hashCode())) * 31;
        Margin margin = this.margin;
        int iHashCode4 = (iHashCode3 + (margin == null ? 0 : margin.hashCode())) * 31;
        EnumPosition enumPosition = this.position;
        int iHashCode5 = (iHashCode4 + (enumPosition == null ? 0 : enumPosition.hashCode())) * 31;
        List<FmpAnalyticsEvent> list2 = this.onAppear;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Size size = this.size;
        return iHashCode6 + (size != null ? size.hashCode() : 0);
    }

    @k
    public String toString() {
        return "FmpProducts(tiles=" + this.tiles + ", mortgageTile=" + this.mortgageTile + ", padding=" + this.padding + ", margin=" + this.margin + ", position=" + this.position + ", onAppear=" + this.onAppear + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<Tile> list = this.tiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Tile) itA.next()).writeToParcel(parcel, flags);
            }
        }
        MortgageTile mortgageTile = this.mortgageTile;
        if (mortgageTile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mortgageTile.writeToParcel(parcel, flags);
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
        EnumPosition enumPosition = this.position;
        if (enumPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            enumPosition.writeToParcel(parcel, flags);
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
