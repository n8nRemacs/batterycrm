package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.InterfaceC36785f;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import j.N;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzbz extends h implements InterfaceC36785f {
    public static final /* synthetic */ int zza = 0;

    public zzbz(@N Activity activity) {
        super(activity, (C36616a<C36616a.d.C10620d>) zzbp.zzb, C36616a.d.f348913j2, h.a.f348930c);
    }

    public final Task<Void> addGeofences(GeofencingRequest geofencingRequest, final PendingIntent pendingIntent) {
        int i12 = geofencingRequest.f354197c;
        ArrayList arrayList = geofencingRequest.f354196b;
        final GeofencingRequest geofencingRequest2 = new GeofencingRequest(i12, geofencingRequest.f354198d, this.f348921b, arrayList);
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzbw
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzq(geofencingRequest2, pendingIntent, (C37028k) obj2);
            }
        };
        aVarA.f348955d = 2424;
        return doWrite(aVarA.a());
    }

    public final Task<Void> removeGeofences(final PendingIntent pendingIntent) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzby
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzx(pendingIntent, (C37028k) obj2);
            }
        };
        aVarA.f348955d = 2425;
        return doWrite(aVarA.a());
    }

    public zzbz(@N Context context) {
        super(context, (C36616a<C36616a.d.C10620d>) zzbp.zzb, C36616a.d.f348913j2, h.a.f348930c);
    }

    public final Task<Void> removeGeofences(final List<String> list) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzy(list, (C37028k) obj2);
            }
        };
        aVarA.f348955d = 2425;
        return doWrite(aVarA.a());
    }
}
