package com.avito.android.beduin.common.container.tabs;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.BeduinContainerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.BackgroundTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.SelectTabTransform;
import com.avito.android.beduin.common.shared.tabs.BeduinTabStyle;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTabContainerModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u000b2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c0\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010&J\u0012\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b4\u0010*J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b5\u0010/J¢\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010&J\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020\u001c2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u000209HÖ\u0001¢\u0006\u0004\b@\u0010;J \u0010D\u001a\u00020\u001e2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u000209HÖ\u0001¢\u0006\u0004\bD\u0010EJ9\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b*\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u000b0\u0017H\u0002¢\u0006\u0004\b#\u0010FR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010K\u001a\u0004\bL\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bM\u0010*R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bO\u0010-R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bQ\u0010/R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010P\u001a\u0004\bR\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010S\u001a\u0004\bT\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bU\u0010&R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\bV\u0010*R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010P\u001a\u0004\bW\u0010/¨\u0006X"}, d2 = {"Lcom/avito/android/beduin/common/container/tabs/BeduinTabContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "", "id", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin/common/container/tabs/BeduinTabContainerChild;", "tabs", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "selectedTabId", "tabPaddings", "onTabClickedActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/util/List;)V", "Lkotlin/Function1;", "Lcom/avito/android/beduin_models/BeduinModel;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component4", "component5", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component6", "()Ljava/util/List;", "component7", "component8", "()Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/util/List;)Lcom/avito/android/beduin/common/container/tabs/BeduinTabContainerModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "(Ljava/util/List;LY41/l;)Ljava/util/List;", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "getTabs", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", "getStyle", "getSelectedTabId", "getTabPaddings", "getOnTabClickedActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinTabContainerModel implements BeduinContainerModel {

    @k
    public static final Parcelable.Creator<BeduinTabContainerModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final BeduinContainerBackground background;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final BeduinContainerIndent margin;

    @l
    private final List<BeduinAction> onTabClickedActions;

    @l
    private final BeduinContainerIndent padding;

    @l
    private final String selectedTabId;

    @l
    private final BeduinTabStyle style;

    @l
    private final BeduinContainerIndent tabPaddings;

    @k
    private final List<BeduinTabContainerChild> tabs;

    /* compiled from: BeduinTabContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTabContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTabContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinTabContainerModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinTabContainerModel.class, parcel, arrayList, iL3, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(BeduinTabContainerChild.CREATOR, parcel, arrayList3, iC2, 1);
            }
            BeduinTabStyle beduinTabStyleValueOf = parcel.readInt() == 0 ? null : BeduinTabStyle.valueOf(parcel.readString());
            String string2 = parcel.readString();
            BeduinContainerIndent beduinContainerIndentCreateFromParcel3 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinTabContainerModel.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinTabContainerModel(string, beduinContainerBackgroundCreateFromParcel, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, displayingPredicate, arrayList, arrayList3, beduinTabStyleValueOf, string2, beduinContainerIndentCreateFromParcel3, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTabContainerModel[] newArray(int i12) {
            return new BeduinTabContainerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinTabContainerModel(@k String str, @l BeduinContainerBackground beduinContainerBackground, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @k List<BeduinTabContainerChild> list2, @l BeduinTabStyle beduinTabStyle, @l String str2, @l BeduinContainerIndent beduinContainerIndent3, @l List<? extends BeduinAction> list3) {
        this.id = str;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.tabs = list2;
        this.style = beduinTabStyle;
        this.selectedTabId = str2;
        this.tabPaddings = beduinContainerIndent3;
        this.onTabClickedActions = list3;
    }

    public static /* synthetic */ BeduinTabContainerModel copy$default(BeduinTabContainerModel beduinTabContainerModel, String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, List list2, BeduinTabStyle beduinTabStyle, String str2, BeduinContainerIndent beduinContainerIndent3, List list3, int i12, Object obj) {
        return beduinTabContainerModel.copy((i12 & 1) != 0 ? beduinTabContainerModel.id : str, (i12 & 2) != 0 ? beduinTabContainerModel.background : beduinContainerBackground, (i12 & 4) != 0 ? beduinTabContainerModel.padding : beduinContainerIndent, (i12 & 8) != 0 ? beduinTabContainerModel.margin : beduinContainerIndent2, (i12 & 16) != 0 ? beduinTabContainerModel.displayingPredicate : displayingPredicate, (i12 & 32) != 0 ? beduinTabContainerModel.actions : list, (i12 & 64) != 0 ? beduinTabContainerModel.tabs : list2, (i12 & 128) != 0 ? beduinTabContainerModel.style : beduinTabStyle, (i12 & 256) != 0 ? beduinTabContainerModel.selectedTabId : str2, (i12 & 512) != 0 ? beduinTabContainerModel.tabPaddings : beduinContainerIndent3, (i12 & 1024) != 0 ? beduinTabContainerModel.onTabClickedActions : list3);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, 2031, null) : transform instanceof SelectTabTransform ? copy$default(this, null, null, null, null, null, null, null, null, ((SelectTabTransform) transform).getTabId(), null, null, 1791, null) : transform instanceof BackgroundTransform ? copy$default(this, null, ((BackgroundTransform) transform).getBackground(), null, null, null, null, null, null, null, null, null, 2045, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final BeduinContainerIndent getTabPaddings() {
        return this.tabPaddings;
    }

    @l
    public final List<BeduinAction> component11() {
        return this.onTabClickedActions;
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
    public final List<BeduinAction> component6() {
        return this.actions;
    }

    @k
    public final List<BeduinTabContainerChild> component7() {
        return this.tabs;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final BeduinTabStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getSelectedTabId() {
        return this.selectedTabId;
    }

    @k
    public final BeduinTabContainerModel copy(@k String id2, @l BeduinContainerBackground background, @l BeduinContainerIndent padding, @l BeduinContainerIndent margin, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @k List<BeduinTabContainerChild> tabs, @l BeduinTabStyle style, @l String selectedTabId, @l BeduinContainerIndent tabPaddings, @l List<? extends BeduinAction> onTabClickedActions) {
        return new BeduinTabContainerModel(id2, background, padding, margin, displayingPredicate, actions, tabs, style, selectedTabId, tabPaddings, onTabClickedActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTabContainerModel)) {
            return false;
        }
        BeduinTabContainerModel beduinTabContainerModel = (BeduinTabContainerModel) other;
        return L.f(this.id, beduinTabContainerModel.id) && L.f(this.background, beduinTabContainerModel.background) && L.f(this.padding, beduinTabContainerModel.padding) && L.f(this.margin, beduinTabContainerModel.margin) && L.f(this.displayingPredicate, beduinTabContainerModel.displayingPredicate) && L.f(this.actions, beduinTabContainerModel.actions) && L.f(this.tabs, beduinTabContainerModel.tabs) && this.style == beduinTabContainerModel.style && L.f(this.selectedTabId, beduinTabContainerModel.selectedTabId) && L.f(this.tabPaddings, beduinTabContainerModel.tabPaddings) && L.f(this.onTabClickedActions, beduinTabContainerModel.onTabClickedActions);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public List<BeduinModel> flatMap(@k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        List<BeduinTabContainerChild> listApply = apply(this.tabs, mapper);
        BeduinTabContainerModel beduinTabContainerModelCopy$default = L.f(listApply, this.tabs) ? this : null;
        if (beduinTabContainerModelCopy$default == null) {
            beduinTabContainerModelCopy$default = copy$default(this, null, null, null, null, null, null, listApply, null, null, null, null, 1983, null);
        }
        return (List) mapper.invoke(beduinTabContainerModelCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@k Y41.l<? super BeduinModel, Boolean> action) {
        if (action.invoke(this).booleanValue()) {
            return;
        }
        Iterator<T> it = this.tabs.iterator();
        while (it.hasNext()) {
            ((BeduinTabContainerChild) it.next()).getChild().forEach(action);
        }
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public BeduinContainerBackground getBackground() {
        return this.background;
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
    public BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final List<BeduinAction> getOnTabClickedActions() {
        return this.onTabClickedActions;
    }

    @l
    public BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final String getSelectedTabId() {
        return this.selectedTabId;
    }

    @l
    public final BeduinTabStyle getStyle() {
        return this.style;
    }

    @l
    public final BeduinContainerIndent getTabPaddings() {
        return this.tabPaddings;
    }

    @k
    public final List<BeduinTabContainerChild> getTabs() {
        return this.tabs;
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
        List<BeduinAction> list = this.actions;
        int iE2 = H.e((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31, this.tabs);
        BeduinTabStyle beduinTabStyle = this.style;
        int iHashCode6 = (iE2 + (beduinTabStyle == null ? 0 : beduinTabStyle.hashCode())) * 31;
        String str = this.selectedTabId;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent3 = this.tabPaddings;
        int iHashCode8 = (iHashCode7 + (beduinContainerIndent3 == null ? 0 : beduinContainerIndent3.hashCode())) * 31;
        List<BeduinAction> list2 = this.onTabClickedActions;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        return true;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinTabContainerModel(id=");
        sb2.append(this.id);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", tabs=");
        sb2.append(this.tabs);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", selectedTabId=");
        sb2.append(this.selectedTabId);
        sb2.append(", tabPaddings=");
        sb2.append(this.tabPaddings);
        sb2.append(", onTabClickedActions=");
        return H.p(sb2, this.onTabClickedActions, ')');
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
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.tabs, parcel);
        while (itJ.hasNext()) {
            ((BeduinTabContainerChild) itJ.next()).writeToParcel(parcel, flags);
        }
        BeduinTabStyle beduinTabStyle = this.style;
        if (beduinTabStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinTabStyle.name());
        }
        parcel.writeString(this.selectedTabId);
        BeduinContainerIndent beduinContainerIndent3 = this.tabPaddings;
        if (beduinContainerIndent3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent3.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list2 = this.onTabClickedActions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    private final List<BeduinTabContainerChild> apply(List<BeduinTabContainerChild> list, Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> lVar) {
        ArrayList arrayList = new ArrayList();
        for (BeduinTabContainerChild beduinTabContainerChild : list) {
            List<BeduinModel> listFlatMap = beduinTabContainerChild.getChild().flatMap(lVar);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(listFlatMap, 10));
            Iterator<T> it = listFlatMap.iterator();
            while (it.hasNext()) {
                arrayList2.add(BeduinTabContainerChild.copy$default(beduinTabContainerChild, null, null, null, (BeduinModel) it.next(), 7, null));
            }
            C42745f0.h(arrayList2, arrayList);
        }
        return arrayList;
    }
}
