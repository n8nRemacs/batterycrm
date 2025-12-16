package com.avito.android.beduin.common.component.tabber;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTabberModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"Jl\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020&HÖ\u0001¢\u0006\u0004\b.\u0010(J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020&HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010\u001eR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b=\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b>\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010\"R\u0011\u0010B\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bA\u0010(¨\u0006C"}, d2 = {"Lcom/avito/android/beduin/common/component/tabber/BeduinTabberModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "tabPaddings", "", "Lcom/avito/android/beduin/common/component/tabber/BeduinTabberChild;", "tabs", "Lcom/avito/android/beduin_models/BeduinAction;", "onTabClickedActions", "selectedTabId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/tabber/BeduinTabberModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabStyle;", "getStyle", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getTabPaddings", "Ljava/util/List;", "getTabs", "getOnTabClickedActions", "getSelectedTabId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getSelectedTabIndex", "selectedTabIndex", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinTabberModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinTabberModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final List<BeduinAction> onTabClickedActions;

    @l
    private final String selectedTabId;

    @l
    private final BeduinTabStyle style;

    @l
    private final BeduinContainerIndent tabPaddings;

    @k
    private final List<BeduinTabberChild> tabs;

    /* compiled from: BeduinTabberModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTabberModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTabberModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            BeduinTabStyle beduinTabStyleValueOf = parcel.readInt() == 0 ? null : BeduinTabStyle.valueOf(parcel.readString());
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BeduinTabberChild.CREATOR, parcel, arrayList2, iC2, 1);
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinTabberModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinTabberModel(string, beduinTabStyleValueOf, beduinContainerIndentCreateFromParcel, arrayList2, arrayList, parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinTabberModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTabberModel[] newArray(int i12) {
            return new BeduinTabberModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinTabberModel(@k String str, @l BeduinTabStyle beduinTabStyle, @l BeduinContainerIndent beduinContainerIndent, @k List<BeduinTabberChild> list, @l List<? extends BeduinAction> list2, @l String str2, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.style = beduinTabStyle;
        this.tabPaddings = beduinContainerIndent;
        this.tabs = list;
        this.onTabClickedActions = list2;
        this.selectedTabId = str2;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinTabberModel copy$default(BeduinTabberModel beduinTabberModel, String str, BeduinTabStyle beduinTabStyle, BeduinContainerIndent beduinContainerIndent, List list, List list2, String str2, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinTabberModel.id;
        }
        if ((i12 & 2) != 0) {
            beduinTabStyle = beduinTabberModel.style;
        }
        BeduinTabStyle beduinTabStyle2 = beduinTabStyle;
        if ((i12 & 4) != 0) {
            beduinContainerIndent = beduinTabberModel.tabPaddings;
        }
        BeduinContainerIndent beduinContainerIndent2 = beduinContainerIndent;
        if ((i12 & 8) != 0) {
            list = beduinTabberModel.tabs;
        }
        List list3 = list;
        if ((i12 & 16) != 0) {
            list2 = beduinTabberModel.onTabClickedActions;
        }
        List list4 = list2;
        if ((i12 & 32) != 0) {
            str2 = beduinTabberModel.selectedTabId;
        }
        String str3 = str2;
        if ((i12 & 64) != 0) {
            displayingPredicate = beduinTabberModel.displayingPredicate;
        }
        return beduinTabberModel.copy(str, beduinTabStyle2, beduinContainerIndent2, list3, list4, str3, displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof SelectedIdTransform ? copy$default(this, null, null, null, null, null, ((SelectedIdTransform) transform).getSelectedId(), null, 95, null) : transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 63, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final BeduinTabStyle getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinContainerIndent getTabPaddings() {
        return this.tabPaddings;
    }

    @k
    public final List<BeduinTabberChild> component4() {
        return this.tabs;
    }

    @l
    public final List<BeduinAction> component5() {
        return this.onTabClickedActions;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getSelectedTabId() {
        return this.selectedTabId;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinTabberModel copy(@k String id2, @l BeduinTabStyle style, @l BeduinContainerIndent tabPaddings, @k List<BeduinTabberChild> tabs, @l List<? extends BeduinAction> onTabClickedActions, @l String selectedTabId, @l DisplayingPredicate displayingPredicate) {
        return new BeduinTabberModel(id2, style, tabPaddings, tabs, onTabClickedActions, selectedTabId, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTabberModel)) {
            return false;
        }
        BeduinTabberModel beduinTabberModel = (BeduinTabberModel) other;
        return L.f(this.id, beduinTabberModel.id) && this.style == beduinTabberModel.style && L.f(this.tabPaddings, beduinTabberModel.tabPaddings) && L.f(this.tabs, beduinTabberModel.tabs) && L.f(this.onTabClickedActions, beduinTabberModel.onTabClickedActions) && L.f(this.selectedTabId, beduinTabberModel.selectedTabId) && L.f(this.displayingPredicate, beduinTabberModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102945c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @l
    public final List<BeduinAction> getOnTabClickedActions() {
        return this.onTabClickedActions;
    }

    @l
    public final String getSelectedTabId() {
        return this.selectedTabId;
    }

    public final int getSelectedTabIndex() {
        if (this.selectedTabId == null) {
            return 0;
        }
        Iterator<BeduinTabberChild> it = this.tabs.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (L.f(it.next().getId(), this.selectedTabId)) {
                break;
            }
            i12++;
        }
        if (i12 < 0) {
            return 0;
        }
        return i12;
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
    public final List<BeduinTabberChild> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        BeduinTabStyle beduinTabStyle = this.style;
        int iHashCode2 = (iHashCode + (beduinTabStyle == null ? 0 : beduinTabStyle.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.tabPaddings;
        int iE2 = H.e((iHashCode2 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31, 31, this.tabs);
        List<BeduinAction> list = this.onTabClickedActions;
        int iHashCode3 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.selectedTabId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode4 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinTabberModel(id=");
        sb2.append(this.id);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", tabPaddings=");
        sb2.append(this.tabPaddings);
        sb2.append(", tabs=");
        sb2.append(this.tabs);
        sb2.append(", onTabClickedActions=");
        sb2.append(this.onTabClickedActions);
        sb2.append(", selectedTabId=");
        sb2.append(this.selectedTabId);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        BeduinTabStyle beduinTabStyle = this.style;
        if (beduinTabStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinTabStyle.name());
        }
        BeduinContainerIndent beduinContainerIndent = this.tabPaddings;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.tabs, parcel);
        while (itJ.hasNext()) {
            ((BeduinTabberChild) itJ.next()).writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onTabClickedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.selectedTabId);
        parcel.writeParcelable(this.displayingPredicate, flags);
    }
}
