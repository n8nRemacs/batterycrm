package com.avito.android.beduin.common.container.banner_gallery;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.BeduinContainerModel;
import com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.BackgroundTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinBannerGalleryContainerModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001b\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b5\u0010+J¬\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b8\u0010\"J\u0010\u00109\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b9\u00102J\u001a\u0010<\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b>\u00102J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bH\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010&R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bK\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010)R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010N\u001a\u0004\bO\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010P\u001a\u0004\bQ\u0010-R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010N\u001a\u0004\bR\u0010+R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\b\u0014\u00100R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010T\u001a\u0004\bU\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010V\u001a\u0004\bW\u00104R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\bX\u0010+¨\u0006Y"}, d2 = {"Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "", "id", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "interItemSpacing", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "", "isInfinite", "autoScrollInterval", "Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;", "paginatorStyle", "onPageSwipedActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;ZILcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;Ljava/util/List;)V", "create", "(Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component4", "component5", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component6", "()Ljava/util/List;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "()Z", "component10", "()I", "component11", "()Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;", "component12", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;ZILcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;Ljava/util/List;)Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerModel;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getChildren", "Ljava/lang/Integer;", "getInterItemSpacing", "getActions", "Z", "I", "getAutoScrollInterval", "Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;", "getPaginatorStyle", "getOnPageSwipedActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinBannerGalleryContainerModel extends BeduinSingleChildOwnerModel implements BeduinContainerModel {

    @k
    public static final Parcelable.Creator<BeduinBannerGalleryContainerModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;
    private final int autoScrollInterval;

    @l
    private final BeduinContainerBackground background;

    @l
    private final List<BeduinModel> children;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Integer interItemSpacing;
    private final boolean isInfinite;

    @l
    private final BeduinContainerIndent margin;

    @l
    private final List<BeduinAction> onPageSwipedActions;

    @l
    private final BeduinContainerIndent padding;

    @l
    private final BeduinBannerGalleryContainerPaginatorStyle paginatorStyle;

    /* compiled from: BeduinBannerGalleryContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinBannerGalleryContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinBannerGalleryContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinBannerGalleryContainerModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinBannerGalleryContainerModel.class, parcel, arrayList, iL3, 1);
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinBannerGalleryContainerModel.class, parcel, arrayList2, iL4, 1);
                }
            }
            boolean z12 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyleValueOf = parcel.readInt() == 0 ? null : BeduinBannerGalleryContainerPaginatorStyle.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList3 = new ArrayList(i15);
                while (iL2 != i15) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinBannerGalleryContainerModel.class, parcel, arrayList3, iL2, 1);
                    i15 = i15;
                }
            }
            return new BeduinBannerGalleryContainerModel(string, beduinContainerBackgroundCreateFromParcel, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, displayingPredicate, arrayList, numValueOf, arrayList2, z12, i14, beduinBannerGalleryContainerPaginatorStyleValueOf, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinBannerGalleryContainerModel[] newArray(int i12) {
            return new BeduinBannerGalleryContainerModel[i12];
        }
    }

    public /* synthetic */ BeduinBannerGalleryContainerModel(String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, Integer num, List list2, boolean z12, int i12, BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle, List list3, int i13, C42822w c42822w) {
        this(str, beduinContainerBackground, beduinContainerIndent, beduinContainerIndent2, displayingPredicate, list, num, list2, (i13 & 256) != 0 ? false : z12, i12, beduinBannerGalleryContainerPaginatorStyle, list3);
    }

    public static /* synthetic */ BeduinBannerGalleryContainerModel copy$default(BeduinBannerGalleryContainerModel beduinBannerGalleryContainerModel, String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, Integer num, List list2, boolean z12, int i12, BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle, List list3, int i13, Object obj) {
        return beduinBannerGalleryContainerModel.copy((i13 & 1) != 0 ? beduinBannerGalleryContainerModel.id : str, (i13 & 2) != 0 ? beduinBannerGalleryContainerModel.background : beduinContainerBackground, (i13 & 4) != 0 ? beduinBannerGalleryContainerModel.padding : beduinContainerIndent, (i13 & 8) != 0 ? beduinBannerGalleryContainerModel.margin : beduinContainerIndent2, (i13 & 16) != 0 ? beduinBannerGalleryContainerModel.displayingPredicate : displayingPredicate, (i13 & 32) != 0 ? beduinBannerGalleryContainerModel.children : list, (i13 & 64) != 0 ? beduinBannerGalleryContainerModel.interItemSpacing : num, (i13 & 128) != 0 ? beduinBannerGalleryContainerModel.actions : list2, (i13 & 256) != 0 ? beduinBannerGalleryContainerModel.isInfinite : z12, (i13 & 512) != 0 ? beduinBannerGalleryContainerModel.autoScrollInterval : i12, (i13 & 1024) != 0 ? beduinBannerGalleryContainerModel.paginatorStyle : beduinBannerGalleryContainerPaginatorStyle, (i13 & 2048) != 0 ? beduinBannerGalleryContainerModel.onPageSwipedActions : list3);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof BackgroundTransform ? copy$default(this, null, ((BackgroundTransform) transform).getBackground(), null, null, null, null, null, null, false, 0, null, null, 4093, null) : super.apply(transform);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getAutoScrollInterval() {
        return this.autoScrollInterval;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final BeduinBannerGalleryContainerPaginatorStyle getPaginatorStyle() {
        return this.paginatorStyle;
    }

    @l
    public final List<BeduinAction> component12() {
        return this.onPageSwipedActions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final List<BeduinModel> component6() {
        return this.children;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final List<BeduinAction> component8() {
        return this.actions;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsInfinite() {
        return this.isInfinite;
    }

    @k
    public final BeduinBannerGalleryContainerModel copy(@k String id2, @l BeduinContainerBackground background, @l BeduinContainerIndent padding, @l BeduinContainerIndent margin, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinModel> children, @l Integer interItemSpacing, @l List<? extends BeduinAction> actions, boolean isInfinite, int autoScrollInterval, @l BeduinBannerGalleryContainerPaginatorStyle paginatorStyle, @l List<? extends BeduinAction> onPageSwipedActions) {
        return new BeduinBannerGalleryContainerModel(id2, background, padding, margin, displayingPredicate, children, interItemSpacing, actions, isInfinite, autoScrollInterval, paginatorStyle, onPageSwipedActions);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public BeduinModel create(@l List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate) {
        return copy$default(this, null, null, null, null, displayingPredicate, children, null, null, false, 0, null, null, 4047, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinBannerGalleryContainerModel)) {
            return false;
        }
        BeduinBannerGalleryContainerModel beduinBannerGalleryContainerModel = (BeduinBannerGalleryContainerModel) other;
        return L.f(this.id, beduinBannerGalleryContainerModel.id) && L.f(this.background, beduinBannerGalleryContainerModel.background) && L.f(this.padding, beduinBannerGalleryContainerModel.padding) && L.f(this.margin, beduinBannerGalleryContainerModel.margin) && L.f(this.displayingPredicate, beduinBannerGalleryContainerModel.displayingPredicate) && L.f(this.children, beduinBannerGalleryContainerModel.children) && L.f(this.interItemSpacing, beduinBannerGalleryContainerModel.interItemSpacing) && L.f(this.actions, beduinBannerGalleryContainerModel.actions) && this.isInfinite == beduinBannerGalleryContainerModel.isInfinite && this.autoScrollInterval == beduinBannerGalleryContainerModel.autoScrollInterval && this.paginatorStyle == beduinBannerGalleryContainerModel.paginatorStyle && L.f(this.onPageSwipedActions, beduinBannerGalleryContainerModel.onPageSwipedActions);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    public final int getAutoScrollInterval() {
        return this.autoScrollInterval;
    }

    @l
    public BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @l
    public List<BeduinModel> getChildren() {
        return this.children;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final List<BeduinAction> getOnPageSwipedActions() {
        return this.onPageSwipedActions;
    }

    @l
    public BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final BeduinBannerGalleryContainerPaginatorStyle getPaginatorStyle() {
        return this.paginatorStyle;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        BeduinContainerBackground beduinContainerBackground = this.background;
        int iHashCode2 = (iHashCode + (beduinContainerBackground == null ? 0 : beduinContainerBackground.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode3 = (iHashCode2 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        int iHashCode4 = (iHashCode3 + (beduinContainerIndent2 == null ? 0 : beduinContainerIndent2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode5 = (iHashCode4 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinModel> list = this.children;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.interItemSpacing;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List<BeduinAction> list2 = this.actions;
        int iE2 = r.e(this.autoScrollInterval, r.i((iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isInfinite), 31);
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle = this.paginatorStyle;
        int iHashCode8 = (iE2 + (beduinBannerGalleryContainerPaginatorStyle == null ? 0 : beduinBannerGalleryContainerPaginatorStyle.hashCode())) * 31;
        List<BeduinAction> list3 = this.onPageSwipedActions;
        return iHashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public final boolean isInfinite() {
        return this.isInfinite;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinBannerGalleryContainerModel(id=");
        sb2.append(this.id);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", children=");
        sb2.append(this.children);
        sb2.append(", interItemSpacing=");
        sb2.append(this.interItemSpacing);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", isInfinite=");
        sb2.append(this.isInfinite);
        sb2.append(", autoScrollInterval=");
        sb2.append(this.autoScrollInterval);
        sb2.append(", paginatorStyle=");
        sb2.append(this.paginatorStyle);
        sb2.append(", onPageSwipedActions=");
        return H.p(sb2, this.onPageSwipedActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        BeduinContainerBackground beduinContainerBackground = this.background;
        if (beduinContainerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerBackground.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        if (beduinContainerIndent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent2.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinModel> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Integer num = this.interItemSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<BeduinAction> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeInt(this.isInfinite ? 1 : 0);
        parcel.writeInt(this.autoScrollInterval);
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle = this.paginatorStyle;
        if (beduinBannerGalleryContainerPaginatorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinBannerGalleryContainerPaginatorStyle.name());
        }
        List<BeduinAction> list3 = this.onPageSwipedActions;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            parcel.writeParcelable((Parcelable) itA3.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinBannerGalleryContainerModel(@k String str, @l BeduinContainerBackground beduinContainerBackground, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinModel> list, @l Integer num, @l List<? extends BeduinAction> list2, boolean z12, int i12, @l BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle, @l List<? extends BeduinAction> list3) {
        this.id = str;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.displayingPredicate = displayingPredicate;
        this.children = list;
        this.interItemSpacing = num;
        this.actions = list2;
        this.isInfinite = z12;
        this.autoScrollInterval = i12;
        this.paginatorStyle = beduinBannerGalleryContainerPaginatorStyle;
        this.onPageSwipedActions = list3;
    }
}
