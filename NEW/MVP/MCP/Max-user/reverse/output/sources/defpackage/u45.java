package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.widget.ImageView;
import androidx.fragment.app.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import org.apache.http.util.VersionInfo;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u45 {
    public static final yd4 a(int i) {
        String str;
        switch (i) {
            case 1:
                str = "ALREADY_DOWNLOADING";
                break;
            case 2:
                str = "FILE_IS_NULL";
                break;
            case 3:
                str = "INTERRUPTED";
                break;
            case 4:
                str = "FAIL";
                break;
            case 5:
                str = "CANCELLED";
                break;
            case 6:
                str = "MAX_FAIL_COUNT";
                break;
            default:
                throw null;
        }
        imb[] imbVarArr = {new imb("state", str)};
        r5j r5jVar = new r5j(14);
        imb imbVar = imbVarArr[0];
        r5jVar.C(imbVar.b, (String) imbVar.a);
        return r5jVar.g();
    }

    public static /* synthetic */ int b(int i) {
        if (i == 1) {
            return HttpStatus.SC_BAD_REQUEST;
        }
        if (i == 2) {
            return 500;
        }
        if (i == 3) {
            return 600;
        }
        if (i == 4) {
            return 700;
        }
        throw null;
    }

    public static int c(float f, float f2, int i) {
        return kti.d(f * f2) + i;
    }

    public static int d(float f, float f2, int i, int i2) {
        return i2 - (kti.d(f * f2) * i);
    }

    public static int e(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int f(int i, String str) {
        return String.valueOf(str).length() + i;
    }

    public static int g(CharSequence charSequence, int i, int i2) {
        return (charSequence.hashCode() + i) * i2;
    }

    public static z8a h(wid widVar, Class cls, String str, String str2) {
        widVar.getClass();
        return new z8a(cls, str, str2);
    }

    public static String i(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
        return sb.toString();
    }

    public static String j(String str, a aVar, String str2) {
        return str + aVar + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder m(int i, long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(j);
        return sb;
    }

    public static void n(float f, float f2, ImageView imageView) {
        int iD = kti.d(f * f2);
        imageView.setPadding(iD, iD, iD, iD);
    }

    public static void o(int i, String str, String str2) {
        Log.d(str2, str + i);
    }

    public static /* synthetic */ void p(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            } else if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else {
                if (!(obj instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) obj).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
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

    public static int q(float f, float f2, int i) {
        return i - kti.d(f * f2);
    }

    public static /* synthetic */ void r(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return VersionInfo.UNAVAILABLE;
            case 2:
                return "BUSY";
            case 3:
                return "PRIVACY";
            case 4:
                return "FAILED";
            case 5:
                return "CONNECTION_ERROR";
            case 6:
                return "REMOVE_FROM_CALL";
            case 7:
                return "REMOVE_FROM_WAITING_ROOM";
            case 8:
                return "TARGET_USER_NOT_IN_CHAT";
            case 9:
                return "CALL_WAIT_ADMIN";
            case 10:
                return "USER_RESTRICTED_CALL";
            case 11:
                return "REJECT_CALL";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "FAILED_JOIN";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "CONFIGURED";
            case 2:
                return "STARTED";
            case 3:
                return "PAUSED";
            case 4:
                return "STOPPING";
            case 5:
                return "PENDING_START";
            case 6:
                return "PENDING_START_PAUSED";
            case 7:
                return "PENDING_RELEASE";
            case 8:
                return "ERROR";
            case 9:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Confirmed" : "Completed" : "HasAppKeys" : "HasHandshakeKeys" : "Initial";
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? "null" : "VIDEO" : "AUDIO";
    }
}
