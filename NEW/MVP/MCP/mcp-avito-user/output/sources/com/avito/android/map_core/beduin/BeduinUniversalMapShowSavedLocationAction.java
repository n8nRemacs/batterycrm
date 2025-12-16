package com.avito.android.map_core.beduin;

import K51.d;
import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.universal_map.remote.model.UniversalMapPointRect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: BeduinUniversalMapShowSavedLocationAction.kt */
@d
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BF\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJY\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b&\u0010!J \u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010\u0018R(\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\n8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001a¨\u0006:"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;", "iconType", "Lcom/avito/android/remote/model/Coordinates;", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction$Viewport;", "viewport", "", "zoomLevel", "", "", "", "LK51/e;", "selectedPinParameters", "<init>", "(Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction$Viewport;Ljava/lang/Float;Ljava/util/Map;)V", "component1", "()Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;", "component2", "()Lcom/avito/android/remote/model/Coordinates;", "component3", "()Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction$Viewport;", "component4", "()Ljava/lang/Float;", "component5", "()Ljava/util/Map;", "copy", "(Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction$Viewport;Ljava/lang/Float;Ljava/util/Map;)Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect$PointIconType;", "getIconType", "Lcom/avito/android/remote/model/Coordinates;", "getCoordinates", "Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction$Viewport;", "getViewport", "Ljava/lang/Float;", "getZoomLevel", "Ljava/util/Map;", "getSelectedPinParameters", "Companion", "a", "Viewport", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BeduinUniversalMapShowSavedLocationAction implements BeduinAction {

    @k
    private final Coordinates coordinates;

    @l
    private final UniversalMapPointRect.PointIconType iconType;

    @k
    private final Map<String, Object> selectedPinParameters;

    @l
    private final Viewport viewport;

    @l
    private final Float zoomLevel;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinUniversalMapShowSavedLocationAction> CREATOR = new b();

    @k
    private static final Class<? extends BeduinAction> action = BeduinUniversalMapShowSavedLocationAction.class;

    @k
    private static final String type = "universalMapShowSavedLocation";

    /* compiled from: BeduinUniversalMapShowSavedLocationAction.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction$Viewport;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Coordinates;", "topLeft", "bottomRight", "<init>", "(Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/Coordinates;)V", "component1", "()Lcom/avito/android/remote/model/Coordinates;", "component2", "copy", "(Lcom/avito/android/remote/model/Coordinates;Lcom/avito/android/remote/model/Coordinates;)Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction$Viewport;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Coordinates;", "getTopLeft", "getBottomRight", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Viewport implements Parcelable {

        @k
        public static final Parcelable.Creator<Viewport> CREATOR = new a();

        @k
        private final Coordinates bottomRight;

        @k
        private final Coordinates topLeft;

        /* compiled from: BeduinUniversalMapShowSavedLocationAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Viewport> {
            @Override // android.os.Parcelable.Creator
            public final Viewport createFromParcel(Parcel parcel) {
                return new Viewport((Coordinates) parcel.readParcelable(Viewport.class.getClassLoader()), (Coordinates) parcel.readParcelable(Viewport.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Viewport[] newArray(int i12) {
                return new Viewport[i12];
            }
        }

        public Viewport(@k Coordinates coordinates, @k Coordinates coordinates2) {
            this.topLeft = coordinates;
            this.bottomRight = coordinates2;
        }

        public static /* synthetic */ Viewport copy$default(Viewport viewport, Coordinates coordinates, Coordinates coordinates2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                coordinates = viewport.topLeft;
            }
            if ((i12 & 2) != 0) {
                coordinates2 = viewport.bottomRight;
            }
            return viewport.copy(coordinates, coordinates2);
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
        public final Viewport copy(@k Coordinates topLeft, @k Coordinates bottomRight) {
            return new Viewport(topLeft, bottomRight);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Viewport)) {
                return false;
            }
            Viewport viewport = (Viewport) other;
            return L.f(this.topLeft, viewport.topLeft) && L.f(this.bottomRight, viewport.bottomRight);
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
            return "Viewport(topLeft=" + this.topLeft + ", bottomRight=" + this.bottomRight + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.topLeft, flags);
            parcel.writeParcelable(this.bottomRight, flags);
        }
    }

    /* compiled from: BeduinUniversalMapShowSavedLocationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/beduin/BeduinUniversalMapShowSavedLocationAction$a;", "LUi/c;", "<init>", "()V", "_avito-discouraged_avito-libs_map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map_core.beduin.BeduinUniversalMapShowSavedLocationAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinUniversalMapShowSavedLocationAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinUniversalMapShowSavedLocationAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinUniversalMapShowSavedLocationAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinUniversalMapShowSavedLocationAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinUniversalMapShowSavedLocationAction createFromParcel(Parcel parcel) {
            UniversalMapPointRect.PointIconType pointIconTypeValueOf = parcel.readInt() == 0 ? null : UniversalMapPointRect.PointIconType.valueOf(parcel.readString());
            Coordinates coordinates = (Coordinates) parcel.readParcelable(BeduinUniversalMapShowSavedLocationAction.class.getClassLoader());
            Viewport viewportCreateFromParcel = parcel.readInt() == 0 ? null : Viewport.CREATOR.createFromParcel(parcel);
            Float fValueOf = parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null;
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = h.c(BeduinUniversalMapShowSavedLocationAction.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new BeduinUniversalMapShowSavedLocationAction(pointIconTypeValueOf, coordinates, viewportCreateFromParcel, fValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinUniversalMapShowSavedLocationAction[] newArray(int i12) {
            return new BeduinUniversalMapShowSavedLocationAction[i12];
        }
    }

    public BeduinUniversalMapShowSavedLocationAction(@l UniversalMapPointRect.PointIconType pointIconType, @k Coordinates coordinates, @l Viewport viewport, @l Float f12, @k Map<String, ? extends Object> map) {
        this.iconType = pointIconType;
        this.coordinates = coordinates;
        this.viewport = viewport;
        this.zoomLevel = f12;
        this.selectedPinParameters = map;
    }

    public static /* synthetic */ BeduinUniversalMapShowSavedLocationAction copy$default(BeduinUniversalMapShowSavedLocationAction beduinUniversalMapShowSavedLocationAction, UniversalMapPointRect.PointIconType pointIconType, Coordinates coordinates, Viewport viewport, Float f12, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            pointIconType = beduinUniversalMapShowSavedLocationAction.iconType;
        }
        if ((i12 & 2) != 0) {
            coordinates = beduinUniversalMapShowSavedLocationAction.coordinates;
        }
        Coordinates coordinates2 = coordinates;
        if ((i12 & 4) != 0) {
            viewport = beduinUniversalMapShowSavedLocationAction.viewport;
        }
        Viewport viewport2 = viewport;
        if ((i12 & 8) != 0) {
            f12 = beduinUniversalMapShowSavedLocationAction.zoomLevel;
        }
        Float f13 = f12;
        if ((i12 & 16) != 0) {
            map = beduinUniversalMapShowSavedLocationAction.selectedPinParameters;
        }
        return beduinUniversalMapShowSavedLocationAction.copy(pointIconType, coordinates2, viewport2, f13, map);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalMapPointRect.PointIconType getIconType() {
        return this.iconType;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Viewport getViewport() {
        return this.viewport;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Float getZoomLevel() {
        return this.zoomLevel;
    }

    @k
    public final Map<String, Object> component5() {
        return this.selectedPinParameters;
    }

    @k
    public final BeduinUniversalMapShowSavedLocationAction copy(@l UniversalMapPointRect.PointIconType iconType, @k Coordinates coordinates, @l Viewport viewport, @l Float zoomLevel, @k Map<String, ? extends Object> selectedPinParameters) {
        return new BeduinUniversalMapShowSavedLocationAction(iconType, coordinates, viewport, zoomLevel, selectedPinParameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinUniversalMapShowSavedLocationAction)) {
            return false;
        }
        BeduinUniversalMapShowSavedLocationAction beduinUniversalMapShowSavedLocationAction = (BeduinUniversalMapShowSavedLocationAction) other;
        return this.iconType == beduinUniversalMapShowSavedLocationAction.iconType && L.f(this.coordinates, beduinUniversalMapShowSavedLocationAction.coordinates) && L.f(this.viewport, beduinUniversalMapShowSavedLocationAction.viewport) && L.f(this.zoomLevel, beduinUniversalMapShowSavedLocationAction.zoomLevel) && L.f(this.selectedPinParameters, beduinUniversalMapShowSavedLocationAction.selectedPinParameters);
    }

    @k
    public final Coordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    public final UniversalMapPointRect.PointIconType getIconType() {
        return this.iconType;
    }

    @k
    public final Map<String, Object> getSelectedPinParameters() {
        return this.selectedPinParameters;
    }

    @l
    public final Viewport getViewport() {
        return this.viewport;
    }

    @l
    public final Float getZoomLevel() {
        return this.zoomLevel;
    }

    public int hashCode() {
        UniversalMapPointRect.PointIconType pointIconType = this.iconType;
        int iHashCode = (this.coordinates.hashCode() + ((pointIconType == null ? 0 : pointIconType.hashCode()) * 31)) * 31;
        Viewport viewport = this.viewport;
        int iHashCode2 = (iHashCode + (viewport == null ? 0 : viewport.hashCode())) * 31;
        Float f12 = this.zoomLevel;
        return this.selectedPinParameters.hashCode() + ((iHashCode2 + (f12 != null ? f12.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinUniversalMapShowSavedLocationAction(iconType=");
        sb2.append(this.iconType);
        sb2.append(", coordinates=");
        sb2.append(this.coordinates);
        sb2.append(", viewport=");
        sb2.append(this.viewport);
        sb2.append(", zoomLevel=");
        sb2.append(this.zoomLevel);
        sb2.append(", selectedPinParameters=");
        return r.w(sb2, this.selectedPinParameters, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        UniversalMapPointRect.PointIconType pointIconType = this.iconType;
        if (pointIconType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(pointIconType.name());
        }
        parcel.writeParcelable(this.coordinates, flags);
        Viewport viewport = this.viewport;
        if (viewport == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            viewport.writeToParcel(parcel, flags);
        }
        Float f12 = this.zoomLevel;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        Iterator itI = C0.i(parcel, this.selectedPinParameters);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
