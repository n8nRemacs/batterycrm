package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ym9 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object o;

    public ym9(an9 an9Var, long j, long j2, String str) {
        this.o = an9Var;
        this.c = j;
        this.d = j2;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                an9 an9Var = (an9) this.o;
                bi biVar = an9Var.c;
                lrd lrdVar = an9Var.a;
                vk6 vk6VarA = biVar.a();
                vk6VarA.k(1, this.c);
                vk6VarA.k(2, this.d);
                String str = this.b;
                if (str == null) {
                    vk6VarA.S(3);
                } else {
                    vk6VarA.f(3, str);
                }
                try {
                    lrdVar.c();
                    try {
                        vk6VarA.w();
                        lrdVar.q();
                        biVar.r(vk6VarA);
                        return null;
                    } finally {
                        lrdVar.k();
                    }
                } catch (Throwable th) {
                    biVar.r(vk6VarA);
                    throw th;
                }
            default:
                qlh qlhVar = (qlh) this.o;
                crd crdVar = qlhVar.d;
                lrd lrdVar2 = qlhVar.a;
                vk6 vk6VarA2 = crdVar.a();
                String str2 = this.b;
                if (str2 == null) {
                    vk6VarA2.S(1);
                } else {
                    vk6VarA2.f(1, str2);
                }
                vk6VarA2.k(2, this.c);
                vk6VarA2.k(3, this.d);
                try {
                    lrdVar2.c();
                    try {
                        Integer numValueOf = Integer.valueOf(vk6VarA2.w());
                        lrdVar2.q();
                        return numValueOf;
                    } finally {
                        lrdVar2.k();
                    }
                } finally {
                    crdVar.r(vk6VarA2);
                }
        }
    }

    public ym9(qlh qlhVar, String str, long j, long j2) {
        this.o = qlhVar;
        this.b = str;
        this.c = j;
        this.d = j2;
    }
}
