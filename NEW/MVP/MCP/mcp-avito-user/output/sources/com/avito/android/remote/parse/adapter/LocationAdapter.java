package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SimpleLocation;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/LocationAdapter;", "Lcom/google/gson/h;", "Lcom/avito/android/remote/model/Location;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocationAdapter implements com.google.gson.h<Location> {
    @Override // com.google.gson.h
    public final Location deserialize(com.google.gson.i iVar, Type type, com.google.gson.g gVar) {
        com.google.gson.i iVarD;
        com.google.gson.k kVarI = iVar.i();
        com.google.gson.i iVarD2 = kVarI.D("id");
        SimpleLocation simpleLocation = null;
        String strS = iVarD2 != null ? iVarD2.s() : null;
        if (strS == null || (iVarD = kVarI.D("names")) == null) {
            return null;
        }
        CaseText caseText = (CaseText) gVar.b(iVarD, CaseText.class);
        com.google.gson.i iVarD3 = kVarI.D("parent");
        if (iVarD3 == null) {
            com.google.gson.i iVarD4 = kVarI.D("parentId");
            String strS2 = iVarD4 != null ? iVarD4.s() : null;
            if (strS2 != null) {
                simpleLocation = new SimpleLocation(strS2, new CaseText());
            }
        } else {
            simpleLocation = (SimpleLocation) gVar.b(iVarD3, SimpleLocation.class);
        }
        SimpleLocation simpleLocation2 = simpleLocation;
        com.google.gson.i iVarD5 = kVarI.D("hasMetro");
        boolean zD2 = iVarD5 != null ? iVarD5.d() : false;
        com.google.gson.i iVarD6 = kVarI.D("hasChildren");
        boolean zD3 = iVarD6 != null ? iVarD6.d() : false;
        com.google.gson.i iVarD7 = kVarI.D("hasDirections");
        boolean zD4 = iVarD7 != null ? iVarD7.d() : false;
        com.google.gson.i iVarD8 = kVarI.D("hasDistricts");
        return new Location(strS, caseText, zD2, zD3, zD4, iVarD8 != null ? iVarD8.d() : false, simpleLocation2, null, false, null, null, null, 3968, null);
    }
}
