package com.google.android.gms.ads.identifier;

import com.google.android.gms.internal.ads_identifier.zzi;
import j.l0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
/* loaded from: classes6.dex */
public final class zzc {
    @l0
    public static final void zza(String str) {
        try {
            try {
                zzi.zzb(263);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode < 200 || responseCode >= 300) {
                        new StringBuilder(String.valueOf(str).length() + 65);
                    }
                    zzi.zza();
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th2) {
                zzi.zza();
                throw th2;
            }
        } catch (IOException e12) {
            e = e12;
            new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
            zzi.zza();
        } catch (IndexOutOfBoundsException e13) {
            new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(e13.getMessage()).length());
            zzi.zza();
        } catch (RuntimeException e14) {
            e = e14;
            new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(e.getMessage()).length());
            zzi.zza();
        }
    }
}
