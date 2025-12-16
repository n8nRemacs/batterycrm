package androidx.work;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;

/* compiled from: DelegatingWorkerFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/t;", "Landroidx/work/e0;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23635t extends e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CopyOnWriteArrayList f56211a = new CopyOnWriteArrayList();

    @Override // androidx.work.e0
    @Y61.l
    public final F a(@Y61.k Context context, @Y61.k String str, @Y61.k WorkerParameters workerParameters) {
        Iterator it = this.f56211a.iterator();
        while (it.hasNext()) {
            try {
                F fA2 = ((e0) it.next()).a(context, str, workerParameters);
                if (fA2 != null) {
                    return fA2;
                }
            } catch (Throwable th2) {
                G gA2 = G.a();
                int i12 = C23636u.f56212a;
                gA2.getClass();
                throw th2;
            }
        }
        return null;
    }
}
