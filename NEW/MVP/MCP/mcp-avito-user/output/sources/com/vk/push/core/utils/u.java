package com.vk.push.core.utils;

import kotlin.Metadata;
import kotlinx.coroutines.U;
import ru.rustore.sdk.core.tasks.TaskCancellationException;

/* compiled from: TaskExtensions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "cause", "Lkotlin/G0;", "onComplete", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
/* loaded from: classes7.dex */
public final class u implements ru.rustore.sdk.core.tasks.c {
    @Override // ru.rustore.sdk.core.tasks.c
    public final void a(Throwable th2) {
        if (th2 instanceof TaskCancellationException) {
            U.b(null, null);
            throw null;
        }
    }
}
