package arrow.legacy;

import androidx.compose.foundation.H;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Disjunction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003:\u0003\u0006\u0007\bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Larrow/legacy/a;", "L", "R", "Larrow/legacy/e;", "<init>", "()V", "a", "b", "c", "Larrow/legacy/a$b;", "Larrow/legacy/a$c;", "arrow-core"}, k = 1, mv = {1, 4, 0})
@InterfaceC42830m
/* loaded from: classes10.dex */
public abstract class a<L, R> implements e {

    /* compiled from: Disjunction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Larrow/legacy/a$a;", "", "<init>", "()V", "arrow-core"}, k = 1, mv = {1, 4, 0})
    /* renamed from: arrow.legacy.a$a, reason: collision with other inner class name */
    public static final class C1978a {
        public C1978a() {
        }

        public /* synthetic */ C1978a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: Disjunction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0006\b\u0003\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Larrow/legacy/a$b;", "L", "R", "Larrow/legacy/a;", "Larrow/legacy/f;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    public static final class b<L, R> extends a<L, R> implements f {
        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            return 43;
        }

        @Y61.k
        public final String toString() {
            return "Disjunction.Left(null)";
        }
    }

    /* compiled from: Disjunction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0006\b\u0002\u0010\u0001 \u0001*\u0006\b\u0003\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Larrow/legacy/a$c;", "L", "R", "Larrow/legacy/a;", "Larrow/legacy/l;", "arrow-core"}, k = 1, mv = {1, 4, 0})
    public static final class c<L, R> extends a<L, R> implements l {
        public final boolean equals(@Y61.l Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            return 43;
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("Disjunction.Right("), null, ')');
        }
    }

    static {
        new C1978a(null);
    }

    public a() {
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }
}
