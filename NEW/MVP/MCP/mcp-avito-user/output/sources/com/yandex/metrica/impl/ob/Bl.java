package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Bk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
class Bl {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private Runnable f377858a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f377859b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38959lk f377860c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38786el f377861d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C39298zk f377862e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final a f377863f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final List<InterfaceC39251xl> f377864g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final List<Vk> f377865h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final Bk.a f377866i;

    @j.k0
    public static class a {
    }

    public Bl(@j.N ICommonExecutor iCommonExecutor, @j.N C38959lk c38959lk, @j.N C39298zk c39298zk) {
        this(iCommonExecutor, c38959lk, c39298zk, new C38786el(), new a(), Collections.emptyList(), new Bk.a());
    }

    public static void a(Bl bl2, List list, Throwable th2, C39227wl c39227wl) {
        bl2.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC39203vl) it.next()).a(th2, c39227wl);
        }
        Iterator<InterfaceC39251xl> it2 = bl2.f377864g.iterator();
        while (it2.hasNext()) {
            it2.next().a(th2, c39227wl);
        }
    }

    @j.k0
    public Bl(@j.N ICommonExecutor iCommonExecutor, @j.N C38959lk c38959lk, @j.N C39298zk c39298zk, @j.N C38786el c38786el, @j.N a aVar, @j.N List<Vk> list, @j.N Bk.a aVar2) {
        this.f377864g = new ArrayList();
        this.f377859b = iCommonExecutor;
        this.f377860c = c38959lk;
        this.f377862e = c39298zk;
        this.f377861d = c38786el;
        this.f377863f = aVar;
        this.f377865h = list;
        this.f377866i = aVar2;
    }

    public static void a(Bl bl2, List list, C38761dl c38761dl, List list2, Activity activity, C38811fl c38811fl, Bk bk2, long j12) {
        bl2.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC39203vl) it.next()).a(j12, activity, c38761dl, list2, c38811fl, bk2);
        }
        Iterator<InterfaceC39251xl> it2 = bl2.f377864g.iterator();
        while (it2.hasNext()) {
            it2.next().a(j12, activity, c38761dl, list2, c38811fl, bk2);
        }
    }

    public void a(@j.N InterfaceC39251xl... interfaceC39251xlArr) {
        this.f377864g.addAll(Arrays.asList(interfaceC39251xlArr));
    }

    public static void a(Bl bl2, Activity activity, long j12) {
        Iterator<InterfaceC39251xl> it = bl2.f377864g.iterator();
        while (it.hasNext()) {
            it.next().a(activity, j12);
        }
    }

    public void a(@j.N Activity activity, long j12, @j.N C38811fl c38811fl, @j.N C39227wl c39227wl, @j.N List<InterfaceC39203vl> list) {
        boolean z12;
        Iterator<Vk> it = this.f377865h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z12 = false;
                break;
            } else if (it.next().a(activity, c39227wl)) {
                z12 = true;
                break;
            }
        }
        boolean z13 = z12;
        WeakReference weakReference = new WeakReference(activity);
        Bk.a aVar = this.f377866i;
        C39298zk c39298zk = this.f377862e;
        aVar.getClass();
        Al al2 = new Al(this, weakReference, list, c38811fl, c39227wl, new Bk(c39298zk, c38811fl), z13);
        Runnable runnable = this.f377858a;
        if (runnable != null) {
            this.f377859b.remove(runnable);
        }
        this.f377858a = al2;
        Iterator<InterfaceC39251xl> it2 = this.f377864g.iterator();
        while (it2.hasNext()) {
            it2.next().a(activity, z13);
        }
        this.f377859b.executeDelayed(al2, j12);
    }
}
