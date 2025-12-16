package db1;

import kotlinx.coroutines.U;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* loaded from: classes9.dex */
public final class q implements ru.rustore.sdk.core.tasks.c {
    @Override // ru.rustore.sdk.core.tasks.c
    public final void a(Throwable th2) {
        if (th2 instanceof TaskCancellationException) {
            U.b(null, null);
            throw null;
        }
    }
}
