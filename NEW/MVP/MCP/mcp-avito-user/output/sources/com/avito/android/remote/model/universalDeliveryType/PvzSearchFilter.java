package com.avito.android.remote.model.universalDeliveryType;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalDeliveryTypeContent.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter;", "Landroid/os/Parcelable;", "", "iconName", "Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter$Tooltip;", TooltipAttribute.ATTRIBUTE_TYPE, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter$Tooltip;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter$Tooltip;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter$Tooltip;)Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIconName", "Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter$Tooltip;", "getTooltip", "Tooltip", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PvzSearchFilter implements Parcelable {

    @k
    public static final Parcelable.Creator<PvzSearchFilter> CREATOR = new Creator();

    @c("iconName")
    @k
    private final String iconName;

    @c(TooltipAttribute.ATTRIBUTE_TYPE)
    @l
    private final Tooltip tooltip;

    /* compiled from: UniversalDeliveryTypeContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PvzSearchFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PvzSearchFilter createFromParcel(@k Parcel parcel) {
            return new PvzSearchFilter(parcel.readString(), parcel.readInt() == 0 ? null : Tooltip.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PvzSearchFilter[] newArray(int i12) {
            return new PvzSearchFilter[i12];
        }
    }

    /* compiled from: UniversalDeliveryTypeContent.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter$Tooltip;", "Landroid/os/Parcelable;", "", "title", "onceShowId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/universalDeliveryType/PvzSearchFilter$Tooltip;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getOnceShowId", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tooltip implements Parcelable {

        @k
        public static final Parcelable.Creator<Tooltip> CREATOR = new Creator();

        @c("onceShowId")
        @k
        private final String onceShowId;

        @c("title")
        @k
        private final String title;

        /* compiled from: UniversalDeliveryTypeContent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tooltip> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tooltip createFromParcel(@k Parcel parcel) {
                return new Tooltip(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tooltip[] newArray(int i12) {
                return new Tooltip[i12];
            }
        }

        public Tooltip(@k String str, @k String str2) {
            this.title = str;
            this.onceShowId = str2;
        }

        public static /* synthetic */ Tooltip copy$default(Tooltip tooltip, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tooltip.title;
            }
            if ((i12 & 2) != 0) {
                str2 = tooltip.onceShowId;
            }
            return tooltip.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @k
        public final Tooltip copy(@k String title, @k String onceShowId) {
            return new Tooltip(title, onceShowId);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) other;
            return L.f(this.title, tooltip.title) && L.f(this.onceShowId, tooltip.onceShowId);
        }

        @k
        public final String getOnceShowId() {
            return this.onceShowId;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.onceShowId.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Tooltip(title=");
            sb2.append(this.title);
            sb2.append(", onceShowId=");
            return C22026a.c(sb2, this.onceShowId, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.onceShowId);
        }
    }

    public PvzSearchFilter(@k String str, @l Tooltip tooltip) {
        this.iconName = str;
        this.tooltip = tooltip;
    }

    public static /* synthetic */ PvzSearchFilter copy$default(PvzSearchFilter pvzSearchFilter, String str, Tooltip tooltip, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = pvzSearchFilter.iconName;
        }
        if ((i12 & 2) != 0) {
            tooltip = pvzSearchFilter.tooltip;
        }
        return pvzSearchFilter.copy(str, tooltip);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    @k
    public final PvzSearchFilter copy(@k String iconName, @l Tooltip tooltip) {
        return new PvzSearchFilter(iconName, tooltip);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PvzSearchFilter)) {
            return false;
        }
        PvzSearchFilter pvzSearchFilter = (PvzSearchFilter) other;
        return L.f(this.iconName, pvzSearchFilter.iconName) && L.f(this.tooltip, pvzSearchFilter.tooltip);
    }

    @k
    public final String getIconName() {
        return this.iconName;
    }

    @l
    public final Tooltip getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int iHashCode = this.iconName.hashCode() * 31;
        Tooltip tooltip = this.tooltip;
        return iHashCode + (tooltip == null ? 0 : tooltip.hashCode());
    }

    @k
    public String toString() {
        return "PvzSearchFilter(iconName=" + this.iconName + ", tooltip=" + this.tooltip + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.iconName);
        Tooltip tooltip = this.tooltip;
        if (tooltip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tooltip.writeToParcel(parcel, flags);
        }
    }
}
