package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes2.dex */
public final class c05 extends dtf implements sm6 {
    public DownloadAttachesWorker X;
    public int Y;
    public /* synthetic */ Object Z;
    public si9 o;
    public final /* synthetic */ DownloadAttachesWorker s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c05(DownloadAttachesWorker downloadAttachesWorker, Continuation continuation) {
        super(2, continuation);
        this.s0 = downloadAttachesWorker;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((c05) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        c05 c05Var = new c05(this.s0, continuation);
        c05Var.Z = obj;
        return c05Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x021e, code lost:
    
        if (r1 != r3) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c05.n(java.lang.Object):java.lang.Object");
    }
}
