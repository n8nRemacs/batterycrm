package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public abstract class apd extends ij0 {
    public apd(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != bd5.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final x74 getContext() {
        return bd5.a;
    }
}
