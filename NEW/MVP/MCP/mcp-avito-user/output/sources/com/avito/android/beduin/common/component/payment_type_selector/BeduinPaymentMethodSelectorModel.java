package com.avito.android.beduin.common.component.payment_type_selector;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.SelectorPaymentMethodTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPaymentMethodSelectorModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%JZ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u0010*J \u00104\u001a\u0002032\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b\n\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b>\u0010#R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010%¨\u0006A"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/BeduinPaymentMethodSelectorModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodElement;", "options", "", "isEnabled", "Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodSelectorCustomPaddings;", "customPaddings", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodSelectorCustomPaddings;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)V", "", "selectedPosition", "processElements", "(I)Ljava/util/List;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "()Ljava/lang/Boolean;", "component5", "()Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodSelectorCustomPaddings;", "component6", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodSelectorCustomPaddings;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;)Lcom/avito/android/beduin/common/component/payment_type_selector/BeduinPaymentMethodSelectorModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getOptions", "Ljava/lang/Boolean;", "Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodSelectorCustomPaddings;", "getCustomPaddings", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinPaymentMethodSelectorModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinPaymentMethodSelectorModel> CREATOR = new a();

    @l
    private final PaymentMethodSelectorCustomPaddings customPaddings;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;

    @k
    private final List<PaymentMethodElement> options;

    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinPaymentMethodSelectorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinPaymentMethodSelectorModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPaymentMethodSelectorModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinPaymentMethodSelectorModel.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PaymentMethodElement.CREATOR, parcel, arrayList, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinPaymentMethodSelectorModel(string, displayingPredicate, arrayList, boolValueOf, parcel.readInt() == 0 ? null : PaymentMethodSelectorCustomPaddings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPaymentMethodSelectorModel[] newArray(int i12) {
            return new BeduinPaymentMethodSelectorModel[i12];
        }
    }

    public /* synthetic */ BeduinPaymentMethodSelectorModel(String str, DisplayingPredicate displayingPredicate, List list, Boolean bool, PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings, BeduinComponentTheme beduinComponentTheme, int i12, C42822w c42822w) {
        this(str, displayingPredicate, list, (i12 & 8) != 0 ? Boolean.TRUE : bool, paymentMethodSelectorCustomPaddings, (i12 & 32) != 0 ? null : beduinComponentTheme);
    }

    public static /* synthetic */ BeduinPaymentMethodSelectorModel copy$default(BeduinPaymentMethodSelectorModel beduinPaymentMethodSelectorModel, String str, DisplayingPredicate displayingPredicate, List list, Boolean bool, PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings, BeduinComponentTheme beduinComponentTheme, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinPaymentMethodSelectorModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinPaymentMethodSelectorModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            list = beduinPaymentMethodSelectorModel.options;
        }
        List list2 = list;
        if ((i12 & 8) != 0) {
            bool = beduinPaymentMethodSelectorModel.isEnabled;
        }
        Boolean bool2 = bool;
        if ((i12 & 16) != 0) {
            paymentMethodSelectorCustomPaddings = beduinPaymentMethodSelectorModel.customPaddings;
        }
        PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings2 = paymentMethodSelectorCustomPaddings;
        if ((i12 & 32) != 0) {
            beduinComponentTheme = beduinPaymentMethodSelectorModel.theme;
        }
        return beduinPaymentMethodSelectorModel.copy(str, displayingPredicate2, list2, bool2, paymentMethodSelectorCustomPaddings2, beduinComponentTheme);
    }

    private final List<PaymentMethodElement> processElements(int selectedPosition) {
        List<PaymentMethodElement> list = this.options;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList.add(PaymentMethodElement.copy$default((PaymentMethodElement) obj, null, i12 == selectedPosition, null, null, null, null, null, 125, null));
            i12 = i13;
        }
        return arrayList;
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, 61, null) : transform instanceof SelectorPaymentMethodTransform ? copy$default(this, null, null, processElements(((SelectorPaymentMethodTransform) transform).getSelectedPosition()), null, null, null, 59, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, 55, null) : this;
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
    public final List<PaymentMethodElement> component3() {
        return this.options;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final PaymentMethodSelectorCustomPaddings getCustomPaddings() {
        return this.customPaddings;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final BeduinPaymentMethodSelectorModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k List<PaymentMethodElement> options, @l Boolean isEnabled, @l PaymentMethodSelectorCustomPaddings customPaddings, @l BeduinComponentTheme theme) {
        return new BeduinPaymentMethodSelectorModel(id2, displayingPredicate, options, isEnabled, customPaddings, theme);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinPaymentMethodSelectorModel)) {
            return false;
        }
        BeduinPaymentMethodSelectorModel beduinPaymentMethodSelectorModel = (BeduinPaymentMethodSelectorModel) other;
        return L.f(this.id, beduinPaymentMethodSelectorModel.id) && L.f(this.displayingPredicate, beduinPaymentMethodSelectorModel.displayingPredicate) && L.f(this.options, beduinPaymentMethodSelectorModel.options) && L.f(this.isEnabled, beduinPaymentMethodSelectorModel.isEnabled) && L.f(this.customPaddings, beduinPaymentMethodSelectorModel.customPaddings) && this.theme == beduinPaymentMethodSelectorModel.theme;
    }

    @l
    public final PaymentMethodSelectorCustomPaddings getCustomPaddings() {
        return this.customPaddings;
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

    @k
    public final List<PaymentMethodElement> getOptions() {
        return this.options;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iE2 = H.e((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31, this.options);
        Boolean bool = this.isEnabled;
        int iHashCode2 = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
        PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings = this.customPaddings;
        int iHashCode3 = (iHashCode2 + (paymentMethodSelectorCustomPaddings == null ? 0 : paymentMethodSelectorCustomPaddings.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return iHashCode3 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @k
    public String toString() {
        return "BeduinPaymentMethodSelectorModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", options=" + this.options + ", isEnabled=" + this.isEnabled + ", customPaddings=" + this.customPaddings + ", theme=" + this.theme + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((PaymentMethodElement) itJ.next()).writeToParcel(parcel, flags);
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings = this.customPaddings;
        if (paymentMethodSelectorCustomPaddings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentMethodSelectorCustomPaddings.writeToParcel(parcel, flags);
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
    }

    public BeduinPaymentMethodSelectorModel(@k String str, @l DisplayingPredicate displayingPredicate, @k List<PaymentMethodElement> list, @l Boolean bool, @l PaymentMethodSelectorCustomPaddings paymentMethodSelectorCustomPaddings, @l BeduinComponentTheme beduinComponentTheme) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.options = list;
        this.isEnabled = bool;
        this.customPaddings = paymentMethodSelectorCustomPaddings;
        this.theme = beduinComponentTheme;
    }
}
