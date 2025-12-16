package defpackage;

import android.util.DisplayMetrics;
import android.util.Log;
import androidx.media3.transformer.ExportException;
import com.my.tracker.applifecycle.o.a;
import com.my.tracker.applifecycle.o.b;
import com.my.tracker.core.o.a0;
import com.my.tracker.core.o.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Queue;
import one.me.chatmedia.viewer.VideoWebViewScreen;
import org.json.JSONObject;
import org.webrtc.Size;
import org.webrtc.VideoFileRenderer;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class m1h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m1h(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.a) {
            case 0:
                ((s1h) this.b).q();
                break;
            case 1:
                z2h z2hVar = (z2h) this.b;
                ghb ghbVar = z2hVar.y0;
                if (ghbVar != null) {
                    z2hVar.l(ghbVar);
                    z2hVar.j();
                    break;
                }
                break;
            case 2:
                ((tu1) ((tz4) this.b).l).b(null);
                break;
            case 3:
                ((VideoFileRenderer) this.b).lambda$release$3();
                break;
            case 4:
                ((c8h) this.b).c();
                break;
            case 5:
                VideoWebViewScreen videoWebViewScreen = (VideoWebViewScreen) this.b;
                yy7[] yy7VarArr = VideoWebViewScreen.H0;
                videoWebViewScreen.K0(false);
                break;
            case 6:
                fo4 fo4Var = (fo4) ((xtd) this.b).b;
                if (((Boolean) ((cm6) fo4Var.c).invoke()).booleanValue()) {
                    if (!fo4Var.a) {
                        ((y6d) fo4Var.b).log("OwnTalkingReporter", "on voice start detected and reported");
                        oz0 oz0Var = (oz0) fo4Var.X;
                        if (oz0Var != null) {
                            oz0Var.a(true);
                        }
                        fo4Var.a = true;
                    }
                    ((lqc) fo4Var.d).f(qqg.a);
                    break;
                }
                break;
            case 7:
                hhg hhgVar = (hhg) ((ehg) this.b).b;
                long j = hhgVar.e;
                LinkedHashMap linkedHashMap = ah4.a;
                synchronized (ah4.class) {
                }
                Locale locale = Locale.US;
                ExportException exportException = new ExportException("Muxer error", new IllegalStateException(a9h.d(j, "Abort: no output sample written in the last ", " milliseconds. DebugTrace: \"Tracing disabled\"")), 7002, 0);
                lhg lhgVar = hhgVar.s;
                lhgVar.getClass();
                lhgVar.d(exportException);
                break;
            case 8:
                l4i l4iVar = (l4i) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + l4iVar.a.getAction() + " finishing.");
                l4iVar.b.d(null);
                break;
            case 9:
                y4i y4iVar = (y4i) this.b;
                ((gwd) y4iVar.d).Z(new ehg(22, y4iVar));
                break;
            case 10:
                ((a) this.b).c();
                break;
            case 11:
                ((a0) this.b).a();
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((b) this.b).a();
                break;
            case 13:
                ((com.my.tracker.core.b) this.b).a();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                b9i b9iVar = (b9i) this.b;
                uh4 uh4Var = b9iVar.g;
                if (uh4Var != null) {
                    uh4Var.a();
                    b9iVar.g = null;
                    b9iVar.D = 0;
                }
                gua guaVar = b9iVar.f;
                if (guaVar != null) {
                    try {
                        ((ByteArrayOutputStream) guaVar.e).close();
                    } catch (IOException unused) {
                    }
                }
                b9iVar.f = null;
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                j9i j9iVar = (j9i) this.b;
                pze pzeVar = j9iVar.f;
                try {
                    mze mzeVar = j9iVar.e;
                    pzeVar.getClass();
                    mzeVar.onResponse(new JSONObject().put(NegotiationErrorStat.KEY_ERROR, "command-discarded"));
                    break;
                } catch (Throwable th) {
                    pzeVar.b.logException("OKSignaling", "Error discarding postponed command", th);
                    return;
                }
            case 16:
                g.b((Queue) this.b);
                break;
            default:
                k5i k5iVar = (k5i) ((thg) this.b).b;
                ke8 ke8Var = (ke8) k5iVar.b;
                ie8 ie8Var = (ie8) k5iVar.o;
                y6d y6dVar = ie8Var.n;
                if (ke8Var != null) {
                    try {
                        ie8Var.e();
                        Size size = ie8Var.B;
                        DisplayMetrics displayMetrics = ie8Var.A;
                        if (displayMetrics.widthPixels != size.width || displayMetrics.heightPixels != size.height) {
                            y6dVar.log("OKRTCLmsAdapter", "Screen size did change" + size.width + "x" + size.height + "->" + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
                            int i = displayMetrics.widthPixels;
                            size.width = i;
                            int i2 = displayMetrics.heightPixels;
                            size.height = i2;
                            ((ke8) k5iVar.b).a(i, i2);
                        }
                    } catch (Throwable th2) {
                        y6dVar.reportException("OKRTCLmsAdapter", "Error on screen share size update", th2);
                    }
                    ie8Var.b((ke8) k5iVar.b);
                    break;
                }
                break;
        }
    }
}
