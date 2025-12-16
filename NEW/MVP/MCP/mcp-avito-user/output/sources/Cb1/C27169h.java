package cb1;

import Na1.b;
import Oa1.C14666z;
import ab1.C19861a;
import ab1.v;
import android.content.Context;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.f;
import bb1.C25624b;
import bb1.C25625c;
import bb1.D;
import bb1.t;
import bb1.y;
import e21.C39931a;
import gb1.C40652d;
import i21.InterfaceC41214a;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import k21.C42481b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import mb1.InterfaceC44046a;
import okhttp3.OkHttpClient;

/* renamed from: cb1.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C27169h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C27169h f57985a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f57986b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final T11.f f57987c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57988d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57989e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57990f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57991g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57992h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57993i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57994j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57995k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57996l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57997m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57998n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f57999o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f58000p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f58001q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f58002r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final androidx.datastore.preferences.e f58003s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final androidx.datastore.preferences.e f58004t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public static final androidx.datastore.preferences.e f58005u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public static final androidx.datastore.preferences.e f58006v;

    /* renamed from: cb1.h$a */
    public static final class a extends N implements Y41.a<Va1.a> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f58007l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Va1.a invoke() {
            b.a aVar = Na1.b.f11605b;
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = pVar.f13852a.getApplicationContext();
            aVar.getClass();
            C14666z c14666zA = C14666z.f12400c.a(applicationContext);
            C27169h.f57985a.getClass();
            return new Va1.a(c14666zA.f12403b, (ab1.g) C27169h.f57998n.getValue());
        }
    }

    /* renamed from: cb1.h$b */
    public static final class b extends N implements Y41.a<C19861a> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f58008l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C19861a invoke() {
            C27169h.f57985a.getClass();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar != null) {
                return new C19861a(new C25624b(pVar.f13852a));
            }
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
    }

    /* renamed from: cb1.h$c */
    public static final class c extends N implements Y41.l<CorruptionException, androidx.datastore.preferences.core.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f58009l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final androidx.datastore.preferences.core.f invoke(CorruptionException corruptionException) {
            return androidx.datastore.preferences.core.g.a(new f.b[0]);
        }
    }

    /* renamed from: cb1.h$d */
    public static final class d extends N implements Y41.l<Context, List<? extends androidx.datastore.core.c<androidx.datastore.preferences.core.f>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f58010l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final List<? extends androidx.datastore.core.c<androidx.datastore.preferences.core.f>> invoke(Context context) {
            Context context2 = context;
            C27169h.f57985a.getClass();
            Set setL0 = C42756l.l0(new String[]{"master_host_package", "master_host_pub"});
            return Collections.singletonList(setL0 == androidx.datastore.preferences.h.f45581a ? new androidx.datastore.migrations.a(context2, "vkpns_client_sdk", null, androidx.datastore.preferences.h.b(setL0), androidx.datastore.preferences.h.a(), 4, null) : new androidx.datastore.migrations.a(context2, "vkpns_client_sdk", setL0, androidx.datastore.preferences.h.b(setL0), androidx.datastore.preferences.h.a()));
        }
    }

    /* renamed from: cb1.h$e */
    public static final class e extends N implements Y41.a<ab1.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f58011l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final ab1.e invoke() {
            C27169h.f57985a.getClass();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            com.vk.push.core.data.source.d dVar = new com.vk.push.core.data.source.d(pVar.f13852a.getApplicationContext().getPackageManager());
            C25625c c25625c = new C25625c(C27171j.f58025l, cb1.k.f58026l);
            Qa1.p pVar2 = C27166e.f57981b;
            if (pVar2 == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            bb1.i iVar = new bb1.i(C27169h.f58004t.getValue(pVar2.f13852a.getApplicationContext(), C27169h.f57986b[1]));
            OkHttpClient okHttpClient = (OkHttpClient) C27168g.f57983a.getValue();
            Qa1.p pVar3 = C27166e.f57981b;
            if (pVar3 == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            T11.e c42481b = pVar3.f13857f;
            if (c42481b == null) {
                c42481b = new C42481b();
            }
            com.vk.push.core.network.data.source.g gVar = new com.vk.push.core.network.data.source.g(okHttpClient, c42481b, null, 4, null);
            Qa1.p pVar4 = C27166e.f57981b;
            if (pVar4 == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = pVar4.f13852a.getApplicationContext();
            T11.f fVar = C27169h.f57987c;
            return new ab1.e(dVar, c25625c, iVar, gVar, new bb1.e(new Za1.g(applicationContext, fVar)), new C27170i(1, null), fVar);
        }
    }

    /* renamed from: cb1.h$f */
    public static final class f extends N implements Y41.a<ab1.g> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f58012l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final ab1.g invoke() {
            C27169h c27169h = C27169h.f57985a;
            c27169h.getClass();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar != null) {
                return new ab1.g(new y(pVar.f13861j), C27169h.b(c27169h));
            }
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
    }

    /* renamed from: cb1.h$g */
    public static final class g extends N implements Y41.a<InterfaceC41214a> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f58013l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC41214a invoke() {
            C27169h.f57985a.getClass();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar != null) {
                return new C39931a(new com.vk.push.core.data.source.a(pVar.f13852a.getApplicationContext()));
            }
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
    }

    /* renamed from: cb1.h$h, reason: collision with other inner class name */
    public static final class C2050h extends N implements Y41.a<ab1.h> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2050h f58014l = new C2050h();

        public C2050h() {
            super(0);
        }

        @Override // Y41.a
        public final ab1.h invoke() {
            return new ab1.h(C27169h.b(C27169h.f57985a));
        }
    }

    /* renamed from: cb1.h$i */
    public static final class i extends N implements Y41.a<ab1.i> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f58015l = new i();

        public i() {
            super(0);
        }

        @Override // Y41.a
        public final ab1.i invoke() {
            C27169h.f57985a.getClass();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            return new ab1.i(new bb1.n(C27169h.f58005u.getValue(pVar.f13852a.getApplicationContext(), C27169h.f57986b[2])));
        }
    }

    /* renamed from: cb1.h$j */
    public static final class j extends N implements Y41.a<kb1.f> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f58016l = new j();

        public j() {
            super(0);
        }

        @Override // Y41.a
        public final kb1.f invoke() {
            C27169h.f57985a.getClass();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = pVar.f13852a.getApplicationContext();
            T11.f fVar = C27169h.f57987c;
            return new kb1.f(new kb1.k(applicationContext, fVar), (qb1.g) C27169h.f57989e.getValue(), fVar);
        }
    }

    /* renamed from: cb1.h$k */
    public static final class k extends N implements Y41.a<V11.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f58017l = new k();

        public k() {
            super(0);
        }

        @Override // Y41.a
        public final V11.e invoke() {
            return new V11.e();
        }
    }

    /* renamed from: cb1.h$l */
    public static final class l extends N implements Y41.a<ab1.j> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f58018l = new l();

        public l() {
            super(0);
        }

        @Override // Y41.a
        public final ab1.j invoke() {
            C27169h.f57985a.getClass();
            T11.f fVar = C27169h.f57987c;
            C27166e.a();
            return new ab1.j(new bb1.p(new C40652d(C27166e.a().f13852a.getApplicationContext(), C27166e.a().f13853b, fVar), new cb1.l(1, null), new cb1.m(1, null), fVar));
        }
    }

    /* renamed from: cb1.h$m */
    public static final class m extends N implements Y41.a<ab1.k> {

        /* renamed from: l, reason: collision with root package name */
        public static final m f58019l = new m();

        public m() {
            super(0);
        }

        @Override // Y41.a
        public final ab1.k invoke() {
            C27169h.f57985a.getClass();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            return new ab1.k(new t(C27169h.f58006v.getValue(pVar.f13852a.getApplicationContext(), C27169h.f57986b[3])));
        }
    }

    /* renamed from: cb1.h$n */
    public static final class n extends N implements Y41.a<i21.c> {

        /* renamed from: l, reason: collision with root package name */
        public static final n f58020l = new n();

        public n() {
            super(0);
        }

        @Override // Y41.a
        public final i21.c invoke() {
            C27169h.f57985a.getClass();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            com.vk.push.core.data.source.d dVar = new com.vk.push.core.data.source.d(pVar.f13852a.getApplicationContext().getPackageManager());
            Qa1.p pVar2 = C27166e.f57981b;
            if (pVar2 != null) {
                return new e21.e(dVar, new com.vk.push.core.data.source.b(pVar2.f13852a.getApplicationContext()));
            }
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
    }

    /* renamed from: cb1.h$o */
    public static final class o extends N implements Y41.a<qb1.g> {

        /* renamed from: l, reason: collision with root package name */
        public static final o f58021l = new o();

        public o() {
            super(0);
        }

        @Override // Y41.a
        public final qb1.g invoke() {
            C27169h c27169h = C27169h.f57985a;
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            Context applicationContext = pVar.f13852a.getApplicationContext();
            c27169h.getClass();
            return new qb1.d(C27169h.f58003s.getValue(applicationContext, C27169h.f57986b[0]));
        }
    }

    /* renamed from: cb1.h$p */
    public static final class p extends N implements Y41.a<ab1.q> {

        /* renamed from: l, reason: collision with root package name */
        public static final p f58022l = new p();

        public p() {
            super(0);
        }

        @Override // Y41.a
        public final ab1.q invoke() {
            return new ab1.q(new cb1.p(1, null), C27169h.f57987c);
        }
    }

    /* renamed from: cb1.h$q */
    public static final class q extends N implements Y41.a<v> {

        /* renamed from: l, reason: collision with root package name */
        public static final q f58023l = new q();

        public q() {
            super(0);
        }

        @Override // Y41.a
        public final v invoke() {
            OkHttpClient okHttpClient = (OkHttpClient) C27168g.f57983a.getValue();
            Qa1.p pVar = C27166e.f57981b;
            if (pVar == null) {
                throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
            }
            T11.e cVar = pVar.f13858g;
            if (cVar == null) {
                cVar = new Ya1.c();
            }
            D d12 = new D(okHttpClient, cVar);
            C27169h.f57985a.getClass();
            return new v(d12, (qb1.g) C27169h.f57989e.getValue(), C27169h.f57987c);
        }
    }

    static {
        j0 j0Var = new j0("pushDataStore", "getPushDataStore$sdk_public_push_client_release(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        n0 n0Var = m0.f406844a;
        f57986b = new kotlin.reflect.n[]{n0Var.j(j0Var), n0Var.j(new j0("arbiterDataStore", "getArbiterDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")), n0Var.j(new j0("modeDataStore", "getModeDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")), n0Var.j(new j0("notificationIdDataStore", "getNotificationIdDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")), n0Var.j(new j0("analyticsDataStore", "getAnalyticsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};
        f57985a = new C27169h();
        Qa1.p pVar = C27166e.f57981b;
        f57987c = pVar != null ? pVar.f13854c : new T11.c("VkpnsClientSdk");
        f57988d = C42727D.c(i.f58015l);
        f57989e = C42727D.c(o.f58021l);
        f57990f = C42727D.c(q.f58023l);
        f57991g = C42727D.c(e.f58011l);
        f57992h = C42727D.c(p.f58022l);
        f57993i = C42727D.c(j.f58016l);
        f57994j = C42727D.c(n.f58020l);
        f57995k = C42727D.c(b.f58008l);
        f57996l = C42727D.c(m.f58019l);
        f57997m = C42727D.c(C2050h.f58014l);
        f57998n = C42727D.c(f.f58012l);
        f57999o = C42727D.c(a.f58007l);
        f58000p = C42727D.c(k.f58017l);
        f58001q = C42727D.c(g.f58013l);
        f58002r = C42727D.c(l.f58018l);
        f58003s = androidx.datastore.preferences.b.a("vkpns_client_sdk", new W0.b(new cb1.o("vkpns_client_sdk")), null, 12);
        f58004t = androidx.datastore.preferences.b.a("vkpns_client_sdk_arbiter", new W0.b(new cb1.o("vkpns_client_sdk_arbiter")), d.f58010l, 8);
        f58005u = androidx.datastore.preferences.b.a("vkpns_client_sdk_mode", new W0.b(new cb1.o("vkpns_client_sdk_mode")), null, 12);
        f58006v = androidx.datastore.preferences.b.a("vkpns_notification_id", new W0.b(new cb1.o("vkpns_notification_id")), null, 12);
        androidx.datastore.preferences.b.a("vkpns_client_sdk_analytics", new W0.b(c.f58009l), null, 12);
    }

    @Y61.k
    public static V11.b a() {
        if (C27166e.f57981b != null) {
            return (Va1.a) f57999o.getValue();
        }
        throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
    }

    public static final bb1.l b(C27169h c27169h) {
        c27169h.getClass();
        Qa1.p pVar = C27166e.f57981b;
        if (pVar != null) {
            return new bb1.l(pVar.f13854c);
        }
        throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
    }

    @Y61.k
    public static InterfaceC44046a c() {
        if (C27166e.f57981b == null) {
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
        OkHttpClient okHttpClient = (OkHttpClient) C27168g.f57983a.getValue();
        Qa1.p pVar = C27166e.f57981b;
        if (pVar == null) {
            throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
        }
        T11.e c42481b = pVar.f13857f;
        if (c42481b == null) {
            c42481b = new C42481b();
        }
        return new mb1.c(new mb1.j(okHttpClient, pVar.f13853b, c42481b), f57987c);
    }
}
