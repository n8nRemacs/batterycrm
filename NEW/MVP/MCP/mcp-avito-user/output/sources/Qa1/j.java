package Qa1;

import ab1.C19861a;
import android.app.Application;
import cb1.C27162a;
import cb1.C27163b;
import cb1.C27165d;
import cb1.C27166e;
import cb1.C27167f;
import cb1.C27169h;
import cb1.q;
import db1.InterfaceC39700a;
import db1.v;
import hb1.C40910b;
import j21.C42184a;
import jb1.C42350a;
import jb1.t;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import ru.rustore.sdk.core.tasks.f;
import ru.rustore.sdk.core.tasks.r;

/* loaded from: classes9.dex */
public final class j implements X11.b, db1.i, InterfaceC39700a, X11.a, Z11.c, a21.c, V11.c, Y11.a {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final a f13810q = new a();

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public static j f13811r;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f13812a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T11.f f13813b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13814c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13815d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13816e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13817f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13818g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13819h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13820i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13821j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13822k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13823l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13824m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f13825n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C43238h f13826o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public N0 f13827p;

    public static final class a implements X11.b, db1.i, InterfaceC39700a, X11.a {
        @Override // X11.b
        @Y61.k
        public final ru.rustore.sdk.core.tasks.f a() {
            j jVar = j.f13811r;
            if (jVar != null) {
                if (jVar != null) {
                    return jVar.a();
                }
                throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
            }
            r rVar = r.f436804a;
            IllegalStateException illegalStateException = new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
            rVar.getClass();
            return r.a(illegalStateException);
        }
    }

