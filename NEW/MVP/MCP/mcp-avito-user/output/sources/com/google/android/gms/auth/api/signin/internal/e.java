package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C36681z;
import com.google.android.gms.common.internal.C36729v;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class e implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final UX0.a f348782d = new UX0.a("RevokeAccessOperation", new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public final String f348783b;

    /* renamed from: c, reason: collision with root package name */
    public final C36681z f348784c;

    public e(String str) {
        C36729v.f(str);
        this.f348783b = str;
        this.f348784c = new C36681z(null);
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        UX0.a aVar = f348782d;
        Status status = Status.f348902h;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.f348783b).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f348900f;
            } else {
                aVar.b("Unable to revoke access!", new Object[0]);
            }
            aVar.a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e12) {
            aVar.b("IOException when revoking access: ".concat(String.valueOf(e12.toString())), new Object[0]);
        } catch (Exception e13) {
            aVar.b("Exception when revoking access: ".concat(String.valueOf(e13.toString())), new Object[0]);
        }
        this.f348784c.setResult(status);
    }
}
