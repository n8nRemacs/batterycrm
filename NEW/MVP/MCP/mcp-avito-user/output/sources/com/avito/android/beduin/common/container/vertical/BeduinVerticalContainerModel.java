package com.avito.android.beduin.common.container.vertical;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.alignment.HorizontalAlignment;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
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
import kotlin.jvm.internal.L;

/* compiled from: BeduinVerticalContainerModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b/\u0010.J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b0\u0010,J\u0012\u00101\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b5\u00106Jª\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b9\u0010#J\u0010\u0010:\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bA\u0010;J \u0010F\u001a\u00020E2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bI\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010%R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010L\u001a\u0004\bM\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010L\u001a\u0004\bN\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010O\u001a\u0004\bP\u0010*R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\bT\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bU\u0010.R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010Q\u001a\u0004\bV\u0010,R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bX\u00102R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010Y\u001a\u0004\bZ\u00104R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\b\\\u00106¨\u0006]"}, d2 = {"Lcom/avito/android/beduin/common/container/vertical/BeduinVerticalContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "", "id", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "interItemSpacing", "maxWidth", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;", "horizontalAlignment", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "verticalAlignment", "Lcom/avito/android/beduin/common/container/vertical/LayoutMode;", "layoutMode", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;Lcom/avito/android/beduin/common/alignment/VerticalAlignment;Lcom/avito/android/beduin/common/container/vertical/LayoutMode;)V", "create", "(Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component4", "component5", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component6", "()Ljava/util/List;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "()Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;", "component11", "()Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "component12", "()Lcom/avito/android/beduin/common/container/vertical/LayoutMode;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;Lcom/avito/android/beduin/common/alignment/VerticalAlignment;Lcom/avito/android/beduin/common/container/vertical/LayoutMode;)Lcom/avito/android/beduin/common/container/vertical/BeduinVerticalContainerModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getChildren", "Ljava/lang/Integer;", "getInterItemSpacing", "getMaxWidth", "getActions", "Lcom/avito/android/beduin/common/alignment/HorizontalAlignment;", "getHorizontalAlignment", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "getVerticalAlignment", "Lcom/avito/android/beduin/common/container/vertical/LayoutMode;", "getLayoutMode", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinVerticalContainerModel extends BeduinSingleChildOwnerModel implements BeduinContainerModel {

    @k
    public static final Parcelable.Creator<BeduinVerticalContainerModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final BeduinContainerBackground background;

    @l
    private final List<BeduinModel> children;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final HorizontalAlignment horizontalAlignment;

    @k
    private final String id;

    @l
    private final Integer interItemSpacing;

    @l
    private final LayoutMode layoutMode;

    @l
    private final BeduinContainerIndent margin;

    @l
    private final Integer maxWidth;

    @l
    private final BeduinContainerIndent padding;

    @l
    private final VerticalAlignment verticalAlignment;

    /* compiled from: BeduinVerticalContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinVerticalContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinVerticalContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinVerticalContainerModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinVerticalContainerModel.class, parcel, arrayList, iL3, 1);
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinVerticalContainerModel.class, parcel, arrayList3, iL2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new BeduinVerticalContainerModel(string, beduinContainerBackgroundCreateFromParcel, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, displayingPredicate, arrayList, numValueOf, numValueOf2, arrayList2, parcel.readInt() == 0 ? null : HorizontalAlignment.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : VerticalAlignment.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : LayoutMode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinVerticalContainerModel[] newArray(int i12) {
            return new BeduinVerticalContainerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinVerticalContainerModel(@k String str, @l BeduinContainerBackground beduinContainerBackground, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinModel> list, @l Integer num, @l Integer num2, @l List<? extends BeduinAction> list2, @l HorizontalAlignment horizontalAlignment, @l VerticalAlignment verticalAlignment, @l LayoutMode layoutMode) {
        this.id = str;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.displayingPredicate = displayingPredicate;
        this.children = list;
        this.interItemSpacing = num;
        this.maxWidth = num2;
        this.actions = list2;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.layoutMode = layoutMode;
    }

    public static /* synthetic */ BeduinVerticalContainerModel copy$default(BeduinVerticalContainerModel beduinVerticalContainerModel, String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, Integer num, Integer num2, List list2, HorizontalAlignment horizontalAlignment, VerticalAlignment verticalAlignment, LayoutMode layoutMode, int i12, Object obj) {
        return beduinVerticalContainerModel.copy((i12 & 1) != 0 ? beduinVerticalContainerModel.id : str, (i12 & 2) != 0 ? beduinVerticalContainerModel.background : beduinContainerBackground, (i12 & 4) != 0 ? beduinVerticalContainerModel.padding : beduinContainerIndent, (i12 & 8) != 0 ? beduinVerticalContainerModel.margin : beduinContainerIndent2, (i12 & 16) != 0 ? beduinVerticalContainerModel.displayingPredicate : displayingPredicate, (i12 & 32) != 0 ? beduinVerticalContainerModel.children : list, (i12 & 64) != 0 ? beduinVerticalContainerModel.interItemSpacing : num, (i12 & 128) != 0 ? beduinVerticalContainerModel.maxWidth : num2, (i12 & 256) != 0 ? beduinVerticalContainerModel.actions : list2, (i12 & 512) != 0 ? beduinVerticalContainerModel.horizontalAlignment : horizontalAlignment, (i12 & 1024) != 0 ? beduinVerticalContainerModel.verticalAlignment : verticalAlignment, (i12 & 2048) != 0 ? beduinVerticalContainerModel.layoutMode : layoutMode);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof BackgroundTransform ? copy$default(this, null, ((BackgroundTransform) transform).getBackground(), null, null, null, null, null, null, null, null, null, null, 4093, null) : super.apply(transform);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
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
    /* renamed from: component8, reason: from getter */
    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    @l
    public final List<BeduinAction> component9() {
        return this.actions;
    }

    @k
    public final BeduinVerticalContainerModel copy(@k String id2, @l BeduinContainerBackground background, @l BeduinContainerIndent padding, @l BeduinContainerIndent margin, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinModel> children, @l Integer interItemSpacing, @l Integer maxWidth, @l List<? extends BeduinAction> actions, @l HorizontalAlignment horizontalAlignment, @l VerticalAlignment verticalAlignment, @l LayoutMode layoutMode) {
        return new BeduinVerticalContainerModel(id2, background, padding, margin, displayingPredicate, children, interItemSpacing, maxWidth, actions, horizontalAlignment, verticalAlignment, layoutMode);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public BeduinModel create(@l List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate) {
        return copy$default(this, null, null, null, null, displayingPredicate, children, null, null, null, null, null, null, 4047, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinVerticalContainerModel)) {
            return false;
        }
        BeduinVerticalContainerModel beduinVerticalContainerModel = (BeduinVerticalContainerModel) other;
        return L.f(this.id, beduinVerticalContainerModel.id) && L.f(this.background, beduinVerticalContainerModel.background) && L.f(this.padding, beduinVerticalContainerModel.padding) && L.f(this.margin, beduinVerticalContainerModel.margin) && L.f(this.displayingPredicate, beduinVerticalContainerModel.displayingPredicate) && L.f(this.children, beduinVerticalContainerModel.children) && L.f(this.interItemSpacing, beduinVerticalContainerModel.interItemSpacing) && L.f(this.maxWidth, beduinVerticalContainerModel.maxWidth) && L.f(this.actions, beduinVerticalContainerModel.actions) && this.horizontalAlignment == beduinVerticalContainerModel.horizontalAlignment && this.verticalAlignment == beduinVerticalContainerModel.verticalAlignment && this.layoutMode == beduinVerticalContainerModel.layoutMode;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
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

    @l
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
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
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    public BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final Integer getMaxWidth() {
        return this.maxWidth;
    }

    @l
    public BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
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
        Integer num2 = this.maxWidth;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<BeduinAction> list2 = this.actions;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        HorizontalAlignment horizontalAlignment = this.horizontalAlignment;
        int iHashCode10 = (iHashCode9 + (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode())) * 31;
        VerticalAlignment verticalAlignment = this.verticalAlignment;
        int iHashCode11 = (iHashCode10 + (verticalAlignment == null ? 0 : verticalAlignment.hashCode())) * 31;
        LayoutMode layoutMode = this.layoutMode;
        return iHashCode11 + (layoutMode != null ? layoutMode.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinVerticalContainerModel(id=" + this.id + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", displayingPredicate=" + this.displayingPredicate + ", children=" + this.children + ", interItemSpacing=" + this.interItemSpacing + ", maxWidth=" + this.maxWidth + ", actions=" + this.actions + ", horizontalAlignment=" + this.horizontalAlignment + ", verticalAlignment=" + this.verticalAlignment + ", layoutMode=" + this.layoutMode + ')';
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
        Integer num2 = this.maxWidth;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
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
        HorizontalAlignment horizontalAlignment = this.horizontalAlignment;
        if (horizontalAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(horizontalAlignment.name());
        }
        VerticalAlignment verticalAlignment = this.verticalAlignment;
        if (verticalAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verticalAlignment.name());
        }
        LayoutMode layoutMode = this.layoutMode;
        if (layoutMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(layoutMode.name());
        }
    }
}
