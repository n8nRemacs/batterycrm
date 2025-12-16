package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class dwg implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ wvg b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ewg d;

    public dwg(ewg ewgVar, String str, wvg wvgVar, long j) {
        this.d = ewgVar;
        this.a = str;
        this.b = wvgVar;
        this.c = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ewg ewgVar = this.d;
        crd crdVar = ewgVar.c;
        lrd lrdVar = ewgVar.a;
        vk6 vk6VarA = crdVar.a();
        String str = this.a;
        if (str == null) {
            vk6VarA.S(1);
        } else {
            vk6VarA.f(1, str);
        }
        vk6VarA.k(2, this.b.a);
        vk6VarA.k(3, this.c);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
                crdVar.r(vk6VarA);
                return null;
            } finally {
                lrdVar.k();
            }
        } catch (Throwable th) {
            crdVar.r(vk6VarA);
            throw th;
        }
    }
}
