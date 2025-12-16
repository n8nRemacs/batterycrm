package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface ms4 {
    Object delay(long j, Continuation continuation);

    sy4 invokeOnTimeout(long j, Runnable runnable, x74 x74Var);

    /* renamed from: scheduleResumeAfterDelay */
    void mo14scheduleResumeAfterDelay(long j, k42 k42Var);
}
