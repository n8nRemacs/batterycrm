package e11;

import android.content.Context;
import com.adjust.sdk.Constants;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;

/* renamed from: e11.z1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39926z1 extends F1<Void> {
    @Override // e11.F1
    public final Object a(@j.N String str, @j.P String str2, @j.P HashMap map, @j.N Context context) {
        HttpURLConnection httpURLConnection;
        if (str2 == null) {
            this.f394350a = false;
        } else {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "text/html; charset=utf-8");
                    httpURLConnection.setRequestProperty("connection", "close");
                    httpURLConnection.connect();
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(Constants.ENCODING)));
                    bufferedWriter.write(str2);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                    httpURLConnection.getInputStream().close();
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        this.f394350a = false;
                        th.getMessage();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return null;
                    } catch (Throwable th3) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
            }
            httpURLConnection.disconnect();
        }
        return null;
    }
}
