package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.CounterConfiguration;
import com.yandex.metrica.impl.ob.C39126sg;
import com.yandex.metrica.impl.ob.D3;
import java.io.File;

/* loaded from: classes7.dex */
public class U3 extends L3 implements InterfaceC38880ig, InterfaceC38856hg {

    /* renamed from: A, reason: collision with root package name */
    @j.N
    private final C39126sg f379596A;

    /* renamed from: B, reason: collision with root package name */
    @j.N
    private final C39150tg f379597B;

    /* renamed from: C, reason: collision with root package name */
    @j.N
    private final C39112s2 f379598C;

    /* renamed from: D, reason: collision with root package name */
    @j.N
    private final InterfaceC38772e7<File> f379599D;

    /* renamed from: E, reason: collision with root package name */
    @j.N
    private final C38768e3 f379600E;

    public class a implements InterfaceC38986mm<File> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC38986mm
        public void b(@j.N File file) {
            U3.a(U3.this, file);
        }
    }

    public class b implements C39126sg.a {
        public b() {
        }

        @Override // com.yandex.metrica.impl.ob.C39126sg.a
        public void a(@j.P C38756dg c38756dg) {
            if (c38756dg == null) {
                return;
            }
            U3.this.a(new C38715c0().a(c38756dg.a()).a(EnumC38666a1.EVENT_TYPE_SEND_REFERRER.b()));
        }
    }

    public U3(@j.N Context context, @j.N C39057pi c39057pi, @j.N I3 i32, @j.N D3.a aVar, @j.N C39126sg c39126sg, @j.N C39112s2 c39112s2, @j.N AbstractC39200vi abstractC39200vi) {
        this(context, i32, c39057pi, aVar, new B3(), new C39232x2(), new B0(), new V3(context, i32, aVar, abstractC39200vi, c39057pi, new T3(c39112s2), F0.g().q().d(), A2.b(context, i32.b()), F0.g().q(), F0.g().h()), c39126sg, c39112s2);
    }

    private void a(@j.N Context context, @j.N B0 b02) {
        File fileA = b02.a(context, "YandexMetricaNativeCrashes");
        if (fileA != null) {
            new Y6(fileA, new a()).a();
        }
    }

    @Override // com.yandex.metrica.impl.ob.L3
    public void G() {
        this.f379596A.a(this.f379597B);
    }

    @Override // com.yandex.metrica.impl.ob.L3
    @j.N
    public CounterConfiguration.b s() {
        return CounterConfiguration.b.MAIN;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38856hg
    public void a() {
        x().c(true);
    }

    @Override // com.yandex.metrica.impl.ob.L3, com.yandex.metrica.impl.ob.S3
    public synchronized void a(@j.N D3.a aVar) {
        super.a(aVar);
        this.f379598C.a(aVar.f377943l);
    }

    @Override // com.yandex.metrica.impl.ob.L3, com.yandex.metrica.impl.ob.InterfaceC38932ki
    public void a(@j.N C39057pi c39057pi) {
        super.a(c39057pi);
        this.f379600E.a(c39057pi);
    }

    @j.k0
    public U3(@j.N Context context, @j.N I3 i32, @j.N C39057pi c39057pi, @j.N D3.a aVar, @j.N B3 b32, @j.N C39232x2 c39232x2, @j.N B0 b02, @j.N V3 v32, @j.N C39126sg c39126sg, @j.N C39112s2 c39112s2) {
        super(context, i32, b32, c39232x2, v32);
        this.f379596A = c39126sg;
        I4 i4K = k();
        i4K.a(EnumC38666a1.EVENT_TYPE_REGULAR, new C5(i4K.b()));
        this.f379597B = v32.c(this);
        this.f379598C = c39112s2;
        C38996n7 c38996n7A = v32.a(v32.f(), v32.b(this), f());
        this.f379599D = c38996n7A;
        c38996n7A.a();
        a(context, b02);
        C38768e3 c38768e3A = v32.a(this);
        this.f379600E = c38768e3A;
        c38768e3A.a(c39057pi, aVar.f377948q);
    }

    public static void a(U3 u32, File file) {
        u32.f379599D.a(file);
    }
}
