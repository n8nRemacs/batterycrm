package db1;

import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* loaded from: classes9.dex */
public final class u implements ru.rustore.sdk.core.tasks.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C43238h f393966b;

    public u(C43238h c43238h) {
        this.f393966b = c43238h;
    }

    @Override // ru.rustore.sdk.core.tasks.c
    public final void a(Throwable th2) {
        if (th2 instanceof TaskCancellationException) {
            U.b(this.f393966b, null);
        }
    }
}
