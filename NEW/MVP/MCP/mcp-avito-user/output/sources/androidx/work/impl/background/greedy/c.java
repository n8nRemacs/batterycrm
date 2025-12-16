package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.C23538b;
import androidx.work.C23542f;
import androidx.work.G;
import androidx.work.WorkInfo;
import androidx.work.impl.C23550e;
import androidx.work.impl.C23588s;
import androidx.work.impl.C23613x;
import androidx.work.impl.InterfaceC23551f;
import androidx.work.impl.InterfaceC23590u;
import androidx.work.impl.InterfaceC23614y;
import androidx.work.impl.W;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.e;
import androidx.work.impl.constraints.f;
import androidx.work.impl.constraints.h;
import androidx.work.impl.constraints.trackers.n;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.model.H;
import androidx.work.impl.model.o0;
import androidx.work.impl.utils.v;
import j.N;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.coroutines.N0;

/* compiled from: GreedyScheduler.java */
@RestrictTo
/* loaded from: classes10.dex */
public class c implements InterfaceC23590u, e, InterfaceC23551f {

    /* renamed from: b, reason: collision with root package name */
    public final Context f55577b;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.work.impl.background.greedy.b f55579d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f55580e;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC23614y f55582g;

    /* renamed from: h, reason: collision with root package name */
    public final C23588s f55583h;

    /* renamed from: i, reason: collision with root package name */
    public final W f55584i;

    /* renamed from: j, reason: collision with root package name */
    public final C23538b f55585j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f55586k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f55587l;

    /* renamed from: m, reason: collision with root package name */
    public final f f55588m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.b f55589n;

    /* renamed from: o, reason: collision with root package name */
    public final d f55590o;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f55578c = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final Object f55581f = new Object();

    /* compiled from: GreedyScheduler.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f55591a;

        /* renamed from: b, reason: collision with root package name */
        public final long f55592b;

