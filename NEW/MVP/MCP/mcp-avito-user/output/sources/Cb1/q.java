package cb1;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.N;

/* loaded from: classes9.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final T11.f f58032a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f58033b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC42726C f58034c;

    public static final class a extends N implements Y41.a<jb1.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f58035l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final jb1.e invoke() {
            C27169h.f57985a.getClass();
            return new jb1.e((ab1.j) C27169h.f58002r.getValue());
        }
    }

    public static final class b extends N implements Y41.a<jb1.e> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f58036l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final jb1.e invoke() {
            C27169h.f57985a.getClass();
            return new jb1.e((ab1.j) C27169h.f58002r.getValue());
        }
    }

    static {
        Qa1.p pVar = C27166e.f57981b;
        f58032a = pVar != null ? pVar.f13854c : new T11.c("VkpnsClientSdk");
        f58033b = C42727D.c(a.f58035l);
        f58034c = C42727D.c(b.f58036l);
    }

    @Y61.k
    public static jb1.e a() {
        if (C27166e.f57981b != null) {
            return (jb1.e) f58034c.getValue();
        }
        throw new IllegalStateException("CommonModule.init() must be called before accessing its members");
    }
}
