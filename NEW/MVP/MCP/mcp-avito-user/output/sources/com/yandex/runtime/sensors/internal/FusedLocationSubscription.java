package com.yandex.runtime.sensors.internal;

import AK.c;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.r;
import androidx.collection.C20199a;
import androidx.core.content.d;
import androidx.media3.exoplayer.analytics.m;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.A1;
import com.google.android.gms.common.api.internal.C36653k0;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.location.C36799u;
import com.google.android.gms.location.InterfaceC36781b;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.signin.a;
import com.google.android.gms.signin.e;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes8.dex */
public class FusedLocationSubscription extends LocationCallback implements i.b, i.c {
    private static final String LOG_TAG = "com.yandex.runtime.sensors.internal.FusedLocationSubscription";
    private InterfaceC36781b fusedLocationProviderClient = null;
    private i googleApiClient;
    private LocationRequest locationRequest;
    NativeObject nativeObject;

    /* JADX WARN: Multi-variable type inference failed */
    public FusedLocationSubscription(float f12, int i12, NativeObject nativeObject) {
        this.nativeObject = nativeObject;
        i.a aVar = new i.a(Runtime.getApplicationContext());
        C36616a<C36616a.d.C10620d> c36616a = LocationServices.API;
        C36729v.k(c36616a, "Api must not be null");
        aVar.f348942g.put(c36616a, null);
        C36616a.AbstractC10618a abstractC10618a = c36616a.f348910a;
        C36729v.k(abstractC10618a, "Base client builder must not be null");
        List<Scope> impliedScopes = abstractC10618a.getImpliedScopes(null);
        aVar.f348937b.addAll(impliedScopes);
        aVar.f348936a.addAll(impliedScopes);
        aVar.f348947l.add(this);
        aVar.f348948m.add(this);
        C36729v.a("must call addApi() to add at least one API", !aVar.f348942g.isEmpty());
        a aVar2 = a.f355598b;
        C20199a c20199a = aVar.f348942g;
        C36616a c36616a2 = e.f355600b;
        C36703g c36703g = new C36703g(null, aVar.f348936a, aVar.f348940e, aVar.f348938c, aVar.f348939d, c20199a.containsKey(c36616a2) ? (a) c20199a.get(c36616a2) : aVar2);
        Map map = c36703g.f349427d;
        C20199a c20199a2 = new C20199a();
        C20199a c20199a3 = new C20199a();
        ArrayList arrayList = new ArrayList();
        C36616a c36616a3 = null;
        boolean z12 = false;
        for (C36616a c36616a4 : aVar.f348942g.keySet()) {
            V v12 = aVar.f348942g.get(c36616a4);
            boolean z13 = map.get(c36616a4) != null;
            c20199a2.put(c36616a4, Boolean.valueOf(z13));
            A1 a12 = new A1(c36616a4, z13);
            arrayList.add(a12);
            C36616a.AbstractC10618a abstractC10618a2 = c36616a4.f348910a;
            C36729v.j(abstractC10618a2);
            C36616a.f fVarBuildClient = abstractC10618a2.buildClient(aVar.f348941f, aVar.f348944i, c36703g, (C36703g) v12, (i.b) a12, (i.c) a12);
            c20199a3.put(c36616a4.f348911b, fVarBuildClient);
            z12 = abstractC10618a2.getPriority() == 1 ? v12 != 0 : z12;
            if (fVarBuildClient.providesSignIn()) {
                if (c36616a3 != null) {
                    throw new IllegalStateException(r.r(c36616a4.f348912c, " cannot be used with ", c36616a3.f348912c));
                }
                c36616a3 = c36616a4;
            }
        }
        if (c36616a3 != null) {
            if (z12) {
                throw new IllegalStateException(c.k("With using ", c36616a3.f348912c, ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
            }
            boolean zEquals = aVar.f348936a.equals(aVar.f348937b);
            String str = c36616a3.f348912c;
            if (!zEquals) {
                throw new IllegalStateException(c.k("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
            }
        }
        C36653k0 c36653k0 = new C36653k0(aVar.f348941f, new ReentrantLock(), aVar.f348944i, c36703g, aVar.f348945j, aVar.f348946k, c20199a2, aVar.f348947l, aVar.f348948m, c20199a3, aVar.f348943h, C36653k0.n(c20199a3.values(), true), arrayList);
        Set set = i.f348935a;
        synchronized (set) {
            set.add(c36653k0);
        }
        if (aVar.f348943h >= 0) {
            LifecycleCallback.c(null);
            throw null;
        }
        this.googleApiClient = c36653k0;
        LocationRequest locationRequestH = LocationRequest.h();
        if (f12 < 0.0f) {
            throw new IllegalArgumentException(m.i(f12, "invalid displacement: "));
        }
        locationRequestH.f354226h = f12;
        locationRequestH.j(i12);
        C36799u.a(100);
        locationRequestH.f354220b = 100;
        this.locationRequest = locationRequestH;
        this.googleApiClient.d();
    }

    public static final boolean fusedLocationProviderAvailable() {
        return C36687f.f349287e.c(C36688g.f349288a, Runtime.getApplicationContext()) == 0 && getPlayServicesVersion() >= 11600000;
    }

    private static long getPlayServicesVersion() {
        try {
            return Runtime.getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    public static native void locationChanged(NativeObject nativeObject, Location location);

    public static native void statusChanged(NativeObject nativeObject, boolean z12);

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public void onConnected(Bundle bundle) {
        if (d.checkSelfPermission(Runtime.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        InterfaceC36781b fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(Runtime.getApplicationContext());
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        fusedLocationProviderClient.requestLocationUpdates(this.locationRequest, this, Looper.getMainLooper());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36664q
    public void onConnectionFailed(ConnectionResult connectionResult) {
        statusChanged(this.nativeObject, false);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36637f
    public void onConnectionSuspended(int i12) {
        statusChanged(this.nativeObject, false);
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        locationChanged(this.nativeObject, locationResult.h());
    }

    public void stop() {
        statusChanged(this.nativeObject, false);
        InterfaceC36781b interfaceC36781b = this.fusedLocationProviderClient;
        if (interfaceC36781b != null) {
            interfaceC36781b.removeLocationUpdates(this);
        }
        this.googleApiClient.e();
    }
}
