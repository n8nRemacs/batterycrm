package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.D;
import com.facebook.imagepipeline.producers.V;

/* compiled from: HttpUrlConnectionNetworkFetcher.java */
/* loaded from: classes15.dex */
class B implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D.a f340519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V.a f340520c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f340521d;

    public B(D d12, D.a aVar, V.a aVar2) {
        this.f340521d = d12;
        this.f340519b = aVar;
        this.f340520c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            r7 = this;
            com.facebook.imagepipeline.producers.D$a r0 = r7.f340519b
            com.facebook.imagepipeline.producers.V$a r1 = r7.f340520c
            com.facebook.imagepipeline.producers.D r2 = r7.f340521d
            r2.getClass()
            r3 = 0
            com.facebook.imagepipeline.producers.k0 r4 = r0.f340513b     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            com.facebook.imagepipeline.request.ImageRequest r4 = r4.j()     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            android.net.Uri r4 = r4.f340782b     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            r5 = 5
            java.net.HttpURLConnection r4 = r2.f(r4, r5)     // Catch: java.lang.Throwable -> L3c java.io.IOException -> L3f
            com.facebook.common.time.RealtimeSinceBootClock r2 = r2.f340531c     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            long r5 = r2.now()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0.f340533g = r5     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            if (r4 == 0) goto L31
            java.io.InputStream r3 = r4.getInputStream()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r0 = r1
            com.facebook.imagepipeline.producers.U$a r0 = (com.facebook.imagepipeline.producers.U.a) r0     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            r2 = -1
            r0.a(r2, r3)     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f
            goto L31
        L2d:
            r0 = move-exception
            goto L4f
        L2f:
            r0 = move-exception
            goto L41
        L31:
            if (r3 == 0) goto L36
            r3.close()     // Catch: java.io.IOException -> L36
        L36:
            if (r4 == 0) goto L4e
        L38:
            r4.disconnect()
            goto L4e
        L3c:
            r0 = move-exception
            r4 = r3
            goto L4f
        L3f:
            r0 = move-exception
            r4 = r3
        L41:
            com.facebook.imagepipeline.producers.U$a r1 = (com.facebook.imagepipeline.producers.U.a) r1     // Catch: java.lang.Throwable -> L2d
            r1.onFailure(r0)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L4b
            r3.close()     // Catch: java.io.IOException -> L4b
        L4b:
            if (r4 == 0) goto L4e
            goto L38
        L4e:
            return
        L4f:
            if (r3 == 0) goto L54
            r3.close()     // Catch: java.io.IOException -> L54
        L54:
            if (r4 == 0) goto L59
            r4.disconnect()
        L59:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.B.run():void");
    }
}
