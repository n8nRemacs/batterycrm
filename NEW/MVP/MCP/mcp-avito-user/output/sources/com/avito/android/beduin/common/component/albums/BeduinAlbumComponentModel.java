package com.avito.android.beduin.common.component.albums;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.image.OverlayStyle;
import com.avito.android.beduin.common.component.image.Size;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinAlbumComponentModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\u001bJ|\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0017J\u0010\u0010*\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b*\u0010#J\u001a\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b/\u0010#J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010\u001bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010!R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010B\u001a\u0004\bC\u0010#R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010%R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010:\u001a\u0004\bF\u0010\u001b¨\u0006G"}, d2 = {"Lcom/avito/android/beduin/common/component/albums/BeduinAlbumComponentModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "openGalleryOnTap", "", "Lcom/avito/android/beduin/common/component/albums/AlbumElement;", "elements", "Lcom/avito/android/beduin/common/component/image/Size;", "cellSize", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "", "interItemSpacing", "Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "overlay", "showsPageIndicator", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/beduin/common/component/image/Size;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;ILcom/avito/android/beduin/common/component/image/OverlayStyle;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/lang/Boolean;", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/beduin/common/component/image/Size;", "component6", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component7", "()I", "component8", "()Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "component9", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/beduin/common/component/image/Size;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;ILcom/avito/android/beduin/common/component/image/OverlayStyle;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/albums/BeduinAlbumComponentModel;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/lang/Boolean;", "getOpenGalleryOnTap", "Ljava/util/List;", "getElements", "Lcom/avito/android/beduin/common/component/image/Size;", "getCellSize", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "I", "getInterItemSpacing", "Lcom/avito/android/beduin/common/component/image/OverlayStyle;", "getOverlay", "getShowsPageIndicator", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinAlbumComponentModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinAlbumComponentModel> CREATOR = new a();

    @l
    private final Size cellSize;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final List<AlbumElement> elements;

    @k
    private final String id;
    private final int interItemSpacing;

    @l
    private final Boolean openGalleryOnTap;

    @l
    private final OverlayStyle overlay;

    @l
    private final BeduinContainerIndent padding;

    @l
    private final Boolean showsPageIndicator;

    /* compiled from: BeduinAlbumComponentModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinAlbumComponentModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinAlbumComponentModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinAlbumComponentModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AlbumElement.CREATOR, parcel, arrayList, iC2, 1);
            }
            Size sizeCreateFromParcel = parcel.readInt() == 0 ? null : Size.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            int i13 = parcel.readInt();
            OverlayStyle overlayStyleCreateFromParcel = parcel.readInt() == 0 ? null : OverlayStyle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinAlbumComponentModel(string, displayingPredicate, boolValueOf, arrayList, sizeCreateFromParcel, beduinContainerIndentCreateFromParcel, i13, overlayStyleCreateFromParcel, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinAlbumComponentModel[] newArray(int i12) {
            return new BeduinAlbumComponentModel[i12];
        }
    }

    public /* synthetic */ BeduinAlbumComponentModel(String str, DisplayingPredicate displayingPredicate, Boolean bool, List list, Size size, BeduinContainerIndent beduinContainerIndent, int i12, OverlayStyle overlayStyle, Boolean bool2, int i13, C42822w c42822w) {
        this(str, displayingPredicate, bool, list, size, beduinContainerIndent, i12, overlayStyle, (i13 & 256) != 0 ? null : bool2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getOpenGalleryOnTap() {
        return this.openGalleryOnTap;
    }

    @k
    public final List<AlbumElement> component4() {
        return this.elements;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Size getCellSize() {
        return this.cellSize;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    /* renamed from: component7, reason: from getter */
    public final int getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final OverlayStyle getOverlay() {
        return this.overlay;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Boolean getShowsPageIndicator() {
        return this.showsPageIndicator;
    }

    @k
    public final BeduinAlbumComponentModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l Boolean openGalleryOnTap, @k List<AlbumElement> elements, @l Size cellSize, @l BeduinContainerIndent padding, int interItemSpacing, @l OverlayStyle overlay, @l Boolean showsPageIndicator) {
        return new BeduinAlbumComponentModel(id2, displayingPredicate, openGalleryOnTap, elements, cellSize, padding, interItemSpacing, overlay, showsPageIndicator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinAlbumComponentModel)) {
            return false;
        }
        BeduinAlbumComponentModel beduinAlbumComponentModel = (BeduinAlbumComponentModel) other;
        return L.f(this.id, beduinAlbumComponentModel.id) && L.f(this.displayingPredicate, beduinAlbumComponentModel.displayingPredicate) && L.f(this.openGalleryOnTap, beduinAlbumComponentModel.openGalleryOnTap) && L.f(this.elements, beduinAlbumComponentModel.elements) && L.f(this.cellSize, beduinAlbumComponentModel.cellSize) && L.f(this.padding, beduinAlbumComponentModel.padding) && this.interItemSpacing == beduinAlbumComponentModel.interItemSpacing && L.f(this.overlay, beduinAlbumComponentModel.overlay) && L.f(this.showsPageIndicator, beduinAlbumComponentModel.showsPageIndicator);
    }

    @l
    public final Size getCellSize() {
        return this.cellSize;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @k
    public final List<AlbumElement> getElements() {
        return this.elements;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    public final int getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final Boolean getOpenGalleryOnTap() {
        return this.openGalleryOnTap;
    }

    @l
    public final OverlayStyle getOverlay() {
        return this.overlay;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final Boolean getShowsPageIndicator() {
        return this.showsPageIndicator;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Boolean bool = this.openGalleryOnTap;
        int iE2 = H.e((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.elements);
        Size size = this.cellSize;
        int iHashCode3 = (iE2 + (size == null ? 0 : size.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iE3 = r.e(this.interItemSpacing, (iHashCode3 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31, 31);
        OverlayStyle overlayStyle = this.overlay;
        int iHashCode4 = (iE3 + (overlayStyle == null ? 0 : overlayStyle.hashCode())) * 31;
        Boolean bool2 = this.showsPageIndicator;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinAlbumComponentModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", openGalleryOnTap=");
        sb2.append(this.openGalleryOnTap);
        sb2.append(", elements=");
        sb2.append(this.elements);
        sb2.append(", cellSize=");
        sb2.append(this.cellSize);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", interItemSpacing=");
        sb2.append(this.interItemSpacing);
        sb2.append(", overlay=");
        sb2.append(this.overlay);
        sb2.append(", showsPageIndicator=");
        return C0.g(sb2, this.showsPageIndicator, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        Boolean bool = this.openGalleryOnTap;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Iterator itJ = C0.j(this.elements, parcel);
        while (itJ.hasNext()) {
            ((AlbumElement) itJ.next()).writeToParcel(parcel, flags);
        }
        Size size = this.cellSize;
        if (size == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            size.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.interItemSpacing);
        OverlayStyle overlayStyle = this.overlay;
        if (overlayStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            overlayStyle.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.showsPageIndicator;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    public BeduinAlbumComponentModel(@k String str, @l DisplayingPredicate displayingPredicate, @l Boolean bool, @k List<AlbumElement> list, @l Size size, @l BeduinContainerIndent beduinContainerIndent, int i12, @l OverlayStyle overlayStyle, @l Boolean bool2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.openGalleryOnTap = bool;
        this.elements = list;
        this.cellSize = size;
        this.padding = beduinContainerIndent;
        this.interItemSpacing = i12;
        this.overlay = overlayStyle;
        this.showsPageIndicator = bool2;
    }
}
