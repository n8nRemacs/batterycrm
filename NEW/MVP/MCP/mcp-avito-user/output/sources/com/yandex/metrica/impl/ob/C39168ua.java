package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.YandexMetricaConfig;

/* renamed from: com.yandex.metrica.impl.ob.ua, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39168ua {

    /* renamed from: com.yandex.metrica.impl.ob.ua$a */
    public class a implements InterfaceC39011nm<C39096ra, C39073qa> {
        public a(C39168ua c39168ua) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public C39073qa a(@j.N C39096ra c39096ra) {
            return c39096ra.f381733a;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$b */
    public class b implements InterfaceC39011nm<C39096ra, C39073qa> {
        public b(C39168ua c39168ua) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public C39073qa a(@j.N C39096ra c39096ra) {
            return c39096ra.f381735c;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$c */
    public class c implements InterfaceC39216wa {
        public c(C39168ua c39168ua) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39216wa
        public long a(@j.N Z8 z82) {
            return z82.c(Long.MAX_VALUE);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39216wa
        public void a(@j.N Z8 z82, long j12) {
            z82.e(j12);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$d */
    public class d implements InterfaceC39011nm<C39096ra, C39073qa> {
        public d(C39168ua c39168ua) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39011nm
        public C39073qa a(@j.N C39096ra c39096ra) {
            return c39096ra.f381734b;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ua$e */
    public class e implements InterfaceC39216wa {
        public e(C39168ua c39168ua) {
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39216wa
        public long a(@j.N Z8 z82) {
            return z82.b(Long.MAX_VALUE);
        }

        @Override // com.yandex.metrica.impl.ob.InterfaceC39216wa
        public void a(@j.N Z8 z82, long j12) {
            z82.d(j12);
        }
    }

    @j.N
    public C39144ta<YandexMetricaConfig> a(@j.N Context context, @j.N Q0 q02) {
        Xl xl2 = new Xl();
        return new C39144ta<>(context, q02, "activation", new C38999na(xl2, new C39264ya()), new a(this), new C39024oa(xl2));
    }

    @j.N
    public C39144ta<C39185v3> b(@j.N Context context, @j.N Q0 q02) {
        return new C39144ta<>(context, q02, "clids_info", new C39049pa(), new d(this), new e(this));
    }

    @j.N
    public C39144ta<Ud> c(@j.N Context context, @j.N Q0 q02) {
        return new C39144ta<>(context, q02, "preload_info", new C39240xa(), new b(this), new c(this));
    }
}
