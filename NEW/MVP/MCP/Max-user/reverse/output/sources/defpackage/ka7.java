package defpackage;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class ka7 extends vui {
    public final int c;
    public final ExecutorService d;
    public final RealtimeSinceBootClock e;

    public ka7() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.get();
        this.d = Executors.newFixedThreadPool(3);
        this.e = realtimeSinceBootClock;
        this.c = 30000;
    }

    @Override // defpackage.vui
    public final tu5 a(hj0 hj0Var, oac oacVar) {
        return new ja7(hj0Var, oacVar);
    }

    @Override // defpackage.vui
    public final void d(tu5 tu5Var, i5i i5iVar) {
        ja7 ja7Var = (ja7) tu5Var;
        ja7Var.d = this.e.now();
        Future<?> futureSubmit = this.d.submit(new nt3(this, ja7Var, false, i5iVar, 3));
        oac oacVar = ja7Var.b;
        ((mk0) oacVar).a(new ia7(futureSubmit, 0, i5iVar));
    }

    @Override // defpackage.vui
    public final HashMap e(tu5 tu5Var, int i) {
        ja7 ja7Var = (ja7) tu5Var;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(ja7Var.e - ja7Var.d));
        map.put("fetch_time", Long.toString(ja7Var.f - ja7Var.e));
        map.put("total_time", Long.toString(ja7Var.f - ja7Var.d));
        map.put("image_size", Integer.toString(i));
        return map;
    }

    @Override // defpackage.vui
    public final void h(tu5 tu5Var) {
        ((ja7) tu5Var).f = this.e.now();
    }

    public final HttpURLConnection m(Uri uri, int i) throws IOException {
        URL url;
        String str;
        Uri uri2 = mwg.a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.c);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case HttpStatus.SC_MULTIPLE_CHOICES /* 300 */:
                case HttpStatus.SC_MOVED_PERMANENTLY /* 301 */:
                case HttpStatus.SC_MOVED_TEMPORARILY /* 302 */:
                case HttpStatus.SC_SEE_OTHER /* 303 */:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri uri3 = headerField != null ? Uri.parse(headerField) : null;
        String scheme = uri.getScheme();
        if (i > 0 && uri3 != null && !yyi.b(uri3.getScheme(), scheme)) {
            return m(uri3, i - 1);
        }
        if (i == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        throw new IOException(str);
    }
}
