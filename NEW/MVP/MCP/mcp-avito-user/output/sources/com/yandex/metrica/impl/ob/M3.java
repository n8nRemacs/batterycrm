package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C38669a4;
import com.yandex.metrica.impl.ob.C38696b6;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.K3;
import com.yandex.metrica.impl.ob.Lg;
import java.util.List;

/* loaded from: classes7.dex */
class M3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final b f378863a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final c f378864b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    protected final Context f378865c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final I3 f378866d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final D3.a f378867e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final AbstractC39200vi f378868f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    protected final C39057pi f378869g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final Lg.e f378870h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final Dm f378871i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f378872j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final C38791f1 f378873k;

    /* renamed from: l, reason: collision with root package name */
    private final int f378874l;

    public class a implements C38669a4.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S1 f378875a;

        public a(M3 m32, S1 s12) {
            this.f378875a = s12;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private final String f378876a;

        public b(@j.P String str) {
            this.f378876a = str;
        }

        public Sl a() {
            return Ul.a(this.f378876a);
        }

        public C38737cm b() {
            return Ul.b(this.f378876a);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final I3 f378877a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final C38899ja f378878b;

        public c(@j.N Context context, @j.N I3 i32) {
            this(i32, C38899ja.a(context));
        }

        @j.N
        public C38724c9 a() {
            return new C38724c9(this.f378878b.b(this.f378877a));
        }

        @j.N
        public C38674a9 b() {
            return new C38674a9(this.f378878b.b(this.f378877a));
        }

        @j.k0
        public c(@j.N I3 i32, @j.N C38899ja c38899ja) {
            this.f378877a = i32;
            this.f378878b = c38899ja;
        }
    }

    public M3(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N AbstractC39200vi abstractC39200vi, @j.N C39057pi c39057pi, @j.N Lg.e eVar, @j.N ICommonExecutor iCommonExecutor, int i12, @j.N C38791f1 c38791f1) {
        this(context, i32, aVar, abstractC39200vi, c39057pi, eVar, iCommonExecutor, new Dm(), i12, new b(aVar.f377935d), new c(context, i32), c38791f1);
    }

    @j.N
    public M5 a() {
        return new M5(this.f378865c, this.f378866d, this.f378874l);
    }

    @j.N
    public L7 b(@j.N L3 l32) {
        return new L7(l32, C38899ja.a(this.f378865c).c(this.f378866d), new K7(l32.s()));
    }

    @j.N
    public b c() {
        return this.f378863a;
    }

    @j.N
    public c d() {
        return this.f378864b;
    }

    @j.N
    public S1<L3> e(@j.N L3 l32) {
        S1<L3> s12 = new S1<>(l32, this.f378868f.a(), this.f378872j);
        this.f378873k.a(s12);
        return s12;
    }

    @j.k0
    public M3(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N AbstractC39200vi abstractC39200vi, @j.N C39057pi c39057pi, @j.N Lg.e eVar, @j.N ICommonExecutor iCommonExecutor, @j.N Dm dm2, int i12, @j.N b bVar, @j.N c cVar, @j.N C38791f1 c38791f1) {
        this.f378865c = context;
        this.f378866d = i32;
        this.f378867e = aVar;
        this.f378868f = abstractC39200vi;
        this.f378869g = c39057pi;
        this.f378870h = eVar;
        this.f378872j = iCommonExecutor;
        this.f378871i = dm2;
        this.f378874l = i12;
        this.f378863a = bVar;
        this.f378864b = cVar;
        this.f378873k = c38791f1;
    }

    @j.N
    public Z3 a(@j.N L3 l32) {
        return new Z3(new Lg.c(l32, this.f378870h), this.f378869g, new Lg.a(this.f378867e));
    }

    @j.N
    public I4 c(@j.N L3 l32) {
        return new I4(l32);
    }

    @j.N
    public K3.b d(@j.N L3 l32) {
        return new K3.b(l32);
    }

    @j.N
    public C38696b6 a(@j.N L3 l32, @j.N C38698b8 c38698b8, @j.N C38696b6.a aVar) {
        return new C38696b6(l32, new C38671a6(c38698b8), aVar);
    }

    @j.N
    public C38669a4 a(@j.N C38724c9 c38724c9, @j.N C38698b8 c38698b8, @j.N C38696b6 c38696b6, @j.N L7 l72, @j.N C39109s c39109s, @j.N C38846h6 c38846h6, @j.N S1 s12) {
        return new C38669a4(c38724c9, c38698b8, c38696b6, l72, c39109s, this.f378871i, c38846h6, this.f378874l, new a(this, s12), new O3(c38698b8, new Y8(c38698b8)), new com.yandex.metrica.coreutils.services.e());
    }

    @j.N
    public C38846h6 b() {
        return new C38846h6(this.f378865c, this.f378866d);
    }

    @j.N
    public C38698b8 e() {
        return F0.g().w().a(this.f378866d);
    }

    @j.N
    public L4<X4, L3> a(@j.N L3 l32, @j.N I4 i42) {
        return new L4<>(i42, l32);
    }

    @j.N
    public C38950lb a(@j.N L7 l72) {
        return new C38950lb(l72);
    }

    @j.N
    public C39074qb a(@j.N L7 l72, @j.N Z3 z32) {
        return new C39074qb(l72, z32);
    }

    @j.N
    public C39025ob a(@j.N List<InterfaceC38975mb> list, @j.N InterfaceC39050pb interfaceC39050pb) {
        return new C39025ob(list, interfaceC39050pb);
    }

    @j.N
    public H a(@j.N C38724c9 c38724c9) {
        return new H(this.f378865c, c38724c9);
    }
}
