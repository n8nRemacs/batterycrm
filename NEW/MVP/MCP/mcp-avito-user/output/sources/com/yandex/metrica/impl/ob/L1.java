package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.C39189v7;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.J;
import com.yandex.metrica.impl.ob.Mg;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes7.dex */
public class L1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f378732a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f378733b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38893j4 f378734c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final B0 f378735d;

    public class a implements InterfaceC38986mm<Z6> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(Z6 z62) {
            Z6 z63 = z62;
            L1 l12 = L1.this;
            C38869i4 c38869i4 = new C38869i4(z63.a(), z63.f(), z63.g(), z63.h(), z63.i());
            String strE = z63.e();
            byte[] bArrC = z63.c();
            int iB2 = z63.b();
            HashMap<J.a, Integer> mapJ = z63.j();
            String strD = z63.d();
            C38737cm c38737cmB = Ul.b(z63.a());
            List<Integer> list = C39278z0.f382293i;
            J jA2 = new J(bArrC, strE, EnumC38666a1.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE.b(), c38737cmB).a(mapJ);
            jA2.f380261h = iB2;
            l12.a(c38869i4, jA2.c(strD), new D3(new Mg.b(null, null, null, null, null, null, false, null), new D3.a(), null));
        }
    }

    @j.k0
    public class b implements InterfaceC38986mm<String> {

        /* renamed from: a, reason: collision with root package name */
        private final C38869i4 f378737a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC39011nm<String, C38715c0> f378738b;

        public b(C38869i4 c38869i4, InterfaceC39011nm<String, C38715c0> interfaceC39011nm) {
            this.f378737a = c38869i4;
            this.f378738b = interfaceC39011nm;
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.N String str) {
            L1.this.a(this.f378737a, this.f378738b.a(str), new D3(new Mg.b(null, null, null, null, null, null, false, null), new D3.a(), null));
        }
    }

    @j.k0
    public L1(@j.N Context context, @j.N C38893j4 c38893j4, @j.N ICommonExecutor iCommonExecutor, @j.N B0 b02) {
        this.f378732a = context;
        this.f378733b = iCommonExecutor;
        this.f378734c = c38893j4;
        this.f378735d = b02;
    }

    public void a(@j.N File file) {
        C38672a7 c38672a7 = new C38672a7();
        this.f378733b.execute(new RunnableC39140t6(file, c38672a7, c38672a7, new a()));
    }

    public void a(@j.N C38869i4 c38869i4, @j.N C38715c0 c38715c0, @j.N D3 d32) {
        this.f378734c.a(c38869i4, d32).a(c38715c0, d32);
        this.f378734c.a(c38869i4.b(), c38869i4.c().intValue(), c38869i4.d());
    }

    @j.X
    public void a(@j.N C39093r7 c39093r7, @j.N InterfaceC39011nm<String, C38715c0> interfaceC39011nm) {
        ICommonExecutor iCommonExecutor = this.f378733b;
        B0 b02 = this.f378735d;
        String str = c39093r7.f381729a.f381927b;
        b02.getClass();
        iCommonExecutor.execute(new RunnableC39140t6(new File(str), new C38872i7(new C38722c7(EnumC38822g7.CRASHPAD, c39093r7.f381731c.f378177b), new C38847h7(new P6())), new C39189v7.c(c39093r7.f381729a.f381926a), new b(c39093r7.f381730b, interfaceC39011nm)));
    }

    public void a(C38715c0 c38715c0, Bundle bundle) {
        if (EnumC38666a1.EVENT_TYPE_UNDEFINED.b() == c38715c0.f380258e) {
            return;
        }
        this.f378733b.execute(new N1(this.f378732a, c38715c0, bundle, this.f378734c));
    }
}
