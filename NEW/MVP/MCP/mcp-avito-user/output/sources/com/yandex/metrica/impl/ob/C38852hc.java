package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.SystemClock;
import com.yandex.metrica.impl.ob.C39026oc;
import com.yandex.metrica.impl.ob.H0;
import java.util.Collection;

/* renamed from: com.yandex.metrica.impl.ob.hc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38852hc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38877ic f380690a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38901jc f380691b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.e f380692c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private C38976mc f380693d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final E f380694e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final H2 f380695f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final Xc f380696g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final C39205w f380697h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f380698i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f380699j;

    /* renamed from: com.yandex.metrica.impl.ob.hc$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C38852hc.this.b();
            C38852hc.this.c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.hc$b */
    public class b implements InterfaceC39201vj {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C38951lc f380701a;

        public b(C38852hc c38852hc, C38951lc c38951lc) {
            this.f380701a = c38951lc;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39201vj
        public void a(Collection<C39177uj> collection) {
            this.f380701a.a(Tl.a(collection));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C38852hc(@j.N C38877ic c38877ic) {
        Context context = c38877ic.f380779a.f379361a;
        C38976mc c38976mc = c38877ic.f380783e;
        this(c38877ic, new Xc(context, c38976mc == null ? null : c38976mc.f381049m));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        C38976mc c38976mc = this.f380693d;
        if (c38976mc != null) {
            long j12 = c38976mc.f381044h;
            if (j12 > 0) {
                this.f380690a.f380779a.f379362b.executeDelayed(this.f380699j, j12);
            }
        }
    }

    public void b() {
        C38951lc c38951lc = new C38951lc();
        this.f380692c.getClass();
        c38951lc.b(System.currentTimeMillis());
        this.f380692c.getClass();
        c38951lc.a(SystemClock.elapsedRealtime());
        this.f380696g.b();
        c38951lc.b(F2.a(this.f380695f.a().a()));
        this.f380690a.f380780b.a(new b(this, c38951lc));
        c38951lc.a(this.f380694e.b());
        c38951lc.a(C39026oc.a.a(this.f380697h.c()));
        this.f380691b.a(c38951lc);
        this.f380690a.f380781c.a();
        this.f380690a.f380782d.a();
    }

    public void d() {
        a();
    }

    public void e() {
        this.f380690a.f380779a.f379362b.remove(this.f380699j);
    }

    private void a() {
        C38976mc c38976mc = this.f380693d;
        boolean z12 = c38976mc != null && c38976mc.f381045i;
        if (this.f380698i != z12) {
            this.f380698i = z12;
            if (z12) {
                c();
            } else {
                this.f380690a.f380779a.f379362b.remove(this.f380699j);
            }
        }
    }

    private C38852hc(@j.N C38877ic c38877ic, @j.N Xc xc2) {
        this(c38877ic, new C38901jc(c38877ic.f380779a.f379361a), new com.yandex.metrica.coreutils.services.e(), F0.g().c(), F0.g().b(), H2.a(c38877ic.f380779a.f379361a), xc2, new H0.c());
    }

    public void a(@j.P C38976mc c38976mc) {
        this.f380693d = c38976mc;
        this.f380696g.a(c38976mc == null ? null : c38976mc.f381049m);
        a();
    }

    public C38852hc(@j.N C38877ic c38877ic, @j.N C38901jc c38901jc, @j.N com.yandex.metrica.coreutils.services.e eVar, @j.N E e12, @j.N C39205w c39205w, @j.N H2 h22, @j.N Xc xc2, @j.N H0.c cVar) {
        this.f380699j = new a();
        this.f380690a = c38877ic;
        this.f380691b = c38901jc;
        this.f380692c = eVar;
        this.f380693d = c38877ic.f380783e;
        this.f380694e = e12;
        this.f380697h = c39205w;
        this.f380695f = h22;
        this.f380696g = xc2;
        h22.a().a(cVar.a(c38877ic.f380779a.f379362b, xc2, h22.a()));
    }
}
