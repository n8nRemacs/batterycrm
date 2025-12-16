package com.avito.android.map_core.beduin;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFocusOnRegionAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006#"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinFocusOnRegionAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/remote/model/Coordinates;", "topLeft", "bottomRight", "<init>", "(Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/Coordinates;)V", "component1", "()Lcom/avito/android/remote/model/Coordinates;", "component2", "copy", "(Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/Coordinates;)Lcom/avito/android/map_core/beduin/BeduinFocusOnRegionAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Coordinates;", "getTopLeft", "getBottomRight", "Companion", "a", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BeduinFocusOnRegionAction implements BeduinAction {

    @k
    private final Coordinates bottomRight;

    @k
    private final Coordinates topLeft;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinFocusOnRegionAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinFocusOnRegionAction.class;

    @k
    private static final String type = "focusOnRegion";

    /* compiled from: BeduinFocusOnRegionAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinFocusOnRegionAction$a;", "LUi/c;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.beduin.BeduinFocusOnRegionAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinFocusOnRegionAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinFocusOnRegionAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinFocusOnRegionAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinFocusOnRegionAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinFocusOnRegionAction createFromParcel(Parcel parcel) {
            return new BeduinFocusOnRegionAction((Coordinates) parcel.readParcelable(BeduinFocusOnRegionAction.class.getClassLoader()), (Coordinates) parcel.readParcelable(BeduinFocusOnRegionAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinFocusOnRegionAction[] newArray(int i12) {
            return new BeduinFocusOnRegionAction[i12];
        }
    }

    public BeduinFocusOnRegionAction(@k Coordinates coordinates, @k Coordinates coordinates2) {
        this.topLeft = coordinates;
        this.bottomRight = coordinates2;
    }

    public static /* synthetic */ BeduinFocusOnRegionAction copy$default(BeduinFocusOnRegionAction beduinFocusOnRegionAction, Coordinates coordinates, Coordinates coordinates2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            coordinates = beduinFocusOnRegionAction.topLeft;
        }
        if ((i12 & 2) != 0) {
            coordinates2 = beduinFocusOnRegionAction.bottomRight;
        }
        return beduinFocusOnRegionAction.copy(coordinates, coordinates2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Coordinates getTopLeft() {
        return this.topLeft;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Coordinates getBottomRight() {
        return this.bottomRight;
    }

    @k
    public final BeduinFocusOnRegionAction copy(@k Coordinates topLeft, @k Coordinates bottomRight) {
        return new BeduinFocusOnRegionAction(topLeft, bottomRight);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinFocusOnRegionAction)) {
            return false;
        }
        BeduinFocusOnRegionAction beduinFocusOnRegionAction = (BeduinFocusOnRegionAction) other;
        return L.f(this.topLeft, beduinFocusOnRegionAction.topLeft) && L.f(this.bottomRight, beduinFocusOnRegionAction.bottomRight);
    }

    @k
    public final Coordinates getBottomRight() {
        return this.bottomRight;
    }

    @k
    public final Coordinates getTopLeft() {
        return this.topLeft;
    }

    public int hashCode() {
        return this.bottomRight.hashCode() + (this.topLeft.hashCode() * 31);
    }

    @k
    public String toString() {
        return "BeduinFocusOnRegionAction(topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.topLeft, flags);
        parcel.writeParcelable(this.bottomRight, flags);
    }
}
