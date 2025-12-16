package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C39275yl;
import java.util.List;

/* loaded from: classes7.dex */
class Lk implements InterfaceC39251xl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Z21.a f378848a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39275yl.a f378849b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final El f378850c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Dl f378851d;

    public Lk(@j.N InterfaceC38986mm<Activity> interfaceC38986mm, @j.N El el2) {
        this(new C39275yl.a(), interfaceC38986mm, el2, new Ek(), new Dl());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39251xl
    public void a(@j.N Activity activity, long j12) {
    }

    @j.k0
    public Lk(@j.N C39275yl.a aVar, @j.N InterfaceC38986mm<Activity> interfaceC38986mm, @j.N El el2, @j.N Ek ek2, @j.N Dl dl2) {
        this.f378849b = aVar;
        this.f378850c = el2;
        this.f378848a = ek2.a(interfaceC38986mm);
        this.f378851d = dl2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public boolean a(@j.N C38811fl c38811fl) {
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39251xl
    public void a(@j.N Activity activity, boolean z12) {
        if (z12) {
            return;
        }
        try {
            this.f378848a.subscribe(activity);
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public void a(long j12, @j.N Activity activity, @j.N C38761dl c38761dl, @j.N List<C39107rl> list, @j.N C38811fl c38811fl, @j.N Bk bk2) {
        C38861hl c38861hl;
        C38861hl c38861hl2;
        if (c38811fl.f380598b && (c38861hl2 = c38811fl.f380602f) != null) {
            this.f378850c.b(this.f378851d.a(activity, c38761dl, c38861hl2, bk2.b(), j12));
        }
        if (!c38811fl.f380600d || (c38861hl = c38811fl.f380604h) == null) {
            return;
        }
        this.f378850c.a(this.f378851d.a(activity, c38761dl, c38861hl, bk2.d(), j12));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC39203vl
    public void a(@j.N Throwable th2, @j.N C39227wl c39227wl) {
        this.f378849b.getClass();
        new C39275yl(c39227wl, C39031oh.a()).a("ui_parsing", th2);
    }

    public void a(@j.N Activity activity) {
        try {
            this.f378848a.unsubscribe(activity);
        } catch (Throwable unused) {
        }
    }
}
