package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;

/* renamed from: com.yandex.metrica.impl.ob.ul, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39179ul implements InterfaceC38836gl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Xk f382017a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Sk f382018b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38699b9 f382019c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C39298zk f382020d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Lk f382021e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private Activity f382022f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private C38811fl f382023g;

    /* renamed from: com.yandex.metrica.impl.ob.ul$a */
    public class a implements InterfaceC38986mm<Activity> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(Activity activity) {
            C39179ul.this.f382017a.a(activity);
        }
    }

    public C39179ul(@j.N Context context, @j.N C38699b9 c38699b9, @j.N El el2, @j.N ICommonExecutor iCommonExecutor, @j.P C38811fl c38811fl) {
        this(context, c38699b9, el2, iCommonExecutor, c38811fl, new C39298zk(c38811fl));
    }

    public synchronized void b(@j.N Activity activity) {
        this.f382022f = activity;
        this.f382017a.a(activity);
    }

    private C39179ul(@j.N Context context, @j.N C38699b9 c38699b9, @j.N El el2, @j.N ICommonExecutor iCommonExecutor, @j.P C38811fl c38811fl, @j.N C39298zk c39298zk) {
        this(c38699b9, el2, c38811fl, c39298zk, new C38934kk(1, c38699b9), new Bl(iCommonExecutor, new C38959lk(c38699b9), c39298zk), new C38860hk(context));
    }

    public synchronized void a(@j.N Activity activity) {
        this.f382021e.a(activity);
        this.f382022f = null;
    }

    private C39179ul(@j.N C38699b9 c38699b9, @j.N El el2, @j.P C38811fl c38811fl, @j.N C39298zk c39298zk, @j.N C38934kk c38934kk, @j.N Bl bl2, @j.N C38860hk c38860hk) {
        this(c38699b9, c38811fl, el2, bl2, c39298zk, new Xk(c38811fl, c38934kk, c38699b9, bl2, c38860hk), new Sk(c38811fl, c38934kk, c38699b9, bl2, c38860hk), new C38984mk());
    }

    @j.k0
    public C39179ul(@j.N C38699b9 c38699b9, @j.P C38811fl c38811fl, @j.N El el2, @j.N Bl bl2, @j.N C39298zk c39298zk, @j.N Xk xk2, @j.N Sk sk2, @j.N C38984mk c38984mk) {
        this.f382019c = c38699b9;
        this.f382023g = c38811fl;
        this.f382020d = c39298zk;
        this.f382017a = xk2;
        this.f382018b = sk2;
        Lk lk2 = new Lk(new a(), el2);
        this.f382021e = lk2;
        bl2.a(c38984mk, lk2);
    }

    public synchronized void a(@j.N InterfaceC38960ll interfaceC38960ll, boolean z12) {
        this.f382018b.a(this.f382022f, interfaceC38960ll, z12);
        this.f382019c.c(true);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38836gl
    public synchronized void a(@j.N C38811fl c38811fl) {
        if (!c38811fl.equals(this.f382023g)) {
            this.f382020d.a(c38811fl);
            this.f382018b.a(c38811fl);
            this.f382017a.a(c38811fl);
            this.f382023g = c38811fl;
            Activity activity = this.f382022f;
            if (activity != null) {
                this.f382017a.b(activity);
            }
        }
    }
}
