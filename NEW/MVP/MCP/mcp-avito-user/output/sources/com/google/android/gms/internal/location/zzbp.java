package com.google.android.gms.internal.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.api.internal.C36660o;
import com.google.android.gms.common.api.internal.C36671u;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.C36799u;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.InterfaceC36781b;
import com.google.android.gms.location.InterfaceC36788i;
import com.google.android.gms.location.K;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.AbstractC37018a;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;
import j.P;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzbp extends h implements InterfaceC36781b {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a.g f350458k;
    public static final C36616a zzb;

    static {
        C36616a.g gVar = new C36616a.g();
        f350458k = gVar;
        zzb = new C36616a("LocationServices.API", new zzbm(), gVar);
    }

    public zzbp(Activity activity) {
        super(activity, (C36616a<C36616a.d.C10620d>) zzb, C36616a.d.f348913j2, h.a.f348930c);
    }

    public final Task d(final LocationRequest locationRequest, C36658n c36658n) {
        final zzbo zzboVar = new zzbo(this, c36658n, new zzbn() { // from class: com.google.android.gms.internal.location.zzax
            @Override // com.google.android.gms.internal.location.zzbn
            public final void zza(zzda zzdaVar, C36658n.a aVar, boolean z12, C37028k c37028k) {
                zzdaVar.zzB(aVar, z12, c37028k);
            }
        });
        InterfaceC36673v interfaceC36673v = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzay
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C36616a.g gVar = zzbp.f350458k;
                ((zzda) obj).zzu(zzboVar, locationRequest, (C37028k) obj2);
            }
        };
        C36671u.a aVar = new C36671u.a(null);
        aVar.f349219a = interfaceC36673v;
        aVar.f349220b = zzboVar;
        aVar.f349222d = c36658n;
        aVar.f349225g = 2436;
        return doRegisterEventListener(aVar.a());
    }

    public final Task e(final LocationRequest locationRequest, C36658n c36658n) {
        final zzbo zzboVar = new zzbo(this, c36658n, new zzbn() { // from class: com.google.android.gms.internal.location.zzbd
            @Override // com.google.android.gms.internal.location.zzbn
            public final void zza(zzda zzdaVar, C36658n.a aVar, boolean z12, C37028k c37028k) {
                zzdaVar.zzC(aVar, z12, c37028k);
            }
        });
        InterfaceC36673v interfaceC36673v = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzbf
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C36616a.g gVar = zzbp.f350458k;
                ((zzda) obj).zzv(zzboVar, locationRequest, (C37028k) obj2);
            }
        };
        C36671u.a aVar = new C36671u.a(null);
        aVar.f349219a = interfaceC36673v;
        aVar.f349220b = zzboVar;
        aVar.f349222d = c36658n;
        aVar.f349225g = 2435;
        return doRegisterEventListener(aVar.a());
    }

    public final Task<Void> flushLocations() {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzav
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                ((zzda) obj).zzr((C37028k) obj2);
            }
        };
        aVarA.f348955d = 2422;
        return doWrite(aVarA.a());
    }

    public final Task<Location> getCurrentLocation(int i12, @P AbstractC37018a abstractC37018a) {
        CurrentLocationRequest.a aVar = new CurrentLocationRequest.a();
        C36799u.a(i12);
        aVar.f354193a = i12;
        CurrentLocationRequest currentLocationRequest = new CurrentLocationRequest(60000L, 0, aVar.f354193a, Long.MAX_VALUE, false, 0, null, new WorkSource(null), null);
        if (abstractC37018a != null) {
            C36729v.a("cancellationToken may not be already canceled", !abstractC37018a.a());
        }
        A.a aVarA = A.a();
        aVarA.f348952a = new zzbh(currentLocationRequest, abstractC37018a);
        aVarA.f348955d = 2415;
        Task<Location> taskDoRead = doRead(aVarA.a());
        if (abstractC37018a == null) {
            return taskDoRead;
        }
        C37028k c37028k = new C37028k(abstractC37018a);
        taskDoRead.j(new zzbi(c37028k));
        return c37028k.f355672a;
    }

    @Override // com.google.android.gms.location.InterfaceC36781b
    public final Task<Location> getLastLocation() {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzbe
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                new LastLocationRequest.a();
                ((zzda) obj).zzt(new LastLocationRequest(Long.MAX_VALUE, 0, false, null, null), (C37028k) obj2);
            }
        };
        aVarA.f348955d = 2414;
        return doRead(aVarA.a());
    }

    public final Task<LocationAvailability> getLocationAvailability() {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzba
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C36616a.g gVar = zzbp.f350458k;
                ((C37028k) obj2).b(((zzda) obj).zzp());
            }
        };
        aVarA.f348955d = 2416;
        return doRead(aVarA.a());
    }

    public final Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzbg
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C36616a.g gVar = zzbp.f350458k;
                ((zzda) obj).zzD(pendingIntent, (C37028k) obj2, null);
            }
        };
        aVarA.f348955d = 2418;
        return doWrite(aVarA.a());
    }

    public final Task<Void> requestLocationUpdates(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzaz
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C36616a.g gVar = zzbp.f350458k;
                ((zzda) obj).zzw(pendingIntent, locationRequest, (C37028k) obj2);
            }
        };
        aVarA.f348955d = 2417;
        return doWrite(aVarA.a());
    }

    public final Task<Void> setMockLocation(final Location location) {
        C36729v.b(location != null);
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzaw
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C36616a.g gVar = zzbp.f350458k;
                ((zzda) obj).zzz(location, (C37028k) obj2);
            }
        };
        aVarA.f348955d = 2421;
        return doWrite(aVarA.a());
    }

    public final Task<Void> setMockMode(final boolean z12) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzbb
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C36616a.g gVar = zzbp.f350458k;
                ((zzda) obj).zzA(z12, (C37028k) obj2);
            }
        };
        aVarA.f348955d = 2420;
        return doWrite(aVarA.a());
    }

    public zzbp(Context context) {
        super(context, (C36616a<C36616a.d.C10620d>) zzb, C36616a.d.f348913j2, h.a.f348930c);
    }

    public final Task<Location> getLastLocation(final LastLocationRequest lastLocationRequest) {
        A.a aVarA = A.a();
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.internal.location.zzbj
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C36616a.g gVar = zzbp.f350458k;
                ((zzda) obj).zzt(lastLocationRequest, (C37028k) obj2);
            }
        };
        aVarA.f348955d = 2414;
        aVarA.f348954c = new Feature[]{K.f354205c};
        return doRead(aVarA.a());
    }

    @Override // com.google.android.gms.location.InterfaceC36781b
    public final Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        return doUnregisterEventListener(C36660o.c(locationCallback, "LocationCallback"), 2418).i(zzbk.zza, new InterfaceC37020c() { // from class: com.google.android.gms.internal.location.zzbc
            @Override // com.google.android.gms.tasks.InterfaceC37020c
            public final Object then(Task task) {
                C36616a.g gVar = zzbp.f350458k;
                return null;
            }
        });
    }

    @Override // com.google.android.gms.location.InterfaceC36781b
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, @P Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C36729v.k(looper, "invalid null looper");
        }
        return d(locationRequest, C36660o.a(looper, locationCallback, "LocationCallback"));
    }

    public final Task<Void> removeLocationUpdates(InterfaceC36788i interfaceC36788i) {
        return doUnregisterEventListener(C36660o.c(interfaceC36788i, InterfaceC36788i.class.getSimpleName()), 2418).i(zzbk.zza, new InterfaceC37020c() { // from class: com.google.android.gms.internal.location.zzbl
            @Override // com.google.android.gms.tasks.InterfaceC37020c
            public final Object then(Task task) {
                C36616a.g gVar = zzbp.f350458k;
                return null;
            }
        });
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, InterfaceC36788i interfaceC36788i, @P Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C36729v.k(looper, "invalid null looper");
        }
        return e(locationRequest, C36660o.a(looper, interfaceC36788i, InterfaceC36788i.class.getSimpleName()));
    }

    public final Task<Location> getCurrentLocation(CurrentLocationRequest currentLocationRequest, @P AbstractC37018a abstractC37018a) {
        if (abstractC37018a != null) {
            C36729v.a("cancellationToken may not be already canceled", !abstractC37018a.a());
        }
        A.a aVarA = A.a();
        aVarA.f348952a = new zzbh(currentLocationRequest, abstractC37018a);
        aVarA.f348955d = 2415;
        Task<Location> taskDoRead = doRead(aVarA.a());
        if (abstractC37018a == null) {
            return taskDoRead;
        }
        C37028k c37028k = new C37028k(abstractC37018a);
        taskDoRead.j(new zzbi(c37028k));
        return c37028k.f355672a;
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, LocationCallback locationCallback) {
        return d(locationRequest, C36660o.b(locationCallback, "LocationCallback", executor));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, InterfaceC36788i interfaceC36788i) {
        return e(locationRequest, C36660o.b(interfaceC36788i, InterfaceC36788i.class.getSimpleName(), executor));
    }
}
