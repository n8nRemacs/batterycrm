package com.avito.android.location.find;

import android.app.Activity;
import android.location.Location;
import android.location.LocationManager;
import com.avito.android.code_confirmation.code_confirmation.h0;
import com.avito.android.location.find.DetectLocationInteractor;
import com.avito.android.util.V2;
import com.google.android.gms.location.InterfaceC36781b;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;
import io.reactivex.rxjava3.core.C;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import java.lang.ref.WeakReference;
import java.util.Timer;
import qW.C47352a;
import qW.C47353b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class s implements M, C {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f181769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f181770c;

    public /* synthetic */ s(Object obj, boolean z12) {
        this.f181770c = obj;
        this.f181769b = z12;
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(io.reactivex.rxjava3.core.B b12) {
        f fVar;
        g gVar = (g) this.f181770c;
        f fVar2 = new f(b12, gVar);
        b12.f(new h0(gVar, 2));
        C47352a c47352a = gVar.f181752a;
        LocationManager locationManager = c47352a.f429290d;
        locationManager.isProviderEnabled("gps");
        boolean zIsProviderEnabled = locationManager.isProviderEnabled("network");
        if (!zIsProviderEnabled && this.f181769b) {
            c47352a.a();
        }
        if (!zIsProviderEnabled) {
            b12.g(new DetectLocationInteractor.LocationDisabledException());
            return;
        }
        c47352a.f429291e = fVar2;
        c47352a.f429294h = true;
        c47352a.f429293g = null;
        LocationManager locationManager2 = c47352a.f429290d;
        locationManager2.isProviderEnabled("gps");
        boolean zIsProviderEnabled2 = locationManager2.isProviderEnabled("network");
        if (!c47352a.f429294h || !zIsProviderEnabled2) {
            c47352a.a();
            return;
        }
        Location lastKnownLocation = locationManager2.getLastKnownLocation("gps");
        c47352a.f429293g = lastKnownLocation;
        if (lastKnownLocation == null) {
            c47352a.f429293g = locationManager2.getLastKnownLocation("network");
        }
        Location location = c47352a.f429293g;
        if (location == null) {
            if (c47352a.f429294h && zIsProviderEnabled2) {
                c47352a.f429290d.requestLocationUpdates("network", 0L, 0.0f, c47352a);
                c47352a.f429295i = true;
            }
            Timer timer = new Timer(true);
            c47352a.f429292f = timer;
            timer.schedule(new C47353b(c47352a), gVar.f181753b);
            return;
        }
        if (location == null || (fVar = c47352a.f429291e) == null) {
            return;
        }
        io.reactivex.rxjava3.core.B<Location> b13 = fVar.f181750a;
        if (b13.getF318621e()) {
            return;
        }
        fVar.f181751b.f181755d.m(location);
        V2.f318762a.b("Get network Coordinates: " + location, null);
        b13.onNext(location);
        b13.e();
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(K k12) {
        InterfaceC36781b interfaceC36781b;
        Task<Location> lastLocation;
        Activity activity;
        u uVar = (u) this.f181770c;
        B b12 = new B(uVar);
        uVar.f181772b = k12;
        WeakReference<Activity> weakReference = uVar.f181774q;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            InterfaceC36781b fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(activity);
            uVar.f181773p = fusedLocationProviderClient;
            if (fusedLocationProviderClient != null) {
                fusedLocationProviderClient.requestLocationUpdates(uVar.f181775r, b12, null);
            }
        }
        if (this.f181769b && (interfaceC36781b = uVar.f181773p) != null && (lastLocation = interfaceC36781b.getLastLocation()) != null) {
            lastLocation.g(new AJ.b(10, new t(1, uVar, u.class, "onLocationReceive", "onLocationReceive(Landroid/location/Location;)V", 0)));
        }
        k12.f(new com.avito.android.app.work.a(2, uVar, b12));
    }
}
