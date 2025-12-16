package defpackage;

import android.net.Uri;
import android.os.Build;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class t9j {
    public static byte[] a(se4 se4Var, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        Map map2;
        List list;
        zdf zdfVar = new zdf(se4Var);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        hsi.i(uri, "The uri must be set.");
        ze4 ze4Var = new ze4(uri, 0L, 2, bArr, map, 0L, -1L, null, 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                ve4 ve4Var = new ve4(zdfVar, ze4Var);
                try {
                    byte[] bArrB = wx0.b(ve4Var);
                    zxg.g(ve4Var);
                    return bArrB;
                } catch (HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        int i3 = e.d;
                        String str2 = null;
                        if ((i3 == 307 || i3 == 308) && i2 < 5 && (map2 = e.o) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str2 = (String) list.get(i);
                        }
                        if (str2 == null) {
                            throw e;
                        }
                        i2++;
                        xe4 xe4VarA = ze4Var.a();
                        xe4VarA.a = Uri.parse(str2);
                        ze4Var = xe4VarA.b();
                        zxg.g(ve4Var);
                    } catch (Throwable th) {
                        zxg.g(ve4Var);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                zdfVar.a.x();
                throw new MediaDrmCallbackException(e2);
            }
        }
    }

    public static boolean b(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean c(Throwable th) {
        return Build.VERSION.SDK_INT == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0298 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.kfe d(defpackage.tm9 r27) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t9j.d(tm9):kfe");
    }
}
