package com.yandex.metrica.impl.ob;

import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class Ah {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    final Socket f377775a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    final Gh f377776b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    final C38758di f377777c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    final Uri f377778d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    final Hh f377779e;

    public Ah(@j.N Socket socket, @j.N Uri uri, @j.N Gh gh2, @j.N C38758di c38758di, @j.N Hh hh2) {
        this.f377775a = socket;
        this.f377778d = uri;
        this.f377776b = gh2;
        this.f377777c = c38758di;
        this.f377779e = hh2;
    }

    public abstract void a();

    public void a(@j.N String str, @j.N Map<String, String> map, @j.N byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        this.f377779e.b();
        OutputStream outputStream = null;
        OutputStream outputStream2 = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(this.f377775a.getOutputStream());
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            e = e12;
        }
        try {
            bufferedOutputStream.write(str.getBytes());
            a(bufferedOutputStream);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                a(bufferedOutputStream, key, entry.getValue());
                outputStream2 = key;
            }
            a(bufferedOutputStream);
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            this.f377779e.c();
            ((Jh) this.f377776b).b(this.f377775a.getLocalPort(), this.f377779e);
            outputStream = outputStream2;
        } catch (IOException e13) {
            e = e13;
            bufferedOutputStream2 = bufferedOutputStream;
            ((Jh) this.f377776b).a("io_exception_during_sync", e);
            bufferedOutputStream = bufferedOutputStream2;
            outputStream = bufferedOutputStream2;
            A2.a((Closeable) bufferedOutputStream);
        } catch (Throwable th3) {
            th = th3;
            outputStream = bufferedOutputStream;
            A2.a((Closeable) outputStream);
            throw th;
        }
        A2.a((Closeable) bufferedOutputStream);
    }

    private void a(@j.N OutputStream outputStream, @j.N String str, @j.N String str2) throws IOException {
        outputStream.write((str + ": " + str2).getBytes());
        a(outputStream);
    }

    private void a(@j.N OutputStream outputStream) throws IOException {
        outputStream.write("\r\n".getBytes());
    }
}
