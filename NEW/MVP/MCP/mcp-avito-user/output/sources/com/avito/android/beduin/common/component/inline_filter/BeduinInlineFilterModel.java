package com.avito.android.beduin.common.component.inline_filter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.FiltersTransform;
import com.avito.android.beduin.common.form.transforms.ResetFiltersValuesTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: BeduinInlineFilterModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b#\u0010$Jl\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u0010)J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001bR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001dR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b<\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010$¨\u0006C"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/BeduinInlineFilterModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/remote/model/search/Filter;", "filters", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "", "itemsSpacing", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "component5", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component6", "()Ljava/lang/Integer;", "component7", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)Lcom/avito/android/beduin/common/component/inline_filter/BeduinInlineFilterModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getActions", "getFilters", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "Ljava/lang/Integer;", "getItemsSpacing", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinInlineFilterModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinInlineFilterModel> CREATOR = new a();

    @com.google.gson.annotations.c("actions")
    @l
    private final List<BeduinAction> actions;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("filters")
    @k
    private final List<Filter> filters;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("itemsSpacing")
    @l
    private final Integer itemsSpacing;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final BeduinContainerIndent padding;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinInlineFilterModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinInlineFilterModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinInlineFilterModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinInlineFilterModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinInlineFilterModel.class, parcel, arrayList2, iL3, 1);
                }
                arrayList = arrayList2;
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinInlineFilterModel.class, parcel, arrayList3, iL2, 1);
            }
            return new BeduinInlineFilterModel(string, displayingPredicate, arrayList, arrayList3, parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinInlineFilterModel[] newArray(int i12) {
            return new BeduinInlineFilterModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinInlineFilterModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @k List<Filter> list2, @l BeduinContainerIndent beduinContainerIndent, @l Integer num, @l BeduinComponentTheme beduinComponentTheme) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.actions = list;
        this.filters = list2;
        this.padding = beduinContainerIndent;
        this.itemsSpacing = num;
        this.theme = beduinComponentTheme;
    }

    public static /* synthetic */ BeduinInlineFilterModel copy$default(BeduinInlineFilterModel beduinInlineFilterModel, String str, DisplayingPredicate displayingPredicate, List list, List list2, BeduinContainerIndent beduinContainerIndent, Integer num, BeduinComponentTheme beduinComponentTheme, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinInlineFilterModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinInlineFilterModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            list = beduinInlineFilterModel.actions;
        }
        List list3 = list;
        if ((i12 & 8) != 0) {
            list2 = beduinInlineFilterModel.filters;
        }
        List list4 = list2;
        if ((i12 & 16) != 0) {
            beduinContainerIndent = beduinInlineFilterModel.padding;
        }
        BeduinContainerIndent beduinContainerIndent2 = beduinContainerIndent;
        if ((i12 & 32) != 0) {
            num = beduinInlineFilterModel.itemsSpacing;
        }
        Integer num2 = num;
        if ((i12 & 64) != 0) {
            beduinComponentTheme = beduinInlineFilterModel.theme;
        }
        return beduinInlineFilterModel.copy(str, displayingPredicate2, list3, list4, beduinContainerIndent2, num2, beduinComponentTheme);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        BeduinInlineFilterModel beduinInlineFilterModelCopy$default;
        if (transform instanceof DisplayPredicateTransform) {
            beduinInlineFilterModelCopy$default = copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, 125, null);
        } else {
            if (!(transform instanceof FiltersTransform)) {
                if (!(transform instanceof ResetFiltersValuesTransform)) {
                    return this;
                }
                List<Filter> list = this.filters;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                for (Filter filter : list) {
                    arrayList.add(filter.copy((65279 & 1) != 0 ? filter.attrId : null, (65279 & 2) != 0 ? filter.id : null, (65279 & 4) != 0 ? filter.widget : null, (65279 & 8) != 0 ? filter.payload : null, (65279 & 16) != 0 ? filter.title : null, (65279 & 32) != 0 ? filter.searchHint : null, (65279 & 64) != 0 ? filter.displayTitle : null, (65279 & 128) != 0 ? filter.isHighlighted : null, (65279 & 256) != 0 ? filter.value : null, (65279 & 512) != 0 ? filter.options : null, (65279 & 1024) != 0 ? filter.selectedOptions : null, (65279 & 2048) != 0 ? filter.filters : null, (65279 & 4096) != 0 ? filter.changedParamType : null, (65279 & 8192) != 0 ? filter.hasSuggest : null, (65279 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? filter.richTitle : null, (65279 & 32768) != 0 ? filter.resetAreaOnChange : false));
                }
                return copy$default(this, null, null, null, arrayList, null, null, null, 119, null);
            }
            beduinInlineFilterModelCopy$default = copy$default(this, null, null, null, ((FiltersTransform) transform).getFilters(), null, null, null, 119, null);
        }
        return beduinInlineFilterModelCopy$default;
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
    public final List<BeduinAction> component3() {
        return this.actions;
    }

    @k
    public final List<Filter> component4() {
        return this.filters;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getItemsSpacing() {
        return this.itemsSpacing;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final BeduinInlineFilterModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> actions, @k List<Filter> filters, @l BeduinContainerIndent padding, @l Integer itemsSpacing, @l BeduinComponentTheme theme) {
        return new BeduinInlineFilterModel(id2, displayingPredicate, actions, filters, padding, itemsSpacing, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinInlineFilterModel)) {
            return false;
        }
        BeduinInlineFilterModel beduinInlineFilterModel = (BeduinInlineFilterModel) other;
        return L.f(this.id, beduinInlineFilterModel.id) && L.f(this.displayingPredicate, beduinInlineFilterModel.displayingPredicate) && L.f(this.actions, beduinInlineFilterModel.actions) && L.f(this.filters, beduinInlineFilterModel.filters) && L.f(this.padding, beduinInlineFilterModel.padding) && L.f(this.itemsSpacing, beduinInlineFilterModel.itemsSpacing) && this.theme == beduinInlineFilterModel.theme;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final List<Filter> getFilters() {
        return this.filters;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final Integer getItemsSpacing() {
        return this.itemsSpacing;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iE2 = H.e((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.filters);
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode3 = (iE2 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        Integer num = this.itemsSpacing;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode4 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinInlineFilterModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", actions=" + this.actions + ", filters=" + this.filters + ", padding=" + this.padding + ", itemsSpacing=" + this.itemsSpacing + ", theme=" + this.theme + ')';
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
        Iterator itJ = C0.j(this.filters, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        Integer num = this.itemsSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
    }
}
