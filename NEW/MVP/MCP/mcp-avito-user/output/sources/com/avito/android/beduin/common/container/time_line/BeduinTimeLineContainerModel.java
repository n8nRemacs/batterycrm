package com.avito.android.beduin.common.container.time_line;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTimeLineContainerModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0001ABO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001bJf\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020$HÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020$HÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b>\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b?\u0010\u001b¨\u0006B"}, d2 = {"Lcom/avito/android/beduin/common/container/time_line/BeduinTimeLineContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "", "id", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "icon", "Lcom/avito/android/beduin/common/container/time_line/Line;", "line", "childrenPadding", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/container/time_line/Line;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)V", "create", "(Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component4", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component5", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component6", "()Lcom/avito/android/beduin/common/container/time_line/Line;", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/container/time_line/Line;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;)Lcom/avito/android/beduin/common/container/time_line/BeduinTimeLineContainerModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getChildren", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getMargin", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getIcon", "Lcom/avito/android/beduin/common/container/time_line/Line;", "getLine", "getChildrenPadding", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTimeLineContainerModel extends BeduinSingleChildOwnerModel {

    @k
    private final List<BeduinModel> children;

    @l
    private final BeduinContainerIndent childrenPadding;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final LocalIcon icon;

    @k
    private final String id;

    @l
    private final Line line;

    @l
    private final BeduinContainerIndent margin;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinTimeLineContainerModel> CREATOR = new b();

    /* compiled from: BeduinTimeLineContainerModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/container/time_line/BeduinTimeLineContainerModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.container.time_line.BeduinTimeLineContainerModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return BeduinTimeLineContainerModel.class;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return Collections.singletonList("timeLineContainer");
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinTimeLineContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinTimeLineContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTimeLineContainerModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinTimeLineContainerModel.class, parcel, arrayList, iL2, 1);
            }
            return new BeduinTimeLineContainerModel(string, arrayList, (DisplayingPredicate) parcel.readParcelable(BeduinTimeLineContainerModel.class.getClassLoader()), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Line.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinContainerIndent.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTimeLineContainerModel[] newArray(int i12) {
            return new BeduinTimeLineContainerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinTimeLineContainerModel(@k String str, @k List<? extends BeduinModel> list, @l DisplayingPredicate displayingPredicate, @l BeduinContainerIndent beduinContainerIndent, @l LocalIcon localIcon, @l Line line, @l BeduinContainerIndent beduinContainerIndent2) {
        this.id = str;
        this.children = list;
        this.displayingPredicate = displayingPredicate;
        this.margin = beduinContainerIndent;
        this.icon = localIcon;
        this.line = line;
        this.childrenPadding = beduinContainerIndent2;
    }

    public static /* synthetic */ BeduinTimeLineContainerModel copy$default(BeduinTimeLineContainerModel beduinTimeLineContainerModel, String str, List list, DisplayingPredicate displayingPredicate, BeduinContainerIndent beduinContainerIndent, LocalIcon localIcon, Line line, BeduinContainerIndent beduinContainerIndent2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinTimeLineContainerModel.id;
        }
        if ((i12 & 2) != 0) {
            list = beduinTimeLineContainerModel.children;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            displayingPredicate = beduinTimeLineContainerModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 8) != 0) {
            beduinContainerIndent = beduinTimeLineContainerModel.margin;
        }
        BeduinContainerIndent beduinContainerIndent3 = beduinContainerIndent;
        if ((i12 & 16) != 0) {
            localIcon = beduinTimeLineContainerModel.icon;
        }
        LocalIcon localIcon2 = localIcon;
        if ((i12 & 32) != 0) {
            line = beduinTimeLineContainerModel.line;
        }
        Line line2 = line;
        if ((i12 & 64) != 0) {
            beduinContainerIndent2 = beduinTimeLineContainerModel.childrenPadding;
        }
        return beduinTimeLineContainerModel.copy(str, list2, displayingPredicate2, beduinContainerIndent3, localIcon2, line2, beduinContainerIndent2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    public final List<BeduinModel> component2() {
        return this.children;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final LocalIcon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Line getLine() {
        return this.line;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinContainerIndent getChildrenPadding() {
        return this.childrenPadding;
    }

    @k
    public final BeduinTimeLineContainerModel copy(@k String id2, @k List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate, @l BeduinContainerIndent margin, @l LocalIcon icon, @l Line line, @l BeduinContainerIndent childrenPadding) {
        return new BeduinTimeLineContainerModel(id2, children, displayingPredicate, margin, icon, line, childrenPadding);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public BeduinModel create(@l List<? extends BeduinModel> children, @l DisplayingPredicate displayingPredicate) {
        if (children == null) {
            children = C42784z0.f406748b;
        }
        return copy$default(this, null, children, displayingPredicate, null, null, null, null, 121, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTimeLineContainerModel)) {
            return false;
        }
        BeduinTimeLineContainerModel beduinTimeLineContainerModel = (BeduinTimeLineContainerModel) other;
        return L.f(this.id, beduinTimeLineContainerModel.id) && L.f(this.children, beduinTimeLineContainerModel.children) && L.f(this.displayingPredicate, beduinTimeLineContainerModel.displayingPredicate) && L.f(this.margin, beduinTimeLineContainerModel.margin) && L.f(this.icon, beduinTimeLineContainerModel.icon) && L.f(this.line, beduinTimeLineContainerModel.line) && L.f(this.childrenPadding, beduinTimeLineContainerModel.childrenPadding);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public List<BeduinModel> getChildren() {
        return this.children;
    }

    @l
    public final BeduinContainerIndent getChildrenPadding() {
        return this.childrenPadding;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final LocalIcon getIcon() {
        return this.icon;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final Line getLine() {
        return this.line;
    }

    @l
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    public int hashCode() {
        int iE2 = H.e(this.id.hashCode() * 31, 31, this.children);
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode = (iE2 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.margin;
        int iHashCode2 = (iHashCode + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        LocalIcon localIcon = this.icon;
        int iHashCode3 = (iHashCode2 + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
        Line line = this.line;
        int iHashCode4 = (iHashCode3 + (line == null ? 0 : line.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.childrenPadding;
        return iHashCode4 + (beduinContainerIndent2 != null ? beduinContainerIndent2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinTimeLineContainerModel(id=" + this.id + ", children=" + this.children + ", displayingPredicate=" + this.displayingPredicate + ", margin=" + this.margin + ", icon=" + this.icon + ", line=" + this.line + ", childrenPadding=" + this.childrenPadding + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Iterator itJ = C0.j(this.children, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
        BeduinContainerIndent beduinContainerIndent = this.margin;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        LocalIcon localIcon = this.icon;
        if (localIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localIcon.writeToParcel(parcel, flags);
        }
        Line line = this.line;
        if (line == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            line.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent2 = this.childrenPadding;
        if (beduinContainerIndent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent2.writeToParcel(parcel, flags);
        }
    }
}
