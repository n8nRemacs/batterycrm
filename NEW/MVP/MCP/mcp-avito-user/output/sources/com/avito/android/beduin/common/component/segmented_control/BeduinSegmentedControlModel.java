package com.avito.android.beduin.common.component.segmented_control;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.select_option.Option;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
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
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSegmentedControlModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"Jv\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020&HÖ\u0001¢\u0006\u0004\b-\u0010(J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020&HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b\u0005\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b7\u0010\u0018R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010\u001dR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b:\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b;\u0010\u0018R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b<\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b>\u0010\"¨\u0006?"}, d2 = {"Lcom/avito/android/beduin/common/component/segmented_control/BeduinSegmentedControlModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "", "isEnabled", "selectedId", "", "Lcom/avito/android/beduin/common/component/select_option/Option;", "options", "Lcom/avito/android/beduin_models/BeduinAction;", "onChangeSelectedActions", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "component8", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/segmented_control/BeduinSegmentedControlModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "getSelectedId", "Ljava/util/List;", "getOptions", "getOnChangeSelectedActions", "getTheme", "getStyle", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSegmentedControlModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSegmentedControlModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;

    @l
    private final List<BeduinAction> onChangeSelectedActions;

    @k
    private final List<Option> options;

    @l
    private final String selectedId;

    @k
    private final String style;

    @l
    private final String theme;

    /* compiled from: BeduinSegmentedControlModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSegmentedControlModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSegmentedControlModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            ArrayList arrayList = null;
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList2, iC2, 1);
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSegmentedControlModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinSegmentedControlModel(string, boolValueOf, string2, arrayList2, arrayList, parcel.readString(), parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinSegmentedControlModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSegmentedControlModel[] newArray(int i12) {
            return new BeduinSegmentedControlModel[i12];
        }
    }

    public /* synthetic */ BeduinSegmentedControlModel(String str, Boolean bool, String str2, List list, List list2, String str3, String str4, DisplayingPredicate displayingPredicate, int i12, C42822w c42822w) {
        this(str, bool, str2, list, list2, (i12 & 32) != 0 ? null : str3, str4, displayingPredicate);
    }

    public static /* synthetic */ BeduinSegmentedControlModel copy$default(BeduinSegmentedControlModel beduinSegmentedControlModel, String str, Boolean bool, String str2, List list, List list2, String str3, String str4, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        return beduinSegmentedControlModel.copy((i12 & 1) != 0 ? beduinSegmentedControlModel.id : str, (i12 & 2) != 0 ? beduinSegmentedControlModel.isEnabled : bool, (i12 & 4) != 0 ? beduinSegmentedControlModel.selectedId : str2, (i12 & 8) != 0 ? beduinSegmentedControlModel.options : list, (i12 & 16) != 0 ? beduinSegmentedControlModel.onChangeSelectedActions : list2, (i12 & 32) != 0 ? beduinSegmentedControlModel.theme : str3, (i12 & 64) != 0 ? beduinSegmentedControlModel.style : str4, (i12 & 128) != 0 ? beduinSegmentedControlModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 127, null) : transform instanceof SelectedIdTransform ? copy$default(this, null, null, ((SelectedIdTransform) transform).getSelectedId(), null, null, null, null, null, 251, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, null, null, 253, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSelectedId() {
        return this.selectedId;
    }

    @k
    public final List<Option> component4() {
        return this.options;
    }

    @l
    public final List<BeduinAction> component5() {
        return this.onChangeSelectedActions;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinSegmentedControlModel copy(@k String id2, @l Boolean isEnabled, @l String selectedId, @k List<Option> options, @l List<? extends BeduinAction> onChangeSelectedActions, @l String theme, @k String style, @l DisplayingPredicate displayingPredicate) {
        return new BeduinSegmentedControlModel(id2, isEnabled, selectedId, options, onChangeSelectedActions, theme, style, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSegmentedControlModel)) {
            return false;
        }
        BeduinSegmentedControlModel beduinSegmentedControlModel = (BeduinSegmentedControlModel) other;
        return L.f(this.id, beduinSegmentedControlModel.id) && L.f(this.isEnabled, beduinSegmentedControlModel.isEnabled) && L.f(this.selectedId, beduinSegmentedControlModel.selectedId) && L.f(this.options, beduinSegmentedControlModel.options) && L.f(this.onChangeSelectedActions, beduinSegmentedControlModel.onChangeSelectedActions) && L.f(this.theme, beduinSegmentedControlModel.theme) && L.f(this.style, beduinSegmentedControlModel.style) && L.f(this.displayingPredicate, beduinSegmentedControlModel.displayingPredicate);
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

    @l
    public final List<BeduinAction> getOnChangeSelectedActions() {
        return this.onChangeSelectedActions;
    }

    @k
    public final List<Option> getOptions() {
        return this.options;
    }

    @l
    public final String getSelectedId() {
        return this.selectedId;
    }

    @k
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Boolean bool = this.isEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.selectedId;
        int iE2 = H.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
        List<BeduinAction> list = this.onChangeSelectedActions;
        int iHashCode3 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.theme;
        int iD2 = H.d((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.style);
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iD2 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSegmentedControlModel(id=");
        sb2.append(this.id);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", selectedId=");
        sb2.append(this.selectedId);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", onChangeSelectedActions=");
        sb2.append(this.onChangeSelectedActions);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.selectedId);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onChangeSelectedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.theme);
        parcel.writeString(this.style);
        parcel.writeParcelable(this.displayingPredicate, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSegmentedControlModel(@k String str, @l Boolean bool, @l String str2, @k List<Option> list, @l List<? extends BeduinAction> list2, @l String str3, @k String str4, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.isEnabled = bool;
        this.selectedId = str2;
        this.options = list;
        this.onChangeSelectedActions = list2;
        this.theme = str3;
        this.style = str4;
        this.displayingPredicate = displayingPredicate;
    }
}
