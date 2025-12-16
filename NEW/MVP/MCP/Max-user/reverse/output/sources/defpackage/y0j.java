package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class y0j implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sve b;

    public /* synthetic */ y0j(sve sveVar, int i) {
        this.a = i;
        this.b = sveVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.a();
    }
}
