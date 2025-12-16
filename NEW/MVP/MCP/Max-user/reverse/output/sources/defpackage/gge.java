package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.TrafficStats;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* loaded from: classes.dex */
public final class gge implements h37, gr3, tof {
    public static gge X;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public /* synthetic */ gge(Comparable comparable, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = comparable;
        this.c = obj;
        this.d = obj2;
        this.o = obj3;
    }

    public static synchronized gge d() {
        try {
            if (X == null) {
                X = new gge(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return X;
    }

    @Override // defpackage.gr3
    public void a(byte[] bArr) throws IOException {
        ((DataOutputStream) ((bwf) this.d).getValue()).write(bArr, 0, bArr.length);
    }

    public IOException b(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            l(iOException);
        }
        return ((mbd) this.c).i(this, z2, z, iOException);
    }

    public vc3 c() {
        vc3 vc3Var;
        ty0 ty0Var;
        v84 v84Var;
        boolean z;
        do {
            synchronized (this) {
                Iterator it = ((LinkedHashSet) this.o).iterator();
                vc3Var = null;
                if (it.hasNext()) {
                    ty0Var = (ty0) it.next();
                    it.remove();
                } else {
                    ty0Var = null;
                }
            }
            if (ty0Var == null) {
                return null;
            }
            zk8 zk8Var = (zk8) ((w84) this.c);
            zk8Var.getClass();
            synchronized (zk8Var) {
                try {
                    v84Var = (v84) zk8Var.a.V(ty0Var);
                    if (v84Var != null) {
                        v84 v84Var2 = (v84) zk8Var.b.V(ty0Var);
                        v84Var2.getClass();
                        l5j.f(v84Var2.c == 0);
                        vc3Var = v84Var2.b;
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                zk8.j(v84Var);
            }
        } while (vc3Var == null);
        return vc3Var;
    }

    @Override // defpackage.gr3
    public boolean close() throws IOException {
        l6b l6bVar;
        lg8 lg8Var = lg8.d;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            l6bVar2.c(lg8Var, "TcpConnection", "close, " + this + " ...", null);
        }
        if (!((AtomicBoolean) this.c).compareAndSet(false, true)) {
            l6b l6bVar3 = wqi.a;
            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                l6bVar3.c(lg8Var, "TcpConnection", "close, " + ((Socket) this.b) + " was ALREADY CLOSED", null);
            }
            return false;
        }
        TrafficStats.setThreadStatsTag(((Socket) this.b).hashCode());
        try {
            ((Socket) this.b).close();
        } catch (Exception e) {
            wqi.p("TcpConnection", "failed to close " + ((Socket) this.b), e);
        }
        if (((bwf) this.d).e()) {
            try {
                ((DataOutputStream) ((bwf) this.d).getValue()).close();
            } catch (Exception unused) {
            }
        }
        if (((bwf) this.o).e()) {
            try {
                ((DataInputStream) ((bwf) this.o).getValue()).close();
            } catch (Exception unused2) {
            }
        }
        TrafficStats.clearThreadStatsTag();
        if (!((Socket) this.b).isClosed() && (l6bVar = wqi.a) != null) {
            lg8 lg8Var2 = lg8.Y;
            if (l6bVar.b(lg8Var2)) {
                l6bVar.c(lg8Var2, "TcpConnection", "close, " + ((Socket) this.b) + " is unexpectedly NOT closed", null);
            }
        }
        return true;
    }

    public boolean e(Context context) {
        if (((Boolean) this.d) == null) {
            this.d = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.d).booleanValue();
    }

    public boolean f(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.c).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.c).booleanValue();
    }

