package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.internal.AbstractC36711k;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.util.InterfaceC36753g;
import com.google.android.gms.internal.measurement.zzcv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import shark.AndroidResourceIdNames;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.w4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36996w4 extends AbstractC36847b1 {

    /* renamed from: c, reason: collision with root package name */
    public final Q4 f355423c;

    /* renamed from: d, reason: collision with root package name */
    public L1 f355424d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f355425e;

    /* renamed from: f, reason: collision with root package name */
    public final C36989v4 f355426f;

    /* renamed from: g, reason: collision with root package name */
    public final C36949p5 f355427g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f355428h;

    /* renamed from: i, reason: collision with root package name */
    public final J4 f355429i;

    public C36996w4(I2 i22) {
        super(i22);
        this.f355428h = new ArrayList();
        this.f355427g = new C36949p5(i22.f354722n);
        this.f355423c = new Q4(this);
        this.f355426f = new C36989v4(this, i22);
        this.f355429i = new J4(this, i22);
    }

    public static void Q(C36996w4 c36996w4) {
        super.e();
        if (c36996w4.J()) {
            super.zzj().f354897n.b("Inactivity, disconnecting from the service");
            c36996w4.G();
        }
    }

    public static void t(C36996w4 c36996w4, ComponentName componentName) {
        super.e();
        if (c36996w4.f355424d != null) {
            c36996w4.f355424d = null;
            super.zzj().f354897n.c("Disconnected from device MeasurementService", componentName);
            super.e();
            c36996w4.F();
        }
    }

    @j.l0
    public final void A(AtomicReference atomicReference, String str, String str2) {
        super.e();
        i();
        v(new P4(this, atomicReference, str, str2, P(false)));
    }

    @j.l0
    public final void B(AtomicReference atomicReference, String str, String str2, boolean z12) {
        super.e();
        i();
        v(new R4(this, atomicReference, str, str2, P(false), z12));
    }

    @j.l0
    public final void C(boolean z12) {
        super.e();
        i();
        if (z12) {
            this.f355183a.l().r();
        }
        if (L()) {
            v(new K4(this, P(false)));
        }
    }

    @j.l0
    public final zzaj D() {
        super.e();
        i();
        L1 l12 = this.f355424d;
        if (l12 == null) {
            F();
            super.zzj().f354896m.b("Failed to get consents; not connected to service yet.");
            return null;
        }
        try {
            zzaj zzajVarG1 = l12.g1(P(false));
            O();
            return zzajVarG1;
        } catch (RemoteException e12) {
            super.zzj().f354889f.c("Failed to get consents; remote exception", e12);
            return null;
        }
    }

    @j.l0
    public final void E() {
        super.e();
        i();
        zzo zzoVarP = P(true);
        this.f355183a.l().n(3, new byte[0]);
        v(new D4(this, zzoVarP));
    }

    @j.l0
    public final void F() {
        super.e();
        i();
        if (J()) {
            return;
        }
        if (M()) {
            Q4 q42 = this.f355423c;
            super.e();
            Context context = q42.f354864d.f355183a.f354709a;
            synchronized (q42) {
                try {
                    if (q42.f354862b) {
                        super.zzj().f354897n.b("Connection attempt already in progress");
                        return;
                    }
                    if (q42.f354863c != null && (q42.f354863c.isConnecting() || q42.f354863c.isConnected())) {
                        super.zzj().f354897n.b("Already awaiting connection attempt");
                        return;
                    }
                    q42.f354863c = new T1(context, Looper.getMainLooper(), AbstractC36711k.a(context), C36688g.f349289b, 93, q42, q42, null);
                    super.zzj().f354897n.b("Connecting to remote service");
                    q42.f354862b = true;
                    C36729v.j(q42.f354863c);
                    q42.f354863c.checkAvailabilityAndConnect();
                    return;
                } finally {
                }
            }
        }
        if (this.f355183a.f354715g.u()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = this.f355183a.f354709a.getPackageManager().queryIntentServices(new Intent().setClassName(this.f355183a.f354709a, "com.google.android.gms.measurement.AppMeasurementService"), AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            super.zzj().f354889f.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(this.f355183a.f354709a, "com.google.android.gms.measurement.AppMeasurementService"));
        Q4 q43 = this.f355423c;
        super.e();
        Context context2 = q43.f354864d.f355183a.f354709a;
        ZX0.a aVarB = ZX0.a.b();
        synchronized (q43) {
            try {
                if (q43.f354862b) {
                    super.zzj().f354897n.b("Connection attempt already in progress");
                    return;
                }
                super.zzj().f354897n.b("Using local app measurement service");
                q43.f354862b = true;
                aVarB.a(context2, intent, q43.f354864d.f355423c, 129);
            } finally {
            }
        }
    }

    @j.l0
    public final void G() {
        super.e();
        i();
        Q4 q42 = this.f355423c;
        if (q42.f354863c != null && (q42.f354863c.isConnected() || q42.f354863c.isConnecting())) {
            q42.f354863c.disconnect();
        }
        q42.f354863c = null;
        try {
            ZX0.a.b().c(this.f355183a.f354709a, this.f355423c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f355424d = null;
    }

    @j.l0
    public final void H() {
        super.e();
        i();
        zzo zzoVarP = P(false);
        this.f355183a.l().r();
        v(new C4(this, zzoVarP));
    }

    @j.l0
    public final void I() {
        super.e();
        i();
        v(new L4(this, P(true)));
    }

    @j.l0
    public final boolean J() {
        super.e();
        i();
        return this.f355424d != null;
    }

    @j.l0
    public final boolean K() {
        super.e();
        i();
        return !M() || super.c().l0() >= 200900;
    }

    @j.l0
    public final boolean L() {
        super.e();
        i();
        return !M() || super.c().l0() >= E.f354632m0.a(null).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    @j.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean M() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C36996w4.M():boolean");
    }

    @j.l0
    public final void N() {
        super.e();
        S1 s1Zzj = super.zzj();
        ArrayList arrayList = this.f355428h;
        s1Zzj.f354897n.c("Processing queued up service tasks", Integer.valueOf(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e12) {
                super.zzj().f354889f.c("Task exception while flushing queue", e12);
            }
        }
        arrayList.clear();
        this.f355429i.a();
    }

    @j.l0
    public final void O() {
        super.e();
        C36949p5 c36949p5 = this.f355427g;
        c36949p5.f355313a.getClass();
        c36949p5.f355314b = SystemClock.elapsedRealtime();
        this.f355426f.b(E.f354580K.a(null).longValue());
    }

    @j.l0
    public final zzo P(boolean z12) {
        return this.f355183a.k().l(z12 ? super.zzj().s() : null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC36847b1
    public final boolean k() {
        return false;
    }

    @j.l0
    public final void l(Bundle bundle) {
        super.e();
        i();
        v(new F4(this, P(false), bundle));
    }

    @j.l0
    public final void m(zzcv zzcvVar) {
        super.e();
        i();
        v(new E4(this, P(false), zzcvVar));
    }

    @j.l0
    public final void n(zzcv zzcvVar, zzbe zzbeVar, String str) {
        super.e();
        i();
        if (C36688g.f349289b.c(12451000, super.c().f355183a.f354709a) == 0) {
            v(new I4(this, zzbeVar, str, zzcvVar));
        } else {
            super.zzj().f354892i.b("Not bundling data. Service unavailable or out of date");
            super.c().E(zzcvVar, new byte[0]);
        }
    }

    @j.l0
    public final void o(zzae zzaeVar) {
        super.e();
        i();
        v(new M4(this, P(true), this.f355183a.l().o(zzaeVar), new zzae(zzaeVar), zzaeVar));
    }

    @j.l0
    public final void p(zzbe zzbeVar, String str) {
        super.e();
        i();
        v(new N4(this, P(true), this.f355183a.l().p(zzbeVar), zzbeVar));
    }

    @j.l0
    public final void q(L1 l12) {
        super.e();
        C36729v.j(l12);
        this.f355424d = l12;
        O();
        N();
    }

    @j.l0
    public final void r(L1 l12, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) {
        int size;
        super.e();
        i();
        int i12 = 0;
        int i13 = 100;
        while (i12 < 1001 && i13 == 100) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayListM = this.f355183a.l().m();
            if (arrayListM != null) {
                arrayList.addAll(arrayListM);
                size = arrayListM.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj = arrayList.get(i14);
                i14++;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) obj;
                if (abstractSafeParcelable2 instanceof zzbe) {
                    try {
                        l12.U1((zzbe) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e12) {
                        super.zzj().f354889f.c("Failed to send event to the service", e12);
                    }
                } else if (abstractSafeParcelable2 instanceof zznb) {
                    try {
                        l12.Y0((zznb) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e13) {
                        super.zzj().f354889f.c("Failed to send user property to the service", e13);
                    }
                } else if (abstractSafeParcelable2 instanceof zzae) {
                    try {
                        l12.w2((zzae) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e14) {
                        super.zzj().f354889f.c("Failed to send conditional user property to the service", e14);
                    }
                } else {
                    super.zzj().f354889f.b("Discarding data. Unrecognized parcel type.");
                }
            }
            i12++;
            i13 = size;
        }
    }

    @j.l0
    public final void s(C36941o4 c36941o4) {
        super.e();
        i();
        v(new H4(this, c36941o4));
    }

    @j.l0
    public final void u(zznb zznbVar) {
        super.e();
        i();
        v(new RunnableC37017z4(this, P(true), this.f355183a.l().q(zznbVar), zznbVar));
    }

    @j.l0
    public final void v(Runnable runnable) {
        super.e();
        if (J()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f355428h;
        if (arrayList.size() >= 1000) {
            super.zzj().f354889f.b("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f355429i.b(60000L);
        F();
    }

    @j.l0
    public final void w(String str, String str2, zzcv zzcvVar) {
        super.e();
        i();
        v(new O4(this, str, str2, P(false), zzcvVar));
    }

    @j.l0
    public final void x(String str, String str2, boolean z12, zzcv zzcvVar) {
        super.e();
        i();
        v(new RunnableC37010y4(this, str, str2, P(false), z12, zzcvVar));
    }

    @j.l0
    public final void y(AtomicReference<String> atomicReference) {
        super.e();
        i();
        v(new B4(this, atomicReference, P(false)));
    }

    @j.l0
    public final void z(AtomicReference<List<zzmh>> atomicReference, Bundle bundle) {
        super.e();
        i();
        v(new A4(this, atomicReference, P(false), bundle));
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final Context zza() {
        return this.f355183a.f354709a;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final InterfaceC36753g zzb() {
        return this.f355183a.f354722n;
    }

    @Override // com.google.android.gms.measurement.internal.C36891h3, com.google.android.gms.measurement.internal.InterfaceC36905j3
    @Pure
    public final C36852c zzd() {
        return this.f355183a.f354714f;
    }
}
