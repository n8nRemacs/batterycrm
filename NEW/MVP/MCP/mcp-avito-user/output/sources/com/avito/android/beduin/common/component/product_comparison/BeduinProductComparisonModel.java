package com.avito.android.beduin.common.component.product_comparison;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinProductComparisonModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010$J\u0010\u0010*\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0012\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u0010'J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0012\u00101\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u0010\"JÔ\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b6\u0010\u001eJ\u0010\u00107\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b>\u00108J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\fHÖ\u0001¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010E\u001a\u0004\bF\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010G\u001a\u0004\bH\u0010 R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bJ\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010K\u001a\u0004\bL\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010K\u001a\u0004\bM\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010N\u001a\u0004\bO\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bP\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bQ\u0010$R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010R\u001a\u0004\bS\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010T\u001a\u0004\bU\u0010-R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bV\u0010\"R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010N\u001a\u0004\bW\u0010'R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010I\u001a\u0004\bX\u0010\"R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010Y\u001a\u0004\bZ\u00102R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010I\u001a\u0004\b[\u0010\"¨\u0006\\"}, d2 = {"Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;", "titleParams", "descriptionParams", "", "interItemSpacing", "propertyTitleParams", "propertyValueParams", "", "imageRatio", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", "imageStyle", "propertyTitles", "itemWidth", "Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonProductItem;", "items", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "onPageSwipedActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;FLcom/avito/android/beduin/common/component/image/ImageStyle;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "component8", "component9", "()F", "component10", "()Lcom/avito/android/beduin/common/component/image/ImageStyle;", "component11", "component12", "component13", "component14", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component15", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;FLcom/avito/android/beduin/common/component/image/ImageStyle;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/util/List;)Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin/common/component/product_comparison/BeduinProductComparisonTextItemParams;", "getTitleParams", "getDescriptionParams", "Ljava/lang/Integer;", "getInterItemSpacing", "getPropertyTitleParams", "getPropertyValueParams", "F", "getImageRatio", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", "getImageStyle", "getPropertyTitles", "getItemWidth", "getItems", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getOnPageSwipedActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinProductComparisonModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinProductComparisonModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final BeduinProductComparisonTextItemParams descriptionParams;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;
    private final float imageRatio;

    @l
    private final ImageStyle imageStyle;

    @l
    private final Integer interItemSpacing;

    @l
    private final Integer itemWidth;

    @k
    private final List<BeduinProductComparisonProductItem> items;

    @l
    private final List<BeduinAction> onPageSwipedActions;

    @l
    private final BeduinContainerIndent padding;

    @l
    private final BeduinProductComparisonTextItemParams propertyTitleParams;

    @k
    private final List<String> propertyTitles;

    @l
    private final BeduinProductComparisonTextItemParams propertyValueParams;

    @l
    private final BeduinProductComparisonTextItemParams titleParams;

    /* compiled from: BeduinProductComparisonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinProductComparisonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinProductComparisonModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            BeduinContainerIndent beduinContainerIndent;
            ArrayList arrayList2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinProductComparisonModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinProductComparisonModel.class, parcel, arrayList, iL2, 1);
                }
            }
            BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParamsCreateFromParcel = parcel.readInt() == 0 ? null : BeduinProductComparisonTextItemParams.CREATOR.createFromParcel(parcel);
            BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParamsCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinProductComparisonTextItemParams.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParamsCreateFromParcel3 = parcel.readInt() == 0 ? null : BeduinProductComparisonTextItemParams.CREATOR.createFromParcel(parcel);
            BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParamsCreateFromParcel4 = parcel.readInt() == 0 ? null : BeduinProductComparisonTextItemParams.CREATOR.createFromParcel(parcel);
            float f12 = parcel.readFloat();
            ImageStyle imageStyleCreateFromParcel = parcel.readInt() == 0 ? null : ImageStyle.CREATOR.createFromParcel(parcel);
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i13 = parcel.readInt();
            Integer num = numValueOf2;
            ArrayList arrayList3 = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(BeduinProductComparisonProductItem.CREATOR, parcel, arrayList3, iC2, 1);
                i13 = i13;
                arrayListCreateStringArrayList = arrayListCreateStringArrayList;
            }
            ArrayList<String> arrayList4 = arrayListCreateStringArrayList;
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                beduinContainerIndent = beduinContainerIndentCreateFromParcel;
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                beduinContainerIndent = beduinContainerIndentCreateFromParcel;
                int iL3 = 0;
                while (iL3 != i14) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinProductComparisonModel.class, parcel, arrayList5, iL3, 1);
                    i14 = i14;
                }
                arrayList2 = arrayList5;
            }
            return new BeduinProductComparisonModel(string, displayingPredicate, arrayList, beduinProductComparisonTextItemParamsCreateFromParcel, beduinProductComparisonTextItemParamsCreateFromParcel2, numValueOf, beduinProductComparisonTextItemParamsCreateFromParcel3, beduinProductComparisonTextItemParamsCreateFromParcel4, f12, imageStyleCreateFromParcel, arrayList4, num, arrayList3, beduinContainerIndent, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinProductComparisonModel[] newArray(int i12) {
            return new BeduinProductComparisonModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinProductComparisonModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams2, @l Integer num, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams3, @l BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams4, float f12, @l ImageStyle imageStyle, @k List<String> list2, @l Integer num2, @k List<BeduinProductComparisonProductItem> list3, @l BeduinContainerIndent beduinContainerIndent, @l List<? extends BeduinAction> list4) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.titleParams = beduinProductComparisonTextItemParams;
        this.descriptionParams = beduinProductComparisonTextItemParams2;
        this.interItemSpacing = num;
        this.propertyTitleParams = beduinProductComparisonTextItemParams3;
        this.propertyValueParams = beduinProductComparisonTextItemParams4;
        this.imageRatio = f12;
        this.imageStyle = imageStyle;
        this.propertyTitles = list2;
        this.itemWidth = num2;
        this.items = list3;
        this.padding = beduinContainerIndent;
        this.onPageSwipedActions = list4;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @k
    public final List<String> component11() {
        return this.propertyTitles;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Integer getItemWidth() {
        return this.itemWidth;
    }

    @k
    public final List<BeduinProductComparisonProductItem> component13() {
        return this.items;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final List<BeduinAction> component15() {
        return this.onPageSwipedActions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.actions;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinProductComparisonTextItemParams getTitleParams() {
        return this.titleParams;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BeduinProductComparisonTextItemParams getDescriptionParams() {
        return this.descriptionParams;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinProductComparisonTextItemParams getPropertyTitleParams() {
        return this.propertyTitleParams;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final BeduinProductComparisonTextItemParams getPropertyValueParams() {
        return this.propertyValueParams;
    }

    /* renamed from: component9, reason: from getter */
    public final float getImageRatio() {
        return this.imageRatio;
    }

    @k
    public final BeduinProductComparisonModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @l BeduinProductComparisonTextItemParams titleParams, @l BeduinProductComparisonTextItemParams descriptionParams, @l Integer interItemSpacing, @l BeduinProductComparisonTextItemParams propertyTitleParams, @l BeduinProductComparisonTextItemParams propertyValueParams, float imageRatio, @l ImageStyle imageStyle, @k List<String> propertyTitles, @l Integer itemWidth, @k List<BeduinProductComparisonProductItem> items, @l BeduinContainerIndent padding, @l List<? extends BeduinAction> onPageSwipedActions) {
        return new BeduinProductComparisonModel(id2, displayingPredicate, actions, titleParams, descriptionParams, interItemSpacing, propertyTitleParams, propertyValueParams, imageRatio, imageStyle, propertyTitles, itemWidth, items, padding, onPageSwipedActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinProductComparisonModel)) {
            return false;
        }
        BeduinProductComparisonModel beduinProductComparisonModel = (BeduinProductComparisonModel) other;
        return L.f(this.id, beduinProductComparisonModel.id) && L.f(this.displayingPredicate, beduinProductComparisonModel.displayingPredicate) && L.f(this.actions, beduinProductComparisonModel.actions) && L.f(this.titleParams, beduinProductComparisonModel.titleParams) && L.f(this.descriptionParams, beduinProductComparisonModel.descriptionParams) && L.f(this.interItemSpacing, beduinProductComparisonModel.interItemSpacing) && L.f(this.propertyTitleParams, beduinProductComparisonModel.propertyTitleParams) && L.f(this.propertyValueParams, beduinProductComparisonModel.propertyValueParams) && Float.compare(this.imageRatio, beduinProductComparisonModel.imageRatio) == 0 && L.f(this.imageStyle, beduinProductComparisonModel.imageStyle) && L.f(this.propertyTitles, beduinProductComparisonModel.propertyTitles) && L.f(this.itemWidth, beduinProductComparisonModel.itemWidth) && L.f(this.items, beduinProductComparisonModel.items) && L.f(this.padding, beduinProductComparisonModel.padding) && L.f(this.onPageSwipedActions, beduinProductComparisonModel.onPageSwipedActions);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final BeduinProductComparisonTextItemParams getDescriptionParams() {
        return this.descriptionParams;
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

    public final float getImageRatio() {
        return this.imageRatio;
    }

    @l
    public final ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final Integer getItemWidth() {
        return this.itemWidth;
    }

    @k
    public final List<BeduinProductComparisonProductItem> getItems() {
        return this.items;
    }

    @l
    public final List<BeduinAction> getOnPageSwipedActions() {
        return this.onPageSwipedActions;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final BeduinProductComparisonTextItemParams getPropertyTitleParams() {
        return this.propertyTitleParams;
    }

    @k
    public final List<String> getPropertyTitles() {
        return this.propertyTitles;
    }

    @l
    public final BeduinProductComparisonTextItemParams getPropertyValueParams() {
        return this.propertyValueParams;
    }

    @l
    public final BeduinProductComparisonTextItemParams getTitleParams() {
        return this.titleParams;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams = this.titleParams;
        int iHashCode4 = (iHashCode3 + (beduinProductComparisonTextItemParams == null ? 0 : beduinProductComparisonTextItemParams.hashCode())) * 31;
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams2 = this.descriptionParams;
        int iHashCode5 = (iHashCode4 + (beduinProductComparisonTextItemParams2 == null ? 0 : beduinProductComparisonTextItemParams2.hashCode())) * 31;
        Integer num = this.interItemSpacing;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams3 = this.propertyTitleParams;
        int iHashCode7 = (iHashCode6 + (beduinProductComparisonTextItemParams3 == null ? 0 : beduinProductComparisonTextItemParams3.hashCode())) * 31;
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams4 = this.propertyValueParams;
        int iD2 = r.d(this.imageRatio, (iHashCode7 + (beduinProductComparisonTextItemParams4 == null ? 0 : beduinProductComparisonTextItemParams4.hashCode())) * 31, 31);
        ImageStyle imageStyle = this.imageStyle;
        int iE2 = H.e((iD2 + (imageStyle == null ? 0 : imageStyle.hashCode())) * 31, 31, this.propertyTitles);
        Integer num2 = this.itemWidth;
        int iE3 = H.e((iE2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.items);
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode8 = (iE3 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        List<BeduinAction> list2 = this.onPageSwipedActions;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinProductComparisonModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", titleParams=");
        sb2.append(this.titleParams);
        sb2.append(", descriptionParams=");
        sb2.append(this.descriptionParams);
        sb2.append(", interItemSpacing=");
        sb2.append(this.interItemSpacing);
        sb2.append(", propertyTitleParams=");
        sb2.append(this.propertyTitleParams);
        sb2.append(", propertyValueParams=");
        sb2.append(this.propertyValueParams);
        sb2.append(", imageRatio=");
        sb2.append(this.imageRatio);
        sb2.append(", imageStyle=");
        sb2.append(this.imageStyle);
        sb2.append(", propertyTitles=");
        sb2.append(this.propertyTitles);
        sb2.append(", itemWidth=");
        sb2.append(this.itemWidth);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", onPageSwipedActions=");
        return H.p(sb2, this.onPageSwipedActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams = this.titleParams;
        if (beduinProductComparisonTextItemParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinProductComparisonTextItemParams.writeToParcel(parcel, flags);
        }
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams2 = this.descriptionParams;
        if (beduinProductComparisonTextItemParams2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinProductComparisonTextItemParams2.writeToParcel(parcel, flags);
        }
        Integer num = this.interItemSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams3 = this.propertyTitleParams;
        if (beduinProductComparisonTextItemParams3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinProductComparisonTextItemParams3.writeToParcel(parcel, flags);
        }
        BeduinProductComparisonTextItemParams beduinProductComparisonTextItemParams4 = this.propertyValueParams;
        if (beduinProductComparisonTextItemParams4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinProductComparisonTextItemParams4.writeToParcel(parcel, flags);
        }
        parcel.writeFloat(this.imageRatio);
        ImageStyle imageStyle = this.imageStyle;
        if (imageStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStyle.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.propertyTitles);
        Integer num2 = this.itemWidth;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((BeduinProductComparisonProductItem) itJ.next()).writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list2 = this.onPageSwipedActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }
}
