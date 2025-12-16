package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class o9h extends dtf implements sm6 {
    public final /* synthetic */ f84 X;
    public final /* synthetic */ x9h Y;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o9h(Object obj, Continuation continuation, f84 f84Var, x9h x9hVar) {
        super(2, continuation);
        this.o = obj;
        this.X = f84Var;
        this.Y = x9hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((o9h) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new o9h(this.o, continuation, this.X, this.Y);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            x9h r0 = r12.Y
            k18 r0 = r0.d
            defpackage.g8j.b(r13)
            java.lang.Object r13 = r12.o
            android.net.Uri r13 = (android.net.Uri) r13
            r1 = 0
            r2 = 0
            android.media.MediaMetadataRetriever r4 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            boolean r5 = r4 instanceof java.lang.AutoCloseable     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L43
            java.lang.AutoCloseable r4 = (java.lang.AutoCloseable) r4     // Catch: java.lang.Throwable -> L41
            r5 = r4
            android.media.MediaMetadataRetriever r5 = (android.media.MediaMetadataRetriever) r5     // Catch: java.lang.Throwable -> L38
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L38
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L38
            r5.setDataSource(r0, r13)     // Catch: java.lang.Throwable -> L38
            android.graphics.Point r6 = defpackage.zpi.f(r5)     // Catch: java.lang.Throwable -> L38
            long r2 = defpackage.zpi.d(r5)     // Catch: java.lang.Throwable -> L35
            defpackage.bui.a(r4, r1)     // Catch: java.lang.Throwable -> L32
        L30:
            r7 = r2
            goto L8a
        L32:
            r0 = move-exception
            r1 = r6
            goto L6a
        L35:
            r0 = move-exception
        L36:
            r1 = r0
            goto L3b
        L38:
            r0 = move-exception
            r6 = r1
            goto L36
        L3b:
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r0 = move-exception
            defpackage.bui.a(r4, r1)     // Catch: java.lang.Throwable -> L32
            throw r0     // Catch: java.lang.Throwable -> L32
        L41:
            r0 = move-exception
            goto L6a
        L43:
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L59
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L59
            r4.setDataSource(r0, r13)     // Catch: java.lang.Throwable -> L59
            android.graphics.Point r1 = defpackage.zpi.f(r4)     // Catch: java.lang.Throwable -> L59
            long r2 = defpackage.zpi.d(r4)     // Catch: java.lang.Throwable -> L59
            r4.release()     // Catch: java.lang.Throwable -> L41
        L57:
            r6 = r1
            goto L30
        L59:
            r0 = move-exception
            r5 = r1
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            r6 = r0
            r4.release()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r0 = move-exception
            defpackage.saj.a(r1, r0)     // Catch: java.lang.Throwable -> L68
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            r1 = r5
        L6a:
            f84 r4 = r12.X
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r13.getPath()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Can't get video params for path "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.wqi.e(r4, r5, r0)
            goto L57
        L8a:
            bn3 r0 = new bn3
            java.lang.String r9 = r13.toString()
            r13 = 0
            if (r6 == 0) goto L97
            int r1 = r6.x
            r10 = r1
            goto L98
        L97:
            r10 = r13
        L98:
            if (r6 == 0) goto L9c
            int r13 = r6.y
        L9c:
            r11 = r13
            r6 = r0
            r6.<init>(r7, r9, r10, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9h.n(java.lang.Object):java.lang.Object");
    }
}
