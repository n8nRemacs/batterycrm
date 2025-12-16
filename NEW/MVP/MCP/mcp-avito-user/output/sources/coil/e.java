package coil;

import coil.decode.h;
import coil.fetch.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComponentRegistry.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcoil/e;", "", "<init>", "()V", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<coil.intercept.i> f58361a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Q<I2.d<? extends Object, ? extends Object>, Class<? extends Object>>> f58362b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Q<H2.b<? extends Object>, Class<? extends Object>>> f58363c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Q<h.a<? extends Object>, Class<? extends Object>>> f58364d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<h.a> f58365e;

    public /* synthetic */ e(List list, List list2, List list3, List list4, List list5, C42822w c42822w) {
        this(list, list2, list3, list4, list5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(List<? extends coil.intercept.i> list, List<? extends Q<? extends I2.d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Q<? extends H2.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Q<? extends h.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends h.a> list5) {
        this.f58361a = list;
        this.f58362b = list2;
        this.f58363c = list3;
        this.f58364d = list4;
        this.f58365e = list5;
    }

    /* compiled from: ComponentRegistry.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/e$a;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f58366a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ArrayList f58367b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ArrayList f58368c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f58369d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ArrayList f58370e;

        public a() {
            this.f58366a = new ArrayList();
            this.f58367b = new ArrayList();
            this.f58368c = new ArrayList();
            this.f58369d = new ArrayList();
            this.f58370e = new ArrayList();
        }

        @Y61.k
        public final void a(@Y61.k I2.d dVar, @Y61.k Class cls) {
            this.f58367b.add(new Q(dVar, cls));
        }

        @Y61.k
        public final void b(@Y61.k h.a aVar, @Y61.k Class cls) {
            this.f58369d.add(new Q(aVar, cls));
        }

        @Y61.k
        public final e c() {
            return new e(coil.util.c.a(this.f58366a), coil.util.c.a(this.f58367b), coil.util.c.a(this.f58368c), coil.util.c.a(this.f58369d), coil.util.c.a(this.f58370e), null);
        }

        public a(@Y61.k e eVar) {
            this.f58366a = new ArrayList(eVar.f58361a);
            this.f58367b = new ArrayList(eVar.f58362b);
            this.f58368c = new ArrayList(eVar.f58363c);
            this.f58369d = new ArrayList(eVar.f58364d);
            this.f58370e = new ArrayList(eVar.f58365e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e() {
        C42784z0 c42784z0 = C42784z0.f406748b;
        this(c42784z0, c42784z0, c42784z0, c42784z0, c42784z0);
    }
}
