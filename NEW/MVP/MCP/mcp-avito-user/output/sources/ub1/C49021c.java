package ub1;

import Na1.b;
import Oa1.C14666z;
import android.content.Context;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.N;

/* renamed from: ub1.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49021c {

    /* renamed from: h, reason: collision with root package name */
    public static volatile C49021c f440134h;

    /* renamed from: a, reason: collision with root package name */
    public final Context f440135a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f440136b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC42726C f440137c = C42727D.c(new C12725c());

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC42726C f440138d = C42727D.c(new e());

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC42726C f440139e = C42727D.c(d.f440144l);

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC42726C f440140f = C42727D.c(new b());

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC42726C f440141g = C42727D.c(new f());

    /* renamed from: ub1.c$a */
    public static final class a {
    }

    /* renamed from: ub1.c$b */
    public static final class b extends N implements Y41.a<Na1.b> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Na1.b invoke() {
            b.a aVar = Na1.b.f11605b;
            Context context = C49021c.this.f440135a;
            aVar.getClass();
            return C14666z.f12400c.a(context).f12403b;
        }
    }

    /* renamed from: ub1.c$c, reason: collision with other inner class name */
    public static final class C12725c extends N implements Y41.a<m> {
        public C12725c() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            C49021c c49021c = C49021c.this;
            return new m((s) c49021c.f440138d.getValue(), (F) c49021c.f440141g.getValue());
        }
    }

    /* renamed from: ub1.c$d */
    public static final class d extends N implements Y41.a<o> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f440144l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            return new o();
        }
    }

    /* renamed from: ub1.c$e */
    public static final class e extends N implements Y41.a<s> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final s invoke() {
            C49021c c49021c = C49021c.this;
            return new s((o) c49021c.f440139e.getValue(), (Na1.b) c49021c.f440140f.getValue());
        }
    }

    /* renamed from: ub1.c$f */
    public static final class f extends N implements Y41.a<F> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final F invoke() {
            return new F(new G(), new C49019a(C49021c.this.f440136b), new C49020b());
        }
    }

    public C49021c(Context context, Map map) {
        this.f440135a = context;
        this.f440136b = map;
    }
}
