package androidx.work;

import androidx.work.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: OneTimeWorkRequest.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/J;", "Landroidx/work/c0;", "a", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class J extends c0 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final b f55385e = new b(null);

    /* compiled from: OneTimeWorkRequest.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/J$b;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: OneTimeWorkRequest.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/work/J$a;", "Landroidx/work/c0$a;", "Landroidx/work/J;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends c0.a<a, J> {
        public a() {
            throw null;
        }

        @Override // androidx.work.c0.a
        public final c0 c() {
            if (this.f55481a && this.f55483c.f55804j.f55490d) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new J(this.f55482b, this.f55483c, this.f55484d);
        }

        @Override // androidx.work.c0.a
        public final c0.a d() {
            return this;
        }
    }
}
