package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public abstract class j40 {
    public static AudioManager a;
    public static final Continuation[] b = new Continuation[0];

    public static synchronized AudioManager a(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                a = null;
            }
            AudioManager audioManager = a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                yn3 yn3Var = new yn3();
                if0.a().execute(new ud(applicationContext, 7, yn3Var));
                yn3Var.b();
                AudioManager audioManager2 = a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static ty9 b(ip5 ip5Var, boolean z) {
        os5 os5Var = z ? null : lc7.b;
        umb umbVar = new umb(10);
        ty9 ty9VarE = null;
        int i = 0;
        while (true) {
            try {
                ip5Var.i(0, umbVar.a, 10);
                umbVar.J(0);
                if (umbVar.A() != 4801587) {
                    break;
                }
                umbVar.K(3);
                int iW = umbVar.w();
                int i2 = iW + 10;
                if (ty9VarE == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(umbVar.a, 0, bArr, 0, 10);
                    ip5Var.i(10, bArr, iW);
                    ty9VarE = new lc7(os5Var).e(i2, bArr);
                } else {
                    ip5Var.q(iW);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        ip5Var.y();
        ip5Var.q(i);
        if (ty9VarE == null || ty9VarE.a.length == 0) {
            return null;
        }
        return ty9VarE;
    }

    public static s7c c(umb umbVar) {
        umbVar.K(1);
        int iA = umbVar.A();
        long j = umbVar.b + iA;
        int i = iA / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jR = umbVar.r();
            if (jR == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jR;
            jArrCopyOf2[i2] = umbVar.r();
            umbVar.K(2);
            i2++;
        }
        umbVar.K((int) (j - umbVar.b));
        return new s7c(jArrCopyOf, jArrCopyOf2);
    }

    public static final void d(esg esgVar) {
        esgVar.d(490, new sdf(14));
        esgVar.d(475, new b4e(17));
        esgVar.d(491, new b4e(18));
    }
}
