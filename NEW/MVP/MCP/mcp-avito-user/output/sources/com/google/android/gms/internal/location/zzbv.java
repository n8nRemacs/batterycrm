package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.InterfaceC36782c;
import com.google.android.gms.location.InterfaceC36784e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzbv implements InterfaceC36784e {
    public final m<Status> addGeofences(i iVar, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        return iVar.g(new zzbr(iVar, geofencingRequest, pendingIntent));
    }

    public final m<Status> removeGeofences(i iVar, PendingIntent pendingIntent) {
        return iVar.g(new zzbs(iVar, pendingIntent));
    }

    @Deprecated
    public final m<Status> addGeofences(i iVar, List<InterfaceC36782c> list, PendingIntent pendingIntent) {
        GeofencingRequest.a aVar = new GeofencingRequest.a();
        ArrayList arrayList = aVar.f354200a;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC36782c interfaceC36782c : list) {
                if (interfaceC36782c != null) {
                    C36729v.a("Geofence must be created using Geofence.Builder.", interfaceC36782c instanceof zzdh);
                    arrayList.add((zzdh) interfaceC36782c);
                }
            }
        }
        aVar.f354201b = 5;
        C36729v.a("No geofence has been added to this request.", !arrayList.isEmpty());
        return iVar.g(new zzbr(iVar, new GeofencingRequest(aVar.f354201b, aVar.f354202c, null, arrayList), pendingIntent));
    }

    public final m<Status> removeGeofences(i iVar, List<String> list) {
        return iVar.g(new zzbt(iVar, list));
    }
}
