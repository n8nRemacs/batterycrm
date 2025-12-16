package com.avito.android.beduin.common.component.badge;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinBadgeModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020#HÖ\u0001¢\u0006\u0004\b+\u0010%J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u00101R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b8\u0010\u001aR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001f¨\u0006="}, d2 = {"Lcom/avito/android/beduin/common/component/badge/BeduinBadgeModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "title", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/remote/model/UniversalColor;", "color", "textColor", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/badge/BeduinBadgeModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "getTextColor", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinBadgeModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinBadgeModel> CREATOR = new a();

    @com.google.gson.annotations.c("onTapActions")
    @l
    private final List<BeduinAction> actions;

    @k
    private final UniversalColor color;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @k
    private final String style;

    @l
    private final UniversalColor textColor;

    @k
    private final String title;

    /* compiled from: BeduinBadgeModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinBadgeModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinBadgeModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(BeduinBadgeModel.class.getClassLoader());
            UniversalColor universalColor2 = (UniversalColor) parcel.readParcelable(BeduinBadgeModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinBadgeModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinBadgeModel(string, string2, string3, universalColor, universalColor2, arrayList, (DisplayingPredicate) parcel.readParcelable(BeduinBadgeModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinBadgeModel[] newArray(int i12) {
            return new BeduinBadgeModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinBadgeModel(@k String str, @k String str2, @k String str3, @k UniversalColor universalColor, @l UniversalColor universalColor2, @l List<? extends BeduinAction> list, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.title = str2;
        this.style = str3;
        this.color = universalColor;
        this.textColor = universalColor2;
        this.actions = list;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinBadgeModel copy$default(BeduinBadgeModel beduinBadgeModel, String str, String str2, String str3, UniversalColor universalColor, UniversalColor universalColor2, List list, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinBadgeModel.id;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinBadgeModel.title;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = beduinBadgeModel.style;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            universalColor = beduinBadgeModel.color;
        }
        UniversalColor universalColor3 = universalColor;
        if ((i12 & 16) != 0) {
            universalColor2 = beduinBadgeModel.textColor;
        }
        UniversalColor universalColor4 = universalColor2;
        if ((i12 & 32) != 0) {
            list = beduinBadgeModel.actions;
        }
        List list2 = list;
        if ((i12 & 64) != 0) {
            displayingPredicate = beduinBadgeModel.displayingPredicate;
        }
        return beduinBadgeModel.copy(str, str4, str5, universalColor3, universalColor4, list2, displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 63, null) : transform instanceof TextTransform ? copy$default(this, null, ((TextTransform) transform).getText(), null, null, null, null, null, 125, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @l
    public final List<BeduinAction> component6() {
        return this.actions;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinBadgeModel copy(@k String id2, @k String title, @k String style, @k UniversalColor color, @l UniversalColor textColor, @l List<? extends BeduinAction> actions, @l DisplayingPredicate displayingPredicate) {
        return new BeduinBadgeModel(id2, title, style, color, textColor, actions, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinBadgeModel)) {
            return false;
        }
        BeduinBadgeModel beduinBadgeModel = (BeduinBadgeModel) other;
        return L.f(this.id, beduinBadgeModel.id) && L.f(this.title, beduinBadgeModel.title) && L.f(this.style, beduinBadgeModel.style) && L.f(this.color, beduinBadgeModel.color) && L.f(this.textColor, beduinBadgeModel.textColor) && L.f(this.actions, beduinBadgeModel.actions) && L.f(this.displayingPredicate, beduinBadgeModel.displayingPredicate);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @k
    public final UniversalColor getColor() {
        return this.color;
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
    public final String getStyle() {
        return this.style;
    }

    @l
    public final UniversalColor getTextColor() {
        return this.textColor;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i12 = com.avito.android.actions_sheet.a.i(this.color, H.d(H.d(this.id.hashCode() * 31, 31, this.title), 31, this.style), 31);
        UniversalColor universalColor = this.textColor;
        int iHashCode = (i12 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode2 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinBadgeModel(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", color=");
        sb2.append(this.color);
        sb2.append(", textColor=");
        sb2.append(this.textColor);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.style);
        parcel.writeParcelable(this.color, flags);
        parcel.writeParcelable(this.textColor, flags);
        List<BeduinAction> list = this.actions;
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
}
