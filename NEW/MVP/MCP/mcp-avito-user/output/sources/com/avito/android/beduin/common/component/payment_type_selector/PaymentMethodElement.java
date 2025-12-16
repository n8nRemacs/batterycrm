package com.avito.android.beduin.common.component.payment_type_selector;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPaymentMethodSelectorModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B^\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b!\u0010\"Ju\u0010#\u001a\u00020\u00002\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010'J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b0\u00101R(\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b\b\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010 R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010=\u001a\u0004\b>\u0010\"¨\u0006?"}, d2 = {"Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodElement;", "Landroid/os/Parcelable;", "", "", "", "LK51/e;", "paymentParameters", "", "isChosen", "", "customWidth", "title", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentBadgeModel;", "badge", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(Ljava/util/Map;ZLjava/lang/Integer;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentBadgeModel;Ljava/util/List;)V", "component1", "()Ljava/util/Map;", "component2", "()Z", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component6", "()Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentBadgeModel;", "component7", "()Ljava/util/List;", "copy", "(Ljava/util/Map;ZLjava/lang/Integer;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentBadgeModel;Ljava/util/List;)Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentMethodElement;", "toString", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "getPaymentParameters", "Z", "Ljava/lang/Integer;", "getCustomWidth", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/payment_type_selector/PaymentBadgeModel;", "getBadge", "Ljava/util/List;", "getOnTapActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PaymentMethodElement implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentMethodElement> CREATOR = new a();

    @l
    private final PaymentBadgeModel badge;

    @l
    private final IconBase64 base64Icon;

    @l
    private final Integer customWidth;
    private final boolean isChosen;

    @com.google.gson.annotations.c("onTapActions")
    @l
    private final List<BeduinAction> onTapActions;

    @k
    private final Map<String, Object> paymentParameters;

    @k
    private final String title;

    /* compiled from: BeduinPaymentMethodSelectorModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentMethodElement> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodElement createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = org.webrtc.h.c(PaymentMethodElement.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            boolean z12 = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            IconBase64 iconBase64CreateFromParcel = parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel);
            PaymentBadgeModel paymentBadgeModelCreateFromParcel = parcel.readInt() == 0 ? null : PaymentBadgeModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(PaymentMethodElement.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new PaymentMethodElement(linkedHashMap, z12, numValueOf, string, iconBase64CreateFromParcel, paymentBadgeModelCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethodElement[] newArray(int i12) {
            return new PaymentMethodElement[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodElement(@k Map<String, ? extends Object> map, boolean z12, @l Integer num, @k String str, @l IconBase64 iconBase64, @l PaymentBadgeModel paymentBadgeModel, @l List<? extends BeduinAction> list) {
        this.paymentParameters = map;
        this.isChosen = z12;
        this.customWidth = num;
        this.title = str;
        this.base64Icon = iconBase64;
        this.badge = paymentBadgeModel;
        this.onTapActions = list;
    }

    public static /* synthetic */ PaymentMethodElement copy$default(PaymentMethodElement paymentMethodElement, Map map, boolean z12, Integer num, String str, IconBase64 iconBase64, PaymentBadgeModel paymentBadgeModel, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            map = paymentMethodElement.paymentParameters;
        }
        if ((i12 & 2) != 0) {
            z12 = paymentMethodElement.isChosen;
        }
        boolean z13 = z12;
        if ((i12 & 4) != 0) {
            num = paymentMethodElement.customWidth;
        }
        Integer num2 = num;
        if ((i12 & 8) != 0) {
            str = paymentMethodElement.title;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            iconBase64 = paymentMethodElement.base64Icon;
        }
        IconBase64 iconBase642 = iconBase64;
        if ((i12 & 32) != 0) {
            paymentBadgeModel = paymentMethodElement.badge;
        }
        PaymentBadgeModel paymentBadgeModel2 = paymentBadgeModel;
        if ((i12 & 64) != 0) {
            list = paymentMethodElement.onTapActions;
        }
        return paymentMethodElement.copy(map, z13, num2, str2, iconBase642, paymentBadgeModel2, list);
    }

    @k
    public final Map<String, Object> component1() {
        return this.paymentParameters;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsChosen() {
        return this.isChosen;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getCustomWidth() {
        return this.customWidth;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final PaymentBadgeModel getBadge() {
        return this.badge;
    }

    @l
    public final List<BeduinAction> component7() {
        return this.onTapActions;
    }

    @k
    public final PaymentMethodElement copy(@k Map<String, ? extends Object> paymentParameters, boolean isChosen, @l Integer customWidth, @k String title, @l IconBase64 base64Icon, @l PaymentBadgeModel badge, @l List<? extends BeduinAction> onTapActions) {
        return new PaymentMethodElement(paymentParameters, isChosen, customWidth, title, base64Icon, badge, onTapActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentMethodElement)) {
            return false;
        }
        PaymentMethodElement paymentMethodElement = (PaymentMethodElement) other;
        return L.f(this.paymentParameters, paymentMethodElement.paymentParameters) && this.isChosen == paymentMethodElement.isChosen && L.f(this.customWidth, paymentMethodElement.customWidth) && L.f(this.title, paymentMethodElement.title) && L.f(this.base64Icon, paymentMethodElement.base64Icon) && L.f(this.badge, paymentMethodElement.badge) && L.f(this.onTapActions, paymentMethodElement.onTapActions);
    }

    @l
    public final PaymentBadgeModel getBadge() {
        return this.badge;
    }

    @l
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    public final Integer getCustomWidth() {
        return this.customWidth;
    }

    @l
    public final List<BeduinAction> getOnTapActions() {
        return this.onTapActions;
    }

    @k
    public final Map<String, Object> getPaymentParameters() {
        return this.paymentParameters;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i12 = r.i(this.paymentParameters.hashCode() * 31, 31, this.isChosen);
        Integer num = this.customWidth;
        int iD2 = H.d((i12 + (num == null ? 0 : num.hashCode())) * 31, 31, this.title);
        IconBase64 iconBase64 = this.base64Icon;
        int iHashCode = (iD2 + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
        PaymentBadgeModel paymentBadgeModel = this.badge;
        int iHashCode2 = (iHashCode + (paymentBadgeModel == null ? 0 : paymentBadgeModel.hashCode())) * 31;
        List<BeduinAction> list = this.onTapActions;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isChosen() {
        return this.isChosen;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentMethodElement(paymentParameters=");
        sb2.append(this.paymentParameters);
        sb2.append(", isChosen=");
        sb2.append(this.isChosen);
        sb2.append(", customWidth=");
        sb2.append(this.customWidth);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", base64Icon=");
        sb2.append(this.base64Icon);
        sb2.append(", badge=");
        sb2.append(this.badge);
        sb2.append(", onTapActions=");
        return H.p(sb2, this.onTapActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itI = C0.i(parcel, this.paymentParameters);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
        parcel.writeInt(this.isChosen ? 1 : 0);
        Integer num = this.customWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.title);
        IconBase64 iconBase64 = this.base64Icon;
        if (iconBase64 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconBase64.writeToParcel(parcel, flags);
        }
        PaymentBadgeModel paymentBadgeModel = this.badge;
        if (paymentBadgeModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentBadgeModel.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onTapActions;
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
