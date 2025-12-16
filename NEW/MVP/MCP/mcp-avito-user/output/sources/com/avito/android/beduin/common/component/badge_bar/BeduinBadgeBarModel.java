package com.avito.android.beduin.common.component.badge_bar;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.BadgeBarExpandTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
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

/* compiled from: BeduinBadgeBarModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b%\u0010&Jv\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u0010+J \u00105\u001a\u0002042\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\b\b\u0010\u001fR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010#R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bA\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010&¨\u0006D"}, d2 = {"Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "", "preloadCount", "expandTitle", "", "isExpanded", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onExpandActions", "Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;", "itemStyle", "Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItem;", "items", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Z", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;", "component7", "component8", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getPreloadCount", "getExpandTitle", "Z", "Ljava/util/List;", "getOnExpandActions", "Lcom/avito/android/beduin/common/component/badge_bar/BeduinBadgeBarItemStyle;", "getItemStyle", "getItems", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinBadgeBarModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinBadgeBarModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final String expandTitle;

    @k
    private final String id;
    private final boolean isExpanded;

    @l
    private final BeduinBadgeBarItemStyle itemStyle;

    @k
    private final List<BeduinBadgeBarItem> items;

    @l
    private final List<BeduinAction> onExpandActions;

    @l
    private final Integer preloadCount;

    /* compiled from: BeduinBadgeBarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinBadgeBarModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinBadgeBarModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinBadgeBarModel.class, parcel, arrayList, iL2, 1);
                }
            }
            BeduinBadgeBarItemStyle beduinBadgeBarItemStyleCreateFromParcel = parcel.readInt() != 0 ? BeduinBadgeBarItemStyle.CREATOR.createFromParcel(parcel) : null;
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(BeduinBadgeBarItem.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new BeduinBadgeBarModel(string, numValueOf, string2, z12, arrayList, beduinBadgeBarItemStyleCreateFromParcel, arrayList2, (DisplayingPredicate) parcel.readParcelable(BeduinBadgeBarModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinBadgeBarModel[] newArray(int i12) {
            return new BeduinBadgeBarModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinBadgeBarModel(@k String str, @l Integer num, @l String str2, boolean z12, @l List<? extends BeduinAction> list, @l BeduinBadgeBarItemStyle beduinBadgeBarItemStyle, @k List<BeduinBadgeBarItem> list2, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.preloadCount = num;
        this.expandTitle = str2;
        this.isExpanded = z12;
        this.onExpandActions = list;
        this.itemStyle = beduinBadgeBarItemStyle;
        this.items = list2;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinBadgeBarModel copy$default(BeduinBadgeBarModel beduinBadgeBarModel, String str, Integer num, String str2, boolean z12, List list, BeduinBadgeBarItemStyle beduinBadgeBarItemStyle, List list2, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        return beduinBadgeBarModel.copy((i12 & 1) != 0 ? beduinBadgeBarModel.id : str, (i12 & 2) != 0 ? beduinBadgeBarModel.preloadCount : num, (i12 & 4) != 0 ? beduinBadgeBarModel.expandTitle : str2, (i12 & 8) != 0 ? beduinBadgeBarModel.isExpanded : z12, (i12 & 16) != 0 ? beduinBadgeBarModel.onExpandActions : list, (i12 & 32) != 0 ? beduinBadgeBarModel.itemStyle : beduinBadgeBarItemStyle, (i12 & 64) != 0 ? beduinBadgeBarModel.items : list2, (i12 & 128) != 0 ? beduinBadgeBarModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof BadgeBarExpandTransform ? copy$default(this, null, null, null, ((BadgeBarExpandTransform) transform).f103377b, null, null, null, null, 247, null) : transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, false, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 127, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getPreloadCount() {
        return this.preloadCount;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getExpandTitle() {
        return this.expandTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @l
    public final List<BeduinAction> component5() {
        return this.onExpandActions;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinBadgeBarItemStyle getItemStyle() {
        return this.itemStyle;
    }

    @k
    public final List<BeduinBadgeBarItem> component7() {
        return this.items;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinBadgeBarModel copy(@k String id2, @l Integer preloadCount, @l String expandTitle, boolean isExpanded, @l List<? extends BeduinAction> onExpandActions, @l BeduinBadgeBarItemStyle itemStyle, @k List<BeduinBadgeBarItem> items, @l DisplayingPredicate displayingPredicate) {
        return new BeduinBadgeBarModel(id2, preloadCount, expandTitle, isExpanded, onExpandActions, itemStyle, items, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinBadgeBarModel)) {
            return false;
        }
        BeduinBadgeBarModel beduinBadgeBarModel = (BeduinBadgeBarModel) other;
        return L.f(this.id, beduinBadgeBarModel.id) && L.f(this.preloadCount, beduinBadgeBarModel.preloadCount) && L.f(this.expandTitle, beduinBadgeBarModel.expandTitle) && this.isExpanded == beduinBadgeBarModel.isExpanded && L.f(this.onExpandActions, beduinBadgeBarModel.onExpandActions) && L.f(this.itemStyle, beduinBadgeBarModel.itemStyle) && L.f(this.items, beduinBadgeBarModel.items) && L.f(this.displayingPredicate, beduinBadgeBarModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final String getExpandTitle() {
        return this.expandTitle;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final BeduinBadgeBarItemStyle getItemStyle() {
        return this.itemStyle;
    }

    @k
    public final List<BeduinBadgeBarItem> getItems() {
        return this.items;
    }

    @l
    public final List<BeduinAction> getOnExpandActions() {
        return this.onExpandActions;
    }

    @l
    public final Integer getPreloadCount() {
        return this.preloadCount;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Integer num = this.preloadCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.expandTitle;
        int i12 = r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isExpanded);
        List<BeduinAction> list = this.onExpandActions;
        int iHashCode3 = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        BeduinBadgeBarItemStyle beduinBadgeBarItemStyle = this.itemStyle;
        int iE2 = H.e((iHashCode3 + (beduinBadgeBarItemStyle == null ? 0 : beduinBadgeBarItemStyle.hashCode())) * 31, 31, this.items);
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iE2 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinBadgeBarModel(id=");
        sb2.append(this.id);
        sb2.append(", preloadCount=");
        sb2.append(this.preloadCount);
        sb2.append(", expandTitle=");
        sb2.append(this.expandTitle);
        sb2.append(", isExpanded=");
        sb2.append(this.isExpanded);
        sb2.append(", onExpandActions=");
        sb2.append(this.onExpandActions);
        sb2.append(", itemStyle=");
        sb2.append(this.itemStyle);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Integer num = this.preloadCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.expandTitle);
        parcel.writeInt(this.isExpanded ? 1 : 0);
        List<BeduinAction> list = this.onExpandActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        BeduinBadgeBarItemStyle beduinBadgeBarItemStyle = this.itemStyle;
        if (beduinBadgeBarItemStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinBadgeBarItemStyle.writeToParcel(parcel, flags);
        }
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((BeduinBadgeBarItem) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
    }
}
