package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kpa extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ ws5 Y;
    public final /* synthetic */ qpa Z;
    public List o;
    public final /* synthetic */ lt5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpa(ws5 ws5Var, qpa qpaVar, lt5 lt5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ws5Var;
        this.Z = qpaVar;
        this.s0 = lt5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kpa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kpa(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (r2 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
    
        if (defpackage.qpa.c(r0, r1, r2, true, r29) != r11) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpa.n(java.lang.Object):java.lang.Object");
    }
}
