package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.M3;

/* renamed from: com.yandex.metrica.impl.ob.a4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38669a4 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38724c9 f380094a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38698b8 f380095b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private C38696b6 f380096c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private L7 f380097d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Dm f380098e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final C38846h6 f380099f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C39109s f380100g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final O3 f380101h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private a f380102i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f380103j;

    /* renamed from: k, reason: collision with root package name */
    private final int f380104k;

    /* renamed from: l, reason: collision with root package name */
    private long f380105l;

    /* renamed from: m, reason: collision with root package name */
    private long f380106m;

    /* renamed from: n, reason: collision with root package name */
    private int f380107n;

    /* renamed from: com.yandex.metrica.impl.ob.a4$a */
    public interface a {
    }

    @j.k0
    public C38669a4(@j.N C38724c9 c38724c9, @j.N C38698b8 c38698b8, @j.N C38696b6 c38696b6, @j.N L7 l72, @j.N C39109s c39109s, @j.N Dm dm2, @j.N C38846h6 c38846h6, int i12, @j.N a aVar, @j.N O3 o32, @j.N com.yandex.metrica.coreutils.services.f fVar) {
        this.f380094a = c38724c9;
        this.f380095b = c38698b8;
        this.f380096c = c38696b6;
        this.f380097d = l72;
        this.f380100g = c39109s;
        this.f380098e = dm2;
        this.f380099f = c38846h6;
        this.f380104k = i12;
        this.f380101h = o32;
        this.f380103j = fVar;
        this.f380102i = aVar;
        this.f380105l = c38724c9.b(0L);
        this.f380106m = c38724c9.l();
        this.f380107n = c38724c9.i();
    }

    public void a(C38715c0 c38715c0) {
        this.f380096c.c(c38715c0);
    }

    public void b(C38715c0 c38715c0) {
        a(c38715c0, this.f380096c.b(c38715c0));
    }

    public void c(C38715c0 c38715c0) {
        a(c38715c0, this.f380096c.b(c38715c0));
        int i12 = this.f380104k;
        this.f380107n = i12;
        this.f380094a.a(i12).d();
    }

    public void d(C38715c0 c38715c0) {
        a(c38715c0, this.f380096c.b(c38715c0));
        long jC2 = this.f380103j.c();
        this.f380105l = jC2;
        this.f380094a.c(jC2).d();
    }

    public void e(C38715c0 c38715c0) {
        a(c38715c0, this.f380096c.b(c38715c0));
        long jC2 = this.f380103j.c();
        this.f380106m = jC2;
        this.f380094a.e(jC2).d();
    }

    public void f(@j.N C38715c0 c38715c0) {
        a(c38715c0, this.f380096c.f(c38715c0));
    }

    @j.k0
    public void a(@j.N C38715c0 c38715c0, @j.N C38721c6 c38721c6) {
        if (TextUtils.isEmpty(c38715c0.p())) {
            c38715c0.e(this.f380094a.n());
        }
        c38715c0.i().putAll(this.f380099f.a());
        c38715c0.d(this.f380094a.m());
        c38715c0.a(Integer.valueOf(this.f380095b.e()));
        this.f380097d.a(this.f380098e.a(c38715c0).a(c38715c0), c38715c0.o(), c38721c6, this.f380100g.a(), this.f380101h);
        ((M3.a) this.f380102i).f378875a.g();
    }

    public void b() {
        int i12 = this.f380104k;
        this.f380107n = i12;
        this.f380094a.a(i12).d();
    }

    public boolean c() {
        return this.f380107n < this.f380104k;
    }

    public boolean d() {
        return this.f380103j.c() - this.f380105l > Y5.f379951a;
    }

    public long a() {
        return this.f380106m;
    }
}
