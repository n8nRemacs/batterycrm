package com.avito.android.avito_map;

import Y61.k;
import Y61.l;
import android.util.Base64;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.Gson;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;

/* compiled from: AvitoAreaObject.kt */
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012H\u0010\u0004\u001aD\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00050\u0005j.\u0012*\u0012(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007`\u0007`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003JK\u0010\u000e\u001aD\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00050\u0005j.\u0012*\u0012(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007`\u0007`\u0007HÆ\u0003J_\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032J\b\u0002\u0010\u0004\u001aD\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00050\u0005j.\u0012*\u0012(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007`\u0007`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u0006\u0010\u0018\u001a\u00020\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001RX\u0010\u0004\u001aD\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00050\u0005j.\u0012*\u0012(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007`\u0007`\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/avito/android/avito_map/AvitoAreaObject;", "", "type", "", ServiceTransportationWidget.LocationField.COORDINATES, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getCoordinates", "()Ljava/util/ArrayList;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toAvitoMapPointsList", "", "Lcom/avito/android/avito_map/AvitoMapPoint;", "toBase64EncodedJsonString", "toString", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoAreaObject {

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @k
    private final ArrayList<ArrayList<ArrayList<Double>>> coordinates;

    @c("type")
    @k
    private final String type;

    public AvitoAreaObject(@k String str, @k ArrayList<ArrayList<ArrayList<Double>>> arrayList) {
        this.type = str;
        this.coordinates = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvitoAreaObject copy$default(AvitoAreaObject avitoAreaObject, String str, ArrayList arrayList, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = avitoAreaObject.type;
        }
        if ((i12 & 2) != 0) {
            arrayList = avitoAreaObject.coordinates;
        }
        return avitoAreaObject.copy(str, arrayList);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    public final ArrayList<ArrayList<ArrayList<Double>>> component2() {
        return this.coordinates;
    }

    @k
    public final AvitoAreaObject copy(@k String type, @k ArrayList<ArrayList<ArrayList<Double>>> coordinates) {
        return new AvitoAreaObject(type, coordinates);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvitoAreaObject)) {
            return false;
        }
        AvitoAreaObject avitoAreaObject = (AvitoAreaObject) other;
        return L.f(this.type, avitoAreaObject.type) && L.f(this.coordinates, avitoAreaObject.coordinates);
    }

    @k
    public final ArrayList<ArrayList<ArrayList<Double>>> getCoordinates() {
        return this.coordinates;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.coordinates.hashCode() + (this.type.hashCode() * 31);
    }

    @k
    public final List<AvitoMapPoint> toAvitoMapPointsList() {
        Iterable<ArrayList> iterable = (Iterable) C42745f0.E(this.coordinates);
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
        for (ArrayList arrayList2 : iterable) {
            arrayList.add(new AvitoMapPoint(((Number) arrayList2.get(1)).doubleValue(), ((Number) C42745f0.E(arrayList2)).doubleValue(), null, 4, null));
        }
        return arrayList;
    }

    @k
    public final String toBase64EncodedJsonString() {
        return Base64.encodeToString(new Gson().l(this).toString().getBytes(C43047d.f410589b), 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoAreaObject(type=");
        sb2.append(this.type);
        sb2.append(", coordinates=");
        return e.p(sb2, this.coordinates, ')');
    }
}
