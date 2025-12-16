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
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSetDefaultLocationAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006 "}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinSetDefaultLocationAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "<init>", "(Lcom/avito/android/remote/model/Coordinates;)V", "component1", "()Lcom/avito/android/remote/model/Coordinates;", "copy", "(Lcom/avito/android/remote/model/Coordinates;)Lcom/avito/android/map_core/beduin/BeduinSetDefaultLocationAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "Companion", "a", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BeduinSetDefaultLocationAction implements BeduinAction {

    @k
    private final Coordinates coordinates;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinSetDefaultLocationAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinSetDefaultLocationAction.class;

    @k
    private static final String type = "setDefaultLocation";

    /* compiled from: BeduinSetDefaultLocationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinSetDefaultLocationAction$a;", "LUi/c;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.beduin.BeduinSetDefaultLocationAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSetDefaultLocationAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF99995b() {
            return BeduinSetDefaultLocationAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSetDefaultLocationAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSetDefaultLocationAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSetDefaultLocationAction createFromParcel(Parcel parcel) {
            return new BeduinSetDefaultLocationAction((Coordinates) parcel.readParcelable(BeduinSetDefaultLocationAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSetDefaultLocationAction[] newArray(int i12) {
            return new BeduinSetDefaultLocationAction[i12];
        }
    }

    public BeduinSetDefaultLocationAction(@k Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public static /* synthetic */ BeduinSetDefaultLocationAction copy$default(BeduinSetDefaultLocationAction beduinSetDefaultLocationAction, Coordinates coordinates, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            coordinates = beduinSetDefaultLocationAction.coordinates;
        }
        return beduinSetDefaultLocationAction.copy(coordinates);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @k
    public final BeduinSetDefaultLocationAction copy(@k Coordinates coordinates) {
        return new BeduinSetDefaultLocationAction(coordinates);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinSetDefaultLocationAction) && L.f(this.coordinates, ((BeduinSetDefaultLocationAction) other).coordinates);
    }

    @k
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    public int hashCode() {
        return this.coordinates.hashCode();
    }

    @k
    public String toString() {
        return "BeduinSetDefaultLocationAction(coordinates=" + this.coordinates + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.coordinates, flags);
    }
}
