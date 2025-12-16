package com.airbnb.lottie.network;

import androidx.annotation.RestrictTo;
import j.N;
import j.P;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
@RestrictTo
/* loaded from: classes10.dex */
public class a implements c {

    /* renamed from: b, reason: collision with root package name */
    @N
    public final HttpURLConnection f59906b;

    public a(@N HttpURLConnection httpURLConnection) {
        this.f59906b = httpURLConnection;
    }

    @Override // com.airbnb.lottie.network.c
    @P
    public final String a2() {
        return this.f59906b.getContentType();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f59906b.disconnect();
    }

    @Override // com.airbnb.lottie.network.c
    @N
    public final InputStream f2() {
        return this.f59906b.getInputStream();
    }

    @Override // com.airbnb.lottie.network.c
    public final boolean isSuccessful() {
        try {
            return this.f59906b.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.airbnb.lottie.network.c
    @P
    public final String v4() throws IOException {
        HttpURLConnection httpURLConnection = this.f59906b;
        try {
            if (isSuccessful()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to fetch ");
            sb2.append(httpURLConnection.getURL());
            sb2.append(". Failed with ");
            sb2.append(httpURLConnection.getResponseCode());
            sb2.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb3.append(line);
                        sb3.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            }
            sb2.append(sb3.toString());
            return sb2.toString();
        } catch (IOException e12) {
            com.airbnb.lottie.utils.e.c("get error failed ", e12);
            return e12.getMessage();
        }
    }
}
