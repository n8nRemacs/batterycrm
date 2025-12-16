package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.api.internal.C36660o;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.InterfaceC36788i;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.InterfaceC37022e;
import com.google.android.gms.tasks.Task;
import j.a0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes6.dex */
public final class zzau implements FusedLocationProviderApi {
    public static C37028k a(final C36634e.b bVar) {
        C37028k c37028k = new C37028k();
        c37028k.f355672a.c(new InterfaceC37022e() { // from class: com.google.android.gms.internal.location.zzah
            @Override // com.google.android.gms.tasks.InterfaceC37022e
            public final void onComplete(Task task) {
                C36634e.b bVar2 = bVar;
                if (task.r()) {
                    bVar2.setResult(Status.f348900f);
                    return;
                }
                if (task.p()) {
                    bVar2.setFailedResult(Status.f348904j);
                    return;
                }
                Exception excM = task.m();
                if (excM instanceof ApiException) {
                    bVar2.setFailedResult(((ApiException) excM).f348894b);
                } else {
                    bVar2.setFailedResult(Status.f348902h);
                }
            }
        });
        return c37028k;
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final m<Status> flushLocations(i iVar) {
        return iVar.g(new zzaj(iVar));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @a0
    public final Location getLastLocation(i iVar) throws Throwable {
        boolean zAwait;
        boolean z12 = false;
        C36729v.a("GoogleApiClient parameter is required.", iVar != null);
        zzda zzdaVar = (zzda) iVar.h(zzbp.f350458k);
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        C37028k c37028k = new C37028k();
        try {
            new LastLocationRequest.a();
            zzdaVar.zzt(new LastLocationRequest(Long.MAX_VALUE, 0, false, null, null), c37028k);
            c37028k.f355672a.c(new InterfaceC37022e() { // from class: com.google.android.gms.internal.location.zzai
                @Override // com.google.android.gms.tasks.InterfaceC37022e
                public final void onComplete(Task task) {
                    AtomicReference atomicReference2 = atomicReference;
                    CountDownLatch countDownLatch2 = countDownLatch;
                    if (task.r()) {
                        atomicReference2.set((Location) task.n());
                    }
                    countDownLatch2.countDown();
                }
            });
            try {
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                long jNanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            zAwait = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            z12 = true;
                            if (z12) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = jNanoTime - System.nanoTime();
                        z12 = true;
                    }
                }
                if (z12) {
                    Thread.currentThread().interrupt();
                }
                if (zAwait) {
                    return (Location) atomicReference.get();
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @a0
    public final LocationAvailability getLocationAvailability(i iVar) {
        C36729v.a("GoogleApiClient parameter is required.", iVar != null);
        try {
            return ((zzda) iVar.h(zzbp.f350458k)).zzp();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final m<Status> removeLocationUpdates(i iVar, PendingIntent pendingIntent) {
        return iVar.g(new zzao(iVar, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @a0
    public final m<Status> requestLocationUpdates(i iVar, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return iVar.g(new zzam(iVar, locationRequest, pendingIntent));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final m<Status> setMockLocation(i iVar, Location location) {
        return iVar.g(new zzar(iVar, location));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final m<Status> setMockMode(i iVar, boolean z12) {
        return iVar.g(new zzaq(iVar, z12));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final m<Status> removeLocationUpdates(i iVar, LocationCallback locationCallback) {
        return iVar.g(new zzap(iVar, locationCallback));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @a0
    public final m<Status> requestLocationUpdates(i iVar, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C36729v.k(looper, "invalid null looper");
        }
        return iVar.g(new zzal(iVar, C36660o.a(looper, locationCallback, "LocationCallback"), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    public final m<Status> removeLocationUpdates(i iVar, InterfaceC36788i interfaceC36788i) {
        return iVar.g(new zzan(iVar, interfaceC36788i));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @a0
    public final m<Status> requestLocationUpdates(i iVar, LocationRequest locationRequest, InterfaceC36788i interfaceC36788i) {
        Looper looperMyLooper = Looper.myLooper();
        C36729v.k(looperMyLooper, "invalid null looper");
        return iVar.g(new zzak(iVar, C36660o.a(looperMyLooper, interfaceC36788i, InterfaceC36788i.class.getSimpleName()), locationRequest));
    }

    @Override // com.google.android.gms.location.FusedLocationProviderApi
    @a0
    public final m<Status> requestLocationUpdates(i iVar, LocationRequest locationRequest, InterfaceC36788i interfaceC36788i, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            C36729v.k(looper, "invalid null looper");
        }
        return iVar.g(new zzak(iVar, C36660o.a(looper, interfaceC36788i, InterfaceC36788i.class.getSimpleName()), locationRequest));
    }
}
