package com.otaliastudios.transcoder.internal.transcode;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TranscodeEngine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/transcoder/internal/transcode/l;", "", "<init>", "()V", "a", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final a f366211a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final com.otaliastudios.transcoder.internal.utils.j f366212b = new com.otaliastudios.transcoder.internal.utils.j();

    /* compiled from: TranscodeEngine.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/otaliastudios/transcoder/internal/transcode/l$a;", "", "<init>", "()V", "Lcom/otaliastudios/transcoder/internal/utils/j;", "log", "Lcom/otaliastudios/transcoder/internal/utils/j;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static boolean a(Throwable th2) {
            Throwable cause;
            if (th2 instanceof InterruptedException) {
                return true;
            }
            if (th2.equals(th2.getCause()) || (cause = th2.getCause()) == null) {
                return false;
            }
            return a(cause);
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    @X41.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.otaliastudios.transcoder.i r12) {
        /*
            com.otaliastudios.transcoder.internal.transcode.l$a r0 = com.otaliastudios.transcoder.internal.transcode.l.f366211a
            r0.getClass()
            com.otaliastudios.transcoder.internal.utils.j r0 = com.otaliastudios.transcoder.internal.transcode.l.f366212b
            r0.getClass()
            com.otaliastudios.transcoder.internal.transcode.j r0 = new com.otaliastudios.transcoder.internal.transcode.j
            r0.<init>(r12)
            android.os.Handler r1 = r0.f366208a
            r2 = 0
            com.otaliastudios.transcoder.internal.e r4 = new com.otaliastudios.transcoder.internal.e     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r4.<init>(r12)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.otaliastudios.transcoder.sink.b r5 = r12.f365982a     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.otaliastudios.transcoder.strategy.f r3 = r12.f365986e     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.otaliastudios.transcoder.strategy.a r6 = r12.f365985d     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.otaliastudios.transcoder.internal.utils.m r6 = com.otaliastudios.transcoder.internal.utils.n.c(r3, r6)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.otaliastudios.transcoder.validator.a r7 = r12.f365987f     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.otaliastudios.transcoder.time.a r10 = r12.f365988g     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            y11.c r8 = r12.f365989h     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            v11.b r9 = r12.f365990i     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            com.otaliastudios.transcoder.internal.transcode.a r12 = new com.otaliastudios.transcoder.internal.transcode.a     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L60
            boolean r2 = r12.d()     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            if (r2 != 0) goto L41
            com.otaliastudios.transcoder.internal.transcode.g r2 = new com.otaliastudios.transcoder.internal.transcode.g     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r3 = 1
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r1.post(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            goto L52
        L3f:
            r2 = r12
            goto L7c
        L41:
            com.otaliastudios.transcoder.internal.transcode.k r2 = new com.otaliastudios.transcoder.internal.transcode.k     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r12.c(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            com.otaliastudios.transcoder.internal.transcode.g r2 = new com.otaliastudios.transcoder.internal.transcode.g     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r3 = 0
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
            r1.post(r2)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L58
        L52:
            r12.b()
            goto L72
        L56:
            r0 = move-exception
            goto L3f
        L58:
            r2 = move-exception
            goto L62
        L5a:
            r11 = r2
            r2 = r12
            r12 = r11
            goto L62
        L5e:
            r0 = move-exception
            goto L7c
        L60:
            r12 = move-exception
            goto L5a
        L62:
            boolean r3 = com.otaliastudios.transcoder.internal.transcode.l.a.a(r2)     // Catch: java.lang.Throwable -> L56
            if (r3 == 0) goto L73
            com.otaliastudios.transcoder.internal.transcode.f r2 = new com.otaliastudios.transcoder.internal.transcode.f     // Catch: java.lang.Throwable -> L56
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L56
            r1.post(r2)     // Catch: java.lang.Throwable -> L56
            if (r12 != 0) goto L52
        L72:
            return
        L73:
            com.otaliastudios.transcoder.internal.transcode.h r3 = new com.otaliastudios.transcoder.internal.transcode.h     // Catch: java.lang.Throwable -> L56
            r3.<init>(r0, r2)     // Catch: java.lang.Throwable -> L56
            r1.post(r3)     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L7c:
            if (r2 != 0) goto L7f
            goto L82
        L7f:
            r2.b()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.transcoder.internal.transcode.l.a(com.otaliastudios.transcoder.i):void");
    }
}
