package com.google.firebase.crashlytics.internal.metadata;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.C37586h;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import okhttp3.internal.http2.Http2;

/* compiled from: QueueFileLogStore.java */
/* loaded from: classes4.dex */
class h implements com.google.firebase.crashlytics.internal.metadata.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f361057c = Charset.forName(Constants.ENCODING);

    /* renamed from: a, reason: collision with root package name */
    public final File f361058a;

    /* renamed from: b, reason: collision with root package name */
    public f f361059b;

    /* compiled from: QueueFileLogStore.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f361060a;

        /* renamed from: b, reason: collision with root package name */
        public final int f361061b;

        public a(byte[] bArr, int i12) {
            this.f361060a = bArr;
            this.f361061b = i12;
        }
    }

    public h(File file) {
        this.f361058a = file;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.a
    public final void a() throws IOException {
        c();
        this.f361058a.delete();
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.a
    public final void b(long j12, String str) {
        f();
        if (this.f361059b == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > 16384) {
                str = "..." + str.substring(str.length() - Http2.INITIAL_MAX_FRAME_SIZE);
            }
            this.f361059b.a(String.format(Locale.US, "%d %s%n", Long.valueOf(j12), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f361057c));
            while (!this.f361059b.isEmpty() && this.f361059b.j() > 65536) {
                this.f361059b.g();
            }
        } catch (IOException unused) {
            com.google.firebase.crashlytics.internal.d.f361031a.b();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.a
    public final void c() throws IOException {
        C37586h.a(this.f361059b);
        this.f361059b = null;
    }

    @Override // com.google.firebase.crashlytics.internal.metadata.a
    public final String d() {
        byte[] bArrE = e();
        if (bArrE != null) {
            return new String(bArrE, f361057c);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    @Override // com.google.firebase.crashlytics.internal.metadata.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] e() {
        /*
            r6 = this;
            java.io.File r0 = r6.f361058a
            boolean r0 = r0.exists()
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lc
        La:
            r4 = r1
            goto L35
        Lc:
            r6.f()
            com.google.firebase.crashlytics.internal.metadata.f r0 = r6.f361059b
            if (r0 != 0) goto L14
            goto La
        L14:
            int[] r3 = new int[]{r2}
            int r0 = r0.j()
            byte[] r0 = new byte[r0]
            com.google.firebase.crashlytics.internal.metadata.f r4 = r6.f361059b     // Catch: java.io.IOException -> L29
            com.google.firebase.crashlytics.internal.metadata.g r5 = new com.google.firebase.crashlytics.internal.metadata.g     // Catch: java.io.IOException -> L29
            r5.<init>(r0, r3)     // Catch: java.io.IOException -> L29
            r4.c(r5)     // Catch: java.io.IOException -> L29
            goto L2e
        L29:
            com.google.firebase.crashlytics.internal.d r4 = com.google.firebase.crashlytics.internal.d.f361031a
            r4.b()
        L2e:
            com.google.firebase.crashlytics.internal.metadata.h$a r4 = new com.google.firebase.crashlytics.internal.metadata.h$a
            r3 = r3[r2]
            r4.<init>(r0, r3)
        L35:
            if (r4 != 0) goto L38
            return r1
        L38:
            int r0 = r4.f361061b
            byte[] r1 = new byte[r0]
            byte[] r3 = r4.f361060a
            java.lang.System.arraycopy(r3, r2, r1, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.metadata.h.e():byte[]");
    }

    public final void f() {
        File file = this.f361058a;
        if (this.f361059b == null) {
            try {
                this.f361059b = new f(file);
            } catch (IOException unused) {
                com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
                file.toString();
                dVar.b();
            }
        }
    }
}
