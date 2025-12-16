package com.avito.android.universal_map.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Overlay;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: UniversalMapPointsRectResult.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001Bl\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR-\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0002\b\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/android/universal_map/remote/model/UniversalMapPointsRectResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/universal_map/remote/model/UniversalMapPointRect;", "pins", "Lcom/avito/android/universal_map/remote/model/Cluster;", "clusters", "Lcom/avito/android/remote/model/Overlay;", "overlay", "", "", "", "LK51/e;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/universal_map/remote/model/UniversalPreselectMapPoint;", "savedLocation", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/universal_map/remote/model/MapMode;", "mode", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/Overlay;Ljava/util/Map;Lcom/avito/android/universal_map/remote/model/UniversalPreselectMapPoint;Ljava/util/List;Lcom/avito/android/universal_map/remote/model/MapMode;)V", "Ljava/util/List;", "g", "()Ljava/util/List;", "c", "Lcom/avito/android/remote/model/Overlay;", "e", "()Lcom/avito/android/remote/model/Overlay;", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "Lcom/avito/android/universal_map/remote/model/UniversalPreselectMapPoint;", "h", "()Lcom/avito/android/universal_map/remote/model/UniversalPreselectMapPoint;", "getActions", "Lcom/avito/android/universal_map/remote/model/MapMode;", "d", "()Lcom/avito/android/universal_map/remote/model/MapMode;", "_avito-discouraged_avito-api_universal-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniversalMapPointsRectResult implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalMapPointsRectResult> CREATOR = new a();

    @c("actions")
    @l
    private final List<BeduinAction> actions;

    @c("clusters")
    @k
    private final List<Cluster> clusters;

    @c("mode")
    @l
    private final MapMode mode;

    @c("topOverlay")
    @l
    private final Overlay overlay;

    @c("infoExtraParameters")
    @l
    private final Map<String, Object> parameters;

    @c("pins")
    @k
    private final List<UniversalMapPointRect> pins;

    @c("savedLocation")
    @l
    private final UniversalPreselectMapPoint savedLocation;

    /* compiled from: UniversalMapPointsRectResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalMapPointsRectResult> {
        @Override // android.os.Parcelable.Creator
        public final UniversalMapPointsRectResult createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(UniversalMapPointRect.CREATOR, parcel, arrayList2, iC2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i13);
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = com.avito.android.actions_sheet.a.c(Cluster.CREATOR, parcel, arrayList3, iC3, 1);
            }
            Overlay overlay = (Overlay) parcel.readParcelable(UniversalMapPointsRectResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iC4 = 0;
                while (iC4 != i14) {
                    iC4 = h.c(UniversalMapPointsRectResult.class, parcel, linkedHashMap2, parcel.readString(), iC4, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            UniversalPreselectMapPoint universalPreselectMapPointCreateFromParcel = parcel.readInt() == 0 ? null : UniversalPreselectMapPoint.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                while (iL2 != i15) {
                    iL2 = com.avito.android.actions_sheet.a.l(UniversalMapPointsRectResult.class, parcel, arrayList4, iL2, 1);
                }
                arrayList = arrayList4;
            }
            return new UniversalMapPointsRectResult(arrayList2, arrayList3, overlay, linkedHashMap, universalPreselectMapPointCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : MapMode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalMapPointsRectResult[] newArray(int i12) {
            return new UniversalMapPointsRectResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UniversalMapPointsRectResult(@k List<UniversalMapPointRect> list, @k List<Cluster> list2, @l Overlay overlay, @l Map<String, ? extends Object> map, @l UniversalPreselectMapPoint universalPreselectMapPoint, @l List<? extends BeduinAction> list3, @l MapMode mapMode) {
        this.pins = list;
        this.clusters = list2;
        this.overlay = overlay;
        this.parameters = map;
        this.savedLocation = universalPreselectMapPoint;
        this.actions = list3;
        this.mode = mapMode;
    }

    @k
    public final List<Cluster> c() {
        return this.clusters;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final MapMode getMode() {
        return this.mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Overlay getOverlay() {
        return this.overlay;
    }

    @l
    public final Map<String, Object> f() {
        return this.parameters;
    }

    @k
    public final List<UniversalMapPointRect> g() {
        return this.pins;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final UniversalPreselectMapPoint getSavedLocation() {
        return this.savedLocation;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.pins, parcel);
        while (itJ.hasNext()) {
            ((UniversalMapPointRect) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.clusters, parcel);
        while (itJ2.hasNext()) {
            ((Cluster) itJ2.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.overlay, i12);
        Map<String, Object> map = this.parameters;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        UniversalPreselectMapPoint universalPreselectMapPoint = this.savedLocation;
        if (universalPreselectMapPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            universalPreselectMapPoint.writeToParcel(parcel, i12);
        }
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        MapMode mapMode = this.mode;
        if (mapMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(mapMode.name());
        }
    }
}
