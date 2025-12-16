package androidx.work.impl.utils;

import androidx.work.b0;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.D0;
import kotlin.Metadata;

/* compiled from: StatusRunnable.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@X41.i
/* loaded from: classes10.dex */
public final class G {
    @Y61.k
    public static final D0 a(@Y61.k WorkDatabase workDatabase, @Y61.k androidx.work.impl.utils.taskexecutor.c cVar, @Y61.k String str) {
        D d12 = new D(str);
        return androidx.concurrent.futures.b.a(new FX0.b(cVar.f56028a, "loadStatusFuture", new F(d12, workDatabase), 3));
    }

    @Y61.k
    public static final D0 b(@Y61.k WorkDatabase workDatabase, @Y61.k androidx.work.impl.utils.taskexecutor.c cVar, @Y61.k b0 b0Var) {
        E e12 = new E(b0Var);
        return androidx.concurrent.futures.b.a(new FX0.b(cVar.f56028a, "loadStatusFuture", new F(e12, workDatabase), 3));
    }
}
