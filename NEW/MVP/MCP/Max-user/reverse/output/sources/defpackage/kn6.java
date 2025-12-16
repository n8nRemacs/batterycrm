package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class kn6 implements Callable, drf, tm6 {
    public final Object a;

    public kn6(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        return this.a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }

    @Override // defpackage.drf
    public final Object get() {
        return this.a;
    }
}
