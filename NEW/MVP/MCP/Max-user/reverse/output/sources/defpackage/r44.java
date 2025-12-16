package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface r44 extends v74 {
    Continuation interceptContinuation(Continuation continuation);

    void releaseInterceptedContinuation(Continuation continuation);
}
