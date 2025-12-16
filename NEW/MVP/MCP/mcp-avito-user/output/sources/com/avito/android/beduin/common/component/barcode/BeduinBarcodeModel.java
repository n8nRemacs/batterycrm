package com.avito.android.beduin.common.component.barcode;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinBarcodeModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jz\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0015J\u0010\u0010'\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0015R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b;\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001dR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010B\u001a\u0004\bC\u0010#¨\u0006D"}, d2 = {"Lcom/avito/android/beduin/common/component/barcode/BeduinBarcodeModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "code", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "type", "", "width", "height", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;ILcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()I", "component8", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component9", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;ILcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)Lcom/avito/android/beduin/common/component/barcode/BeduinBarcodeModel;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getCode", "Ljava/util/List;", "getOnTapActions", "getType", "Ljava/lang/Integer;", "getWidth", "I", "getHeight", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinBarcodeModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinBarcodeModel> CREATOR = new a();

    @l
    private final BeduinContainerBackground background;

    @k
    private final String code;

    @l
    private final DisplayingPredicate displayingPredicate;
    private final int height;

    @k
    private final String id;

    @l
    private final List<BeduinAction> onTapActions;

    @l
    private final BeduinContainerIndent padding;

    @k
    private final String type;

    @l
    private final Integer width;

    /* compiled from: BeduinBarcodeModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinBarcodeModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinBarcodeModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinBarcodeModel.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinBarcodeModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinBarcodeModel(string, displayingPredicate, string2, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinContainerIndent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinBarcodeModel[] newArray(int i12) {
            return new BeduinBarcodeModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinBarcodeModel(@k String str, @l DisplayingPredicate displayingPredicate, @k String str2, @l List<? extends BeduinAction> list, @k String str3, @l Integer num, int i12, @l BeduinContainerBackground beduinContainerBackground, @l BeduinContainerIndent beduinContainerIndent) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.code = str2;
        this.onTapActions = list;
        this.type = str3;
        this.width = num;
        this.height = i12;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
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
    public final String getCode() {
        return this.code;
    }

    @l
    public final List<BeduinAction> component4() {
        return this.onTapActions;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @k
    public final BeduinBarcodeModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k String code, @l List<? extends BeduinAction> onTapActions, @k String type, @l Integer width, int height, @l BeduinContainerBackground background, @l BeduinContainerIndent padding) {
        return new BeduinBarcodeModel(id2, displayingPredicate, code, onTapActions, type, width, height, background, padding);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinBarcodeModel)) {
            return false;
        }
        BeduinBarcodeModel beduinBarcodeModel = (BeduinBarcodeModel) other;
        return L.f(this.id, beduinBarcodeModel.id) && L.f(this.displayingPredicate, beduinBarcodeModel.displayingPredicate) && L.f(this.code, beduinBarcodeModel.code) && L.f(this.onTapActions, beduinBarcodeModel.onTapActions) && L.f(this.type, beduinBarcodeModel.type) && L.f(this.width, beduinBarcodeModel.width) && this.height == beduinBarcodeModel.height && L.f(this.background, beduinBarcodeModel.background) && L.f(this.padding, beduinBarcodeModel.padding);
    }

    @l
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @k
    public final String getCode() {
        return this.code;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @l
    public final List<BeduinAction> getOnTapActions() {
        return this.onTapActions;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @k
    public final String getType() {
        return this.type;
    }

    @l
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iD2 = H.d((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31, 31, this.code);
        List<BeduinAction> list = this.onTapActions;
        int iD3 = H.d((iD2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.type);
        Integer num = this.width;
        int iE2 = r.e(this.height, (iD3 + (num == null ? 0 : num.hashCode())) * 31, 31);
        BeduinContainerBackground beduinContainerBackground = this.background;
        int iHashCode2 = (iE2 + (beduinContainerBackground == null ? 0 : beduinContainerBackground.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        return iHashCode2 + (beduinContainerIndent != null ? beduinContainerIndent.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinBarcodeModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", code=" + this.code + ", onTapActions=" + this.onTapActions + ", type=" + this.type + ", width=" + this.width + ", height=" + this.height + ", background=" + this.background + ", padding=" + this.padding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.code);
        List<BeduinAction> list = this.onTapActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.type);
        Integer num = this.width;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.height);
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
    }
}
