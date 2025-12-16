package arrow.core;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;

/* compiled from: Eval.kt */
@q2.e
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0004:\u0007\u0007\b\t\n\u000b\f\rB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Larrow/core/d;", "A", "Lq2/b;", "Larrow/core/u;", "Larrow/core/EvalOf;", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "Larrow/core/d$g;", "Larrow/core/d$e;", "Larrow/core/d$a;", "Larrow/core/d$c;", "Larrow/core/d$d;", "Larrow/core/d$f;", "arrow-core"}, k = 1, mv = {1, 4, 0})
/* renamed from: arrow.core.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC23671d<A> implements q2.b<C23716u, A> {

    /* renamed from: a, reason: collision with root package name */
    public static final b f56271a = new b(null);

    /* compiled from: Eval.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Larrow/core/d$a;", "A", "Larrow/core/d;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.d$a */
    public static final /* data */ class a<A> extends AbstractC23671d<A> {
        @Override // arrow.core.AbstractC23671d
        public final A a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Always(f=null)";
        }
    }

    /* compiled from: Eval.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Larrow/core/d$b;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.d$b */
    public static final class b {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v3, types: [T, arrow.core.d$g] */
        /* JADX WARN: Type inference failed for: r5v10, types: [T, arrow.core.d] */
        /* JADX WARN: Type inference failed for: r5v16, types: [T, arrow.core.d] */
        /* JADX WARN: Type inference failed for: r5v31, types: [T, arrow.core.d] */
        /* JADX WARN: Type inference failed for: r5v5, types: [T, arrow.core.d] */
        public static final Object a(b bVar, @Y61.k AbstractC1977d abstractC1977d) {
            bVar.getClass();
            l0.h hVar = new l0.h();
            hVar.f406842b = abstractC1977d;
            l0.h hVar2 = new l0.h();
            hVar2.f406842b = new ArrayList();
            new C23689j(bVar);
            while (true) {
                AbstractC23671d abstractC23671d = (AbstractC23671d) hVar.f406842b;
                if (abstractC23671d instanceof AbstractC1977d) {
                    if (abstractC23671d == null) {
                        throw new TypeCastException("null cannot be cast to non-null type arrow.core.Eval.FlatMap<A>");
                    }
                    AbstractC1977d abstractC1977d2 = (AbstractC1977d) abstractC23671d;
                    AbstractC23671d abstractC23671dC = abstractC1977d2.c();
                    if (abstractC23671dC instanceof AbstractC1977d) {
                        C23692k c23692k = new C23692k((AbstractC1977d) abstractC23671dC);
                        C23674e c23674e = new C23674e(abstractC1977d2);
                        hVar.f406842b = ((AbstractC1977d) abstractC23671dC).c();
                        ((List) hVar2.f406842b).add(0, c23674e);
                        ((List) hVar2.f406842b).add(0, c23692k);
                    } else if (abstractC23671dC instanceof f) {
                        hVar.f406842b = new g(((f) abstractC23671dC).f56273b.f56288b);
                        ((List) hVar2.f406842b).add(0, new C23680g(abstractC1977d2));
                    } else {
                        hVar.f406842b = abstractC1977d2.b(abstractC23671dC.a());
                    }
                } else if (abstractC23671d instanceof f) {
                    if (abstractC23671d == null) {
                        throw new TypeCastException("null cannot be cast to non-null type arrow.core.Eval.Memoize<A>");
                    }
                    C23703n1 c23703n1 = ((f) abstractC23671d).f56273b;
                    if (!((List) hVar2.f406842b).isEmpty()) {
                        hVar.f406842b = (AbstractC23671d) ((Y41.l) ((List) hVar2.f406842b).get(0)).invoke(c23703n1.f56288b);
                        ((List) hVar2.f406842b).remove(0);
                    }
                } else {
                    if (((List) hVar2.f406842b).isEmpty()) {
                        return ((AbstractC23671d) hVar.f406842b).a();
                    }
                    hVar.f406842b = (AbstractC23671d) ((Y41.l) ((List) hVar2.f406842b).get(0)).invoke(((AbstractC23671d) hVar.f406842b).a());
                    ((List) hVar2.f406842b).remove(0);
                }
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: Eval.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Larrow/core/d$c;", "A", "Larrow/core/d;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.d$c */
    public static final /* data */ class c<A> extends AbstractC23671d<A> {
        @Override // arrow.core.AbstractC23671d
        public final A a() {
            AbstractC23671d.f56271a.getClass();
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Defer(thunk=null)";
        }
    }

    /* compiled from: Eval.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Larrow/core/d$d;", "A", "Larrow/core/d;", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC1977d<A> extends AbstractC23671d<A> {
        public AbstractC1977d() {
            super(null);
        }

        @Override // arrow.core.AbstractC23671d
        public final A a() {
            return (A) b.a(AbstractC23671d.f56271a, this);
        }

        @Y61.k
        public abstract <S> AbstractC23671d<A> b(S s5);

        @Y61.k
        public abstract <S> AbstractC23671d<S> c();
    }

    /* compiled from: Eval.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Larrow/core/d$e;", "A", "Larrow/core/d;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.d$e */
    public static final /* data */ class e<A> extends AbstractC23671d<A> {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n[] f56272b;

        static {
            kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
            f56272b = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(e.class), "value", "getValue()Ljava/lang/Object;"))};
        }

        @Override // arrow.core.AbstractC23671d
        public final A a() {
            kotlin.reflect.n nVar = f56272b[0];
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Later(f=null)";
        }
    }

    /* compiled from: Eval.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Larrow/core/d$f;", "A", "Larrow/core/d;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.d$f */
    public static final /* data */ class f<A> extends AbstractC23671d<A> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public C23703n1 f56273b;

        /* compiled from: Eval.kt */
        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0006\b\u0001\u0010\u0001 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "A", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 1, 9})
        /* renamed from: arrow.core.d$f$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<A> {
            public a() {
                super(0);
            }

            @Override // Y41.a
            public final A invoke() {
                b bVar = AbstractC23671d.f56271a;
                f fVar = f.this;
                fVar.getClass();
                A a12 = (A) b.a(bVar, null);
                fVar.f56273b = new C23703n1(a12);
                return a12;
            }
        }

        @Override // arrow.core.AbstractC23671d
        public final A a() {
            return (A) Z0.a(this.f56273b, new a());
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Memoize(eval=null)";
        }
    }

    /* compiled from: Eval.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Larrow/core/d$g;", "A", "Larrow/core/d;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.d$g */
    public static final /* data */ class g<A> extends AbstractC23671d<A> {

        /* renamed from: b, reason: collision with root package name */
        public final A f56275b;

        public g(A a12) {
            super(null);
            this.f56275b = a12;
        }

        @Override // arrow.core.AbstractC23671d
        public final A a() {
            return this.f56275b;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof g) && kotlin.jvm.internal.L.f(this.f56275b, ((g) obj).f56275b);
            }
            return true;
        }

        public final int hashCode() {
            A a12 = this.f56275b;
            if (a12 != null) {
                return a12.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return androidx.appcompat.app.r.o(this.f56275b, ")", new StringBuilder("Now(value="));
        }
    }

    static {
        new g(kotlin.G0.f406611a);
        new g(Boolean.TRUE);
        new g(Boolean.FALSE);
        new g(0);
        new g(1);
    }

    public AbstractC23671d() {
    }

    public abstract A a();

    public /* synthetic */ AbstractC23671d(C42822w c42822w) {
        this();
    }
}
