package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public class psb implements mcf {
    public final String[] a;
    public final k18 b = rsb.a.a();
    public final Object c;
    public final f9a d;
    public final f9a o;

    public psb(String[] strArr) {
        this.a = strArr;
        k18 k18VarB = ipi.b(3, new ffb(5, this));
        this.c = k18VarB;
        this.d = (f9a) k18VarB.getValue();
        this.o = (f9a) k18VarB.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, k18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(defpackage.psb r4, defpackage.z26 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.osb
            if (r0 == 0) goto L13
            r0 = r6
            osb r0 = (defpackage.osb) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            osb r0 = new osb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.d
            int r1 = r0.X
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            defpackage.g8j.b(r6)
            goto L43
        L2d:
            defpackage.g8j.b(r6)
            java.lang.Object r4 = r4.c
            java.lang.Object r4 = r4.getValue()
            f9a r4 = (defpackage.f9a) r4
            r0.X = r2
            java.lang.Object r4 = r4.d(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r4 != r5) goto L43
            return
        L43:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psb.k(psb, z26, kotlin.coroutines.Continuation):void");
    }

    @Override // defpackage.fve
    public final List b() {
        return this.d.b();
    }

    @Override // defpackage.x26
    public final Object d(z26 z26Var, Continuation continuation) {
        k(this, z26Var, continuation);
        return g84.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void f() {
        ((f9a) this.c.getValue()).setValue(j());
    }

    @Override // defpackage.mcf
    public final Object getValue() {
        return (nsb) this.o.getValue();
    }

    public nsb j() {
        return ((qsb) this.b.getValue()).c(this.a) ? nsb.a : nsb.b;
    }

    public final boolean l() {
        return ((nsb) this.o.getValue()) == nsb.a;
    }
}
