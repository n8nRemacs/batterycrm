package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.yandex.metrica.impl.ob.C39109s;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class K3 {

    /* renamed from: a, reason: collision with root package name */
    private final L3 f378656a;

    /* renamed from: b, reason: collision with root package name */
    private final Id f378657b;

    /* renamed from: c, reason: collision with root package name */
    private List<j> f378658c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final L3 f378659a;

        public b(@j.N L3 l32) {
            this.f378659a = l32;
        }

        public K3 a(@j.N Id id2) {
            return new K3(this.f378659a, id2);
        }
    }

    public static class c extends j {

        /* renamed from: b, reason: collision with root package name */
        private final Md f378660b;

        /* renamed from: c, reason: collision with root package name */
        private final C38724c9 f378661c;

        public c(L3 l32) {
            super(l32);
            this.f378660b = new Md(l32.g(), l32.e().toString());
            this.f378661c = l32.f();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public void b() {
            C38771e6 c38771e6 = new C38771e6(this.f378661c, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND);
            if (!c38771e6.h()) {
                long jC2 = this.f378660b.c(-1L);
                if (jC2 != -1) {
                    c38771e6.d(jC2);
                }
                long jA2 = this.f378660b.a(Long.MIN_VALUE);
                if (jA2 != Long.MIN_VALUE) {
                    c38771e6.a(jA2);
                }
                long jB2 = this.f378660b.b(0L);
                if (jB2 != 0) {
                    c38771e6.c(jB2);
                }
                long jD2 = this.f378660b.d(0L);
                if (jD2 != 0) {
                    c38771e6.e(jD2);
                }
                c38771e6.b();
            }
            C38771e6 c38771e62 = new C38771e6(this.f378661c, "foreground");
            if (!c38771e62.h()) {
                long jG2 = this.f378660b.g(-1L);
                if (-1 != jG2) {
                    c38771e62.d(jG2);
                }
                boolean zBooleanValue = this.f378660b.a(true).booleanValue();
                if (zBooleanValue) {
                    c38771e62.a(zBooleanValue);
                }
                long jE2 = this.f378660b.e(Long.MIN_VALUE);
                if (jE2 != Long.MIN_VALUE) {
                    c38771e62.a(jE2);
                }
                long jF2 = this.f378660b.f(0L);
                if (jF2 != 0) {
                    c38771e62.c(jF2);
                }
                long jH2 = this.f378660b.h(0L);
                if (jH2 != 0) {
                    c38771e62.e(jH2);
                }
                c38771e62.b();
            }
            C39109s.a aVarF = this.f378660b.f();
            if (aVarF != null) {
                this.f378661c.a(aVarF);
            }
            String strB = this.f378660b.b((String) null);
            if (!TextUtils.isEmpty(strB) && TextUtils.isEmpty(this.f378661c.n())) {
                this.f378661c.j(strB);
            }
            long jI2 = this.f378660b.i(Long.MIN_VALUE);
            if (jI2 != Long.MIN_VALUE && this.f378661c.b(Long.MIN_VALUE) == Long.MIN_VALUE) {
                this.f378661c.c(jI2);
            }
            this.f378660b.h();
            this.f378661c.d();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public boolean c() {
            return this.f378660b.g();
        }
    }

    public static class d extends k {
        public d(L3 l32, Id id2) {
            super(l32, id2);
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public void b() {
            d().a();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public boolean c() {
            return a() instanceof U3;
        }
    }

    public static class e extends j {

        /* renamed from: b, reason: collision with root package name */
        private final Jd f378662b;

        /* renamed from: c, reason: collision with root package name */
        private final C38674a9 f378663c;

        public e(L3 l32, Jd jd2) {
            super(l32);
            this.f378662b = jd2;
            this.f378663c = l32.o();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public void b() {
            if ("DONE".equals(this.f378662b.c(null))) {
                this.f378663c.j();
            }
            if ("DONE".equals(this.f378662b.d(null))) {
                this.f378663c.k();
            }
            this.f378662b.h();
            this.f378662b.g();
            this.f378662b.i();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public boolean c() {
            return "DONE".equals(this.f378662b.c(null)) || "DONE".equals(this.f378662b.d(null));
        }
    }

    public static class f extends k {
        public f(L3 l32, Id id2) {
            super(l32, id2);
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public void b() {
            Id idD = d();
            if (a() instanceof U3) {
                idD.b();
            } else {
                idD.c();
            }
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public boolean c() {
            return a().o().g(null) == null;
        }
    }

    public static class g extends j {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final C38774e9 f378664b;

        @j.k0
        public g(@j.N L3 l32, @j.N C38774e9 c38774e9) {
            super(l32);
            this.f378664b = c38774e9;
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public void b() {
            if (this.f378664b.a(new Rd("REFERRER_HANDLED", null).a(), false)) {
                a().f().q();
            }
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public boolean c() {
            return true;
        }
    }

    public static class h extends j {

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        static final Rd f378665c = new Rd("SESSION_SLEEP_START", null);

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        static final Rd f378666d = new Rd("SESSION_ID", null);

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        static final Rd f378667e = new Rd("SESSION_COUNTER_ID", null);

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        static final Rd f378668f = new Rd("SESSION_INIT_TIME", null);

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        static final Rd f378669g = new Rd("SESSION_IS_ALIVE_REPORT_NEEDED", null);

        /* renamed from: h, reason: collision with root package name */
        @Deprecated
        static final Rd f378670h = new Rd("BG_SESSION_ID", null);

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        static final Rd f378671i = new Rd("BG_SESSION_SLEEP_START", null);

        /* renamed from: j, reason: collision with root package name */
        @Deprecated
        static final Rd f378672j = new Rd("BG_SESSION_COUNTER_ID", null);

        /* renamed from: k, reason: collision with root package name */
        @Deprecated
        static final Rd f378673k = new Rd("BG_SESSION_INIT_TIME", null);

        /* renamed from: l, reason: collision with root package name */
        @Deprecated
        static final Rd f378674l = new Rd("BG_SESSION_IS_ALIVE_REPORT_NEEDED", null);

        /* renamed from: b, reason: collision with root package name */
        private final C38724c9 f378675b;

        public h(L3 l32) {
            super(l32);
            this.f378675b = l32.f();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public void b() {
            C38724c9 c38724c9 = this.f378675b;
            Rd rd2 = f378671i;
            long jA2 = c38724c9.a(rd2.a(), -2147483648L);
            if (jA2 != -2147483648L) {
                C38771e6 c38771e6 = new C38771e6(this.f378675b, BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND);
                if (!c38771e6.h()) {
                    if (jA2 != 0) {
                        c38771e6.e(jA2);
                    }
                    long jA3 = this.f378675b.a(f378670h.a(), -1L);
                    if (jA3 != -1) {
                        c38771e6.d(jA3);
                    }
                    boolean zA2 = this.f378675b.a(f378674l.a(), true);
                    if (zA2) {
                        c38771e6.a(zA2);
                    }
                    long jA4 = this.f378675b.a(f378673k.a(), Long.MIN_VALUE);
                    if (jA4 != Long.MIN_VALUE) {
                        c38771e6.a(jA4);
                    }
                    long jA5 = this.f378675b.a(f378672j.a(), 0L);
                    if (jA5 != 0) {
                        c38771e6.c(jA5);
                    }
                    c38771e6.b();
                }
            }
            C38724c9 c38724c92 = this.f378675b;
            Rd rd3 = f378665c;
            long jA6 = c38724c92.a(rd3.a(), -2147483648L);
            if (jA6 != -2147483648L) {
                C38771e6 c38771e62 = new C38771e6(this.f378675b, "foreground");
                if (!c38771e62.h()) {
                    if (jA6 != 0) {
                        c38771e62.e(jA6);
                    }
                    long jA7 = this.f378675b.a(f378666d.a(), -1L);
                    if (-1 != jA7) {
                        c38771e62.d(jA7);
                    }
                    boolean zA3 = this.f378675b.a(f378669g.a(), true);
                    if (zA3) {
                        c38771e62.a(zA3);
                    }
                    long jA8 = this.f378675b.a(f378668f.a(), Long.MIN_VALUE);
                    if (jA8 != Long.MIN_VALUE) {
                        c38771e62.a(jA8);
                    }
                    long jA9 = this.f378675b.a(f378667e.a(), 0L);
                    if (jA9 != 0) {
                        c38771e62.c(jA9);
                    }
                    c38771e62.b();
                }
            }
            this.f378675b.f(rd3.a());
            this.f378675b.f(f378666d.a());
            this.f378675b.f(f378667e.a());
            this.f378675b.f(f378668f.a());
            this.f378675b.f(f378669g.a());
            this.f378675b.f(f378670h.a());
            this.f378675b.f(rd2.a());
            this.f378675b.f(f378672j.a());
            this.f378675b.f(f378673k.a());
            this.f378675b.f(f378674l.a());
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public boolean c() {
            return true;
        }
    }

    public static class i extends j {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final C38674a9 f378676b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final C38724c9 f378677c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final C38698b8 f378678d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        private final String f378679e;

        /* renamed from: f, reason: collision with root package name */
        @j.N
        private final String f378680f;

        /* renamed from: g, reason: collision with root package name */
        @j.N
        private final String f378681g;

        /* renamed from: h, reason: collision with root package name */
        @j.N
        private final String f378682h;

        /* renamed from: i, reason: collision with root package name */
        @j.N
        private final String f378683i;

        public i(L3 l32) {
            super(l32);
            this.f378679e = new Rd("LAST_REQUEST_ID").a();
            this.f378680f = new Rd("NEXT_EVENT_GLOBAL_NUMBER").a();
            this.f378681g = new Rd("CURRENT_SESSION_ID").a();
            this.f378682h = new Rd("ATTRIBUTION_ID").a();
            this.f378683i = new Rd("OPEN_ID").a();
            this.f378676b = l32.o();
            this.f378677c = l32.f();
            this.f378678d = l32.x();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public void b() {
            JSONObject jSONObject = new JSONObject();
            for (String str : this.f378677c.e()) {
                if (str.startsWith("EVENT_NUMBER_OF_TYPE_")) {
                    try {
                        jSONObject.put(String.valueOf(Integer.parseInt(str.substring(21))), this.f378677c.a(str, 0));
                        this.f378677c.f(str);
                    } catch (Throwable unused) {
                    }
                }
            }
            this.f378678d.a(this.f378676b.f(), this.f378676b.g(), this.f378677c.c(this.f378679e) ? Integer.valueOf(this.f378677c.a(this.f378679e, -1)) : null, this.f378677c.c(this.f378680f) ? Integer.valueOf(this.f378677c.a(this.f378680f, 0)) : null, this.f378677c.c(this.f378681g) ? Long.valueOf(this.f378677c.a(this.f378681g, -1L)) : null, this.f378677c.t(), jSONObject, this.f378677c.c(this.f378683i) ? Integer.valueOf(this.f378677c.a(this.f378683i, 1)) : null, this.f378677c.c(this.f378682h) ? Integer.valueOf(this.f378677c.a(this.f378682h, 1)) : null, this.f378677c.j());
            this.f378676b.h().i().d();
            this.f378677c.s().r().f(this.f378679e).f(this.f378680f).f(this.f378681g).f(this.f378682h).f(this.f378683i).d();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public boolean c() {
            return true;
        }
    }

    public static abstract class j {

        /* renamed from: a, reason: collision with root package name */
        private final L3 f378684a;

        public j(L3 l32) {
            this.f378684a = l32;
        }

        public L3 a() {
            return this.f378684a;
        }

        public abstract void b();

        public abstract boolean c();
    }

    public static abstract class k extends j {

        /* renamed from: b, reason: collision with root package name */
        private Id f378685b;

        public k(L3 l32, Id id2) {
            super(l32);
            this.f378685b = id2;
        }

        public Id d() {
            return this.f378685b;
        }
    }

    public static class l extends j {

        /* renamed from: b, reason: collision with root package name */
        private final C38674a9 f378686b;

        public l(L3 l32) {
            super(l32);
            this.f378686b = l32.o();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public void b() {
            this.f378686b.f(new Rd("first_event_description_key", null).a()).d();
        }

        @Override // com.yandex.metrica.impl.ob.K3.j
        public boolean c() {
            return true;
        }
    }

    private void b() {
        LinkedList linkedList = new LinkedList();
        this.f378658c = linkedList;
        linkedList.add(new d(this.f378656a, this.f378657b));
        this.f378658c.add(new f(this.f378656a, this.f378657b));
        List<j> list = this.f378658c;
        L3 l32 = this.f378656a;
        list.add(new e(l32, l32.n()));
        this.f378658c.add(new c(this.f378656a));
        this.f378658c.add(new h(this.f378656a));
        List<j> list2 = this.f378658c;
        L3 l33 = this.f378656a;
        list2.add(new g(l33, l33.t()));
        this.f378658c.add(new l(this.f378656a));
        this.f378658c.add(new i(this.f378656a));
    }

    public void a() {
        if (Id.f378286b.values().contains(this.f378656a.e().a())) {
            return;
        }
        for (j jVar : this.f378658c) {
            if (jVar.c()) {
                jVar.b();
            }
        }
    }

    private K3(L3 l32, Id id2) {
        this.f378656a = l32;
        this.f378657b = id2;
        b();
    }
}
