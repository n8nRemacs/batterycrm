package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.Bl;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
class Al implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WeakReference f377783a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f377784b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C38811fl f377785c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C39227wl f377786d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Bk f377787e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f377788f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Bl f377789g;

    public Al(Bl bl2, WeakReference weakReference, List list, C38811fl c38811fl, C39227wl c39227wl, Bk bk2, boolean z12) {
        this.f377789g = bl2;
        this.f377783a = weakReference;
        this.f377784b = list;
        this.f377785c = c38811fl;
        this.f377786d = c39227wl;
        this.f377787e = bk2;
        this.f377788f = z12;
    }

    @Override // java.lang.Runnable
    public void run() {
        Hk c39059pk;
        C38761dl c38761dlA;
        Activity activity = (Activity) this.f377783a.get();
        if (activity == null) {
            return;
        }
        Bl.a aVar = this.f377789g.f377863f;
        List list = this.f377784b;
        List list2 = this.f377789g.f377864g;
        C38811fl c38811fl = this.f377785c;
        aVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC39203vl) it2.next()).a(c38811fl)) {
                    }
                }
                c39059pk = new C39059pk();
            } else if (((InterfaceC39203vl) it.next()).a(c38811fl)) {
                break;
            }
        }
        c39059pk = new Uk();
        Hk hk2 = c39059pk;
        long jA2 = this.f377789g.f377860c.a();
        Bl.a(this.f377789g, activity, jA2);
        try {
            c38761dlA = this.f377789g.f377861d.a(activity, this.f377786d, this.f377787e.c(), hk2, this.f377788f);
        } catch (Throwable th2) {
            Bl.a(this.f377789g, this.f377784b, th2, this.f377786d);
            c38761dlA = null;
        }
        C38761dl c38761dl = c38761dlA;
        if (c38761dl != null) {
            Bl.a(this.f377789g, this.f377784b, c38761dl, hk2.a(), activity, this.f377785c, this.f377787e, jA2);
        }
    }
}
