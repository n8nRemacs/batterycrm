package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class hgf implements Callable {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_LIST;
            default:
                return Thread.currentThread();
        }
    }
}
