package com.avito.android.beduin.common.component.notification_badge;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
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
import kotlin.jvm.internal.L;

/* compiled from: BeduinNotificationBadgeModel.kt */
@d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b \u0010!Jd\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020%HÖ\u0001¢\u0006\u0004\b-\u0010'J \u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020%HÖ\u0001¢\u0006\u0004\b2\u00103R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b8\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010\u001dR\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010!¨\u0006@"}, d2 = {"Lcom/avito/android/beduin/common/component/notification_badge/BeduinNotificationBadgeModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "text", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/notification_badge/BeduinNotificationBadgeStroke;", "stroke", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Lcom/avito/android/beduin/common/component/notification_badge/BeduinNotificationBadgeStroke;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component4", "component5", "()Lcom/avito/android/beduin/common/component/notification_badge/BeduinNotificationBadgeStroke;", "component6", "()Ljava/util/List;", "component7", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Ljava/lang/String;Lcom/avito/android/beduin/common/component/notification_badge/BeduinNotificationBadgeStroke;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/notification_badge/BeduinNotificationBadgeModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getText", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "getStyle", "Lcom/avito/android/beduin/common/component/notification_badge/BeduinNotificationBadgeStroke;", "getStroke", "Ljava/util/List;", "getOnTapActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinNotificationBadgeModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinNotificationBadgeModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final List<BeduinAction> onTapActions;

    @l
    private final BeduinNotificationBadgeStroke stroke;

    @k
    private final String style;

    @k
    private final String text;

    @l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinNotificationBadgeModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinNotificationBadgeModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinNotificationBadgeModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            BeduinNotificationBadgeStroke beduinNotificationBadgeStrokeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinNotificationBadgeStroke.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinNotificationBadgeModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinNotificationBadgeModel(string, string2, beduinComponentThemeCreateFromParcel, string3, beduinNotificationBadgeStrokeCreateFromParcel, arrayList, (DisplayingPredicate) parcel.readParcelable(BeduinNotificationBadgeModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinNotificationBadgeModel[] newArray(int i12) {
            return new BeduinNotificationBadgeModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinNotificationBadgeModel(@k String str, @k String str2, @l BeduinComponentTheme beduinComponentTheme, @k String str3, @l BeduinNotificationBadgeStroke beduinNotificationBadgeStroke, @l List<? extends BeduinAction> list, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.text = str2;
        this.theme = beduinComponentTheme;
        this.style = str3;
        this.stroke = beduinNotificationBadgeStroke;
        this.onTapActions = list;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinNotificationBadgeModel copy$default(BeduinNotificationBadgeModel beduinNotificationBadgeModel, String str, String str2, BeduinComponentTheme beduinComponentTheme, String str3, BeduinNotificationBadgeStroke beduinNotificationBadgeStroke, List list, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinNotificationBadgeModel.id;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinNotificationBadgeModel.text;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            beduinComponentTheme = beduinNotificationBadgeModel.theme;
        }
        BeduinComponentTheme beduinComponentTheme2 = beduinComponentTheme;
        if ((i12 & 8) != 0) {
            str3 = beduinNotificationBadgeModel.style;
        }
        String str5 = str3;
        if ((i12 & 16) != 0) {
            beduinNotificationBadgeStroke = beduinNotificationBadgeModel.stroke;
        }
        BeduinNotificationBadgeStroke beduinNotificationBadgeStroke2 = beduinNotificationBadgeStroke;
        if ((i12 & 32) != 0) {
            list = beduinNotificationBadgeModel.onTapActions;
        }
        List list2 = list;
        if ((i12 & 64) != 0) {
            displayingPredicate = beduinNotificationBadgeModel.displayingPredicate;
        }
        return beduinNotificationBadgeModel.copy(str, str4, beduinComponentTheme2, str5, beduinNotificationBadgeStroke2, list2, displayingPredicate);
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
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final BeduinNotificationBadgeStroke getStroke() {
        return this.stroke;
    }

    @l
    public final List<BeduinAction> component6() {
        return this.onTapActions;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinNotificationBadgeModel copy(@k String id2, @k String text, @l BeduinComponentTheme theme, @k String style, @l BeduinNotificationBadgeStroke stroke, @l List<? extends BeduinAction> onTapActions, @l DisplayingPredicate displayingPredicate) {
        return new BeduinNotificationBadgeModel(id2, text, theme, style, stroke, onTapActions, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinNotificationBadgeModel)) {
            return false;
        }
        BeduinNotificationBadgeModel beduinNotificationBadgeModel = (BeduinNotificationBadgeModel) other;
        return L.f(this.id, beduinNotificationBadgeModel.id) && L.f(this.text, beduinNotificationBadgeModel.text) && this.theme == beduinNotificationBadgeModel.theme && L.f(this.style, beduinNotificationBadgeModel.style) && L.f(this.stroke, beduinNotificationBadgeModel.stroke) && L.f(this.onTapActions, beduinNotificationBadgeModel.onTapActions) && L.f(this.displayingPredicate, beduinNotificationBadgeModel.displayingPredicate);
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
    public final List<BeduinAction> getOnTapActions() {
        return this.onTapActions;
    }

    @l
    public final BeduinNotificationBadgeStroke getStroke() {
        return this.stroke;
    }

    @k
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.text);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iD3 = H.d((iD2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31, 31, this.style);
        BeduinNotificationBadgeStroke beduinNotificationBadgeStroke = this.stroke;
        int iHashCode = (iD3 + (beduinNotificationBadgeStroke == null ? 0 : beduinNotificationBadgeStroke.hashCode())) * 31;
        List<BeduinAction> list = this.onTapActions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode2 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinNotificationBadgeModel(id=");
        sb2.append(this.id);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", stroke=");
        sb2.append(this.stroke);
        sb2.append(", onTapActions=");
        sb2.append(this.onTapActions);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.style);
        BeduinNotificationBadgeStroke beduinNotificationBadgeStroke = this.stroke;
        if (beduinNotificationBadgeStroke == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinNotificationBadgeStroke.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onTapActions;
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
