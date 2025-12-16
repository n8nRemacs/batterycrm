package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class vna implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vna(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                wna wnaVar = (wna) this.d;
                hq9 hq9Var = wnaVar.d;
                lrd lrdVar = wnaVar.a;
                vk6 vk6VarA = hq9Var.a();
                vk6VarA.k(1, this.b);
                vk6VarA.k(2, this.c);
                try {
                    lrdVar.c();
                    try {
                        Integer numValueOf = Integer.valueOf(vk6VarA.w());
                        lrdVar.q();
                        return numValueOf;
                    } finally {
                        lrdVar.k();
                    }
                } finally {
                    hq9Var.r(vk6VarA);
                }
            default:
                qlh qlhVar = (qlh) this.d;
                crd crdVar = qlhVar.e;
                lrd lrdVar2 = qlhVar.a;
                vk6 vk6VarA2 = crdVar.a();
                long j = 1;
                vk6VarA2.k(1, j);
                vk6VarA2.k(2, j);
                vk6VarA2.k(3, this.b);
                vk6VarA2.k(4, this.c);
                try {
                    lrdVar2.c();
                    try {
                        Integer numValueOf2 = Integer.valueOf(vk6VarA2.w());
                        lrdVar2.q();
                        return numValueOf2;
                    } finally {
                        lrdVar2.k();
                    }
                } finally {
                    crdVar.r(vk6VarA2);
                }
        }
    }
}
