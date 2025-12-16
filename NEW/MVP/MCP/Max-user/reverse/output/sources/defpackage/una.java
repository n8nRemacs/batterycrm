package defpackage;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class una implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ wna c;

    public /* synthetic */ una(wna wnaVar, List list, int i) {
        this.a = i;
        this.c = wnaVar;
        this.b = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        lrd lrdVar;
        switch (this.a) {
            case 0:
                wna wnaVar = this.c;
                lrdVar = wnaVar.a;
                lrdVar.c();
                try {
                    wnaVar.c.B(this.b);
                    lrdVar.q();
                    lrdVar.k();
                    return qqg.a;
                } finally {
                }
            default:
                wna wnaVar2 = this.c;
                lrdVar = wnaVar2.a;
                lrdVar.c();
                try {
                    wnaVar2.b.A(this.b);
                    lrdVar.q();
                    lrdVar.k();
                    return qqg.a;
                } finally {
                }
        }
    }
}
