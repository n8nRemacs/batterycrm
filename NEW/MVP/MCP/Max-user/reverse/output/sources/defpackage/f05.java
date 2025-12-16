package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadAttachesWorker;

/* loaded from: classes2.dex */
public final class f05 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ DownloadAttachesWorker Y;
    public final /* synthetic */ w10 Z;
    public boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f05(DownloadAttachesWorker downloadAttachesWorker, w10 w10Var, Continuation continuation) {
        super(2, continuation);
        this.Y = downloadAttachesWorker;
        this.Z = w10Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((f05) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new f05(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r6) {
        /*
            r5 = this;
            g84 r0 = defpackage.g84.a
            int r1 = r5.X
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            boolean r0 = r5.o
            defpackage.g8j.b(r6)
            goto L5d
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            defpackage.g8j.b(r6)
            goto L49
        L21:
            defpackage.g8j.b(r6)
            goto L3c
        L25:
            defpackage.g8j.b(r6)
            ru.ok.tamtam.upload.workers.DownloadAttachesWorker r6 = r5.Y
            int r6 = r6.C0
            ru.ok.tamtam.upload.workers.DownloadAttachesWorker r1 = r5.Y
            int r6 = r6 + r4
            r1.C0 = r6
            ru.ok.tamtam.upload.workers.DownloadAttachesWorker r6 = r5.Y
            r5.X = r4
            java.lang.Object r6 = r6.updateForeground(r5)
            if (r6 != r0) goto L3c
            goto L5b
        L3c:
            ru.ok.tamtam.upload.workers.DownloadAttachesWorker r6 = r5.Y
            w10 r1 = r5.Z
            r5.X = r3
            java.lang.Object r6 = ru.ok.tamtam.upload.workers.DownloadAttachesWorker.b(r6, r1, r5)
            if (r6 != r0) goto L49
            goto L5b
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            ru.ok.tamtam.upload.workers.DownloadAttachesWorker r1 = r5.Y
            r5.o = r6
            r5.X = r2
            java.lang.Object r1 = r1.updateForeground(r5)
            if (r1 != r0) goto L5c
        L5b:
            return r0
        L5c:
            r0 = r6
        L5d:
            if (r0 == 0) goto L64
            ka8 r6 = defpackage.la8.b()
            return r6
        L64:
            ia8 r6 = defpackage.la8.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f05.n(java.lang.Object):java.lang.Object");
    }
}
