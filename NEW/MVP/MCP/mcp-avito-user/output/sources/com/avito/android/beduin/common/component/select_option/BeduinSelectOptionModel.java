package com.avito.android.beduin.common.component.select_option;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
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

/* compiled from: BeduinSelectOptionModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJh\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020$HÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020$HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u0017R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010\u001fR\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b=\u0010\u001f¨\u0006>"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/BeduinSelectOptionModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "title", "Lcom/avito/android/beduin/common/component/select_option/Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "selectedOptionId", "", "Lcom/avito/android/beduin/common/component/select_option/Option;", "options", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Lcom/avito/android/beduin/common/component/select_option/Style;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "()Lcom/avito/android/beduin/common/component/select_option/Style;", "component5", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Lcom/avito/android/beduin/common/component/select_option/Style;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/component/select_option/BeduinSelectOptionModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getTitle", "Lcom/avito/android/beduin/common/component/select_option/Style;", "getStyle", "getSelectedOptionId", "Ljava/util/List;", "getOptions", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSelectOptionModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSelectOptionModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @k
    private final List<Option> options;

    @k
    private final String selectedOptionId;

    @l
    private final Style style;

    @k
    private final String title;

    /* compiled from: BeduinSelectOptionModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSelectOptionModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSelectOptionModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinSelectOptionModel.class.getClassLoader());
            String string2 = parcel.readString();
            Style styleValueOf = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList2, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSelectOptionModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinSelectOptionModel(string, displayingPredicate, string2, styleValueOf, string3, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSelectOptionModel[] newArray(int i12) {
            return new BeduinSelectOptionModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSelectOptionModel(@k String str, @l DisplayingPredicate displayingPredicate, @k String str2, @l Style style, @k String str3, @k List<Option> list, @l List<? extends BeduinAction> list2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.title = str2;
        this.style = style;
        this.selectedOptionId = str3;
        this.options = list;
        this.actions = list2;
    }

    public static /* synthetic */ BeduinSelectOptionModel copy$default(BeduinSelectOptionModel beduinSelectOptionModel, String str, DisplayingPredicate displayingPredicate, String str2, Style style, String str3, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinSelectOptionModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinSelectOptionModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            str2 = beduinSelectOptionModel.title;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            style = beduinSelectOptionModel.style;
        }
        Style style2 = style;
        if ((i12 & 16) != 0) {
            str3 = beduinSelectOptionModel.selectedOptionId;
        }
        String str5 = str3;
        if ((i12 & 32) != 0) {
            list = beduinSelectOptionModel.options;
        }
        List list3 = list;
        if ((i12 & 64) != 0) {
            list2 = beduinSelectOptionModel.actions;
        }
        return beduinSelectOptionModel.copy(str, displayingPredicate2, str4, style2, str5, list3, list2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, 125, null) : transform instanceof SelectedIdTransform ? copy$default(this, null, null, null, null, ((SelectedIdTransform) transform).getSelectedId(), null, null, 111, null) : this;
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

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }

    @k
    public final List<Option> component6() {
        return this.options;
    }

    @l
    public final List<BeduinAction> component7() {
        return this.actions;
    }

    @k
    public final BeduinSelectOptionModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k String title, @l Style style, @k String selectedOptionId, @k List<Option> options, @l List<? extends BeduinAction> actions) {
        return new BeduinSelectOptionModel(id2, displayingPredicate, title, style, selectedOptionId, options, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSelectOptionModel)) {
            return false;
        }
        BeduinSelectOptionModel beduinSelectOptionModel = (BeduinSelectOptionModel) other;
        return L.f(this.id, beduinSelectOptionModel.id) && L.f(this.displayingPredicate, beduinSelectOptionModel.displayingPredicate) && L.f(this.title, beduinSelectOptionModel.title) && this.style == beduinSelectOptionModel.style && L.f(this.selectedOptionId, beduinSelectOptionModel.selectedOptionId) && L.f(this.options, beduinSelectOptionModel.options) && L.f(this.actions, beduinSelectOptionModel.actions);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @k
    public final List<Option> getOptions() {
        return this.options;
    }

    @k
    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iD2 = H.d((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31, this.title);
        Style style = this.style;
        int iE2 = H.e(H.d((iD2 + (style == null ? 0 : style.hashCode())) * 31, 31, this.selectedOptionId), 31, this.options);
        List<BeduinAction> list = this.actions;
        return iE2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSelectOptionModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", selectedOptionId=");
        sb2.append(this.selectedOptionId);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.title);
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
        parcel.writeString(this.selectedOptionId);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
