package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38835gk implements InterfaceC39203vl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38934kk f380662a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38699b9 f380663b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final InterfaceC38960ll f380664c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final a f380665d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f380666e;

    /* renamed from: com.yandex.metrica.impl.ob.gk$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.gk$b */
    public static class b {
    }

    @j.k0
    public C38835gk(@j.N C38934kk c38934kk, @j.N C38699b9 c38699b9, boolean z12, @j.N InterfaceC38960ll interfaceC38960ll, @j.N a aVar) {
        this.f380662a = c38934kk;
        this.f380663b = c38699b9;
        this.f380666e = z12;
        this.f380664c = interfaceC38960ll;
        this.f380665d = aVar;
    }

    private boolean b(@j.N C38811fl c38811fl) {
        if (!c38811fl.f380599c || c38811fl.f380603g == null) {
            return false;
        }
        return this.f380666e || this.f380663b.a(false);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public void a(long j12, @j.N Activity activity, @j.N C38761dl c38761dl, @j.N List<C39107rl> list, @j.N C38811fl c38811fl, @j.N Bk bk2) {
        if (b(c38811fl)) {
            a aVar = this.f380665d;
            C38861hl c38861hl = c38811fl.f380603g;
            aVar.getClass();
            this.f380662a.a((c38861hl.f380740h ? new Fk() : new Ck(list)).a(activity, c38761dl, c38811fl.f380603g, bk2.a(), j12));
            this.f380664c.onResult(this.f380662a.a());
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public void a(@j.N Throwable th2, @j.N C39227wl c39227wl) {
        this.f380664c.onError("exception: " + th2.getMessage());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public boolean a(@j.N C38811fl c38811fl) {
        return b(c38811fl) && !c38811fl.f380603g.f380740h;
    }
}
