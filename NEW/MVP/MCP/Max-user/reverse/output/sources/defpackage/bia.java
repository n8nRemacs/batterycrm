package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bia extends p0 implements qt7 {
    public static final bia a = new bia(wha.w0);

    @Override // defpackage.qt7
    public final y73 attachChild(a83 a83Var) {
        return iia.a;
    }

    @Override // defpackage.qt7
    public final void cancel(CancellationException cancellationException) {
    }

    @Override // defpackage.qt7
    public final CancellationException getCancellationException() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.qt7
    public final zde getChildren() {
        return qd5.a;
    }

    @Override // defpackage.qt7
    public final sy4 invokeOnCompletion(em6 em6Var) {
        return iia.a;
    }

    @Override // defpackage.qt7
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.qt7
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.qt7
    public final boolean isCompleted() {
        return false;
    }

    @Override // defpackage.qt7
    public final Object join(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.qt7
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.qt7
    public final sy4 invokeOnCompletion(boolean z, boolean z2, em6 em6Var) {
        return iia.a;
    }
}
