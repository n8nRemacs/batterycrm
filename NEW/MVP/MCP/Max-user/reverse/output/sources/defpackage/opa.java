package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class opa extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ qpa Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opa(long j, qpa qpaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = qpaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((opa) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new opa(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:50)|(1:(1:(8:6|45|7|49|35|(2:38|(1:40))|41|42)(2:13|14))(1:15))(2:21|22)|52|26|47|27|(6:30|49|35|(0)|41|42)|29|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r11 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        r0 = r11;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.opa.n(java.lang.Object):java.lang.Object");
    }
}
