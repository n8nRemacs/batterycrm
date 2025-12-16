package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.BoringLayout;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.nio.channels.AsynchronousSocketChannel;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.net.ssl.SSLContext;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class q8g implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ q8g(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, KeyManagementException {
        boolean zD = false;
        switch (this.a) {
            case 0:
                return r8g.a("#ff242f3e").toByteArray();
            case 1:
                return r8g.a("#fff5f5f5").toByteArray();
            case 2:
                return AsynchronousSocketChannel.open();
            case 3:
                int i = xz7.a;
                return Boolean.valueOf(xz7.b(xz7.c));
            case 4:
                yy7[] yy7VarArr = csg.j;
                return qqg.a;
            case 5:
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, null, null);
                return sSLContext;
            case 6:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                return paint;
            case 7:
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setFilterBitmap(true);
                return paint2;
            case 8:
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setFilterBitmap(true);
                return paint3;
            case 9:
                Paint paint4 = new Paint();
                paint4.setAntiAlias(true);
                paint4.setFilterBitmap(true);
                return paint4;
            case 10:
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    zD = l8g.d((String) cls.getMethod("get", String.class).invoke(cls, "ro.miui.ui.version.code"));
                } catch (Throwable unused) {
                }
                return Boolean.valueOf(zD);
            case 11:
                Paint paint5 = new Paint();
                paint5.setAntiAlias(true);
                paint5.setDither(true);
                return paint5;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                l1h.C0.getFontMetricsInt(metrics);
                return metrics;
            case 13:
                Paint paint6 = new Paint(1);
                paint6.setStyle(Paint.Style.FILL);
                return paint6;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "captureFrame";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "setStencil";
            case 16:
                yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                return new x9h();
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr3 = VideoMessageWidget.H0;
                int iD = kti.d(8 * vw4.d().getDisplayMetrics().density);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setSize(iD, iD);
                return new InsetDrawable((Drawable) gradientDrawable, iD);
            case 18:
                return new c2f(false);
            case 19:
                int i2 = VpnPanelWidget.c;
                return new ljh(gm1.a.a());
            case 20:
                return new c2f(false);
            case 21:
                return new c2f(true);
            case 22:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            case 23:
                return Cipher.getInstance("AES/CBC/PKCS7Padding");
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return qg9.a("one.me.webapp.domain.jsbridge.delegates.haptic.WebAppHapticFeedbackStatus", nrh.values(), new String[]{"impactOccured", "notificationOccured", "selectionChanged"}, new Annotation[][]{null, null, null});
            case 25:
                return new b44(hgb.a, new n5g(mvd.n0), Integer.valueOf(ivd.G), Integer.valueOf(w9b.L), 4);
            case 26:
                return new b44(hgb.c, new n5g(igb.g), Integer.valueOf(ivd.v0), Integer.valueOf(w9b.L), 4);
            case 27:
                return new b44(hgb.b, new n5g(mvd.d), Integer.valueOf(yud.P), Integer.valueOf(w9b.L), 4);
            case 28:
                yy7[] yy7VarArr4 = WebAppRootScreen.R0;
                return f1e.MINIAPP;
            default:
                return new osh();
        }
    }
}
