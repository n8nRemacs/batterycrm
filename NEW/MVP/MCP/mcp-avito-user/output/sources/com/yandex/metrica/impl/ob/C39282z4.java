package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.D4;
import com.yandex.metrica.networktasks.api.ConfigProvider;

/* renamed from: com.yandex.metrica.impl.ob.z4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39282z4 implements P3, ConfigProvider, Q3 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f382299a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final I3 f382300b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39039p0 f382301c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private A4 f382302d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private C38794f4 f382303e;

    /* renamed from: com.yandex.metrica.impl.ob.z4$a */
    public static class a {
        public A4 a(@j.N Context context, @j.N I3 i32, @j.N C39057pi c39057pi, @j.N D4.a aVar) {
            return new A4(new D4.b(context, i32.b()), c39057pi, aVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.z4$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final C38791f1 f382304a;

        public b() {
            this(F0.g().h());
        }

        public C39039p0<C39282z4> a(@j.N C39282z4 c39282z4, @j.N AbstractC39200vi abstractC39200vi, @j.N E4 e42, @j.N C38698b8 c38698b8) {
            C39039p0<C39282z4> c39039p0 = new C39039p0<>(c39282z4, abstractC39200vi.a(), e42, c38698b8);
            this.f382304a.a(c39039p0);
            return c39039p0;
        }

        @j.k0
        public b(@j.N C38791f1 c38791f1) {
            this.f382304a = c38791f1;
        }
    }

    public C39282z4(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39057pi c39057pi, @j.N AbstractC39200vi abstractC39200vi, @j.N CounterConfiguration.b bVar) {
        this(context, i32, aVar, c39057pi, abstractC39200vi, bVar, new E4(), new b(), new a(), new C38794f4(context, i32), F0.g().w().a(i32));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public void a(@j.N EnumC38833gi enumC38833gi, @j.P C39057pi c39057pi) {
    }

    @j.N
    public Context b() {
        return this.f382299a;
    }

    @Override // com.yandex.metrica.networktasks.api.ConfigProvider
    @j.N
    public Object getConfig() {
        return this.f382302d.b();
    }

    @Override // com.yandex.metrica.impl.ob.S3
    public void a(@j.N D3.a aVar) {
        this.f382302d.a((A4) aVar);
    }

    @Override // com.yandex.metrica.impl.ob.S3
    public void a(@j.N C38715c0 c38715c0) {
        this.f382301c.a(c38715c0);
    }

    public void a() {
        if (this.f382303e.a(this.f382302d.b().D())) {
            this.f382301c.a(C39278z0.a());
            this.f382303e.a();
        }
    }

    public C39282z4(@j.N Context context, @j.N I3 i32, @j.N D3.a aVar, @j.N C39057pi c39057pi, @j.N AbstractC39200vi abstractC39200vi, @j.N CounterConfiguration.b bVar, @j.N E4 e42, @j.N b bVar2, @j.N a aVar2, @j.N C38794f4 c38794f4, @j.N C38698b8 c38698b8) {
        this.f382299a = context;
        this.f382300b = i32;
        this.f382303e = c38794f4;
        this.f382301c = bVar2.a(this, abstractC39200vi, e42, c38698b8);
        synchronized (this) {
            this.f382303e.a(c39057pi.P());
            this.f382302d = aVar2.a(context, i32, c39057pi, new D4.a(aVar));
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38932ki
    public synchronized void a(@j.P C39057pi c39057pi) {
        this.f382302d.a(c39057pi);
        this.f382303e.a(c39057pi.P());
    }
}
