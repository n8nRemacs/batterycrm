package x01;

import com.adjust.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.zip.Deflater;

/* loaded from: classes7.dex */
public final class c0 {
    public static String a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 == -1) {
                    String string = byteArrayOutputStream.toString(Constants.ENCODING);
                    b(byteArrayOutputStream);
                    return string;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
        } catch (Throwable th2) {
            b(byteArrayOutputStream);
            throw th2;
        }
    }

    public static void b(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                m0.e("hmsSdk", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    public static void c(File file, String str) throws Throwable {
        String str2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused) {
        } catch (IOException unused2) {
        }
        try {
            fileOutputStream.write(str.getBytes(Constants.ENCODING));
            fileOutputStream.flush();
        } catch (FileNotFoundException unused3) {
            fileOutputStream2 = fileOutputStream;
            str2 = "saveInfoToFile(): No files need to be read";
            m0.e("hmsSdk", str2);
            fileOutputStream = fileOutputStream2;
            b(fileOutputStream);
        } catch (IOException unused4) {
            fileOutputStream2 = fileOutputStream;
            str2 = "saveInfoToFile(): io exc from write info to file!";
            m0.e("hmsSdk", str2);
            fileOutputStream = fileOutputStream2;
            b(fileOutputStream);
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            b(fileOutputStream2);
            throw th;
        }
        b(fileOutputStream);
    }

    public static void d(HttpURLConnection httpURLConnection) throws IOException {
        try {
            httpURLConnection.getInputStream().close();
        } catch (Exception unused) {
            m0.e("hmsSdk", "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission");
        }
        httpURLConnection.disconnect();
        m0.f442048a.a(3);
    }

    public static byte[] e(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
            m0.e("hmsSdk", "closeStream(): Exception: close OutputStream error!");
        }
        return byteArray;
    }
}
