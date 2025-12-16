package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.avito.android.remote.model.category_parameters.DateTimeParameterKt;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.ob.C38696b6;
import com.yandex.metrica.impl.ob.C39109s;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.K3;
import com.yandex.metrica.impl.ob.Lg;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class L3 implements S3, P3, InterfaceC39050pb, Lg.d {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378741a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I3 f378742b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38724c9 f378743c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38774e9 f378744d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final C38674a9 f378745e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final S1 f378746f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final L7 f378747g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final L4 f378748h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final I4 f378749i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final C39109s f378750j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final B3 f378751k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final C38696b6 f378752l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private final Z3 f378753m;

    /* renamed from: n, reason: collision with root package name */
    @j.N
    private final M5 f378754n;

    /* renamed from: o, reason: collision with root package name */
    @j.N
    private final C38737cm f378755o;

    /* renamed from: p, reason: collision with root package name */
    @j.N
    private final Sl f378756p;

    /* renamed from: q, reason: collision with root package name */
    @j.N
    private final C38669a4 f378757q;

    /* renamed from: r, reason: collision with root package name */
    @j.N
    private final K3.b f378758r;

    /* renamed from: s, reason: collision with root package name */
    @j.N
    private final C39025ob f378759s;

    /* renamed from: t, reason: collision with root package name */
    @j.N
    private final C38950lb f378760t;

    /* renamed from: u, reason: collision with root package name */
    @j.N
    private final C39074qb f378761u;

    /* renamed from: v, reason: collision with root package name */
    @j.N
    private final H f378762v;

    /* renamed from: w, reason: collision with root package name */
    @j.N
    private final C39232x2 f378763w;

    /* renamed from: x, reason: collision with root package name */
    @j.N
    private final I1 f378764x;

    /* renamed from: y, reason: collision with root package name */
    @j.N
    private final C38698b8 f378765y;

    /* renamed from: z, reason: collision with root package name */
    @j.N
    private final C38846h6 f378766z;

    public class a implements C38696b6.a {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.C38696b6.a
        public void a(@j.N C38715c0 c38715c0, @j.N C38721c6 c38721c6) {
            L3.this.f378757q.a(c38715c0, c38721c6);
        }
    }

    @j.k0
    public L3(@j.N Context context, @j.N I3 i32, @j.N B3 b32, @j.N C39232x2 c39232x2, @j.N M3 m32) {
        this.f378741a = context.getApplicationContext();
        this.f378742b = i32;
        this.f378751k = b32;
        this.f378763w = c39232x2;
        C38698b8 c38698b8E = m32.e();
        this.f378765y = c38698b8E;
        this.f378764x = F0.g().k();
        Z3 z3A = m32.a(this);
        this.f378753m = z3A;
        C38737cm c38737cmB = m32.c().b();
        this.f378755o = c38737cmB;
        Sl slA = m32.c().a();
        this.f378756p = slA;
        C38724c9 c38724c9A = m32.d().a();
        this.f378743c = c38724c9A;
        this.f378745e = m32.d().b();
        this.f378744d = F0.g().s();
        C39109s c39109sA = b32.a(i32, c38737cmB, c38724c9A);
        this.f378750j = c39109sA;
        this.f378754n = m32.a();
        L7 l7B = m32.b(this);
        this.f378747g = l7B;
        S1<L3> s1E = m32.e(this);
        this.f378746f = s1E;
        this.f378758r = m32.d(this);
        C39074qb c39074qbA = m32.a(l7B, z3A);
        this.f378761u = c39074qbA;
        C38950lb c38950lbA = m32.a(l7B);
        this.f378760t = c38950lbA;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c39074qbA);
        arrayList.add(c38950lbA);
        this.f378759s = m32.a(arrayList, this);
        z();
        C38696b6 c38696b6A = m32.a(this, c38698b8E, new a());
        this.f378752l = c38696b6A;
        if (slA.isEnabled()) {
            slA.fi("Read app environment for component %s. Value: %s", i32.toString(), c39109sA.a().f381813a);
        }
        C38846h6 c38846h6B = m32.b();
        this.f378766z = c38846h6B;
        this.f378757q = m32.a(c38724c9A, c38698b8E, c38696b6A, l7B, c39109sA, c38846h6B, s1E);
        I4 i4C = m32.c(this);
        this.f378749i = i4C;
        this.f378748h = m32.a(this, i4C);
        this.f378762v = m32.a(c38724c9A);
        l7B.e();
    }

    private void z() {
        int libraryApiLevel = YandexMetrica.getLibraryApiLevel();
        Integer numJ = this.f378743c.j();
        if (numJ == null) {
            numJ = Integer.valueOf(this.f378765y.c());
        }
        if (numJ.intValue() < libraryApiLevel) {
            this.f378758r.a(new Id(new Jd(this.f378741a, this.f378742b.a()))).a();
            this.f378765y.b(libraryApiLevel);
        }
    }

    public boolean A() {
        Lg lgM = m();
        return lgM.R() && lgM.x() && this.f378763w.b(this.f378757q.a(), lgM.K(), "need to check permissions");
    }

    public boolean B() {
        return this.f378757q.d() && m().x();
    }

    public boolean C() {
        return this.f378757q.c() && m().O() && m().x();
    }

    public void D() {
        this.f378753m.e();
    }

    public boolean E() {
        Lg lgM = m();
        return lgM.R() && this.f378763w.b(this.f378757q.a(), lgM.L(), "should force send permissions");
    }

    public boolean F() {
        return !(this.f378764x.b().f380484d && this.f378753m.d().N());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public synchronized void a(@j.N EnumC38833gi enumC38833gi, @j.P C39057pi c39057pi) {
    }

    public void b(C38715c0 c38715c0) {
        this.f378750j.a(c38715c0.b());
        C39109s.a aVarA = this.f378750j.a();
        B3 b32 = this.f378751k;
        C38724c9 c38724c9 = this.f378743c;
        synchronized (b32) {
            if (aVarA.f381814b > c38724c9.f().f381814b) {
                c38724c9.a(aVarA).d();
                if (this.f378755o.isEnabled()) {
                    this.f378755o.fi("Save new app environment for %s. Value: %s", this.f378742b, aVarA.f381813a);
                }
            }
        }
    }

    public synchronized void c() {
        this.f378746f.d();
    }

    @j.N
    public H d() {
        return this.f378762v;
    }

    @j.N
    public I3 e() {
        return this.f378742b;
    }

    @j.N
    public C38724c9 f() {
        return this.f378743c;
    }

    @j.N
    public Context g() {
        return this.f378741a;
    }

    @j.P
    public String h() {
        return this.f378743c.n();
    }

    @j.N
    public L7 i() {
        return this.f378747g;
    }

    @j.N
    public M5 j() {
        return this.f378754n;
    }

    @j.N
    public I4 k() {
        return this.f378749i;
    }

    @j.N
    public C39025ob l() {
        return this.f378759s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j.N
    public Lg m() {
        return (Lg) this.f378753m.b();
    }

    @j.N
    @Deprecated
    public final Jd n() {
        return new Jd(this.f378741a, this.f378742b.a());
    }

    @j.N
    public C38674a9 o() {
        return this.f378745e;
    }

    @j.P
    public String p() {
        return this.f378743c.m();
    }

    @j.N
    public C38737cm q() {
        return this.f378755o;
    }

    @j.N
    public C38669a4 r() {
        return this.f378757q;
    }

    @j.N
    public CounterConfiguration.b s() {
        return CounterConfiguration.b.MANUAL;
    }

    @j.N
    public C38774e9 t() {
        return this.f378744d;
    }

    @j.N
    public C38846h6 u() {
        return this.f378766z;
    }

    @j.N
    public C38696b6 v() {
        return this.f378752l;
    }

    @j.N
    public C39057pi w() {
        return this.f378753m.d();
    }

    @j.N
    public C38698b8 x() {
        return this.f378765y;
    }

    public void y() {
        this.f378757q.b();
    }

    @Override // com.yandex.metrica.impl.ob.S3
    public void a(@j.N C38715c0 c38715c0) {
        if (this.f378755o.isEnabled()) {
            C38737cm c38737cm = this.f378755o;
            c38737cm.getClass();
            if (C39278z0.c(c38715c0.o())) {
                StringBuilder sb2 = new StringBuilder("Event received on service: ");
                sb2.append(c38715c0.g());
                if (C39278z0.e(c38715c0.o()) && !TextUtils.isEmpty(c38715c0.q())) {
                    sb2.append(" with value ");
                    sb2.append(c38715c0.q());
                }
                c38737cm.i(sb2.toString());
            }
        }
        String strA = this.f378742b.a();
        if (TextUtils.isEmpty(strA) || DateTimeParameterKt.DATE_TIME_PARAMETER_PRESENT_TIME.equals(strA)) {
            return;
        }
        this.f378748h.a(c38715c0);
    }

    public void b() {
        this.f378750j.b();
        B3 b32 = this.f378751k;
        C39109s.a aVarA = this.f378750j.a();
        C38724c9 c38724c9 = this.f378743c;
        synchronized (b32) {
            c38724c9.a(aVarA).d();
        }
    }

    public void b(@j.P String str) {
        this.f378743c.i(str).d();
    }

    public void G() {
    }

    @Override // com.yandex.metrica.impl.ob.S3
    public synchronized void a(@j.N D3.a aVar) {
        try {
            Z3 z32 = this.f378753m;
            synchronized (z32) {
                z32.a((Z3) aVar);
            }
            if (Boolean.TRUE.equals(aVar.f377942k)) {
                this.f378755o.setEnabled();
            } else {
                if (Boolean.FALSE.equals(aVar.f377942k)) {
                    this.f378755o.setDisabled();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public synchronized void a(@j.N C39057pi c39057pi) {
        this.f378753m.a(c39057pi);
        this.f378747g.b(c39057pi);
        this.f378759s.c();
    }

    public void a(String str) {
        this.f378743c.j(str).d();
    }
}
