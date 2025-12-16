package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C38835gk;
import java.util.Collections;

/* loaded from: classes7.dex */
class Sk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38934kk f379464a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38699b9 f379465b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private volatile C38811fl f379466c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Bl f379467d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38835gk.b f379468e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C38860hk f379469f;

    public Sk(@j.P C38811fl c38811fl, @j.N C38934kk c38934kk, @j.N C38699b9 c38699b9, @j.N Bl bl2, @j.N C38860hk c38860hk) {
        this(c38811fl, c38934kk, c38699b9, bl2, c38860hk, new C38835gk.b());
    }

    public void a(@j.N C38811fl c38811fl) {
        this.f379466c = c38811fl;
    }

    @j.k0
    public Sk(@j.P C38811fl c38811fl, @j.N C38934kk c38934kk, @j.N C38699b9 c38699b9, @j.N Bl bl2, @j.N C38860hk c38860hk, @j.N C38835gk.b bVar) {
        this.f379466c = c38811fl;
        this.f379464a = c38934kk;
        this.f379465b = c38699b9;
        this.f379467d = bl2;
        this.f379469f = c38860hk;
        this.f379468e = bVar;
    }

    public void a(@j.P Activity activity, @j.N InterfaceC38960ll interfaceC38960ll, boolean z12) {
        C38811fl c38811fl = this.f379466c;
        if ((!z12 && !this.f379464a.b().isEmpty()) || activity == null) {
            interfaceC38960ll.onResult(this.f379464a.a());
            return;
        }
        Wk wkA = this.f379469f.a(activity, c38811fl);
        if (wkA != Wk.OK) {
            int iOrdinal = wkA.ordinal();
            interfaceC38960ll.onError(iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? "parsing ui context is forbidden for some reason" : "parsing ui context is forbidden by app for activity" : "parsing ui context is forbidden by app for application" : "feature ui_parsing disabled" : "no ui_parsing_config" : "no ui_access_config");
            return;
        }
        if (!c38811fl.f380599c) {
            interfaceC38960ll.onError("feature ui_collecting_for_bridge disabled");
            return;
        }
        if (c38811fl.f380603g == null) {
            interfaceC38960ll.onError("no ui_collecting_for_bridge_config");
            return;
        }
        Bl bl2 = this.f379467d;
        C39227wl c39227wl = c38811fl.f380601e;
        C38835gk.b bVar = this.f379468e;
        C38934kk c38934kk = this.f379464a;
        C38699b9 c38699b9 = this.f379465b;
        bVar.getClass();
        bl2.a(activity, 0L, c38811fl, c39227wl, Collections.singletonList(new C38835gk(c38934kk, c38699b9, z12, interfaceC38960ll, new C38835gk.a())));
    }
}
