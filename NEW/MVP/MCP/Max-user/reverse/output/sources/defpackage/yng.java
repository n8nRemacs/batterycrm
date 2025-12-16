package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yng extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ eog Z;
    public eog o;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yng(eog eogVar, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = eogVar;
        this.s0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yng) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yng yngVar = new yng(this.Z, this.s0, continuation);
        yngVar.Y = obj;
        return yngVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
    
        if (defpackage.s8j.c(1000, r17) == r8) goto L36;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yng.n(java.lang.Object):java.lang.Object");
    }
}
