package com.avito.android.beduin.common.component.checkbox;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinCheckableModel;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.CheckboxStateTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCheckboxModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B_\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b,\u0010 Jx\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010 J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000200HÖ\u0001¢\u0006\u0004\b7\u00102J \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000200HÖ\u0001¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010B\u001a\u0004\bC\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010B\u001a\u0004\bD\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\b\r\u0010'R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\bJ\u0010 R\u0014\u0010K\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox/BeduinCheckboxModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/BeduinCheckableModel;", "Lcom/avito/android/beduin/common/component/g;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "onCheckedActions", "onUncheckedActions", "", "isEnabled", "Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", VoiceInfo.STATE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;)V", BeduinCartItemModel.CHECKED_STRING, "applyChecked", "(Z)Lcom/avito/android/beduin/common/component/BeduinCheckableModel;", "isSelected", "setSelected", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", "component7", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component8", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/checkbox/BeduinCheckboxModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getOnCheckedActions", "getOnUncheckedActions", "Ljava/lang/Boolean;", "Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", "getState", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "getStyle", "isChecked", "()Z", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCheckboxModel extends LeafBeduinModel implements BeduinCheckableModel, com.avito.android.beduin.common.component.g {

    @k
    public static final Parcelable.Creator<BeduinCheckboxModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;

    @l
    private final List<BeduinAction> onCheckedActions;

    @l
    private final List<BeduinAction> onUncheckedActions;

    @k
    private final CheckboxState state;

    @l
    private final String style;

    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinCheckboxModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinCheckboxModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCheckboxModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinCheckboxModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinCheckboxModel.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinCheckboxModel.class, parcel, arrayList2, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinCheckboxModel(string, displayingPredicate, arrayList, arrayList2, boolValueOf, CheckboxState.valueOf(parcel.readString()), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCheckboxModel[] newArray(int i12) {
            return new BeduinCheckboxModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinCheckboxModel(@k String str, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, @l Boolean bool, @k CheckboxState checkboxState, @l BeduinComponentTheme beduinComponentTheme, @l String str2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.onCheckedActions = list;
        this.onUncheckedActions = list2;
        this.isEnabled = bool;
        this.state = checkboxState;
        this.theme = beduinComponentTheme;
        this.style = str2;
    }

    public static /* synthetic */ BeduinCheckboxModel copy$default(BeduinCheckboxModel beduinCheckboxModel, String str, DisplayingPredicate displayingPredicate, List list, List list2, Boolean bool, CheckboxState checkboxState, BeduinComponentTheme beduinComponentTheme, String str2, int i12, Object obj) {
        return beduinCheckboxModel.copy((i12 & 1) != 0 ? beduinCheckboxModel.id : str, (i12 & 2) != 0 ? beduinCheckboxModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinCheckboxModel.onCheckedActions : list, (i12 & 8) != 0 ? beduinCheckboxModel.onUncheckedActions : list2, (i12 & 16) != 0 ? beduinCheckboxModel.isEnabled : bool, (i12 & 32) != 0 ? beduinCheckboxModel.state : checkboxState, (i12 & 64) != 0 ? beduinCheckboxModel.theme : beduinComponentTheme, (i12 & 128) != 0 ? beduinCheckboxModel.style : str2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, 253, null) : transform instanceof CheckboxStateTransform ? copy$default(this, null, null, null, null, null, ((CheckboxStateTransform) transform).getState(), null, null, 223, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, 239, null) : this;
    }

    @Override // com.avito.android.beduin.common.component.BeduinCheckableModel
    @k
    public BeduinCheckableModel applyChecked(boolean checked) {
        return copy$default(this, null, null, null, null, null, checked ? CheckboxState.CHECKED : CheckboxState.UNCHECKED, null, null, 223, null);
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
        return this.onCheckedActions;
    }

    @l
    public final List<BeduinAction> component4() {
        return this.onUncheckedActions;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final CheckboxState getState() {
        return this.state;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    public final BeduinCheckboxModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l List<? extends BeduinAction> onCheckedActions, @l List<? extends BeduinAction> onUncheckedActions, @l Boolean isEnabled, @k CheckboxState state, @l BeduinComponentTheme theme, @l String style) {
        return new BeduinCheckboxModel(id2, displayingPredicate, onCheckedActions, onUncheckedActions, isEnabled, state, theme, style);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCheckboxModel)) {
            return false;
        }
        BeduinCheckboxModel beduinCheckboxModel = (BeduinCheckboxModel) other;
        return L.f(this.id, beduinCheckboxModel.id) && L.f(this.displayingPredicate, beduinCheckboxModel.displayingPredicate) && L.f(this.onCheckedActions, beduinCheckboxModel.onCheckedActions) && L.f(this.onUncheckedActions, beduinCheckboxModel.onUncheckedActions) && L.f(this.isEnabled, beduinCheckboxModel.isEnabled) && this.state == beduinCheckboxModel.state && this.theme == beduinCheckboxModel.theme && L.f(this.style, beduinCheckboxModel.style);
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
    public final List<BeduinAction> getOnCheckedActions() {
        return this.onCheckedActions;
    }

    @l
    public final List<BeduinAction> getOnUncheckedActions() {
        return this.onUncheckedActions;
    }

    @k
    public final CheckboxState getState() {
        return this.state;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.onCheckedActions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onUncheckedActions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode5 = (this.state.hashCode() + ((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode6 = (iHashCode5 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        String str = this.style;
        return iHashCode6 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.BeduinCheckableModel
    public boolean isChecked() {
        return this.state == CheckboxState.CHECKED;
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCheckboxModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", onCheckedActions=");
        sb2.append(this.onCheckedActions);
        sb2.append(", onUncheckedActions=");
        sb2.append(this.onUncheckedActions);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", state=");
        sb2.append(this.state);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        return C22026a.c(sb2, this.style, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinAction> list = this.onCheckedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onUncheckedActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.state.name());
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.style);
    }

    @Override // com.avito.android.beduin.common.component.g
    @k
    public BeduinCheckableModel setSelected(boolean isSelected) {
        return copy$default(this, null, null, null, null, null, isSelected ? CheckboxState.CHECKED : CheckboxState.UNCHECKED, null, null, 223, null);
    }
}
