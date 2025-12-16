package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36621f;
import com.google.android.gms.common.api.Scope;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import j.InterfaceC42153i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36699e<T extends IInterface> {

    @RX0.a
    public static final int CONNECT_STATE_CONNECTED = 4;

    @RX0.a
    public static final int CONNECT_STATE_DISCONNECTED = 1;

    @RX0.a
    public static final int CONNECT_STATE_DISCONNECTING = 5;

    @j.N
    @RX0.a
    public static final String DEFAULT_ACCOUNT = "<<default account>>";

    /* renamed from: E, reason: collision with root package name */
    public static final Feature[] f349393E = new Feature[0];

    @j.N
    @RX0.a
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    @j.N
    @RX0.a
    public static final String KEY_PENDING_INTENT = "pendingIntent";

    /* renamed from: b, reason: collision with root package name */
    public int f349398b;

    /* renamed from: c, reason: collision with root package name */
    public long f349399c;

    /* renamed from: d, reason: collision with root package name */
    public long f349400d;

    /* renamed from: e, reason: collision with root package name */
    public int f349401e;

    /* renamed from: f, reason: collision with root package name */
    public long f349402f;

    /* renamed from: h, reason: collision with root package name */
    @j.k0
    public M0 f349404h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f349405i;

    /* renamed from: j, reason: collision with root package name */
    public final Looper f349406j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC36711k f349407k;

    /* renamed from: l, reason: collision with root package name */
    public final C36688g f349408l;

    /* renamed from: m, reason: collision with root package name */
    public final Handler f349409m;

    /* renamed from: p, reason: collision with root package name */
    @InterfaceC25600a
    @j.P
    public InterfaceC36723q f349412p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    @j.k0
    public c f349413q;

    /* renamed from: r, reason: collision with root package name */
    @InterfaceC25600a
    @j.P
    public IInterface f349414r;

    /* renamed from: t, reason: collision with root package name */
    @InterfaceC25600a
    @j.P
    public w0 f349416t;

    /* renamed from: v, reason: collision with root package name */
    @j.P
    public final a f349418v;

    /* renamed from: w, reason: collision with root package name */
    @j.P
    public final b f349419w;

    /* renamed from: x, reason: collision with root package name */
    public final int f349420x;

    /* renamed from: y, reason: collision with root package name */
    @j.P
    public final String f349421y;

    /* renamed from: z, reason: collision with root package name */
    @j.P
    public volatile String f349422z;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public volatile String f349403g = null;

    /* renamed from: n, reason: collision with root package name */
    public final Object f349410n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final Object f349411o = new Object();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f349415s = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    @InterfaceC25600a
    public int f349417u = 1;

    /* renamed from: A, reason: collision with root package name */
    @j.P
    public ConnectionResult f349394A = null;

    /* renamed from: B, reason: collision with root package name */
    public boolean f349395B = false;

    /* renamed from: C, reason: collision with root package name */
    @j.P
    public volatile zzk f349396C = null;

    /* renamed from: D, reason: collision with root package name */
    @j.N
    @j.k0
    public final AtomicInteger f349397D = new AtomicInteger(0);

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.internal.e$a */
    public interface a {
        @RX0.a
        void onConnected(@j.P Bundle bundle);

        @RX0.a
        void onConnectionSuspended(int i12);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.internal.e$b */
    public interface b {
        @RX0.a
        void onConnectionFailed(@j.N ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.internal.e$c */
    public interface c {
        @RX0.a
        void a(@j.N ConnectionResult connectionResult);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    /* renamed from: com.google.android.gms.common.internal.e$d */
    public class d implements c {
        @RX0.a
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC36699e.c
        public final void a(@j.N ConnectionResult connectionResult) {
            boolean zI2 = connectionResult.i();
            AbstractC36699e abstractC36699e = AbstractC36699e.this;
            if (zI2) {
                abstractC36699e.getRemoteService(null, abstractC36699e.g());
                return;
            }
            b bVar = abstractC36699e.f349419w;
            if (bVar != null) {
                bVar.onConnectionFailed(connectionResult);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
    @RX0.a
    /* renamed from: com.google.android.gms.common.internal.e$e, reason: collision with other inner class name */
    public interface InterfaceC10622e {
        @RX0.a
        void a();
    }

    @j.k0
    @RX0.a
    public AbstractC36699e(@j.N Context context, @j.N Looper looper, @j.N AbstractC36711k abstractC36711k, @j.N C36688g c36688g, int i12, @j.P a aVar, @j.P b bVar, @j.P String str) {
        C36729v.k(context, "Context must not be null");
        this.f349405i = context;
        C36729v.k(looper, "Looper must not be null");
        this.f349406j = looper;
        C36729v.k(abstractC36711k, "Supervisor must not be null");
        this.f349407k = abstractC36711k;
        C36729v.k(c36688g, "API availability must not be null");
        this.f349408l = c36688g;
        this.f349409m = new t0(this, looper);
        this.f349420x = i12;
        this.f349418v = aVar;
        this.f349419w = bVar;
        this.f349421y = str;
    }

    public static /* bridge */ /* synthetic */ boolean k(AbstractC36699e abstractC36699e, int i12, int i13, IInterface iInterface) {
        synchronized (abstractC36699e.f349410n) {
            try {
                if (abstractC36699e.f349417u != i12) {
                    return false;
                }
                abstractC36699e.l(i13, iInterface);
                return true;
            } finally {
            }
        }
    }

    @RX0.a
    public void checkAvailabilityAndConnect() {
        int iC2 = this.f349408l.c(getMinApkVersion(), this.f349405i);
        if (iC2 == 0) {
            connect(new d());
            return;
        }
        l(1, null);
        this.f349413q = new d();
        int i12 = this.f349397D.get();
        Handler handler = this.f349409m;
        handler.sendMessage(handler.obtainMessage(3, i12, iC2, null));
    }

    @RX0.a
    public void connect(@j.N c cVar) {
        C36729v.k(cVar, "Connection progress callbacks cannot be null.");
        this.f349413q = cVar;
        l(2, null);
    }

    @RX0.a
    public void disconnect() {
        this.f349397D.incrementAndGet();
        synchronized (this.f349415s) {
            try {
                int size = this.f349415s.size();
                for (int i12 = 0; i12 < size; i12++) {
                    u0 u0Var = (u0) this.f349415s.get(i12);
                    synchronized (u0Var) {
                        u0Var.f349467a = null;
                    }
                }
                this.f349415s.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f349411o) {
            this.f349412p = null;
        }
        l(1, null);
    }

    @RX0.a
    public void dump(@j.N String str, @j.N FileDescriptor fileDescriptor, @j.N PrintWriter printWriter, @j.N String[] strArr) {
        int i12;
        IInterface iInterface;
        InterfaceC36723q interfaceC36723q;
        synchronized (this.f349410n) {
            i12 = this.f349417u;
            iInterface = this.f349414r;
        }
        synchronized (this.f349411o) {
            interfaceC36723q = this.f349412p;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i12 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i12 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i12 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i12 == 4) {
            printWriter.print("CONNECTED");
        } else if (i12 != 5) {
            printWriter.print(GrsBaseInfo.CountryCodeSource.UNKNOWN);
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) h()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC36723q == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC36723q.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f349400d > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j12 = this.f349400d;
            printWriterAppend.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
        if (this.f349399c > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i13 = this.f349398b;
            if (i13 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i13 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i13 != 3) {
                printWriter.append((CharSequence) String.valueOf(i13));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j13 = this.f349399c;
            printWriterAppend2.println(j13 + " " + simpleDateFormat.format(new Date(j13)));
        }
        if (this.f349402f > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C36621f.a(this.f349401e));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j14 = this.f349402f;
            printWriterAppend3.println(j14 + " " + simpleDateFormat.format(new Date(j14)));
        }
    }

    @RX0.a
    @j.P
    public abstract T e(@j.N IBinder iBinder);

    @j.N
    @RX0.a
    public Bundle f() {
        return new Bundle();
    }

    @j.N
    @RX0.a
    public Set<Scope> g() {
        return Collections.emptySet();
    }

    @RX0.a
    @j.P
    public Account getAccount() {
        return null;
    }

    @j.N
    @RX0.a
    public Feature[] getApiFeatures() {
        return f349393E;
    }

    @RX0.a
    @j.P
    public final Feature[] getAvailableFeatures() {
        zzk zzkVar = this.f349396C;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f349495c;
    }

    @RX0.a
    @j.P
    public Bundle getConnectionHint() {
        return null;
    }

    @j.N
    @RX0.a
    public final Context getContext() {
        return this.f349405i;
    }

    @j.N
    @RX0.a
    public String getEndpointPackageName() {
        if (!isConnected() || this.f349404h == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    @RX0.a
    public int getGCoreServiceId() {
        return this.f349420x;
    }

    @RX0.a
    @j.P
    public String getLastDisconnectMessage() {
        return this.f349403g;
    }

    @j.N
    @RX0.a
    public final Looper getLooper() {
        return this.f349406j;
    }

    @RX0.a
    public int getMinApkVersion() {
        return C36688g.f349288a;
    }

    @RX0.a
    @j.l0
    public void getRemoteService(@j.P InterfaceC36717n interfaceC36717n, @j.N Set<Scope> set) {
        Bundle bundleF = f();
        String str = this.f349422z;
        int i12 = C36688g.f349288a;
        Scope[] scopeArr = GetServiceRequest.f349326p;
        Bundle bundle = new Bundle();
        int i13 = this.f349420x;
        Feature[] featureArr = GetServiceRequest.f349327q;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i13, i12, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f349331e = this.f349405i.getPackageName();
        getServiceRequest.f349334h = bundleF;
        if (set != null) {
            getServiceRequest.f349333g = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f349335i = account;
            if (interfaceC36717n != null) {
                getServiceRequest.f349332f = interfaceC36717n.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f349335i = getAccount();
        }
        getServiceRequest.f349336j = f349393E;
        getServiceRequest.f349337k = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f349340n = true;
        }
        try {
            try {
                synchronized (this.f349411o) {
                    try {
                        InterfaceC36723q interfaceC36723q = this.f349412p;
                        if (interfaceC36723q != null) {
                            interfaceC36723q.V1(new v0(this, this.f349397D.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i14 = this.f349397D.get();
                x0 x0Var = new x0(this, 8, null, null);
                Handler handler = this.f349409m;
                handler.sendMessage(handler.obtainMessage(1, i14, -1, x0Var));
            }
        } catch (DeadObjectException unused2) {
            triggerConnectionSuspended(3);
        } catch (SecurityException e12) {
            throw e12;
        }
    }

    @j.N
    @RX0.a
    public final T getService() {
        T t12;
        synchronized (this.f349410n) {
            try {
                if (this.f349417u == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                t12 = (T) this.f349414r;
                C36729v.k(t12, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t12;
    }

    @RX0.a
    @j.P
    public IBinder getServiceBrokerBinder() {
        synchronized (this.f349411o) {
            try {
                InterfaceC36723q interfaceC36723q = this.f349412p;
                if (interfaceC36723q == null) {
                    return null;
                }
                return interfaceC36723q.asBinder();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @j.N
    @RX0.a
    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @RX0.a
    @j.P
    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzk zzkVar = this.f349396C;
        if (zzkVar == null) {
            return null;
        }
        return zzkVar.f349497e;
    }

    @j.N
    @RX0.a
    public abstract String h();

    @RX0.a
    public boolean hasConnectionInfo() {
        return this.f349396C != null;
    }

    @j.N
    @RX0.a
    public abstract String i();

    @RX0.a
    public boolean isConnected() {
        boolean z12;
        synchronized (this.f349410n) {
            z12 = this.f349417u == 4;
        }
        return z12;
    }

    @RX0.a
    public boolean isConnecting() {
        boolean z12;
        synchronized (this.f349410n) {
            int i12 = this.f349417u;
            z12 = true;
            if (i12 != 2 && i12 != 3) {
                z12 = false;
            }
        }
        return z12;
    }

    @RX0.a
    public boolean j() {
        return getMinApkVersion() >= 211700000;
    }

    public final void l(int i12, @j.P IInterface iInterface) {
        M0 m02;
        C36729v.b((i12 == 4) == (iInterface != null));
        synchronized (this.f349410n) {
            try {
                this.f349417u = i12;
                this.f349414r = iInterface;
                if (i12 == 1) {
                    w0 w0Var = this.f349416t;
                    if (w0Var != null) {
                        AbstractC36711k abstractC36711k = this.f349407k;
                        String str = this.f349404h.f349353a;
                        C36729v.j(str);
                        this.f349404h.getClass();
                        if (this.f349421y == null) {
                            this.f349405i.getClass();
                        }
                        boolean z12 = this.f349404h.f349354b;
                        abstractC36711k.getClass();
                        abstractC36711k.b(new F0(str, z12), w0Var);
                        this.f349416t = null;
                    }
                } else if (i12 == 2 || i12 == 3) {
                    w0 w0Var2 = this.f349416t;
                    if (w0Var2 != null && (m02 = this.f349404h) != null) {
                        String str2 = m02.f349353a;
                        AbstractC36711k abstractC36711k2 = this.f349407k;
                        C36729v.j(str2);
                        this.f349404h.getClass();
                        if (this.f349421y == null) {
                            this.f349405i.getClass();
                        }
                        boolean z13 = this.f349404h.f349354b;
                        abstractC36711k2.getClass();
                        abstractC36711k2.b(new F0(str2, z13), w0Var2);
                        this.f349397D.incrementAndGet();
                    }
                    w0 w0Var3 = new w0(this, this.f349397D.get());
                    this.f349416t = w0Var3;
                    String strI = i();
                    boolean zJ2 = j();
                    this.f349404h = new M0(strI, zJ2);
                    if (zJ2 && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f349404h.f349353a)));
                    }
                    AbstractC36711k abstractC36711k3 = this.f349407k;
                    String str3 = this.f349404h.f349353a;
                    C36729v.j(str3);
                    this.f349404h.getClass();
                    String name = this.f349421y;
                    if (name == null) {
                        name = this.f349405i.getClass().getName();
                    }
                    if (!abstractC36711k3.c(new F0(str3, this.f349404h.f349354b), w0Var3, name, null)) {
                        String str4 = this.f349404h.f349353a;
                        int i13 = this.f349397D.get();
                        y0 y0Var = new y0(this, 16);
                        Handler handler = this.f349409m;
                        handler.sendMessage(handler.obtainMessage(7, i13, -1, y0Var));
                    }
                } else if (i12 == 4) {
                    C36729v.j(iInterface);
                    this.f349400d = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    @InterfaceC42153i
    @RX0.a
    public void onConnectionSuspended(int i12) {
        this.f349398b = i12;
        this.f349399c = System.currentTimeMillis();
    }

    @RX0.a
    public void onUserSignOut(@j.N InterfaceC10622e interfaceC10622e) {
        interfaceC10622e.a();
    }

    @RX0.a
    public boolean providesSignIn() {
        return false;
    }

    @RX0.a
    public boolean requiresAccount() {
        return false;
    }

    @RX0.a
    public boolean requiresGooglePlayServices() {
        return true;
    }

    @RX0.a
    public boolean requiresSignIn() {
        return false;
    }

    @RX0.a
    public void setAttributionTag(@j.N String str) {
        this.f349422z = str;
    }

    @RX0.a
    public void triggerConnectionSuspended(int i12) {
        int i13 = this.f349397D.get();
        Handler handler = this.f349409m;
        handler.sendMessage(handler.obtainMessage(6, i13, i12));
    }

    @RX0.a
    public boolean usesClientTelemetry() {
        return false;
    }

    @RX0.a
    public void disconnect(@j.N String str) {
        this.f349403g = str;
        disconnect();
    }
}
