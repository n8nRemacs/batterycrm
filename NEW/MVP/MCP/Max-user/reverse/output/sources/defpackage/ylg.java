package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ylg extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ emg Y;
    public final /* synthetic */ CharSequence Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylg(emg emgVar, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = emgVar;
        this.Z = charSequence;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ylg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ylg ylgVar = new ylg(this.Y, this.Z, continuation);
        ylgVar.X = obj;
        return ylgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylg.n(java.lang.Object):java.lang.Object");
    }
}
