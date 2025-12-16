package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.IIdentifierCallback;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.interact.CellularNetworkInfo;
import com.yandex.metrica.p;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Rf {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Sf f379303a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f379304b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final Kn<Context> f379305c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Kn<String> f379306d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38862hm f379307e;

    public class a extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f379308a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IIdentifierCallback f379309b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f379310c;

        public a(Context context, IIdentifierCallback iIdentifierCallback, List list) {
            this.f379308a = context;
            this.f379309b = iIdentifierCallback;
            this.f379310c = list;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            Sf sf2 = Rf.this.f379303a;
            Context context = this.f379308a;
            sf2.getClass();
            R2.a(context).a(this.f379309b, this.f379310c);
        }
    }

    public class b extends AbstractCallableC38762dm<String> {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.AbstractCallableC38762dm
        public String a() {
            Rf.this.f379303a.getClass();
            R2 r2K = R2.k();
            if (r2K == null) {
                return null;
            }
            return r2K.e().a();
        }
    }

    public class c extends AbstractCallableC38762dm<Boolean> {
        public c() {
        }

        @Override // com.yandex.metrica.impl.ob.AbstractCallableC38762dm
        public Boolean a() {
            Rf.this.f379303a.getClass();
            R2 r2K = R2.k();
            if (r2K == null) {
                return null;
            }
            return r2K.e().b();
        }
    }

    public class d extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f379314a;

        public d(boolean z12) {
            this.f379314a = z12;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            Sf sf2 = Rf.this.f379303a;
            boolean z12 = this.f379314a;
            sf2.getClass();
            R2.b(z12);
        }
    }

    public class e extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p.Ucc f379316a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f379317b;

        public class a implements InterfaceC38960ll {
            public a() {
            }

            @Override // com.yandex.metrica.impl.ob.InterfaceC38960ll
            public void onError(@j.N String str) {
                e.this.f379316a.onError(str);
            }

            @Override // com.yandex.metrica.impl.ob.InterfaceC38960ll
            public void onResult(@j.N JSONObject jSONObject) {
                e.this.f379316a.onResult(jSONObject);
            }
        }

        public e(p.Ucc ucc, boolean z12) {
            this.f379316a = ucc;
            this.f379317b = z12;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            Rf.b(Rf.this).a(new a(), this.f379317b);
        }
    }

    public class f extends AbstractRunnableC38787em {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f379320a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f379321b;

        public f(Context context, Map map) {
            this.f379320a = context;
            this.f379321b = map;
        }

        @Override // com.yandex.metrica.impl.ob.AbstractRunnableC38787em
        public void a() {
            Sf sf2 = Rf.this.f379303a;
            Context context = this.f379320a;
            sf2.getClass();
            R2.a(context).a(this.f379321b);
        }
    }

    public Rf(@j.N ICommonExecutor iCommonExecutor, @j.N Sf sf2) {
        this(iCommonExecutor, sf2, new Kf(sf2), new Hn(new Gn("Context")), new Hn(new Gn("Event name")), new C38862hm());
    }

    @j.P
    public Future<Boolean> b() {
        return this.f379304b.submit(new c());
    }

    @j.N
    public String c(@j.N Context context) {
        this.f379305c.a(context);
        return context.getPackageName();
    }

    @j.P
    public String d(@j.N Context context) {
        this.f379305c.a(context);
        this.f379303a.getClass();
        return R2.a(context).a();
    }

    public Rf(@j.N ICommonExecutor iCommonExecutor, @j.N Sf sf2, @j.N Kf kf2, @j.N Kn<Context> kn2, @j.N Kn<String> kn3, @j.N C38862hm c38862hm) {
        this.f379303a = sf2;
        this.f379304b = iCommonExecutor;
        this.f379305c = kn2;
        this.f379306d = kn3;
        this.f379307e = c38862hm;
    }

    public void a(@j.N Context context, @j.N IIdentifierCallback iIdentifierCallback, @j.N List<String> list) {
        this.f379305c.a(context);
        this.f379304b.execute(new a(context, iIdentifierCallback, list));
    }

    @j.P
    public String b(@j.N Context context) {
        this.f379305c.a(context);
        this.f379303a.getClass();
        return R2.a(context).c();
    }

    @j.P
    public Future<String> a() {
        return this.f379304b.submit(new b());
    }

    @j.N
    public String a(Context context) {
        this.f379305c.a(context);
        return this.f379307e.a(context) ? new CellularNetworkInfo(context).getCelluralInfo() : "";
    }

    public static K0 b(Rf rf2) {
        rf2.f379303a.getClass();
        return R2.k().d().b();
    }

    public void a(@j.N Context context, boolean z12) {
        this.f379305c.a(context);
        this.f379304b.execute(new d(z12));
    }

    public void a(@j.N p.Ucc ucc, boolean z12) {
        this.f379303a.getClass();
        if (!R2.i()) {
            ucc.onError("Main API key is not activated");
        } else {
            this.f379304b.execute(new e(ucc, z12));
        }
    }

    public void a(@j.N Context context, @j.P Map<String, Object> map) {
        this.f379305c.a(context);
        this.f379304b.execute(new f(context, map));
    }
}
