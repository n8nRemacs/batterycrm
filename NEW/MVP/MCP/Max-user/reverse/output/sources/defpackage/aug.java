package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class aug {
    public final gwg a;
    public final g1g b;
    public final d1g c;
    public final pb3 d;
    public final hwa e;
    public final j0e f;
    public final tgg g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final skh i = new skh();

    public aug(gwg gwgVar, d1g d1gVar, g1g g1gVar, tgg tggVar, pb3 pb3Var, hwa hwaVar, j0e j0eVar) {
        this.a = gwgVar;
        this.c = d1gVar;
        this.b = g1gVar;
        this.g = tggVar;
        this.d = pb3Var;
        this.e = hwaVar;
        this.f = j0eVar;
    }

    public final synchronized vqa a(bug bugVar) {
        for (Map.Entry entry : this.h.entrySet()) {
            if (((bug) entry.getKey()).equals(bugVar)) {
                return (vqa) entry.getValue();
            }
        }
        return null;
    }

    public final void b(ttg ttgVar) {
        wqi.c("aug", "putUploadInRepository: started, upload=%s", ttgVar);
        azi.b(this.a.a(ttgVar).i(), pdf.e, new ytg(ttgVar, 0), new gk0(12, ttgVar));
    }

    public final synchronized void c(bug bugVar) {
        wqi.c("aug", "removeFromUploadObsCache: data=" + bugVar, new Object[0]);
        this.h.remove(bugVar);
    }

    public final void d(bug bugVar) {
        wqi.c("aug", "removeUploadFromRepository: started, data=%s", bugVar);
        azi.b(this.a.c(bugVar).i(), pdf.e, new ztg(bugVar, 0), new wtg(bugVar, 1));
    }

    public final synchronized vqa e(bug bugVar) {
        vqa vqaVarA = a(bugVar);
        if (vqaVarA != null) {
            wqi.c("aug", "upload: has upload for " + bugVar, new Object[0]);
            return vqaVarA;
        }
        wqi.c("aug", "upload: %s", bugVar);
        int i = 0;
        vr8 vr8Var = new vr8(new hs8(new wr8(new wk3(2, new ztg(bugVar, 1)), new vtg(this, i), 1), i, new wk3(5, new tv0(15, bugVar))), new vtg(this, 7), 3);
        this.b.getClass();
        ora oraVar = new ora(vr8Var, new vef(19), 7);
        c5g c5gVar = new c5g(this, 5, bugVar);
        r8j r8jVar = pdf.e;
        jn6 jn6Var = pdf.d;
        bra braVar = new bra(new bra(new sra(oraVar, r8jVar, c5gVar, jn6Var), r8jVar, new v64(this, 12, bugVar), 1), new vtg(this, 8), jn6Var, 1);
        ifi.c(1, "bufferSize");
        r8j r8jVar2 = new r8j(25);
        AtomicReference atomicReference = new AtomicReference();
        lra lraVarP = new xsa(new gta(new dta(atomicReference, r8jVar2), braVar, atomicReference, r8jVar2)).p(this.f);
        synchronized (this) {
            this.h.put(bugVar, lraVarP);
        }
        return lraVarP;
    }
}
