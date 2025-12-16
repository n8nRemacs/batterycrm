package defpackage;

import android.text.SpannableStringBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public abstract class gbj {
    public static final void a(SpannableStringBuilder spannableStringBuilder, char c, Object... objArr) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(c);
        int length2 = spannableStringBuilder.length();
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, length2, 33);
        }
    }

    public static final void b(SpannableStringBuilder spannableStringBuilder, String str, Object... objArr) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, length2, 33);
        }
    }

    public static void c(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void d(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void e(File file, File file2) throws Throwable {
        Throwable th;
        FileChannel channel;
        FileChannel channel2;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel fileChannel = null;
        try {
            channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
            } catch (Throwable th2) {
                th = th2;
                channel = null;
            }
        } catch (Throwable th3) {
            th = th3;
            channel = null;
        }
        try {
            channel.transferFrom(channel2, 0L, channel2.size());
            channel2.close();
            channel.close();
        } catch (Throwable th4) {
            th = th4;
            fileChannel = channel2;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (channel == null) {
                throw th;
            }
            channel.close();
            throw th;
        }
    }

    public static long f(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[20480];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += i;
        }
    }

    public static void g(File file, InputStream inputStream) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            f(inputStream, fileOutputStream);
            fileOutputStream.flush();
        } finally {
            d(inputStream);
            c(fileOutputStream);
        }
    }

    public static String h(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[20480];
        while (true) {
            int i = inputStreamReader.read(cArr);
            if (-1 == i) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, i);
        }
    }
}
