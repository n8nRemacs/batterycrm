package arrow.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Try.kt */
@q2.e
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0004:\u0003\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Larrow/core/o1;", "A", "Lq2/b;", "Larrow/core/z;", "Larrow/core/TryOf;", "<init>", "()V", "a", "b", "c", "Larrow/core/o1$b;", "Larrow/core/o1$c;", "arrow-core"}, k = 1, mv = {1, 4, 0})
/* renamed from: arrow.core.o1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC23706o1<A> implements q2.b<C23726z, A> {

    /* compiled from: Try.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Larrow/core/o1$a;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.o1$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: Try.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Larrow/core/o1$b;", "A", "Larrow/core/o1;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.o1$b */
    public static final /* data */ class b<A> extends AbstractC23706o1<A> {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return kotlin.jvm.internal.L.f(null, null);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Failure(exception=null)";
        }
    }

    /* compiled from: Try.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Larrow/core/o1$c;", "A", "Larrow/core/o1;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.core.o1$c */
    public static final /* data */ class c<A> extends AbstractC23706o1<A> {
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
            return "Success(value=null)";
        }
    }

    static {
        new a(null);
    }

    public AbstractC23706o1() {
    }

    public /* synthetic */ AbstractC23706o1(C42822w c42822w) {
        this();
    }
}
