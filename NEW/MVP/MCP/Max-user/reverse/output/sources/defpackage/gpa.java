package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gpa extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hpa Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpa(hpa hpaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hpaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gpa) l((dpa) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gpa gpaVar = new gpa(this.Y, continuation);
        gpaVar.X = obj;
        return gpaVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[Catch: all -> 0x006a, TryCatch #3 {all -> 0x006a, blocks: (B:27:0x0055, B:30:0x005c, B:32:0x0064, B:41:0x0095), top: B:51:0x0005 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [g84, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gpa.n(java.lang.Object):java.lang.Object");
    }
}
