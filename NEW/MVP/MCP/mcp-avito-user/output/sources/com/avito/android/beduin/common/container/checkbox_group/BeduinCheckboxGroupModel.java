package com.avito.android.beduin.common.container.checkbox_group;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.CheckboxGroupTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdsTransform;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCheckboxGroupModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jf\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u00020\u00182\b\u00101\u001a\u0004\u0018\u000100HÖ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020-HÖ\u0001¢\u0006\u0004\b4\u0010/J \u00108\u001a\u00020\u001a2\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020-HÖ\u0001¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010!R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010#R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b>\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\b@\u0010&R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bA\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010)¨\u0006D"}, d2 = {"Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "", "id", "", "selectedIds", "Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupOption;", "options", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectedActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin/common/form/transforms/CheckboxGroupTransform;", "transform", "applyCheckboxGroupTransform", "(Lcom/avito/android/beduin/common/form/transforms/CheckboxGroupTransform;)Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupModel;", "Lkotlin/Function1;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component5", "component6", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/container/checkbox_group/BeduinCheckboxGroupModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getSelectedIds", "getOptions", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "getOnSelectedActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinCheckboxGroupModel implements BeduinModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinCheckboxGroupModel> CREATOR = new a();

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.k
    private final String id;

    @Y61.l
    private final List<BeduinAction> onSelectedActions;

    @Y61.k
    private final List<BeduinCheckboxGroupOption> options;

    @Y61.l
    private final List<String> selectedIds;

    @Y61.l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinCheckboxGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinCheckboxGroupModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCheckboxGroupModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BeduinCheckboxGroupOption.CREATOR, parcel, arrayList, iC2, 1);
            }
            ArrayList arrayList2 = null;
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinCheckboxGroupModel.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new BeduinCheckboxGroupModel(string, arrayListCreateStringArrayList, arrayList, beduinComponentThemeCreateFromParcel, arrayList2, (DisplayingPredicate) parcel.readParcelable(BeduinCheckboxGroupModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCheckboxGroupModel[] newArray(int i12) {
            return new BeduinCheckboxGroupModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinCheckboxGroupModel(@Y61.k String str, @Y61.l List<String> list, @Y61.k List<BeduinCheckboxGroupOption> list2, @Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.l List<? extends BeduinAction> list3, @Y61.l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.selectedIds = list;
        this.options = list2;
        this.theme = beduinComponentTheme;
        this.onSelectedActions = list3;
        this.displayingPredicate = displayingPredicate;
    }

    private final BeduinCheckboxGroupModel applyCheckboxGroupTransform(CheckboxGroupTransform transform) {
        Iterable iterable = this.selectedIds;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(iterable);
        boolean z12 = transform.f103383c;
        String str = transform.f103382b;
        if (z12) {
            linkedHashSetO0.add(str);
        } else {
            linkedHashSetO0.remove(str);
        }
        return copy$default(this, null, C42745f0.M0(linkedHashSetO0), null, null, null, null, 61, null);
    }

    public static /* synthetic */ BeduinCheckboxGroupModel copy$default(BeduinCheckboxGroupModel beduinCheckboxGroupModel, String str, List list, List list2, BeduinComponentTheme beduinComponentTheme, List list3, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinCheckboxGroupModel.id;
        }
        if ((i12 & 2) != 0) {
            list = beduinCheckboxGroupModel.selectedIds;
        }
        List list4 = list;
        if ((i12 & 4) != 0) {
            list2 = beduinCheckboxGroupModel.options;
        }
        List list5 = list2;
        if ((i12 & 8) != 0) {
            beduinComponentTheme = beduinCheckboxGroupModel.theme;
        }
        BeduinComponentTheme beduinComponentTheme2 = beduinComponentTheme;
        if ((i12 & 16) != 0) {
            list3 = beduinCheckboxGroupModel.onSelectedActions;
        }
        List list6 = list3;
        if ((i12 & 32) != 0) {
            displayingPredicate = beduinCheckboxGroupModel.displayingPredicate;
        }
        return beduinCheckboxGroupModel.copy(str, list4, list5, beduinComponentTheme2, list6, displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 31, null) : transform instanceof CheckboxGroupTransform ? applyCheckboxGroupTransform((CheckboxGroupTransform) transform) : transform instanceof SelectedIdsTransform ? copy$default(this, null, ((SelectedIdsTransform) transform).getSelectedIds(), null, null, null, null, 61, null) : this;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final List<String> component2() {
        return this.selectedIds;
    }

    @Y61.k
    public final List<BeduinCheckboxGroupOption> component3() {
        return this.options;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.l
    public final List<BeduinAction> component5() {
        return this.onSelectedActions;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.k
    public final BeduinCheckboxGroupModel copy(@Y61.k String id2, @Y61.l List<String> selectedIds, @Y61.k List<BeduinCheckboxGroupOption> options, @Y61.l BeduinComponentTheme theme, @Y61.l List<? extends BeduinAction> onSelectedActions, @Y61.l DisplayingPredicate displayingPredicate) {
        return new BeduinCheckboxGroupModel(id2, selectedIds, options, theme, onSelectedActions, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCheckboxGroupModel)) {
            return false;
        }
        BeduinCheckboxGroupModel beduinCheckboxGroupModel = (BeduinCheckboxGroupModel) other;
        return L.f(this.id, beduinCheckboxGroupModel.id) && L.f(this.selectedIds, beduinCheckboxGroupModel.selectedIds) && L.f(this.options, beduinCheckboxGroupModel.options) && this.theme == beduinCheckboxGroupModel.theme && L.f(this.onSelectedActions, beduinCheckboxGroupModel.onSelectedActions) && L.f(this.displayingPredicate, beduinCheckboxGroupModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public List<BeduinModel> flatMap(@Y61.k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        Parcelable parcelableCopy$default;
        List<BeduinCheckboxGroupOption> list = this.options;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            BeduinCheckboxGroupOption beduinCheckboxGroupOption = (BeduinCheckboxGroupOption) it.next();
            ArrayList arrayListC = C28809e.c(mapper, beduinCheckboxGroupOption.getContents());
            if (arrayListC.isEmpty()) {
                arrayListC = null;
            }
            parcelableCopy$default = arrayListC != null ? BeduinCheckboxGroupOption.copy$default(beduinCheckboxGroupOption, null, arrayListC, 1, null) : null;
            if (parcelableCopy$default != null) {
                arrayList.add(parcelableCopy$default);
            }
        }
        parcelableCopy$default = arrayList.equals(this.options) ? this : null;
        if (parcelableCopy$default == null) {
            parcelableCopy$default = copy$default(this, null, null, arrayList, null, null, null, 59, null);
        }
        return (List) mapper.invoke(parcelableCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@Y61.k Y41.l<? super BeduinModel, Boolean> action) {
        if (action.invoke(this).booleanValue()) {
            return;
        }
        Iterator<T> it = this.options.iterator();
        while (it.hasNext()) {
            C28809e.e(action, ((BeduinCheckboxGroupOption) it.next()).getContents());
        }
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @Y61.l
    public final List<BeduinAction> getOnSelectedActions() {
        return this.onSelectedActions;
    }

    @Y61.k
    public final List<BeduinCheckboxGroupOption> getOptions() {
        return this.options;
    }

    @Y61.l
    public final List<String> getSelectedIds() {
        return this.selectedIds;
    }

    @Y61.l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<String> list = this.selectedIds;
        int iE2 = H.e((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.options);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode2 = (iE2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        List<BeduinAction> list2 = this.onSelectedActions;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode3 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        return true;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCheckboxGroupModel(id=");
        sb2.append(this.id);
        sb2.append(", selectedIds=");
        sb2.append(this.selectedIds);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", onSelectedActions=");
        sb2.append(this.onSelectedActions);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeStringList(this.selectedIds);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((BeduinCheckboxGroupOption) itJ.next()).writeToParcel(parcel, flags);
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onSelectedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
    }

    public /* synthetic */ BeduinCheckboxGroupModel(String str, List list, List list2, BeduinComponentTheme beduinComponentTheme, List list3, DisplayingPredicate displayingPredicate, int i12, C42822w c42822w) {
        this(str, list, list2, beduinComponentTheme, (i12 & 16) != 0 ? null : list3, displayingPredicate);
    }
}
