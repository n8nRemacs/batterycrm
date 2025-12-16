package defpackage;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public abstract class zpi {
    public static final x38 a(l48 l48Var) {
        AtomicReference atomicReference = l48Var.a;
        while (true) {
            x38 x38Var = (x38) atomicReference.get();
            if (x38Var != null) {
                return x38Var;
            }
            arf arfVarA = zk6.a();
            ep4 ep4Var = gy4.a;
            x38 x38Var2 = new x38(l48Var, arfVarA.plus(MainDispatcherLoader.dispatcher.getImmediate()));
            while (!atomicReference.compareAndSet(null, x38Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            ep4 ep4Var2 = gy4.a;
            svi.e(x38Var2, MainDispatcherLoader.dispatcher.getImmediate(), null, new w38(x38Var2, null), 2);
            return x38Var2;
        }
    }

    public static int b(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Throwable th) {
            wqi.e("zpi", "getVideoBitrate: failed", th);
            return 0;
        }
    }

    public static long c(Context context, Uri uri) {
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever2.setDataSource(context, uri);
                long jD = d(mediaMetadataRetriever2);
                i(mediaMetadataRetriever2);
                return jD;
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever = mediaMetadataRetriever2;
                try {
                    wqi.e("zpi", "getVideoDuration from uri: failed", th);
                    i(mediaMetadataRetriever);
                    return 0L;
                } catch (Throwable th2) {
                    i(mediaMetadataRetriever);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static long d(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Throwable th) {
            wqi.e("zpi", "getVideoDuration: failed ", th);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.j16 e(android.content.Context r11, android.net.Uri r12) {
        /*
            java.lang.String r0 = "zpi"
            java.lang.String r1 = "getVideoParams: failed"
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1
            android.media.MediaMetadataRetriever r7 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            r7.<init>()     // Catch: java.lang.Throwable -> L4b java.lang.RuntimeException -> L4d
            r7.setDataSource(r11, r12)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L47
            r11 = -1
            android.graphics.Bitmap r11 = r7.getFrameAtTime(r11)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L47
            long r3 = d(r7)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L44
            android.graphics.Point r12 = f(r7)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L44
            int r8 = b(r7)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            r9 = 16
            java.lang.String r1 = r7.extractMetadata(r9)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2d
        L2b:
            r1 = r6
            goto L36
        L2d:
            r1 = r5
            goto L36
        L2f:
            r9 = move-exception
            java.lang.String r10 = "getVideoBitrate: failed"
            defpackage.wqi.e(r0, r10, r9)     // Catch: java.lang.RuntimeException -> L3a java.lang.Throwable -> L3f
            goto L2b
        L36:
            i(r7)
            goto L65
        L3a:
            r9 = move-exception
            goto L52
        L3c:
            r2 = r7
            goto Laa
        L3f:
            r11 = move-exception
            goto L3c
        L41:
            r9 = move-exception
        L42:
            r8 = r5
            goto L52
        L44:
            r9 = move-exception
            r12 = r2
            goto L42
        L47:
            r9 = move-exception
            r11 = r2
            r12 = r11
            goto L42
        L4b:
            r11 = move-exception
            goto Laa
        L4d:
            r9 = move-exception
            r11 = r2
            r12 = r11
            r7 = r12
            goto L42
        L52:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            r10.append(r9)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r10.toString()     // Catch: java.lang.Throwable -> L3f
            defpackage.wqi.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L3f
            i(r7)
            r1 = r6
        L65:
            if (r11 == 0) goto L92
            int r2 = r11.getWidth()     // Catch: java.lang.Throwable -> L8c
            int r7 = r11.getHeight()     // Catch: java.lang.Throwable -> L8c
            int r9 = java.lang.Math.max(r2, r7)     // Catch: java.lang.Throwable -> L8c
            r10 = 512(0x200, float:7.17E-43)
            if (r9 <= r10) goto L92
            r10 = 1140850688(0x44000000, float:512.0)
            float r9 = (float) r9     // Catch: java.lang.Throwable -> L8c
            float r10 = r10 / r9
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L8c
            float r2 = r2 * r10
            int r2 = java.lang.Math.round(r2)     // Catch: java.lang.Throwable -> L8c
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L8c
            float r10 = r10 * r7
            int r7 = java.lang.Math.round(r10)     // Catch: java.lang.Throwable -> L8c
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createScaledBitmap(r11, r2, r7, r6)     // Catch: java.lang.Throwable -> L8c
            goto L92
        L8c:
            r2 = move-exception
            java.lang.String r6 = "getVideoParams: failed to resize to thumbnail"
            defpackage.wqi.e(r0, r6, r2)
        L92:
            if (r12 == 0) goto L95
            goto L9a
        L95:
            android.graphics.Point r12 = new android.graphics.Point
            r12.<init>(r5, r5)
        L9a:
            j16 r0 = new j16
            r0.<init>()
            r0.d = r11
            r0.b = r3
            r0.e = r12
            r0.c = r8
            r0.a = r1
            return r0
        Laa:
            i(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zpi.e(android.content.Context, android.net.Uri):j16");
    }

    public static Point f(MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
            int i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i == 90 || i == 270) {
                strExtractMetadata2 = strExtractMetadata;
                strExtractMetadata = strExtractMetadata2;
            }
            return new Point(Integer.parseInt(strExtractMetadata), Integer.parseInt(strExtractMetadata2));
        } catch (Throwable th) {
            wqi.e("zpi", "getVideoSize: failed", th);
            return new Point(0, 0);
        }
    }

    public static final boolean g(Context context, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        Path symbolicLink = Files.readSymbolicLink(Paths.get(ho7.f(parcelFileDescriptor.getFd(), "/proc/self/fd/"), new String[0]));
        if (symbolicLink.startsWith(Paths.get(context.getApplicationInfo().dataDir, new String[0]))) {
            return true;
        }
        String string = symbolicLink.toString();
        return dnf.r(string, "/proc/", false) || dnf.r(string, "/data/misc/", false) || dnf.r(string, "/data/data/", false) || dnf.r(string, "/dev/", false) || dnf.r(string, "/sys/", false);
    }

    public static final boolean h(Context context, Uri uri) throws IOException {
        boolean zG;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        String scheme = uri.getScheme();
        if (scheme == null) {
            return false;
        }
        int iHashCode = scheme.hashCode();
        if (iHashCode != 3143036) {
            if (iHashCode != 951530617 || !scheme.equals("content")) {
                return false;
            }
        } else if (!scheme.equals("file")) {
            return false;
        }
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(String.valueOf(uri.getAuthority()), 0);
        if (providerInfoResolveContentProvider == null) {
            return false;
        }
        if (!context.getPackageName().equals(providerInfoResolveContentProvider.packageName) && !providerInfoResolveContentProvider.exported && context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0) {
            return false;
        }
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
        } catch (IOException e) {
            wqi.p("AndroidFileUtilsNew", "Check for internal uri failed. Uri: " + uri, e);
        } catch (SecurityException e2) {
            wqi.p("AndroidFileUtilsNew", "Lack for read file permission. Uri: " + uri, e2);
        } catch (UnsupportedOperationException e3) {
            wqi.p("AndroidFileUtilsNew", "Probably readSymbolicLink not supported. Uri: " + uri, e3);
        }
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            try {
                zG = g(context, parcelFileDescriptorOpenFileDescriptor);
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r4j.a(parcelFileDescriptorOpenFileDescriptor, th);
                    throw th2;
                }
            }
        } else {
            zG = false;
        }
        return !zG;
    }

    public static void i(MediaMetadataRetriever mediaMetadataRetriever) {
        if (mediaMetadataRetriever == null) {
            return;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable unused) {
        }
    }
}
