package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.work.C23538b;
import androidx.work.C23638w;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.l0;
import androidx.work.impl.model.C23580w;
import com.google.common.util.concurrent.D0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlinx.coroutines.Q0;

/* compiled from: Processor.java */
@RestrictTo
/* renamed from: androidx.work.impl.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23588s implements ForegroundProcessor {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f55920l = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Context f55922b;

    /* renamed from: c, reason: collision with root package name */
    public final C23538b f55923c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.c f55924d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkDatabase f55925e;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f55927g = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f55926f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final HashSet f55929i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f55930j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public PowerManager.WakeLock f55921a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f55931k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f55928h = new HashMap();

    static {
        androidx.work.G.b("Processor");
    }

    public C23588s(@j.N Context context, @j.N C23538b c23538b, @j.N androidx.work.impl.utils.taskexecutor.c cVar, @j.N WorkDatabase workDatabase) {
        this.f55922b = context;
        this.f55923c = c23538b;
        this.f55924d = cVar;
        this.f55925e = workDatabase;
    }

    public static boolean d(@j.N String str, @j.P l0 l0Var, int i12) {
        if (l0Var == null) {
            androidx.work.G.a().getClass();
            return false;
        }
        l0Var.f55770n.V(new WorkerStoppedException(i12));
        androidx.work.G.a().getClass();
        return true;
    }

    public final void a(@j.N InterfaceC23551f interfaceC23551f) {
        synchronized (this.f55931k) {
            this.f55930j.add(interfaceC23551f);
        }
    }

    @j.P
    public final l0 b(@j.N String str) {
        l0 l0Var = (l0) this.f55926f.remove(str);
        boolean z12 = l0Var != null;
        if (!z12) {
            l0Var = (l0) this.f55927g.remove(str);
        }
        this.f55928h.remove(str);
        if (z12) {
            synchronized (this.f55931k) {
                try {
                    if (this.f55926f.isEmpty()) {
                        try {
                            this.f55922b.startService(SystemForegroundDispatcher.createStopForegroundIntent(this.f55922b));
                        } catch (Throwable unused) {
                            androidx.work.G.a().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.f55921a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f55921a = null;
                        }
                    }
                } finally {
                }
            }
        }
        return l0Var;
    }

    @j.P
    public final l0 c(@j.N String str) {
        l0 l0Var = (l0) this.f55926f.get(str);
        return l0Var == null ? (l0) this.f55927g.get(str) : l0Var;
    }

    public final boolean e(@j.N String str) {
        boolean z12;
        synchronized (this.f55931k) {
            z12 = c(str) != null;
        }
        return z12;
    }

    public final void f(@j.N InterfaceC23551f interfaceC23551f) {
        synchronized (this.f55931k) {
            this.f55930j.remove(interfaceC23551f);
        }
    }

    public final boolean g(@j.N C23613x c23613x, @j.P WorkerParameters.a aVar) {
        final C23580w c23580w = c23613x.f56084a;
        String str = c23580w.f55889a;
        ArrayList arrayList = new ArrayList();
        androidx.work.impl.model.H h12 = (androidx.work.impl.model.H) this.f55925e.q(new CallableC23587q(this, arrayList, str, 0));
        if (h12 == null) {
            androidx.work.G gA2 = androidx.work.G.a();
            c23580w.toString();
            gA2.getClass();
            this.f55924d.f56031d.execute(new Runnable() { // from class: androidx.work.impl.r
                @Override // java.lang.Runnable
                public final void run() {
                    C23588s c23588s = this.f55916b;
                    C23580w c23580w2 = c23580w;
                    synchronized (c23588s.f55931k) {
                        try {
                            Iterator it = c23588s.f55930j.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC23551f) it.next()).onExecuted(c23580w2, false);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            });
            return false;
        }
        synchronized (this.f55931k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.f55928h.get(str);
                    if (((C23613x) set.iterator().next()).f56084a.f55890b == c23580w.f55890b) {
                        set.add(c23613x);
                        androidx.work.G gA3 = androidx.work.G.a();
                        c23580w.toString();
                        gA3.getClass();
                    } else {
                        this.f55924d.f56031d.execute(new Runnable() { // from class: androidx.work.impl.r
                            @Override // java.lang.Runnable
                            public final void run() {
                                C23588s c23588s = this.f55916b;
                                C23580w c23580w2 = c23580w;
                                synchronized (c23588s.f55931k) {
                                    try {
                                        Iterator it = c23588s.f55930j.iterator();
                                        while (it.hasNext()) {
                                            ((InterfaceC23551f) it.next()).onExecuted(c23580w2, false);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        });
                    }
                    return false;
                }
                if (h12.f55814t != c23580w.f55890b) {
                    this.f55924d.f56031d.execute(new Runnable() { // from class: androidx.work.impl.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            C23588s c23588s = this.f55916b;
                            C23580w c23580w2 = c23580w;
                            synchronized (c23588s.f55931k) {
                                try {
                                    Iterator it = c23588s.f55930j.iterator();
                                    while (it.hasNext()) {
                                        ((InterfaceC23551f) it.next()).onExecuted(c23580w2, false);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    });
                    return false;
                }
                l0.a aVar2 = new l0.a(this.f55922b, this.f55923c, this.f55924d, this, this.f55925e, h12, arrayList);
                if (aVar != null) {
                    aVar2.f55778h = aVar;
                }
                l0 l0Var = new l0(aVar2);
                D0 d0A = androidx.work.E.a(l0Var.f55761e.f56029b.plus(Q0.a()), new n0(l0Var, null));
                d0A.N(new Me.m(this, d0A, l0Var, 12), this.f55924d.f56031d);
                this.f55927g.put(str, l0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(c23613x);
                this.f55928h.put(str, hashSet);
                androidx.work.G gA4 = androidx.work.G.a();
                c23580w.toString();
                gA4.getClass();
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.work.impl.foreground.ForegroundProcessor
    public final void startForeground(@j.N String str, @j.N C23638w c23638w) {
        synchronized (this.f55931k) {
            try {
                androidx.work.G.a().getClass();
                l0 l0Var = (l0) this.f55927g.remove(str);
                if (l0Var != null) {
                    if (this.f55921a == null) {
                        PowerManager.WakeLock wakeLockB = androidx.work.impl.utils.J.b(this.f55922b, "ProcessorForegroundLck");
                        this.f55921a = wakeLockB;
                        wakeLockB.acquire();
                    }
                    this.f55926f.put(str, l0Var);
                    androidx.core.content.d.startForegroundService(this.f55922b, SystemForegroundDispatcher.createStartForegroundIntent(this.f55922b, androidx.work.impl.model.o0.a(l0Var.f55757a), c23638w));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
