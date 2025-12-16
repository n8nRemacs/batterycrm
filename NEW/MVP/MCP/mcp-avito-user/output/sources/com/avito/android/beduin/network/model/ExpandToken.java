package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExpandToken.kt */
@d
@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\\\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\u0018R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u0010\u001a¨\u00067"}, d2 = {"Lcom/avito/android/beduin/network/model/ExpandToken;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "overridenAttributes", "tappedAttributes", "", "offsetFromText", "Lcom/avito/android/beduin/network/model/Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "onExpandActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;Lcom/avito/android/beduin/network/model/LabelTextAttributes;Ljava/lang/Integer;Lcom/avito/android/beduin/network/model/Style;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "component3", "component4", "()Ljava/lang/Integer;", "component5", "()Lcom/avito/android/beduin/network/model/Style;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/network/model/LabelTextAttributes;Lcom/avito/android/beduin/network/model/LabelTextAttributes;Ljava/lang/Integer;Lcom/avito/android/beduin/network/model/Style;Ljava/util/List;)Lcom/avito/android/beduin/network/model/ExpandToken;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/beduin/network/model/LabelTextAttributes;", "getOverridenAttributes", "getTappedAttributes", "Ljava/lang/Integer;", "getOffsetFromText", "Lcom/avito/android/beduin/network/model/Style;", "getStyle", "Ljava/util/List;", "getOnExpandActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ExpandToken implements Parcelable {

    @k
    public static final Parcelable.Creator<ExpandToken> CREATOR = new a();

    @l
    private final Integer offsetFromText;

    @l
    private final List<BeduinAction> onExpandActions;

    @l
    private final LabelTextAttributes overridenAttributes;

    @l
    private final Style style;

    @l
    private final LabelTextAttributes tappedAttributes;

    @k
    private final String title;

    /* compiled from: ExpandToken.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpandToken> {
        @Override // android.os.Parcelable.Creator
        public final ExpandToken createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ArrayList arrayList = null;
            LabelTextAttributes labelTextAttributesCreateFromParcel = parcel.readInt() == 0 ? null : LabelTextAttributes.CREATOR.createFromParcel(parcel);
            LabelTextAttributes labelTextAttributesCreateFromParcel2 = parcel.readInt() == 0 ? null : LabelTextAttributes.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Style styleCreateFromParcel = parcel.readInt() == 0 ? null : Style.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ExpandToken.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ExpandToken(string, labelTextAttributesCreateFromParcel, labelTextAttributesCreateFromParcel2, numValueOf, styleCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ExpandToken[] newArray(int i12) {
            return new ExpandToken[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandToken(@k String str, @l LabelTextAttributes labelTextAttributes, @l LabelTextAttributes labelTextAttributes2, @l Integer num, @l Style style, @l List<? extends BeduinAction> list) {
        this.title = str;
        this.overridenAttributes = labelTextAttributes;
        this.tappedAttributes = labelTextAttributes2;
        this.offsetFromText = num;
        this.style = style;
        this.onExpandActions = list;
    }

    public static /* synthetic */ ExpandToken copy$default(ExpandToken expandToken, String str, LabelTextAttributes labelTextAttributes, LabelTextAttributes labelTextAttributes2, Integer num, Style style, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = expandToken.title;
        }
        if ((i12 & 2) != 0) {
            labelTextAttributes = expandToken.overridenAttributes;
        }
        LabelTextAttributes labelTextAttributes3 = labelTextAttributes;
        if ((i12 & 4) != 0) {
            labelTextAttributes2 = expandToken.tappedAttributes;
        }
        LabelTextAttributes labelTextAttributes4 = labelTextAttributes2;
        if ((i12 & 8) != 0) {
            num = expandToken.offsetFromText;
        }
        Integer num2 = num;
        if ((i12 & 16) != 0) {
            style = expandToken.style;
        }
        Style style2 = style;
        if ((i12 & 32) != 0) {
            list = expandToken.onExpandActions;
        }
        return expandToken.copy(str, labelTextAttributes3, labelTextAttributes4, num2, style2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final LabelTextAttributes getOverridenAttributes() {
        return this.overridenAttributes;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final LabelTextAttributes getTappedAttributes() {
        return this.tappedAttributes;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getOffsetFromText() {
        return this.offsetFromText;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final List<BeduinAction> component6() {
        return this.onExpandActions;
    }

    @k
    public final ExpandToken copy(@k String title, @l LabelTextAttributes overridenAttributes, @l LabelTextAttributes tappedAttributes, @l Integer offsetFromText, @l Style style, @l List<? extends BeduinAction> onExpandActions) {
        return new ExpandToken(title, overridenAttributes, tappedAttributes, offsetFromText, style, onExpandActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandToken)) {
            return false;
        }
        ExpandToken expandToken = (ExpandToken) other;
        return L.f(this.title, expandToken.title) && L.f(this.overridenAttributes, expandToken.overridenAttributes) && L.f(this.tappedAttributes, expandToken.tappedAttributes) && L.f(this.offsetFromText, expandToken.offsetFromText) && this.style == expandToken.style && L.f(this.onExpandActions, expandToken.onExpandActions);
    }

    @l
    public final Integer getOffsetFromText() {
        return this.offsetFromText;
    }

    @l
    public final List<BeduinAction> getOnExpandActions() {
        return this.onExpandActions;
    }

    @l
    public final LabelTextAttributes getOverridenAttributes() {
        return this.overridenAttributes;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final LabelTextAttributes getTappedAttributes() {
        return this.tappedAttributes;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        LabelTextAttributes labelTextAttributes = this.overridenAttributes;
        int iHashCode2 = (iHashCode + (labelTextAttributes == null ? 0 : labelTextAttributes.hashCode())) * 31;
        LabelTextAttributes labelTextAttributes2 = this.tappedAttributes;
        int iHashCode3 = (iHashCode2 + (labelTextAttributes2 == null ? 0 : labelTextAttributes2.hashCode())) * 31;
        Integer num = this.offsetFromText;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Style style = this.style;
        int iHashCode5 = (iHashCode4 + (style == null ? 0 : style.hashCode())) * 31;
        List<BeduinAction> list = this.onExpandActions;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandToken(title=");
        sb2.append(this.title);
        sb2.append(", overridenAttributes=");
        sb2.append(this.overridenAttributes);
        sb2.append(", tappedAttributes=");
        sb2.append(this.tappedAttributes);
        sb2.append(", offsetFromText=");
        sb2.append(this.offsetFromText);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", onExpandActions=");
        return H.p(sb2, this.onExpandActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        LabelTextAttributes labelTextAttributes = this.overridenAttributes;
        if (labelTextAttributes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            labelTextAttributes.writeToParcel(parcel, flags);
        }
        LabelTextAttributes labelTextAttributes2 = this.tappedAttributes;
        if (labelTextAttributes2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            labelTextAttributes2.writeToParcel(parcel, flags);
        }
        Integer num = this.offsetFromText;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            style.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onExpandActions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }

    public /* synthetic */ ExpandToken(String str, LabelTextAttributes labelTextAttributes, LabelTextAttributes labelTextAttributes2, Integer num, Style style, List list, int i12, C42822w c42822w) {
        this(str, labelTextAttributes, labelTextAttributes2, num, (i12 & 16) != 0 ? Style.DEFAULT : style, list);
    }
}
