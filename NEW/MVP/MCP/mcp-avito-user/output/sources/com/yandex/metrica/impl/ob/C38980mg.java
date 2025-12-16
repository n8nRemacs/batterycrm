package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;

/* renamed from: com.yandex.metrica.impl.ob.mg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38980mg {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC42726C f381109a = C42727D.c(new c());

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC42726C f381110b = C42727D.c(new b());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC42726C f381111c = C42727D.c(new d());

    /* renamed from: d, reason: collision with root package name */
    private final List<C38756dg> f381112d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final C39126sg f381113e;

    /* renamed from: f, reason: collision with root package name */
    private final C39222wg f381114f;

    /* renamed from: g, reason: collision with root package name */
    private final C38831gg f381115g;

    /* renamed from: h, reason: collision with root package name */
    private final C39246xg f381116h;

    /* renamed from: com.yandex.metrica.impl.ob.mg$a */
    public interface a {
        @j.l0
        void a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<C39005ng> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public C39005ng invoke() {
            return new C39005ng(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<C39030og> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public C39030og invoke() {
            return new C39030og(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.mg$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<C39055pg> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public C39055pg invoke() {
            return new C39055pg(this);
        }
    }

    @j.k0
    public C38980mg(@Y61.k C39126sg c39126sg, @Y61.k C39222wg c39222wg, @Y61.k C38831gg c38831gg, @Y61.k C39246xg c39246xg) {
        this.f381113e = c39126sg;
        this.f381114f = c39222wg;
        this.f381115g = c38831gg;
        this.f381116h = c39246xg;
    }

    public static final a b(C38980mg c38980mg) {
        return (a) c38980mg.f381110b.getValue();
    }

    public static final a c(C38980mg c38980mg) {
        return (a) c38980mg.f381109a.getValue();
    }

    public static final void a(C38980mg c38980mg, C38756dg c38756dg, a aVar) {
        c38980mg.f381112d.add(c38756dg);
        if (c38980mg.f381116h.a(c38756dg)) {
            c38980mg.f381113e.a(c38756dg);
        } else {
            aVar.a();
        }
    }

    public final void b() {
        this.f381114f.a((InterfaceC39198vg) this.f381111c.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        List<C38756dg> list = this.f381112d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.f381116h.b((C38756dg) obj)) {
                arrayList.add(obj);
            }
        }
        this.f381113e.a(this.f381116h.a(C42745f0.C(arrayList)));
    }
}
