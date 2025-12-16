package defpackage;

import java.util.Collections;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class cu5 implements mcf {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu5 b;
    public final /* synthetic */ PmsKey c;

    public /* synthetic */ cu5(gu5 gu5Var, PmsKey pmsKey, int i) {
        this.a = i;
        this.b = gu5Var;
        this.c = pmsKey;
    }

    @Override // defpackage.fve
    public final List b() {
        switch (this.a) {
            case 0:
                return Collections.singletonList(f());
            default:
                return Collections.singletonList(j());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.x26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.z26 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L64;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof defpackage.du5
            if (r0 == 0) goto L18
            r0 = r7
            du5 r0 = (defpackage.du5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.o = r1
            goto L1d
        L18:
            du5 r0 = new du5
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.d
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L2e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            defpackage.g8j.b(r7)
            goto L5c
        L32:
            defpackage.g8j.b(r7)
            gu5 r7 = r5.b
            jve r7 = r7.e
            eu5 r1 = new eu5
            r3 = 0
            r4 = 2
            r1.<init>(r4, r3)
            m36 r3 = new m36
            r3.<init>(r1, r7)
            r0.o = r2
            w3 r7 = new w3
            r1 = 21
            r7.<init>(r6, r1, r5)
            java.lang.Object r6 = r3.d(r7, r0)
            g84 r7 = defpackage.g84.a
            if (r6 != r7) goto L57
            goto L59
        L57:
            qqg r6 = defpackage.qqg.a
        L59:
            if (r6 != r7) goto L5c
            return r7
        L5c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "StateFlow collection never ends"
            r6.<init>(r7)
            throw r6
        L64:
            boolean r0 = r7 instanceof defpackage.zt5
            if (r0 == 0) goto L77
            r0 = r7
            zt5 r0 = (defpackage.zt5) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L77
            int r1 = r1 - r2
            r0.o = r1
            goto L7c
        L77:
            zt5 r0 = new zt5
            r0.<init>(r5, r7)
        L7c:
            java.lang.Object r7 = r0.d
            int r1 = r0.o
            r2 = 1
            if (r1 == 0) goto L91
            if (r1 == r2) goto L8d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L8d:
            defpackage.g8j.b(r7)
            goto Lbb
        L91:
            defpackage.g8j.b(r7)
            gu5 r7 = r5.b
            jve r7 = r7.e
            au5 r1 = new au5
            r3 = 0
            r4 = 2
            r1.<init>(r4, r3)
            m36 r3 = new m36
            r3.<init>(r1, r7)
            r0.o = r2
            w3 r7 = new w3
            r1 = 20
            r7.<init>(r6, r1, r5)
            java.lang.Object r6 = r3.d(r7, r0)
            g84 r7 = defpackage.g84.a
            if (r6 != r7) goto Lb6
            goto Lb8
        Lb6:
            qqg r6 = defpackage.qqg.a
        Lb8:
            if (r6 != r7) goto Lbb
            return r7
        Lbb:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "StateFlow collection never ends"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu5.d(z26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public Object f() {
        gu5 gu5Var = this.b;
        PmsKey pmsKey = this.c;
        if (gu5Var.m(pmsKey)) {
            return kaj.b(gu5Var.g, pmsKey.name(), 0L, vid.a(Long.class));
        }
        l5c l5cVar = gu5Var.h;
        boolean zContains = l5cVar.h.g.contains(pmsKey.name());
        c4 c4Var = l5cVar;
        if (zContains) {
            c4Var = l5cVar.h;
        }
        return kaj.b(c4Var.g, pmsKey.name(), 0L, vid.a(Long.class));
    }

    @Override // defpackage.mcf
    public final Object getValue() {
        switch (this.a) {
            case 0:
                return f();
            default:
                return j();
        }
    }

    public Object j() {
        Boolean bool = Boolean.FALSE;
        gu5 gu5Var = this.b;
        PmsKey pmsKey = this.c;
        if (gu5Var.m(pmsKey)) {
            return kaj.b(gu5Var.g, pmsKey.name(), bool, vid.a(Boolean.class));
        }
        l5c l5cVar = gu5Var.h;
        boolean zContains = l5cVar.h.g.contains(pmsKey.name());
        c4 c4Var = l5cVar;
        if (zContains) {
            c4Var = l5cVar.h;
        }
        return kaj.b(c4Var.g, pmsKey.name(), bool, vid.a(Boolean.class));
    }
}
