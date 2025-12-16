package androidx.work;

import android.content.Context;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;

/* compiled from: WorkerFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/e0;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class e0 {
    @Y61.l
    public abstract F a(@Y61.k Context context, @Y61.k String str, @Y61.k WorkerParameters workerParameters);

    @Y61.k
    @RestrictTo
    public final F b(@Y61.k Context context, @Y61.k String str, @Y61.k WorkerParameters workerParameters) {
        F fA2 = a(context, str, workerParameters);
        if (fA2 == null) {
            try {
                try {
                    fA2 = (F) Class.forName(str).asSubclass(F.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    G gA2 = G.a();
                    int i12 = f0.f55507a;
                    "Could not instantiate ".concat(str);
                    gA2.getClass();
                    throw th2;
                }
            } catch (Throwable th3) {
                G gA3 = G.a();
                int i13 = f0.f55507a;
                "Invalid class: ".concat(str);
                gA3.getClass();
                throw th3;
            }
        }
        if (!fA2.isUsed()) {
            return fA2;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
