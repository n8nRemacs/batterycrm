package com.avito.android.beduin.common.component.select_address;

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
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSelectAddressModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0092\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b1\u0010,J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b6\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00108\u001a\u0004\b<\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00108\u001a\u0004\b=\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b>\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b?\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010$R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bE\u0010&R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bF\u0010&¨\u0006G"}, d2 = {"Lcom/avito/android/beduin/common/component/select_address/BeduinSelectAddressModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, AddressParameter.TYPE, "details", ChannelContext.Item.PLACEHOLDER, "", "showClearButton", "", "maximumLinesNumber", "", "Lcom/avito/android/beduin/network/model/Constraint;", "constraints", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin/common/component/select_address/BeduinSelectAddressModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "()Ljava/lang/Integer;", "component9", "()Ljava/util/List;", "component10", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/beduin/common/component/select_address/BeduinSelectAddressModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getStyle", "getAddress", "getDetails", "getPlaceholder", "Ljava/lang/Boolean;", "getShowClearButton", "Ljava/lang/Integer;", "getMaximumLinesNumber", "Ljava/util/List;", "getConstraints", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSelectAddressModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSelectAddressModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final String address;

    @l
    private final List<Constraint> constraints;

    @l
    private final String details;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final Integer maximumLinesNumber;

    @l
    private final String placeholder;

    @l
    private final Boolean showClearButton;

    @l
    private final String style;

    /* compiled from: BeduinSelectAddressModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSelectAddressModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSelectAddressModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinSelectAddressModel.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinSelectAddressModel.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSelectAddressModel.class, parcel, arrayList3, iL2, 1);
                }
                arrayList2 = arrayList3;
            }
            return new BeduinSelectAddressModel(string, displayingPredicate, string2, string3, string4, string5, boolValueOf, numValueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSelectAddressModel[] newArray(int i12) {
            return new BeduinSelectAddressModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSelectAddressModel(@k String str, @l DisplayingPredicate displayingPredicate, @l String str2, @l String str3, @l String str4, @l String str5, @l Boolean bool, @l Integer num, @l List<? extends Constraint> list, @l List<? extends BeduinAction> list2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.style = str2;
        this.address = str3;
        this.details = str4;
        this.placeholder = str5;
        this.showClearButton = bool;
        this.maximumLinesNumber = num;
        this.constraints = list;
        this.actions = list2;
    }

    public static /* synthetic */ BeduinSelectAddressModel copy$default(BeduinSelectAddressModel beduinSelectAddressModel, String str, DisplayingPredicate displayingPredicate, String str2, String str3, String str4, String str5, Boolean bool, Integer num, List list, List list2, int i12, Object obj) {
        return beduinSelectAddressModel.copy((i12 & 1) != 0 ? beduinSelectAddressModel.id : str, (i12 & 2) != 0 ? beduinSelectAddressModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinSelectAddressModel.style : str2, (i12 & 8) != 0 ? beduinSelectAddressModel.address : str3, (i12 & 16) != 0 ? beduinSelectAddressModel.details : str4, (i12 & 32) != 0 ? beduinSelectAddressModel.placeholder : str5, (i12 & 64) != 0 ? beduinSelectAddressModel.showClearButton : bool, (i12 & 128) != 0 ? beduinSelectAddressModel.maximumLinesNumber : num, (i12 & 256) != 0 ? beduinSelectAddressModel.constraints : list, (i12 & 512) != 0 ? beduinSelectAddressModel.actions : list2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<BeduinAction> component10() {
        return this.actions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getShowClearButton() {
        return this.showClearButton;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Integer getMaximumLinesNumber() {
        return this.maximumLinesNumber;
    }

    @l
    public final List<Constraint> component9() {
        return this.constraints;
    }

    @k
    public final BeduinSelectAddressModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l String style, @l String address, @l String details, @l String placeholder, @l Boolean showClearButton, @l Integer maximumLinesNumber, @l List<? extends Constraint> constraints, @l List<? extends BeduinAction> actions) {
        return new BeduinSelectAddressModel(id2, displayingPredicate, style, address, details, placeholder, showClearButton, maximumLinesNumber, constraints, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSelectAddressModel)) {
            return false;
        }
        BeduinSelectAddressModel beduinSelectAddressModel = (BeduinSelectAddressModel) other;
        return L.f(this.id, beduinSelectAddressModel.id) && L.f(this.displayingPredicate, beduinSelectAddressModel.displayingPredicate) && L.f(this.style, beduinSelectAddressModel.style) && L.f(this.address, beduinSelectAddressModel.address) && L.f(this.details, beduinSelectAddressModel.details) && L.f(this.placeholder, beduinSelectAddressModel.placeholder) && L.f(this.showClearButton, beduinSelectAddressModel.showClearButton) && L.f(this.maximumLinesNumber, beduinSelectAddressModel.maximumLinesNumber) && L.f(this.constraints, beduinSelectAddressModel.constraints) && L.f(this.actions, beduinSelectAddressModel.actions);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @l
    public final List<Constraint> getConstraints() {
        return this.constraints;
    }

    @l
    public final String getDetails() {
        return this.details;
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
    public final Integer getMaximumLinesNumber() {
        return this.maximumLinesNumber;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final Boolean getShowClearButton() {
        return this.showClearButton;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        String str = this.style;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.details;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.showClearButton;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.maximumLinesNumber;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.actions;
        return iHashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSelectAddressModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", showClearButton=");
        sb2.append(this.showClearButton);
        sb2.append(", maximumLinesNumber=");
        sb2.append(this.maximumLinesNumber);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.style);
        parcel.writeString(this.address);
        parcel.writeString(this.details);
        parcel.writeString(this.placeholder);
        Boolean bool = this.showClearButton;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num = this.maximumLinesNumber;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), flags);
        }
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinSelectAddressModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, 1021, null) : transform instanceof TextTransform ? copy$default(this, null, null, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, 1015, null) : this;
    }
}