    public void g() {
        boolean zD = ((uda) this.b).a.d();
        if (((AtomicBoolean) this.c).compareAndSet(!zD, zD)) {
            int andSet = ((AtomicInteger) this.o).getAndSet(0);
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                return;
            }
            lg8 lg8Var = lg8.c;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ConnectionBackoff", "maybeInvalidate, invalidated " + this + ", old_failures=" + andSet, null);
            }
        }
    }

    public ThreadFactory h(String str, Integer num, boolean z, boolean z2) {
        return (ThreadFactory) ((ConcurrentHashMap) this.o).computeIfAbsent(str, new ni(22, new dfb(str, this, num, z, z2)));
    }

    public void i(Exception exc) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (exc instanceof IOException) {
            g();
            ((AtomicLong) this.d).set(jElapsedRealtime);
            ((AtomicInteger) this.o).incrementAndGet();
            l6b l6bVar = wqi.a;
            if (l6bVar == null) {
                return;
            }
            lg8 lg8Var = lg8.X;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ConnectionBackoff", "onConnectionFailure, " + this, null);
            }
        }
    }

    public nod j(boolean z) throws IOException {
        try {
            nod nodVarE = ((fj5) this.o).e(z);
            if (nodVarE == null) {
                return nodVarE;
            }
            nodVarE.m = this;
            return nodVarE;
        } catch (IOException e) {
            l(e);
            throw e;
        }
    }

    public void k() {
        Context context = (Context) this.c;
        Intent intent = (Intent) this.d;
        ArrayList arrayList = (ArrayList) this.o;
        if (arrayList == null || arrayList.size() <= 1) {
            intent.setAction("android.intent.action.SEND");
            ArrayList arrayList2 = (ArrayList) this.o;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                intent.removeExtra("android.intent.extra.STREAM");
                intent.setClipData(null);
                intent.setFlags(intent.getFlags() & (-2));
            } else {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) this.o).get(0));
                faj.b(intent, (ArrayList) this.o);
            }
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) this.o);
            faj.b(intent, (ArrayList) this.o);
        }
        context.startActivity(Intent.createChooser(intent, (String) this.b));
    }

    public void l(IOException iOException) {
        ((gj5) this.d).b(iOException);
        qbd qbdVarF = ((fj5) this.o).f();
        mbd mbdVar = (mbd) this.c;
        synchronized (qbdVarF) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(qbdVarF.f != null) || (iOException instanceof ConnectionShutdownException)) {
                        qbdVarF.i = true;
                        if (qbdVarF.l == 0) {
                            qbd.d(mbdVar.y0, qbdVarF.q, iOException);
                            qbdVarF.k++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == 8) {
                    int i = qbdVarF.m + 1;
                    qbdVarF.m = i;
                    if (i > 1) {
                        qbdVarF.i = true;
                        qbdVarF.k++;
                    }
                } else if (((StreamResetException) iOException).a != 9 || !mbdVar.v0) {
                    qbdVarF.i = true;
                    qbdVarF.k++;
                }
            } finally {
            }
        }
    }

    @Override // defpackage.h37
    public g37 n() {
        pb2 pb2VarM = ((ve2) this.d).M(((pb2) this.b).a);
        if (pb2VarM != null) {
            this.b = pb2VarM;
        }
        return new vj2(this, ve2.R(((pb2) this.b).b, (Set) this.o));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01e3  */
    @Override // defpackage.tof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(byte[] r27, int r28, int r29, defpackage.sof r30, defpackage.fu3 r31) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gge.r(byte[], int, int, sof, fu3):void");
    }

    @Override // defpackage.gr3
    public void t(byte[] bArr) throws IOException {
        ((DataInputStream) ((bwf) this.o).getValue()).readFully(bArr, 0, bArr.length);
    }

    public String toString() {
        switch (this.a) {
            case 4:
                boolean z = ((AtomicBoolean) this.c).get();
                int i = ((AtomicInteger) this.o).get();
                long j = ((AtomicLong) this.d).get();
                StringBuilder sb = new StringBuilder("ConnectionBackoff(v=");
                sb.append(z);
                sb.append("|e=");
                sb.append(i);
                sb.append("|lee=");
                return ho7.k(sb, j, "ms)");
            case 10:
                Socket socket = (Socket) this.b;
                return "TcpConnection(isClosed=" + (((AtomicBoolean) this.c).get() || socket.isClosed() || !socket.isConnected()) + "|" + socket + ")";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.tof
    public int u() {
        return 2;
    }

    @Override // defpackage.gr3
    public int v(int i, byte[] bArr, int i2) {
        return ((DataInputStream) ((bwf) this.o).getValue()).read(bArr, i, i2);
    }

    public gge(pn3 pn3Var, gmf gmfVar, d4b d4bVar) {
        this.a = 7;
        this.b = pn3Var;
        this.c = gmfVar;
        this.d = d4bVar;
        this.o = new ConcurrentHashMap();
    }

    public gge(Socket socket) {
        this.a = 10;
        this.b = socket;
        this.c = new AtomicBoolean();
        final int i = 0;
        this.d = new bwf(new cm6(this) { // from class: g3g
            public final /* synthetic */ gge b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new DataOutputStream(((Socket) this.b.b).getOutputStream());
                    default:
                        return new DataInputStream(((Socket) this.b.b).getInputStream());
                }
            }
        });
        final int i2 = 1;
        this.o = new bwf(new cm6(this) { // from class: g3g
            public final /* synthetic */ gge b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new DataOutputStream(((Socket) this.b.b).getOutputStream());
                    default:
                        return new DataInputStream(((Socket) this.b.b).getInputStream());
                }
            }
        });
    }

    public gge(uda udaVar) {
        this.a = 4;
        this.b = udaVar;
        this.c = new AtomicBoolean();
        this.d = new AtomicLong();
        this.o = new AtomicInteger();
    }

    public gge(mbd mbdVar, gj5 gj5Var, fj5 fj5Var) {
        this.a = 5;
        this.c = mbdVar;
        this.d = gj5Var;
        this.o = fj5Var;
        this.b = fj5Var.f();
    }

    public gge(List list) throws NumberFormatException {
        int i;
        this.a = 11;
        this.b = new umb();
        this.c = new umb();
        yih yihVar = new yih();
        this.d = yihVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = zxg.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                yihVar.d = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = yihVar.d;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        yihVar.e = Integer.parseInt(strArrSplit2[0]);
                        yihVar.f = Integer.parseInt(strArrSplit2[1]);
                        yihVar.b = true;
                    } catch (RuntimeException e) {
                        a8i.m("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    public gge(hg hgVar, w84 w84Var) {
        this.a = 1;
        this.b = hgVar;
        this.c = w84Var;
        this.o = new LinkedHashSet();
        this.d = new x6i(1, this);
    }

    public gge(int i) {
        this.a = i;
        switch (i) {
            case 2:
                break;
            default:
                this.b = null;
                this.c = null;
                this.d = null;
                this.o = new ArrayDeque();
                break;
        }
    }

    public gge(Context context) {
        Activity activity;
        this.a = 9;
        context.getClass();
        this.c = context;
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.d = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            ((Intent) this.d).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            ((Intent) this.d).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    public gge(mfg mfgVar, boolean[] zArr) {
        this.a = 8;
        this.b = mfgVar;
        this.c = zArr;
        int i = mfgVar.a;
        this.d = new boolean[i];
        this.o = new boolean[i];
    }
}
