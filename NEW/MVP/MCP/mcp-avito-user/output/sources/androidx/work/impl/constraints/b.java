package androidx.work.impl.constraints;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WorkConstraintsTracker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/constraints/b;", "", "<init>", "()V", "a", "b", "Landroidx/work/impl/constraints/b$a;", "Landroidx/work/impl/constraints/b$b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class b {

    /* compiled from: WorkConstraintsTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/constraints/b$a;", "Landroidx/work/impl/constraints/b;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f55669a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: WorkConstraintsTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/b$b;", "Landroidx/work/impl/constraints/b;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.work.impl.constraints.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1953b extends b {

        /* renamed from: a, reason: collision with root package name */
        public final int f55670a;

        public C1953b(int i12) {
            super(null);
            this.f55670a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1953b) && this.f55670a == ((C1953b) obj).f55670a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f55670a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ConstraintsNotMet(reason="), this.f55670a, ')');
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }
}
