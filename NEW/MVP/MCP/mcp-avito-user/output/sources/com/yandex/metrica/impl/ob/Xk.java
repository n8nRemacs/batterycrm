package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C38835gk;
import java.util.Collections;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class Xk {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC38960ll f379934a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38934kk f379935b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38699b9 f379936c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private volatile C38811fl f379937d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Bl f379938e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C38835gk.b f379939f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C38860hk f379940g;

    public Xk(@j.P C38811fl c38811fl, @j.N C38934kk c38934kk, @j.N C38699b9 c38699b9, @j.N Bl bl2, @j.N C38860hk c38860hk) {
        this(c38811fl, c38934kk, c38699b9, bl2, c38860hk, new C38835gk.b());
    }

    public void a(@j.N C38811fl c38811fl) {
        this.f379937d = c38811fl;
    }

    public void b(@j.N Activity activity) {
        C38811fl c38811fl = this.f379937d;
        if (this.f379940g.a(activity, c38811fl) == Wk.OK) {
            a(activity, 0L, c38811fl, c38811fl.f380601e);
        }
    }

    @j.k0
    public Xk(@j.P C38811fl c38811fl, @j.N C38934kk c38934kk, @j.N C38699b9 c38699b9, @j.N Bl bl2, @j.N C38860hk c38860hk, @j.N C38835gk.b bVar) {
        this.f379934a = new a(this);
        this.f379937d = c38811fl;
        this.f379935b = c38934kk;
        this.f379936c = c38699b9;
        this.f379938e = bl2;
        this.f379939f = bVar;
        this.f379940g = c38860hk;
    }

    public void a(@j.N Activity activity) {
        C38811fl c38811fl = this.f379937d;
        if (this.f379940g.a(activity, c38811fl) == Wk.OK) {
            C39227wl c39227wl = c38811fl.f380601e;
            a(activity, c39227wl.f382147d, c38811fl, c39227wl);
        }
    }

    private void a(@j.N Activity activity, long j12, @j.N C38811fl c38811fl, @j.N C39227wl c39227wl) {
        Bl bl2 = this.f379938e;
        C38835gk.b bVar = this.f379939f;
        C38934kk c38934kk = this.f379935b;
        C38699b9 c38699b9 = this.f379936c;
        InterfaceC38960ll interfaceC38960ll = this.f379934a;
        bVar.getClass();
        bl2.a(activity, j12, c38811fl, c39227wl, Collections.singletonList(new C38835gk(c38934kk, c38699b9, false, interfaceC38960ll, new C38835gk.a())));
    }

    public class a implements InterfaceC38960ll {
        public a(Xk xk2) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38960ll
        public void onError(@j.N String str) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38960ll
        public void onResult(@j.N JSONObject jSONObject) {
        }
    }
}
