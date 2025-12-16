package com.avito.android.remote.model.grid_gallery;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GridGallery.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\b)*+,-./0B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0010¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Block;", "blocks", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar;", "bottomBar", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar;)Lcom/avito/android/remote/model/grid_gallery/GridGallery;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getBlocks", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar;", "getBottomBar", "Block", "BlockType", "BottomBar", "Button", "Row", "RowItem", "TeaserType", "VideoType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GridGallery implements Parcelable {

    @k
    public static final Parcelable.Creator<GridGallery> CREATOR = new Creator();

    @c("blocks")
    @k
    private final List<Block> blocks;

    @c("bottomBar")
    @l
    private final BottomBar bottomBar;

    @c("title")
    @k
    private final String title;

    /* compiled from: GridGallery.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b\u0003\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0014¨\u0006-"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$Block;", "Landroid/os/Parcelable;", "", "isHiddenInNavigationBar", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$BlockType;", "type", "", "title", "", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row;", "rows", "<init>", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/grid_gallery/GridGallery$BlockType;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/avito/android/remote/model/grid_gallery/GridGallery$BlockType;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/Boolean;Lcom/avito/android/remote/model/grid_gallery/GridGallery$BlockType;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/grid_gallery/GridGallery$Block;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$BlockType;", "getType", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getRows", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Block implements Parcelable {

        @k
        public static final Parcelable.Creator<Block> CREATOR = new Creator();

        @c("isHiddenInNavigationBar")
        @l
        private final Boolean isHiddenInNavigationBar;

        @c("rows")
        @k
        private final List<Row> rows;

        @c("title")
        @k
        private final String title;

        @c("type")
        @l
        private final BlockType type;

        /* compiled from: GridGallery.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Block> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Block createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                int iL2 = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                BlockType blockTypeCreateFromParcel = parcel.readInt() != 0 ? BlockType.CREATOR.createFromParcel(parcel) : null;
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = a.l(Block.class, parcel, arrayList, iL2, 1);
                }
                return new Block(boolValueOf, blockTypeCreateFromParcel, string, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Block[] newArray(int i12) {
                return new Block[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Block(@l Boolean bool, @l BlockType blockType, @k String str, @k List<? extends Row> list) {
            this.isHiddenInNavigationBar = bool;
            this.type = blockType;
            this.title = str;
            this.rows = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Block copy$default(Block block, Boolean bool, BlockType blockType, String str, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                bool = block.isHiddenInNavigationBar;
            }
            if ((i12 & 2) != 0) {
                blockType = block.type;
            }
            if ((i12 & 4) != 0) {
                str = block.title;
            }
            if ((i12 & 8) != 0) {
                list = block.rows;
            }
            return block.copy(bool, blockType, str, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Boolean getIsHiddenInNavigationBar() {
            return this.isHiddenInNavigationBar;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final BlockType getType() {
            return this.type;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<Row> component4() {
            return this.rows;
        }

        @k
        public final Block copy(@l Boolean isHiddenInNavigationBar, @l BlockType type, @k String title, @k List<? extends Row> rows) {
            return new Block(isHiddenInNavigationBar, type, title, rows);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Block)) {
                return false;
            }
            Block block = (Block) other;
            return L.f(this.isHiddenInNavigationBar, block.isHiddenInNavigationBar) && this.type == block.type && L.f(this.title, block.title) && L.f(this.rows, block.rows);
        }

        @k
        public final List<Row> getRows() {
            return this.rows;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final BlockType getType() {
            return this.type;
        }

        public int hashCode() {
            Boolean bool = this.isHiddenInNavigationBar;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            BlockType blockType = this.type;
            return this.rows.hashCode() + H.d((iHashCode + (blockType != null ? blockType.hashCode() : 0)) * 31, 31, this.title);
        }

        @l
        public final Boolean isHiddenInNavigationBar() {
            return this.isHiddenInNavigationBar;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Block(isHiddenInNavigationBar=");
            sb2.append(this.isHiddenInNavigationBar);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", rows=");
            return H.p(sb2, this.rows, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Boolean bool = this.isHiddenInNavigationBar;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            BlockType blockType = this.type;
            if (blockType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                blockType.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.rows, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GridGallery.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$BlockType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "IMAGES", "REALTY_IMAGES", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class BlockType implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ BlockType[] $VALUES;

        @k
        public static final Parcelable.Creator<BlockType> CREATOR;

        @c("images")
        public static final BlockType IMAGES = new BlockType("IMAGES", 0);

        @c("realtyImages")
        public static final BlockType REALTY_IMAGES = new BlockType("REALTY_IMAGES", 1);

        /* compiled from: GridGallery.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BlockType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BlockType createFromParcel(@k Parcel parcel) {
                return BlockType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BlockType[] newArray(int i12) {
                return new BlockType[i12];
            }
        }

        private static final /* synthetic */ BlockType[] $values() {
            return new BlockType[]{IMAGES, REALTY_IMAGES};
        }

        static {
            BlockType[] blockTypeArr$values = $values();
            $VALUES = blockTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(blockTypeArr$values);
            CREATOR = new Creator();
        }

        private BlockType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<BlockType> getEntries() {
            return $ENTRIES;
        }

        public static BlockType valueOf(String str) {
            return (BlockType) Enum.valueOf(BlockType.class, str);
        }

        public static BlockType[] values() {
            return (BlockType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    /* compiled from: GridGallery.kt */
    @InterfaceC19824b
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar;", "Landroid/os/Parcelable;", "DoubleButton", "SingleButton", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar$DoubleButton;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar$SingleButton;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public interface BottomBar extends Parcelable {

        /* compiled from: GridGallery.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar$DoubleButton;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;", "left", "right", "<init>", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;)V", "component1", "()Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;", "component2", "copy", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;)Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar$DoubleButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;", "getLeft", "getRight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DoubleButton implements BottomBar {

            @k
            public static final Parcelable.Creator<DoubleButton> CREATOR = new Creator();

            @c("left")
            @k
            private final Button left;

            @c("right")
            @k
            private final Button right;

            /* compiled from: GridGallery.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DoubleButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DoubleButton createFromParcel(@k Parcel parcel) {
                    Parcelable.Creator<Button> creator = Button.CREATOR;
                    return new DoubleButton(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DoubleButton[] newArray(int i12) {
                    return new DoubleButton[i12];
                }
            }

            public DoubleButton(@k Button button, @k Button button2) {
                this.left = button;
                this.right = button2;
            }

            public static /* synthetic */ DoubleButton copy$default(DoubleButton doubleButton, Button button, Button button2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    button = doubleButton.left;
                }
                if ((i12 & 2) != 0) {
                    button2 = doubleButton.right;
                }
                return doubleButton.copy(button, button2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final Button getLeft() {
                return this.left;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final Button getRight() {
                return this.right;
            }

            @k
            public final DoubleButton copy(@k Button left, @k Button right) {
                return new DoubleButton(left, right);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DoubleButton)) {
                    return false;
                }
                DoubleButton doubleButton = (DoubleButton) other;
                return L.f(this.left, doubleButton.left) && L.f(this.right, doubleButton.right);
            }

            @k
            public final Button getLeft() {
                return this.left;
            }

            @k
            public final Button getRight() {
                return this.right;
            }

            public int hashCode() {
                return this.right.hashCode() + (this.left.hashCode() * 31);
            }

            @k
            public String toString() {
                return "DoubleButton(left=" + this.left + ", right=" + this.right + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                this.left.writeToParcel(parcel, flags);
                this.right.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: GridGallery.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar$SingleButton;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;", "button", "<init>", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;)V", "component1", "()Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;", "copy", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;)Lcom/avito/android/remote/model/grid_gallery/GridGallery$BottomBar$SingleButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;", "getButton", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SingleButton implements BottomBar {

            @k
            public static final Parcelable.Creator<SingleButton> CREATOR = new Creator();

            @c("button")
            @k
            private final Button button;

            /* compiled from: GridGallery.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SingleButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SingleButton createFromParcel(@k Parcel parcel) {
                    return new SingleButton(Button.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SingleButton[] newArray(int i12) {
                    return new SingleButton[i12];
                }
            }

            public SingleButton(@k Button button) {
                this.button = button;
            }

            public static /* synthetic */ SingleButton copy$default(SingleButton singleButton, Button button, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    button = singleButton.button;
                }
                return singleButton.copy(button);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final Button getButton() {
                return this.button;
            }

            @k
            public final SingleButton copy(@k Button button) {
                return new SingleButton(button);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleButton) && L.f(this.button, ((SingleButton) other).button);
            }

            @k
            public final Button getButton() {
                return this.button;
            }

            public int hashCode() {
                return this.button.hashCode();
            }

            @k
            public String toString() {
                return "SingleButton(button=" + this.button + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                this.button.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: GridGallery.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;", "Landroid/os/Parcelable;", "", "title", "subtitle", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/grid_gallery/GridGallery$Button;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getStyle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: GridGallery.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                return new Button(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @l String str2, @l String str3, @k DeepLink deepLink) {
            this.title = str;
            this.subtitle = str2;
            this.style = str3;
            this.deeplink = deepLink;
        }

        public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = button.title;
            }
            if ((i12 & 2) != 0) {
                str2 = button.subtitle;
            }
            if ((i12 & 4) != 0) {
                str3 = button.style;
            }
            if ((i12 & 8) != 0) {
                deepLink = button.deeplink;
            }
            return button.copy(str, str2, str3, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getStyle() {
            return this.style;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final Button copy(@k String title, @l String subtitle, @l String style, @k DeepLink deeplink) {
            return new Button(title, subtitle, style, deeplink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return L.f(this.title, button.title) && L.f(this.subtitle, button.subtitle) && L.f(this.style, button.style) && L.f(this.deeplink, button.deeplink);
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.style;
            return this.deeplink.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", style=");
            sb2.append(this.style);
            sb2.append(", deeplink=");
            return a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.style);
            parcel.writeParcelable(this.deeplink, flags);
        }
    }

    /* compiled from: GridGallery.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GridGallery> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GridGallery createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Block.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new GridGallery(string, arrayList, (BottomBar) parcel.readParcelable(GridGallery.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GridGallery[] newArray(int i12) {
            return new GridGallery[i12];
        }
    }

    /* compiled from: GridGallery.kt */
    @InterfaceC19824b
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row;", "Landroid/os/Parcelable;", "BeduinTeaser", "DoubleItem", "SingleItem", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$BeduinTeaser;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$DoubleItem;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$SingleItem;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public interface Row extends Parcelable {

        /* compiled from: GridGallery.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$BeduinTeaser;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$TeaserType;", "type", "<init>", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$TeaserType;)V", "component1", "()Lcom/avito/android/remote/model/grid_gallery/GridGallery$TeaserType;", "copy", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$TeaserType;)Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$BeduinTeaser;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$TeaserType;", "getType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BeduinTeaser implements Row {

            @k
            public static final Parcelable.Creator<BeduinTeaser> CREATOR = new Creator();

            @c("type")
            @l
            private final TeaserType type;

            /* compiled from: GridGallery.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BeduinTeaser> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final BeduinTeaser createFromParcel(@k Parcel parcel) {
                    return new BeduinTeaser(parcel.readInt() == 0 ? null : TeaserType.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final BeduinTeaser[] newArray(int i12) {
                    return new BeduinTeaser[i12];
                }
            }

            public BeduinTeaser(@l TeaserType teaserType) {
                this.type = teaserType;
            }

            public static /* synthetic */ BeduinTeaser copy$default(BeduinTeaser beduinTeaser, TeaserType teaserType, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    teaserType = beduinTeaser.type;
                }
                return beduinTeaser.copy(teaserType);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final TeaserType getType() {
                return this.type;
            }

            @k
            public final BeduinTeaser copy(@l TeaserType type) {
                return new BeduinTeaser(type);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof BeduinTeaser) && this.type == ((BeduinTeaser) other).type;
            }

            @l
            public final TeaserType getType() {
                return this.type;
            }

            public int hashCode() {
                TeaserType teaserType = this.type;
                if (teaserType == null) {
                    return 0;
                }
                return teaserType.hashCode();
            }

            @k
            public String toString() {
                return "BeduinTeaser(type=" + this.type + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                TeaserType teaserType = this.type;
                if (teaserType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    teaserType.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: GridGallery.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$DoubleItem;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "left", "right", "<init>", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;)V", "component1", "()Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "component2", "copy", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;)Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$DoubleItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "getLeft", "getRight", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DoubleItem implements Row {

            @k
            public static final Parcelable.Creator<DoubleItem> CREATOR = new Creator();

            @c("left")
            @k
            private final RowItem left;

            @c("right")
            @k
            private final RowItem right;

            /* compiled from: GridGallery.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<DoubleItem> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DoubleItem createFromParcel(@k Parcel parcel) {
                    return new DoubleItem((RowItem) parcel.readParcelable(DoubleItem.class.getClassLoader()), (RowItem) parcel.readParcelable(DoubleItem.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final DoubleItem[] newArray(int i12) {
                    return new DoubleItem[i12];
                }
            }

            public DoubleItem(@k RowItem rowItem, @k RowItem rowItem2) {
                this.left = rowItem;
                this.right = rowItem2;
            }

            public static /* synthetic */ DoubleItem copy$default(DoubleItem doubleItem, RowItem rowItem, RowItem rowItem2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    rowItem = doubleItem.left;
                }
                if ((i12 & 2) != 0) {
                    rowItem2 = doubleItem.right;
                }
                return doubleItem.copy(rowItem, rowItem2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final RowItem getLeft() {
                return this.left;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final RowItem getRight() {
                return this.right;
            }

            @k
            public final DoubleItem copy(@k RowItem left, @k RowItem right) {
                return new DoubleItem(left, right);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DoubleItem)) {
                    return false;
                }
                DoubleItem doubleItem = (DoubleItem) other;
                return L.f(this.left, doubleItem.left) && L.f(this.right, doubleItem.right);
            }

            @k
            public final RowItem getLeft() {
                return this.left;
            }

            @k
            public final RowItem getRight() {
                return this.right;
            }

            public int hashCode() {
                return this.right.hashCode() + (this.left.hashCode() * 31);
            }

            @k
            public String toString() {
                return "DoubleItem(left=" + this.left + ", right=" + this.right + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.left, flags);
                parcel.writeParcelable(this.right, flags);
            }
        }

        /* compiled from: GridGallery.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$SingleItem;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "item", "<init>", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;)V", "component1", "()Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "copy", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;)Lcom/avito/android/remote/model/grid_gallery/GridGallery$Row$SingleItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "getItem", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SingleItem implements Row {

            @k
            public static final Parcelable.Creator<SingleItem> CREATOR = new Creator();

            @c("item")
            @k
            private final RowItem item;

            /* compiled from: GridGallery.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SingleItem> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SingleItem createFromParcel(@k Parcel parcel) {
                    return new SingleItem((RowItem) parcel.readParcelable(SingleItem.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final SingleItem[] newArray(int i12) {
                    return new SingleItem[i12];
                }
            }

            public SingleItem(@k RowItem rowItem) {
                this.item = rowItem;
            }

            public static /* synthetic */ SingleItem copy$default(SingleItem singleItem, RowItem rowItem, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    rowItem = singleItem.item;
                }
                return singleItem.copy(rowItem);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final RowItem getItem() {
                return this.item;
            }

            @k
            public final SingleItem copy(@k RowItem item) {
                return new SingleItem(item);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleItem) && L.f(this.item, ((SingleItem) other).item);
            }

            @k
            public final RowItem getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            @k
            public String toString() {
                return "SingleItem(item=" + this.item + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.item, flags);
            }
        }
    }

    /* compiled from: GridGallery.kt */
    @InterfaceC19824b
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "Landroid/os/Parcelable;", "Photo", "Video", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem$Photo;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem$Video;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public interface RowItem extends Parcelable {

        /* compiled from: GridGallery.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem$Photo;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "", "position", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem$Photo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getPosition", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Photo implements RowItem {

            @k
            public static final Parcelable.Creator<Photo> CREATOR = new Creator();

            @c("position")
            private final int position;

            /* compiled from: GridGallery.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Photo> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Photo createFromParcel(@k Parcel parcel) {
                    return new Photo(parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Photo[] newArray(int i12) {
                    return new Photo[i12];
                }
            }

            public Photo(int i12) {
                this.position = i12;
            }

            public static /* synthetic */ Photo copy$default(Photo photo, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = photo.position;
                }
                return photo.copy(i12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getPosition() {
                return this.position;
            }

            @k
            public final Photo copy(int position) {
                return new Photo(position);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Photo) && this.position == ((Photo) other).position;
            }

            public final int getPosition() {
                return this.position;
            }

            public int hashCode() {
                return Integer.hashCode(this.position);
            }

            @k
            public String toString() {
                return r.t(new StringBuilder("Photo(position="), this.position, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.position);
            }
        }

        /* compiled from: GridGallery.kt */
        @d
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem$Video;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem;", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$VideoType;", "type", "<init>", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$VideoType;)V", "component1", "()Lcom/avito/android/remote/model/grid_gallery/GridGallery$VideoType;", "copy", "(Lcom/avito/android/remote/model/grid_gallery/GridGallery$VideoType;)Lcom/avito/android/remote/model/grid_gallery/GridGallery$RowItem$Video;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/grid_gallery/GridGallery$VideoType;", "getType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Video implements RowItem {

            @k
            public static final Parcelable.Creator<Video> CREATOR = new Creator();

            @c("type")
            @l
            private final VideoType type;

            /* compiled from: GridGallery.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Video> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Video createFromParcel(@k Parcel parcel) {
                    return new Video(parcel.readInt() == 0 ? null : VideoType.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Video[] newArray(int i12) {
                    return new Video[i12];
                }
            }

            public Video(@l VideoType videoType) {
                this.type = videoType;
            }

            public static /* synthetic */ Video copy$default(Video video, VideoType videoType, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    videoType = video.type;
                }
                return video.copy(videoType);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final VideoType getType() {
                return this.type;
            }

            @k
            public final Video copy(@l VideoType type) {
                return new Video(type);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Video) && this.type == ((Video) other).type;
            }

            @l
            public final VideoType getType() {
                return this.type;
            }

            public int hashCode() {
                VideoType videoType = this.type;
                if (videoType == null) {
                    return 0;
                }
                return videoType.hashCode();
            }

            @k
            public String toString() {
                return "Video(type=" + this.type + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                VideoType videoType = this.type;
                if (videoType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    videoType.writeToParcel(parcel, flags);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GridGallery.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$TeaserType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "BEDUIN", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class TeaserType implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ TeaserType[] $VALUES;

        @c("beduinTeasers")
        public static final TeaserType BEDUIN = new TeaserType("BEDUIN", 0);

        @k
        public static final Parcelable.Creator<TeaserType> CREATOR;

        /* compiled from: GridGallery.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<TeaserType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TeaserType createFromParcel(@k Parcel parcel) {
                return TeaserType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final TeaserType[] newArray(int i12) {
                return new TeaserType[i12];
            }
        }

        private static final /* synthetic */ TeaserType[] $values() {
            return new TeaserType[]{BEDUIN};
        }

        static {
            TeaserType[] teaserTypeArr$values = $values();
            $VALUES = teaserTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(teaserTypeArr$values);
            CREATOR = new Creator();
        }

        private TeaserType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<TeaserType> getEntries() {
            return $ENTRIES;
        }

        public static TeaserType valueOf(String str) {
            return (TeaserType) Enum.valueOf(TeaserType.class, str);
        }

        public static TeaserType[] values() {
            return (TeaserType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GridGallery.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/grid_gallery/GridGallery$VideoType;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "VIDEO", "NATIVE_VIDEO", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class VideoType implements Parcelable {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ VideoType[] $VALUES;

        @k
        public static final Parcelable.Creator<VideoType> CREATOR;

        @c("video")
        public static final VideoType VIDEO = new VideoType("VIDEO", 0);

        @c("native_video")
        public static final VideoType NATIVE_VIDEO = new VideoType("NATIVE_VIDEO", 1);

        /* compiled from: GridGallery.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VideoType> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final VideoType createFromParcel(@k Parcel parcel) {
                return VideoType.valueOf(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final VideoType[] newArray(int i12) {
                return new VideoType[i12];
            }
        }

        private static final /* synthetic */ VideoType[] $values() {
            return new VideoType[]{VIDEO, NATIVE_VIDEO};
        }

        static {
            VideoType[] videoTypeArr$values = $values();
            $VALUES = videoTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(videoTypeArr$values);
            CREATOR = new Creator();
        }

        private VideoType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<VideoType> getEntries() {
            return $ENTRIES;
        }

        public static VideoType valueOf(String str) {
            return (VideoType) Enum.valueOf(VideoType.class, str);
        }

        public static VideoType[] values() {
            return (VideoType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(name());
        }
    }

    public GridGallery(@k String str, @k List<Block> list, @l BottomBar bottomBar) {
        this.title = str;
        this.blocks = list;
        this.bottomBar = bottomBar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GridGallery copy$default(GridGallery gridGallery, String str, List list, BottomBar bottomBar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = gridGallery.title;
        }
        if ((i12 & 2) != 0) {
            list = gridGallery.blocks;
        }
        if ((i12 & 4) != 0) {
            bottomBar = gridGallery.bottomBar;
        }
        return gridGallery.copy(str, list, bottomBar);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<Block> component2() {
        return this.blocks;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BottomBar getBottomBar() {
        return this.bottomBar;
    }

    @k
    public final GridGallery copy(@k String title, @k List<Block> blocks, @l BottomBar bottomBar) {
        return new GridGallery(title, blocks, bottomBar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GridGallery)) {
            return false;
        }
        GridGallery gridGallery = (GridGallery) other;
        return L.f(this.title, gridGallery.title) && L.f(this.blocks, gridGallery.blocks) && L.f(this.bottomBar, gridGallery.bottomBar);
    }

    @k
    public final List<Block> getBlocks() {
        return this.blocks;
    }

    @l
    public final BottomBar getBottomBar() {
        return this.bottomBar;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = H.e(this.title.hashCode() * 31, 31, this.blocks);
        BottomBar bottomBar = this.bottomBar;
        return iE2 + (bottomBar == null ? 0 : bottomBar.hashCode());
    }

    @k
    public String toString() {
        return "GridGallery(title=" + this.title + ", blocks=" + this.blocks + ", bottomBar=" + this.bottomBar + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.blocks, parcel);
        while (itJ.hasNext()) {
            ((Block) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.bottomBar, flags);
    }
}
