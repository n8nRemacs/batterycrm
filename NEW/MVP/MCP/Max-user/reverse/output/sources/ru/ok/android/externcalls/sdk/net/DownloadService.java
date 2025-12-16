package ru.ok.android.externcalls.sdk.net;

import android.util.Patterns;
import defpackage.e2f;
import defpackage.i2f;
import defpackage.l2f;
import defpackage.lbj;
import defpackage.ol;
import defpackage.tk4;
import defpackage.u0e;
import defpackage.wk3;
import defpackage.wy1;
import defpackage.y6d;
import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.FileAlreadyExistsException;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.android.externcalls.sdk.net.internal.DownloadResult;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\fJ1\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/net/DownloadService;", "", "", KwsFeaturesConfigProviderImpl.URL_KEY, "Ljava/io/File;", "dest", "Lru/ok/android/externcalls/sdk/net/FileValidationConfig;", "fileValidationConfig", "Le2f;", "Lru/ok/android/externcalls/sdk/net/internal/DownloadResult;", "download", "(Ljava/lang/String;Ljava/io/File;Lru/ok/android/externcalls/sdk/net/FileValidationConfig;)Le2f;", "Impl", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DownloadService {

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ok/android/externcalls/sdk/net/DownloadService$Impl;", "Lru/ok/android/externcalls/sdk/net/DownloadService;", "Ly6d;", "logger", "<init>", "(Ly6d;)V", "", KwsFeaturesConfigProviderImpl.URL_KEY, "Ljava/io/File;", "destination", "Ljava/security/MessageDigest;", "md", "Lqqg;", "downloadInner", "(Ljava/lang/String;Ljava/io/File;Ljava/security/MessageDigest;)V", "dest", "Lru/ok/android/externcalls/sdk/net/FileValidationConfig;", "fileValidationConfig", "Le2f;", "Lru/ok/android/externcalls/sdk/net/internal/DownloadResult;", "download", "(Ljava/lang/String;Ljava/io/File;Lru/ok/android/externcalls/sdk/net/FileValidationConfig;)Le2f;", "Ly6d;", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Impl implements DownloadService {
        private static final Companion Companion = new Companion(null);

        @Deprecated
        public static final String LOG_TAG = "DownloadService.Impl";
        private final y6d logger;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/ok/android/externcalls/sdk/net/DownloadService$Impl$Companion;", "", "()V", "LOG_TAG", "", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(tk4 tk4Var) {
                this();
            }

            private Companion() {
            }
        }

        public Impl(y6d y6dVar) {
            this.logger = y6dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void download$lambda$3(String str, File file, FileValidationConfig fileValidationConfig, Impl impl, l2f l2fVar) throws Throwable {
            String str2;
            File file2;
            Impl impl2;
            Exception exc;
            long jCurrentTimeMillis;
            try {
            } catch (Exception e) {
                e = e;
                str2 = str;
                file2 = file;
                impl2 = impl;
            }
            try {
            } catch (Exception e2) {
                e = e2;
                exc = e;
                y6d y6dVar = impl2.logger;
                StringBuilder sbL = wy1.l("Exception during file downloading. url ", str2, ", destination ", file2.getAbsolutePath(), ". ");
                sbL.append(exc);
                y6dVar.log(LOG_TAG, sbL.toString());
                lbj.a(file2, new DownloadService$Impl$download$1$1(impl2));
                ((i2f) l2fVar).onError(exc);
            }
            if (!Patterns.WEB_URL.matcher(str).matches()) {
                throw new IllegalArgumentException("Url is invalid ".concat(str));
            }
            if (!file.exists()) {
                lbj.b(file);
                if (fileValidationConfig == null) {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    str2 = str;
                    file2 = file;
                    impl2 = impl;
                    downloadInner$default(impl2, str2, file2, null, 4, null);
                    jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                } else {
                    str2 = str;
                    file2 = file;
                    impl2 = impl;
                    MessageDigest messageDigest = MessageDigest.getInstance(fileValidationConfig.getHashAlgorithm().a);
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    impl2.downloadInner(str2, file2, messageDigest);
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        StringBuilder sb = new StringBuilder();
                        for (byte b : bArrDigest) {
                            sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                        }
                        if (!sb.toString().equals(fileValidationConfig.getExpectedChecksum())) {
                            throw new RuntimeException("Downloaded model is corrupted");
                        }
                        jCurrentTimeMillis = jCurrentTimeMillis4;
                    } catch (Exception e3) {
                        exc = e3;
                    }
                }
                ((i2f) l2fVar).a(new DownloadResult(file2, jCurrentTimeMillis));
                return;
            }
            try {
                ((i2f) l2fVar).onError(new FileAlreadyExistsException(file, null, null));
                return;
            } catch (Exception e4) {
                exc = e4;
                str2 = str;
                file2 = file;
                impl2 = impl;
            }
            y6d y6dVar2 = impl2.logger;
            StringBuilder sbL2 = wy1.l("Exception during file downloading. url ", str2, ", destination ", file2.getAbsolutePath(), ". ");
            sbL2.append(exc);
            y6dVar2.log(LOG_TAG, sbL2.toString());
            lbj.a(file2, new DownloadService$Impl$download$1$1(impl2));
            ((i2f) l2fVar).onError(exc);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
        /* JADX WARN: Type inference failed for: r10v7, types: [java.io.OutputStream[]] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void downloadInner(java.lang.String r9, java.io.File r10, java.security.MessageDigest r11) throws java.lang.Throwable {
            /*
                r8 = this;
                r0 = 1
                r1 = 0
                if (r11 == 0) goto La
                owg r2 = new owg
                r2.<init>(r0, r11)
                goto Lb
            La:
                r2 = r1
            Lb:
                r11 = 2
                r3 = 3
                r4 = 0
                java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L53
                r5.<init>(r9)     // Catch: java.lang.Throwable -> L53
                java.net.URLConnection r9 = r5.openConnection()     // Catch: java.lang.Throwable -> L53
                java.io.InputStream r5 = r9.getInputStream()     // Catch: java.lang.Throwable -> L4f
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4c
                r6.<init>(r10)     // Catch: java.lang.Throwable -> L4c
                java.io.OutputStream[] r10 = new java.io.OutputStream[r11]     // Catch: java.lang.Throwable -> L4a
                r10[r4] = r6     // Catch: java.lang.Throwable -> L4a
                r10[r0] = r2     // Catch: java.lang.Throwable -> L4a
                defpackage.hz5.h(r5, r10)     // Catch: java.lang.Throwable -> L4a
                java.io.Closeable[] r10 = new java.io.Closeable[r3]
                r10[r4] = r5
                r10[r0] = r6
                r10[r11] = r2
            L31:
                if (r4 >= r3) goto L3d
                r11 = r10[r4]
                if (r11 == 0) goto L3a
                r11.close()     // Catch: java.io.IOException -> L3a
            L3a:
                int r4 = r4 + 1
                goto L31
            L3d:
                boolean r10 = r9 instanceof java.net.HttpURLConnection
                if (r10 == 0) goto L44
                r1 = r9
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            L44:
                if (r1 == 0) goto L49
                r1.disconnect()
            L49:
                return
            L4a:
                r10 = move-exception
                goto L57
            L4c:
                r10 = move-exception
                r6 = r1
                goto L57
            L4f:
                r10 = move-exception
                r5 = r1
            L51:
                r6 = r5
                goto L57
            L53:
                r10 = move-exception
                r9 = r1
                r5 = r9
                goto L51
            L57:
                java.io.Closeable[] r7 = new java.io.Closeable[r3]
                r7[r4] = r5
                r7[r0] = r6
                r7[r11] = r2
            L5f:
                if (r4 >= r3) goto L6b
                r11 = r7[r4]
                if (r11 == 0) goto L68
                r11.close()     // Catch: java.io.IOException -> L68
            L68:
                int r4 = r4 + 1
                goto L5f
            L6b:
                boolean r11 = r9 instanceof java.net.HttpURLConnection
                if (r11 == 0) goto L72
                r1 = r9
                java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1
            L72:
                if (r1 == 0) goto L77
                r1.disconnect()
            L77:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.sdk.net.DownloadService.Impl.downloadInner(java.lang.String, java.io.File, java.security.MessageDigest):void");
        }

        public static /* synthetic */ void downloadInner$default(Impl impl, String str, File file, MessageDigest messageDigest, int i, Object obj) throws Throwable {
            if ((i & 4) != 0) {
                messageDigest = null;
            }
            impl.downloadInner(str, file, messageDigest);
        }

        @Override // ru.ok.android.externcalls.sdk.net.DownloadService
        public e2f download(String url, File dest, FileValidationConfig fileValidationConfig) {
            return new wk3(2, new ol(url, dest, fileValidationConfig, this)).m(u0e.b());
        }
    }

    static /* synthetic */ e2f download$default(DownloadService downloadService, String str, File file, FileValidationConfig fileValidationConfig, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: download");
        }
        if ((i & 4) != 0) {
            fileValidationConfig = null;
        }
        return downloadService.download(str, file, fileValidationConfig);
    }

    e2f download(String url, File dest, FileValidationConfig fileValidationConfig);
}
