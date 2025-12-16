package arrow.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Either.kt */
@q2.e
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00028\u00010\u0003j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0005:\u0003\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Larrow/core/a;", "A", "B", "Lq2/b;", "Larrow/core/t;", "Larrow/core/EitherOf;", "<init>", "()V", "a", "b", "c", "Larrow/core/a$b;", "Larrow/core/a$c;", "arrow-core"}, k = 1, mv = {1, 4, 0})
/* renamed from: arrow.core.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC23662a<A, B> implements q2.b<q2.b<? extends C23714t, ? extends A>, B> {

    /* renamed from: a, reason: collision with root package name */
    public static final C1974a f56267a = new C1974a(null);

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Larrow/core/a$a;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.a$a, reason: collision with other inner class name */
    public static final class C1974a {
        public C1974a() {
        }

        public /* synthetic */ C1974a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0006\b\u0003\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Larrow/core/a$b;", "A", "B", "Larrow/core/a;", "a", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.a$b */
    public static final /* data */ class b<A, B> extends AbstractC23662a<A, B> {

        /* renamed from: b, reason: collision with root package name */
        public final A f56268b;

        /* compiled from: Either.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Larrow/core/a$b$a;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
        /* renamed from: arrow.core.a$b$a, reason: collision with other inner class name */
        public static final class C1975a {
            public C1975a() {
            }

            public /* synthetic */ C1975a(C42822w c42822w) {
                this();
            }
        }

        static {
            new C1975a(null);
        }

        @kotlin.X
        public b(A a12) {
            super(null);
            this.f56268b = a12;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f56268b, ((b) obj).f56268b);
            }
            return true;
        }

        public final int hashCode() {
            A a12 = this.f56268b;
            if (a12 != null) {
                return a12.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return androidx.appcompat.app.r.o(this.f56268b, ")", new StringBuilder("Left(a="));
        }
    }

    /* compiled from: Either.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0006\b\u0003\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Larrow/core/a$c;", "A", "B", "Larrow/core/a;", "a", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.a$c */
    public static final /* data */ class c<A, B> extends AbstractC23662a<A, B> {

        /* renamed from: b, reason: collision with root package name */
        public final B f56269b;

        /* compiled from: Either.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Larrow/core/a$c$a;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
        /* renamed from: arrow.core.a$c$a, reason: collision with other inner class name */
        public static final class C1976a {
            public C1976a() {
            }

            public /* synthetic */ C1976a(C42822w c42822w) {
                this();
            }
        }

        static {
            new C1976a(null);
        }

        @kotlin.X
        public c(B b12) {
            super(null);
            this.f56269b = b12;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f56269b, ((c) obj).f56269b);
            }
            return true;
        }

        public final int hashCode() {
            B b12 = this.f56269b;
            if (b12 != null) {
                return b12.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return androidx.appcompat.app.r.o(this.f56269b, ")", new StringBuilder("Right(b="));
        }
    }

    public AbstractC23662a() {
    }

    public /* synthetic */ AbstractC23662a(C42822w c42822w) {
        this();
    }
}