    public static final class b extends N implements Y41.a<V11.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f13828l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final V11.b invoke() {
            C27169h.f57985a.getClass();
            return C27169h.a();
        }
    }

    public static final class c extends N implements Y41.a<ab1.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f13829l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final ab1.e invoke() {
            C27169h.f57985a.getClass();
            return (ab1.e) C27169h.f57991g.getValue();
        }
    }

    public static final class d extends N implements Y41.a<kb1.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f13830l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final kb1.f invoke() {
            C27169h.f57985a.getClass();
            return (kb1.f) C27169h.f57993i.getValue();
        }
    }

    public static final class e extends N implements Y41.a<C40910b> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final C40910b invoke() {
            T11.f fVar = C27167f.f57982a;
            T11.f fVar2 = j.this.f13813b;
            T11.f fVar3 = q.f58032a;
            C27169h.f57985a.getClass();
            return new C40910b(new C42350a((ab1.i) C27169h.f57988d.getValue()), new jb1.c(C27169h.c(), (qb1.g) C27169h.f57989e.getValue(), fVar2), fVar2);
        }
    }

    public static final class f extends N implements Y41.a<jb1.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f13832l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final jb1.e invoke() {
            return q.a();
        }
    }

    public static final class g extends N implements Y41.a<U11.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f13833l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final U11.b invoke() {
            if (C27166e.f57981b == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            InterfaceC42726C interfaceC42726C = C27162a.f57971a;
            new Ra1.b();
            return new Ra1.c();
        }
    }

    public static final class h extends N implements Y41.a<InterfaceC39700a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC39700a invoke() {
            T11.f fVar = C27165d.f57977a;
            j jVar = j.this;
            C43238h c43238h = jVar.f13826o;
            T11.f fVar2 = q.f58032a;
            C27169h.f57985a.getClass();
            return new db1.f(c43238h, new C42184a((i21.c) C27169h.f57994j.getValue()), jVar.f13813b);
        }
    }

    public static final class i extends N implements Y41.a<db1.i> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final db1.i invoke() {
            T11.f fVar = C27165d.f57977a;
            j jVar = j.this;
            C43238h c43238h = jVar.f13826o;
            o oVar = new o(jVar, null);
            T11.f fVar2 = q.f58032a;
            C27169h.f57985a.getClass();
            return new db1.n(c43238h, oVar, new jb1.p((ab1.q) C27169h.f57992h.getValue(), fVar2), jVar.f13813b);
        }
    }

    /* renamed from: Qa1.j$j, reason: collision with other inner class name */
    public static final class C0912j extends N implements Y41.a<jb1.i> {
        public C0912j() {
            super(0);
        }

        @Override // Y41.a
        public final jb1.i invoke() {
            T11.f fVar = q.f58032a;
            j jVar = j.this;
            T11.f fVar2 = jVar.f13813b;
            C27169h.f57985a.getClass();
            return new jb1.i((C19861a) C27169h.f57995k.getValue(), (ab1.k) C27169h.f57996l.getValue(), C27169h.a(), jVar.f13826o, fVar2);
        }
    }

    public static final class k extends N implements Y41.a<Qa1.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f13837l = new k();

        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Qa1.a invoke() {
            return (Qa1.a) C27165d.f57978b.getValue();
        }
    }

    public static final class l extends N implements Y41.a<X11.b> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final X11.b invoke() {
            T11.f fVar = C27165d.f57977a;
            j jVar = j.this;
            C43238h c43238h = jVar.f13826o;
            T11.f fVar2 = q.f58032a;
            C27169h.f57985a.getClass();
            InterfaceC42726C interfaceC42726C = C27169h.f57990f;
            return new v(c43238h, new jb1.r((ab1.v) interfaceC42726C.getValue()), new t((ab1.v) interfaceC42726C.getValue()), jVar.f13813b);
        }
    }

    public static final class m extends N implements Y41.a<Qa1.i> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final Qa1.i invoke() {
            T11.f fVar = C27165d.f57977a;
            T11.f fVar2 = j.this.f13813b;
            C27169h.f57985a.getClass();
            return new Qa1.i((kb1.f) C27169h.f57993i.getValue(), new C27163b(1, null), fVar2);
        }
    }

    public j(p pVar) {
        C27166e c27166e = C27166e.f57980a;
        if (!L.f(C27166e.f57981b, pVar)) {
            synchronized (c27166e) {
                try {
                    if (!L.f(C27166e.f57981b, pVar)) {
                        C27166e.f57981b = pVar;
                    }
                    G0 g02 = G0.f406611a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f13812a = C27166e.a().f13852a;
        p pVar2 = C27166e.f57981b;
        this.f13813b = pVar2 != null ? pVar2.f13854c : new T11.c("VkpnsClientSdk");
        this.f13814c = C42727D.c(b.f13828l);
        this.f13815d = C42727D.c(g.f13833l);
        this.f13816e = C42727D.c(d.f13830l);
        this.f13817f = C42727D.c(new C0912j());
        this.f13818g = C42727D.c(new e());
        this.f13819h = C42727D.c(c.f13829l);
        this.f13820i = C42727D.c(f.f13832l);
        this.f13821j = C42727D.c(k.f13837l);
        this.f13822k = C42727D.c(new m());
        this.f13823l = C42727D.c(new l());
        this.f13824m = C42727D.c(new i());
        this.f13825n = C42727D.c(new h());
        this.f13826o = U.a(C43262l0.f411945a);
    }

    @Override // X11.b
    @Y61.k
    public final ru.rustore.sdk.core.tasks.f a() {
        return ((X11.b) this.f13823l.getValue()).a();
    }

    @Override // Z11.c
    @Y61.k
    public final Ya1.b b() {
        return (Ya1.b) C27162a.f57971a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final ru.rustore.sdk.core.tasks.f<String> c() {
        ru.rustore.sdk.core.tasks.f.f436778d.getClass();
        Q qA2 = f.a.a();
        ru.rustore.sdk.core.tasks.f<String> fVar = (ru.rustore.sdk.core.tasks.f) qA2.f406619b;
        f.b bVar = (f.b) qA2.f406620c;
        this.f13813b.info("Get token requested");
        C43259k.d(this.f13826o, C43262l0.f411947c, null, new Qa1.l(this, bVar, null), 2);
        return fVar;
    }
}
