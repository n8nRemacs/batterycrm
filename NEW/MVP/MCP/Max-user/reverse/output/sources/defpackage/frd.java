package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class frd implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm6 b;

    public /* synthetic */ frd(int i, cm6 cm6Var) {
        this.a = i;
        this.b = cm6Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.invoke();
    }
}
