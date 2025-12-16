package com.avito.android.remote.parse.adapter.stream_gson;

import Y61.k;
import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SimpleLocation;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.c;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationTypeAdapterFactory.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/parse/adapter/stream_gson/LocationTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/avito/android/remote/model/Location;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class LocationTypeAdapter extends TypeAdapter<Location> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Gson f254293a;

    public LocationTypeAdapter(@k Gson gson) {
        this.f254293a = gson;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.gson.TypeAdapter
    public final Location read(com.google.gson.stream.a aVar) throws IOException {
        if (aVar.F() == JsonToken.f362204j) {
            throw new JsonParseException("");
        }
        JsonToken jsonTokenF = aVar.F();
        JsonToken jsonToken = JsonToken.f362198d;
        if (jsonTokenF != jsonToken) {
            throw new IllegalStateException(com.avito.android.authorization.auto_recovery.phone_confirm.b.e(aVar, com.avito.android.authorization.auto_recovery.phone_confirm.b.k("Expected ", jsonToken, " but was "), " at ", aVar));
        }
        aVar.b();
        String strValueOf = null;
        String strValueOf2 = null;
        Object obj = null;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        boolean zO5 = false;
        Object obj2 = null;
        while (aVar.k()) {
            String strX = aVar.x();
            if (strX != null) {
                int iHashCode = strX.hashCode();
                Gson gson = this.f254293a;
                switch (iHashCode) {
                    case -995424086:
                        if (!strX.equals("parent")) {
                            break;
                        } else {
                            obj = gson.g(SimpleLocation.class).read(aVar);
                            break;
                        }
                    case -718268117:
                        if (!strX.equals("hasDistricts")) {
                            break;
                        } else {
                            zO5 = aVar.o();
                            break;
                        }
                    case 3355:
                        if (!strX.equals("id")) {
                            break;
                        } else {
                            strValueOf2 = String.valueOf(aVar.q());
                            break;
                        }
                    case 104585032:
                        if (!strX.equals("names")) {
                            break;
                        } else {
                            obj2 = gson.g(CaseText.class).read(aVar);
                            break;
                        }
                    case 123779743:
                        if (!strX.equals("hasMetro")) {
                            break;
                        } else {
                            zO2 = aVar.o();
                            break;
                        }
                    case 239016633:
                        if (!strX.equals("hasChildren")) {
                            break;
                        } else {
                            zO3 = aVar.o();
                            break;
                        }
                    case 913923854:
                        if (!strX.equals("hasDirections")) {
                            break;
                        } else {
                            zO4 = aVar.o();
                            break;
                        }
                    case 1175162725:
                        if (!strX.equals("parentId")) {
                            break;
                        } else {
                            strValueOf = String.valueOf(aVar.q());
                            break;
                        }
                }
            }
            aVar.L();
        }
        aVar.g();
        CaseText caseText = (CaseText) obj2;
        SimpleLocation simpleLocation = obj != null ? (SimpleLocation) obj : strValueOf != null ? new SimpleLocation(strValueOf, new CaseText()) : null;
        if (strValueOf2 == null || caseText == null) {
            return null;
        }
        return new Location(strValueOf2, caseText, zO2, zO3, zO4, zO5, simpleLocation, null, false, null, null, null, 3968, null);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(c cVar, Location location) {
        throw new UnsupportedOperationException();
    }
}
