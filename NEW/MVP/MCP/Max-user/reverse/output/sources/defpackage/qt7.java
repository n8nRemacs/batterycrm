package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface qt7 extends v74 {
    y73 attachChild(a83 a83Var);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    zde getChildren();

    sy4 invokeOnCompletion(em6 em6Var);

    sy4 invokeOnCompletion(boolean z, boolean z2, em6 em6Var);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(Continuation continuation);

    boolean start();
}
