package com.avito.android.beduin.common.component.docking_badge_bar;

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
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinDockingBadgeBarModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00017B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJN\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b&\u0010 J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u0013R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001a¨\u00068"}, d2 = {"Lcom/avito/android/beduin/common/component/docking_badge_bar/BeduinDockingBadgeBarModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "", "Lcom/avito/android/beduin/common/component/docking_badge_bar/DockingBadge;", "badges", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "size", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin/common/component/docking_badge_bar/BeduinDockingBadgeBarModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;)Lcom/avito/android/beduin/common/component/docking_badge_bar/BeduinDockingBadgeBarModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getTheme", "Ljava/util/List;", "getBadges", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeSize;", "getSize", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinDockingBadgeBarModel extends LeafBeduinModel {

    @k
    private final List<DockingBadge> badges;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final DockingBadgeSize size;

    @l
    private final String theme;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinDockingBadgeBarModel> CREATOR = new b();

    /* compiled from: BeduinDockingBadgeBarModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/docking_badge_bar/BeduinDockingBadgeBarModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.docking_badge_bar.BeduinDockingBadgeBarModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return BeduinDockingBadgeBarModel.class;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return Collections.singletonList("dockingBadgeBar");
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinDockingBadgeBarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinDockingBadgeBarModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinDockingBadgeBarModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinDockingBadgeBarModel.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(DockingBadge.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BeduinDockingBadgeBarModel(string, displayingPredicate, string2, arrayList, parcel.readInt() == 0 ? null : DockingBadgeSize.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinDockingBadgeBarModel[] newArray(int i12) {
            return new BeduinDockingBadgeBarModel[i12];
        }
    }

    public BeduinDockingBadgeBarModel(@k String str, @l DisplayingPredicate displayingPredicate, @l String str2, @k List<DockingBadge> list, @l DockingBadgeSize dockingBadgeSize) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.theme = str2;
        this.badges = list;
        this.size = dockingBadgeSize;
    }

    public static /* synthetic */ BeduinDockingBadgeBarModel copy$default(BeduinDockingBadgeBarModel beduinDockingBadgeBarModel, String str, DisplayingPredicate displayingPredicate, String str2, List list, DockingBadgeSize dockingBadgeSize, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinDockingBadgeBarModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinDockingBadgeBarModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            str2 = beduinDockingBadgeBarModel.theme;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            list = beduinDockingBadgeBarModel.badges;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            dockingBadgeSize = beduinDockingBadgeBarModel.size;
        }
        return beduinDockingBadgeBarModel.copy(str, displayingPredicate2, str3, list2, dockingBadgeSize);
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
    public final String getTheme() {
        return this.theme;
    }

    @k
    public final List<DockingBadge> component4() {
        return this.badges;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final DockingBadgeSize getSize() {
        return this.size;
    }

    @k
    public final BeduinDockingBadgeBarModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @l String theme, @k List<DockingBadge> badges, @l DockingBadgeSize size) {
        return new BeduinDockingBadgeBarModel(id2, displayingPredicate, theme, badges, size);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinDockingBadgeBarModel)) {
            return false;
        }
        BeduinDockingBadgeBarModel beduinDockingBadgeBarModel = (BeduinDockingBadgeBarModel) other;
        return L.f(this.id, beduinDockingBadgeBarModel.id) && L.f(this.displayingPredicate, beduinDockingBadgeBarModel.displayingPredicate) && L.f(this.theme, beduinDockingBadgeBarModel.theme) && L.f(this.badges, beduinDockingBadgeBarModel.badges) && this.size == beduinDockingBadgeBarModel.size;
    }

    @k
    public final List<DockingBadge> getBadges() {
        return this.badges;
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
    public final DockingBadgeSize getSize() {
        return this.size;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        String str = this.theme;
        int iE2 = H.e((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.badges);
        DockingBadgeSize dockingBadgeSize = this.size;
        return iE2 + (dockingBadgeSize != null ? dockingBadgeSize.hashCode() : 0);
    }

    @k
    public String toString() {
        return "BeduinDockingBadgeBarModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", theme=" + this.theme + ", badges=" + this.badges + ", size=" + this.size + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.theme);
        Iterator itJ = C0.j(this.badges, parcel);
        while (itJ.hasNext()) {
            ((DockingBadge) itJ.next()).writeToParcel(parcel, flags);
        }
        DockingBadgeSize dockingBadgeSize = this.size;
        if (dockingBadgeSize == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingBadgeSize.name());
        }
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinDockingBadgeBarModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, 29, null) : this;
    }
}
