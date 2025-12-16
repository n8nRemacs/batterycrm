package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.Jf;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.fa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC38800fa<T> {

    /* renamed from: com.yandex.metrica.impl.ob.fa$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<Class<?>, InterfaceC38800fa<?>> f380576a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC38800fa<C39081qi> f380577b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC38800fa<Jf.e> f380578c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC38800fa<List<Bd>> f380579d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC38800fa<C39147td> f380580e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC38800fa<C38782eh> f380581f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        private final InterfaceC38800fa<C38779ee> f380582g;

        /* renamed from: h, reason: collision with root package name */
        @Deprecated
        private final InterfaceC38800fa<Z1> f380583h;

        /* renamed from: i, reason: collision with root package name */
        private final InterfaceC38800fa<Ud> f380584i;

        /* renamed from: j, reason: collision with root package name */
        private final InterfaceC38800fa<X2> f380585j;

        /* renamed from: k, reason: collision with root package name */
        private final InterfaceC38800fa<C39185v3> f380586k;

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$a */
        public class a extends AbstractC38825ga<C39185v3> {
            public a(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("clids_info", r72, new C38775ea(new C39204vm(context)).c(), new C39239x9());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$b, reason: collision with other inner class name */
        public class C10957b extends AbstractC38825ga<C39081qi> {
            public C10957b(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("startup_state", r72, new C38775ea(new C39204vm(context)).i(), new X9());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$c */
        public class c extends AbstractC38825ga<Jf.e> {
            public c(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("provided_request_state", r72, new C38775ea(new C39204vm(context)).g(), new R9());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$d */
        public class d extends AbstractC38825ga<List<Bd>> {
            public d(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("permission_list", r72, new C38775ea(new C39204vm(context)).d(), new P9());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$e */
        public class e extends AbstractC38825ga<C39147td> {
            public e(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("app_permissions_state", r72, new C38775ea(new C39204vm(context)).a(), new C39095r9());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$f */
        public class f extends AbstractC38825ga<C38782eh> {
            public f(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("sdk_fingerprinting", r72, new C38775ea(new C39204vm(context)).h(), new V9());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$g */
        public class g extends AbstractC38825ga<C38779ee> {
            public g(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("preload_info", r72, new C38775ea(new C39204vm(context)).f(), new C38804fe());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$h */
        public class h extends AbstractC38825ga<Z1> {
            public h(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("satellite_clids_info", r72, new C38998n9(), new T9());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$i */
        public class i extends AbstractC38825ga<Ud> {
            public i(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("preload_info_data", r72, new C38775ea(new C39204vm(context)).e(), new Wd());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).n();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).o();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$j */
        public class j extends AbstractC38825ga<X2> {
            public j(b bVar) {
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public ProtobufStateStorage a(@j.N Context context, @j.N R7 r72) {
                return new C38948l9("auto_inapp_collecting_info_data", r72, new C38775ea(new C39204vm(context)).b(), new Y2());
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 c(@j.N Context context) {
                return C38899ja.a(context).a();
            }

            @Override // com.yandex.metrica.impl.ob.AbstractC38825ga
            @j.N
            public R7 d(@j.N Context context) {
                return C38899ja.a(context).b();
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.fa$b$k */
        public static final class k {

            /* renamed from: a, reason: collision with root package name */
            static final b f380587a = new b();
        }

        public static <T> InterfaceC38800fa<T> a(Class<T> cls) {
            return (InterfaceC38800fa) k.f380587a.f380576a.get(cls);
        }

        public static <T> InterfaceC38800fa<Collection<T>> b(Class<T> cls) {
            return (InterfaceC38800fa) k.f380587a.f380576a.get(cls);
        }

        private b() {
            HashMap<Class<?>, InterfaceC38800fa<?>> map = new HashMap<>();
            this.f380576a = map;
            C10957b c10957b = new C10957b(this);
            this.f380577b = c10957b;
            c cVar = new c(this);
            this.f380578c = cVar;
            d dVar = new d(this);
            this.f380579d = dVar;
            e eVar = new e(this);
            this.f380580e = eVar;
            f fVar = new f(this);
            this.f380581f = fVar;
            g gVar = new g(this);
            this.f380582g = gVar;
            h hVar = new h(this);
            this.f380583h = hVar;
            i iVar = new i(this);
            this.f380584i = iVar;
            j jVar = new j(this);
            this.f380585j = jVar;
            a aVar = new a(this);
            this.f380586k = aVar;
            map.put(C39081qi.class, c10957b);
            map.put(Jf.e.class, cVar);
            map.put(Bd.class, dVar);
            map.put(C39147td.class, eVar);
            map.put(C38782eh.class, fVar);
            map.put(C38779ee.class, gVar);
            map.put(Z1.class, hVar);
            map.put(Ud.class, iVar);
            map.put(X2.class, jVar);
            map.put(C39185v3.class, aVar);
        }
    }

    ProtobufStateStorage a(@j.N Context context);

    ProtobufStateStorage b(@j.N Context context);
}
