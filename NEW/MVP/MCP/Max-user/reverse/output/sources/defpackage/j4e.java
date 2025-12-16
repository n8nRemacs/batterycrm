package defpackage;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.KeyStore;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class j4e implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k18 b;

    public /* synthetic */ j4e(k18 k18Var, int i) {
        this.a = i;
        this.b = k18Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() throws SSLException {
        switch (this.a) {
            case 0:
                return ((c9f) this.b.getValue()).a(null);
            case 1:
                ((c9f) this.b.getValue()).getClass();
                try {
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    return (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
                } catch (SSLException e) {
                    throw e;
                } catch (Throwable th) {
                    throw new SSLException("Failed to create trust manager", th);
                }
            case 2:
                ((c9f) this.b.getValue()).getClass();
                return null;
            default:
                k18 k18Var = this.b;
                String str = ((lv4) k18Var.getValue()).j().b;
                String str2 = ((lv4) k18Var.getValue()).j().d;
                String str3 = ((lv4) k18Var.getValue()).j().h;
                String str4 = ((lv4) k18Var.getValue()).j().i;
                StringBuilder sbL = wy1.l("OKMessages/", str, " (", str2, "; ");
                sbL.append(str3);
                sbL.append("; ");
                sbL.append(str4);
                sbL.append(")");
                String string = sbL.toString();
                try {
                    return URLEncoder.encode(string, Charset.defaultCharset().name());
                } catch (UnsupportedEncodingException unused) {
                    return string;
                }
        }
    }
}
