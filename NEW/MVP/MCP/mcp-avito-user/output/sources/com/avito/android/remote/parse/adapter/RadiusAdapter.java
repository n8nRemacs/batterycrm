package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadiusAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/RadiusAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/Radius;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RadiusAdapter implements com.google.gson.h<Radius> {
    @Override // com.google.gson.h
    public final Radius deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD = kVarI.D("id");
        String strS = iVarD != null ? iVarD.s() : null;
        com.google.gson.i iVarD2 = kVarI.D("title");
        String strS2 = iVarD2 != null ? iVarD2.s() : null;
        com.google.gson.i iVarD3 = kVarI.D("distanceInMeters");
        Long lValueOf = iVarD3 != null ? Long.valueOf(iVarD3.l()) : null;
        com.google.gson.i iVarD4 = kVarI.D(ServiceTransportationWidget.LocationField.COORDINATES);
        return new Radius(strS, strS2, lValueOf, iVarD4 != null ? (Coordinates) gVar.b(iVarD4, Coordinates.class) : new Coordinates(0.0d, 0.0d), false, 16, null);
    }
}
