package androidx.work.impl.utils;

import androidx.work.C23538b;
import androidx.work.C23544h;
import androidx.work.c0;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: EnqueueUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.utils.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23596f {
    public static final void a(@Y61.k WorkDatabase workDatabase, @Y61.k C23538b c23538b, @Y61.k androidx.work.impl.G g12) {
        int i12;
        ArrayList arrayListE0 = C42745f0.e0(g12);
        int i13 = 0;
        while (!arrayListE0.isEmpty()) {
            androidx.work.impl.G g13 = (androidx.work.impl.G) C42745f0.n0(arrayListE0);
            List<? extends c0> list = g13.f55529d;
            if ((list instanceof Collection) && list.isEmpty()) {
                i12 = 0;
            } else {
                Iterator<T> it = list.iterator();
                i12 = 0;
                while (it.hasNext()) {
                    if (((c0) it.next()).f55479b.f55804j.b() && (i12 = i12 + 1) < 0) {
                        C42745f0.G0();
                        throw null;
                    }
                }
            }
            i13 += i12;
            List<androidx.work.impl.G> list2 = g13.f55532g;
            if (list2 != null) {
                arrayListE0.addAll(list2);
            }
        }
        if (i13 == 0) {
            return;
        }
        int iV2 = workDatabase.A().v();
        int i14 = iV2 + i13;
        int i15 = c23538b.f55459m;
        if (i14 > i15) {
            throw new IllegalArgumentException(AK.c.i(i13, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", androidx.appcompat.app.r.y(i15, iV2, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ")));
        }
    }

    @Y61.k
    public static final androidx.work.impl.model.H b(@Y61.k androidx.work.impl.model.H h12) {
        boolean zD2 = h12.f55799e.d("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zD3 = h12.f55799e.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zD4 = h12.f55799e.d("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (zD2 || !zD3 || !zD4) {
            return h12;
        }
        C23544h.a aVar = new C23544h.a();
        aVar.b(h12.f55799e.f55510a);
        aVar.f55511a.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", h12.f55797c);
        return androidx.work.impl.model.H.b(h12, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", aVar.a(), 0, 0L, 0, 0, 0L, 0, 16777195);
    }
}
