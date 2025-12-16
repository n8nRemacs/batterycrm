package defpackage;

import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class xc0 {
    public static /* synthetic */ char a(int i) {
        if (i == 1) {
            return 'u';
        }
        if (i == 2) {
            return 'g';
        }
        throw null;
    }

    public static /* synthetic */ String b(int i) {
        switch (i) {
            case 1:
                return "initial";
            case 2:
                return "started";
            case 3:
                return "ringing";
            case 4:
                return "wait_room";
            case 5:
                return "connecting";
            case 6:
                return "connected";
            case 7:
                return "disconnected";
            case 8:
                return "ended";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "PRESET_AVATAR";
        }
        if (i == 2) {
            return "USER_AVATAR";
        }
        throw null;
    }

    public static int d(int i, int i2, s5g s5gVar) {
        return (s5gVar.hashCode() + i) * i2;
    }

    public static String e(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String f(String str, boolean z) {
        return str + z;
    }

    public static String g(String str, boolean z, String str2, boolean z2, String str3) {
        return str + z + str2 + z2 + str3;
    }

    public static String h(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String i(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder j(long j, String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(z);
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(MediaMetadataRetriever mediaMetadataRetriever) throws Exception {
        boolean zIsTerminated;
        if (mediaMetadataRetriever instanceof AutoCloseable) {
            mediaMetadataRetriever.close();
            return;
        }
        if (!(mediaMetadataRetriever instanceof ExecutorService)) {
            mediaMetadataRetriever.release();
            return;
        }
        ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void l(String str, ci5 ci5Var) {
        xfh.r(ci5Var, new ei4(str));
    }

    public static /* synthetic */ String m(int i) {
        if (i == 1) {
            return "USER";
        }
        if (i == 2) {
            return "GROUP";
        }
        throw null;
    }

    public static /* synthetic */ String n(int i) {
        return i != 1 ? i != 2 ? "null" : "MediaGallery" : "Camera";
    }

    public static /* synthetic */ String o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static /* synthetic */ String p(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "VIDEO" : "AUDIO" : "UNKNOWN";
    }
}
