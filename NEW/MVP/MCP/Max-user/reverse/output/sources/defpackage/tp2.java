package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tp2 extends dtf implements sm6 {
    public Collection X;
    public Iterator Y;
    public Object Z;
    public yq2 o;
    public int s0;
    public final /* synthetic */ ae3 t0;
    public final /* synthetic */ yq2 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp2(ae3 ae3Var, yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.t0 = ae3Var;
        this.u0 = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tp2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tp2(this.t0, this.u0, continuation);
    }

    /* JADX WARN: Path cross not found for [B:19:0x0081, B:21:0x0085], limit reached: 24 */
    /* JADX WARN: Path cross not found for [B:21:0x0085, B:19:0x0081], limit reached: 24 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0078 -> B:16:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007e -> B:18:0x007f). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.s0
            r1 = 1
            if (r0 == 0) goto L1b
            if (r0 != r1) goto L13
            java.lang.Object r0 = r8.Z
            java.util.Iterator r2 = r8.Y
            java.util.Collection r3 = r8.X
            yq2 r4 = r8.o
            defpackage.g8j.b(r9)
            goto L7b
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            defpackage.g8j.b(r9)
            ae3 r9 = r8.t0
            java.util.ArrayList r9 = r9.b
            java.util.List r9 = defpackage.ue3.d0(r9)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            yq2 r2 = r8.u0
            r3 = r0
            r4 = r2
            r2 = r9
        L34:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L89
            java.lang.Object r0 = r2.next()
            r9 = r0
            jd3 r9 = (defpackage.jd3) r9
            java.lang.String r9 = r9.i()
            if (r9 == 0) goto L7e
            k18 r5 = r4.F0
            java.lang.Object r5 = r5.getValue()
            gwg r5 = (defpackage.gwg) r5
            or8 r9 = r5.f(r9)
            r8.o = r4
            r8.X = r3
            r8.Y = r2
            r8.Z = r0
            r8.s0 = r1
            l42 r5 = new l42
            kotlin.coroutines.Continuation r6 = defpackage.hni.f(r8)
            r5.<init>(r1, r6)
            r5.o()
            zkb r6 = new zkb
            r7 = 4
            r6.<init>(r7, r5)
            r9.e(r6)
            java.lang.Object r9 = r5.n()
            g84 r5 = defpackage.g84.a
            if (r9 != r5) goto L7b
            return r5
        L7b:
            vvg r9 = (defpackage.vvg) r9
            goto L7f
        L7e:
            r9 = 0
        L7f:
            if (r9 == 0) goto L85
            vvg r5 = defpackage.vvg.UPLOADED
            if (r9 != r5) goto L34
        L85:
            r3.add(r0)
            goto L34
        L89:
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp2.n(java.lang.Object):java.lang.Object");
    }
}
