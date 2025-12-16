package com.avito.android.beduin.common.component.vehicle_number;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.input.k;
import com.avito.android.beduin.common.component.q;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.category_parameters.MaskInfo;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinVehicleNumberModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u0019Jl\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b$\u0010\u0019J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b5\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b8\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010\u0019R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001fR\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b<\u0010\u001fR*\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u000e\u00104\u0012\u0004\b@\u0010A\u001a\u0004\b=\u0010\u0019\"\u0004\b>\u0010?R*\u0010B\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bB\u00104\u0012\u0004\bE\u0010A\u001a\u0004\bC\u0010\u0019\"\u0004\bD\u0010?R\u0014\u0010F\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/avito/android/beduin/common/component/vehicle_number/BeduinVehicleNumberModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "text", "separatorPattern", "", "Lcom/avito/android/remote/model/category_parameters/MaskInfo;", "masks", "Lcom/avito/android/beduin/network/model/Constraint;", "constraints", "errorMessage", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Lcom/avito/android/beduin_models/BeduinModel;", "validateModelByConstraints", "()Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/beduin/common/component/vehicle_number/BeduinVehicleNumberModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getText", "getSeparatorPattern", "Ljava/util/List;", "getMasks", "getConstraints", "getErrorMessage", "setErrorMessage", "(Ljava/lang/String;)V", "getErrorMessage$annotations", "()V", "value", "getValue", "setValue", "getValue$annotations", "isValid", "()Z", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinVehicleNumberModel extends LeafBeduinModel implements q {

    @Y61.k
    public static final Parcelable.Creator<BeduinVehicleNumberModel> CREATOR = new a();

    @Y61.l
    private final List<Constraint> constraints;

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.l
    private String errorMessage;

    @Y61.k
    private final String id;

    @Y61.l
    private final List<MaskInfo> masks;

    @Y61.k
    private final String separatorPattern;

    @Y61.l
    private final String text;

    @Y61.l
    private String value;

    /* compiled from: BeduinVehicleNumberModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinVehicleNumberModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinVehicleNumberModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinVehicleNumberModel.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinVehicleNumberModel.class, parcel, arrayList3, iL3, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinVehicleNumberModel.class, parcel, arrayList4, iL2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new BeduinVehicleNumberModel(string, displayingPredicate, string2, string3, arrayList, arrayList2, null, 64, null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinVehicleNumberModel[] newArray(int i12) {
            return new BeduinVehicleNumberModel[i12];
        }
    }

    public /* synthetic */ BeduinVehicleNumberModel(String str, DisplayingPredicate displayingPredicate, String str2, String str3, List list, List list2, String str4, int i12, C42822w c42822w) {
        this(str, displayingPredicate, str2, str3, list, list2, (i12 & 64) != 0 ? null : str4);
    }

    public static /* synthetic */ BeduinVehicleNumberModel copy$default(BeduinVehicleNumberModel beduinVehicleNumberModel, String str, DisplayingPredicate displayingPredicate, String str2, String str3, List list, List list2, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinVehicleNumberModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinVehicleNumberModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            str2 = beduinVehicleNumberModel.text;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            str3 = beduinVehicleNumberModel.separatorPattern;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            list = beduinVehicleNumberModel.masks;
        }
        List list3 = list;
        if ((i12 & 32) != 0) {
            list2 = beduinVehicleNumberModel.constraints;
        }
        List list4 = list2;
        if ((i12 & 64) != 0) {
            str4 = beduinVehicleNumberModel.errorMessage;
        }
        return beduinVehicleNumberModel.copy(str, displayingPredicate2, str5, str6, list3, list4, str4);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, 125, null);
        }
        if (transform instanceof TextTransform) {
            return copy$default(this, null, null, ((TextTransform) transform).getText(), null, null, null, null, 123, null);
        }
        if (!(transform instanceof ErrorMessageTransform)) {
            return this;
        }
        BeduinVehicleNumberModel beduinVehicleNumberModelCopy$default = copy$default(this, null, null, null, null, null, null, null, 127, null);
        beduinVehicleNumberModelCopy$default.errorMessage = ((ErrorMessageTransform) transform).getErrorMessage();
        return beduinVehicleNumberModelCopy$default;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final String getSeparatorPattern() {
        return this.separatorPattern;
    }

    @Y61.l
    public final List<MaskInfo> component5() {
        return this.masks;
    }

    @Y61.l
    public final List<Constraint> component6() {
        return this.constraints;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Y61.k
    public final BeduinVehicleNumberModel copy(@Y61.k String id2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l String text, @Y61.k String separatorPattern, @Y61.l List<MaskInfo> masks, @Y61.l List<? extends Constraint> constraints, @Y61.l String errorMessage) {
        return new BeduinVehicleNumberModel(id2, displayingPredicate, text, separatorPattern, masks, constraints, errorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinVehicleNumberModel)) {
            return false;
        }
        BeduinVehicleNumberModel beduinVehicleNumberModel = (BeduinVehicleNumberModel) other;
        return L.f(this.id, beduinVehicleNumberModel.id) && L.f(this.displayingPredicate, beduinVehicleNumberModel.displayingPredicate) && L.f(this.text, beduinVehicleNumberModel.text) && L.f(this.separatorPattern, beduinVehicleNumberModel.separatorPattern) && L.f(this.masks, beduinVehicleNumberModel.masks) && L.f(this.constraints, beduinVehicleNumberModel.constraints) && L.f(this.errorMessage, beduinVehicleNumberModel.errorMessage);
    }

    @Y61.l
    public final List<Constraint> getConstraints() {
        return this.constraints;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @Y61.l
    public final List<MaskInfo> getMasks() {
        return this.masks;
    }

    @Y61.k
    public final String getSeparatorPattern() {
        return this.separatorPattern;
    }

    @Y61.l
    public final String getText() {
        return this.text;
    }

    @Y61.l
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        String str = this.text;
        int iD2 = H.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.separatorPattern);
        List<MaskInfo> list = this.masks;
        int iHashCode3 = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Constraint> list2 = this.constraints;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.errorMessage;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        String str;
        List<Constraint> list = this.constraints;
        String str2 = this.value;
        if (str2 == null) {
            str2 = "";
        }
        return L.f(com.avito.android.beduin.common.component.input.j.b(str2, null, list), k.b.f101561a) && ((str = this.errorMessage) == null || str.length() == 0);
    }

    public final void setErrorMessage(@Y61.l String str) {
        this.errorMessage = str;
    }

    public final void setValue(@Y61.l String str) {
        this.value = str;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinVehicleNumberModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", separatorPattern=");
        sb2.append(this.separatorPattern);
        sb2.append(", masks=");
        sb2.append(this.masks);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", errorMessage=");
        return C22026a.c(sb2, this.errorMessage, ')');
    }

    @Override // com.avito.android.beduin.common.component.q
    @Y61.k
    public BeduinModel validateModelByConstraints() {
        List<Constraint> list = this.constraints;
        String str = this.value;
        if (str == null) {
            str = "";
        }
        return copy$default(this, null, null, null, null, null, null, com.avito.android.beduin.common.component.input.j.a(com.avito.android.beduin.common.component.input.j.b(str, null, list)), 63, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.text);
        parcel.writeString(this.separatorPattern);
        List<MaskInfo> list = this.masks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<Constraint> list2 = this.constraints;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinVehicleNumberModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l String str2, @Y61.k String str3, @Y61.l List<MaskInfo> list, @Y61.l List<? extends Constraint> list2, @Y61.l String str4) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.text = str2;
        this.separatorPattern = str3;
        this.masks = list;
        this.constraints = list2;
        this.errorMessage = str4;
    }

    public static /* synthetic */ void getErrorMessage$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
