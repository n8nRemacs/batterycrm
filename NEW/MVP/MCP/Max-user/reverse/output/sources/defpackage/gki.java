package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.protocol.HTTP;

/* loaded from: classes.dex */
public final class gki implements Runnable {
    public static final lk6 c = new lk6("RevokeAccessOperation", new String[0]);
    public final String a;
    public final gef b;

    public gki(String str) {
        s5j.c(str);
        this.a = str;
        this.b = new gef(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        lk6 lk6Var = c;
        Status status = Status.Y;
        try {
            String strValueOf = String.valueOf(this.a);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, URLEncodedUtils.CONTENT_TYPE);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.o;
            } else {
                Log.e((String) lk6Var.c, ((String) lk6Var.d).concat("Unable to revoke access!"));
            }
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            String string = sb.toString();
            if (lk6Var.b <= 3) {
                Log.d((String) lk6Var.c, ((String) lk6Var.d).concat(string));
            }
        } catch (IOException e) {
            String strValueOf2 = String.valueOf(e.toString());
            Log.e((String) lk6Var.c, ((String) lk6Var.d).concat(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: ")));
        } catch (Exception e2) {
            String strValueOf3 = String.valueOf(e2.toString());
            Log.e((String) lk6Var.c, ((String) lk6Var.d).concat(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: ")));
        }
        this.b.f(status);
    }
}
