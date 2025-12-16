package androidx.media3.session;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.media3.common.util.C23110a;
import com.google.common.io.C37512n;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class T1 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52315c;

    public /* synthetic */ T1(Object obj, int i12) {
        this.f52314b = i12;
        this.f52315c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        Object obj = this.f52315c;
        switch (this.f52314b) {
            case 0:
                com.google.common.base.e0<com.google.common.util.concurrent.H0> e0Var = U1.f52321b;
                byte[] bArr = (byte[]) obj;
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                C23110a.a("Could not decode image data", bitmapDecodeByteArray != null);
                return bitmapDecodeByteArray;
            default:
                com.google.common.base.e0<com.google.common.util.concurrent.H0> e0Var2 = U1.f52321b;
                Uri uri = (Uri) obj;
                if ("file".equals(uri.getScheme())) {
                    String path = uri.getPath();
                    if (path == null) {
                        throw new IllegalArgumentException("Could not read image from file");
                    }
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path);
                    if (bitmapDecodeFile != null) {
                        return bitmapDecodeFile;
                    }
                    throw new IllegalArgumentException("Could not read image from file");
                }
                URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new UnsupportedOperationException("Unsupported scheme: " + uri.getScheme());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new IOException(AK.c.g(responseCode, "Invalid response status code: "));
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArrC = C37512n.c(inputStream);
                    Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length);
                    if (bitmapDecodeByteArray2 == null) {
                        z = false;
                    }
                    C23110a.a("Could not decode image data", z);
                    inputStream.close();
                    return bitmapDecodeByteArray2;
                } catch (Throwable th2) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
        }
    }
}
