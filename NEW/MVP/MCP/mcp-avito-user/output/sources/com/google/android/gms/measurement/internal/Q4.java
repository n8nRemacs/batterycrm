package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC36699e;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class Q4 implements ServiceConnection, AbstractC36699e.a, AbstractC36699e.b {

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f354862b;

    /* renamed from: c, reason: collision with root package name */
    public volatile T1 f354863c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C36996w4 f354864d;

    public Q4(C36996w4 c36996w4) {
        this.f354864d = c36996w4;
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e.a
    @j.K
    public final void onConnected(Bundle bundle) {
        C36729v.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                C36729v.j(this.f354863c);
                this.f354864d.zzl().n(new V4(this, this.f354863c.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f354863c = null;
                this.f354862b = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e.b
    @j.K
    public final void onConnectionFailed(@j.N ConnectionResult connectionResult) {
        C36729v.e("MeasurementServiceConnection.onConnectionFailed");
        S1 s12 = this.f354864d.f355183a.f354717i;
        if (s12 == null || !s12.f355168b) {
            s12 = null;
        }
        if (s12 != null) {
            s12.f354892i.c("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f354862b = false;
            this.f354863c = null;
        }
        this.f354864d.zzl().n(new X4(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC36699e.a
    @j.K
    public final void onConnectionSuspended(int i12) {
        C36729v.e("MeasurementServiceConnection.onConnectionSuspended");
        C36996w4 c36996w4 = this.f354864d;
        c36996w4.zzj().f354896m.b("Service connection suspended");
        c36996w4.zzl().n(new U4(this));
    }

    @Override // android.content.ServiceConnection
    @j.K
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C36729v.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f354862b = false;
                this.f354864d.zzj().f354889f.b("Service connected with null binder");
                return;
            }
            L1 n12 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    n12 = iInterfaceQueryLocalInterface instanceof L1 ? (L1) iInterfaceQueryLocalInterface : new N1(iBinder);
                    this.f354864d.zzj().f354897n.b("Bound to IMeasurementService interface");
                } else {
                    this.f354864d.zzj().f354889f.c("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f354864d.zzj().f354889f.b("Service connect failed to get IMeasurementService");
            }
            if (n12 == null) {
                this.f354862b = false;
                try {
                    ZX0.a aVarB = ZX0.a.b();
                    C36996w4 c36996w4 = this.f354864d;
                    aVarB.c(c36996w4.f355183a.f354709a, c36996w4.f355423c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f354864d.zzl().n(new T4(this, n12));
            }
        }
    }

    @Override // android.content.ServiceConnection
    @j.K
    public final void onServiceDisconnected(ComponentName componentName) {
        C36729v.e("MeasurementServiceConnection.onServiceDisconnected");
        C36996w4 c36996w4 = this.f354864d;
        c36996w4.zzj().f354896m.b("Service disconnected");
        c36996w4.zzl().n(new S4(this, componentName));
    }
}
