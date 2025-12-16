package com.avito.android.beduin.common.container.spread;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.BeduinContainerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.BackgroundTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.utils.C28809e;
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
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSpreadContainerModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\r0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020#2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020!0\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b3\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0018\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b=\u00106J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b>\u00106J\u0018\u0010?\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b?\u00106J\u0018\u0010@\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b@\u00106JÔ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bC\u0010+J\u0010\u0010D\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020!2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bJ\u0010EJ \u0010N\u001a\u00020#2\u0006\u0010L\u001a\u00020K2\u0006\u0010M\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bN\u0010OR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010P\u001a\u0004\bQ\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bS\u0010-R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010T\u001a\u0004\bU\u0010/R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010T\u001a\u0004\bV\u0010/R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010W\u001a\u0004\bX\u00102R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Y\u001a\u0004\bZ\u00104R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010[\u001a\u0004\b\\\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010]\u001a\u0004\b^\u00108R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010_\u001a\u0004\b`\u0010:R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bb\u0010<R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\bc\u00106R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\bd\u00106R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010[\u001a\u0004\be\u00106R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001a\u0010[\u001a\u0004\bf\u00106R\u0014\u0010g\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u0010h¨\u0006i"}, d2 = {"Lcom/avito/android/beduin/common/container/spread/BeduinSpreadContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "", "id", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "interItemSpacing", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/container/spread/Alignment;", "alignment", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "verticalAlignment", "Lcom/avito/android/beduin/common/container/spread/BeduinContainerPriority;", "priority", "Lcom/avito/android/beduin_models/BeduinModel;", "leftChildren", "rightChildren", "onLeftChildrenTapActions", "onRightChildrenTapActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/beduin/common/container/spread/Alignment;Lcom/avito/android/beduin/common/alignment/VerticalAlignment;Lcom/avito/android/beduin/common/container/spread/BeduinContainerPriority;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Lkotlin/Function1;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component4", "component5", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component6", "()Ljava/lang/Integer;", "component7", "()Ljava/util/List;", "component8", "()Lcom/avito/android/beduin/common/container/spread/Alignment;", "component9", "()Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "component10", "()Lcom/avito/android/beduin/common/container/spread/BeduinContainerPriority;", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/beduin/common/container/spread/Alignment;Lcom/avito/android/beduin/common/alignment/VerticalAlignment;Lcom/avito/android/beduin/common/container/spread/BeduinContainerPriority;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/container/spread/BeduinSpreadContainerModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/lang/Integer;", "getInterItemSpacing", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin/common/container/spread/Alignment;", "getAlignment", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "getVerticalAlignment", "Lcom/avito/android/beduin/common/container/spread/BeduinContainerPriority;", "getPriority", "getLeftChildren", "getRightChildren", "getOnLeftChildrenTapActions", "getOnRightChildrenTapActions", "isValid", "()Z", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinSpreadContainerModel implements BeduinContainerModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinSpreadContainerModel> CREATOR = new a();

    @Y61.l
    private final List<BeduinAction> actions;

    @Y61.l
    private final Alignment alignment;

    @Y61.l
    private final BeduinContainerBackground background;

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.k
    private final String id;

    @Y61.l
    private final Integer interItemSpacing;

    @Y61.l
    private final List<BeduinModel> leftChildren;

    @Y61.l
    private final BeduinContainerIndent margin;

    @Y61.l
    private final List<BeduinAction> onLeftChildrenTapActions;

    @Y61.l
    private final List<BeduinAction> onRightChildrenTapActions;

    @Y61.l
    private final BeduinContainerIndent padding;

    @Y61.l
    private final BeduinContainerPriority priority;

    @Y61.l
    private final List<BeduinModel> rightChildren;

    @Y61.l
    private final VerticalAlignment verticalAlignment;

    /* compiled from: BeduinSpreadContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSpreadContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSpreadContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            ArrayList arrayList7;
            String string = parcel.readString();
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinSpreadContainerModel.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSpreadContainerModel.class, parcel, arrayList, iL2, 1);
                }
            }
            Alignment alignmentValueOf = parcel.readInt() == 0 ? null : Alignment.valueOf(parcel.readString());
            VerticalAlignment verticalAlignmentValueOf = parcel.readInt() == 0 ? null : VerticalAlignment.valueOf(parcel.readString());
            BeduinContainerPriority beduinContainerPriorityValueOf = parcel.readInt() == 0 ? null : BeduinContainerPriority.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinSpreadContainerModel.class, parcel, arrayList2, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinSpreadContainerModel.class, parcel, arrayList8, iL4, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = arrayList3;
                arrayList5 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i15);
                arrayList4 = arrayList3;
                int iL5 = 0;
                while (iL5 != i15) {
                    iL5 = com.avito.android.actions_sheet.a.l(BeduinSpreadContainerModel.class, parcel, arrayList9, iL5, 1);
                    i15 = i15;
                }
                arrayList5 = arrayList9;
            }
            if (parcel.readInt() == 0) {
                arrayList6 = arrayList5;
                arrayList7 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i16);
                arrayList6 = arrayList5;
                int iL6 = 0;
                while (iL6 != i16) {
                    iL6 = com.avito.android.actions_sheet.a.l(BeduinSpreadContainerModel.class, parcel, arrayList10, iL6, 1);
                    i16 = i16;
                }
                arrayList7 = arrayList10;
            }
            return new BeduinSpreadContainerModel(string, beduinContainerBackgroundCreateFromParcel, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, displayingPredicate, numValueOf, arrayList, alignmentValueOf, verticalAlignmentValueOf, beduinContainerPriorityValueOf, arrayList2, arrayList4, arrayList6, arrayList7);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSpreadContainerModel[] newArray(int i12) {
            return new BeduinSpreadContainerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSpreadContainerModel(@Y61.k String str, @Y61.l BeduinContainerBackground beduinContainerBackground, @Y61.l BeduinContainerIndent beduinContainerIndent, @Y61.l BeduinContainerIndent beduinContainerIndent2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l Integer num, @Y61.l List<? extends BeduinAction> list, @Y61.l Alignment alignment, @Y61.l VerticalAlignment verticalAlignment, @Y61.l BeduinContainerPriority beduinContainerPriority, @Y61.l List<? extends BeduinModel> list2, @Y61.l List<? extends BeduinModel> list3, @Y61.l List<? extends BeduinAction> list4, @Y61.l List<? extends BeduinAction> list5) {
        this.id = str;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.displayingPredicate = displayingPredicate;
        this.interItemSpacing = num;
        this.actions = list;
        this.alignment = alignment;
        this.verticalAlignment = verticalAlignment;
        this.priority = beduinContainerPriority;
        this.leftChildren = list2;
        this.rightChildren = list3;
        this.onLeftChildrenTapActions = list4;
        this.onRightChildrenTapActions = list5;
    }

    public static /* synthetic */ BeduinSpreadContainerModel copy$default(BeduinSpreadContainerModel beduinSpreadContainerModel, String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, Integer num, List list, Alignment alignment, VerticalAlignment verticalAlignment, BeduinContainerPriority beduinContainerPriority, List list2, List list3, List list4, List list5, int i12, Object obj) {
        return beduinSpreadContainerModel.copy((i12 & 1) != 0 ? beduinSpreadContainerModel.id : str, (i12 & 2) != 0 ? beduinSpreadContainerModel.background : beduinContainerBackground, (i12 & 4) != 0 ? beduinSpreadContainerModel.padding : beduinContainerIndent, (i12 & 8) != 0 ? beduinSpreadContainerModel.margin : beduinContainerIndent2, (i12 & 16) != 0 ? beduinSpreadContainerModel.displayingPredicate : displayingPredicate, (i12 & 32) != 0 ? beduinSpreadContainerModel.interItemSpacing : num, (i12 & 64) != 0 ? beduinSpreadContainerModel.actions : list, (i12 & 128) != 0 ? beduinSpreadContainerModel.alignment : alignment, (i12 & 256) != 0 ? beduinSpreadContainerModel.verticalAlignment : verticalAlignment, (i12 & 512) != 0 ? beduinSpreadContainerModel.priority : beduinContainerPriority, (i12 & 1024) != 0 ? beduinSpreadContainerModel.leftChildren : list2, (i12 & 2048) != 0 ? beduinSpreadContainerModel.rightChildren : list3, (i12 & 4096) != 0 ? beduinSpreadContainerModel.onLeftChildrenTapActions : list4, (i12 & 8192) != 0 ? beduinSpreadContainerModel.onRightChildrenTapActions : list5);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, null, 16367, null) : transform instanceof BackgroundTransform ? copy$default(this, null, ((BackgroundTransform) transform).getBackground(), null, null, null, null, null, null, null, null, null, null, null, null, 16381, null) : this;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component10, reason: from getter */
    public final BeduinContainerPriority getPriority() {
        return this.priority;
    }

    @Y61.l
    public final List<BeduinModel> component11() {
        return this.leftChildren;
    }

    @Y61.l
    public final List<BeduinModel> component12() {
        return this.rightChildren;
    }

    @Y61.l
    public final List<BeduinAction> component13() {
        return this.onLeftChildrenTapActions;
    }

    @Y61.l
    public final List<BeduinAction> component14() {
        return this.onRightChildrenTapActions;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @Y61.l
    public final List<BeduinAction> component7() {
        return this.actions;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    @Y61.k
    public final BeduinSpreadContainerModel copy(@Y61.k String id2, @Y61.l BeduinContainerBackground background, @Y61.l BeduinContainerIndent padding, @Y61.l BeduinContainerIndent margin, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l Integer interItemSpacing, @Y61.l List<? extends BeduinAction> actions, @Y61.l Alignment alignment, @Y61.l VerticalAlignment verticalAlignment, @Y61.l BeduinContainerPriority priority, @Y61.l List<? extends BeduinModel> leftChildren, @Y61.l List<? extends BeduinModel> rightChildren, @Y61.l List<? extends BeduinAction> onLeftChildrenTapActions, @Y61.l List<? extends BeduinAction> onRightChildrenTapActions) {
        return new BeduinSpreadContainerModel(id2, background, padding, margin, displayingPredicate, interItemSpacing, actions, alignment, verticalAlignment, priority, leftChildren, rightChildren, onLeftChildrenTapActions, onRightChildrenTapActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSpreadContainerModel)) {
            return false;
        }
        BeduinSpreadContainerModel beduinSpreadContainerModel = (BeduinSpreadContainerModel) other;
        return L.f(this.id, beduinSpreadContainerModel.id) && L.f(this.background, beduinSpreadContainerModel.background) && L.f(this.padding, beduinSpreadContainerModel.padding) && L.f(this.margin, beduinSpreadContainerModel.margin) && L.f(this.displayingPredicate, beduinSpreadContainerModel.displayingPredicate) && L.f(this.interItemSpacing, beduinSpreadContainerModel.interItemSpacing) && L.f(this.actions, beduinSpreadContainerModel.actions) && this.alignment == beduinSpreadContainerModel.alignment && this.verticalAlignment == beduinSpreadContainerModel.verticalAlignment && this.priority == beduinSpreadContainerModel.priority && L.f(this.leftChildren, beduinSpreadContainerModel.leftChildren) && L.f(this.rightChildren, beduinSpreadContainerModel.rightChildren) && L.f(this.onLeftChildrenTapActions, beduinSpreadContainerModel.onLeftChildrenTapActions) && L.f(this.onRightChildrenTapActions, beduinSpreadContainerModel.onRightChildrenTapActions);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public List<BeduinModel> flatMap(@Y61.k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        List<BeduinModel> list = this.leftChildren;
        BeduinSpreadContainerModel beduinSpreadContainerModelCopy$default = null;
        ArrayList arrayListC = list != null ? C28809e.c(mapper, list) : null;
        List<BeduinModel> list2 = this.rightChildren;
        ArrayList arrayListC2 = list2 != null ? C28809e.c(mapper, list2) : null;
        if (L.f(arrayListC, this.leftChildren) && L.f(arrayListC2, this.rightChildren)) {
            beduinSpreadContainerModelCopy$default = this;
        }
        if (beduinSpreadContainerModelCopy$default == null) {
            beduinSpreadContainerModelCopy$default = copy$default(this, null, null, null, null, null, null, null, null, null, null, arrayListC, arrayListC2, null, null, 13311, null);
        }
        return (List) mapper.invoke(beduinSpreadContainerModelCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@Y61.k Y41.l<? super BeduinModel, Boolean> action) {
        if (action.invoke(this).booleanValue()) {
            return;
        }
        List<BeduinModel> list = this.leftChildren;
        if (list != null) {
            C28809e.e(action, list);
        }
        List<BeduinModel> list2 = this.rightChildren;
        if (list2 != null) {
            C28809e.e(action, list2);
        }
    }

    @Y61.l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Y61.l
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @Y61.l
    public BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public String getId() {
        return this.id;
    }

    @Y61.l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @Y61.l
    public final List<BeduinModel> getLeftChildren() {
        return this.leftChildren;
    }

    @Y61.l
    public BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.l
    public final List<BeduinAction> getOnLeftChildrenTapActions() {
        return this.onLeftChildrenTapActions;
    }

    @Y61.l
    public final List<BeduinAction> getOnRightChildrenTapActions() {
        return this.onRightChildrenTapActions;
    }

    @Y61.l
    public BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @Y61.l
    public final BeduinContainerPriority getPriority() {
        return this.priority;
    }

    @Y61.l
    public final List<BeduinModel> getRightChildren() {
        return this.rightChildren;
    }

    @Y61.l
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
        Integer num = this.interItemSpacing;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Alignment alignment = this.alignment;
        int iHashCode8 = (iHashCode7 + (alignment == null ? 0 : alignment.hashCode())) * 31;
        VerticalAlignment verticalAlignment = this.verticalAlignment;
        int iHashCode9 = (iHashCode8 + (verticalAlignment == null ? 0 : verticalAlignment.hashCode())) * 31;
        BeduinContainerPriority beduinContainerPriority = this.priority;
        int iHashCode10 = (iHashCode9 + (beduinContainerPriority == null ? 0 : beduinContainerPriority.hashCode())) * 31;
        List<BeduinModel> list2 = this.leftChildren;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinModel> list3 = this.rightChildren;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BeduinAction> list4 = this.onLeftChildrenTapActions;
        int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<BeduinAction> list5 = this.onRightChildrenTapActions;
        return iHashCode13 + (list5 != null ? list5.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    @Override // com.avito.android.beduin_models.BeduinModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isValid() {
        /*
            r2 = this;
            java.util.List<com.avito.android.beduin_models.BeduinModel> r0 = r2.leftChildren
            if (r0 == 0) goto L2b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L14
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            goto L2b
        L14:
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            com.avito.android.beduin_models.BeduinModel r1 = (com.avito.android.beduin_models.BeduinModel) r1
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L18
            goto L55
        L2b:
            java.util.List<com.avito.android.beduin_models.BeduinModel> r0 = r2.rightChildren
            if (r0 == 0) goto L57
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L3f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3f
            goto L57
        L3f:
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            com.avito.android.beduin_models.BeduinModel r1 = (com.avito.android.beduin_models.BeduinModel) r1
            boolean r1 = r1.isValid()
            if (r1 != 0) goto L43
        L55:
            r0 = 0
            goto L58
        L57:
            r0 = 1
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.container.spread.BeduinSpreadContainerModel.isValid():boolean");
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSpreadContainerModel(id=");
        sb2.append(this.id);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", interItemSpacing=");
        sb2.append(this.interItemSpacing);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", alignment=");
        sb2.append(this.alignment);
        sb2.append(", verticalAlignment=");
        sb2.append(this.verticalAlignment);
        sb2.append(", priority=");
        sb2.append(this.priority);
        sb2.append(", leftChildren=");
        sb2.append(this.leftChildren);
        sb2.append(", rightChildren=");
        sb2.append(this.rightChildren);
        sb2.append(", onLeftChildrenTapActions=");
        sb2.append(this.onLeftChildrenTapActions);
        sb2.append(", onRightChildrenTapActions=");
        return H.p(sb2, this.onRightChildrenTapActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
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
        Integer num = this.interItemSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Alignment alignment = this.alignment;
        if (alignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(alignment.name());
        }
        VerticalAlignment verticalAlignment = this.verticalAlignment;
        if (verticalAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verticalAlignment.name());
        }
        BeduinContainerPriority beduinContainerPriority = this.priority;
        if (beduinContainerPriority == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinContainerPriority.name());
        }
        List<BeduinModel> list2 = this.leftChildren;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        List<BeduinModel> list3 = this.rightChildren;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        List<BeduinAction> list4 = this.onLeftChildrenTapActions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), flags);
            }
        }
        List<BeduinAction> list5 = this.onRightChildrenTapActions;
        if (list5 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA5 = com.avito.android.actions_sheet.a.A(list5, parcel, 1);
        while (itA5.hasNext()) {
            parcel.writeParcelable((Parcelable) itA5.next(), flags);
        }
    }

    public /* synthetic */ BeduinSpreadContainerModel(String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, Integer num, List list, Alignment alignment, VerticalAlignment verticalAlignment, BeduinContainerPriority beduinContainerPriority, List list2, List list3, List list4, List list5, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : beduinContainerBackground, (i12 & 4) != 0 ? null : beduinContainerIndent, (i12 & 8) != 0 ? null : beduinContainerIndent2, (i12 & 16) != 0 ? null : displayingPredicate, (i12 & 32) != 0 ? null : num, (i12 & 64) != 0 ? null : list, (i12 & 128) != 0 ? Alignment.SPREAD : alignment, (i12 & 256) != 0 ? VerticalAlignment.TOP : verticalAlignment, (i12 & 512) != 0 ? null : beduinContainerPriority, (i12 & 1024) != 0 ? null : list2, (i12 & 2048) != 0 ? null : list3, (i12 & 4096) != 0 ? null : list4, (i12 & 8192) == 0 ? list5 : null);
    }
}
