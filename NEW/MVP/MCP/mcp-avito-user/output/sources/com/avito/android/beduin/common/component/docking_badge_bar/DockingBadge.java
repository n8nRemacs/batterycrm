package com.avito.android.beduin.common.component.docking_badge_bar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.docking_badge.CustomBadgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinDockingBadgeBarModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JH\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0014R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b0\u0010\u0014¨\u00061"}, d2 = {"Lcom/avito/android/beduin/common/component/docking_badge_bar/DockingBadge;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "badgeType", "Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;", "customBadgeType", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "startEdgeType", "endEdgeType", "<init>", "(Ljava/lang/String;Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "component3", "()Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;", "component4", "()Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "component5", "copy", "(Ljava/lang/String;Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;)Lcom/avito/android/beduin/common/component/docking_badge_bar/DockingBadge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeType$Predefined;", "getBadgeType", "Lcom/avito/android/beduin/common/component/docking_badge/CustomBadgeType;", "getCustomBadgeType", "Lcom/avito/android/lib/design/docking_badge/DockingBadgeEdgeType;", "getStartEdgeType", "getEndEdgeType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DockingBadge implements Parcelable {

    @k
    public static final Parcelable.Creator<DockingBadge> CREATOR = new a();

    @l
    private final DockingBadgeType.Predefined badgeType;

    @l
    private final CustomBadgeType customBadgeType;

    @k
    private final DockingBadgeEdgeType endEdgeType;

    @l
    private final DockingBadgeEdgeType startEdgeType;

    @k
    private final String text;

    /* compiled from: BeduinDockingBadgeBarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DockingBadge> {
        @Override // android.os.Parcelable.Creator
        public final DockingBadge createFromParcel(Parcel parcel) {
            return new DockingBadge(parcel.readString(), (DockingBadgeType.Predefined) parcel.readParcelable(DockingBadge.class.getClassLoader()), parcel.readInt() == 0 ? null : CustomBadgeType.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : DockingBadgeEdgeType.valueOf(parcel.readString()), DockingBadgeEdgeType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final DockingBadge[] newArray(int i12) {
            return new DockingBadge[i12];
        }
    }

    public DockingBadge(@k String str, @l DockingBadgeType.Predefined predefined, @l CustomBadgeType customBadgeType, @l DockingBadgeEdgeType dockingBadgeEdgeType, @k DockingBadgeEdgeType dockingBadgeEdgeType2) {
        this.text = str;
        this.badgeType = predefined;
        this.customBadgeType = customBadgeType;
        this.startEdgeType = dockingBadgeEdgeType;
        this.endEdgeType = dockingBadgeEdgeType2;
    }

    public static /* synthetic */ DockingBadge copy$default(DockingBadge dockingBadge, String str, DockingBadgeType.Predefined predefined, CustomBadgeType customBadgeType, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = dockingBadge.text;
        }
        if ((i12 & 2) != 0) {
            predefined = dockingBadge.badgeType;
        }
        DockingBadgeType.Predefined predefined2 = predefined;
        if ((i12 & 4) != 0) {
            customBadgeType = dockingBadge.customBadgeType;
        }
        CustomBadgeType customBadgeType2 = customBadgeType;
        if ((i12 & 8) != 0) {
            dockingBadgeEdgeType = dockingBadge.startEdgeType;
        }
        DockingBadgeEdgeType dockingBadgeEdgeType3 = dockingBadgeEdgeType;
        if ((i12 & 16) != 0) {
            dockingBadgeEdgeType2 = dockingBadge.endEdgeType;
        }
        return dockingBadge.copy(str, predefined2, customBadgeType2, dockingBadgeEdgeType3, dockingBadgeEdgeType2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DockingBadgeType.Predefined getBadgeType() {
        return this.badgeType;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final CustomBadgeType getCustomBadgeType() {
        return this.customBadgeType;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DockingBadgeEdgeType getStartEdgeType() {
        return this.startEdgeType;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final DockingBadgeEdgeType getEndEdgeType() {
        return this.endEdgeType;
    }

    @k
    public final DockingBadge copy(@k String text, @l DockingBadgeType.Predefined badgeType, @l CustomBadgeType customBadgeType, @l DockingBadgeEdgeType startEdgeType, @k DockingBadgeEdgeType endEdgeType) {
        return new DockingBadge(text, badgeType, customBadgeType, startEdgeType, endEdgeType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DockingBadge)) {
            return false;
        }
        DockingBadge dockingBadge = (DockingBadge) other;
        return L.f(this.text, dockingBadge.text) && this.badgeType == dockingBadge.badgeType && L.f(this.customBadgeType, dockingBadge.customBadgeType) && this.startEdgeType == dockingBadge.startEdgeType && this.endEdgeType == dockingBadge.endEdgeType;
    }

    @l
    public final DockingBadgeType.Predefined getBadgeType() {
        return this.badgeType;
    }

    @l
    public final CustomBadgeType getCustomBadgeType() {
        return this.customBadgeType;
    }

    @k
    public final DockingBadgeEdgeType getEndEdgeType() {
        return this.endEdgeType;
    }

    @l
    public final DockingBadgeEdgeType getStartEdgeType() {
        return this.startEdgeType;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        DockingBadgeType.Predefined predefined = this.badgeType;
        int iHashCode2 = (iHashCode + (predefined == null ? 0 : predefined.hashCode())) * 31;
        CustomBadgeType customBadgeType = this.customBadgeType;
        int iHashCode3 = (iHashCode2 + (customBadgeType == null ? 0 : customBadgeType.hashCode())) * 31;
        DockingBadgeEdgeType dockingBadgeEdgeType = this.startEdgeType;
        return this.endEdgeType.hashCode() + ((iHashCode3 + (dockingBadgeEdgeType != null ? dockingBadgeEdgeType.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        return "DockingBadge(text=" + this.text + ", badgeType=" + this.badgeType + ", customBadgeType=" + this.customBadgeType + ", startEdgeType=" + this.startEdgeType + ", endEdgeType=" + this.endEdgeType + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeParcelable(this.badgeType, flags);
        CustomBadgeType customBadgeType = this.customBadgeType;
        if (customBadgeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customBadgeType.writeToParcel(parcel, flags);
        }
        DockingBadgeEdgeType dockingBadgeEdgeType = this.startEdgeType;
        if (dockingBadgeEdgeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingBadgeEdgeType.name());
        }
        parcel.writeString(this.endEdgeType.name());
    }
}
