package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class jac implements ij5, se6 {
    public static final String w0 = cei.m("Processor");
    public final Context b;
    public final qo3 c;
    public final u5i d;
    public final WorkDatabase o;
    public final List s0;
    public final HashMap Y = new HashMap();
    public final HashMap X = new HashMap();
    public final HashSet t0 = new HashSet();
    public final ArrayList u0 = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object v0 = new Object();
    public final HashMap Z = new HashMap();

    public jac(Context context, qo3 qo3Var, u5i u5iVar, WorkDatabase workDatabase, List list) {
        this.b = context;
        this.c = qo3Var;
        this.d = u5iVar;
        this.o = workDatabase;
        this.s0 = list;
    }

    public static boolean c(String str, e6i e6iVar) {
        if (e6iVar == null) {
            cei.g().c(w0, "WorkerWrapper could not be found for " + str);
            return false;
        }
        e6iVar.B0 = true;
        e6iVar.h();
        e6iVar.A0.cancel(true);
        if (e6iVar.X == null || !(e6iVar.A0.a instanceof c1)) {
            cei.g().c(e6i.C0, "WorkSpec " + e6iVar.o + " is already done. Not interrupting.");
        } else {
            e6iVar.X.stop();
        }
        cei.g().c(w0, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // defpackage.ij5
    public final void a(v4i v4iVar, boolean z) {
        synchronized (this.v0) {
            try {
                e6i e6iVar = (e6i) this.Y.get(v4iVar.a);
                if (e6iVar != null && v4iVar.equals(nsi.d(e6iVar.o))) {
                    this.Y.remove(v4iVar.a);
                }
                cei.g().c(w0, jac.class.getSimpleName() + " " + v4iVar.a + " executed; reschedule = " + z);
                Iterator it = this.u0.iterator();
                while (it.hasNext()) {
                    ((ij5) it.next()).a(v4iVar, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ij5 ij5Var) {
        synchronized (this.v0) {
            this.u0.add(ij5Var);
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.v0) {
            try {
                z = this.Y.containsKey(str) || this.X.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void e(ij5 ij5Var) {
        synchronized (this.v0) {
            this.u0.remove(ij5Var);
        }
    }

    public final void f(v4i v4iVar) {
        ((i30) this.d.c).execute(new d8c(this, 8, v4iVar));
    }

    public final void g(String str, qe6 qe6Var) {
        synchronized (this.v0) {
            try {
                cei.g().i(w0, "Moving WorkSpec (" + str + ") to the foreground");
                e6i e6iVar = (e6i) this.Y.remove(str);
                if (e6iVar != null) {
                    if (this.a == null) {
                        PowerManager.WakeLock wakeLockA = wjh.a(this.b, "ProcessorForegroundLck");
                        this.a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.X.put(str, e6iVar);
                    u34.b(this.b, pwf.c(this.b, nsi.d(e6iVar.o), qe6Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h(acf acfVar, hc8 hc8Var) {
        Throwable th;
        v4i v4iVar = acfVar.a;
        String str = v4iVar.a;
        ArrayList arrayList = new ArrayList();
        r5i r5iVar = (r5i) this.o.o(new sv0(this, arrayList, str, 2));
        if (r5iVar == null) {
            cei.g().o(w0, "Didn't find WorkSpec for id " + v4iVar);
            f(v4iVar);
            return false;
        }
        synchronized (this.v0) {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                if (d(str)) {
                    Set set = (Set) this.Z.get(str);
                    if (((acf) set.iterator().next()).a.b == v4iVar.b) {
                        set.add(acfVar);
                        cei.g().c(w0, "Work " + v4iVar + " is already enqueued for processing");
                    } else {
                        f(v4iVar);
                    }
                    return false;
                }
                if (r5iVar.t != v4iVar.b) {
                    f(v4iVar);
                    return false;
                }
                j35 j35Var = new j35(this.b, this.c, this.d, this, this.o, r5iVar, arrayList);
                j35Var.Z = this.s0;
                if (hc8Var != null) {
                    j35Var.t0 = hc8Var;
                }
                e6i e6iVar = new e6i(j35Var);
                ike ikeVar = e6iVar.z0;
                ikeVar.d(new nt3(this, acfVar.a, ikeVar, 4), (i30) this.d.c);
                this.Y.put(str, e6iVar);
                HashSet hashSet = new HashSet();
                hashSet.add(acfVar);
                this.Z.put(str, hashSet);
                ((uee) this.d.a).execute(e6iVar);
                cei.g().c(w0, jac.class.getSimpleName() + ": processing " + v4iVar);
                return true;
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public final void i() {
        synchronized (this.v0) {
            try {
                if (this.X.isEmpty()) {
                    Context context = this.b;
                    String str = pwf.t0;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.b.startService(intent);
                    } catch (Throwable th) {
                        cei.g().f(w0, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
