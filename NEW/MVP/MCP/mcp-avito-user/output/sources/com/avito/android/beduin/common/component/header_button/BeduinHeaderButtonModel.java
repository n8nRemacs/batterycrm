package com.avito.android.beduin.common.component.header_button;

import K51.d;
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
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinHeaderButtonModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010 J~\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b\u000b\u0010 R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\b\u000f\u0010 ¨\u0006@"}, d2 = {"Lcom/avito/android/beduin/common/component/header_button/BeduinHeaderButtonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "text", "icon", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "", "isEnabled", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "isIconPositionEnd", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "()Ljava/util/List;", "component9", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/header_button/BeduinHeaderButtonModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getText", "getIcon", "getStyle", "getTheme", "Ljava/lang/Boolean;", "Ljava/util/List;", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinHeaderButtonModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinHeaderButtonModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final String icon;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;

    @l
    private final Boolean isIconPositionEnd;

    @k
    private final String style;

    @l
    private final String text;

    @l
    private final String theme;

    /* compiled from: BeduinHeaderButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinHeaderButtonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinHeaderButtonModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinHeaderButtonModel.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinHeaderButtonModel.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinHeaderButtonModel(string, displayingPredicate, string2, string3, string4, string5, boolValueOf, arrayList, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinHeaderButtonModel[] newArray(int i12) {
            return new BeduinHeaderButtonModel[i12];
        }
    }

    public /* synthetic */ BeduinHeaderButtonModel(String str, DisplayingPredicate displayingPredicate, String str2, String str3, String str4, String str5, Boolean bool, List list, Boolean bool2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : displayingPredicate, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? null : list, (i12 & 256) != 0 ? Boolean.TRUE : bool2);
    }

    public static /* synthetic */ BeduinHeaderButtonModel copy$default(BeduinHeaderButtonModel beduinHeaderButtonModel, String str, DisplayingPredicate displayingPredicate, String str2, String str3, String str4, String str5, Boolean bool, List list, Boolean bool2, int i12, Object obj) {
        return beduinHeaderButtonModel.copy((i12 & 1) != 0 ? beduinHeaderButtonModel.id : str, (i12 & 2) != 0 ? beduinHeaderButtonModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinHeaderButtonModel.text : str2, (i12 & 8) != 0 ? beduinHeaderButtonModel.icon : str3, (i12 & 16) != 0 ? beduinHeaderButtonModel.style : str4, (i12 & 32) != 0 ? beduinHeaderButtonModel.theme : str5, (i12 & 64) != 0 ? beduinHeaderButtonModel.isEnabled : bool, (i12 & 128) != 0 ? beduinHeaderButtonModel.actions : list, (i12 & 256) != 0 ? beduinHeaderButtonModel.isIconPositionEnd : bool2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, 509, null) : transform instanceof TextTransform ? copy$default(this, null, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, 507, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, 447, null) : this;
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
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    public final List<BeduinAction> component8() {
        return this.actions;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Boolean getIsIconPositionEnd() {
        return this.isIconPositionEnd;
    }

    @k
    public final BeduinHeaderButtonModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l String text, @l String icon, @k String style, @l String theme, @l Boolean isEnabled, @l List<? extends BeduinAction> actions, @l Boolean isIconPositionEnd) {
        return new BeduinHeaderButtonModel(id2, displayingPredicate, text, icon, style, theme, isEnabled, actions, isIconPositionEnd);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinHeaderButtonModel)) {
            return false;
        }
        BeduinHeaderButtonModel beduinHeaderButtonModel = (BeduinHeaderButtonModel) other;
        return L.f(this.id, beduinHeaderButtonModel.id) && L.f(this.displayingPredicate, beduinHeaderButtonModel.displayingPredicate) && L.f(this.text, beduinHeaderButtonModel.text) && L.f(this.icon, beduinHeaderButtonModel.icon) && L.f(this.style, beduinHeaderButtonModel.style) && L.f(this.theme, beduinHeaderButtonModel.theme) && L.f(this.isEnabled, beduinHeaderButtonModel.isEnabled) && L.f(this.actions, beduinHeaderButtonModel.actions) && L.f(this.isIconPositionEnd, beduinHeaderButtonModel.isIconPositionEnd);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final String getIcon() {
        return this.icon;
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
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        String str = this.text;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iD2 = H.d((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.style);
        String str3 = this.theme;
        int iHashCode4 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool2 = this.isIconPositionEnd;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @l
    public final Boolean isIconPositionEnd() {
        return this.isIconPositionEnd;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinHeaderButtonModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", isIconPositionEnd=");
        return C0.g(sb2, this.isIconPositionEnd, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.text);
        parcel.writeString(this.icon);
        parcel.writeString(this.style);
        parcel.writeString(this.theme);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Boolean bool2 = this.isIconPositionEnd;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinHeaderButtonModel(@k String str, @l DisplayingPredicate displayingPredicate, @l String str2, @l String str3, @k String str4, @l String str5, @l Boolean bool, @l List<? extends BeduinAction> list, @l Boolean bool2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.text = str2;
        this.icon = str3;
        this.style = str4;
        this.theme = str5;
        this.isEnabled = bool;
        this.actions = list;
        this.isIconPositionEnd = bool2;
    }
}