        public b(int i12, long j12, a aVar) {
            this.f55591a = i12;
            this.f55592b = j12;
        }
    }

    static {
        G.b("GreedyScheduler");
    }

    public c(@N Context context, @N C23538b c23538b, @N n nVar, @N C23588s c23588s, @N W w12, @N androidx.work.impl.utils.taskexecutor.b bVar) {
        InterfaceC23614y.f56085a.getClass();
        this.f55582g = InterfaceC23614y.a.a(true);
        this.f55586k = new HashMap();
        this.f55577b = context;
        C23550e c23550e = c23538b.f55453g;
        this.f55579d = new androidx.work.impl.background.greedy.b(this, c23550e, c23538b.f55450d);
        this.f55590o = new d(c23550e, w12, 0L, 4, null);
        this.f55589n = bVar;
        this.f55588m = new f(nVar);
        this.f55585j = c23538b;
        this.f55583h = c23588s;
        this.f55584i = w12;
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final void h(@N String str) {
        Runnable runnable;
        if (this.f55587l == null) {
            this.f55587l = Boolean.valueOf(v.a(this.f55577b, this.f55585j));
        }
        if (!this.f55587l.booleanValue()) {
            G.a().getClass();
            return;
        }
        if (!this.f55580e) {
            this.f55583h.a(this);
            this.f55580e = true;
        }
        G.a().getClass();
        androidx.work.impl.background.greedy.b bVar = this.f55579d;
        if (bVar != null && (runnable = (Runnable) bVar.f55576d.remove(str)) != null) {
            bVar.f55574b.b(runnable);
        }
        for (C23613x c23613x : this.f55582g.remove(str)) {
            this.f55590o.a(c23613x);
            this.f55584i.b(c23613x);
        }
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final boolean i() {
        return false;
    }

    @Override // androidx.work.impl.InterfaceC23590u
    public final void j(@N H... hArr) {
        long jMax;
        if (this.f55587l == null) {
            this.f55587l = Boolean.valueOf(v.a(this.f55577b, this.f55585j));
        }
        if (!this.f55587l.booleanValue()) {
            G.a().getClass();
            return;
        }
        if (!this.f55580e) {
            this.f55583h.a(this);
            this.f55580e = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (H h12 : hArr) {
            if (!this.f55582g.c(o0.a(h12))) {
                synchronized (this.f55581f) {
                    try {
                        C23580w c23580wA = o0.a(h12);
                        b bVar = (b) this.f55586k.get(c23580wA);
                        if (bVar == null) {
                            int i12 = h12.f55805k;
                            this.f55585j.f55450d.getClass();
                            bVar = new b(i12, System.currentTimeMillis(), null);
                            this.f55586k.put(c23580wA, bVar);
                        }
                        jMax = (Math.max((h12.f55805k - bVar.f55591a) - 5, 0) * 30000) + bVar.f55592b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(h12.a(), jMax);
                this.f55585j.f55450d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (h12.f55796b == WorkInfo.State.f55419b) {
                    if (jCurrentTimeMillis < jMax2) {
                        androidx.work.impl.background.greedy.b bVar2 = this.f55579d;
                        if (bVar2 != null) {
                            HashMap map = bVar2.f55576d;
                            Runnable runnable = (Runnable) map.remove(h12.f55795a);
                            C23550e c23550e = bVar2.f55574b;
                            if (runnable != null) {
                                c23550e.b(runnable);
                            }
                            androidx.work.impl.background.greedy.a aVar = new androidx.work.impl.background.greedy.a(bVar2, h12);
                            map.put(h12.f55795a, aVar);
                            bVar2.f55575c.getClass();
                            c23550e.a(jMax2 - System.currentTimeMillis(), aVar);
                        }
                    } else if (h12.c()) {
                        C23542f c23542f = h12.f55804j;
                        if (c23542f.f55490d) {
                            G gA2 = G.a();
                            h12.toString();
                            gA2.getClass();
                        } else if (c23542f.b()) {
                            G gA3 = G.a();
                            h12.toString();
                            gA3.getClass();
                        } else {
                            hashSet.add(h12);
                            hashSet2.add(h12.f55795a);
                        }
                    } else if (!this.f55582g.c(o0.a(h12))) {
                        G.a().getClass();
                        C23613x c23613xB = this.f55582g.b(h12);
                        this.f55590o.b(c23613xB);
                        this.f55584i.c(c23613xB, null);
                    }
                }
            }
        }
        synchronized (this.f55581f) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    G.a().getClass();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        H h13 = (H) it.next();
                        C23580w c23580wA2 = o0.a(h13);
                        if (!this.f55578c.containsKey(c23580wA2)) {
                            this.f55578c.put(c23580wA2, h.a(this.f55588m, h13, this.f55589n.a(), this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.work.impl.constraints.e
    public final void onConstraintsStateChanged(@N H h12, @N androidx.work.impl.constraints.b bVar) {
        C23580w c23580wA = o0.a(h12);
        boolean z12 = bVar instanceof b.a;
        W w12 = this.f55584i;
        d dVar = this.f55590o;
        InterfaceC23614y interfaceC23614y = this.f55582g;
        if (z12) {
            if (interfaceC23614y.c(c23580wA)) {
                return;
            }
            G gA2 = G.a();
            c23580wA.toString();
            gA2.getClass();
            C23613x c23613xD = interfaceC23614y.d(c23580wA);
            dVar.b(c23613xD);
            w12.c(c23613xD, null);
            return;
        }
        G gA3 = G.a();
        c23580wA.toString();
        gA3.getClass();
        C23613x c23613xA = interfaceC23614y.a(c23580wA);
        if (c23613xA != null) {
            dVar.a(c23613xA);
            w12.a(c23613xA, ((b.C1953b) bVar).f55670a);
        }
    }

    @Override // androidx.work.impl.InterfaceC23551f
    public final void onExecuted(@N C23580w c23580w, boolean z12) {
        N0 n02;
        C23613x c23613xA = this.f55582g.a(c23580w);
        if (c23613xA != null) {
            this.f55590o.a(c23613xA);
        }
        synchronized (this.f55581f) {
            n02 = (N0) this.f55578c.remove(c23580w);
        }
        if (n02 != null) {
            G gA2 = G.a();
            c23580w.toString();
            gA2.getClass();
            n02.c(null);
        }
        if (z12) {
            return;
        }
        synchronized (this.f55581f) {
            this.f55586k.remove(c23580w);
        }
    }
}
